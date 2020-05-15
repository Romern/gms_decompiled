package p000;

/* renamed from: msk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum msk implements bxvp {
    REQUEST_TYPE_UNSPECIFIED(0),
    GET_DEVICES_REQUEST(1),
    KV_BACKUP_PARTIAL_REQUEST(2),
    KV_BACKUP_FINAL_REQUEST(3),
    KV_BACKUP_ABORT_REQUEST(4),
    RESTORE_REQUEST(5),
    FULL_BACKUP_REQUEST(6),
    ENCRYPTED_BACKUP_INCREMENTAL(7),
    ENCRYPTED_BACKUP_NON_INCREMENTAL(8),
    SET_ACTIVE_SECONDARY_KEY(9),
    GET_APP_KEY_BLACKLIST_INFO(10);
    

    /* renamed from: l */
    public final int f34557l;

    private msk(int i) {
        this.f34557l = i;
    }

    /* renamed from: a */
    public static msk m25578a(int i) {
        switch (i) {
            case 0:
                return REQUEST_TYPE_UNSPECIFIED;
            case 1:
                return GET_DEVICES_REQUEST;
            case 2:
                return KV_BACKUP_PARTIAL_REQUEST;
            case 3:
                return KV_BACKUP_FINAL_REQUEST;
            case 4:
                return KV_BACKUP_ABORT_REQUEST;
            case 5:
                return RESTORE_REQUEST;
            case 6:
                return FULL_BACKUP_REQUEST;
            case 7:
                return ENCRYPTED_BACKUP_INCREMENTAL;
            case 8:
                return ENCRYPTED_BACKUP_NON_INCREMENTAL;
            case 9:
                return SET_ACTIVE_SECONDARY_KEY;
            case 10:
                return GET_APP_KEY_BLACKLIST_INFO;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m25579b() {
        return msj.f34544a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f34557l;
    }

    public final String toString() {
        return Integer.toString(this.f34557l);
    }
}
