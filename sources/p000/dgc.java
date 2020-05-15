package p000;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* renamed from: dgc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dgc {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        new java.lang.String("No default constructor, try Dagger injection for: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        "No default constructor, try Dagger injection for: ".concat(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r5 = r5.getDeclaredMethod("provideInstance", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        r5 = java.lang.String.valueOf(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (r5.length() == 0) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        r5 = new java.lang.String("Can't find Chimera impl class ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        r5 = "Can't find Chimera impl class ".concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0057, code lost:
        android.util.Log.e("DaggerHelper", r5);
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r3 = java.lang.String.valueOf(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r3.length() == 0) goto L_0x001b;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036 A[ExcHandler: NoSuchMethodException | InvocationTargetException (e java.lang.Throwable), Splitter:B:1:0x0003] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040 A[ExcHandler: ClassNotFoundException (e java.lang.ClassNotFoundException), Splitter:B:1:0x0003] */
    /* renamed from: a */
    public static Object m8381a(ClassLoader classLoader, String str, Class cls) {
        Object obj;
        try {
            Class loadClass = classLoader.loadClass(str);
            obj = loadClass.newInstance();
        } catch (ClassNotFoundException e) {
        } catch (NoSuchMethodException | InvocationTargetException e2) {
        } catch (IllegalAccessException e3) {
            e = e3;
            Log.e("DaggerHelper", "Failed to instantiate Chimera impl", e);
            obj = null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e4) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 44);
            sb.append("Chimera impl ");
            sb.append(str);
            sb.append(" is not with the expected type.");
            Log.e("DaggerHelper", sb.toString(), e4);
            return null;
        }
    }
}
