package com.google.autofill.detection.p098ml;

import java.util.OptionalDouble;

/* renamed from: com.google.autofill.detection.ml.NumericalSignal */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class NumericalSignal implements Signal {
    private static final int CURRENT_VERSION = 1;
    public static final bllu READER = new bllu() {
        /* class com.google.autofill.detection.p098ml.NumericalSignal.C16941 */

        public NumericalSignal readFromBundle(bllt bllt) {
            int c = bllt.mo66673c();
            if (c == 1) {
                return new NumericalSignal((NumericalDataProducer) bllt.mo66677g());
            }
            StringBuilder sb = new StringBuilder(45);
            sb.append("Unable to read bundle of version: ");
            sb.append(c);
            throw new bllj(sb.toString());
        }
    };
    final DoubleDataProducer numericalDataProducer;

    public NumericalSignal(DoubleDataProducer doubleDataProducer) {
        this.numericalDataProducer = doubleDataProducer;
    }

    public double generate(kom kom) {
        OptionalDouble produce = this.numericalDataProducer.produce(kom);
        if (produce.isPresent()) {
            return produce.getAsDouble();
        }
        return 0.0d;
    }

    public void reset() {
    }

    public String toString() {
        String valueOf = String.valueOf(this.numericalDataProducer);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
        sb.append("NumericalSignal [ doubleDataProducer = ");
        sb.append(valueOf);
        sb.append(" ]");
        return sb.toString();
    }

    public void writeToBundle(bllt bllt) {
        bllt.mo66667a(1);
        bllt.mo66668a(this.numericalDataProducer);
    }
}
