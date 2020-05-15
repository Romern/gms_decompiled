package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: byoo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum byoo implements bxvp {
    NO_RESPONSE_SELECTED(-1),
    APPROVE_SELECTED(0),
    REJECT_SELECTED(1),
    UNSUPPORTED_REQUEST(99),
    APPROVE_ABORTED(100),
    REJECT_ABORTED(101),
    DISMISSED(ErrorInfo.TYPE_SDU_UNKNOWN),
    APPROVE_MISMATCHED(BaseMfiEventCallback.TYPE_UNKNOWN_ERROR),
    EXPIRED(ErrorInfo.TYPE_ACTIVATE_FELICA_UNKNOWN_ERROR);
    

    /* renamed from: j */
    public final int f167232j;

    private byoo(int i) {
        this.f167232j = i;
    }

    /* renamed from: a */
    public static byoo m125034a(int i) {
        if (i == -1) {
            return NO_RESPONSE_SELECTED;
        }
        if (i == 0) {
            return APPROVE_SELECTED;
        }
        if (i == 1) {
            return REJECT_SELECTED;
        }
        if (i == 199) {
            return DISMISSED;
        }
        if (i == 200) {
            return APPROVE_MISMATCHED;
        }
        if (i == 299) {
            return EXPIRED;
        }
        switch (i) {
            case 99:
                return UNSUPPORTED_REQUEST;
            case 100:
                return APPROVE_ABORTED;
            case 101:
                return REJECT_ABORTED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m125035b() {
        return byon.f167221a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f167232j;
    }

    public final String toString() {
        return Integer.toString(this.f167232j);
    }
}
