package p000;

import android.os.IBinder;
import com.google.android.gms.fitness.service.proxy.FitProxyChimeraBroker;

/* renamed from: zny */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zny extends zob {

    /* renamed from: a */
    final /* synthetic */ FitProxyChimeraBroker f55578a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zny(FitProxyChimeraBroker fitProxyChimeraBroker) {
        super(fitProxyChimeraBroker);
        this.f55578a = fitProxyChimeraBroker;
    }

    /* renamed from: a */
    public final void mo31285a(IBinder iBinder) {
        this.f55578a.f32405m = (zma) iBinder;
    }
}
