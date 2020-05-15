package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Subscription;
import com.google.android.gms.fitness.request.ListSubscriptionsRequest;
import com.google.android.gms.fitness.request.SubscribeRequest;
import com.google.android.gms.fitness.request.UnsubscribeRequest;
import java.io.IOException;

/* renamed from: zof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zof extends zbv {

    /* renamed from: a */
    final /* synthetic */ zoh f55592a;

    /* renamed from: b */
    private final ytu f55593b;

    public zof(zoh zoh, ytu ytu) {
        this.f55592a = zoh;
        this.f55593b = ytu;
    }

    /* renamed from: a */
    public final void mo30917a(ListSubscriptionsRequest listSubscriptionsRequest) {
        this.f55593b.mo30771a(2, listSubscriptionsRequest);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.c(java.lang.Iterable, bmxz):boolean
     arg types: [bnic, bmxz]
     candidates:
      bnjd.c(java.lang.Iterable, int):java.lang.Iterable
      bnjd.c(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.c(java.lang.Iterable, bmxz):boolean */
    /* renamed from: a */
    public final void mo30918a(SubscribeRequest subscribeRequest) {
        try {
            if (!subscribeRequest.f32318b) {
                sdo.m34974b(true);
                Subscription subscription = subscribeRequest.f32317a;
                sdo.m34959a(subscription);
                ytt ytt = this.f55593b.f54621a;
                zoh zoh = this.f55592a;
                srn srn = zoh.f55595d;
                if (zdk.m45330b(zoh.f55428a, ytt, subscription.mo18981a())) {
                    if (cdyu.m135385c()) {
                        if (bnjd.m109592c((Iterable) this.f55592a.f55598g.mo31337a(new yqe(ytt.f54617a, ywg.m44943a(subscription), 1)), zoe.f55591a)) {
                            if (zdk.m45330b(this.f55592a.f55428a, ytt, DataType.f32035Y)) {
                            }
                        }
                    }
                }
                subscribeRequest.f32317a = null;
            }
            this.f55593b.mo30771a(0, subscribeRequest);
        } catch (IOException e) {
            bnsl bnsl = (bnsl) zoh.f55595d.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("zof", "a", 657, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error subscribing.");
            zcl zcl = subscribeRequest.f32319c;
            sdo.m34959a(zcl);
            zcl.mo30933a(new Status(5008));
        } catch (zdj e2) {
            zcl zcl2 = subscribeRequest.f32319c;
            sdo.m34959a(zcl2);
            zcl2.mo30933a(new Status(5025));
        }
    }

    /* renamed from: a */
    public final void mo30919a(UnsubscribeRequest unsubscribeRequest) {
        this.f55593b.mo30771a(1, unsubscribeRequest);
    }
}
