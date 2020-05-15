package p000;

import android.content.Context;

/* renamed from: ailh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ailh {

    /* renamed from: a */
    public final airs f69114a = new airs();

    /* renamed from: b */
    public final aikz f69115b;

    /* renamed from: c */
    public final aioz f69116c;

    /* renamed from: d */
    public final ailr f69117d;

    /* renamed from: e */
    public final aijh f69118e;

    /* renamed from: f */
    public final aikx f69119f;

    /* renamed from: g */
    public final aiof f69120g;

    /* renamed from: h */
    public final aiox f69121h;

    /* renamed from: i */
    public final aimn f69122i;

    /* renamed from: j */
    public final aine f69123j;

    /* renamed from: k */
    public final aimk f69124k;

    /* renamed from: l */
    public final ailq f69125l;

    public ailh(Context context) {
        this.f69115b = new aikz(context, this.f69114a);
        this.f69116c = new aioz(context, this.f69114a);
        this.f69117d = new ailr(context);
        this.f69118e = new aijh(context, this.f69114a);
        this.f69119f = new aikx(context, this.f69114a);
        this.f69120g = new aiof(context, this.f69116c, this.f69114a);
        this.f69121h = new aiox(context, this.f69114a);
        this.f69122i = new aimn(context, this.f69114a);
        this.f69123j = new aine(context, this.f69114a);
        this.f69124k = new aimk(context);
        this.f69125l = new ailq(context);
    }

    /* renamed from: a */
    public final void mo37635a() {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("ailh", "a", 62, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Initiating shutdown of Bluetooth.");
        this.f69119f.mo37610a();
        this.f69118e.mo37575a();
        this.f69115b.mo37632b();
        bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
        bnsl2.mo68432a("ailh", "a", 66, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68405a("Bluetooth has shut down.");
        bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
        bnsl3.mo68432a("ailh", "a", 69, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl3.mo68405a("Initiating shutdown of WiFi.");
        aine aine = this.f69123j;
        ahhr.m55805a(aine.f69245c, "WifiDirect.singleThreadOffloader");
        aine.mo37712c();
        aine.mo37715f();
        aine.f69243a.mo38144a();
        this.f69122i.mo37687a();
        this.f69121h.mo37770a();
        aiof aiof = this.f69120g;
        aiof.mo37755j();
        synchronized (aiof) {
            ahhr.m55805a(aiof.f69331l, "WifiHotspot.singleThreadOffloader");
            aiof.mo37752g();
            aiof.mo37750e();
            aiof.mo37753h();
        }
        this.f69116c.mo37792d();
        bnsl bnsl4 = (bnsl) ailf.f69111a.mo68390d();
        bnsl4.mo68432a("ailh", "a", 75, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl4.mo68405a("WiFi has shut down.");
        bnsl bnsl5 = (bnsl) ailf.f69111a.mo68390d();
        bnsl5.mo68432a("ailh", "a", 78, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl5.mo68405a("Initiating shutdown of NFC.");
        this.f69125l.mo37647a();
        bnsl bnsl6 = (bnsl) ailf.f69111a.mo68390d();
        bnsl6.mo68432a("ailh", "a", 81, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl6.mo68405a("NFC has shut down.");
        bnsl bnsl7 = (bnsl) ailf.f69111a.mo68390d();
        bnsl7.mo68432a("ailh", "a", 84, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl7.mo68405a("Initiating shutdown of WebRTC.");
        this.f69124k.mo37678b();
        bnsl bnsl8 = (bnsl) ailf.f69111a.mo68390d();
        bnsl8.mo68432a("ailh", "a", 86, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl8.mo68405a("WebRTC has shut down.");
        airs airs = this.f69114a;
        if (airs.f69587f.compareAndSet(false, true)) {
            synchronized (airs) {
                for (airq airq : airs.f69584c.values()) {
                    airq.f69576b.mo36396b();
                }
                ahhr.m55805a(airs.f69586e, "MultiMediumDependencyManager.needsRetryExecutor");
                for (airo airo : airs.mo37909b()) {
                    bnsl bnsl9 = (bnsl) ailf.f69111a.mo68390d();
                    bnsl9.mo68432a("airs", "a", 160, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl9.mo68424a("%s MediumOperation %s is unexpectedly registered and will be unregistered.", "[MMD]:", airo.mo37902d());
                    airs.mo37910c(airo);
                }
            }
        }
    }
}
