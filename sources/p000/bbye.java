package p000;

/* renamed from: bbye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbye extends bbyu {

    /* renamed from: a */
    private final bmxv f103749a;

    /* renamed from: b */
    private final int f103750b = 2;

    public bbye(int i, bmxv bmxv) {
        this.f103749a = bmxv;
    }

    /* renamed from: a */
    public final bmxv mo56541a() {
        return this.f103749a;
    }

    /* renamed from: b */
    public final int mo56542b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bbyu) {
            bbyu bbyu = (bbyu) obj;
            return bbyu.mo56542b() == 2 && this.f103749a.equals(bbyu.mo56541a());
        }
    }

    public final int hashCode() {
        return this.f103749a.hashCode() ^ -723379965;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f103749a);
        StringBuilder sb = new StringBuilder("SUCCESS".length() + 44 + String.valueOf(valueOf).length());
        sb.append("SendMessageResult{status=");
        sb.append("SUCCESS");
        sb.append(", serverTimestamp=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
