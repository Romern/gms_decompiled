package p000;

import java.util.Random;

/* renamed from: bmyi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bmyi extends Random {
    private static final long serialVersionUID = 898001275432099254L;

    /* renamed from: a */
    private final boolean f131199a = true;

    public final void setSeed(long j) {
        if (!this.f131199a) {
            super.setSeed(j);
            return;
        }
        throw new UnsupportedOperationException("Setting the seed on the shared Random object is not permitted");
    }
}
