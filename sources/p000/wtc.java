package p000;

import android.accounts.Account;
import com.google.android.chimera.Activity;

/* renamed from: wtc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wtc implements basc {

    /* renamed from: a */
    public Account f51276a;

    /* renamed from: b */
    public wtd f51277b;

    public wtc(Account account, wtd wtd) {
        this.f51276a = account;
        this.f51277b = wtd;
    }

    /* renamed from: a */
    public final void mo29375a() {
    }

    /* renamed from: b */
    public final void mo29377b() {
    }

    /* renamed from: c */
    public final void mo29378c() {
    }

    /* renamed from: a */
    public final void mo29376a(basd basd) {
        bnsl bnsl = (bnsl) wtw.f51331a.mo68390d();
        bnsl.mo68432a("wtc", "a", 359, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("FootprintsListener: onUpdate");
        wtd wtd = this.f51277b;
        if (wtd == null || !wtd.mo29380b().equals(this.f51276a)) {
            bnsl bnsl2 = (bnsl) wtw.f51331a.mo68390d();
            bnsl2.mo68432a("wtc", "a", 362, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("FootprintsListener: Do not update, null fragment or account not match");
        } else if (wtd.getActivity() != null) {
            bnsl bnsl3 = (bnsl) wtw.f51331a.mo68390d();
            bnsl3.mo68432a("wtc", "a", 366, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("FootprintsListener: Call updateAccountSelection");
            Activity activity = wtd.getActivity();
            wtd.getClass();
            activity.runOnUiThread(new wtb(wtd));
        }
    }
}
