package p000;

/* renamed from: aibn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aibn {

    /* renamed from: a */
    public final String f68619a;

    public aibn(String str) {
        this.f68619a = str;
    }

    /* renamed from: a */
    public static int m56966a(byzm byzm) {
        if (byzm != null) {
            bzbk bzbk = bzbk.NEARBY_TYPE_UNKNOWN;
            int b = bzaw.m125599b(byzm.f169128b);
            if (b == 0) {
                b = 1;
            }
            int i = b - 1;
            if (i == 100) {
                return (int) cfod.f184793a.mo6606a().mo81895Q();
            }
            if (i == 200) {
                return (int) cfod.f184793a.mo6606a().mo81900V();
            }
            if (i == 300) {
                return (int) cfod.f184793a.mo6606a().mo81898T();
            }
            if (i == 400) {
                return (int) cfod.f184793a.mo6606a().mo81899U();
            }
            if (i == 500) {
                return (int) cfod.f184793a.mo6606a().mo81896R();
            }
            if (i == 600) {
                return (int) cfod.f184793a.mo6606a().mo81897S();
            }
        }
        return 100;
    }
}
