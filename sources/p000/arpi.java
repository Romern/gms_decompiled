package p000;

import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: arpi */
final /* synthetic */ class arpi implements aubt {

    /* renamed from: a */
    private final arps f88077a;

    public arpi(arps arps) {
        this.f88077a = arps;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        arps arps = this.f88077a;
        arps.f88090a.mo25417e("Failed to enable target mode.", exc, new Object[0]);
        if (exc instanceof rjp) {
            int a = ((rjp) exc).mo24655a();
            arps.f88098i.f87879b.add(Integer.valueOf(a));
            Activity activity = arps.getActivity();
            if (activity != null && a != 10551) {
                Toast.makeText(activity, (int) C0126R.string.common_something_went_wrong, 1).show();
                activity.finish();
            }
        }
    }
}
