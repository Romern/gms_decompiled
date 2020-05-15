package p000;

import android.content.Intent;
import android.view.View;
import com.google.android.chimera.Activity;

/* renamed from: aswb */
final /* synthetic */ class aswb implements View.OnClickListener {

    /* renamed from: a */
    private final Activity f89833a;

    /* renamed from: b */
    private final Intent f89834b;

    public aswb(Activity activity, Intent intent) {
        this.f89833a = activity;
        this.f89834b = intent;
    }

    public void onClick(View view) {
        Activity activity = this.f89833a;
        Intent intent = this.f89834b;
        srn srn = aswe.f89837b;
        activity.startActivity(intent);
    }
}
