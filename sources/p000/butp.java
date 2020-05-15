package p000;

/* renamed from: butp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class butp {
    /* renamed from: a */
    public static /* synthetic */ String m120438a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UPGRADE_FAILURE" : "CLIENT_INTRODUCTION" : "SAFE_TO_CLOSE_PRIOR_CHANNEL" : "LAST_WRITE_TO_PRIOR_CHANNEL" : "UPGRADE_PATH_AVAILABLE" : "UNKNOWN_EVENT_TYPE";
    }

    /* renamed from: b */
    public static int m120439b(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 5 ? 0 : 6;
        }
        return 5;
    }
}
