package p000;

import android.view.View;
import com.google.android.chimera.Activity;

/* renamed from: atsk */
final /* synthetic */ class atsk implements View.OnClickListener {

    /* renamed from: a */
    private final atso f90771a;

    /* renamed from: b */
    private final bzua f90772b;

    public atsk(atso atso, bzua bzua) {
        this.f90771a = atso;
        this.f90772b = bzua;
    }

    public void onClick(View view) {
        bzub bzub;
        atso atso = this.f90771a;
        bzua bzua = this.f90772b;
        Activity activity = atso.getActivity();
        if (activity != null) {
            String stringExtra = activity.getIntent().getStringExtra("theme");
            asxx asxx = new asxx();
            asxx.mo49651b(true);
            asxx.mo49646a();
            asxx.mo49650b(stringExtra);
            if (bzua.f171393a == 4) {
                asxx.mo49648a(true);
                if (bzua.f171393a == 4) {
                    bzub = (bzub) bzua.f171394b;
                } else {
                    bzub = bzub.f171399d;
                }
                asxx.mo49649a(bzub.f171403c.mo73780k());
            }
            atso.f90782h.mo24717a(atso.getActivity().getContainerActivity(), 1300, asxx);
        }
    }
}
