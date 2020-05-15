package p000;

/* renamed from: baqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
enum baqx {
    NO_RESULT,
    PENDING_FIRST_GOOD,
    BAD_RESULT,
    GOOD_RESULT;

    /* renamed from: a */
    public final void mo55891a(baqy baqy) {
        boolean z;
        int ordinal = ordinal();
        boolean z2 = false;
        if (ordinal == 0) {
            int i = baqy.f101576h;
            if (baqy.f101581d == null) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108601b(z, "bestResult should be null");
            if (baqy.f101582e == 0) {
                z2 = true;
            }
            bmxy.m108601b(z2, "no pending futures");
        } else if (ordinal == 1) {
            int i2 = baqy.f101576h;
            bmxy.m108601b(baqy.f101581d instanceof bqgy, "bestResult should be null");
            bmxy.m108601b(!baqy.f101581d.isDone(), "bestResult should be pending");
            if (baqy.f101582e > 0) {
                z2 = true;
            }
            bmxy.m108601b(z2, "there should be a pending future.");
        } else if (ordinal == 2) {
            int i3 = baqy.f101576h;
            bmxy.m108601b(baqy.f101581d.isDone(), "bestResult should be done");
            if (baqy.f101582e == 0) {
                z2 = true;
            }
            bmxy.m108601b(z2, "no pending futures");
        } else if (ordinal == 3) {
            int i4 = baqy.f101576h;
            bmxy.m108601b(baqy.f101581d.isDone(), "bestResult should be done");
        } else {
            throw null;
        }
    }
}
