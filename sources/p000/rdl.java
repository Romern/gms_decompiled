package p000;

/* renamed from: rdl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum rdl implements rdm {
    OVERFLOW("Overflow", rag.DROPS_BY_OVERFLOW),
    OVERSIZE("Oversize", rag.DROPS_BY_OVERSIZE),
    SINGLE_LOG_TOO_BIG("SingleLogTooBig", rag.DROPS_BY_EVENT_SIZE),
    EXCEED_LOG_SOURCE_LOG_CAP("ExceedLogSourceLogCap", rag.DROPS_BY_LOG_CAP),
    EXCEED_LOG_SOURCE_LOG_CAP_DRY_RUN("ExceedLogSourceLogCapDryRun", rag.DROPS_BY_LOG_CAP_DRY_RUN);
    

    /* renamed from: f */
    private final String f42747f;

    /* renamed from: g */
    private final rag f42748g;

    private rdl(String str, rag rag) {
        this.f42747f = str;
        this.f42748g = rag;
    }

    /* renamed from: a */
    public final rag mo24467a() {
        return this.f42748g;
    }

    public final String toString() {
        return this.f42747f;
    }
}
