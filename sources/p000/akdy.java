package p000;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: akdy */
final /* synthetic */ class akdy implements Runnable {

    /* renamed from: a */
    private final akgy f71701a;

    /* renamed from: b */
    private final String f71702b;

    /* renamed from: c */
    private final int f71703c;

    public akdy(akgy akgy, String str, int i) {
        this.f71701a = akgy;
        this.f71702b = str;
        this.f71703c = i;
    }

    public final void run() {
        akgy akgy = this.f71701a;
        String str = this.f71702b;
        int i = this.f71703c;
        if (!akgy.mo39412i()) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akgy", "b", 1096, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Ignoring distance changed for endpoint %s because we're no longer scanning", str);
            return;
        }
        ShareTarget c = akgy.mo39400c(str);
        if (c != null) {
            akgy.f71941h.mo38708a(c, i);
        }
    }
}
