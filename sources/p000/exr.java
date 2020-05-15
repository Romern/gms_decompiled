package p000;

import com.google.android.chimera.Activity;

/* renamed from: exr */
final /* synthetic */ class exr implements exw {

    /* renamed from: a */
    private final exx f15989a;

    public exr(exx exx) {
        this.f15989a = exx;
    }

    /* renamed from: a */
    public final void mo10562a() {
        Activity activity = this.f15989a.getActivity();
        bmzi bmzi = eot.f15436a;
        if (adyf.f62895b != null) {
            boolean booleanValue = adyf.f62895b.booleanValue();
            adyf.f62895b = null;
            if (booleanValue != adyf.m51386a(bmzi)) {
                activity.recreate();
            }
        }
    }
}
