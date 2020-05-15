package p000;

import android.accounts.Account;
import android.content.Context;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: afcc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afcc implements Runnable {

    /* renamed from: a */
    private final Context f64167a = rpr.m34216b();

    /* renamed from: b */
    private final afcb f64168b;

    public afcc(afcb afcb) {
        this.f64168b = afcb;
    }

    /* renamed from: a */
    private final void m52832a(String str) {
        jpc a = jpy.m17097a(this.f64167a);
        Context context = this.f64167a;
        List d = soz.m35801d(context, context.getPackageName());
        if (d == null || d.isEmpty()) {
            this.f64168b.mo34705a(str);
            return;
        }
        try {
            this.f64168b.mo34705a(((SyncedCryptauthDevice) aucu.m76783a(a.mo13966a((Account) d.get(0)), cfcd.f183609a.mo6606a().mo80823a(), TimeUnit.SECONDS)).f11188c);
        } catch (ExecutionException | TimeoutException e) {
            this.f64168b.mo34705a(str);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            this.f64168b.mo34705a(str);
        }
    }

    public final void run() {
        m52832a(this.f64167a.getString(C0126R.string.magictether_default_device_name));
    }
}
