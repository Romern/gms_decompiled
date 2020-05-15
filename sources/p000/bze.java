package p000;

/* renamed from: bze */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bze implements Comparable {

    /* renamed from: a */
    private final byte f6243a;

    /* renamed from: b */
    private final byte f6244b;

    public bze(byte b, byte b2) {
        this.f6243a = b;
        this.f6244b = b2;
    }

    /* renamed from: a */
    public final byte[] mo3622a() {
        return new byte[]{this.f6243a, this.f6244b};
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        bze bze = (bze) obj;
        int i = this.f6243a - bze.f6243a;
        return i == 0 ? this.f6244b - bze.f6244b : i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            bze bze = (bze) obj;
            if (this.f6243a == bze.f6243a && this.f6244b == bze.f6244b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f6243a + 427) * 61) + this.f6244b;
    }

    public final String toString() {
        String valueOf = String.valueOf(cbm.m3892a(this.f6243a));
        String valueOf2 = String.valueOf(cbm.m3892a(this.f6244b));
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }
}
