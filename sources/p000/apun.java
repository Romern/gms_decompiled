package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.HarmfulAppsInfo;
import java.util.concurrent.CountDownLatch;

/* renamed from: apun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apun extends apfz {

    /* renamed from: a */
    final /* synthetic */ apup[] f84931a;

    /* renamed from: b */
    final /* synthetic */ CountDownLatch f84932b;

    public apun(apup[] apupArr, CountDownLatch countDownLatch) {
        this.f84931a = apupArr;
        this.f84932b = countDownLatch;
    }

    /* renamed from: a */
    public final void mo47169a(Status status, HarmfulAppsInfo harmfulAppsInfo) {
        if (!(status == null || !status.mo17710c() || harmfulAppsInfo == null)) {
            this.f84931a[0] = new apup(harmfulAppsInfo);
        }
        this.f84932b.countDown();
    }
}
