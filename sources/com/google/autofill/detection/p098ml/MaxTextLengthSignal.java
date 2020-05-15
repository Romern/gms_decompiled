package com.google.autofill.detection.p098ml;

/* renamed from: com.google.autofill.detection.ml.MaxTextLengthSignal */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class MaxTextLengthSignal implements Signal {
    private static final int CURRENT_VERSION_CODE = 1;
    private static final String MAX_LENGTH_HTML_INPUT_ATTRIBUTE = "maxlength";
    public static final bllu READER = new bllu() {
        /* class com.google.autofill.detection.p098ml.MaxTextLengthSignal.C16891 */

        public MaxTextLengthSignal readFromBundle(bllt bllt) {
            int c = bllt.mo66673c();
            if (c == 1) {
                return new MaxTextLengthSignal();
            }
            StringBuilder sb = new StringBuilder(45);
            sb.append("Unable to read bundle of version: ");
            sb.append(c);
            throw new bllj(sb.toString());
        }
    };

    private static double getWebViewMaxTextLength(kom kom) {
        kol kol = kom.f24623v;
        if (kol != null) {
            koh koh = (koh) kol;
            if ("input".equals(koh.f24572a)) {
                bnre i = koh.f24573b.listIterator();
                while (i.hasNext()) {
                    kok kok = (kok) i.next();
                    if (bmwb.m108443a(MAX_LENGTH_HTML_INPUT_ATTRIBUTE, kok.mo14744a())) {
                        try {
                            return Double.parseDouble(kok.mo14745b());
                        } catch (NumberFormatException e) {
                        }
                    }
                }
            }
        }
        return 0.0d;
    }

    public double generate(kom kom) {
        double d = (double) kom.f24618q;
        return d <= 0.0d ? getWebViewMaxTextLength(kom) : d;
    }

    public void reset() {
    }

    public String toString() {
        return "MaxTextLengthSignal()";
    }

    public void writeToBundle(bllt bllt) {
        bllt.mo66667a(1);
    }
}
