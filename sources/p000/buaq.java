package p000;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.util.Set;

/* renamed from: buaq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class buaq extends buae implements Set {

    /* renamed from: c */
    protected buav f153164c;

    /* renamed from: d */
    protected buas f153165d;

    /* renamed from: a */
    public static void m119173a(buaq buaq, ByteBuffer byteBuffer) {
        buaq.f153164c = new buaw(buaq.f153165d, byteBuffer).mo72610a();
        if (buar.m119185a(byteBuffer, buaq.mo72491b())) {
            buaq.mo72486a(byteBuffer);
            return;
        }
        throw new IllegalArgumentException("The read checksum is not equal to the calculated checksum.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo72486a(ByteBuffer byteBuffer);

    /* renamed from: a */
    public abstract boolean mo72489a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract byte mo72491b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo72494b(ByteBuffer byteBuffer);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo72495c();

    /* renamed from: c */
    public void mo72527c(ByteBuffer byteBuffer) {
        buav buav = this.f153164c;
        if (byteBuffer != null) {
            int b = buav.mo72591b();
            if (byteBuffer.position() + b <= byteBuffer.limit()) {
                int i = b - 12;
                byteBuffer.putInt(i);
                byteBuffer.position(byteBuffer.position() + 8);
                byteBuffer.putInt(buav.f153174a);
                byteBuffer.putInt(buav.f153175b);
                byteBuffer.putFloat(buav.f153176c);
                byteBuffer.putInt(buav.f153177d);
                byteBuffer.putInt(buav.f153178e);
                byteBuffer.putInt(buav.f153179f);
                byteBuffer.putInt(buav.f153180g);
                byteBuffer.putInt(buav.f153181h);
                byteBuffer.putInt(buav.f153182i);
                buav.mo72593b(byteBuffer);
                buar.m119184a(byteBuffer, (byte) 1, i);
                int c = mo72495c() + 12;
                if (byteBuffer.position() + c <= byteBuffer.limit()) {
                    int i2 = c - 12;
                    byteBuffer.putInt(i2);
                    byteBuffer.position(byteBuffer.position() + 8);
                    mo72494b(byteBuffer);
                    buar.m119184a(byteBuffer, mo72491b(), i2);
                    return;
                }
                throw new BufferOverflowException();
            }
            throw new BufferOverflowException();
        }
        throw new NullPointerException("Byte buffer cannot be null.");
    }

    public final void clear() {
        this.f153164c.mo72588a();
    }

    public boolean contains(Object obj) {
        return mo72489a(obj);
    }

    /* renamed from: d */
    public abstract buap iterator();

    /* renamed from: e */
    public /* bridge */ /* synthetic */ buaf mo72498e() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Set) {
            return super.equals(obj);
        }
        return false;
    }

    /* renamed from: g */
    public final int mo72583g() {
        return this.f153164c.f153174a;
    }

    /* renamed from: h */
    public final int mo72584h() {
        return mo72495c() + 12 + this.f153164c.mo72591b();
    }

    public final int size() {
        return this.f153164c.f153180g;
    }
}
