package p000;

/* renamed from: bbmp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bbmp extends bbnq {

    /* renamed from: a */
    private final bnhe f102923a;

    /* renamed from: b */
    private final long f102924b;

    /* renamed from: c */
    private final long f102925c;

    /* renamed from: d */
    private final long f102926d;

    public bbmp(bnhe bnhe, long j, long j2, long j3) {
        this.f102923a = bnhe;
        this.f102924b = j;
        this.f102925c = j2;
        this.f102926d = j3;
    }

    /* renamed from: a */
    public final bnhe mo56212a() {
        return this.f102923a;
    }

    /* renamed from: b */
    public final long mo56213b() {
        return this.f102924b;
    }

    /* renamed from: c */
    public final long mo56214c() {
        return this.f102925c;
    }

    /* renamed from: d */
    public final long mo56215d() {
        return this.f102926d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bbnq) {
            bbnq bbnq = (bbnq) obj;
            return this.f102923a.equals(bbnq.mo56212a()) && this.f102924b == bbnq.mo56213b() && this.f102925c == bbnq.mo56214c() && this.f102926d == bbnq.mo56215d();
        }
    }

    public final int hashCode() {
        int hashCode = this.f102923a.hashCode();
        long j = this.f102924b;
        long j2 = this.f102925c;
        long j3 = this.f102926d;
        return ((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f102923a);
        long j = this.f102924b;
        long j2 = this.f102925c;
        long j3 = this.f102926d;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 231);
        sb.append("SyncStats{activeEventsWithDelaysMs=");
        sb.append(valueOf);
        sb.append(", syncDurationMs=");
        sb.append(j);
        sb.append(", elapsedTimeBetweenLastSuccessfulAndCurrentSyncCompletionMs=");
        sb.append(j2);
        sb.append(", elapsedTimeBetweenLastFailedAndCurrentSyncCompletionMs=");
        sb.append(j3);
        sb.append("}");
        return sb.toString();
    }
}
