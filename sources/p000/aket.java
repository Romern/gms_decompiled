package p000;

/* renamed from: aket */
final /* synthetic */ class aket implements Runnable {

    /* renamed from: a */
    private final akgy f71758a;

    public aket(akgy akgy) {
        this.f71758a = akgy;
    }

    public final void run() {
        akgy akgy = this.f71758a;
        akgy.mo39423o();
        akgy.f71940g.mo39281a();
        akcv akcv = akgy.f71947n.f71603b;
        akcv.mo39228a(new akcn(akcv));
        akcv.f71620e.shutdown();
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68432a("akcv", "a", 191, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("ContactBookUpdater has been shutdown.");
        ahhr.m55805a(akgy.f71946m.f71596d, "CertificateManagerExecutor");
        akgy.f71949p.mo39448a();
        ahhr.m55805a(akgy.f71950q.f71635a, "alarmExecutor");
        ahhr.m55805a(akgy.f71937d, "alarmExecutor");
    }
}
