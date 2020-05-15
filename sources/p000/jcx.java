package p000;

import com.google.android.gms.auth.folsom.p028ui.GenericChimeraActivity;

/* renamed from: jcx */
public final /* synthetic */ class jcx implements C0038ax {

    /* renamed from: a */
    private final GenericChimeraActivity f22201a;

    public jcx(GenericChimeraActivity genericChimeraActivity) {
        this.f22201a = genericChimeraActivity;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        GenericChimeraActivity genericChimeraActivity = this.f22201a;
        int intValue = ((Integer) obj).intValue();
        if (intValue == -1) {
            jdg.m16541a(2);
        }
        genericChimeraActivity.setResult(intValue);
        genericChimeraActivity.finish();
    }
}
