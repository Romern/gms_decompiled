package p000;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: bxyw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bxyw {

    /* renamed from: a */
    final Unsafe f165114a;

    public bxyw(Unsafe unsafe) {
        this.f165114a = unsafe;
    }

    /* renamed from: a */
    public abstract byte mo74306a(long j);

    /* renamed from: a */
    public abstract byte mo74307a(Object obj, long j);

    /* renamed from: a */
    public final int mo74318a(Class cls) {
        return this.f165114a.arrayBaseOffset(cls);
    }

    /* renamed from: a */
    public abstract void mo74308a(long j, byte b);

    /* renamed from: a */
    public abstract void mo74309a(long j, byte[] bArr, long j2);

    /* renamed from: a */
    public abstract void mo74310a(Object obj, long j, byte b);

    /* renamed from: a */
    public abstract void mo74311a(Object obj, long j, double d);

    /* renamed from: a */
    public abstract void mo74312a(Object obj, long j, float f);

    /* renamed from: a */
    public abstract void mo74313a(Object obj, long j, boolean z);

    /* renamed from: a */
    public abstract void mo74314a(byte[] bArr, long j, long j2, long j3);

    /* renamed from: b */
    public final void mo74323b(Class cls) {
        this.f165114a.arrayIndexScale(cls);
    }

    /* renamed from: b */
    public abstract boolean mo74315b(Object obj, long j);

    /* renamed from: c */
    public abstract float mo74316c(Object obj, long j);

    /* renamed from: d */
    public abstract double mo74317d(Object obj, long j);

    /* renamed from: e */
    public final int mo74324e(Object obj, long j) {
        return this.f165114a.getInt(obj, j);
    }

    /* renamed from: f */
    public final long mo74325f(Object obj, long j) {
        return this.f165114a.getLong(obj, j);
    }

    /* renamed from: g */
    public final Object mo74326g(Object obj, long j) {
        return this.f165114a.getObject(obj, j);
    }

    /* renamed from: a */
    public final long mo74319a(Field field) {
        return this.f165114a.objectFieldOffset(field);
    }

    /* renamed from: a */
    public final void mo74320a(Object obj, long j, int i) {
        this.f165114a.putInt(obj, j, i);
    }

    /* renamed from: a */
    public final void mo74321a(Object obj, long j, long j2) {
        this.f165114a.putLong(obj, j, j2);
    }

    /* renamed from: a */
    public final void mo74322a(Object obj, long j, Object obj2) {
        this.f165114a.putObject(obj, j, obj2);
    }
}
