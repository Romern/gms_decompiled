package p000;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: abom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abom extends aeaa {

    /* renamed from: a */
    public dcn f57800a;

    /* renamed from: b */
    private final CountDownLatch f57801b = new CountDownLatch(1);

    public abom() {
        super("herrevad");
    }

    /* renamed from: a */
    public final void mo32247a(long j) {
        this.f57801b.await(j, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        componentName.flattenToShortString();
        int i = eoa.f15378a;
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        dcn dcn;
        componentName.flattenToShortString();
        int i = eoa.f15378a;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.gcs.service.IGcsStateService");
            dcn = queryLocalInterface instanceof dcn ? (dcn) queryLocalInterface : new dcn(iBinder);
        } else {
            dcn = null;
        }
        this.f57800a = dcn;
        this.f57801b.countDown();
    }
}
