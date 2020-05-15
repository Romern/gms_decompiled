package p000;

import android.os.Build;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: jft */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jft {

    /* renamed from: a */
    public static final jft[] f22387a;

    /* renamed from: d */
    private static final bngx f22388d = bngx.m109357a(new jfu(196608, 8), new jfu(AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE, 6));

    /* renamed from: e */
    private static final bngx f22389e = bngx.m109357a(new jfu(196608, 4), new jfu(AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE, 4));

    /* renamed from: f */
    private static final bngx f22390f = bngx.m109356a(new jfu(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE, 0));

    /* renamed from: g */
    private static final jft f22391g = new jft(327680, f22388d);

    /* renamed from: h */
    private static final jft f22392h = new jft(196608, f22389e);

    /* renamed from: i */
    private static final jft f22393i;

    /* renamed from: b */
    public final int f22394b;

    /* renamed from: c */
    public final bngx f22395c;

    static {
        int i = Build.VERSION.SDK_INT;
        jft jft = new jft(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE, f22390f);
        f22393i = jft;
        f22387a = new jft[]{f22391g, f22392h, jft};
    }

    private jft(int i, bngx bngx) {
        if (i == 65536 || i == 196608 || i == 327680) {
            this.f22394b = i;
            bnre i2 = bngx.listIterator();
            int i3 = 0;
            while (i2.hasNext()) {
                int i4 = ((jfu) i2.next()).f22396a;
                if (i4 >= i3) {
                    i3 = i4;
                } else {
                    throw new IllegalArgumentException("minRequirements must be sorted in ascending order of quality");
                }
            }
            this.f22395c = bngx;
            return;
        }
        StringBuilder sb = new StringBuilder(66);
        sb.append("Invalid complexity: ");
        sb.append(i);
        sb.append(". Must be HIGH, MEDIUM, LOW or NONE");
        throw new IllegalArgumentException(sb.toString());
    }
}
