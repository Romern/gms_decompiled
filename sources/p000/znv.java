package p000;

import android.os.IBinder;
import com.google.android.gms.fitness.service.proxy.FitProxyChimeraBroker;

/* renamed from: znv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class znv extends zob {

    /* renamed from: a */
    final /* synthetic */ FitProxyChimeraBroker f55575a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public znv(FitProxyChimeraBroker fitProxyChimeraBroker) {
        super(fitProxyChimeraBroker);
        this.f55575a = fitProxyChimeraBroker;
    }

    /* renamed from: a */
    public final void mo31285a(IBinder iBinder) {
        this.f55575a.f32402j = (zma) iBinder;
    }
}
