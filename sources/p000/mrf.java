package p000;

/* renamed from: mrf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum mrf implements bxvp {
    BACKUP_TRANSPORT_UNSPECIFIED(0),
    UNKNOWN_TRANSPORT_SERVICE(1),
    LOCAL_TRANSPORT(2),
    GMS_BACKUP_TRANSPORT_SERVICE(3),
    D2D_TRANSPORT_SERVICE(4),
    LEGACY_BACKUP_TRANSPORT_SERVICE(5);
    

    /* renamed from: g */
    public final int f34398g;

    private mrf(int i) {
        this.f34398g = i;
    }

    /* renamed from: a */
    public static mrf m25543a(int i) {
        if (i == 0) {
            return BACKUP_TRANSPORT_UNSPECIFIED;
        }
        if (i == 1) {
            return UNKNOWN_TRANSPORT_SERVICE;
        }
        if (i == 2) {
            return LOCAL_TRANSPORT;
        }
        if (i == 3) {
            return GMS_BACKUP_TRANSPORT_SERVICE;
        }
        if (i == 4) {
            return D2D_TRANSPORT_SERVICE;
        }
        if (i != 5) {
            return null;
        }
        return LEGACY_BACKUP_TRANSPORT_SERVICE;
    }

    /* renamed from: b */
    public static bxvr m25544b() {
        return mre.f34390a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f34398g;
    }

    public final String toString() {
        return Integer.toString(this.f34398g);
    }
}
