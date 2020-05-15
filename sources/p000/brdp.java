package p000;

/* renamed from: brdp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum brdp implements bxvp {
    UNKNOWN_MANAGE_FAMILY_CAPABILITY(0),
    CAN_DISSOLVE_FAMILY(1),
    CAN_INVITE_MEMBERS(2),
    CAN_REMOVE_INVITATIONS(3),
    CAN_CREATE_NEW_ACCOUNT(4),
    CAN_MANAGE_PARENTS(5),
    CAN_RECOVER_KIDS_ACCOUNTS(6);
    

    /* renamed from: h */
    private final int f142547h;

    private brdp(int i) {
        this.f142547h = i;
    }

    /* renamed from: a */
    public static brdp m113906a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_MANAGE_FAMILY_CAPABILITY;
            case 1:
                return CAN_DISSOLVE_FAMILY;
            case 2:
                return CAN_INVITE_MEMBERS;
            case 3:
                return CAN_REMOVE_INVITATIONS;
            case 4:
                return CAN_CREATE_NEW_ACCOUNT;
            case 5:
                return CAN_MANAGE_PARENTS;
            case 6:
                return CAN_RECOVER_KIDS_ACCOUNTS;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m113907b() {
        return brdo.f142538a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f142547h;
    }

    public final String toString() {
        return Integer.toString(this.f142547h);
    }
}
