package p000;

/* renamed from: brds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum brds implements bxvp {
    UNKNOWN_CAPABILITY(1),
    CAN_REMOVE_MEMBER(2),
    CAN_MANAGE_MEMBER(3),
    CAN_REMOVE_PRIVILEGE(4);
    

    /* renamed from: e */
    private final int f142554e;

    private brds(int i) {
        this.f142554e = i;
    }

    /* renamed from: a */
    public static brds m113911a(int i) {
        if (i == 1) {
            return UNKNOWN_CAPABILITY;
        }
        if (i == 2) {
            return CAN_REMOVE_MEMBER;
        }
        if (i == 3) {
            return CAN_MANAGE_MEMBER;
        }
        if (i != 4) {
            return null;
        }
        return CAN_REMOVE_PRIVILEGE;
    }

    /* renamed from: b */
    public static bxvr m113912b() {
        return brdr.f142548a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f142554e;
    }

    public final String toString() {
        return Integer.toString(this.f142554e);
    }
}
