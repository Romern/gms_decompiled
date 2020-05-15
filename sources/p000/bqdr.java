package p000;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* renamed from: bqdr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqdr extends bqdg {

    /* renamed from: a */
    static final Unsafe f140516a;

    /* renamed from: b */
    static final long f140517b;

    /* renamed from: c */
    static final long f140518c;

    /* renamed from: d */
    static final long f140519d;

    /* renamed from: e */
    static final long f140520e;

    /* renamed from: f */
    static final long f140521f;

    static {
        Unsafe unsafe;
        try {
            unsafe = Unsafe.getUnsafe();
        } catch (SecurityException e) {
            try {
                unsafe = (Unsafe) AccessController.doPrivileged(new bqdq());
            } catch (PrivilegedActionException e2) {
                throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
            }
        }
        try {
            f140518c = unsafe.objectFieldOffset(bqdt.class.getDeclaredField("waiters"));
            f140517b = unsafe.objectFieldOffset(bqdt.class.getDeclaredField("listeners"));
            f140519d = unsafe.objectFieldOffset(bqdt.class.getDeclaredField("value"));
            f140520e = unsafe.objectFieldOffset(bqds.class.getDeclaredField("thread"));
            f140521f = unsafe.objectFieldOffset(bqds.class.getDeclaredField("next"));
            f140516a = unsafe;
        } catch (Exception e3) {
            bmzo.m108686a(e3);
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: a */
    public final void mo69126a(bqds bqds, bqds bqds2) {
        f140516a.putObject(bqds, f140521f, bqds2);
    }

    /* renamed from: a */
    public final void mo69127a(bqds bqds, Thread thread) {
        f140516a.putObject(bqds, f140520e, thread);
    }

    /* renamed from: a */
    public final boolean mo69128a(bqdt bqdt, bqdk bqdk, bqdk bqdk2) {
        return f140516a.compareAndSwapObject(bqdt, f140517b, bqdk, bqdk2);
    }

    /* renamed from: a */
    public final boolean mo69129a(bqdt bqdt, bqds bqds, bqds bqds2) {
        return f140516a.compareAndSwapObject(bqdt, f140518c, bqds, bqds2);
    }

    /* renamed from: a */
    public final boolean mo69130a(bqdt bqdt, Object obj, Object obj2) {
        return f140516a.compareAndSwapObject(bqdt, f140519d, obj, obj2);
    }
}
