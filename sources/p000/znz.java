package p000;

import android.os.IBinder;
import com.google.android.gms.fitness.service.proxy.FitProxyChimeraBroker;

/* renamed from: znz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class znz extends zob {

    /* renamed from: a */
    final /* synthetic */ FitProxyChimeraBroker f55579a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public znz(FitProxyChimeraBroker fitProxyChimeraBroker) {
        super(fitProxyChimeraBroker);
        this.f55579a = fitProxyChimeraBroker;
    }

    /* renamed from: a */
    public final void mo31285a(IBinder iBinder) {
        this.f55579a.f32406n = (zma) iBinder;
    }
}
