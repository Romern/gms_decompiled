package p000;

import java.io.File;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: aqff */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqff {

    /* renamed from: a */
    public final int f85945a;

    /* renamed from: b */
    public final boolean f85946b;

    /* renamed from: c */
    private final Object f85947c;

    /* renamed from: d */
    private final Method f85948d;

    /* renamed from: e */
    private final Method f85949e;

    /* renamed from: f */
    private final Method f85950f;

    /* renamed from: g */
    private final Method f85951g;

    /* renamed from: h */
    private final Field f85952h;

    /* renamed from: i */
    private final Field f85953i;

    /* renamed from: j */
    private final Field f85954j;

    /* renamed from: k */
    private final Field f85955k;

    /* renamed from: l */
    private final int f85956l;

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX INFO: additional move instructions added (8) to help type inference */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: java.lang.reflect.AccessibleObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.reflect.Field} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.reflect.AccessibleObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: java.lang.reflect.Field} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: java.lang.reflect.AccessibleObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: java.lang.reflect.AccessibleObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: java.lang.reflect.AccessibleObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: java.lang.reflect.AccessibleObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v17, resolved type: java.lang.reflect.AccessibleObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v18, resolved type: java.lang.reflect.AccessibleObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v19, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v20, resolved type: java.lang.reflect.AccessibleObject} */
    /* JADX WARNING: Multi-variable type inference failed */
    public aqff() {
        String str;
        Field field;
        Field field2;
        int i;
        Method method;
        Method method2;
        Object obj;
        Method method3;
        Field field3;
        boolean z;
        Field field4;
        int i2;
        Method method4;
        AccessibleObject accessibleObject;
        Field field5;
        Field field6;
        AccessibleObject accessibleObject2;
        AccessibleObject accessibleObject3;
        Field field7;
        AccessibleObject method5;
        try {
            Class.forName("libcore.io.StructStat");
            str = "libcore.io";
        } catch (ClassNotFoundException e) {
            str = "android.system";
        }
        try {
            Class<?> cls = Class.forName(str.concat(".StructStat"));
            Class<?> cls2 = Class.forName(str.concat(".OsConstants"));
            Class<?> cls3 = Class.forName(str.concat(".Os"));
            obj = Class.forName("libcore.io.Libcore").getField("os").get(null);
            try {
                method2 = cls3.getMethod("lstat", String.class);
                try {
                    method5 = cls2.getMethod("S_ISLNK", Integer.TYPE);
                    try {
                        method3 = cls3.getMethod("access", String.class, Integer.TYPE);
                    } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException e2) {
                        field7 = null;
                        field5 = null;
                        method3 = null;
                        field2 = null;
                        accessibleObject2 = method5;
                        field = field2;
                        i = 0;
                        accessibleObject = accessibleObject2;
                        field3 = field5;
                        z = false;
                        field4 = field6;
                        i2 = 0;
                        method = accessibleObject;
                        method4 = Class.forName(str.concat(".Os")).getMethod("readlink", String.class);
                        this.f85947c = obj;
                        this.f85948d = method2;
                        this.f85949e = method;
                        this.f85950f = method4;
                        this.f85951g = method3;
                        this.f85952h = field2;
                        this.f85953i = field;
                        this.f85954j = field3;
                        this.f85955k = field4;
                        this.f85956l = i;
                        this.f85945a = i2;
                        this.f85946b = z;
                    }
                } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException e3) {
                    field7 = null;
                    field5 = null;
                    method3 = null;
                    accessibleObject3 = null;
                    field2 = accessibleObject3;
                    accessibleObject2 = accessibleObject3;
                    field = field2;
                    i = 0;
                    accessibleObject = accessibleObject2;
                    field3 = field5;
                    z = false;
                    field4 = field6;
                    i2 = 0;
                    method = accessibleObject;
                    method4 = Class.forName(str.concat(".Os")).getMethod("readlink", String.class);
                    this.f85947c = obj;
                    this.f85948d = method2;
                    this.f85949e = method;
                    this.f85950f = method4;
                    this.f85951g = method3;
                    this.f85952h = field2;
                    this.f85953i = field;
                    this.f85954j = field3;
                    this.f85955k = field4;
                    this.f85956l = i;
                    this.f85945a = i2;
                    this.f85946b = z;
                }
                try {
                    i = cls2.getField("X_OK").getInt(null);
                    try {
                        field2 = cls.getField("st_mode");
                    } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException e4) {
                        field6 = null;
                        field5 = null;
                        field2 = null;
                        field = null;
                        accessibleObject = method5;
                        field3 = field5;
                        z = false;
                        field4 = field6;
                        i2 = 0;
                        method = accessibleObject;
                        method4 = Class.forName(str.concat(".Os")).getMethod("readlink", String.class);
                        this.f85947c = obj;
                        this.f85948d = method2;
                        this.f85949e = method;
                        this.f85950f = method4;
                        this.f85951g = method3;
                        this.f85952h = field2;
                        this.f85953i = field;
                        this.f85954j = field3;
                        this.f85955k = field4;
                        this.f85956l = i;
                        this.f85945a = i2;
                        this.f85946b = z;
                    }
                } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException e5) {
                    field7 = null;
                    field5 = null;
                    field2 = null;
                    accessibleObject2 = method5;
                    field = field2;
                    i = 0;
                    accessibleObject = accessibleObject2;
                    field3 = field5;
                    z = false;
                    field4 = field6;
                    i2 = 0;
                    method = accessibleObject;
                    method4 = Class.forName(str.concat(".Os")).getMethod("readlink", String.class);
                    this.f85947c = obj;
                    this.f85948d = method2;
                    this.f85949e = method;
                    this.f85950f = method4;
                    this.f85951g = method3;
                    this.f85952h = field2;
                    this.f85953i = field;
                    this.f85954j = field3;
                    this.f85955k = field4;
                    this.f85956l = i;
                    this.f85945a = i2;
                    this.f85946b = z;
                }
            } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException e6) {
                field7 = null;
                field5 = null;
                method3 = null;
                method2 = null;
                accessibleObject3 = method2;
                field2 = accessibleObject3;
                accessibleObject2 = accessibleObject3;
                field = field2;
                i = 0;
                accessibleObject = accessibleObject2;
                field3 = field5;
                z = false;
                field4 = field6;
                i2 = 0;
                method = accessibleObject;
                method4 = Class.forName(str.concat(".Os")).getMethod("readlink", String.class);
                this.f85947c = obj;
                this.f85948d = method2;
                this.f85949e = method;
                this.f85950f = method4;
                this.f85951g = method3;
                this.f85952h = field2;
                this.f85953i = field;
                this.f85954j = field3;
                this.f85955k = field4;
                this.f85956l = i;
                this.f85945a = i2;
                this.f85946b = z;
            }
            try {
                field = cls.getField("st_gid");
                try {
                    field5 = cls.getField("st_uid");
                    try {
                        field6 = cls.getField("st_mtime");
                    } catch (NoSuchFieldException e7) {
                        field6 = null;
                    } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException e8) {
                        field6 = null;
                        accessibleObject = method5;
                        field3 = field5;
                        z = false;
                        field4 = field6;
                        i2 = 0;
                        method = accessibleObject;
                        method4 = Class.forName(str.concat(".Os")).getMethod("readlink", String.class);
                        this.f85947c = obj;
                        this.f85948d = method2;
                        this.f85949e = method;
                        this.f85950f = method4;
                        this.f85951g = method3;
                        this.f85952h = field2;
                        this.f85953i = field;
                        this.f85954j = field3;
                        this.f85955k = field4;
                        this.f85956l = i;
                        this.f85945a = i2;
                        this.f85946b = z;
                    }
                } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException e9) {
                    field6 = null;
                    field5 = null;
                    accessibleObject = method5;
                    field3 = field5;
                    z = false;
                    field4 = field6;
                    i2 = 0;
                    method = accessibleObject;
                    method4 = Class.forName(str.concat(".Os")).getMethod("readlink", String.class);
                    this.f85947c = obj;
                    this.f85948d = method2;
                    this.f85949e = method;
                    this.f85950f = method4;
                    this.f85951g = method3;
                    this.f85952h = field2;
                    this.f85953i = field;
                    this.f85954j = field3;
                    this.f85955k = field4;
                    this.f85956l = i;
                    this.f85945a = i2;
                    this.f85946b = z;
                }
                try {
                    int i3 = cls2.getField("S_ISUID").getInt(null);
                    field3 = field5;
                    z = true;
                    field4 = field6;
                    i2 = i3;
                    method = method5;
                } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException e10) {
                    accessibleObject = method5;
                    field3 = field5;
                    z = false;
                    field4 = field6;
                    i2 = 0;
                    method = accessibleObject;
                    method4 = Class.forName(str.concat(".Os")).getMethod("readlink", String.class);
                    this.f85947c = obj;
                    this.f85948d = method2;
                    this.f85949e = method;
                    this.f85950f = method4;
                    this.f85951g = method3;
                    this.f85952h = field2;
                    this.f85953i = field;
                    this.f85954j = field3;
                    this.f85955k = field4;
                    this.f85956l = i;
                    this.f85945a = i2;
                    this.f85946b = z;
                }
            } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException e11) {
                field6 = null;
                field5 = null;
                field = null;
                accessibleObject = method5;
                field3 = field5;
                z = false;
                field4 = field6;
                i2 = 0;
                method = accessibleObject;
                method4 = Class.forName(str.concat(".Os")).getMethod("readlink", String.class);
                this.f85947c = obj;
                this.f85948d = method2;
                this.f85949e = method;
                this.f85950f = method4;
                this.f85951g = method3;
                this.f85952h = field2;
                this.f85953i = field;
                this.f85954j = field3;
                this.f85955k = field4;
                this.f85956l = i;
                this.f85945a = i2;
                this.f85946b = z;
            }
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException e12) {
            field7 = null;
            field5 = null;
            method3 = null;
            obj = null;
            method2 = null;
            accessibleObject3 = method2;
            field2 = accessibleObject3;
            accessibleObject2 = accessibleObject3;
            field = field2;
            i = 0;
            accessibleObject = accessibleObject2;
            field3 = field5;
            z = false;
            field4 = field6;
            i2 = 0;
            method = accessibleObject;
            method4 = Class.forName(str.concat(".Os")).getMethod("readlink", String.class);
            this.f85947c = obj;
            this.f85948d = method2;
            this.f85949e = method;
            this.f85950f = method4;
            this.f85951g = method3;
            this.f85952h = field2;
            this.f85953i = field;
            this.f85954j = field3;
            this.f85955k = field4;
            this.f85956l = i;
            this.f85945a = i2;
            this.f85946b = z;
        }
        try {
            method4 = Class.forName(str.concat(".Os")).getMethod("readlink", String.class);
        } catch (NoSuchMethodException e13) {
            try {
                Method declaredMethod = File.class.getDeclaredMethod("readlink", String.class);
                if (declaredMethod != null) {
                    try {
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException e14) {
                    }
                }
                method4 = declaredMethod;
            } catch (NoSuchMethodException e15) {
                method4 = null;
                this.f85947c = obj;
                this.f85948d = method2;
                this.f85949e = method;
                this.f85950f = method4;
                this.f85951g = method3;
                this.f85952h = field2;
                this.f85953i = field;
                this.f85954j = field3;
                this.f85955k = field4;
                this.f85956l = i;
                this.f85945a = i2;
                this.f85946b = z;
            }
        } catch (ClassNotFoundException e16) {
            method4 = null;
        }
        this.f85947c = obj;
        this.f85948d = method2;
        this.f85949e = method;
        this.f85950f = method4;
        this.f85951g = method3;
        this.f85952h = field2;
        this.f85953i = field;
        this.f85954j = field3;
        this.f85955k = field4;
        this.f85956l = i;
        this.f85945a = i2;
        this.f85946b = z;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0069, code lost:
        r8 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0069 A[ExcHandler: InvocationTargetException (e java.lang.reflect.InvocationTargetException), Splitter:B:3:0x0008] */
    /* renamed from: a */
    public final aqfd mo47815a(File file) {
        if (this.f85946b) {
            String absolutePath = file.getAbsolutePath();
            try {
                Object invoke = this.f85948d.invoke(this.f85947c, absolutePath);
                aqfd aqfd = new aqfd();
                aqfd.f85941b = this.f85954j.getInt(invoke);
                aqfd.f85940a = this.f85953i.getInt(invoke);
                aqfd.f85942c = this.f85952h.getInt(invoke);
                Field field = this.f85955k;
                if (field != null) {
                    aqfd.f85943d = field.getLong(invoke);
                }
                String str = null;
                str = (String) Class.forName("android.os.SELinux").getMethod("getFileContext", String.class).invoke(null, absolutePath);
                aqfd.f85944e = str;
                return aqfd;
            } catch (InvocationTargetException e) {
            } catch (IllegalAccessException | IllegalArgumentException e2) {
                e = e2;
                throw new aqfe(e);
            }
        } else {
            throw new aqfe();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo47817b(File file) {
        if (this.f85946b) {
            String absolutePath = file.getAbsolutePath();
            try {
                int i = this.f85952h.getInt(this.f85948d.invoke(this.f85947c, absolutePath));
                try {
                    return ((Boolean) this.f85949e.invoke(null, Integer.valueOf(i))).booleanValue();
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                    throw new aqfe(e);
                }
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                throw new aqfe(e2);
            }
        } else {
            throw new aqfe();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo47818c(File file) {
        if (!this.f85946b || this.f85950f == null) {
            throw new aqfe();
        }
        String absolutePath = file.getAbsolutePath();
        try {
            return (String) this.f85950f.invoke(this.f85947c, absolutePath);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw new aqfe(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo47816a(String str) {
        if (this.f85946b) {
            try {
                return ((Boolean) this.f85951g.invoke(this.f85947c, str, Integer.valueOf(this.f85956l))).booleanValue();
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                throw new aqfe(e);
            }
        } else {
            throw new aqfe();
        }
    }
}
