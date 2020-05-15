package p000;

import android.os.IBinder;
import com.google.android.gms.fitness.service.proxy.FitProxyChimeraBroker;

/* renamed from: znu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class znu extends zob {

    /* renamed from: a */
    final /* synthetic */ FitProxyChimeraBroker f55574a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public znu(FitProxyChimeraBroker fitProxyChimeraBroker) {
        super(fitProxyChimeraBroker);
        this.f55574a = fitProxyChimeraBroker;
    }

    /* renamed from: a */
    public final void mo31285a(IBinder iBinder) {
        this.f55574a.f32401i = (zma) iBinder;
    }
}
