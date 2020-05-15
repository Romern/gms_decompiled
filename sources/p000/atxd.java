package p000;

import android.view.View;
import com.google.android.chimera.Activity;

/* renamed from: atxd */
final /* synthetic */ class atxd implements View.OnClickListener {

    /* renamed from: a */
    private final atxg f91071a;

    public atxd(atxg atxg) {
        this.f91071a = atxg;
    }

    public void onClick(View view) {
        Activity activity = this.f91071a.getActivity();
        if ((activity instanceof atxf) && !activity.isFinishing()) {
            ((atxf) activity).mo50299e();
        }
    }
}
