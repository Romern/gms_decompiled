package p000;

import android.content.SharedPreferences;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: bjs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjs {

    /* renamed from: a */
    private static Method f3404a;

    static {
        try {
            f3404a = SharedPreferences.Editor.class.getMethod("apply", new Class[0]);
        } catch (NoSuchMethodException e) {
            f3404a = null;
        }
    }

    /* renamed from: a */
    public static void m3228a(SharedPreferences.Editor editor) {
        Method method = f3404a;
        if (method != null) {
            try {
                method.invoke(editor, new Object[0]);
                return;
            } catch (IllegalAccessException | InvocationTargetException e) {
            }
        }
        editor.commit();
    }
}
