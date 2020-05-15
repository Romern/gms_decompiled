package p000;

import android.accounts.Account;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: acww */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acww {
    /* renamed from: a */
    public static String m49914a(absr absr) {
        if (abww.m48413a(absr.f58138c)) {
            return absr.f58138c;
        }
        if ((((Boolean) acaw.f59393m.mo58455c()).booleanValue() && "com.google.android.gms".equals(absr.f58140e)) || (((Boolean) acaw.f59394n.mo58455c()).booleanValue() && abzm.m48658f(absr))) {
            return absr.f58138c;
        }
        if (!((Boolean) acaw.f59397q.mo58455c()).booleanValue()) {
            return null;
        }
        if (!absr.f58138c.startsWith("messages/")) {
            return absr.f58138c;
        }
        String[] split = TextUtils.split(absr.f58138c, "/");
        if (split.length != 3) {
            return null;
        }
        String str = split[0];
        String decode = Uri.decode(split[1]);
        Account account = new Account(Uri.decode(split[2]), decode);
        bnzd a = bnzi.m110900b().mo68732a();
        a.mo68725a(account.type, bmwy.f131158c);
        a.mo68725a(account.name, bmwy.f131158c);
        return TextUtils.join("/", Arrays.asList(str, decode, a.mo68729a().toString()));
    }
}
