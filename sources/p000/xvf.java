package p000;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.view.View;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.fido.fido2.p044ui.PolluxChimeraActivity;

/* renamed from: xvf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xvf implements Runnable {

    /* renamed from: a */
    final /* synthetic */ PolluxChimeraActivity f53217a;

    public xvf(PolluxChimeraActivity polluxChimeraActivity) {
        this.f53217a = polluxChimeraActivity;
    }

    public final void run() {
        View findViewById = this.f53217a.findViewById(C0126R.C0129id.fido_paask_vol_down_complete);
        findViewById.setVisibility(0);
        ((AnimatedVectorDrawable) ((ImageView) findViewById).getDrawable()).start();
    }
}
