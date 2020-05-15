package p000;

import com.google.android.gms.auth.proximity.firstparty.SecureChannelSubscription;
import com.google.android.gms.auth.proximity.firstparty.Subscription;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: jqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jqt implements Callable {

    /* renamed from: a */
    final /* synthetic */ jqw f23080a;

    public jqt(jqw jqw) {
        this.f23080a = jqw;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        ArrayList arrayList = new ArrayList();
        List e = this.f23080a.f23086a.mo25074e();
        int size = e.size();
        for (int i = 0; i < size; i++) {
            Subscription subscription = (Subscription) e.get(i);
            if (subscription instanceof SecureChannelSubscription) {
                arrayList.add((SecureChannelSubscription) subscription);
            }
        }
        return arrayList;
    }
}
