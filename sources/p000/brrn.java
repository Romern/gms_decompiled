package p000;

/* renamed from: brrn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brrn implements brpy {

    /* renamed from: a */
    private final String f143252a;

    /* renamed from: b */
    private final String f143253b;

    /* renamed from: c */
    private final String f143254c;

    public brrn(String str, String str2, String str3) {
        sdo.m34977c(str);
        this.f143252a = str;
        sdo.m34977c(str2);
        this.f143253b = str2;
        this.f143254c = str3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo69786a() {
        bxvd da = bklf.f124736f.mo74144da();
        String str = this.f143252a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bklf bklf = (bklf) da.f164949b;
        str.getClass();
        int i = bklf.f124738a | 1;
        bklf.f124738a = i;
        bklf.f124739b = str;
        String str2 = this.f143253b;
        str2.getClass();
        int i2 = i | 2;
        bklf.f124738a = i2;
        bklf.f124740c = str2;
        int i3 = i2 | 512;
        bklf.f124738a = i3;
        bklf.f124741d = true;
        String str3 = this.f143254c;
        if (str3 != null) {
            str3.getClass();
            bklf.f124738a = i3 | 1024;
            bklf.f124742e = str3;
        }
        return (bklf) da.mo74062i();
    }
}
