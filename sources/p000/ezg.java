package p000;

import android.view.View;
import com.felicanetworks.mfc.C0126R;

/* renamed from: ezg */
final /* synthetic */ class ezg implements C0038ax {

    /* renamed from: a */
    private final ezm f16087a;

    public ezg(ezm ezm) {
        this.f16087a = ezm;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        ezm ezm = this.f16087a;
        ffk ffk = (ffk) obj;
        if (ffr.m11620a(ffk)) {
            String string = ezm.getResources().getString(C0126R.string.as_account_spinner_a11y_description, ffk.f16458a);
            ezm.f16105f.setContentDescription(string);
            View view = ezm.f16103d;
            if (view != null) {
                view.setContentDescription(string);
            }
            ezm.f16105f.setImportantForAccessibility(0);
            return;
        }
        ezm.f16105f.setImportantForAccessibility(2);
    }
}
