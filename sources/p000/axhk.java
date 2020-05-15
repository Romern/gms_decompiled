package p000;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

/* renamed from: axhk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axhk {

    /* renamed from: a */
    public final Context f95947a;

    public axhk(Context context) {
        this.f95947a = context;
    }

    /* renamed from: a */
    public static String m82617a() {
        String str = (String) axmc.f96176b.mo58455c();
        if (str == null || str.length() < 2 || str.length() > 3 || !TextUtils.isGraphic(str)) {
            return null;
        }
        return str;
    }

    /* renamed from: a */
    public final boolean mo53150a(int i, Account account) {
        String str;
        if (!chks.f188720a.mo6606a().mo85308c()) {
            if (m82617a() == null || !chko.m148873b().f165797a.contains(m82617a())) {
                return false;
            }
            return true;
        } else if (chks.f188720a.mo6606a().mo85310e() && account != null && soz.m35808f(this.f95947a, account.name)) {
            return false;
        } else {
            if (chks.f188720a.mo6606a().mo85309d() && account != null && !account.name.endsWith("@gmail.com") && !soz.m35803d(this.f95947a, account.name, chks.f188720a.mo6606a().mo85311f())) {
                return false;
            }
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            } else if (i2 == 2) {
                return chks.f188720a.mo6606a().mo85316k();
            } else {
                if (i2 == 3) {
                    return chks.f188720a.mo6606a().mo85313h();
                }
                if (i2 == 4) {
                    return chks.f188720a.mo6606a().mo85315j();
                }
                if (i2 == 5) {
                    return chks.f188720a.mo6606a().mo85312g();
                }
                if (i2 == 8) {
                    return chks.f188720a.mo6606a().mo85314i();
                }
                if (i2 == 9) {
                    return chks.f188720a.mo6606a().mo85306a();
                }
                if (i2 == 11) {
                    return chks.f188720a.mo6606a().mo85307b();
                }
                if (i == 0) {
                    str = "null";
                } else if (i == 0) {
                    throw null;
                } else if (i != 0) {
                    str = Integer.toString(i2);
                } else {
                    throw null;
                }
                String valueOf = String.valueOf(str);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("Unknown integratorId: ");
                sb.append(valueOf);
                Log.e("WalletP2P", sb.toString());
                return false;
            }
        }
    }
}
