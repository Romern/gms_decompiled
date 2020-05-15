package p000;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.view.View;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.fido.fido2.p044ui.PolluxChimeraActivity;

/* renamed from: xvg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xvg implements Runnable {

    /* renamed from: a */
    final /* synthetic */ PolluxChimeraActivity f53218a;

    public xvg(PolluxChimeraActivity polluxChimeraActivity) {
        this.f53218a = polluxChimeraActivity;
    }

    public final void run() {
        this.f53218a.findViewById(C0126R.C0129id.fido_strongbox_prompt_content_layout).setVisibility(8);
        View findViewById = this.f53218a.findViewById(C0126R.C0129id.fido_paask_checkmark);
        findViewById.setVisibility(0);
        ((AnimatedVectorDrawable) ((ImageView) findViewById).getDrawable()).start();
    }
}
