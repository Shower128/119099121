class Vector {
    private final double x;
    private final double y;
    private final double z;

    Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String toString() {
        return "Vector with (x, y, z) coordinates (" + this.x + ", " + this.y + ", " + this.z + ")";
    }
}

class Plane {
    private final Vector vectorA;
    private final Vector vectorB;

    Plane(Vector vectorA, Vector vectorB) {
        this.vectorA = vectorA;
        this.vectorB = vectorB;
    }

    public String toString() {
        return "Plane formed by " + this.vectorA + " and " + this.vectorB;
    }

    public boolean isOnPlane(Vector vectorC) {
        if (rref(this.vectorA, this.vectorB, vectorC).equals("consistent")) {
            return true;
        } else {
            return false;
        }
    }
    
    public Vector generateRandomVector() {
        int randMultiplierA = -10 + (int) Math.random() * ((10 - (-10)) + 1);
        int randMultiplierB = -10 + (int) Math.random() * ((10 - (-10)) + 1);
        return new Vector(this.vectorA.x * randMultiplierA + this.vectorB.x * randMultiplierB, this.vectorA.y * randMultiplierA + this.vectorB.y * randMultiplierB, this.vectorA.z * randMultiplierA + this.vectorB.z * randMultiplierB);
    }

    private String rref(Vector vectorA, Vector vectorB, Vector vectorC) {
        // don't know how to implement this...

        return "consistent";
    }
}
