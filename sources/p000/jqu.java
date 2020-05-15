package p000;

import com.google.android.gms.auth.proximity.firstparty.SetupRequestedSubscription;
import com.google.android.gms.auth.proximity.firstparty.Subscription;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: jqu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jqu implements Callable {

    /* renamed from: a */
    final /* synthetic */ jqw f23081a;

    public jqu(jqw jqw) {
        this.f23081a = jqw;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        ArrayList arrayList = new ArrayList();
        jqw jqw = this.f23081a;
        int i = jqw.f23083e;
        List e = jqw.f23086a.mo25074e();
        int size = e.size();
        for (int i2 = 0; i2 < size; i2++) {
            Subscription subscription = (Subscription) e.get(i2);
            if (subscription instanceof SetupRequestedSubscription) {
                arrayList.add((SetupRequestedSubscription) subscription);
            }
        }
        return arrayList;
    }
}
