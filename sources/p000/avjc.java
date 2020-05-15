package p000;

import com.google.android.gms.udc.DeviceDataUploadOptInFlags;
import java.util.concurrent.Callable;

/* renamed from: avjc */
final /* synthetic */ class avjc implements Callable {

    /* renamed from: a */
    private final bqgg f93265a;

    /* renamed from: b */
    private final bqgg f93266b;

    public avjc(bqgg bqgg, bqgg bqgg2) {
        this.f93265a = bqgg;
        this.f93266b = bqgg2;
    }

    public final Object call() {
        return new DeviceDataUploadOptInFlags(((Boolean) this.f93265a.get()).booleanValue(), ((Boolean) this.f93266b.get()).booleanValue());
    }
}
