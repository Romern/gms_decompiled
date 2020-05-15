package p000;

/* renamed from: bsmm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bsmm implements bxvp {
    OOB_REQ_TYPE_UNSPECIFIED(0),
    PASSWORD_RESET(1),
    OLD_EMAIL_AGREE(2),
    NEW_EMAIL_ACCEPT(3),
    VERIFY_EMAIL(4),
    RECOVER_EMAIL(5),
    EMAIL_SIGNIN(6),
    VERIFY_AND_CHANGE_EMAIL(7),
    REVERT_SECOND_FACTOR_ADDITION(8);
    

    /* renamed from: j */
    public final int f145053j;

    private bsmm(int i) {
        this.f145053j = i;
    }

    /* renamed from: a */
    public static bsmm m115978a(int i) {
        switch (i) {
            case 0:
                return OOB_REQ_TYPE_UNSPECIFIED;
            case 1:
                return PASSWORD_RESET;
            case 2:
                return OLD_EMAIL_AGREE;
            case 3:
                return NEW_EMAIL_ACCEPT;
            case 4:
                return VERIFY_EMAIL;
            case 5:
                return RECOVER_EMAIL;
            case 6:
                return EMAIL_SIGNIN;
            case 7:
                return VERIFY_AND_CHANGE_EMAIL;
            case 8:
                return REVERT_SECOND_FACTOR_ADDITION;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m115979b() {
        return bsml.f145042a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f145053j;
    }

    public final String toString() {
        return Integer.toString(this.f145053j);
    }
}
