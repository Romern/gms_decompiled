package p000;

/* renamed from: ofk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ofk implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ofl f37506a;

    public ofk(ofl ofl) {
        this.f37506a = ofl;
    }

    public final void run() {
        bnsi d = ofl.f37507a.mo68390d();
        d.mo68432a("ofk", "run", 54, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("car did not send byebye response. will quit.");
        this.f37506a.f37514h.mo21328b(bpdn.CAR_NOT_RESPONDING, bpdo.BYEBYE_TIMEOUT, "byebye timeout");
    }
}
