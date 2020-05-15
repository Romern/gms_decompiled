package p000;

/* renamed from: bpzo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bpzo implements bxvp {
    CONTENT_UPDATE(0),
    CONTENT_REMOVE(1),
    CONTENT_REMOVE_ALL(2),
    ACTION_START(3),
    ACTION_END(4),
    CONTENT_UPDATE_TAGS(5),
    CONTENT_GET(6),
    CONTENT_SEARCH(7),
    CONTENT_PATCH(8),
    CONTENT_MUTATE_REQUEST_INVALID(9),
    CONTENT_REMOVE_TYPES(10),
    UNRECOGNIZED(-1);
    

    /* renamed from: m */
    private final int f140031m;

    private bpzo(int i) {
        this.f140031m = i;
    }

    /* renamed from: a */
    public static bpzo m112438a(int i) {
        switch (i) {
            case 0:
                return CONTENT_UPDATE;
            case 1:
                return CONTENT_REMOVE;
            case 2:
                return CONTENT_REMOVE_ALL;
            case 3:
                return ACTION_START;
            case 4:
                return ACTION_END;
            case 5:
                return CONTENT_UPDATE_TAGS;
            case 6:
                return CONTENT_GET;
            case 7:
                return CONTENT_SEARCH;
            case 8:
                return CONTENT_PATCH;
            case 9:
                return CONTENT_MUTATE_REQUEST_INVALID;
            case 10:
                return CONTENT_REMOVE_TYPES;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m112439b() {
        return bpzn.f140017a;
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f140031m;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
