package p000;

import android.accounts.Account;

/* renamed from: akcp */
final /* synthetic */ class akcp implements Runnable {

    /* renamed from: a */
    private final akcv f71607a;

    /* renamed from: b */
    private final boolean f71608b;

    public akcp(akcv akcv, boolean z) {
        this.f71607a = akcv;
        this.f71608b = z;
    }

    public final void run() {
        akcv akcv = this.f71607a;
        boolean z = this.f71608b;
        if (cfov.f185185a.mo6606a().mo82266B() && !z && akcv.f71619d.mo20505a() - akcv.mo39236f().getLong("last_sync", 0) < cfov.f185185a.mo6606a().mo82267C()) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akcv", "b", 235, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Ignoring sync request for contact book because we've recently synced.");
            return;
        }
        Account b = akcv.f71617b.mo39171b();
        if (b == null) {
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl2.mo68432a("akcv", "b", 243, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Failed to sync contact book: account not set.");
            akcv.f71623h = false;
            return;
        }
        akha a = akcv.f71618c.mo39432a(b);
        bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68390d();
        bnsl3.mo68432a("akcv", "b", 249, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl3.mo68420a("Contact book update: %s.", a);
        akha akha = akha.NO_CONTACTS_CHANGED;
        int ordinal = a.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                akcv.f71623h = akcv.mo39234d();
            } else if (ordinal == 2 || ordinal == 3) {
                akcv.mo39231b();
                akcv.f71623h = akcv.mo39234d();
            }
        } else if (!akcv.f71623h) {
            akcv.f71623h = akcv.mo39234d();
        }
        if (akcv.f71623h) {
            akcv.mo39236f().edit().putLong("last_sync", akcv.f71619d.mo20505a()).apply();
        }
    }
}
