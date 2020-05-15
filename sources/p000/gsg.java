package p000;

import android.accounts.Account;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.auth.account.visibility.RequestAccountsAccessChimeraActivity;
import java.util.Map;

/* renamed from: gsg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gsg {

    /* renamed from: a */
    public static final sek f18947a = ght.m13171a("AccountVisibility");

    /* renamed from: d */
    public static final imn f18948d = new gsf();

    /* renamed from: b */
    public final adyd f18949b;

    /* renamed from: c */
    public final goa f18950c;

    public gsg(adyd adyd, goa goa) {
        this.f18949b = adyd;
        this.f18950c = goa;
    }

    /* renamed from: a */
    public static boolean m13819a() {
        if (!gnv.m13538ak()) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        return true;
    }

    /* renamed from: b */
    public static boolean m13820b() {
        if (!gnv.m13539al()) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        return true;
    }

    /* renamed from: a */
    public final Bundle mo12164a(String str, boolean z) {
        if (!m13820b()) {
            return gsh.m13824a();
        }
        if (!z) {
            try {
                if (((gsl) gsl.f18953a.mo13145b()).mo12171b(str)) {
                    return gsh.m13825b();
                }
            } catch (gkn e) {
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("userRecoveryIntent", RequestAccountsAccessChimeraActivity.m6313a());
            bundle.putString("Error", izj.NEED_PERMISSION.f22000ac);
            return bundle;
        } else if (mo12165a(str)) {
            return gsh.m13825b();
        } else {
            Bundle bundle2 = new Bundle();
            bundle2.putString("Error", izj.INTNERNAL_ERROR.f22000ac);
            return bundle2;
        }
    }

    /* renamed from: b */
    public final boolean mo12166b(String str) {
        return "android:accounts:key_legacy_visible".equals(str) || "android:accounts:key_legacy_not_visible".equals(str);
    }

    /* renamed from: a */
    public final boolean mo12165a(String str) {
        bljb a;
        try {
            gsl gsl = (gsl) gsl.f18953a.mo13145b();
            if (gsl.mo12171b(str)) {
                return true;
            }
            adyd adyd = this.f18949b;
            a = blkh.m107281a("AccountManager.getAccountsAndVisibilityForPackage");
            Map<Account, Integer> accountsAndVisibilityForPackage = adyd.f62893a.getAccountsAndVisibilityForPackage(str, "com.google");
            if (a != null) {
                a.close();
            }
            for (Map.Entry<Account, Integer> entry : accountsAndVisibilityForPackage.entrySet()) {
                Account key = entry.getKey();
                Integer value = entry.getValue();
                if (!value.equals(4)) {
                    if (!value.equals(2)) {
                        continue;
                    }
                }
                sek sek = f18947a;
                String valueOf = String.valueOf(key);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23 + String.valueOf(valueOf).length());
                sb.append("Setting visibility to ");
                sb.append(str);
                sb.append(" ");
                sb.append(valueOf);
                sek.mo25412b(sb.toString(), new Object[0]);
                if (!this.f18949b.mo33914a(key, str, 2)) {
                    return false;
                }
            }
            try {
                long a2 = gsl.mo12169a(str);
                if (a2 == 0) {
                    return false;
                }
                SharedPreferences.Editor edit = gsl.f18954b.edit();
                if (a2 == 0) {
                    edit.remove(str);
                } else {
                    edit.putLong(str, a2);
                }
                return edit.commit();
            } catch (gkn e) {
                return false;
            }
        } catch (gkn e2) {
            return false;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
