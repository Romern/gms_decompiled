package p000;

/* renamed from: bkzt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bkzt implements bxvp {
    UNKNOWN_METADATA_FIELD(0),
    FIELD_TITLE(1),
    FIELD_MIME_TYPE(2),
    FIELD_TRASHED(3),
    FIELD_PARENTS(4),
    FIELD_SHARED_WITH_ME_DATE(5),
    FIELD_STARRED(6),
    FIELD_MODIFIED_DATE(7),
    FIELD_LAST_VIEWED_BY_ME(8),
    FIELD_IS_PINNED(9),
    FIELD_CUSTOM_PROPERTY_PUBLIC(10),
    FIELD_CUSTOM_PROPERTY_PRIVATE(11),
    FIELD_FULL_TEXT(12),
    FIELD_OWNED_BY_ME(13);
    

    /* renamed from: o */
    public final int f125701o;

    private bkzt(int i) {
        this.f125701o = i;
    }

    /* renamed from: a */
    public static bkzt m106932a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_METADATA_FIELD;
            case 1:
                return FIELD_TITLE;
            case 2:
                return FIELD_MIME_TYPE;
            case 3:
                return FIELD_TRASHED;
            case 4:
                return FIELD_PARENTS;
            case 5:
                return FIELD_SHARED_WITH_ME_DATE;
            case 6:
                return FIELD_STARRED;
            case 7:
                return FIELD_MODIFIED_DATE;
            case 8:
                return FIELD_LAST_VIEWED_BY_ME;
            case 9:
                return FIELD_IS_PINNED;
            case 10:
                return FIELD_CUSTOM_PROPERTY_PUBLIC;
            case 11:
                return FIELD_CUSTOM_PROPERTY_PRIVATE;
            case 12:
                return FIELD_FULL_TEXT;
            case 13:
                return FIELD_OWNED_BY_ME;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m106933b() {
        return bkzs.f125685a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f125701o;
    }

    public final String toString() {
        return Integer.toString(this.f125701o);
    }
}
