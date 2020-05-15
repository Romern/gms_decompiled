package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.UserHandle;
import android.os.UserManager;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: ssi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ssi extends ssh {

    /* renamed from: c */
    private static final Method f45082c;

    /* renamed from: d */
    private static final Field f45083d;

    /* renamed from: b */
    private final UserManager f45084b;

    /* renamed from: e */
    private List f45085e = null;

    static {
        Method method;
        Field field = null;
        try {
            method = UserManager.class.getMethod("getProfiles", Integer.TYPE);
        } catch (Exception e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("Unable to find getProfiles method: ");
            sb.append(valueOf);
            Log.wtf("MultiUserUtil", sb.toString());
            method = null;
        }
        f45082c = method;
        try {
            field = Class.forName("android.content.pm.UserInfo").getField("id");
        } catch (Exception e2) {
            String valueOf2 = String.valueOf(e2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 34);
            sb2.append("Unable to find UserInfo.id field: ");
            sb2.append(valueOf2);
            Log.wtf("MultiUserUtil", sb2.toString());
        }
        f45083d = field;
    }

    public ssi(Context context) {
        this.f45084b = (UserManager) context.getSystemService("user");
    }

    /* renamed from: c */
    public final void mo26043c() {
        this.f45081a = -1;
        this.f45085e = null;
    }

    /* renamed from: d */
    public final boolean mo26045d() {
        return this.f45084b.isManagedProfile();
    }

    /* renamed from: b */
    public final void mo26041b() {
        int i = Build.VERSION.SDK_INT;
        try {
            this.f45081a = ActivityManager.getCurrentUser();
        } catch (Throwable th) {
            Log.wtf("MultiUserUtil", th);
            this.f45081a = 0;
        }
        Method method = f45082c;
        if (method != null) {
            try {
                this.f45085e = (List) method.invoke(this.f45084b, Integer.valueOf(this.f45081a));
            } catch (Throwable th2) {
                Log.wtf("MultiUserUtil", th2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo26044c(int i) {
        List list = this.f45085e;
        if (list == null || f45083d == null) {
            return true;
        }
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            try {
                if (f45083d.getInt(this.f45085e.get(i2)) == i) {
                    return true;
                }
                i2++;
            } catch (Exception e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
                sb.append("Unable to find id field in UserInfo object: ");
                sb.append(valueOf);
                Log.wtf("MultiUserUtil", sb.toString());
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo26042b(int i) {
        for (UserHandle userHandle : this.f45084b.getUserProfiles()) {
            if (userHandle.getIdentifier() == i) {
                return true;
            }
        }
        return false;
    }
}
