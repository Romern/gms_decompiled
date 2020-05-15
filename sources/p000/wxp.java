package p000;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: wxp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wxp extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ wxu f51547a;

    public wxp(wxu wxu) {
        this.f51547a = wxu;
    }

    public void onClick(View view) {
        if (this.f51547a.getActivity() instanceof wws) {
            ((wws) this.f51547a.getActivity()).mo18609g();
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
