package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: gmi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gmi {
    /* renamed from: a */
    public static bzxl m13447a(Context context, Account account) {
        try {
            String packageName = context.getPackageName();
            String lowerCase = spn.m35882e(context, packageName).toLowerCase(Locale.US);
            String str = (String) ((goa) goa.f18759a.mo13145b()).mo12090a(account, gqd.f18807a);
            if (!TextUtils.isEmpty(str)) {
                bxvd da = bzxl.f171767e.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bzxl bzxl = (bzxl) da.f164949b;
                str.getClass();
                int i = bzxl.f171769a | 1;
                bzxl.f171769a = i;
                bzxl.f171770b = str;
                packageName.getClass();
                int i2 = i | 2;
                bzxl.f171769a = i2;
                bzxl.f171771c = packageName;
                lowerCase.getClass();
                bzxl.f171769a = i2 | 4;
                bzxl.f171772d = lowerCase;
                return (bzxl) da.mo74062i();
            }
            throw new gmh("Account has no password.");
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalStateException();
        }
    }
}
