package p000;

/* renamed from: qan */
final /* synthetic */ class qan implements Runnable {

    /* renamed from: a */
    private final String f40809a;

    /* renamed from: b */
    private final String f40810b;

    /* renamed from: c */
    private final String f40811c;

    /* renamed from: d */
    private final String f40812d;

    /* renamed from: e */
    private final pjp f40813e;

    public qan(String str, String str2, String str3, String str4, pjp pjp) {
        this.f40809a = str;
        this.f40810b = str2;
        this.f40811c = str3;
        this.f40812d = str4;
        this.f40813e = pjp;
    }

    public final void run() {
        String str = this.f40809a;
        String str2 = this.f40810b;
        String str3 = this.f40811c;
        String str4 = this.f40812d;
        pjp pjp = this.f40813e;
        bxvd da = bltv.f127746f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bltv bltv = (bltv) da.f164949b;
        str.getClass();
        int i = bltv.f127748a | 4;
        bltv.f127748a = i;
        bltv.f127751d = str;
        str2.getClass();
        int i2 = i | 2;
        bltv.f127748a = i2;
        bltv.f127750c = str2;
        str3.getClass();
        int i3 = i2 | 1;
        bltv.f127748a = i3;
        bltv.f127749b = str3;
        str4.getClass();
        bltv.f127748a = i3 | 8;
        bltv.f127752e = str4;
        pjp.mo23276a((bltv) da.mo74062i(), null);
    }
}
