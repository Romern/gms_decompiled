package p000;

import android.view.View;
import com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraActivity;

/* renamed from: ajob */
public final /* synthetic */ class ajob implements View.OnClickListener {

    /* renamed from: a */
    private final ReceiveSurfaceChimeraActivity f71049a;

    public ajob(ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity) {
        this.f71049a = receiveSurfaceChimeraActivity;
    }

    public void onClick(View view) {
        this.f71049a.finish();
    }
}
