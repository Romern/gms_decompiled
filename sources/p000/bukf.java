package p000;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.regex.Pattern;

/* renamed from: bukf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bukf extends buan {

    /* renamed from: h */
    private static final Pattern f154074h = Pattern.compile("-?[a-zA-Z0-9]+");

    /* renamed from: a */
    public byte[] f154075a;

    /* renamed from: b */
    public short[] f154076b;

    /* renamed from: e */
    public short[] f154077e;

    /* renamed from: f */
    public long[] f154078f;

    /* renamed from: g */
    public long[] f154079g;

    /* renamed from: i */
    private final boolean f154080i;

    /* renamed from: j */
    private bukd f154081j;

    public bukf(boolean z) {
        this.f153156c = new buke(this);
        this.f154080i = z;
    }

    /* renamed from: a */
    public final bukd entrySet() {
        if (this.f154081j == null) {
            this.f154081j = new bukd(this);
        }
        return this.f154081j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo72514b(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f154075a);
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        asShortBuffer.put(this.f154077e);
        asShortBuffer.put(this.f154076b);
        int position = byteBuffer.position();
        int position2 = asShortBuffer.position();
        byteBuffer.position(position + position2 + position2);
        LongBuffer asLongBuffer = byteBuffer.asLongBuffer();
        asLongBuffer.put(this.f154078f);
        asLongBuffer.put(this.f154079g);
        byteBuffer.position(byteBuffer.position() + (asLongBuffer.position() * 8));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final byte mo72515c() {
        return 1;
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
        int length = this.f154075a.length;
        int length2 = this.f154077e.length;
        int length3 = this.f154076b.length;
        return length + length2 + length2 + length3 + length3 + (this.f154078f.length * 8) + (this.f154079g.length * 8);
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
        Integer num = (Integer) obj;
        Long l = (Long) obj2;
        throw new UnsupportedOperationException("Inherited put is not supported.");
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        throw new UnsupportedOperationException("Inherited remove is not supported.");
    }

    @Deprecated
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo72511a(Object obj, boolean z) {
        throw new UnsupportedOperationException("Inherited get is not supported.");
    }

    /* renamed from: a */
    public final String mo72761a(int i) {
        try {
            return new String(this.f154075a, i * 3, 3, "US-ASCII").trim();
        } catch (UnsupportedEncodingException e) {
            if (!this.f154080i) {
                return "";
            }
            throw new IllegalArgumentException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo72512a(ByteBuffer byteBuffer) {
        byteBuffer.get(this.f154075a);
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        asShortBuffer.get(this.f154077e);
        asShortBuffer.get(this.f154076b);
        int position = byteBuffer.position();
        int position2 = asShortBuffer.position();
        byteBuffer.position(position + position2 + position2);
        LongBuffer asLongBuffer = byteBuffer.asLongBuffer();
        asLongBuffer.get(this.f154078f);
        asLongBuffer.get(this.f154079g);
        byteBuffer.position(byteBuffer.position() + (asLongBuffer.position() * 8));
    }

    @Deprecated
    /* renamed from: b */
    public final boolean mo72562b(Object obj) {
        throw new UnsupportedOperationException("Inherited containsValue is not supported.");
    }

    /* renamed from: a */
    public final void mo72762a(short s, short s2, String str, short s3, short s4, long j, long j2) {
        int a = ((bulm) this.f153157d).mo72816a(s, s2);
        if (a < 0) {
            a ^= -1;
        }
        if (str == null || !f154074h.matcher(str).matches()) {
            str = "";
        }
        byte[] bArr = new byte[0];
        try {
            bArr = str.getBytes("US-ASCII");
        } catch (UnsupportedEncodingException e) {
            if (this.f154080i) {
                throw new IllegalArgumentException(e);
            }
        }
        for (int i = 0; i < 3; i++) {
            if (i < bArr.length) {
                this.f154075a[(a * 3) + i] = bArr[i];
            } else {
                this.f154075a[(a * 3) + i] = 0;
            }
        }
        this.f154076b[a] = s3;
        this.f154077e[a] = s4;
        this.f154078f[a] = j;
        this.f154079g[a] = j2;
    }

    @Deprecated
    /* renamed from: a */
    public final boolean mo72561a(Object obj) {
        throw new UnsupportedOperationException("Inherited containsKey is not supported.");
    }
}
