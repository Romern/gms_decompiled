package p000;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: bxyx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxyx {

    /* renamed from: a */
    public static final bxyw f165115a;

    /* renamed from: b */
    public static final boolean f165116b;

    /* renamed from: c */
    public static final boolean f165117c;

    /* renamed from: d */
    static final long f165118d = ((long) m124509b(byte[].class));

    /* renamed from: e */
    static final boolean f165119e = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    /* renamed from: f */
    private static final Logger f165120f = Logger.getLogger(bxyx.class.getName());

    /* renamed from: g */
    private static final Unsafe f165121g = m124498a();

    /* renamed from: h */
    private static final Class f165122h = bxtd.f164761a;

    /* renamed from: i */
    private static final boolean f165123i = m124513c(Long.TYPE);

    /* renamed from: j */
    private static final boolean f165124j = m124513c(Integer.TYPE);

    /* renamed from: k */
    private static final long f165125k;

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0165 A[SYNTHETIC, Splitter:B:37:0x0165] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0319  */
    static {
        Class cls;
        Class cls2;
        boolean z;
        Unsafe unsafe;
        boolean z2;
        Field b;
        bxyw bxyw;
        bxyw bxyw2 = null;
        if (f165121g != null) {
            if (!bxtd.m123131a()) {
                bxyw2 = new bxyv(f165121g);
            } else if (f165123i) {
                bxyw2 = new bxyu(f165121g);
            } else if (f165124j) {
                bxyw2 = new bxyt(f165121g);
            }
        }
        f165115a = bxyw2;
        Unsafe unsafe2 = f165121g;
        Class cls3 = double[].class;
        if (unsafe2 != null) {
            try {
                Class<?> cls4 = unsafe2.getClass();
                cls2 = float[].class;
                try {
                    cls4.getMethod("objectFieldOffset", Field.class);
                    cls4.getMethod("getLong", Object.class, Long.TYPE);
                    if (m124511b() != null) {
                        if (!bxtd.m123131a()) {
                            cls4.getMethod("getByte", Long.TYPE);
                            Class[] clsArr = new Class[2];
                            clsArr[0] = Long.TYPE;
                            cls = long[].class;
                            try {
                                clsArr[1] = Byte.TYPE;
                                cls4.getMethod("putByte", clsArr);
                                cls4.getMethod("getInt", Long.TYPE);
                                cls4.getMethod("putInt", Long.TYPE, Integer.TYPE);
                                cls4.getMethod("getLong", Long.TYPE);
                                cls4.getMethod("putLong", Long.TYPE, Long.TYPE);
                                cls4.getMethod("copyMemory", Long.TYPE, Long.TYPE, Long.TYPE);
                                cls4.getMethod("copyMemory", Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE);
                                z = true;
                            } catch (Throwable th) {
                                th = th;
                                Logger logger = f165120f;
                                Level level = Level.WARNING;
                                String valueOf = String.valueOf(th);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
                                sb.append("platform method missing - proto runtime falling back to safer methods: ");
                                sb.append(valueOf);
                                logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
                                z = false;
                                f165116b = z;
                                unsafe = f165121g;
                                if (unsafe != null) {
                                }
                                f165117c = z2;
                                m124509b(boolean[].class);
                                m124516d(boolean[].class);
                                m124509b(int[].class);
                                m124516d(int[].class);
                                m124509b(cls);
                                m124516d(cls);
                                m124509b(cls2);
                                m124516d(cls2);
                                m124509b(cls3);
                                m124516d(cls3);
                                m124509b(Object[].class);
                                m124516d(Object[].class);
                                b = m124511b();
                                long j = -1;
                                j = bxyw.mo74319a(b);
                                f165125k = j;
                            }
                        } else {
                            cls = long[].class;
                            z = true;
                        }
                        f165116b = z;
                        unsafe = f165121g;
                        if (unsafe != null) {
                            try {
                                Class<?> cls5 = unsafe.getClass();
                                cls5.getMethod("objectFieldOffset", Field.class);
                                cls5.getMethod("arrayBaseOffset", Class.class);
                                cls5.getMethod("arrayIndexScale", Class.class);
                                cls5.getMethod("getInt", Object.class, Long.TYPE);
                                cls5.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
                                cls5.getMethod("getLong", Object.class, Long.TYPE);
                                cls5.getMethod("putLong", Object.class, Long.TYPE, Long.TYPE);
                                cls5.getMethod("getObject", Object.class, Long.TYPE);
                                cls5.getMethod("putObject", Object.class, Long.TYPE, Object.class);
                                if (!bxtd.m123131a()) {
                                    cls5.getMethod("getByte", Object.class, Long.TYPE);
                                    cls5.getMethod("putByte", Object.class, Long.TYPE, Byte.TYPE);
                                    cls5.getMethod("getBoolean", Object.class, Long.TYPE);
                                    cls5.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE);
                                    cls5.getMethod("getFloat", Object.class, Long.TYPE);
                                    cls5.getMethod("putFloat", Object.class, Long.TYPE, Float.TYPE);
                                    cls5.getMethod("getDouble", Object.class, Long.TYPE);
                                    Class[] clsArr2 = new Class[3];
                                    clsArr2[0] = Object.class;
                                    try {
                                        clsArr2[1] = Long.TYPE;
                                        clsArr2[2] = Double.TYPE;
                                        cls5.getMethod("putDouble", clsArr2);
                                        z2 = true;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        Logger logger2 = f165120f;
                                        Level level2 = Level.WARNING;
                                        String valueOf2 = String.valueOf(th);
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 71);
                                        sb2.append("platform method missing - proto runtime falling back to safer methods: ");
                                        sb2.append(valueOf2);
                                        logger2.logp(level2, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb2.toString());
                                        z2 = false;
                                        f165117c = z2;
                                        m124509b(boolean[].class);
                                        m124516d(boolean[].class);
                                        m124509b(int[].class);
                                        m124516d(int[].class);
                                        m124509b(cls);
                                        m124516d(cls);
                                        m124509b(cls2);
                                        m124516d(cls2);
                                        m124509b(cls3);
                                        m124516d(cls3);
                                        m124509b(Object[].class);
                                        m124516d(Object[].class);
                                        b = m124511b();
                                        long j2 = -1;
                                        j2 = bxyw.mo74319a(b);
                                        f165125k = j2;
                                    }
                                } else {
                                    z2 = true;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                Logger logger22 = f165120f;
                                Level level22 = Level.WARNING;
                                String valueOf22 = String.valueOf(th);
                                StringBuilder sb22 = new StringBuilder(String.valueOf(valueOf22).length() + 71);
                                sb22.append("platform method missing - proto runtime falling back to safer methods: ");
                                sb22.append(valueOf22);
                                logger22.logp(level22, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb22.toString());
                                z2 = false;
                                f165117c = z2;
                                m124509b(boolean[].class);
                                m124516d(boolean[].class);
                                m124509b(int[].class);
                                m124516d(int[].class);
                                m124509b(cls);
                                m124516d(cls);
                                m124509b(cls2);
                                m124516d(cls2);
                                m124509b(cls3);
                                m124516d(cls3);
                                m124509b(Object[].class);
                                m124516d(Object[].class);
                                b = m124511b();
                                long j22 = -1;
                                j22 = bxyw.mo74319a(b);
                                f165125k = j22;
                            }
                        } else {
                            z2 = false;
                        }
                        f165117c = z2;
                        m124509b(boolean[].class);
                        m124516d(boolean[].class);
                        m124509b(int[].class);
                        m124516d(int[].class);
                        m124509b(cls);
                        m124516d(cls);
                        m124509b(cls2);
                        m124516d(cls2);
                        m124509b(cls3);
                        m124516d(cls3);
                        m124509b(Object[].class);
                        m124516d(Object[].class);
                        b = m124511b();
                        long j222 = -1;
                        if (!(b == null || (bxyw = f165115a) == null)) {
                            j222 = bxyw.mo74319a(b);
                        }
                        f165125k = j222;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    cls = long[].class;
                    Logger logger3 = f165120f;
                    Level level3 = Level.WARNING;
                    String valueOf3 = String.valueOf(th);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 71);
                    sb3.append("platform method missing - proto runtime falling back to safer methods: ");
                    sb3.append(valueOf3);
                    logger3.logp(level3, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb3.toString());
                    z = false;
                    f165116b = z;
                    unsafe = f165121g;
                    if (unsafe != null) {
                    }
                    f165117c = z2;
                    m124509b(boolean[].class);
                    m124516d(boolean[].class);
                    m124509b(int[].class);
                    m124516d(int[].class);
                    m124509b(cls);
                    m124516d(cls);
                    m124509b(cls2);
                    m124516d(cls2);
                    m124509b(cls3);
                    m124516d(cls3);
                    m124509b(Object[].class);
                    m124516d(Object[].class);
                    b = m124511b();
                    long j2222 = -1;
                    j2222 = bxyw.mo74319a(b);
                    f165125k = j2222;
                }
            } catch (Throwable th5) {
                th = th5;
                cls2 = float[].class;
                cls = long[].class;
                Logger logger32 = f165120f;
                Level level32 = Level.WARNING;
                String valueOf32 = String.valueOf(th);
                StringBuilder sb32 = new StringBuilder(String.valueOf(valueOf32).length() + 71);
                sb32.append("platform method missing - proto runtime falling back to safer methods: ");
                sb32.append(valueOf32);
                logger32.logp(level32, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb32.toString());
                z = false;
                f165116b = z;
                unsafe = f165121g;
                if (unsafe != null) {
                }
                f165117c = z2;
                m124509b(boolean[].class);
                m124516d(boolean[].class);
                m124509b(int[].class);
                m124516d(int[].class);
                m124509b(cls);
                m124516d(cls);
                m124509b(cls2);
                m124516d(cls2);
                m124509b(cls3);
                m124516d(cls3);
                m124509b(Object[].class);
                m124516d(Object[].class);
                b = m124511b();
                long j22222 = -1;
                j22222 = bxyw.mo74319a(b);
                f165125k = j22222;
            }
        } else {
            cls2 = float[].class;
        }
        cls = long[].class;
        z = false;
        f165116b = z;
        unsafe = f165121g;
        if (unsafe != null) {
        }
        f165117c = z2;
        m124509b(boolean[].class);
        m124516d(boolean[].class);
        m124509b(int[].class);
        m124516d(int[].class);
        m124509b(cls);
        m124516d(cls);
        m124509b(cls2);
        m124516d(cls2);
        m124509b(cls3);
        m124516d(cls3);
        m124509b(Object[].class);
        m124516d(Object[].class);
        b = m124511b();
        long j222222 = -1;
        j222222 = bxyw.mo74319a(b);
        f165125k = j222222;
    }

    private bxyx() {
    }

    /* renamed from: a */
    static byte m124492a(long j) {
        return f165115a.mo74306a(j);
    }

    /* renamed from: b */
    private static int m124509b(Class cls) {
        if (f165117c) {
            return f165115a.mo74318a(cls);
        }
        return -1;
    }

    /* renamed from: c */
    private static boolean m124513c(Class cls) {
        if (bxtd.m123131a()) {
            try {
                Class cls2 = f165122h;
                cls2.getMethod("peekLong", cls, Boolean.TYPE);
                cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
                cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
                cls2.getMethod("peekInt", cls, Boolean.TYPE);
                cls2.getMethod("pokeByte", cls, Byte.TYPE);
                cls2.getMethod("peekByte", cls);
                cls2.getMethod("pokeByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
                cls2.getMethod("peekByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
                return true;
            } catch (Throwable th) {
            }
        }
        return false;
    }

    /* renamed from: d */
    static float m124515d(Object obj, long j) {
        return f165115a.mo74316c(obj, j);
    }

    /* renamed from: e */
    static double m124517e(Object obj, long j) {
        return f165115a.mo74317d(obj, j);
    }

    /* renamed from: f */
    static Object m124518f(Object obj, long j) {
        return f165115a.mo74326g(obj, j);
    }

    /* renamed from: g */
    public static byte m124519g(Object obj, long j) {
        return (byte) ((m124494a(obj, -4 & j) >>> ((int) (((j ^ -1) & 3) << 3))) & 255);
    }

    /* renamed from: h */
    public static byte m124520h(Object obj, long j) {
        return (byte) ((m124494a(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* renamed from: i */
    public static boolean m124521i(Object obj, long j) {
        return m124519g(obj, j) != 0;
    }

    /* renamed from: j */
    public static boolean m124522j(Object obj, long j) {
        return m124520h(obj, j) != 0;
    }

    /* renamed from: a */
    static byte m124493a(byte[] bArr, long j) {
        return f165115a.mo74307a(bArr, f165118d + j);
    }

    /* renamed from: b */
    static long m124510b(Object obj, long j) {
        return f165115a.mo74325f(obj, j);
    }

    /* renamed from: d */
    private static void m124516d(Class cls) {
        if (f165117c) {
            f165115a.mo74323b(cls);
        }
    }

    /* renamed from: a */
    static int m124494a(Object obj, long j) {
        return f165115a.mo74324e(obj, j);
    }

    /* renamed from: b */
    private static Field m124511b() {
        Field a;
        if (bxtd.m123131a() && (a = m124497a(Buffer.class, "effectiveDirectAddress")) != null) {
            return a;
        }
        Field a2 = m124497a(Buffer.class, "address");
        if (a2 == null || a2.getType() != Long.TYPE) {
            return null;
        }
        return a2;
    }

    /* renamed from: c */
    static boolean m124514c(Object obj, long j) {
        return f165115a.mo74315b(obj, j);
    }

    /* renamed from: a */
    static long m124495a(ByteBuffer byteBuffer) {
        return f165115a.mo74325f(byteBuffer, f165125k);
    }

    /* renamed from: a */
    static Object m124496a(Class cls) {
        try {
            return f165121g.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: b */
    public static void m124512b(Object obj, long j, byte b) {
        int i = (((int) j) & 3) << 3;
        long j2 = j & -4;
        m124504a(obj, j2, ((b & 255) << i) | (m124494a(obj, j2) & ((255 << i) ^ -1)));
    }

    /* renamed from: a */
    private static Field m124497a(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: a */
    static Unsafe m124498a() {
        try {
            return (Unsafe) AccessController.doPrivileged(new bxys());
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: a */
    static void m124499a(long j, byte b) {
        f165115a.mo74308a(j, b);
    }

    /* renamed from: a */
    static void m124500a(long j, byte[] bArr, long j2) {
        f165115a.mo74309a(j, bArr, j2);
    }

    /* renamed from: a */
    public static void m124501a(Object obj, long j, byte b) {
        int i = ((((int) j) ^ -1) & 3) << 3;
        long j2 = j & -4;
        m124504a(obj, j2, ((b & 255) << i) | (m124494a(obj, j2) & ((255 << i) ^ -1)));
    }

    /* renamed from: a */
    static void m124502a(Object obj, long j, double d) {
        f165115a.mo74311a(obj, j, d);
    }

    /* renamed from: a */
    static void m124503a(Object obj, long j, float f) {
        f165115a.mo74312a(obj, j, f);
    }

    /* renamed from: a */
    static void m124504a(Object obj, long j, int i) {
        f165115a.mo74320a(obj, j, i);
    }

    /* renamed from: a */
    static void m124505a(Object obj, long j, long j2) {
        f165115a.mo74321a(obj, j, j2);
    }

    /* renamed from: a */
    static void m124506a(Object obj, long j, Object obj2) {
        f165115a.mo74322a(obj, j, obj2);
    }

    /* renamed from: a */
    static void m124507a(Object obj, long j, boolean z) {
        f165115a.mo74313a(obj, j, z);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bxyw.a(java.lang.Object, long, byte):void
     arg types: [byte[], long, byte]
     candidates:
      bxyw.a(long, byte[], long):void
      bxyw.a(java.lang.Object, long, double):void
      bxyw.a(java.lang.Object, long, float):void
      bxyw.a(java.lang.Object, long, int):void
      bxyw.a(java.lang.Object, long, long):void
      bxyw.a(java.lang.Object, long, java.lang.Object):void
      bxyw.a(java.lang.Object, long, boolean):void
      bxyw.a(java.lang.Object, long, byte):void */
    /* renamed from: a */
    static void m124508a(byte[] bArr, long j, byte b) {
        f165115a.mo74310a((Object) bArr, f165118d + j, b);
    }
}
