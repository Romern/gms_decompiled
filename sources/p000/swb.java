package p000;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import java.lang.reflect.InvocationTargetException;

/* renamed from: swb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class swb extends swa {

    /* renamed from: f */
    private int f45256f;

    /* renamed from: g */
    private int f45257g;

    public swb() {
        try {
            Class<?> cls = Class.forName("android.app.admin.SystemUpdatePolicy");
            this.f45256f = cls.getField("TYPE_INSTALL_AUTOMATIC").getInt(null);
            this.f45257g = cls.getField("TYPE_INSTALL_WINDOWED").getInt(null);
            cls.getField("TYPE_POSTPONE").getInt(null);
        } catch (ClassNotFoundException e) {
        } catch (NoSuchFieldException e2) {
        } catch (IllegalAccessException e3) {
        }
    }

    /* renamed from: c */
    private static final int m36512c(Object obj) {
        try {
            return ((Integer) Class.forName("android.app.admin.SystemUpdatePolicy").getMethod("getPolicyType", new Class[0]).invoke(obj, new Object[0])).intValue();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            return -1;
        }
    }

    /* renamed from: a */
    public final boolean mo26187a(Object obj) {
        return m36512c(obj) == this.f45256f;
    }

    /* renamed from: b */
    public final boolean mo26188b(Object obj) {
        return m36512c(obj) == this.f45257g;
    }

    /* renamed from: f */
    public final Object mo26195f(Context context) {
        try {
            return DevicePolicyManager.class.getMethod("getSystemUpdatePolicy", new Class[0]).invoke((DevicePolicyManager) context.getSystemService("device_policy"), new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            return null;
        }
    }
}
