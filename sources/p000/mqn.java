package p000;

/* renamed from: mqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum mqn implements bxvp {
    BACKUP_OBSERVER_RESULT_UNSPECIFIED(0),
    SUCCESS(1),
    ERROR_BACKUP_NOT_ALLOWED(2),
    ERROR_PACKAGE_NOT_FOUND(3),
    ERROR_BACKUP_CANCELLED(4),
    ERROR_TRANSPORT_ABORTED(5),
    ERROR_TRANSPORT_PACKAGE_REJECTED(6),
    ERROR_AGENT_FAILURE(7),
    ERROR_TRANSPORT_QUOTA_EXCEEDED(8);
    

    /* renamed from: j */
    public final int f34327j;

    private mqn(int i) {
        this.f34327j = i;
    }

    /* renamed from: a */
    public static mqn m25523a(int i) {
        switch (i) {
            case 0:
                return BACKUP_OBSERVER_RESULT_UNSPECIFIED;
            case 1:
                return SUCCESS;
            case 2:
                return ERROR_BACKUP_NOT_ALLOWED;
            case 3:
                return ERROR_PACKAGE_NOT_FOUND;
            case 4:
                return ERROR_BACKUP_CANCELLED;
            case 5:
                return ERROR_TRANSPORT_ABORTED;
            case 6:
                return ERROR_TRANSPORT_PACKAGE_REJECTED;
            case 7:
                return ERROR_AGENT_FAILURE;
            case 8:
                return ERROR_TRANSPORT_QUOTA_EXCEEDED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m25524b() {
        return mqm.f34316a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f34327j;
    }

    public final String toString() {
        return Integer.toString(this.f34327j);
    }
}
