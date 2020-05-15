package p000;

import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraActivity;

/* renamed from: ajoy */
public final /* synthetic */ class ajoy implements View.OnClickListener {

    /* renamed from: a */
    private final ReceiveSurfaceChimeraActivity f71078a;

    /* renamed from: b */
    private final MenuItem f71079b;

    public ajoy(ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity, MenuItem menuItem) {
        this.f71078a = receiveSurfaceChimeraActivity;
        this.f71079b = menuItem;
    }

    public void onClick(View view) {
        this.f71078a.onOptionsItemSelected(this.f71079b);
    }
}
