package p000;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.wearable.internal.DeleteDataItemsResponse;
import java.util.concurrent.ExecutionException;

/* renamed from: ayhl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayhl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ axxo f97598a;

    /* renamed from: b */
    final /* synthetic */ ayhm f97599b;

    public ayhl(ayhm ayhm, axxo axxo) {
        this.f97599b = ayhm;
        this.f97598a = axxo;
    }

    public final void run() {
        try {
            this.f97599b.f97601d.mo53443a(new DeleteDataItemsResponse(0, ((axxp) this.f97598a.get()).f96670a));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } catch (ExecutionException e2) {
            try {
                String valueOf = String.valueOf(this.f97599b.f97602e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
                sb.append("deleteDataItems: exception during processing: ");
                sb.append(valueOf);
                Log.e("WearableService", sb.toString(), e2);
                this.f97599b.f97601d.mo53443a(new DeleteDataItemsResponse(8, -1));
            } catch (RemoteException e3) {
            }
        }
    }
}
