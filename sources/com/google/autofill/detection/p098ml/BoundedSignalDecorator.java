package com.google.autofill.detection.p098ml;

/* renamed from: com.google.autofill.detection.ml.BoundedSignalDecorator */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class BoundedSignalDecorator implements Signal {
    private static final int CURRENT_VERSION_CODE = 1;
    public static final bllu READER = new bllu() {
        /* class com.google.autofill.detection.p098ml.BoundedSignalDecorator.C16861 */

        private BoundedSignalDecorator readFromBundleV1(bllt bllt) {
            return new BoundedSignalDecorator((Signal) bllt.mo66677g(), bllt.mo66675e(), bllt.mo66675e());
        }

        public BoundedSignalDecorator readFromBundle(bllt bllt) {
            int c = bllt.mo66673c();
            if (c == 1) {
                return readFromBundleV1(bllt);
            }
            StringBuilder sb = new StringBuilder(45);
            sb.append("Unable to read bundle of version: ");
            sb.append(c);
            throw new bllj(sb.toString());
        }
    };
    final Signal delegateSignal;
    final double lowerBound;
    final double upperBound;

    public BoundedSignalDecorator(Signal signal, double d, double d2) {
        boolean z;
        this.delegateSignal = signal;
        if (d < d2) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108589a(z, "lower bound is expected to be less than upper bound");
        this.lowerBound = d;
        this.upperBound = d2;
    }

    public double generate(kom kom) {
        return bqci.m112565a(this.delegateSignal.generate(kom), this.lowerBound, this.upperBound);
    }

    public void reset() {
        this.delegateSignal.reset();
    }

    public String toString() {
        String valueOf = String.valueOf(this.delegateSignal);
        double d = this.lowerBound;
        double d2 = this.upperBound;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 110);
        sb.append("BoundedSignalDecorator(delegate: ");
        sb.append(valueOf);
        sb.append(", lowerBound: ");
        sb.append(d);
        sb.append(", upperBound: ");
        sb.append(d2);
        sb.append(")");
        return sb.toString();
    }

    public void writeToBundle(bllt bllt) {
        bllt.mo66667a(1);
        bllt.mo66668a(this.delegateSignal);
        bllt.mo66665a(this.lowerBound);
        bllt.mo66665a(this.upperBound);
    }
}
