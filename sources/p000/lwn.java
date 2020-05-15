package p000;

import java.util.concurrent.ExecutionException;

/* renamed from: lwn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lwn {

    /* renamed from: a */
    public final lvx f33121a;

    public lwn(lvx lvx) {
        this.f33121a = lvx;
    }

    /* renamed from: a */
    public static final bzsb m24565a(bzsq bzsq) {
        lwm lwm = new lwm();
        bzsq.mo74568a(lwm.f33120c, 10);
        bqgy bqgy = lwm.f33119b;
        bzsq.mo74567a();
        try {
            return (bzsb) bqgy.get();
        } catch (ExecutionException e) {
            if (e.getCause() instanceof bzss) {
                throw ((bzss) e.getCause());
            }
            throw e;
        }
    }
}
