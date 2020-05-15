package p000;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.gms.update.phone.PopupDialogChimeraActivity;

/* renamed from: avqr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avqr extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ PopupDialogChimeraActivity f93801a;

    public avqr(PopupDialogChimeraActivity popupDialogChimeraActivity) {
        this.f93801a = popupDialogChimeraActivity;
    }

    public void onClick(View view) {
        PopupDialogChimeraActivity popupDialogChimeraActivity = this.f93801a;
        int i = PopupDialogChimeraActivity.f109500b;
        popupDialogChimeraActivity.mo59676a(18);
        PopupDialogChimeraActivity popupDialogChimeraActivity2 = this.f93801a;
        popupDialogChimeraActivity2.mo59677a(popupDialogChimeraActivity2.getIntent().getStringExtra("device_detail_update_url"));
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
