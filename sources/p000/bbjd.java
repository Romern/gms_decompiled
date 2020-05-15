package p000;

/* renamed from: bbjd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bbjd extends bbjl {

    /* renamed from: a */
    private final bxvp f102767a;

    /* renamed from: b */
    private final int f102768b;

    public bbjd(bxvp bxvp, int i) {
        if (bxvp != null) {
            this.f102767a = bxvp;
            this.f102768b = i;
            return;
        }
        throw new NullPointerException("Null syncId");
    }

    /* renamed from: a */
    public final bxvp mo56168a() {
        return this.f102767a;
    }

    /* renamed from: b */
    public final int mo56169b() {
        return this.f102768b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bbjl) {
            bbjl bbjl = (bbjl) obj;
            return this.f102767a.equals(bbjl.mo56168a()) && this.f102768b == bbjl.mo56169b();
        }
    }

    public final int hashCode() {
        return ((this.f102767a.hashCode() ^ 1000003) * 1000003) ^ bbjj.m88092b(this.f102768b);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f102767a);
        String a = bbjj.m88091a(this.f102768b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35 + String.valueOf(a).length());
        sb.append("SyncInfo{syncId=");
        sb.append(valueOf);
        sb.append(", syncContextType=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
