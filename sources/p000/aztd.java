package p000;

/* renamed from: aztd */
final /* synthetic */ class aztd implements bdaq {

    /* renamed from: a */
    private final azto f100001a;

    /* renamed from: b */
    private final String f100002b;

    public aztd(azto azto, String str) {
        this.f100001a = azto;
        this.f100002b = str;
    }

    /* renamed from: a */
    public final void mo54573a(Object obj) {
        azto azto = this.f100001a;
        String str = this.f100002b;
        aztu aztu = azto.f100017c;
        aztu.mo55291c(String.format("onConversationBlockUpdated(%s, %b)", str, (Boolean) obj));
        azph.m85998a(aztu.f100030b).mo55168b(1598, str);
    }
}
