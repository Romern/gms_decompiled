package p000;

/* renamed from: bpqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bpqe implements bxvp {
    UNKNOWN_ORIGIN(0),
    ANDROID_AUTOCOMPLETE_FRAGMENT(1),
    ANDROID_AUTOCOMPLETE_MANUAL_LAUNCHER(2),
    ANDROID_PLACE_PICKER(3),
    ANDROID_ADAPTER(4),
    IOS_AUTOCOMPLETE_VIEW_CONTROLLER(5),
    IOS_AUTOCOMPLETE_SEARCH_CONTROLLER(6),
    IOS_AUTOCOMPLETE_DATA_SOURCE(7),
    IOS_PLACE_PICKER(8);
    

    /* renamed from: j */
    public final int f138707j;

    private bpqe(int i) {
        this.f138707j = i;
    }

    /* renamed from: a */
    public static bpqe m112171a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_ORIGIN;
            case 1:
                return ANDROID_AUTOCOMPLETE_FRAGMENT;
            case 2:
                return ANDROID_AUTOCOMPLETE_MANUAL_LAUNCHER;
            case 3:
                return ANDROID_PLACE_PICKER;
            case 4:
                return ANDROID_ADAPTER;
            case 5:
                return IOS_AUTOCOMPLETE_VIEW_CONTROLLER;
            case 6:
                return IOS_AUTOCOMPLETE_SEARCH_CONTROLLER;
            case 7:
                return IOS_AUTOCOMPLETE_DATA_SOURCE;
            case 8:
                return IOS_PLACE_PICKER;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m112172b() {
        return bpqd.f138696a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f138707j;
    }

    public final String toString() {
        return Integer.toString(this.f138707j);
    }
}
