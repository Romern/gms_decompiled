package p000;

/* renamed from: cww */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cww {

    /* renamed from: a */
    public final byte f12288a;

    /* renamed from: b */
    public final boolean f12289b;

    /* renamed from: c */
    public final int f12290c;

    /* renamed from: d */
    public final int f12291d;

    private cww(boolean z, int i, int i2, byte b) {
        this.f12289b = z;
        this.f12291d = i;
        this.f12290c = i2;
        this.f12288a = b;
    }

    /* renamed from: a */
    public static cww m7796a(byte b, byte b2) {
        int i = 1;
        boolean z = (b & 128) == 128;
        byte b3 = b & 112;
        if (b3 != 0) {
            i = b3 != 32 ? b3 == 16 ? 3 : 0 : 2;
        }
        return new cww(z, i, (b & 15) - 1, b2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cww cww = (cww) obj;
            return this.f12288a == cww.f12288a && this.f12289b == cww.f12289b && this.f12290c == cww.f12290c && this.f12291d == cww.f12291d;
        }
    }

    public final int hashCode() {
        int i = ((this.f12288a * 31) + (this.f12289b ? 1 : 0)) * 31;
        int i2 = this.f12291d;
        if (i2 == 0) {
            i2 = 0;
        }
        return ((i + i2) * 31) + this.f12290c;
    }
}
