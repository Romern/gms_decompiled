package p000;

import android.os.IBinder;
import com.google.android.gms.fitness.service.proxy.FitProxyChimeraBroker;

/* renamed from: znw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class znw extends zob {

    /* renamed from: a */
    final /* synthetic */ FitProxyChimeraBroker f55576a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public znw(FitProxyChimeraBroker fitProxyChimeraBroker) {
        super(fitProxyChimeraBroker);
        this.f55576a = fitProxyChimeraBroker;
    }

    /* renamed from: a */
    public final void mo31285a(IBinder iBinder) {
        this.f55576a.f32403k = (zma) iBinder;
    }
}
