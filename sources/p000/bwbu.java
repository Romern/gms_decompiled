package p000;

/* renamed from: bwbu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bwbu {
    MSG_PLAN_STATUS_UPDATE(2),
    MSG_UPSELL_OFFER(3),
    ACCOUNT_ALERT(4),
    OPERATION(5),
    MESSAGEBODY_NOT_SET(0);
    

    /* renamed from: f */
    public final int f158776f;

    private bwbu(int i) {
        this.f158776f = i;
    }

    /* renamed from: a */
    public static bwbu m121732a(int i) {
        if (i == 0) {
            return MESSAGEBODY_NOT_SET;
        }
        if (i == 2) {
            return MSG_PLAN_STATUS_UPDATE;
        }
        if (i == 3) {
            return MSG_UPSELL_OFFER;
        }
        if (i == 4) {
            return ACCOUNT_ALERT;
        }
        if (i != 5) {
            return null;
        }
        return OPERATION;
    }
}
