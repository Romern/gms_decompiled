package p000;

/* renamed from: bbnp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbnp {

    /* renamed from: a */
    private bnhe f102964a;

    /* renamed from: b */
    private Long f102965b;

    /* renamed from: c */
    private Long f102966c;

    /* renamed from: d */
    private Long f102967d;

    /* renamed from: a */
    public final bbnq mo56238a() {
        String str = this.f102964a == null ? " activeEventsWithDelaysMs" : "";
        if (this.f102965b == null) {
            str = str.concat(" syncDurationMs");
        }
        if (this.f102966c == null) {
            str = String.valueOf(str).concat(" elapsedTimeBetweenLastSuccessfulAndCurrentSyncCompletionMs");
        }
        if (this.f102967d == null) {
            str = String.valueOf(str).concat(" elapsedTimeBetweenLastFailedAndCurrentSyncCompletionMs");
        }
        if (str.isEmpty()) {
            return new bbmp(this.f102964a, this.f102965b.longValue(), this.f102966c.longValue(), this.f102967d.longValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo56241b(long j) {
        this.f102966c = Long.valueOf(j);
    }

    /* renamed from: c */
    public final void mo56242c(long j) {
        this.f102965b = Long.valueOf(j);
    }

    /* renamed from: a */
    public final void mo56239a(long j) {
        this.f102967d = Long.valueOf(j);
    }

    /* renamed from: a */
    public final void mo56240a(bnhe bnhe) {
        if (bnhe != null) {
            this.f102964a = bnhe;
            return;
        }
        throw new NullPointerException("Null activeEventsWithDelaysMs");
    }
}
