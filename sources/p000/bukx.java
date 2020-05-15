package p000;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

/* renamed from: bukx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bukx extends buan {

    /* renamed from: a */
    public transient short f154111a = 0;

    /* renamed from: b */
    public short[] f154112b;

    /* renamed from: e */
    public long[] f154113e;

    /* renamed from: f */
    public int[] f154114f;

    /* renamed from: g */
    public long[] f154115g;

    /* renamed from: h */
    private bukv f154116h;

    public bukx() {
        this.f153156c = new bukw(this);
    }

    /* renamed from: a */
    public final bukv entrySet() {
        if (this.f154116h == null) {
            this.f154116h = new bukv(this);
        }
        return this.f154116h;
    }

    /* renamed from: b */
    public final short mo72804b() {
        short s = this.f154111a;
        while (true) {
            s = (short) (s + 1);
            if (s != 0 && !((buks) this.f153157d).mo72795b(s)) {
                return s;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final byte mo72515c() {
        return 2;
    }

    @Deprecated
    public final boolean containsKey(Object obj) {
        throw new UnsupportedOperationException("Inherited containsKey is not supported.");
    }

    @Deprecated
    public final boolean containsValue(Object obj) {
        throw new UnsupportedOperationException("Inherited containsValue is not supported.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo72516d() {
        int length = this.f154112b.length;
        return length + length + ((this.f154113e.length + this.f154115g.length) * 8) + (this.f154114f.length * 4);
    }

    /* renamed from: f */
    public final buam values() {
        throw new UnsupportedOperationException("Inherited values is not supported.");
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        throw new UnsupportedOperationException("Inherited get is not supported.");
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        Short sh = (Short) obj;
        Long l = (Long) obj2;
        throw new UnsupportedOperationException("Inherited put is not supported.");
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        throw new UnsupportedOperationException("Inherited remove is not supported.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo72514b(ByteBuffer byteBuffer) {
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        asShortBuffer.put(this.f154112b);
        int position = byteBuffer.position();
        int position2 = asShortBuffer.position();
        byteBuffer.position(position + position2 + position2);
        LongBuffer asLongBuffer = byteBuffer.asLongBuffer();
        asLongBuffer.put(this.f154113e);
        asLongBuffer.put(this.f154115g);
        byteBuffer.position(byteBuffer.position() + (asLongBuffer.position() * 8));
        IntBuffer asIntBuffer = byteBuffer.asIntBuffer();
        asIntBuffer.put(this.f154114f);
        byteBuffer.position(byteBuffer.position() + (asIntBuffer.position() * 4));
    }

    @Deprecated
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo72511a(Object obj, boolean z) {
        throw new UnsupportedOperationException("Inherited get is not supported.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo72512a(ByteBuffer byteBuffer) {
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        asShortBuffer.get(this.f154112b);
        int position = byteBuffer.position();
        int position2 = asShortBuffer.position();
        byteBuffer.position(position + position2 + position2);
        LongBuffer asLongBuffer = byteBuffer.asLongBuffer();
        asLongBuffer.get(this.f154113e);
        asLongBuffer.get(this.f154115g);
        byteBuffer.position(byteBuffer.position() + (asLongBuffer.position() * 8));
        IntBuffer asIntBuffer = byteBuffer.asIntBuffer();
        asIntBuffer.get(this.f154114f);
        byteBuffer.position(byteBuffer.position() + (asIntBuffer.position() * 4));
    }

    @Deprecated
    /* renamed from: b */
    public final boolean mo72562b(Object obj) {
        throw new UnsupportedOperationException("Inherited containsValue is not supported.");
    }

    /* renamed from: a */
    public final void mo72802a(short s, short s2, long j, int i, long j2) {
        int a = ((buks) this.f153157d).mo72792a(s);
        if (a < 0) {
            int i2 = a ^ -1;
            this.f154112b[i2] = s2;
            this.f154113e[i2] = j;
            this.f154114f[i2] = i;
            this.f154115g[i2] = j2;
            return;
        }
        this.f154112b[a] = s2;
        this.f154113e[a] = j;
        this.f154114f[a] = i;
        this.f154115g[a] = j2;
    }

    @Deprecated
    /* renamed from: a */
    public final boolean mo72561a(Object obj) {
        throw new UnsupportedOperationException("Inherited containsKey is not supported.");
    }

    /* renamed from: a */
    public final boolean mo72803a(short s) {
        return ((buks) this.f153157d).mo72795b(s);
    }
}
