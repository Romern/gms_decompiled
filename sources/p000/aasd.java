package p000;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aasd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aasd {
    /* renamed from: a */
    public static String m46846a(Context context, HelpConfig helpConfig, List list) {
        try {
            Integer valueOf = Integer.valueOf(Integer.parseInt(aasb.m46831a(context, helpConfig, "google_account_name_hash", "")));
            for (int i = 0; i < list.size(); i++) {
                String str = ((Account) list.get(i)).name;
                if (str.hashCode() == valueOf.intValue()) {
                    return str;
                }
            }
            return "";
        } catch (NumberFormatException e) {
            return "";
        }
    }

    /* renamed from: a */
    public static List m46847a(Context context) {
        try {
            return soz.m35801d(context, "com.google.android.gms");
        } catch (Exception e) {
            return new ArrayList();
        }
    }

    /* renamed from: a */
    public static void m46848a(Context context, HelpConfig helpConfig) {
        if (helpConfig != null && helpConfig.f78829d == null) {
            List a = m46847a(context);
            if (!a.isEmpty() && !m46849a(context, helpConfig, m46846a(context, helpConfig, a))) {
                m46849a(context, helpConfig, ((Account) a.get(0)).name);
            }
        }
    }

    /* renamed from: a */
    public static boolean m46849a(Context context, HelpConfig helpConfig, String str) {
        String str2;
        if (helpConfig != null) {
            Account account = helpConfig.f78829d;
            if (account != null) {
                str2 = account.name;
            } else {
                str2 = "";
            }
            if (!str.equals(str2)) {
                if (!TextUtils.isEmpty(str)) {
                    List a = m46847a(context);
                    for (int i = 0; i < a.size(); i++) {
                        Account account2 = (Account) a.get(i);
                        if (account2.name.equals(str)) {
                            helpConfig.f78829d = account2;
                            Account account3 = helpConfig.f78829d;
                            if (account3 != null) {
                                String num = Integer.valueOf(account3.name.hashCode()).toString();
                                aasa a2 = new aasc(context, helpConfig).mo31695a();
                                a2.mo31689a("google_account_name_hash", num);
                                a2.mo31685a();
                            }
                            return true;
                        }
                    }
                    return false;
                }
                helpConfig.f78829d = null;
                aasb.m46833a(context, helpConfig, "google_account_name_hash");
                return true;
            }
        }
        return false;
    }
}
