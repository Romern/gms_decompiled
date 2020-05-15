package p000;

import java.nio.ByteBuffer;

/* renamed from: oat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oat extends oay {

    /* renamed from: c */
    private final int f37091c;

    /* renamed from: d */
    private final ByteBuffer f37092d;

    /* renamed from: e */
    private final int f37093e;

    /* renamed from: f */
    private final boolean f37094f;

    /* renamed from: g */
    private final boolean f37095g;

    /* renamed from: h */
    private final long f37096h;

    public oat(int i, ByteBuffer byteBuffer, int i2, boolean z, boolean z2, long j) {
        this.f37091c = i;
        if (byteBuffer != null) {
            this.f37092d = byteBuffer;
            this.f37093e = i2;
            this.f37094f = z;
            this.f37095g = z2;
            this.f37096h = j;
            return;
        }
        throw new NullPointerException("Null message");
    }

    /* renamed from: a */
    public final int mo21912a() {
        return this.f37091c;
    }

    /* renamed from: b */
    public final ByteBuffer mo21913b() {
        return this.f37092d;
    }

    /* renamed from: c */
    public final int mo21914c() {
        return this.f37093e;
    }

    /* renamed from: d */
    public final boolean mo21915d() {
        return this.f37094f;
    }

    /* renamed from: e */
    public final boolean mo21916e() {
        return this.f37095g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oay) {
            oay oay = (oay) obj;
            return this.f37091c == oay.mo21912a() && this.f37092d.equals(oay.mo21913b()) && this.f37093e == oay.mo21914c() && this.f37094f == oay.mo21915d() && this.f37095g == oay.mo21916e() && this.f37096h == oay.mo21918f();
        }
    }

    /* renamed from: f */
    public final long mo21918f() {
        return this.f37096h;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((this.f37091c ^ 1000003) * 1000003) ^ this.f37092d.hashCode()) * 1000003) ^ this.f37093e) * 1000003) ^ (!this.f37094f ? 1237 : 1231)) * 1000003;
        if (this.f37095g) {
            i = 1231;
        }
        long j = this.f37096h;
        return ((hashCode ^ i) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }
}
