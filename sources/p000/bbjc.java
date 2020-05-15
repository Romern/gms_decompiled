package p000;

/* renamed from: bbjc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbjc extends bbje {

    /* renamed from: a */
    private final bxvp f102764a;

    /* renamed from: b */
    private final bqgg f102765b;

    /* renamed from: c */
    private final int f102766c;

    public bbjc(bxvp bxvp, int i, bqgg bqgg) {
        if (bxvp != null) {
            this.f102764a = bxvp;
            if (i != 0) {
                this.f102766c = i;
                this.f102765b = bqgg;
                return;
            }
            throw new NullPointerException("Null syncContextType");
        }
        throw new NullPointerException("Null syncId");
    }

    /* renamed from: a */
    public final bxvp mo56162a() {
        return this.f102764a;
    }

    /* renamed from: b */
    public final bqgg mo56163b() {
        return this.f102765b;
    }

    /* renamed from: c */
    public final int mo56164c() {
        return this.f102766c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bbje) {
            bbje bbje = (bbje) obj;
            return this.f102764a.equals(bbje.mo56162a()) && this.f102766c == bbje.mo56164c() && this.f102765b.equals(bbje.mo56163b());
        }
    }

    public final int hashCode() {
        return ((((this.f102764a.hashCode() ^ 1000003) * 1000003) ^ bbjj.m88092b(this.f102766c)) * 1000003) ^ this.f102765b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f102764a);
        String a = bbjj.m88091a(this.f102766c);
        String valueOf2 = String.valueOf(this.f102765b);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 56 + String.valueOf(a).length() + String.valueOf(valueOf2).length());
        sb.append("MultiSyncResult{syncId=");
        sb.append(valueOf);
        sb.append(", syncContextType=");
        sb.append(a);
        sb.append(", syncResults=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
