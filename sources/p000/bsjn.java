package p000;

/* renamed from: bsjn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bsjn implements bxvp {
    TOKEN_TYPE_UNSPECIFIED(0),
    OAUTH2_ACCESS_TOKEN(1),
    OAUTH2_REFRESH_TOKEN(2),
    GOOGLE_ID_TOKEN(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: f */
    private final int f144826f;

    private bsjn(int i) {
        this.f144826f = i;
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f144826f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }
}
