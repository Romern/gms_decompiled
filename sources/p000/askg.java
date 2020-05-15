package p000;

import android.content.Context;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;

/* renamed from: askg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class askg {
    /* renamed from: a */
    public static askf m74277a(Context context) {
        return m74280a(askc.m74272b(), context, (String) null);
    }

    /* renamed from: b */
    public static askf m74283b(Context context, String str) {
        String b = askc.m74272b();
        AccountInfo b2 = asix.m74201b(context, b);
        if (b2 != null) {
            return new askf(b2, b, context, str);
        }
        return null;
    }

    /* renamed from: a */
    public static askf m74278a(Context context, String str) {
        return m74280a(askc.m74272b(), context, str);
    }

    /* renamed from: a */
    public static askf m74279a(String str, Context context) {
        return m74284b(str, context, null);
    }

    /* renamed from: b */
    public static askf m74284b(String str, Context context, String str2) {
        return m74282a(str, askc.m74272b(), context, str2);
    }

    /* renamed from: a */
    public static askf m74280a(String str, Context context, String str2) {
        AccountInfo b = asix.m74201b(context, str);
        if (b != null) {
            return new askf(b, str, context, str2);
        }
        throw new IllegalStateException("No current tap-and-pay account");
    }

    /* renamed from: a */
    public static askf m74281a(String str, String str2, Context context) {
        return m74282a(str, str2, context, null);
    }

    /* renamed from: a */
    public static askf m74282a(String str, String str2, Context context, String str3) {
        String b = asjg.m74215b(context, str);
        if (b != null) {
            return new askf(b, str, str2, context, str3);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("No registered account for ") : "No registered account for ".concat(valueOf));
    }
}
