package p000;

/* renamed from: akcn */
final /* synthetic */ class akcn implements Runnable {

    /* renamed from: a */
    private final akcv f71605a;

    public akcn(akcv akcv) {
        this.f71605a = akcv;
    }

    public final void run() {
        akcv akcv = this.f71605a;
        akcv.f71616a.getContentResolver().unregisterContentObserver(akcv.f71625j);
        ahhd.m55766a(akcv.f71616a, akcv.f71624i);
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68432a("akcv", "e", 411, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Stopped listening for contact book changed events.");
    }
}
