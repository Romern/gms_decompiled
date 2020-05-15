package p000;

import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseSettings;
import com.felicanetworks.mfc.mfi.MfiClientException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: buwp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buwp extends AdvertiseCallback {

    /* renamed from: a */
    public final CountDownLatch f155175a = new CountDownLatch(1);

    /* renamed from: b */
    public boolean f155176b;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo73189a(long j) {
        try {
            if (this.f155175a.await(j, TimeUnit.MILLISECONDS)) {
                return !this.f155176b ? 1 : 0;
            }
            return 2;
        } catch (InterruptedException e) {
            bnsl bnsl = (bnsl) bvcm.f155598a.mo68388c();
            bnsl.mo68432a("buwp", "a", 143, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("BleAdvertiseImplL: timed out waiting for advertising to start");
            return 2;
        }
    }

    public final void onStartFailure(int i) {
        String str;
        bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
        bnsl.mo68432a("buwp", "onStartFailure", (int) MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        if (i == 1) {
            str = "ADVERTISE_FAILED_DATA_TOO_LARGE";
        } else if (i == 2) {
            str = "ADVERTISE_FAILED_TOO_MANY_ADVERTISERS";
        } else if (i == 3) {
            str = "ADVERTISE_FAILED_ALREADY_STARTED";
        } else if (i == 4) {
            str = "ADVERTISE_FAILED_INTERNAL_ERROR";
        } else if (i != 5) {
            StringBuilder sb = new StringBuilder(21);
            sb.append("UNKNOWN (");
            sb.append(i);
            sb.append(")");
            str = sb.toString();
        } else {
            str = "ADVERTISE_FAILED_FEATURE_UNSUPPORTED";
        }
        bnsl.mo68420a("BleAdvertiseImplL: Failed to start, error code: %s", str);
        this.f155176b = false;
        this.f155175a.countDown();
    }

    public final void onStartSuccess(AdvertiseSettings advertiseSettings) {
        srn srn = bvcm.f155598a;
        this.f155176b = true;
        this.f155175a.countDown();
    }
}
