package internals;

public enum Calc {
    ADDITION {
        @Override
        public double calcular(double a, double b) {
            return a + b;
        }
    },
    SUBTRACTION {
        @Override
        public double calcular(double a, double b) {
            return a - b;
        }
    },
    MULTIPLICATION {
        @Override
        public double calcular(double a, double b) {
            return a * b;
        }
    },
    DIVISION {
        @Override
        public double calcular(double a, double b) {
            if (b == 0) throw new IllegalArgumentException("Divisão por zero");
            return a / b;
        }
    };

    public abstract double calcular(double a, double b);
}

