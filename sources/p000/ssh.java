package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: ssh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ssh {

    /* renamed from: b */
    private static final Method f45079b;

    /* renamed from: c */
    private static volatile Boolean f45080c = null;

    /* renamed from: a */
    protected int f45081a = -1;

    /* renamed from: b */
    public void mo26041b() {
        throw null;
    }

    /* renamed from: c */
    public void mo26043c() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo26044c(int i) {
        return i == this.f45081a;
    }

    /* renamed from: d */
    public boolean mo26045d() {
        throw null;
    }

    static {
        Method method;
        int i = Build.VERSION.SDK_INT;
        try {
            method = UserHandle.class.getMethod("getUserId", Integer.TYPE);
        } catch (Exception e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
            sb.append("Unable to find getUserId method: ");
            sb.append(valueOf);
            Log.i("MultiUserUtil", sb.toString());
            method = null;
        }
        f45079b = method;
    }

    /* renamed from: a */
    public static ssh m36213a(Context context) {
        int i = Build.VERSION.SDK_INT;
        return new ssi(context);
    }

    /* renamed from: e */
    public static void m36214e() {
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo26042b(int i) {
        try {
            return UserHandle.myUserId() == i;
        } catch (Throwable th) {
            Log.wtf("MultiUserUtil", th);
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo26039a() {
        int i = Build.VERSION.SDK_INT;
        try {
            return mo26042b(ActivityManager.getCurrentUser());
        } catch (Throwable th) {
            Log.wtf("MultiUserUtil", th);
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo26040a(int i) {
        if (this.f45081a != -1) {
            int i2 = Build.VERSION.SDK_INT;
            Method method = f45079b;
            if (method == null) {
                return true;
            }
            try {
                return mo26044c(((Integer) method.invoke(null, Integer.valueOf(i))).intValue());
            } catch (Throwable th) {
                Log.wtf("MultiUserUtil", th);
                return true;
            }
        } else {
            throw new IllegalStateException("isForegroundUser must be called after beginForegroundUserQuery");
        }
    }
}
