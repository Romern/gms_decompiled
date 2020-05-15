package p000;

import android.view.View;
import com.google.android.chimera.Activity;

/* renamed from: wha */
final /* synthetic */ class wha implements View.OnClickListener {

    /* renamed from: a */
    private final Activity f50632a;

    public wha(Activity activity) {
        this.f50632a = activity;
    }

    public void onClick(View view) {
        this.f50632a.onBackPressed();
    }
}
