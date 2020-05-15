package p000;

/* renamed from: bbit */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bbit extends bbix {

    /* renamed from: a */
    private final bxvp f102752a;

    /* renamed from: b */
    private final Integer f102753b;

    public bbit(bxvp bxvp, Integer num) {
        if (bxvp != null) {
            this.f102752a = bxvp;
            this.f102753b = num;
            return;
        }
        throw new NullPointerException("Null customResult");
    }

    /* renamed from: a */
    public final bxvp mo56154a() {
        return this.f102752a;
    }

    /* renamed from: b */
    public final Integer mo56155b() {
        return this.f102753b;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bbix) {
            bbix bbix = (bbix) obj;
            return this.f102752a.equals(bbix.mo56154a()) && ((num = this.f102753b) == null ? bbix.mo56155b() == null : num.equals(bbix.mo56155b()));
        }
    }

    public final int hashCode() {
        int hashCode = (this.f102752a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f102753b;
        return hashCode ^ (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f102752a);
        String valueOf2 = String.valueOf(this.f102753b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
        sb.append("SyncTaskResult{customResult=");
        sb.append(valueOf);
        sb.append(", customSecondaryResultCode=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
