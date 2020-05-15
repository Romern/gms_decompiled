package p000;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Binder;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.service.ble.FitBleChimeraBroker;
import java.util.concurrent.ExecutorService;

/* renamed from: zmn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zmn extends zlz {

    /* renamed from: d */
    public static final srn f55470d = zvt.m46581a();

    /* renamed from: j */
    private static final yuw f55471j = yuq.m44880a(zml.f55468a);

    /* renamed from: e */
    public final bqgj f55472e;

    /* renamed from: f */
    public final zhj f55473f;

    /* renamed from: g */
    public final zqz f55474g;

    /* renamed from: h */
    public final bmxv f55475h;

    /* renamed from: i */
    public final ytp f55476i;

    /* renamed from: k */
    private final yzt f55477k;

    public zmn(FitBleChimeraBroker fitBleChimeraBroker, String str, ExecutorService executorService, yzs yzs) {
        super(fitBleChimeraBroker, str, yzs);
        this.f55472e = bqgs.m112811a(executorService);
        this.f55477k = yzs.mo30891k();
        this.f55473f = yzs.mo30884g();
        this.f55474g = yzs.mo30878d(this.f55429b);
        this.f55475h = yzs.mo30883g(this.f55429b);
        this.f55476i = yzs.mo30887i();
    }

    /* renamed from: c */
    public static boolean m45765c(ytt ytt) {
        return ((bnic) f55471j.mo30787a()).isEmpty() || ((bnic) f55471j.mo30787a()).contains(ytt.f54617a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Binder mo31233a(ytu ytu) {
        return new zbg(this, ytu);
    }

    /* renamed from: a */
    public final void mo31236a(String str) {
    }

    /* renamed from: b */
    public final Status mo31258b() {
        if (!this.f55477k.mo30896a()) {
            return new Status(5007);
        }
        zhl zhl = this.f55477k.f54880a;
        if (zhl != null && zhl.mo31123a()) {
            return Status.f30107a;
        }
        return new Status(5014, "Bluetooth must be enabled", PendingIntent.getActivity(this.f55428a, 0, new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 134217728));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ytv mo31234a() {
        return new zmm(this);
    }
}
