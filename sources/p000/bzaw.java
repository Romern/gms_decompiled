package p000;

import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: bzaw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzaw {
    /* renamed from: a */
    public static /* synthetic */ String m125598a(int i) {
        return i != 1 ? i != 101 ? i != 201 ? i != 301 ? i != 401 ? i != 501 ? i != 601 ? i != 701 ? "null" : "EVALUATION_AMAZING" : "EVALUATION_GREAT" : "EVALUATION_GOOD" : "EVALUATION_OK" : "EVALUATION_NEUTRAL" : "EVALUATION_POOR" : "EVALUATION_BAD" : "EVALUATION_UNKNOWN";
    }

    /* renamed from: b */
    public static int m125599b(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 100) {
            return 101;
        }
        if (i == 200) {
            return ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR;
        }
        if (i == 300) {
            return ErrorInfo.TYPE_FSC_HTTP_ERROR;
        }
        if (i == 400) {
            return ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE;
        }
        if (i == 500) {
            return 501;
        }
        if (i != 600) {
            return i != 700 ? 0 : 701;
        }
        return 601;
    }
}
