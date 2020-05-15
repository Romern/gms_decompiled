package p000;

/* renamed from: ung */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum ung {
    UNTRASHED(0),
    IMPLICITLY_TRASHED(1),
    EXPLICITLY_TRASHED(2);
    

    /* renamed from: d */
    public final long f48312d;

    private ung(long j) {
        this.f48312d = j;
    }

    /* renamed from: a */
    public static ung m38978a(long j) {
        ung[] values = values();
        for (ung ung : values) {
            if (ung.f48312d == j) {
                return ung;
            }
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("Unaccepted TrashState sql value ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public final boolean mo27699b() {
        return UNTRASHED.equals(this);
    }

    /* renamed from: a */
    public static ung m38979a(boolean z, boolean z2) {
        if (z && !z2) {
            throw new IllegalArgumentException("Cannot be explicitly trashed and untrashed");
        } else if (z) {
            return EXPLICITLY_TRASHED;
        } else {
            return !z2 ? UNTRASHED : IMPLICITLY_TRASHED;
        }
    }

    /* renamed from: a */
    public final boolean mo27698a() {
        return EXPLICITLY_TRASHED.equals(this);
    }
}
