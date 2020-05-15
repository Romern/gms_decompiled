package p000;

import android.content.Intent;
import android.view.View;
import com.google.android.chimera.Activity;

/* renamed from: aqvg */
final /* synthetic */ class aqvg implements View.OnClickListener {

    /* renamed from: a */
    private final aqvk f86905a;

    /* renamed from: b */
    private final Intent f86906b;

    /* renamed from: c */
    private final boolean f86907c;

    public aqvg(aqvk aqvk, Intent intent, boolean z) {
        this.f86905a = aqvk;
        this.f86906b = intent;
        this.f86907c = z;
    }

    public void onClick(View view) {
        aqvk aqvk = this.f86905a;
        Intent intent = this.f86906b;
        boolean z = this.f86907c;
        if (intent.resolveActivity(aqvk.f86916a.getPackageManager()) != null) {
            aqvk.f86917b.mo26568a(tio.HANGOUT_BUTTON, tio.SMART_PROFILE_HEADER);
            Activity activity = aqvk.f86916a;
            activity.startActivity(aqqk.m71970a(activity, aqvk.f86919d, aqvk.f86918c, z));
        }
    }
}
