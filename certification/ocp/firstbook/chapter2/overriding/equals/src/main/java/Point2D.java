class Point2D {
	int x;
	int y;

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point2D other = (Point2D) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	// @Override
	// public boolean equals(Object other) {
	// if(other == null) {
	// return false;
	// }
	// if(other == this) {
	// return true;
	// }
	// if(other instanceof Point2D) {
	// Point2D point = (Point2D) other;
	// if(this.x == point.x && this.y == point.y) {
	// return true;
	// }
	// }
	// return false;
	// }
}
