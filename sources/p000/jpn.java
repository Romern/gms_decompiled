package p000;

import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.firstparty.SecureChannelSubscription;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: jpn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jpn implements Callable {

    /* renamed from: a */
    final /* synthetic */ jpo f22987a;

    /* renamed from: b */
    private final int f22988b;

    /* renamed from: c */
    private final RemoteDevice f22989c;

    public jpn(jpo jpo, RemoteDevice remoteDevice, int i) {
        this.f22987a = jpo;
        this.f22989c = remoteDevice;
        this.f22988b = i;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        try {
            for (SecureChannelSubscription secureChannelSubscription : (List) this.f22987a.f22992c.mo14004b().get()) {
                if (secureChannelSubscription.mo7802b().contains(this.f22989c) && (secureChannelSubscription.f11180c & this.f22988b) > 0) {
                    Status a = this.f22987a.mo13980a(Collections.singletonList(this.f22989c), secureChannelSubscription);
                    if (!Status.f30107a.equals(a)) {
                        return a;
                    }
                }
            }
            return Status.f30107a;
        } catch (InterruptedException | ExecutionException e) {
            return Status.f30108b;
        }
    }
}
