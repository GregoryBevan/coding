class Point3D extends Point2D {
	int z;

	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + z;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point3D other = (Point3D) obj;
		if (z != other.z)
			return false;
		return true;
	}

//	@Override
//	public boolean equals(Object other) {
//		if (super.equals(other)) {
//			if (other instanceof Point3D) {
//				Point3D point = (Point3D) other;
//				if (this.z == point.z) {
//					return true;
//				}
//			}
//		}
//		return false;
//	}
}
