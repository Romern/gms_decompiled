package com.google.autofill.detection.p098ml;

/* renamed from: com.google.autofill.detection.ml.InputNormalizationSignalDecorator */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class InputNormalizationSignalDecorator implements Signal {
    private static final int CURRENT_VERSION_CODE = 1;
    public static final bllu READER = new bllu() {
        /* class com.google.autofill.detection.p098ml.InputNormalizationSignalDecorator.C16871 */

        public InputNormalizationSignalDecorator readFromBundle(bllt bllt) {
            int c = bllt.mo66673c();
            if (c == 1) {
                return new InputNormalizationSignalDecorator((Signal) bllt.mo66677g(), bllt.mo66674d(), bllt.mo66674d());
            }
            StringBuilder sb = new StringBuilder(45);
            sb.append("Unable to read bundle of version: ");
            sb.append(c);
            throw new bllj(sb.toString());
        }
    };
    final Signal delegate;
    final float mean;
    final float stdDeviation;

    public InputNormalizationSignalDecorator(Signal signal, float f, float f2) {
        bmxy.m108589a(f2 >= 0.0f, "std deviation should always be positive");
        this.delegate = signal;
        this.mean = f;
        this.stdDeviation = f2;
    }

    public double generate(kom kom) {
        double generate = this.delegate.generate(kom);
        double d = (double) this.mean;
        Double.isNaN(d);
        double d2 = generate - d;
        double d3 = (double) this.stdDeviation;
        Double.isNaN(d3);
        return d2 / d3;
    }

    public void reset() {
        this.delegate.reset();
    }

    public String toString() {
        String valueOf = String.valueOf(this.delegate);
        float f = this.mean;
        float f2 = this.stdDeviation;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 96);
        sb.append("InputNormalizationSignalDecorator(delegate=");
        sb.append(valueOf);
        sb.append(", mean=");
        sb.append(f);
        sb.append(", stdDeviation=");
        sb.append(f2);
        sb.append(")");
        return sb.toString();
    }

    public void writeToBundle(bllt bllt) {
        bllt.mo66667a(1);
        bllt.mo66668a(this.delegate);
        bllt.mo66666a(this.mean);
        bllt.mo66666a(this.stdDeviation);
    }
}
