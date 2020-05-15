package p000;

import org.json.JSONObject;

/* renamed from: azsb */
final /* synthetic */ class azsb implements bdaq {

    /* renamed from: a */
    private final aztu f99967a;

    public azsb(aztu aztu) {
        this.f99967a = aztu;
    }

    /* renamed from: a */
    public final void mo54573a(Object obj) {
        aztu aztu = this.f99967a;
        bmxv n = ((bcsj) obj).mo57449n();
        if (n.mo66813a()) {
            aztu.mo55291c(String.format("onContactUpdated(%s)", ((JSONObject) n.mo66814b()).toString()));
            azph.m85998a(aztu.f100030b).mo55125a(1519);
            return;
        }
        azoj.m85933c("LTWebAppNotifier", "Failed to convert conversation to JSONObject", new Object[0]);
        azph.m85998a(aztu.f100030b).mo55126a(1520, 58);
    }
}
