package p000;

/* renamed from: bogq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bogq implements bxvp {
    PLACE_LURE(0),
    HOME_ADDRESS_CHANGE(1),
    BLUETOOTH_LURE(2),
    INACTIVITY_ALARM(3),
    ONBODY_LURE(4),
    ONBODY_ON_DISABLE_SCREEN_LOCK(5),
    ONBODY_ON_ADD_ACCOUNT(6);
    

    /* renamed from: h */
    public final int f133019h;

    private bogq(int i) {
        this.f133019h = i;
    }

    /* renamed from: a */
    public static bogq m111182a(int i) {
        switch (i) {
            case 0:
                return PLACE_LURE;
            case 1:
                return HOME_ADDRESS_CHANGE;
            case 2:
                return BLUETOOTH_LURE;
            case 3:
                return INACTIVITY_ALARM;
            case 4:
                return ONBODY_LURE;
            case 5:
                return ONBODY_ON_DISABLE_SCREEN_LOCK;
            case 6:
                return ONBODY_ON_ADD_ACCOUNT;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m111183b() {
        return bogp.f133010a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f133019h;
    }

    public final String toString() {
        return Integer.toString(this.f133019h);
    }
}
