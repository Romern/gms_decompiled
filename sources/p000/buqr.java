package p000;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: buqr */
public final /* synthetic */ class buqr implements Runnable {

    /* renamed from: a */
    private final Method f154724a;

    /* renamed from: b */
    private final Object f154725b;

    /* renamed from: c */
    private final String f154726c;

    /* renamed from: d */
    private final bqgy f154727d;

    /* renamed from: e */
    private final String f154728e;

    public buqr(Method method, Object obj, String str, bqgy bqgy, String str2) {
        this.f154724a = method;
        this.f154725b = obj;
        this.f154726c = str;
        this.f154727d = bqgy;
        this.f154728e = str2;
    }

    public final void run() {
        Method method = this.f154724a;
        Object obj = this.f154725b;
        String str = this.f154726c;
        bqgy bqgy = this.f154727d;
        String str2 = this.f154728e;
        try {
            method.invoke(obj, str);
            bqgy.mo69138b((Object) true);
        } catch (IllegalAccessException | InvocationTargetException e) {
            String valueOf = String.valueOf(str2);
            Log.w("AutoTestUiInjector", valueOf.length() == 0 ? new String("Error! Meet exception when calling ") : "Error! Meet exception when calling ".concat(valueOf), e);
            bqgy.mo69138b((Object) false);
        }
    }
}
