package p000;

/* renamed from: blbd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum blbd implements bxvp {
    UNKNOWN_DRIVE_SCOPE(0),
    DRIVE_SCOPE_FILE(1),
    DRIVE_SCOPE_APPFOLDER(2),
    DRIVE_SCOPE_FULL(3),
    DRIVE_SCOPE_APPS(4),
    DRIVE_SCOPE_METADATA_READONLY(5),
    DRIVE_SCOPE_PHOTOS_READONLY(6);
    

    /* renamed from: h */
    public final int f125820h;

    private blbd(int i) {
        this.f125820h = i;
    }

    /* renamed from: a */
    public static blbd m106970a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_DRIVE_SCOPE;
            case 1:
                return DRIVE_SCOPE_FILE;
            case 2:
                return DRIVE_SCOPE_APPFOLDER;
            case 3:
                return DRIVE_SCOPE_FULL;
            case 4:
                return DRIVE_SCOPE_APPS;
            case 5:
                return DRIVE_SCOPE_METADATA_READONLY;
            case 6:
                return DRIVE_SCOPE_PHOTOS_READONLY;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m106971b() {
        return blbc.f125811a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f125820h;
    }

    public final String toString() {
        return Integer.toString(this.f125820h);
    }
}
