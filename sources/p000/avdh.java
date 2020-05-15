package p000;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: avdh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avdh implements avaa, rkk {

    /* renamed from: a */
    private final Status f92992a;

    /* renamed from: b */
    private final avaa f92993b;

    public avdh(Status status, avaa avaa) {
        this.f92992a = status;
        this.f92993b = avaa;
    }

    /* renamed from: a */
    public final boolean mo51101a() {
        Status status = this.f92992a;
        if (status != null && status.mo17710c()) {
            return this.f92993b.mo51101a();
        }
        Log.e("DevDataUplOptInStatRes", "Cant call to canUploadSupplementalWebAndAppActivity as getOptInStatus failed");
        return false;
    }

    /* renamed from: b */
    public final boolean mo51102b() {
        Status status = this.f92992a;
        if (status != null && status.mo17710c()) {
            return this.f92993b.mo51102b();
        }
        Log.e("DevDataUplOptInStatRes", "Cant call to canUploadDeviceInformation as getOptInStatus failed");
        return false;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f92992a;
    }
}
