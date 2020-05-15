package p000;

import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: djt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class djt {

    /* renamed from: a */
    public final int f13357a;

    /* renamed from: b */
    public final String f13358b;

    /* renamed from: c */
    public final Constructor f13359c;

    /* renamed from: d */
    public final Object[] f13360d;

    /* renamed from: e */
    public final Method f13361e;

    public djt(int i, String str, Constructor constructor, Object[] objArr, Method method) {
        this.f13357a = i;
        this.f13358b = str;
        this.f13359c = constructor;
        this.f13360d = objArr;
        this.f13361e = method;
    }

    /* renamed from: a */
    public final Object mo9144a(Class cls) {
        dix dix;
        try {
            Constructor constructor = this.f13359c;
            if (constructor != null) {
                dix = (dix) constructor.newInstance(this.f13360d);
            } else {
                Method method = this.f13361e;
                if (method != null) {
                    dix = (dix) method.invoke(null, new Object[0]);
                    if (dix == null) {
                        String str = this.f13358b;
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 55);
                        sb.append("Failed to instantiate ");
                        sb.append(str);
                        sb.append(": ");
                        sb.append("provideInstance");
                        sb.append("() returned null");
                        Log.e("ChimeraProxyRslvr", sb.toString());
                        return null;
                    }
                } else {
                    dix = null;
                }
            }
            if (dix != null) {
                return cls.cast(dix.getChimeraImpl());
            }
            return null;
        } catch (ClassCastException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            if ((e instanceof IllegalAccessException) || (e instanceof ClassCastException)) {
                String str2 = this.f13358b;
                String valueOf = String.valueOf(e);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 24 + String.valueOf(valueOf).length());
                sb2.append("Failed to instantiate ");
                sb2.append(str2);
                sb2.append(": ");
                sb2.append(valueOf);
                Log.e("ChimeraProxyRslvr", sb2.toString());
            } else if (!(e instanceof InvocationTargetException)) {
                String str3 = this.f13358b;
                String valueOf2 = String.valueOf(e);
                StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 24 + String.valueOf(valueOf2).length());
                sb3.append("Failed to instantiate ");
                sb3.append(str3);
                sb3.append(": ");
                sb3.append(valueOf2);
                Log.e("ChimeraProxyRslvr", sb3.toString(), e.getCause());
            } else {
                String str4 = this.f13358b;
                String valueOf3 = String.valueOf(e);
                StringBuilder sb4 = new StringBuilder(String.valueOf(str4).length() + 24 + String.valueOf(valueOf3).length());
                sb4.append("Failed to instantiate ");
                sb4.append(str4);
                sb4.append(": ");
                sb4.append(valueOf3);
                Log.e("ChimeraProxyRslvr", sb4.toString());
                throw new RuntimeException(e.getCause());
            }
            return null;
        }
    }
}
