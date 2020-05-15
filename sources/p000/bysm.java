package p000;

import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: bysm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bysm {
    /* renamed from: a */
    public static int m125267a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 100) {
            return 101;
        }
        if (i != 200) {
            return 0;
        }
        return ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR;
    }
}
