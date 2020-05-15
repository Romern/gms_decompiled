package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/* renamed from: nac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nac {

    /* renamed from: a */
    public static final lvn f35120a = new lvn("KeyValueRateLimiter");

    /* renamed from: b */
    public final SharedPreferences f35121b;

    public nac(Context context) {
        this.f35121b = context.getSharedPreferences("Backup.RateLimiter", 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo20406a(String str) {
        String q = ccnf.f179489a.mo6606a().mo76445q();
        if (TextUtils.isEmpty(q)) {
            return false;
        }
        if ("ALL".equals(q)) {
            return true;
        }
        for (String str2 : q.split(",")) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }
}
