package p000;

import com.google.android.gms.auth.proximity.firstparty.Subscription;
import com.google.android.gms.auth.proximity.firstparty.SyncedDevicesUpdateSubscription;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: jqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jqv implements Callable {

    /* renamed from: a */
    final /* synthetic */ jqw f23082a;

    public jqv(jqw jqw) {
        this.f23082a = jqw;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        ArrayList arrayList = new ArrayList();
        jqw jqw = this.f23082a;
        int i = jqw.f23083e;
        List e = jqw.f23086a.mo25074e();
        int size = e.size();
        for (int i2 = 0; i2 < size; i2++) {
            Subscription subscription = (Subscription) e.get(i2);
            if (subscription instanceof SyncedDevicesUpdateSubscription) {
                arrayList.add((SyncedDevicesUpdateSubscription) subscription);
            }
        }
        return arrayList;
    }
}
