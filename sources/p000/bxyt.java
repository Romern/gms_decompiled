package p000;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: bxyt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxyt extends bxyw {
    public bxyt(Unsafe unsafe) {
        super(unsafe);
    }

    /* renamed from: a */
    public final byte mo74306a(long j) {
        return Memory.peekByte((int) j);
    }

    /* renamed from: b */
    public final boolean mo74315b(Object obj, long j) {
        return bxyx.f165119e ? bxyx.m124521i(obj, j) : bxyx.m124522j(obj, j);
    }

    /* renamed from: c */
    public final float mo74316c(Object obj, long j) {
        return Float.intBitsToFloat(mo74324e(obj, j));
    }

    /* renamed from: d */
    public final double mo74317d(Object obj, long j) {
        return Double.longBitsToDouble(mo74325f(obj, j));
    }

    /* renamed from: a */
    public final byte mo74307a(Object obj, long j) {
        return bxyx.f165119e ? bxyx.m124519g(obj, j) : bxyx.m124520h(obj, j);
    }

    /* renamed from: a */
    public final void mo74308a(long j, byte b) {
        Memory.pokeByte((int) j, b);
    }

    /* renamed from: a */
    public final void mo74309a(long j, byte[] bArr, long j2) {
        Memory.peekByteArray((int) j, bArr, 0, (int) j2);
    }

    /* renamed from: a */
    public final void mo74310a(Object obj, long j, byte b) {
        if (bxyx.f165119e) {
            bxyx.m124501a(obj, j, b);
        } else {
            bxyx.m124512b(obj, j, b);
        }
    }

    /* renamed from: a */
    public final void mo74311a(Object obj, long j, double d) {
        mo74321a(obj, j, Double.doubleToLongBits(d));
    }

    /* renamed from: a */
    public final void mo74312a(Object obj, long j, float f) {
        mo74320a(obj, j, Float.floatToIntBits(f));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bxyx.a(java.lang.Object, long, byte):void
     arg types: [java.lang.Object, long, boolean]
     candidates:
      bxyx.a(long, byte[], long):void
      bxyx.a(java.lang.Object, long, double):void
      bxyx.a(java.lang.Object, long, float):void
      bxyx.a(java.lang.Object, long, int):void
      bxyx.a(java.lang.Object, long, long):void
      bxyx.a(java.lang.Object, long, java.lang.Object):void
      bxyx.a(java.lang.Object, long, boolean):void
      bxyx.a(byte[], long, byte):void
      bxyx.a(java.lang.Object, long, byte):void */
    /* renamed from: a */
    public final void mo74313a(Object obj, long j, boolean z) {
        if (bxyx.f165119e) {
            bxyx.m124501a(obj, j, (byte) z);
        } else {
            bxyx.m124512b(obj, j, z ? (byte) 1 : 0);
        }
    }

    /* renamed from: a */
    public final void mo74314a(byte[] bArr, long j, long j2, long j3) {
        Memory.pokeByteArray((int) j2, bArr, (int) j, (int) j3);
    }
}
