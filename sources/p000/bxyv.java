package p000;

import sun.misc.Unsafe;

/* renamed from: bxyv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxyv extends bxyw {
    public bxyv(Unsafe unsafe) {
        super(unsafe);
    }

    /* renamed from: a */
    public final byte mo74306a(long j) {
        return this.f165114a.getByte(j);
    }

    /* renamed from: b */
    public final boolean mo74315b(Object obj, long j) {
        return this.f165114a.getBoolean(obj, j);
    }

    /* renamed from: c */
    public final float mo74316c(Object obj, long j) {
        return this.f165114a.getFloat(obj, j);
    }

    /* renamed from: d */
    public final double mo74317d(Object obj, long j) {
        return this.f165114a.getDouble(obj, j);
    }

    /* renamed from: a */
    public final byte mo74307a(Object obj, long j) {
        return this.f165114a.getByte(obj, j);
    }

    /* renamed from: a */
    public final void mo74308a(long j, byte b) {
        this.f165114a.putByte(j, b);
    }

    /* renamed from: a */
    public final void mo74309a(long j, byte[] bArr, long j2) {
        this.f165114a.copyMemory((Object) null, j, bArr, bxyx.f165118d, j2);
    }

    /* renamed from: a */
    public final void mo74310a(Object obj, long j, byte b) {
        this.f165114a.putByte(obj, j, b);
    }

    /* renamed from: a */
    public final void mo74311a(Object obj, long j, double d) {
        this.f165114a.putDouble(obj, j, d);
    }

    /* renamed from: a */
    public final void mo74312a(Object obj, long j, float f) {
        this.f165114a.putFloat(obj, j, f);
    }

    /* renamed from: a */
    public final void mo74313a(Object obj, long j, boolean z) {
        this.f165114a.putBoolean(obj, j, z);
    }

    /* renamed from: a */
    public final void mo74314a(byte[] bArr, long j, long j2, long j3) {
        this.f165114a.copyMemory(bArr, bxyx.f165118d + j, (Object) null, j2, j3);
    }
}
