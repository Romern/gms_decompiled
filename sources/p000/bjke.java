package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: bjke */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjke {
    /* renamed from: a */
    static int m103764a(bwwz bwwz, int i) {
        bwwy a = bwwy.m122385a(bwwz.f161311b);
        if (a == null) {
            a = bwwy.ALIGNMENT_UNKNOWN;
        }
        int i2 = i & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS;
        int i3 = 0;
        switch (a.ordinal()) {
            case 0:
            case 1:
                break;
            case 2:
                i2 = 48;
                break;
            case 3:
                i2 = 80;
                break;
            case 4:
                i2 = 16;
                break;
            case 5:
            case 6:
                throw new IllegalArgumentException("Baseline alignment not supported by gravity");
            case 7:
                throw new IllegalArgumentException("Stretch not yet supported");
            default:
                i2 = 0;
                break;
        }
        bwwy a2 = bwwy.m122385a(bwwz.f161312c);
        if (a2 == null) {
            a2 = bwwy.ALIGNMENT_UNKNOWN;
        }
        int i4 = i & 7;
        switch (a2.ordinal()) {
            case 0:
            case 1:
                i3 = i4;
                break;
            case 2:
                i3 = 8388611;
                break;
            case 3:
                i3 = 8388613;
                break;
            case 4:
                i3 = 1;
                break;
            case 5:
            case 6:
                throw new IllegalArgumentException("Baseline alignment not supported by gravity");
            case 7:
                throw new IllegalArgumentException("Stretch not yet supported");
        }
        return i2 | i3;
    }
}
