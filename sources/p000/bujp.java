package p000;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

/* renamed from: bujp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bujp extends buan {

    /* renamed from: a */
    public int[] f154040a;

    /* renamed from: b */
    public byte[] f154041b;

    /* renamed from: e */
    public byte[] f154042e;

    /* renamed from: f */
    public short[] f154043f;

    /* renamed from: g */
    public short[] f154044g;

    /* renamed from: h */
    private bujn f154045h;

    public bujp() {
        this.f153156c = new bujo(this);
    }

    /* renamed from: a */
    public final int mo72732a(long j, boolean z) {
        return ((bujt) this.f153157d).mo72743b(j, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo72514b(ByteBuffer byteBuffer) {
        IntBuffer asIntBuffer = byteBuffer.asIntBuffer();
        asIntBuffer.put(this.f154040a);
        byteBuffer.position(byteBuffer.position() + (asIntBuffer.position() * 4));
        byteBuffer.put(this.f154041b);
        byteBuffer.put(this.f154042e);
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        asShortBuffer.put(this.f154043f);
        asShortBuffer.put(this.f154044g);
        int position = byteBuffer.position();
        int position2 = asShortBuffer.position();
        byteBuffer.position(position + position2 + position2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final byte mo72515c() {
        return 4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo72516d() {
        int length = this.f154041b.length;
        int length2 = this.f154042e.length;
        int length3 = this.f154040a.length;
        int length4 = this.f154043f.length;
        int length5 = this.f154044g.length;
        return length + length2 + (length3 * 4) + length4 + length4 + length5 + length5;
    }

    @Deprecated
    /* renamed from: f */
    public final buam values() {
        throw new UnsupportedOperationException("Inherited value collections are not supported.");
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        Long l = (Long) obj;
        Long l2 = (Long) obj2;
        throw new UnsupportedOperationException("Inherited puts are not supported.");
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        throw new UnsupportedOperationException("Inherited removes are not supported.");
    }

    /* renamed from: a */
    public final bujn entrySet() {
        if (this.f154045h == null) {
            this.f154045h = new bujn(this);
        }
        return this.f154045h;
    }

    @Deprecated
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo72511a(Object obj, boolean z) {
        throw new UnsupportedOperationException("Inherited gets are not supported.");
    }

    /* renamed from: a */
    public final void mo72734a(long j, short s, int i, byte b, byte b2, short s2, short s3) {
        int b3 = ((bujt) this.f153157d).mo72742b(j, s);
        if (b3 < 0) {
            b3 ^= -1;
        }
        this.f154040a[b3] = i;
        this.f154041b[b3] = b;
        this.f154042e[b3] = b2;
        this.f154043f[b3] = s2;
        this.f154044g[b3] = s3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo72512a(ByteBuffer byteBuffer) {
        IntBuffer asIntBuffer = byteBuffer.asIntBuffer();
        asIntBuffer.get(this.f154040a);
        byteBuffer.position(byteBuffer.position() + (asIntBuffer.position() * 4));
        byteBuffer.get(this.f154041b);
        byteBuffer.get(this.f154042e);
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        asShortBuffer.get(this.f154043f);
        asShortBuffer.get(this.f154044g);
        int position = byteBuffer.position();
        int position2 = asShortBuffer.position();
        byteBuffer.position(position + position2 + position2);
    }
}
