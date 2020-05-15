package p000;

/* renamed from: abjc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class abjc {
    /* renamed from: a */
    static abjc m47781a(String str) {
        return m47782a(str, bngx.m109377j());
    }

    /* renamed from: c */
    static abjc m47783c() {
        return new abip(true, bngx.m109376e());
    }

    /* renamed from: a */
    public abstract boolean mo32132a();

    /* renamed from: b */
    public abstract bngx mo32133b();

    /* renamed from: a */
    static abjc m47782a(String str, bngs bngs) {
        if (!stm.m36302d(str)) {
            bxvd da = bspx.f146596d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bspx bspx = (bspx) da.f164949b;
            str.getClass();
            int i = bspx.f146598a | 1;
            bspx.f146598a = i;
            bspx.f146599b = str;
            bspx.f146598a = i | 2;
            bspx.f146600c = false;
            bngs.mo67668c((bspx) da.mo74062i());
        }
        return new abip(false, bngs.mo67664a());
    }
}
