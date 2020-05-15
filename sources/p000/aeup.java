package p000;

import android.accounts.Account;
import com.google.android.gms.locationsharing.ovenfresh.GcmReceiverChimeraService;

/* renamed from: aeup */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aeup {
    protected aeup() {
    }

    /* renamed from: a */
    public abstract Account mo34569a();

    /* renamed from: b */
    public abstract boolean mo34570b();

    /* renamed from: c */
    public abstract boolean mo34571c();

    /* renamed from: d */
    public abstract Long mo34572d();

    /* renamed from: e */
    public abstract String mo34573e();

    /* renamed from: f */
    public abstract boolean mo34575f();

    /* renamed from: g */
    public abstract String mo34576g();

    /* renamed from: h */
    public final void mo34582h() {
        bnsl bnsl = (bnsl) GcmReceiverChimeraService.f79670b.mo68390d();
        bnsl.mo68432a("aeup", "h", 241, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68427a("input values:%b %b %d %s %s", Boolean.valueOf(mo34570b()), Boolean.valueOf(mo34571c()), mo34572d(), mo34573e(), mo34569a().name);
    }
}
