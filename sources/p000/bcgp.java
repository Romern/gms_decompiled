package p000;

/* renamed from: bcgp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcgp extends bchc {

    /* renamed from: a */
    private final boolean f104117a;

    public bcgp(boolean z) {
        this.f104117a = z;
    }

    /* renamed from: a */
    public final boolean mo56806a() {
        return this.f104117a;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof bchc) && this.f104117a == ((bchc) obj).mo56806a();
        }
        return true;
    }

    public final int hashCode() {
        return (!this.f104117a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.f104117a;
        StringBuilder sb = new StringBuilder(40);
        sb.append("BlockUnblockUsers{syncBlockStatus=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
