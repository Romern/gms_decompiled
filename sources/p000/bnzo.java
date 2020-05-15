package p000;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* renamed from: bnzo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
enum bnzo implements bnzm {
    UNSAFE_LITTLE_ENDIAN,
    UNSAFE_BIG_ENDIAN;
    

    /* renamed from: c */
    private static final Unsafe f132406c;

    /* renamed from: d */
    private static final int f132407d;

    static {
        Unsafe a = m110911a();
        f132406c = a;
        f132407d = a.arrayBaseOffset(byte[].class);
        if (f132406c.arrayIndexScale(byte[].class) != 1) {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    private static Unsafe m110911a() {
        try {
            return Unsafe.getUnsafe();
        } catch (SecurityException e) {
            try {
                return (Unsafe) AccessController.doPrivileged(new bnzn());
            } catch (PrivilegedActionException e2) {
                throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
            }
        }
    }

    /* renamed from: b */
    public static final long m110912b(byte[] bArr, int i) {
        return f132406c.getLong(bArr, ((long) i) + ((long) f132407d));
    }

    /* renamed from: c */
    public static final long m110913c(byte[] bArr, int i) {
        return Long.reverseBytes(f132406c.getLong(bArr, ((long) i) + ((long) f132407d)));
    }

    /* renamed from: a */
    public final /* synthetic */ long mo68750a(byte[] bArr, int i) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return m110912b(bArr, i);
        }
        if (ordinal == 1) {
            return m110913c(bArr, i);
        }
        throw null;
    }
}
