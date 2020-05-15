package p000;

import android.accounts.Account;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import java.util.List;

/* renamed from: jlc */
final /* synthetic */ class jlc implements Runnable {

    /* renamed from: a */
    private final jle f22736a;

    public jlc(jle jle) {
        this.f22736a = jle;
    }

    public final void run() {
        jle jle = this.f22736a;
        rpr b = rpr.m34216b();
        List d = soz.m35801d(b, b.getPackageName());
        if (d == null || d.isEmpty()) {
            jle.f22738a.mo25416d("No valid accounts could be fetched.", new Object[0]);
            jle.f22744g = true;
            return;
        }
        SyncedCryptauthDevice a = jpv.m17085a(rpr.m34216b(), ((Account) d.get(0)).name);
        if (a == null) {
            jle.f22738a.mo25416d("No valid beacon seeds could be fetched.", new Object[0]);
            jle.f22744g = true;
            return;
        }
        jle.f22742e = a.mo7813a();
    }
}
