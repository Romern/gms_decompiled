package p000;

/* renamed from: aztn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aztn implements bqfp {

    /* renamed from: a */
    final /* synthetic */ String f100015a;

    /* renamed from: b */
    final /* synthetic */ azto f100016b;

    public aztn(azto azto, String str) {
        this.f100016b = azto;
        this.f100015a = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        new Object[1][0] = this.f100015a;
        aztu aztu = this.f100016b.f100017c;
        bmxv a = azbj.m85193a(aztu.f100030b).mo54564d().mo56315a((bctr) obj);
        if (a.mo66813a()) {
            aztu.mo55291c(String.format("onMessageUpdated(%s)", a.mo66814b()));
            return;
        }
        azoj.m85933c("LTWebAppNotifier", "Failed to encode message to JSONObject", new Object[0]);
        azph.m85998a(aztu.f100030b).mo55126a(1557, 58);
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        azoj.m85933c("LTWebAppInterface", "Could not download photo message because of failure exception for %s", this.f100015a);
        azph.m85998a(this.f100016b.f99942a).mo55173d(1554, 59, this.f100015a);
    }
}
