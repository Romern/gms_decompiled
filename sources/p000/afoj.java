package p000;

import android.accounts.Account;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: afoj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afoj {

    /* renamed from: a */
    public static final Map f64438a = new HashMap();

    /* renamed from: b */
    public final Context f64439b;

    public afoj(Context context) {
        this.f64439b = context;
    }

    /* renamed from: a */
    public static String m53354a(String str, String str2, Account account) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        String sb2 = sb.toString();
        if (account == null) {
            return sb2;
        }
        String valueOf = String.valueOf(sb2);
        String str3 = account.name;
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str3).length());
        sb3.append(valueOf);
        sb3.append("-");
        sb3.append(str3);
        return sb3.toString();
    }
}
