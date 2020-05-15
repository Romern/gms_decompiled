package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.cryptauth.DeviceFeatureStatus;
import com.google.android.gms.auth.cryptauth.DeviceFeatureStatusChange;
import com.google.android.gms.auth.proximity.FeatureEnabledStateReconcilerIntentOperation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: jlg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jlg {

    /* renamed from: a */
    public static final Logger f22747a = jsy.m17256a("FeatureEnabledController");

    /* renamed from: b */
    public final jtv f22748b;

    /* renamed from: c */
    public final jtv f22749c;

    /* renamed from: d */
    private final Context f22750d;

    /* renamed from: e */
    private final ios f22751e;

    /* renamed from: f */
    private final jku f22752f;

    public jlg(Context context, ios ios, jku jku) {
        this.f22748b = new jtv(context, "com.google.android.gms.auth.proximity.FeatureEnabled");
        this.f22749c = new jtv(context, "com.google.android.gms.auth.proximity.FeaturePendingDisable");
        this.f22750d = context;
        this.f22751e = ios;
        this.f22752f = jku;
    }

    /* renamed from: a */
    public final void mo13849a(Account account, List list) {
        bngx a = bngx.m109368a((Collection) this.f22748b.mo14089a(account));
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            bsni bsni = (bsni) list.get(i);
            if (!a.contains(bsni)) {
                if (this.f22749c.mo14090a(account, bsni)) {
                    this.f22749c.mo14093c(account, bsni);
                } else {
                    mo13853b(account, bsni, false);
                }
            } else if (ccig.m129802b() && this.f22749c.mo14090a(account, bsni)) {
                z = true;
            }
        }
        if (z) {
            Context context = this.f22750d;
            context.startService(FeatureEnabledStateReconcilerIntentOperation.m6760a(context, account));
        }
    }

    /* renamed from: b */
    public final void mo13853b(Account account, bsni bsni, boolean z) {
        Intent intent = new Intent("com.google.android.gms.auth.proximity.ACTION_FEATURE_ENABLED_CHANGE");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("EXTRA_ACCOUNT_NAME", account.name);
        intent.putExtra("EXTRA_FEATURE_NAME", bsni.name());
        intent.putExtra("EXTRA_ENABLED", z);
        this.f22750d.sendBroadcast(intent);
        Intent intent2 = new Intent("com.google.android.gms.auth.proximity.DEVICE_SYNC_FINISHED").setPackage("com.google.android.gms");
        intent2.putExtra("account_id", account.name);
        this.f22750d.sendBroadcast(intent2);
    }

    /* renamed from: a */
    public final boolean mo13850a(Account account) {
        List a = this.f22749c.mo14089a(account);
        if (a.isEmpty()) {
            f22747a.mo25414c("No pending feature states to disable", new Object[0]);
            return false;
        }
        f22747a.mo25414c("Reconciling local feature states with feature states from Cryptauth by disabling pending features %s", a);
        jta a2 = jsz.m17257a();
        if (cchu.m129750f()) {
            ArrayList arrayList = new ArrayList();
            int size = a.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(new DeviceFeatureStatusChange(new DeviceFeatureStatus(((bsni) a.get(i)).name(), false), false));
            }
            try {
                aucu.m76783a(this.f22751e.mo13183a("DeviceSync:BetterTogether", account, arrayList), cchu.m129751g(), TimeUnit.SECONDS);
                a2.mo14058n(5);
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                if (e instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                    a2.mo14058n(7);
                } else if (e instanceof ExecutionException) {
                    a2.mo14058n(6);
                } else {
                    a2.mo14058n(8);
                }
                f22747a.mo25417e("Failed to reconcile v2 feature statuses", e, new Object[0]);
            }
        }
        if (!cchu.m129747c()) {
            int size2 = a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                bsni bsni = (bsni) a.get(i2);
                try {
                    joc.m17012a(this.f22750d).mo13933a(account.name, bsni, false, job.m17011b(bsni.name()));
                } catch (VolleyError | gid e2) {
                    if (e2 instanceof gid) {
                        a2.mo14058n(2);
                    } else {
                        a2.mo14058n(3);
                    }
                }
                a2.mo14058n(0);
            }
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo13851a(Account account, bsni bsni) {
        return this.f22748b.mo14090a(account, bsni) && !this.f22749c.mo14090a(account, bsni);
    }

    /* renamed from: a */
    public final boolean mo13852a(Account account, bsni bsni, boolean z) {
        jta a = jsz.m17257a();
        if (!soz.m35791a(this.f22750d, account)) {
            a.mo14057m(1);
            return false;
        }
        boolean a2 = this.f22748b.mo14090a(account, bsni);
        boolean a3 = this.f22749c.mo14090a(account, bsni);
        Logger Logger = f22747a;
        Object[] objArr = new Object[4];
        objArr[0] = bsni.name();
        String str = "disabled";
        objArr[1] = !z ? str : "enabled";
        if (a2) {
            str = "enabled";
        }
        objArr[2] = str;
        objArr[3] = Boolean.valueOf(a3);
        Logger.mo25414c("Marking feature %s as %s. Local feature state: %s. Was pending disable: %s", objArr);
        if (a2 != z || a3) {
            if (!z && !a3) {
                this.f22749c.mo14092b(account, bsni);
                mo13853b(account, bsni, false);
            } else if (z && a3) {
                this.f22749c.mo14093c(account, bsni);
                mo13853b(account, bsni, true);
            }
            boolean b = job.m17011b(bsni.name());
            if (!cchu.m129747c()) {
                try {
                    joc.m17012a(this.f22750d).mo13933a(account.name, bsni, z, b);
                } catch (VolleyError | gid e) {
                    if (e instanceof gid) {
                        a.mo14057m(2);
                    } else {
                        a.mo14057m(3);
                    }
                    return false;
                }
            }
            if (cchu.m129750f()) {
                f22747a.mo25414c("Making v2 BatchSetFeatureStatusesRequest. Feature: %s Enabled: %s isExclusive: %s", bsni.name(), Boolean.valueOf(z), Boolean.valueOf(b));
                ios ios = this.f22751e;
                DeviceFeatureStatusChange[] deviceFeatureStatusChangeArr = new DeviceFeatureStatusChange[1];
                deviceFeatureStatusChangeArr[0] = new DeviceFeatureStatusChange(new DeviceFeatureStatus(bsni.name(), z), !z ? false : b);
                try {
                    aucu.m76783a(ios.mo13183a("DeviceSync:BetterTogether", account, bnkn.m109665a(deviceFeatureStatusChangeArr)), cchu.m129751g(), TimeUnit.SECONDS);
                    a.mo14057m(5);
                    try {
                        this.f22752f.mo13836a(this.f22750d, account);
                    } catch (jkt e2) {
                        f22747a.mo25417e("Failed to do a v2 sync after setting feature statuses", e2, new Object[0]);
                    }
                    return true;
                } catch (InterruptedException | ExecutionException | TimeoutException e3) {
                    if (e3 instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                        a.mo14057m(7);
                    } else if (e3 instanceof ExecutionException) {
                        a.mo14057m(6);
                    } else {
                        a.mo14057m(8);
                    }
                    f22747a.mo25417e("Failed to set v2 feature statuses", e3, new Object[0]);
                    return false;
                }
            } else {
                a.mo14057m(0);
                return true;
            }
        } else {
            a.mo14057m(4);
            return false;
        }
    }
}
