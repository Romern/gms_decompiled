package p000;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

/* renamed from: bulc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bulc extends buan {

    /* renamed from: a */
    public transient short f154125a = 0;

    /* renamed from: b */
    public short[] f154126b;

    /* renamed from: e */
    public long[] f154127e;

    /* renamed from: f */
    public int[] f154128f;

    /* renamed from: g */
    public int[] f154129g;

    /* renamed from: h */
    public long[] f154130h;

    /* renamed from: i */
    private bula f154131i;

    public bulc() {
        this.f153156c = new bulb(this);
    }

    /* renamed from: a */
    public final bula entrySet() {
        if (this.f154131i == null) {
            this.f154131i = new bula(this);
        }
        return this.f154131i;
    }

    /* renamed from: b */
    public final short mo72813b() {
        short s = this.f154125a;
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
        return 3;
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
        int length = this.f154126b.length;
        return length + length + ((this.f154127e.length + this.f154130h.length) * 8) + (this.f154128f.length * 4) + (this.f154129g.length * 4);
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
        asShortBuffer.put(this.f154126b);
        int position = byteBuffer.position();
        int position2 = asShortBuffer.position();
        byteBuffer.position(position + position2 + position2);
        LongBuffer asLongBuffer = byteBuffer.asLongBuffer();
        asLongBuffer.put(this.f154127e);
        asLongBuffer.put(this.f154130h);
        byteBuffer.position(byteBuffer.position() + (asLongBuffer.position() * 8));
        IntBuffer asIntBuffer = byteBuffer.asIntBuffer();
        asIntBuffer.put(this.f154128f);
        asIntBuffer.put(this.f154129g);
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
        asShortBuffer.get(this.f154126b);
        int position = byteBuffer.position();
        int position2 = asShortBuffer.position();
        byteBuffer.position(position + position2 + position2);
        LongBuffer asLongBuffer = byteBuffer.asLongBuffer();
        asLongBuffer.get(this.f154127e);
        asLongBuffer.get(this.f154130h);
        byteBuffer.position(byteBuffer.position() + (asLongBuffer.position() * 8));
        IntBuffer asIntBuffer = byteBuffer.asIntBuffer();
        asIntBuffer.get(this.f154128f);
        asIntBuffer.get(this.f154129g);
        byteBuffer.position(byteBuffer.position() + (asIntBuffer.position() * 4));
    }

    @Deprecated
    /* renamed from: b */
    public final boolean mo72562b(Object obj) {
        throw new UnsupportedOperationException("Inherited containsValue is not supported.");
    }

    /* renamed from: a */
    public final void mo72811a(short s, short s2, long j, int i, int i2, long j2) {
        int a = ((buks) this.f153157d).mo72792a(s);
        if (a < 0) {
            int i3 = a ^ -1;
            this.f154126b[i3] = s2;
            this.f154127e[i3] = j;
            this.f154128f[i3] = i;
            this.f154129g[i3] = i2;
            this.f154130h[i3] = j2;
            return;
        }
        this.f154126b[a] = s2;
        this.f154127e[a] = j;
        this.f154128f[a] = i;
        this.f154129g[a] = i2;
        this.f154130h[a] = j2;
    }

    @Deprecated
    /* renamed from: a */
    public final boolean mo72561a(Object obj) {
        throw new UnsupportedOperationException("Inherited containsKey is not supported.");
    }

    /* renamed from: a */
    public final boolean mo72812a(short s) {
        return ((buks) this.f153157d).mo72795b(s);
    }
}
