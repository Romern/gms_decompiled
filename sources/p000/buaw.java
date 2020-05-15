package p000;

import java.nio.ByteBuffer;

/* renamed from: buaw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buaw {

    /* renamed from: a */
    private buas f153184a;

    /* renamed from: b */
    private int f153185b;

    /* renamed from: c */
    private int f153186c = 16;

    /* renamed from: d */
    private float f153187d = 0.75f;

    /* renamed from: e */
    private ByteBuffer f153188e;

    /* renamed from: f */
    private buav f153189f;

    /* renamed from: g */
    private boolean f153190g = false;

    public buaw(buas buas, int i) {
        m119238a(buas, i);
    }

    /* renamed from: a */
    private final void m119238a(buas buas, int i) {
        if (buas == null) {
            throw new NullPointerException("The element listener cannot be null.");
        } else if (i <= 0 || ((float) i) >= this.f153187d * 2.14748365E9f) {
            float f = this.f153187d;
            StringBuilder sb = new StringBuilder(85);
            sb.append("The max size ");
            sb.append(i);
            sb.append(" must be between one (inclusive) and ");
            sb.append((int) (f * 2.14748365E9f));
            sb.append(" (exclusive).");
            throw new IllegalArgumentException(sb.toString());
        } else {
            this.f153184a = buas;
            this.f153185b = i;
        }
    }

    public buaw(buas buas, ByteBuffer byteBuffer) {
        if (buar.m119185a(byteBuffer, (byte) 1)) {
            m119238a(buas, byteBuffer.getInt());
            int i = byteBuffer.getInt();
            if (this.f153189f != null) {
                throw new IllegalStateException("Cannot set initial capacity when building from byte buffer.");
            } else if (i <= 0 || ((float) i) >= 1.61061274E9f) {
                StringBuilder sb = new StringBuilder(92);
                sb.append("The initial capacity ");
                sb.append(i);
                sb.append(" must be between one (inclusive) and 1610612736 (exclusive).");
                throw new IllegalArgumentException(sb.toString());
            } else {
                this.f153186c = i;
                float f = byteBuffer.getFloat();
                if (this.f153189f != null) {
                    throw new IllegalStateException("Cannot set load factor when building from byte buffer.");
                } else if (f <= 0.0f || f > 1.0f) {
                    StringBuilder sb2 = new StringBuilder(85);
                    sb2.append("The load factor ");
                    sb2.append(f);
                    sb2.append(" must be between zero (exclusive) and one (inclusive).");
                    throw new IllegalArgumentException(sb2.toString());
                } else {
                    this.f153187d = f;
                    this.f153188e = byteBuffer;
                    this.f153189f = mo72610a();
                }
            }
        } else {
            throw new IllegalArgumentException("The read checksum is not equal to the calculated checksum.");
        }
    }

    /* renamed from: a */
    public final buav mo72610a() {
        buav buav = this.f153189f;
        if (buav != null) {
            this.f153189f = null;
            return buav;
        } else if (!this.f153190g) {
            this.f153190g = true;
            int i = this.f153185b;
            float f = this.f153187d;
            int i2 = (int) (((float) i) / f);
            if (i2 < 127) {
                return new buau(this.f153184a, i, this.f153186c, f, this.f153188e);
            }
            if (i2 >= 32767) {
                return new buax(this.f153184a, i, this.f153186c, f, this.f153188e);
            }
            return new buay(this.f153184a, i, this.f153186c, f, this.f153188e);
        } else {
            throw new IllegalStateException("You can only build once.");
        }
    }
}
