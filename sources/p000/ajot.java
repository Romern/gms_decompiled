package p000;

import android.view.View;
import com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraActivity;

/* renamed from: ajot */
public final /* synthetic */ class ajot implements View.OnClickListener {

    /* renamed from: a */
    private final ReceiveSurfaceChimeraActivity f71073a;

    public ajot(ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity) {
        this.f71073a = receiveSurfaceChimeraActivity;
    }

    public void onClick(View view) {
        this.f71073a.finish();
    }
}
