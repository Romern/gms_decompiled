package p000;

import android.view.View;
import com.google.android.chimera.Activity;

/* renamed from: atqf */
final /* synthetic */ class atqf implements View.OnClickListener {

    /* renamed from: a */
    private final atqi f90654a;

    /* renamed from: b */
    private final Activity f90655b;

    public atqf(atqi atqi, Activity activity) {
        this.f90654a = atqi;
        this.f90655b = activity;
    }

    public void onClick(View view) {
        atqi atqi = this.f90654a;
        atqi.mo50119a(this.f90655b, -1);
        atqi.dismiss();
    }
}
