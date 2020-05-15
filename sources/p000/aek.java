package p000;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: aek */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aek {

    /* renamed from: a */
    public static Method f339a;

    static {
        int i = Build.VERSION.SDK_INT;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f339a = declaredMethod;
            if (!declaredMethod.isAccessible()) {
                f339a.setAccessible(true);
            }
        } catch (NoSuchMethodException e) {
        }
    }

    /* renamed from: a */
    public static boolean m624a(View view) {
        return C1280ps.m19923h(view) == 1;
    }

    /* renamed from: b */
    public static void m625b(View view) {
        int i = Build.VERSION.SDK_INT;
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, new Object[0]);
        } catch (NoSuchMethodException e) {
        } catch (InvocationTargetException e2) {
        } catch (IllegalAccessException e3) {
        }
    }
}
