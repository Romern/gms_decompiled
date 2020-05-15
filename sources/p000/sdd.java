package p000;

import android.content.Context;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

/* renamed from: sdd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sdd implements sbf, sbg {

    /* renamed from: a */
    private final Context f44056a;

    /* renamed from: b */
    private final Map f44057b = new ConcurrentHashMap();

    public sdd(Context context) {
        this.f44056a = context;
    }

    /* renamed from: a */
    public final ConnectionResult mo25330a(GetServiceRequest getServiceRequest, ConnectionInfo connectionInfo) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f44057b.put(getServiceRequest, countDownLatch);
        try {
            snp.m35704b(10).execute(new sdc(this, countDownLatch, getServiceRequest));
            return ConnectionResult.f30063a;
        } catch (OutOfMemoryError e) {
            if (cdjz.f181084a.mo6606a().mo77773b()) {
                srj.m36117a();
            }
            throw e;
        }
    }

    /* renamed from: b */
    public final void mo25394b(GetServiceRequest getServiceRequest, int i) {
        int i2 = getServiceRequest.f30228b;
        if (i2 > 0) {
            sgj a = sgj.m35206a(i2);
            if (a == null) {
                a = sgj.UNKNOWN;
            }
            new riu(getServiceRequest.f30229c, getServiceRequest.f30230d, a).mo24644a(this.f44056a, i);
        }
    }

    /* renamed from: a */
    public final boolean mo25333a(GetServiceRequest getServiceRequest, int i) {
        CountDownLatch countDownLatch = (CountDownLatch) this.f44057b.remove(getServiceRequest);
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        mo25394b(getServiceRequest, i);
        return true;
    }
}
