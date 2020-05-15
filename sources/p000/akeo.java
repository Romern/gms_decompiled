package p000;

import com.felicanetworks.mfc.C0126R;

/* renamed from: akeo */
final /* synthetic */ class akeo implements aubt {

    /* renamed from: a */
    private final akgy f71748a;

    /* renamed from: b */
    private final String f71749b;

    public akeo(akgy akgy, String str) {
        this.f71748a = akgy;
        this.f71749b = str;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        akgy akgy = this.f71748a;
        String str = this.f71749b;
        akgy.mo39376a(0, (int) C0126R.string.sharing_toast_wifi_connection_failed, str);
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
        bnsl.mo68437a(exc);
        bnsl.mo68432a("akgy", "a", 2884, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("WifiUtils#connectToWifi failed to connect to %s", str);
    }
}
