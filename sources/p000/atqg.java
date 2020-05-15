package p000;

import android.view.View;
import com.google.android.chimera.Activity;

/* renamed from: atqg */
final /* synthetic */ class atqg implements View.OnClickListener {

    /* renamed from: a */
    private final atqi f90656a;

    /* renamed from: b */
    private final Activity f90657b;

    public atqg(atqi atqi, Activity activity) {
        this.f90656a = atqi;
        this.f90657b = activity;
    }

    public void onClick(View view) {
        atqi atqi = this.f90656a;
        atqi.mo50119a(this.f90657b, -2);
        atqi.dismiss();
    }
}
