package p000;

import android.accounts.Account;
import android.os.Build;
import android.os.LocaleList;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: adwg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adwg {
    /* renamed from: a */
    public static bmxv m51268a() {
        try {
            return bmxv.m108566b(gie.m13199d(rpr.m34216b(), "com.google"));
        } catch (Exception e) {
            Log.e("DeviceUtils", "Error while getting account names", e);
            return bmvz.f131120a;
        }
    }

    /* renamed from: b */
    public static bngx m51270b() {
        int i = Build.VERSION.SDK_INT;
        LocaleList localeList = LocaleList.getDefault();
        ArrayList arrayList = new ArrayList(localeList.size());
        for (int i2 = 0; i2 < localeList.size(); i2++) {
            arrayList.add(localeList.get(i2));
        }
        return bngx.m109368a((Collection) arrayList);
    }

    /* renamed from: a */
    public static bmxv m51269a(String str) {
        bmxv a = m51268a();
        if (a.mo66813a()) {
            Account[] accountArr = (Account[]) a.mo66814b();
            for (Account account : accountArr) {
                if (account.name.equals(str)) {
                    return bmxv.m108566b(account);
                }
            }
        }
        return bmvz.f131120a;
    }
}
