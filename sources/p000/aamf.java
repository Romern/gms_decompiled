package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.UserHandle;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aamf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aamf {

    /* renamed from: a */
    private final Method f28451a;

    /* renamed from: b */
    private final SparseArray f28452b = new SparseArray();

    /* renamed from: c */
    private final Context f28453c;

    public aamf(Context context) {
        Method method;
        this.f28453c = context;
        int i = Build.VERSION.SDK_INT;
        try {
            method = Context.class.getDeclaredMethod("createPackageContextAsUser", String.class, Integer.TYPE, UserHandle.class);
        } catch (Exception e) {
            Log.e("GCM", "Failed to initialize multi-user Context support, falling back to single-user impl");
            method = null;
        }
        this.f28451a = method;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006a, code lost:
        return r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0066 A[Catch:{ Exception -> 0x0053 }] */
    /* renamed from: a */
    public final synchronized Context mo17010a(int i, String str) {
        Context context;
        Context context2 = this.f28453c;
        if (context2 != null) {
            if (i == 0) {
                if (str.equals(context2.getPackageName())) {
                }
            }
            Map map = (Map) this.f28452b.get(i);
            if (map == null) {
                map = new HashMap(1);
                this.f28452b.put(i, map);
            }
            Context context3 = (Context) map.get(str);
            if (context3 == null) {
                Object c = aajg.m21342c(i);
                if (c != null) {
                    Method method = this.f28451a;
                    if (method != null) {
                        try {
                            context3 = (Context) method.invoke(this.f28453c, str, 0, c);
                        } catch (Exception e) {
                            Log.e("GCM", "Multi-user invocation failed, falling back to single-user impl");
                            context3 = this.f28453c;
                        }
                        if (context3 != null) {
                            map.put(str, context3);
                        }
                    } else {
                        context = this.f28453c;
                    }
                } else {
                    context = null;
                }
                context3 = context;
                if (context3 != null) {
                }
            }
        }
        return this.f28453c;
    }

    /* renamed from: b */
    public final Context mo17012b(int i) {
        Context context = this.f28453c;
        if (context != null) {
            return mo17010a(i, context.getPackageName());
        }
        return null;
    }

    /* renamed from: c */
    public final PackageManager mo17013c(int i) {
        Context b = mo17012b(i);
        if (b != null) {
            return b.getPackageManager();
        }
        return null;
    }

    /* renamed from: a */
    public final synchronized void mo17011a(int i) {
        this.f28452b.remove(i);
    }
}
