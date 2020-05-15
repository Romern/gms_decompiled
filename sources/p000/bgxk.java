package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.google.android.location.reporting.state.update.AccountConfig;

/* renamed from: bgxk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgxk {

    /* renamed from: e */
    private static bgxk f117917e;

    /* renamed from: a */
    public final Context f117918a;

    /* renamed from: b */
    public final bgye f117919b;

    /* renamed from: c */
    public final long f117920c = SystemClock.elapsedRealtime();

    /* renamed from: d */
    public final long f117921d;

    private bgxk(Context context, bgye bgye, long j) {
        this.f117918a = context;
        this.f117919b = bgye;
        this.f117921d = j;
    }

    /* renamed from: a */
    public static synchronized bgxk m100235a(Context context, bgye bgye) {
        bgxk bgxk;
        long j;
        Long l;
        synchronized (bgxk.class) {
            if (f117917e == null) {
                if (chbx.m148144b()) {
                    bgyh a = bgyh.m100364a(context);
                    if (a.f118032a.contains("reportingAutoenableManagerInitTimeMillisKey")) {
                        l = Long.valueOf(a.f118032a.getLong("reportingAutoenableManagerInitTimeMillisKey", 0));
                    } else {
                        l = null;
                    }
                    if (l == null) {
                        j = System.currentTimeMillis();
                        SharedPreferences.Editor edit = a.f118032a.edit();
                        edit.putLong("reportingAutoenableManagerInitTimeMillisKey", j);
                        edit.apply();
                    } else {
                        j = l.longValue();
                    }
                } else {
                    j = -1;
                }
                f117917e = new bgxk(context, bgye, j);
            }
            bgxk = f117917e;
        }
        return bgxk;
    }

    /* renamed from: b */
    public final boolean mo63322b(Account account) {
        return chcs.f188354a.mo6606a().mo85119v() && !chcs.m148243o() && this.f117919b.f117999a.f118059b.getBoolean(bgyj.m100391r(account), true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo63323c(Account account) {
        return this.f117919b.f117999a.f118059b.getBoolean(bgyj.m100393t(account), false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo63324d(Account account) {
        return this.f117919b.f117999a.f118059b.getBoolean(bgyj.m100394u(account), false);
    }

    /* renamed from: e */
    public final void mo63325e(Account account) {
        if (mo63322b(account)) {
            boolean z = false;
            if (mo63322b(account) && mo63323c(account) && mo63324d(account) && this.f117919b.mo63353a(account).mo70913h()) {
                z = true;
            }
            String a = aeqm.m52397a(account);
            boolean b = mo63322b(account);
            boolean c = mo63323c(account);
            boolean d = mo63324d(account);
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 100);
            sb.append("AutoEnableManager shouldSwitchOnReporting for ");
            sb.append(a);
            sb.append(": isEl=");
            sb.append(b);
            sb.append(" isNew=");
            sb.append(c);
            sb.append(" isHEnabled=");
            sb.append(d);
            sb.append(" result=");
            sb.append(z);
            sb.toString();
            if (z) {
                String valueOf = String.valueOf(aeqm.m52397a(account));
                bgur.m100011a("GCoreUlr", valueOf.length() == 0 ? new String("AutoEnableManager setReportingEnabled for ") : "AutoEnableManager setReportingEnabled for ".concat(valueOf));
                AccountConfig a2 = this.f117919b.mo63353a(account);
                if (a2.mo70906b() != 1) {
                    mo63321a(account);
                    if (chcy.m148486b()) {
                        bguv.m100043a("UlrAutoEnableEvents", 6);
                        return;
                    }
                    return;
                }
                bgyr a3 = bgys.m100417a(account, "com.google.android.gms+autoenabled");
                a3.mo63434a(a2.f150892c);
                a3.f118099g = true;
                a3.mo63436a(true);
                this.f117919b.mo63357a("ReportingAutoEnableManager.setReportingEnabled", a3.mo63432a(), "autoenable");
                if (chcy.m148486b()) {
                    bguv.m100043a("UlrAutoEnableEvents", 1);
                }
                mo63321a(account);
                if (chcy.m148486b()) {
                    bguv.m100043a("UlrAutoEnableEvents", 7);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo63321a(Account account) {
        String valueOf = String.valueOf(aeqm.m52397a(account));
        bgur.m100011a("GCoreUlr", valueOf.length() == 0 ? new String("AutoEnableManager setIneligible for ") : "AutoEnableManager setIneligible for ".concat(valueOf));
        bgyj bgyj = this.f117919b.f117999a;
        String r = bgyj.m100391r(account);
        SharedPreferences.Editor edit = bgyj.f118059b.edit();
        edit.putBoolean(r, false);
        edit.apply();
        bgye bgye = this.f117919b;
        bgye.mo63361b(account, false);
        bgye.mo63365c(account, false);
    }
}
