package p000;

/* renamed from: azpv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azpv extends soa {

    /* renamed from: a */
    final /* synthetic */ String f99856a;

    /* renamed from: b */
    final /* synthetic */ azpw f99857b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public azpv(azpw azpw, String str) {
        super(9);
        this.f99857b = azpw;
        this.f99856a = str;
    }

    public final void run() {
        azpw azpw = this.f99857b;
        int i = azpw.f99858b;
        if (azcd.m85252a(azpw.f99860a).mo54608b(this.f99856a) == -1) {
            azoj.m85933c("LTNotifUtils", "Failed to get AppData for %s", this.f99856a);
            azph.m85998a(this.f99857b.f99860a).mo55126a(1437, 42);
        }
    }
}
