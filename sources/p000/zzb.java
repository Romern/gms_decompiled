package p000;

import android.os.RemoteException;
import com.google.android.gms.fonts.FontFetchResult;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: zzb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zzb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bqgg f56238a;

    /* renamed from: b */
    final /* synthetic */ zzc f56239b;

    public zzb(zzc zzc, bqgg bqgg) {
        this.f56239b = zzc;
        this.f56238a = bqgg;
    }

    public final void run() {
        FontFetchResult fontFetchResult = zzc.f56240a;
        if (this.f56238a.isCancelled()) {
            zyh.m46683c("GetFontOperation", "%s cancelled", this.f56239b.f56242c);
            fontFetchResult = zzc.f56241b;
        } else if (this.f56238a.isDone()) {
            try {
                fontFetchResult = (FontFetchResult) this.f56238a.get(0, TimeUnit.SECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                zyh.m46681a("GetFontOperation", e, "Fetch %s failed get when marked done. Should not occur.", this.f56239b.f56242c);
            }
            zyh.m46683c("GetFontOperation", "%s result %s", this.f56239b.f56242c, fontFetchResult);
        }
        try {
            this.f56239b.f56243d.mo31584a(fontFetchResult);
        } catch (RemoteException e2) {
            zyh.m46680a("GetFontOperation", "Lost remote: %s", e2.getMessage());
        }
    }
}
