package p000;

/* renamed from: dvc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dvc {

    /* renamed from: a */
    private static final bxig[] f14158a = {bxig.UNKNOWN, bxig.NULL_PLACE_INFERENCE, bxig.PLACES_DID_CHANGE, bxig.NO_PLACE_RESULT_WITHIN_TIMEOUT_PERIOD};

    /* renamed from: b */
    private static final bxig[] f14159b = {bxig.UNKNOWN, bxig.SCREEN_IS_OFF, bxig.EMPTY_PLACE_INFERENCE_WITHIN_TIMEOUT_PERIOD, bxig.SAME_PLACE_ON_CONSECUTIVE_SCREEN_ONS};

    /* renamed from: a */
    public static bxie m9493a() {
        bxvd da = bxie.f163506e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxie bxie = (bxie) da.f164949b;
        bxie.f163509b = 2;
        bxie.f163508a |= 1;
        return (bxie) da.mo74062i();
    }

    /* renamed from: b */
    public static bxie m9496b() {
        bxvd da = bxie.f163506e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxie bxie = (bxie) da.f164949b;
        bxie.f163509b = 3;
        bxie.f163508a |= 1;
        return (bxie) da.mo74062i();
    }

    /* renamed from: a */
    public static bxie m9494a(long j, double d) {
        bxvd da = bxie.f163506e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxie bxie = (bxie) da.f164949b;
        bxie.f163509b = 1;
        int i = 1 | bxie.f163508a;
        bxie.f163508a = i;
        int i2 = i | 2;
        bxie.f163508a = i2;
        bxie.f163510c = j;
        bxie.f163508a = i2 | 4;
        bxie.f163511d = d;
        return (bxie) da.mo74062i();
    }

    /* renamed from: a */
    public static bxih m9495a(int i, bxig bxig) {
        if (i != 3) {
            if (!sqc.m35963b(f14159b, bxig)) {
                return null;
            }
        } else if (!sqc.m35963b(f14158a, bxig)) {
            return null;
        }
        bxvd da = bxih.f163522c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxih bxih = (bxih) da.f164949b;
        bxih.f163525b = bxig.f163521h;
        bxih.f163524a |= 1;
        return (bxih) da.mo74062i();
    }
}
