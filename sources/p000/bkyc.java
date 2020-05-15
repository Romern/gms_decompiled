package p000;

/* renamed from: bkyc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bkyc implements bxvp {
    UNKNOWN_ACTION_TYPE(0),
    CONTENT_AND_METADATA_ACTION(1),
    CREATE_FILE_ACTION(2),
    TRASH_ACTION(3),
    ADD_PERMISSION_ACTION(4),
    CREATE_FOLDER_ACTION(5),
    CREATE_SHORTCUT_FILE_ACTION(6),
    DELETE_FILE_ACTION(7),
    METADATA_ACTION(8),
    REMOVE_PERMISSION_ACTION(9),
    SET_APP_AUTH_STATE_ACTION(10),
    SET_RESOURCE_PARENTS_ACTION(11),
    SET_SUBSCRIBED_ACTION(12),
    UPDATE_PERMISSION_ACTION(13),
    CHANGE_RESOURCE_PARENTS_ACTION(14);
    

    /* renamed from: p */
    public final int f125455p;

    private bkyc(int i) {
        this.f125455p = i;
    }

    /* renamed from: a */
    public static bkyc m106887a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_ACTION_TYPE;
            case 1:
                return CONTENT_AND_METADATA_ACTION;
            case 2:
                return CREATE_FILE_ACTION;
            case 3:
                return TRASH_ACTION;
            case 4:
                return ADD_PERMISSION_ACTION;
            case 5:
                return CREATE_FOLDER_ACTION;
            case 6:
                return CREATE_SHORTCUT_FILE_ACTION;
            case 7:
                return DELETE_FILE_ACTION;
            case 8:
                return METADATA_ACTION;
            case 9:
                return REMOVE_PERMISSION_ACTION;
            case 10:
                return SET_APP_AUTH_STATE_ACTION;
            case 11:
                return SET_RESOURCE_PARENTS_ACTION;
            case 12:
                return SET_SUBSCRIBED_ACTION;
            case 13:
                return UPDATE_PERMISSION_ACTION;
            case 14:
                return CHANGE_RESOURCE_PARENTS_ACTION;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m106888b() {
        return bkyb.f125438a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f125455p;
    }

    public final String toString() {
        return Integer.toString(this.f125455p);
    }
}
