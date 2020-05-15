package p000;

import com.google.android.gms.subscribedfeeds.FeedsGcmReceiverChimeraService;
import java.util.concurrent.Callable;

/* renamed from: ashk */
public final /* synthetic */ class ashk implements Callable {

    /* renamed from: a */
    private final FeedsGcmReceiverChimeraService f88976a;

    /* renamed from: b */
    private final String f88977b;

    public ashk(FeedsGcmReceiverChimeraService feedsGcmReceiverChimeraService, String str) {
        this.f88976a = feedsGcmReceiverChimeraService;
        this.f88977b = str;
    }

    public final Object call() {
        FeedsGcmReceiverChimeraService feedsGcmReceiverChimeraService = this.f88976a;
        ((beon) feedsGcmReceiverChimeraService.f108297a.f88971b.mo6606a()).mo60861b(this.f88977b);
        return null;
    }
}
