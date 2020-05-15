package p000;

import android.view.View;
import com.google.android.chimera.Activity;

/* renamed from: atxa */
final /* synthetic */ class atxa implements View.OnClickListener {

    /* renamed from: a */
    private final atxb f91069a;

    public atxa(atxb atxb) {
        this.f91069a = atxb;
    }

    public void onClick(View view) {
        Activity activity = this.f91069a.getActivity();
        if (activity != null && !activity.isFinishing()) {
            activity.finish();
        }
    }
}
