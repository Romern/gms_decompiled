package p000;

/* renamed from: zrw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zrw {
    /* renamed from: a */
    public static cadn m46080a(caaa caaa, caae caae, caae caae2) {
        cadm cadm = (cadm) cadn.f172699j.mo74144da();
        cadm.mo74614a(caaa.f172312f);
        if ((caaa.f172307a & 2) != 0) {
            long j = caaa.f172309c;
            if (cadm.f164950c) {
                cadm.mo74035c();
                cadm.f164950c = false;
            }
            cadn cadn = (cadn) cadm.f164949b;
            cadn.f172701a |= 1;
            cadn.f172702b = j;
        }
        if ((caaa.f172307a & 1) != 0) {
            long j2 = caaa.f172308b;
            if (cadm.f164950c) {
                cadm.mo74035c();
                cadm.f164950c = false;
            }
            cadn cadn2 = (cadn) cadm.f164949b;
            cadn2.f172701a |= 2;
            cadn2.f172703c = j2;
        }
        if ((caaa.f172307a & 32) != 0) {
            long j3 = caaa.f172314h;
            if (cadm.f164950c) {
                cadm.mo74035c();
                cadm.f164950c = false;
            }
            cadn cadn3 = (cadn) cadm.f164949b;
            cadn3.f172701a |= 16;
            cadn3.f172707g = j3;
        }
        if ((caaa.f172307a & 16) != 0) {
            long j4 = caaa.f172313g;
            if (cadm.f164950c) {
                cadm.mo74035c();
                cadm.f164950c = false;
            }
            cadn cadn4 = (cadn) cadm.f164949b;
            cadn4.f172701a |= 32;
            cadn4.f172708h = j4;
        }
        if (caae != null) {
            if (cadm.f164950c) {
                cadm.mo74035c();
                cadm.f164950c = false;
            }
            cadn cadn5 = (cadn) cadm.f164949b;
            caae.getClass();
            cadn5.f172705e = caae;
            cadn5.f172701a |= 4;
        }
        if (caae2 != null) {
            if (cadm.f164950c) {
                cadm.mo74035c();
                cadm.f164950c = false;
            }
            cadn cadn6 = (cadn) cadm.f164949b;
            caae2.getClass();
            cadn6.f172706f = caae2;
            cadn6.f172701a |= 8;
        }
        return (cadn) cadm.mo74062i();
    }
}
