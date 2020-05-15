package p000;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.common.data.BitmapTeleporter;

/* renamed from: nns */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nns implements opz {

    /* renamed from: a */
    final /* synthetic */ noj f36113a;

    /* renamed from: b */
    final /* synthetic */ nrk f36114b;

    public nns(noj noj, nrk nrk) {
        this.f36113a = noj;
        this.f36114b = nrk;
    }

    /* renamed from: a */
    public final void mo21217a(Bitmap bitmap) {
        try {
            BitmapTeleporter bitmapTeleporter = new BitmapTeleporter(bitmap);
            noj noj = this.f36113a;
            bnsn bnsn = noj.f36155b;
            bitmapTeleporter.mo17760a(noj.f36160E.getCacheDir());
            this.f36114b.mo21484a(bitmapTeleporter);
        } catch (RemoteException e) {
            bnsi b = noj.f36155b.mo68387b();
            b.mo68432a("nns", "a", 1540, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Client died whilst trying to return screenshot");
        }
    }
}
