package p000;

import android.view.InflateException;
import android.view.MenuItem;
import java.lang.reflect.Method;

/* renamed from: ux */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1420ux implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    private static final Class[] f27291a = {MenuItem.class};

    /* renamed from: b */
    private final Object f27292b;

    /* renamed from: c */
    private Method f27293c;

    public C1420ux(Object obj, String str) {
        this.f27292b = obj;
        Class<?> cls = obj.getClass();
        try {
            this.f27293c = cls.getMethod(str, f27291a);
        } catch (Exception e) {
            InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
            inflateException.initCause(e);
            throw inflateException;
        }
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        try {
            if (this.f27293c.getReturnType() == Boolean.TYPE) {
                return ((Boolean) this.f27293c.invoke(this.f27292b, menuItem)).booleanValue();
            }
            this.f27293c.invoke(this.f27292b, menuItem);
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
