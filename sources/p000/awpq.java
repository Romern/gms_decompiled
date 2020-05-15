package p000;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import java.util.concurrent.ExecutorService;

/* renamed from: awpq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awpq extends bjfy {

    /* renamed from: g */
    private static final ExecutorService f94816g = snp.m35702a(9);

    /* renamed from: h */
    private awpn f94817h;

    public final void onCreate(Bundle bundle) {
        awpn awpn = new awpn(getContext().getApplicationContext());
        this.f94817h = awpn;
        synchronized (awpn) {
            if (!awpn.f94808a) {
                skh.m35531a().mo25691a(awpn.f94811d, "actionsPaymentsServiceCon", new Intent("com.google.android.gms.wallet.bender3.framework.actions.IActionExecutorService").setClassName("com.google.android.gms", "com.google.android.gms.wallet.service.PaymentService"), awpn.f94812e, 1);
                awpn.f94808a = true;
            }
        }
        super.onCreate(bundle);
    }

    public final void onDestroy() {
        super.onDestroy();
        awpn awpn = this.f94817h;
        synchronized (awpn) {
            if (awpn.f94808a) {
                skh.m35531a().mo25693b(awpn.f94811d, awpn.f94812e);
                awpn.f94808a = false;
            }
        }
    }

    /* renamed from: a */
    public static void m80645a(dnx dnx) {
        bjfa a = bjfa.m103278a((Activity) dnx);
        if (a == null) {
            try {
                bjfa bjfa = (bjfa) awpq.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                bjfa.f122602a.put(dnx, bjfa);
                dnx.getSupportFragmentManager().beginTransaction().add(bjfa, "ActionExecutorFragment").commit();
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        } else if (!awpq.class.equals(a.getClass())) {
            throw new IllegalStateException("Trying to install multiple distinct subclasses of ActionExecutorFragment!");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bjex mo52453a(Context context) {
        return new awpr(context, this.f94817h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52454a(AsyncTask asyncTask) {
        asyncTask.executeOnExecutor(f94816g, new Object[0]);
    }
}
