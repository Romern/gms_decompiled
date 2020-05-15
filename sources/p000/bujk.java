package p000;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

/* renamed from: bujk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bujk extends buan {

    /* renamed from: a */
    public int[] f154027a;

    /* renamed from: b */
    public byte[] f154028b;

    /* renamed from: e */
    public byte[] f154029e;

    /* renamed from: f */
    public short[] f154030f;

    /* renamed from: g */
    private buji f154031g;

    public bujk() {
        this.f153156c = new bujj(this);
    }

    /* renamed from: a */
    public final int mo72726a(long j, boolean z) {
        return ((bujt) this.f153157d).mo72743b(j, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo72514b(ByteBuffer byteBuffer) {
        IntBuffer asIntBuffer = byteBuffer.asIntBuffer();
        asIntBuffer.put(this.f154027a);
        byteBuffer.position(byteBuffer.position() + (asIntBuffer.position() * 4));
        byteBuffer.put(this.f154028b);
        byteBuffer.put(this.f154029e);
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        asShortBuffer.put(this.f154030f);
        int position = byteBuffer.position();
        int position2 = asShortBuffer.position();
        byteBuffer.position(position + position2 + position2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final byte mo72515c() {
        return 3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo72516d() {
        int length = this.f154028b.length;
        int length2 = this.f154029e.length;
        int length3 = this.f154027a.length;
        int length4 = this.f154030f.length;
        return length + length2 + (length3 * 4) + length4 + length4;
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
    public final buji entrySet() {
        if (this.f154031g == null) {
            this.f154031g = new buji(this);
        }
        return this.f154031g;
    }

    @Deprecated
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo72511a(Object obj, boolean z) {
        throw new UnsupportedOperationException("Inherited gets are not supported.");
    }

    /* renamed from: a */
    public final void mo72728a(long j, short s, int i, byte b, byte b2, short s2) {
        int b3 = ((bujt) this.f153157d).mo72742b(j, s);
        if (b3 < 0) {
            b3 ^= -1;
        }
        this.f154027a[b3] = i;
        this.f154028b[b3] = b;
        this.f154029e[b3] = b2;
        this.f154030f[b3] = s2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo72512a(ByteBuffer byteBuffer) {
        IntBuffer asIntBuffer = byteBuffer.asIntBuffer();
        asIntBuffer.get(this.f154027a);
        byteBuffer.position(byteBuffer.position() + (asIntBuffer.position() * 4));
        byteBuffer.get(this.f154028b);
        byteBuffer.get(this.f154029e);
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        asShortBuffer.get(this.f154030f);
        int position = byteBuffer.position();
        int position2 = asShortBuffer.position();
        byteBuffer.position(position + position2 + position2);
    }
}
