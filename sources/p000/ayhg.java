package p000;

import android.os.RemoteException;
import com.google.android.gms.wearable.internal.PutDataResponse;
import java.util.concurrent.ExecutionException;

/* renamed from: ayhg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayhg implements Runnable {

    /* renamed from: a */
    final /* synthetic */ axxr f97584a;

    /* renamed from: b */
    final /* synthetic */ ayhh f97585b;

    public ayhg(ayhh ayhh, axxr axxr) {
        this.f97585b = ayhh;
        this.f97584a = axxr;
    }

    public final void run() {
        try {
            this.f97585b.f97587d.mo53458a(new PutDataResponse(0, axxj.m83473a(((axxs) this.f97584a.get()).f96677a)));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } catch (ExecutionException e2) {
            try {
                this.f97585b.f97587d.mo53458a(new PutDataResponse(8, null));
            } catch (RemoteException e3) {
            }
        }
    }
}
