package p000;

import android.os.Bundle;

/* renamed from: qfu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class qfu {
    /* renamed from: a */
    protected static boolean m32093a(Bundle bundle) {
        if (!bundle.getBoolean("CheckinService_forceCheckin", false) || bundle.getInt("checkin_retry_count", 0) > 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public abstract long mo24020a(long j, Bundle bundle);

    /* renamed from: a */
    public abstract String mo24021a();

    /* renamed from: a */
    public abstract void mo24022a(long j, qda qda);

    /* renamed from: b */
    public abstract void mo24023b();
}
