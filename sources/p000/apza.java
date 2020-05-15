package p000;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/* renamed from: apza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apza {

    /* renamed from: a */
    public static final String[] f85208a = {"/system/xbin", "/system/bin", "/system/sd/xbin", "/system/bin/failsafe", "/data/local", "/system", "/system/bin/.ext", "/data/local/xbin", "/data/local/bin"};

    /* renamed from: b */
    public final Object f85209b;

    /* renamed from: c */
    public final Method f85210c;

    /* renamed from: d */
    public final Field f85211d;

    /* renamed from: e */
    public final Field f85212e;

    /* renamed from: f */
    public final int f85213f;

    /* renamed from: g */
    public final boolean f85214g;

    /* renamed from: h */
    public int f85215h = 0;

    /* renamed from: i */
    public final Pattern f85216i = Pattern.compile(".*avc: denied \\{ getattr \\}.*for path=\"(.*)\" dev=.*su_exec.*");

    public apza() {
        String str;
        Field field;
        Object obj;
        Field field2;
        Method method;
        int i = 0;
        try {
            Class.forName("libcore.io.StructStat");
            str = "libcore.io";
        } catch (ClassNotFoundException e) {
            str = "android.system";
        }
        boolean z = true;
        Object obj2 = null;
        try {
            Class<?> cls = Class.forName(str.concat(".StructStat"));
            Class<?> cls2 = Class.forName(str.concat(".OsConstants"));
            Class<?> cls3 = Class.forName(str.concat(".Os"));
            obj = Class.forName("libcore.io.Libcore").getField("os").get(null);
            try {
                method = cls3.getMethod("lstat", String.class);
                try {
                    field = cls.getField("st_mode");
                } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException e2) {
                    field2 = null;
                    field = field2;
                    obj2 = obj;
                    obj = obj2;
                    z = false;
                    this.f85209b = obj;
                    this.f85210c = method;
                    this.f85211d = field;
                    this.f85212e = field2;
                    this.f85213f = i;
                    this.f85214g = z;
                }
                try {
                    field2 = cls.getField("st_uid");
                } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException e3) {
                    field2 = null;
                    obj2 = obj;
                    obj = obj2;
                    z = false;
                    this.f85209b = obj;
                    this.f85210c = method;
                    this.f85211d = field;
                    this.f85212e = field2;
                    this.f85213f = i;
                    this.f85214g = z;
                }
                try {
                    i = cls2.getField("S_ISUID").getInt(null);
                } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException e4) {
                    obj2 = obj;
                    obj = obj2;
                    z = false;
                    this.f85209b = obj;
                    this.f85210c = method;
                    this.f85211d = field;
                    this.f85212e = field2;
                    this.f85213f = i;
                    this.f85214g = z;
                }
            } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException e5) {
                method = null;
                field2 = null;
                field = field2;
                obj2 = obj;
                obj = obj2;
                z = false;
                this.f85209b = obj;
                this.f85210c = method;
                this.f85211d = field;
                this.f85212e = field2;
                this.f85213f = i;
                this.f85214g = z;
            }
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException e6) {
            method = null;
            field2 = null;
            field = null;
            obj = obj2;
            z = false;
            this.f85209b = obj;
            this.f85210c = method;
            this.f85211d = field;
            this.f85212e = field2;
            this.f85213f = i;
            this.f85214g = z;
        }
        this.f85209b = obj;
        this.f85210c = method;
        this.f85211d = field;
        this.f85212e = field2;
        this.f85213f = i;
        this.f85214g = z;
    }
}
