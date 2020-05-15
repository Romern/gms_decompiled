package p000;

import android.graphics.Bitmap;
import android.view.MenuItem;
import com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraActivity;

/* renamed from: ajoq */
final /* synthetic */ class ajoq implements aubw {

    /* renamed from: a */
    private final ReceiveSurfaceChimeraActivity f71069a;

    /* renamed from: b */
    private final MenuItem f71070b;

    public ajoq(ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity, MenuItem menuItem) {
        this.f71069a = receiveSurfaceChimeraActivity;
        this.f71070b = menuItem;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity = this.f71069a;
        this.f71070b.setIcon(akia.m59779a(receiveSurfaceChimeraActivity, (Bitmap) obj));
        receiveSurfaceChimeraActivity.mo38632a(false);
    }
}
