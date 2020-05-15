package p000;

import com.google.android.gms.backup.d2d.component.D2dSourceChimeraService;

/* renamed from: med */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class med implements bqfp {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        Void voidR = (Void) obj;
        D2dSourceChimeraService.f29027a.mo25414c("App updates successfully paused", new Object[0]);
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        if (th instanceof lzk) {
            D2dSourceChimeraService.f29027a.mo25416d("App updates pause failed because disabled", new Object[0]);
        } else {
            D2dSourceChimeraService.f29027a.mo25417e("App updates pause failed", th, new Object[0]);
        }
    }
}
