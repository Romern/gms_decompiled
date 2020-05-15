package p000;

import android.os.Bundle;

/* renamed from: qcf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qcf extends qcg {

    /* renamed from: a */
    private static qcf f40922a;

    /* renamed from: a */
    public static synchronized qcf m31843a() {
        qcf qcf;
        synchronized (qcf.class) {
            if (f40922a == null) {
                f40922a = new qcf();
            }
            qcf = f40922a;
        }
        return qcf;
    }

    private qcf() {
    }

    /* renamed from: a */
    public final Bundle mo23911a(Bundle bundle) {
        Bundle a = super.mo23911a(bundle);
        a.putBoolean("CheckinService_onStart_ignoreNetworkState", bundle.getBoolean("com.google.android.gms.checkin.IGNORE_NETWORK_STATE", false));
        a.putBoolean("CheckinService_fetchSystemUpdates", bundle.getBoolean("com.google.android.gms.checkin.FETCH_SYSTEM_UPDATES", false));
        a.putInt("CheckinService_onStart_checkinReason", bundle.getInt("com.google.android.gms.checkin.CHECKIN_REASON_TYPE", 8));
        return a;
    }
}
