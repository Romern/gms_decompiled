package p000;

/* renamed from: ehh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum ehh {
    NEW_ACTIVE_KEY_ENROLLED(1, false),
    NO_NEW_KEY_NEEDED(2, false),
    ENROLLMENT_RUN_SCHEDULED(3, false),
    TEMPORARY_CONNECTION_FAILURE(4, true),
    INVALID_REQUEST_ERROR(5, false),
    ILLEGAL_SERVER_STATE(6, true),
    MISSING_CUSTOM_DATA(7, false),
    BAD_CLIENT_STATE(8, false),
    CRYPTOGRAPHIC_KEY_ERROR(9, true),
    KEY_INSERTION_FAILED(10, true),
    UNSUPPORTED_ACTION(11, true),
    CLIENT_INTERNAL_ERROR(12, true),
    SERVER_OVERLOADED(13, true),
    AUTH_ERROR(14, true),
    NO_SYNC_REQUIRED(15, false);
    

    /* renamed from: p */
    public final int f14966p;

    /* renamed from: q */
    public final boolean f14967q;

    private ehh(int i, boolean z) {
        this.f14967q = z;
        this.f14966p = i;
    }
}
