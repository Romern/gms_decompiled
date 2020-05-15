package p000;

import android.accounts.Account;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import com.google.android.gms.common.apiservice.LifecycleSynchronizer;
import java.util.concurrent.Executors;

/* renamed from: gse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gse extends gjb implements aaai {

    /* renamed from: a */
    private static final sek f18937a = ght.m13171a("WorkAccountServiceImpl");

    /* renamed from: b */
    private final aaag f18938b;

    /* renamed from: c */
    private final Context f18939c;

    /* renamed from: d */
    private final gkr f18940d;

    /* renamed from: e */
    private final iws f18941e;

    /* renamed from: f */
    private final ily f18942f;

    /* renamed from: g */
    private final gpy f18943g;

    /* renamed from: h */
    private final adyd f18944h;

    /* renamed from: i */
    private final ilm f18945i;

    /* renamed from: j */
    private final Object f18946j = new Object();

    public gse(Context context, LifecycleSynchronizer lifecycleSynchronizer) {
        aaag a = aaag.m21014a(context, lifecycleSynchronizer, Executors.newSingleThreadExecutor());
        rpr b = rpr.m34216b();
        gkr gkr = (gkr) gkr.f18427a.mo13145b();
        ixl ixl = new ixl(rpr.m34216b());
        gpy gpy = (gpy) gpy.f18805a.mo13145b();
        adyd a2 = adyd.m51363a(rpr.m34216b());
        ilm ilm = (ilm) ilm.f21294d.mo13145b();
        this.f18938b = a;
        this.f18939c = b;
        bmxy.m108581a(gkr);
        this.f18940d = gkr;
        bmxy.m108581a(ixl);
        this.f18941e = ixl;
        this.f18942f = (ily) ily.f21320d.mo13145b();
        bmxy.m108581a(gpy);
        this.f18943g = gpy;
        bmxy.m108581a(a2);
        this.f18944h = a2;
        bmxy.m108581a(ilm);
        this.f18945i = ilm;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    private final void m13809b() {
        boolean z;
        int i;
        ComponentName componentName;
        SharedPreferences sharedPreferences = this.f18939c.getSharedPreferences("work_account_prefs", 0);
        int i2 = Build.VERSION.SDK_INT;
        if (!sharedPreferences.getBoolean("enabled_by_admin", ((DevicePolicyManager) this.f18939c.getSystemService("device_policy")).getDeviceOwner() == null ? m13810d().isManagedProfile() : true)) {
            int i3 = Build.VERSION.SDK_INT;
            Bundle applicationRestrictions = m13810d().getApplicationRestrictions(this.f18939c.getPackageName());
            if (applicationRestrictions == null) {
                z = false;
            } else if (!applicationRestrictions.getBoolean("enableWorkAccountAdmin", false)) {
                z = false;
            }
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            componentName = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.account.authenticator.WorkAccountAuthenticatorService");
            if (this.f18939c.getPackageManager().getComponentEnabledSetting(componentName) == i) {
                sek sek = f18937a;
                StringBuilder sb = new StringBuilder(46);
                sb.append("updating authenticator enabled state to: ");
                sb.append(z);
                sek.mo25414c(sb.toString(), new Object[0]);
                this.f18939c.getPackageManager().setComponentEnabledSetting(componentName, i, 1);
                return;
            }
            return;
        }
        z = true;
        if (z) {
        }
        componentName = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.account.authenticator.WorkAccountAuthenticatorService");
        if (this.f18939c.getPackageManager().getComponentEnabledSetting(componentName) == i) {
        }
    }

    /* renamed from: d */
    private final UserManager m13810d() {
        return (UserManager) this.f18939c.getSystemService("user");
    }

    /* renamed from: a */
    public final void mo11928a(giz giz, Account account) {
        if (!"com.google.work".equals(account.type)) {
            throw new SecurityException("This API can only remove work accounts");
        } else if (this.f18942f.mo13129a() != null || this.f18943g.mo12126a(account) == Binder.getCallingUid()) {
            this.f18938b.mo16658a(new gsb(this.f18944h, account, giz));
        } else {
            throw new SecurityException("Account is not owned by package");
        }
    }

    /* renamed from: c */
    public final void mo11934c() {
        synchronized (this.f18946j) {
            f18937a.mo25414c("init work authenticator", new Object[0]);
            m13809b();
        }
    }

    /* renamed from: a */
    public final void mo11929a(giz giz, String str) {
        this.f18938b.mo16658a(new gsa(giz, str, this.f18945i, this.f18941e, this.f18943g, Binder.getCallingUid()));
    }

    /* renamed from: a */
    public final void mo11930a(String str, grh grh) {
        boolean z;
        synchronized (this.f18946j) {
            try {
                z = this.f18940d.mo11996a(str);
            } catch (gkn e) {
                f18937a.mo25410a((Throwable) e);
                z = false;
            }
        }
        grh.mo12132a(0, z);
    }

    /* renamed from: a */
    public final void mo11931a(boolean z) {
        synchronized (this.f18946j) {
            if (this.f18939c.getSharedPreferences("work_account_prefs", 0).edit().putBoolean("enabled_by_admin", z).commit()) {
                f18937a.mo25414c("update authenticator enabled for admin", new Object[0]);
                m13809b();
                return;
            }
            f18937a.mo25416d("failed writing to SharedPreference", new Object[0]);
        }
    }

    /* renamed from: a */
    public final boolean mo11932a() {
        return this.f18940d.mo11995a();
    }

    /* renamed from: a */
    public final boolean mo11933a(String str, String str2) {
        return this.f18940d.mo11997a(str, str2);
    }
}
