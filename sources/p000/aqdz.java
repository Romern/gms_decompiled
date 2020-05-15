package p000;

import android.os.Build;
import java.lang.reflect.Method;

/* renamed from: aqdz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqdz {

    /* renamed from: f */
    private static Method f85826f;

    /* renamed from: g */
    private static Method f85827g;

    /* renamed from: h */
    private static Method f85828h;

    /* renamed from: i */
    private static Method f85829i;

    /* renamed from: j */
    private static Method f85830j;

    /* renamed from: a */
    public final Integer f85831a;

    /* renamed from: b */
    final long f85832b;

    /* renamed from: c */
    final long f85833c;

    /* renamed from: d */
    final long f85834d;

    /* renamed from: e */
    final long f85835e;

    public aqdz(Object obj) {
        Integer num;
        if (f85826f == null) {
            Class<?> cls = obj.getClass();
            f85826f = cls.getMethod("getOp", new Class[0]);
            f85827g = cls.getMethod("getTime", new Class[0]);
            int i = Build.VERSION.SDK_INT;
            f85828h = cls.getMethod("getLastAccessBackgroundTime", Integer.TYPE);
            f85829i = cls.getMethod("getRejectTime", new Class[0]);
            f85830j = cls.getMethod("getDuration", new Class[0]);
        }
        int indexOfKey = aqec.f85846b.indexOfKey(((Integer) f85826f.invoke(obj, new Object[0])).intValue());
        if (indexOfKey >= 0) {
            num = Integer.valueOf(aqec.f85846b.valueAt(indexOfKey));
        } else {
            num = null;
        }
        this.f85831a = num;
        this.f85832b = ((Long) f85827g.invoke(obj, new Object[0])).longValue();
        int i2 = Build.VERSION.SDK_INT;
        this.f85833c = ((Long) f85828h.invoke(obj, 31)).longValue();
        this.f85834d = ((Long) f85829i.invoke(obj, new Object[0])).longValue();
        int i3 = Build.VERSION.SDK_INT;
        this.f85835e = ((Long) f85830j.invoke(obj, new Object[0])).longValue();
    }
}
