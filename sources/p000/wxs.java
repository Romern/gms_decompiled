package p000;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.chimera.Activity;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackChimeraActivity;

/* renamed from: wxs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wxs extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ wxu f51551a;

    public wxs(wxu wxu) {
        this.f51551a = wxu;
    }

    public void onClick(View view) {
        String str;
        ErrorReport j = FeedbackChimeraActivity.m23367j();
        try {
            wxu wxu = this.f51551a;
            if (j == null) {
                str = "";
            } else {
                str = j.f31511B;
            }
            Activity activity = wxu.getActivity();
            if (activity != null) {
                bebk.m91722a(wxu, activity, str);
                return;
            }
            String valueOf = String.valueOf(wxu);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
            sb.append("Fragment ");
            sb.append(valueOf);
            sb.append(" not attached to Activity");
            throw new IllegalStateException(sb.toString());
        } catch (bebj e) {
            this.f51551a.mo29555b(cdtr.f181715a.mo6606a().mo78323v());
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
