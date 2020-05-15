package p000;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* renamed from: djg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class djg extends ClassLoader {

    /* renamed from: d */
    private static final Method f13325d = m8636a(ClassLoader.class, "getPackage", String.class);

    /* renamed from: e */
    private static final Method f13326e = m8636a(ClassLoader.class, "getPackages", new Class[0]);

    /* renamed from: f */
    private static final double f13327f = Math.log(2.0d);

    /* renamed from: g */
    private static final ClassLoader f13328g = m8632a();

    /* renamed from: j */
    private static final Package[] f13329j = new Package[0];

    /* renamed from: a */
    final ClassLoader f13330a;

    /* renamed from: b */
    final String[] f13331b;

    /* renamed from: c */
    final String[] f13332c;

    /* renamed from: h */
    private final ClassLoader f13333h;

    /* renamed from: i */
    private final C1231nx f13334i;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001d  */
    public djg(ClassLoader classLoader, ClassLoader classLoader2, boolean z, String[] strArr) {
        super(classLoader);
        boolean z2;
        boolean z3;
        int length;
        int i;
        int i2;
        int i3;
        String[] strArr2;
        if (classLoader2 == null) {
            bmxy.m108581a(classLoader);
            if (classLoader.equals(f13328g)) {
                z2 = false;
                bmxy.m108588a(z2);
                this.f13333h = classLoader;
                classLoader2 = classLoader2 == null ? f13328g : classLoader2;
                this.f13330a = classLoader2;
                bmxy.m108588a(!classLoader2.equals(classLoader));
                if (strArr != null || strArr.length <= 0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                bmxy.m108588a(z3);
                length = strArr.length;
                strArr = z ? (String[]) strArr.clone() : strArr;
                Arrays.sort(strArr);
                i = 0;
                while (i < length && !strArr[i].startsWith("!")) {
                    i++;
                }
                i2 = i;
                while (i2 < length && strArr[i2].startsWith("!")) {
                    strArr[i2] = strArr[i2].substring(1);
                    i2++;
                }
                i3 = i2 - i;
                if (i3 != 0) {
                    strArr2 = new String[0];
                } else if (i3 != length) {
                    String[] strArr3 = new String[i3];
                    String[] strArr4 = new String[(length - i3)];
                    System.arraycopy(strArr, i, strArr3, 0, i3);
                    if (i > 0) {
                        System.arraycopy(strArr, 0, strArr4, 0, i);
                    }
                    int i4 = i3 + i;
                    System.arraycopy(strArr, i4, strArr4, i, length - i4);
                    strArr2 = strArr3;
                    strArr = strArr4;
                } else {
                    strArr = new String[0];
                    strArr2 = strArr;
                }
                this.f13331b = strArr;
                this.f13332c = strArr2;
                int round = (int) Math.round(Math.log((double) length) / f13327f);
                this.f13334i = round < 3 ? new C1231nx(Math.min(8, round)) : null;
            }
        }
        z2 = true;
        bmxy.m108588a(z2);
        this.f13333h = classLoader;
        if (classLoader2 == null) {
        }
        this.f13330a = classLoader2;
        bmxy.m108588a(!classLoader2.equals(classLoader));
        if (strArr != null) {
        }
        z3 = false;
        bmxy.m108588a(z3);
        length = strArr.length;
        if (z) {
        }
        Arrays.sort(strArr);
        i = 0;
        while (i < length) {
            i++;
        }
        i2 = i;
        while (i2 < length) {
            strArr[i2] = strArr[i2].substring(1);
            i2++;
        }
        i3 = i2 - i;
        if (i3 != 0) {
        }
        this.f13331b = strArr;
        this.f13332c = strArr2;
        int round2 = (int) Math.round(Math.log((double) length) / f13327f);
        this.f13334i = round2 < 3 ? new C1231nx(Math.min(8, round2)) : null;
    }

    /* renamed from: a */
    public static ClassLoader m8632a() {
        ClassLoader classLoader;
        try {
            classLoader = ClassLoader.getSystemClassLoader();
        } catch (SecurityException e) {
            classLoader = null;
        }
        if (classLoader == null) {
            try {
                classLoader = djg.class.getClassLoader();
                if (classLoader == null) {
                    throw new NullPointerException("ClassLoader is null");
                }
            } catch (NullPointerException | SecurityException e2) {
                throw ((AssertionError) new AssertionError("Cannot access own ClassLoader").initCause(e2));
            }
        }
        while (true) {
            try {
                ClassLoader parent = classLoader.getParent();
                if (parent == null) {
                    break;
                }
                classLoader = parent;
            } catch (SecurityException e3) {
            }
        }
        return classLoader;
    }

    /* renamed from: b */
    private static String m8638b(String str, String str2) {
        if (str2 == null || str2.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + str2.length());
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        return sb.toString();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: djg.a(java.lang.String, boolean):boolean
     arg types: [java.lang.String, int]
     candidates:
      djg.a(java.lang.String, java.lang.String):boolean
      djg.a(java.lang.String, boolean):boolean */
    /* access modifiers changed from: protected */
    public final Package getPackage(String str) {
        if (str.startsWith("java.")) {
            return super.getPackage(str);
        }
        if (mo9125a(str, true)) {
            ClassLoader classLoader = this.f13333h;
            if (classLoader == null) {
                return super.getPackage(str);
            }
            return (Package) m8633a(f13325d, classLoader, str);
        }
        return (Package) m8633a(f13325d, this.f13330a, str);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: djg.a(java.lang.String, boolean):boolean
     arg types: [java.lang.String, int]
     candidates:
      djg.a(java.lang.String, java.lang.String):boolean
      djg.a(java.lang.String, boolean):boolean */
    /* access modifiers changed from: protected */
    public final Package[] getPackages() {
        int i;
        int i2;
        ClassLoader classLoader = this.f13333h;
        Package[] packages = classLoader != null ? (Package[]) m8633a(f13326e, classLoader, new Object[0]) : super.getPackages();
        Package[] packageArr = (Package[]) m8633a(f13326e, this.f13330a, new Object[0]);
        if (packages != null) {
            i = packages.length;
        } else {
            i = 0;
        }
        if (packageArr != null) {
            i2 = packageArr.length;
        } else {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return f13329j;
        }
        Map a = adyi.m51411a(Math.min(i, this.f13331b.length * 3) + i2);
        if (packageArr != null) {
            for (int i3 = 0; i3 < i2; i3++) {
                Package packageR = packageArr[i3];
                if (!packageR.getName().startsWith("java.")) {
                    a.put(packageR.getName(), packageR);
                }
            }
        }
        if (packages != null) {
            for (int i4 = 0; i4 < i; i4++) {
                Package packageR2 = packages[i4];
                if (packageR2.getName().startsWith("java.") || mo9125a(packageR2.getName(), true)) {
                    a.put(packageR2.getName(), packageR2);
                }
            }
        }
        Collection values = a.values();
        return (Package[]) values.toArray(new Package[values.size()]);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: djg.a(java.lang.String, boolean):boolean
     arg types: [java.lang.String, int]
     candidates:
      djg.a(java.lang.String, java.lang.String):boolean
      djg.a(java.lang.String, boolean):boolean */
    /* access modifiers changed from: protected */
    public final Class loadClass(String str, boolean z) {
        Class<?> cls;
        if (str.startsWith("java.")) {
            cls = f13328g.loadClass(str);
        } else if (!mo9125a(str, false)) {
            cls = this.f13330a.loadClass(str);
        } else {
            ClassLoader classLoader = this.f13333h;
            if (classLoader == null) {
                classLoader = f13328g;
            }
            cls = classLoader.loadClass(str);
        }
        if (z) {
            resolveClass(cls);
        }
        return cls;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Throwable], assign insn: 0x0008: INVOKE  (r5v5 ? I:java.lang.Throwable) = (r4v2 java.lang.reflect.InvocationTargetException) type: VIRTUAL call: java.lang.reflect.InvocationTargetException.getCause():java.lang.Throwable */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    private static Object m8633a(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException | IllegalArgumentException e) {
            String valueOf = String.valueOf(method);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
            sb.append("Error calling method ");
            sb.append(valueOf);
            String sb2 = sb.toString();
            String message = e.getMessage();
            if (message != null) {
                sb2 = m8638b(message, sb2);
            }
            throw ((AssertionError) new AssertionError(sb2).initCause(e));
        } catch (InvocationTargetException e2) {
            e = e2;
            ? cause = e.getCause();
            if (cause != 0) {
                e = cause;
            }
            if (e instanceof Error) {
                throw ((Error) e);
            }
            String valueOf2 = String.valueOf(method);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 21);
            sb3.append("Error calling method ");
            sb3.append(valueOf2);
            throw ((AssertionError) new AssertionError(m8638b(sb3.toString(), e.getMessage())).initCause(e));
        }
    }

    /* renamed from: a */
    private static final String m8634a(String str, String str2, boolean z) {
        if (m8637a(str, str2)) {
            return str2;
        }
        if (!z || !m8637a(str2, str)) {
            return null;
        }
        return str;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: djg.a(java.lang.String, java.lang.String, boolean):java.lang.String
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      djg.a(java.lang.reflect.Method, java.lang.Object, java.lang.Object[]):java.lang.Object
      djg.a(java.lang.String[], java.lang.String, boolean):java.lang.String
      djg.a(java.lang.Class, java.lang.String, java.lang.Class[]):java.lang.reflect.Method
      djg.a(java.lang.String, java.lang.String, boolean):java.lang.String */
    /* renamed from: a */
    private static final String m8635a(String[] strArr, String str, boolean z) {
        String str2;
        int length = strArr.length;
        if (length != 1) {
            if (length != 2) {
                int binarySearch = Arrays.binarySearch(strArr, str);
                if (binarySearch >= 0) {
                    return strArr[binarySearch];
                }
                int i = -(binarySearch + 1);
                if (i > 0) {
                    str2 = m8634a(str, strArr[i - 1], z);
                } else {
                    str2 = null;
                }
                return (str2 != null || !z || i >= length) ? str2 : m8634a(str, strArr[i], true);
            }
            String a = m8634a(str, strArr[1], z);
            if (a != null) {
                return a;
            }
        }
        return m8634a(str, strArr[0], z);
    }

    /* renamed from: a */
    private static Method m8636a(Class cls, String str, Class... clsArr) {
        String str2 = "()";
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
            try {
                declaredMethod.setAccessible(true);
            } catch (SecurityException e) {
                String name = cls.getName();
                if (clsArr.length != 0) {
                    str2 = "(...)";
                }
                int length = String.valueOf(name).length();
                StringBuilder sb = new StringBuilder(length + 36 + str.length() + str2.length());
                sb.append("Unable to set method ");
                sb.append(name);
                sb.append(".");
                sb.append(str);
                sb.append(str2);
                sb.append(" as accessable");
                Log.w("ChimeraFiltCL", sb.toString(), e);
            }
            return declaredMethod;
        } catch (NoSuchMethodException | SecurityException e2) {
            String name2 = cls.getName();
            if (clsArr.length != 0) {
                str2 = "(...)";
            }
            int length2 = String.valueOf(name2).length();
            StringBuilder sb2 = new StringBuilder(length2 + 2 + str.length() + str2.length());
            sb2.append(name2);
            sb2.append(": ");
            sb2.append(str);
            sb2.append(str2);
            throw ((NoSuchMethodError) new NoSuchMethodError(m8638b(sb2.toString(), e2.getMessage())).initCause(e2));
        }
    }

    /* renamed from: a */
    private static boolean m8637a(String str, String str2) {
        if (str2.length() == 0) {
            return true;
        }
        if (!str.startsWith(str2)) {
            return false;
        }
        if (str.length() == str2.length() || str.charAt(str2.length()) == '.' || str.charAt(str2.length()) == '$') {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: djg.a(java.lang.String[], java.lang.String, boolean):java.lang.String
     arg types: [java.lang.String[], java.lang.String, int]
     candidates:
      djg.a(java.lang.reflect.Method, java.lang.Object, java.lang.Object[]):java.lang.Object
      djg.a(java.lang.String, java.lang.String, boolean):java.lang.String
      djg.a(java.lang.Class, java.lang.String, java.lang.Class[]):java.lang.reflect.Method
      djg.a(java.lang.String[], java.lang.String, boolean):java.lang.String */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo9125a(String str, boolean z) {
        int i;
        String a;
        Boolean bool;
        C1231nx nxVar = this.f13334i;
        if (!(nxVar == null || (bool = (Boolean) nxVar.mo15546a(str)) == null)) {
            if (!z) {
                return bool.booleanValue();
            }
            if (bool.booleanValue()) {
                return true;
            }
        }
        String[] strArr = this.f13331b;
        int i2 = -1;
        boolean z2 = false;
        if (strArr.length != 0) {
            String a2 = m8635a(strArr, str, z);
            i = a2 != null ? a2.length() : -1;
        } else {
            i = 0;
        }
        String[] strArr2 = this.f13332c;
        if (!(strArr2.length == 0 || (a = m8635a(strArr2, str, false)) == null)) {
            i2 = a.length();
        }
        if (i > i2) {
            z2 = true;
        }
        if (z2 && z && i > str.length()) {
            return true;
        }
        C1231nx nxVar2 = this.f13334i;
        if (nxVar2 != null) {
            nxVar2.mo15547a(str, Boolean.valueOf(z2));
        }
        return z2;
    }
}
