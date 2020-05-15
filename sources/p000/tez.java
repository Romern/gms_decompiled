package p000;

import android.view.View;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: tez */
final /* synthetic */ class tez implements View.OnClickListener {

    /* renamed from: a */
    private final tfg f45809a;

    public tez(tfg tfg) {
        this.f45809a = tfg;
    }

    public void onClick(View view) {
        tfg tfg = this.f45809a;
        if (!tfg.f45823a) {
            tfg.f45824b.mo26568a(tio.SEE_MORE_BUTTON, tio.SMART_PROFILE_ABOUT_CARD);
            tfg.f45823a = true;
            tfg.f45844v.mo18001b();
            if (tfg.f45834l.getChildCount() > 0) {
                ((TextView) tfg.f45834l.getChildAt(0).findViewById(C0126R.C0129id.text)).setMaxLines(50);
            }
            if (tfg.f45843u.getChildCount() > 0) {
                ((TextView) tfg.f45843u.getChildAt(0).findViewById(C0126R.C0129id.text)).setMaxLines(50);
            }
            if (tfg.f45835m.getChildCount() > 0) {
                tfg.m36904a(tfg.f45826d, tfg.f45835m);
            }
            if (tfg.f45836n.getChildCount() > 0) {
                tfg.m36904a(tfg.f45827e, tfg.f45836n);
            }
            if (tfg.f45837o.getChildCount() > 0) {
                tfg.m36904a(tfg.f45828f, tfg.f45837o);
            }
            if (tfg.f45838p.getChildCount() > 0) {
                tfg.m36904a(tfg.f45829g, tfg.f45838p);
            }
            if (tfg.f45839q.getChildCount() > 0) {
                tfg.m36904a(tfg.f45830h, tfg.f45839q);
            }
            if (tfg.f45840r.getChildCount() > 0) {
                tfg.m36904a(tfg.f45831i, tfg.f45840r);
            }
            if (tfg.f45841s.getChildCount() > 0) {
                tfg.m36904a(tfg.f45832j, tfg.f45841s);
            }
            if (tfg.f45842t.getChildCount() > 0) {
                tfg.m36904a(tfg.f45833k, tfg.f45842t);
                return;
            }
            return;
        }
        tfg.f45824b.mo26568a(tio.SEE_LESS_BUTTON, tio.SMART_PROFILE_ABOUT_CARD);
        tfg.mo26461a();
    }
}
