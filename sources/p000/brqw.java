package p000;

/* renamed from: brqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brqw implements brpy {

    /* renamed from: a */
    private final String f143199a;

    /* renamed from: b */
    private final String f143200b;

    /* renamed from: c */
    private final String f143201c;

    public brqw(String str, String str2, String str3) {
        sdo.m34977c(str);
        this.f143199a = str;
        this.f143200b = str2;
        this.f143201c = str3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo69786a() {
        bxvd da = bkkp.f124596e.mo74144da();
        String str = this.f143199a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bkkp bkkp = (bkkp) da.f164949b;
        str.getClass();
        int i = bkkp.f124598a | 1;
        bkkp.f124598a = i;
        bkkp.f124599b = str;
        String str2 = this.f143200b;
        if (str2 != null) {
            str2.getClass();
            i |= 2;
            bkkp.f124598a = i;
            bkkp.f124600c = str2;
        }
        String str3 = this.f143201c;
        if (str3 != null) {
            str3.getClass();
            bkkp.f124598a = i | 16;
            bkkp.f124601d = str3;
        }
        return (bkkp) da.mo74062i();
    }
}
