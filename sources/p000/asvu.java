package p000;

import android.view.View;
import com.google.android.chimera.Activity;

/* renamed from: asvu */
final /* synthetic */ class asvu implements View.OnClickListener {

    /* renamed from: a */
    private final aswe f89825a;

    public asvu(aswe aswe) {
        this.f89825a = aswe;
    }

    public void onClick(View view) {
        Activity activity = this.f89825a.getActivity();
        if (activity instanceof atxi) {
            ((atxi) activity).mo50301e();
        }
    }
}
