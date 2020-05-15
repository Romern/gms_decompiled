package p000;

import android.accounts.Account;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: mau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mau {
    /* renamed from: a */
    public static List m24777a(Context context) {
        List<Account> list;
        adyd a = adyd.m51363a(context);
        if (sre.m36080a(context)) {
            list = soz.m35805e(context, context.getPackageName());
        } else {
            list = Arrays.asList(a.mo33916a("com.google"));
        }
        Pattern a2 = new mbw(context).mo19819a();
        if (a2 == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Account account : list) {
            if (a2.matcher(account.name).matches()) {
                arrayList.add(account);
            }
        }
        return arrayList;
    }
}
