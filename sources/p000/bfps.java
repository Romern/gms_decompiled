package p000;

import android.os.RemoteException;
import com.google.android.gms.location.internal.FusedLocationProviderResult;

/* renamed from: bfps */
final /* synthetic */ class bfps {

    /* renamed from: a */
    private final aejv f114810a;

    public bfps(aejv aejv) {
        this.f114810a = aejv;
    }

    /* renamed from: a */
    public final void mo62108a() {
        aejv aejv = this.f114810a;
        String[] strArr = bfqm.f114869a;
        try {
            aejv.mo34143a(FusedLocationProviderResult.f79417a);
        } catch (RemoteException e) {
            bftx.m97877a("Client died before delivering flush location result", new Object[0]);
        }
    }
}
