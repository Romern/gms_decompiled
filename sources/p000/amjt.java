package p000;

/* renamed from: amjt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum amjt implements bxvp {
    UNKNOWN_STATUS(0),
    SUCCESS(1),
    OTHER_REMOTE_EXCEPTION(2),
    NO_SYNCED_GROUP_WITH_SAME_TITLE(3),
    MULTIPLE_SYNCED_GROUPS_WITH_SAME_TITLE(4),
    TOO_MANY_CONTACTS(5),
    OTHER_MOVE_CONTACTS_FAILURE(6),
    DELETE_GROUP_FAILURE(7),
    CLEAR_SYNC_TOKEN_FAILURE(8);
    

    /* renamed from: j */
    public final int f75014j;

    private amjt(int i) {
        this.f75014j = i;
    }

    /* renamed from: a */
    public static amjt m62982a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_STATUS;
            case 1:
                return SUCCESS;
            case 2:
                return OTHER_REMOTE_EXCEPTION;
            case 3:
                return NO_SYNCED_GROUP_WITH_SAME_TITLE;
            case 4:
                return MULTIPLE_SYNCED_GROUPS_WITH_SAME_TITLE;
            case 5:
                return TOO_MANY_CONTACTS;
            case 6:
                return OTHER_MOVE_CONTACTS_FAILURE;
            case 7:
                return DELETE_GROUP_FAILURE;
            case 8:
                return CLEAR_SYNC_TOKEN_FAILURE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m62983b() {
        return amjs.f75003a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f75014j;
    }

    public final String toString() {
        return Integer.toString(this.f75014j);
    }
}
