package p000;

/* renamed from: cws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cws {

    /* renamed from: a */
    public final byte f12272a;

    /* renamed from: b */
    public final byte f12273b;

    /* renamed from: c */
    public final byte f12274c;

    /* renamed from: d */
    public final boolean f12275d;

    public cws(byte b, byte b2, byte b3, boolean z) {
        this.f12272a = b;
        this.f12273b = b2;
        this.f12274c = b3;
        this.f12275d = z;
    }

    /* renamed from: c */
    public static cws m7790c() {
        return new cws((byte) 0, (byte) 0, (byte) 0, true);
    }

    /* renamed from: a */
    public final boolean mo8371a() {
        return this.f12273b != 0;
    }

    /* renamed from: b */
    public final boolean mo8372b() {
        return this.f12274c != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cws cws = (cws) obj;
            return this.f12272a == cws.f12272a && this.f12273b == cws.f12273b && this.f12274c == cws.f12274c;
        }
    }

    public final int hashCode() {
        return (((this.f12272a * 31) + this.f12273b) * 31) + this.f12274c;
    }
}
