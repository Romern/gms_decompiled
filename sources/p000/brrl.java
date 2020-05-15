package p000;

/* renamed from: brrl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brrl implements brpy {

    /* renamed from: a */
    private final String f143250a;

    /* renamed from: b */
    private final String f143251b;

    public brrl(String str, String str2) {
        sdo.m34977c(str);
        this.f143250a = str;
        this.f143251b = str2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo69786a() {
        bxvd da = bkld.f124721e.mo74144da();
        String str = this.f143250a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bkld bkld = (bkld) da.f164949b;
        str.getClass();
        int i = bkld.f124723a | 1;
        bkld.f124723a = i;
        bkld.f124724b = str;
        int i2 = i | 4;
        bkld.f124723a = i2;
        bkld.f124725c = true;
        String str2 = this.f143251b;
        if (str2 != null) {
            str2.getClass();
            bkld.f124723a = i2 | 16;
            bkld.f124726d = str2;
        }
        return (bkld) da.mo74062i();
    }
}
