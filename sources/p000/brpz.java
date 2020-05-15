package p000;

/* renamed from: brpz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brpz implements brpy {

    /* renamed from: a */
    private final String f143148a;

    /* renamed from: b */
    private final String f143149b = "http://localhost";

    /* renamed from: c */
    private final String f143150c;

    public brpz(String str, String str2) {
        sdo.m34977c(str);
        this.f143148a = str;
        this.f143150c = str2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo69786a() {
        bxvd da = bkka.f124488e.mo74144da();
        String str = this.f143148a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bkka bkka = (bkka) da.f164949b;
        str.getClass();
        int i = bkka.f124490a | 1;
        bkka.f124490a = i;
        bkka.f124491b = str;
        String str2 = this.f143149b;
        str2.getClass();
        int i2 = i | 2;
        bkka.f124490a = i2;
        bkka.f124492c = str2;
        String str3 = this.f143150c;
        if (str3 != null) {
            str3.getClass();
            bkka.f124490a = i2 | 8192;
            bkka.f124493d = str3;
        }
        return (bkka) da.mo74062i();
    }
}
