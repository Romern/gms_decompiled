package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import java.util.ArrayList;

/* renamed from: angd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class angd {

    /* renamed from: a */
    private static final srn f76796a = srn.m36127a(sgj.PHENOTYPE);

    /* renamed from: b */
    private static final bnic f76797b = bnic.m109490a("com.google", "com.google.work");

    /* renamed from: c */
    private static final bnic f76798c = bnic.m109489a("cn.google");

    /* renamed from: d */
    private static volatile Boolean f76799d;

    /* renamed from: a */
    public static boolean m64196a(String str, Context context) {
        for (String str2 : m64197a(context)) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static String[] m64197a(Context context) {
        bnic bnic;
        try {
            if (f76799d == null) {
                int i = Build.VERSION.SDK_INT;
                f76799d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
            }
            if (!f76799d.booleanValue()) {
                bnic = f76797b;
            } else {
                bnic = f76798c;
            }
            Account[] b = adyd.m51363a(context).mo33922b();
            int length = b.length;
            ArrayList arrayList = new ArrayList(length);
            for (Account account : b) {
                if (bnic.contains(account.type)) {
                    arrayList.add(account.name);
                }
            }
            return (String[]) arrayList.toArray(new String[0]);
        } catch (SecurityException e) {
            bnsl bnsl = (bnsl) f76796a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("angd", "a", 38, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to get device user accounts");
            return new String[0];
        }
    }
}
