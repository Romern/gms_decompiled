package p000;

/* renamed from: brrc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brrc implements brpy {

    /* renamed from: a */
    private String f143217a;

    /* renamed from: b */
    private String f143218b;

    /* renamed from: c */
    private final String f143219c;

    public brrc(String str) {
        this.f143219c = str;
    }

    public brrc(String str, String str2, String str3) {
        sdo.m34977c(str);
        this.f143217a = str;
        sdo.m34977c(str2);
        this.f143218b = str2;
        this.f143219c = str3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo69786a() {
        bxvd da = bkkv.f124647e.mo74144da();
        String str = this.f143217a;
        if (str != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bkkv bkkv = (bkkv) da.f164949b;
            str.getClass();
            bkkv.f124649a |= 1;
            bkkv.f124650b = str;
        }
        String str2 = this.f143218b;
        if (str2 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bkkv bkkv2 = (bkkv) da.f164949b;
            str2.getClass();
            bkkv2.f124649a |= 2;
            bkkv2.f124651c = str2;
        }
        String str3 = this.f143219c;
        if (str3 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bkkv bkkv3 = (bkkv) da.f164949b;
            str3.getClass();
            bkkv3.f124649a |= 1024;
            bkkv3.f124652d = str3;
        }
        return (bkkv) da.mo74062i();
    }
}
