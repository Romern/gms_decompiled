package p000;

import com.google.android.gms.googlehelp.common.HelpConfig;

/* renamed from: abcw */
final /* synthetic */ class abcw implements Runnable {

    /* renamed from: a */
    private final HelpConfig f57053a;

    /* renamed from: b */
    private final abcr f57054b;

    /* renamed from: c */
    private final bxvd f57055c;

    public abcw(HelpConfig helpConfig, bxvd bxvd, abcr abcr) {
        this.f57053a = helpConfig;
        this.f57055c = bxvd;
        this.f57054b = abcr;
    }

    public final void run() {
        HelpConfig helpConfig = this.f57053a;
        bxvd bxvd = this.f57055c;
        abcr abcr = this.f57054b;
        int i = abcx.f57057b;
        if (helpConfig.f78833h) {
            abcr.mo32041a((abeh) bxvd.mo74062i());
        }
    }
}
