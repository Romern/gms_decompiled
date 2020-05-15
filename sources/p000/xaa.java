package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;

/* renamed from: xaa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xaa implements bxvr {

    /* renamed from: a */
    static final bxvr f51676a = new xaa();

    private xaa() {
    }

    /* renamed from: a */
    public final boolean mo3213a(int i) {
        if (!(i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 50 || i == 51 || i == 100 || i == 101 || i == 200 || i == 201 || i == 300 || i == 400 || i == 500)) {
            switch (i) {
                case MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED:
                case MfiClientException.TYPE_MFICLIENT_NOT_FOUND:
                case MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED:
                case MfiClientException.TYPE_MFICLIENT_STARTED:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
