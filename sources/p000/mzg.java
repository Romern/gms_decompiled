package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* renamed from: mzg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mzg extends luf {

    /* renamed from: a */
    private final Context f35039a;

    /* renamed from: b */
    private final lva f35040b;

    public mzg(Context context) {
        this.f35039a = context;
        this.f35040b = new mzf(context);
    }

    /* renamed from: a */
    public final Account mo19604a() {
        try {
            return this.f35040b.mo19624a();
        } catch (Exception e) {
            mab.m24748a(this.f35039a, e, cckt.m130241d());
            throw e;
        }
    }

    /* renamed from: c */
    public final boolean mo19606c() {
        return this.f35040b.mo19625b();
    }

    /* renamed from: a */
    public final void mo19605a(Account account) {
        lva lva = this.f35040b;
        if (account == null) {
            mzf.f35034a.mo25416d("Cannot set null backup account.", new Object[0]);
            return;
        }
        mzf mzf = (mzf) lva;
        if (account.equals(mzf.mo19624a())) {
            mzf.f35034a.mo25409a("Backup account not changed.", new Object[0]);
        } else if (mzf.mo20347a(account)) {
            lvn lvn = mzf.f35034a;
            String valueOf = String.valueOf(account);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Setting backup account: ");
            sb.append(valueOf);
            lvn.mo25409a(sb.toString(), new Object[0]);
            if (mzf.f35035b.getSharedPreferences("BackupAccount", 0).edit().putString("accountName", account.name).putString("accountType", account.type).putBoolean("accountInitialized", false).commit()) {
                Context context = mzf.f35035b;
                context.startService(mcc.m24854b(context));
                mzf.f35035b.sendBroadcast(new Intent("com.google.android.gms.backup.BackupAccountChanged").setPackage("com.google.android.gms"));
                if (cclp.f179364a.mo6606a().mo76299b()) {
                    int i = Build.VERSION.SDK_INT;
                    if (mzf.f35037d.mo19690b()) {
                        lwc a = lwc.m24524a(mzf.f35035b);
                        bmxv bmxv = mzf.f35036c;
                        lwj a2 = mca.m24847a(mzf.f35035b, a);
                        try {
                            Context context2 = ((mzf) lva).f35035b;
                            new lxd(context2, a, lwr.m24571a(context2), a2, new mbx(((mzf) lva).f35035b)).mo19720a();
                        } catch (lwt | lxc e) {
                            mzf.f35034a.mo25417e("Unable to initialise key when account changed", e, new Object[0]);
                        }
                    } else {
                        int i2 = Build.VERSION.SDK_INT;
                    }
                }
            } else {
                mzf.f35034a.mo25418e("Fail to write gms backup account shared preference.", new Object[0]);
            }
        } else {
            mzf.f35034a.mo25416d("Cannot set invalid backup account.", new Object[0]);
        }
    }
}
