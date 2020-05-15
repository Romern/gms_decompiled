package p000;

/* renamed from: cakb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum cakb implements bxvp {
    NOOP(0),
    WIPE(1),
    LOCATE(2),
    RING(3),
    REMIND(4),
    LOCK(5),
    SITREP(6),
    AUTO_ENABLE_DEVICE_ADMIN(7),
    AUTO_DISABLE_DEVICE_ADMIN(8),
    ASSURE(9),
    STOP_RINGING(10),
    UNPAIR(11);
    

    /* renamed from: m */
    public final int f174925m;

    private cakb(int i) {
        this.f174925m = i;
    }

    /* renamed from: a */
    public static cakb m126711a(int i) {
        switch (i) {
            case 0:
                return NOOP;
            case 1:
                return WIPE;
            case 2:
                return LOCATE;
            case 3:
                return RING;
            case 4:
                return REMIND;
            case 5:
                return LOCK;
            case 6:
                return SITREP;
            case 7:
                return AUTO_ENABLE_DEVICE_ADMIN;
            case 8:
                return AUTO_DISABLE_DEVICE_ADMIN;
            case 9:
                return ASSURE;
            case 10:
                return STOP_RINGING;
            case 11:
                return UNPAIR;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m126712b() {
        return caka.f174911a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f174925m;
    }

    public final String toString() {
        return Integer.toString(this.f174925m);
    }
}
