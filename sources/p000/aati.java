package p000;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.gms.googlehelp.common.HelpConfig;

/* renamed from: aati */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aati extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ abbi f56544a;

    /* renamed from: b */
    final /* synthetic */ HelpConfig f56545b;

    public aati(abbi abbi, HelpConfig helpConfig) {
        this.f56544a = abbi;
        this.f56545b = helpConfig;
    }

    public void onClick(View view) {
        abht.m47727a(this.f56544a, Uri.parse(ceeg.f182447a.mo6606a().mo78971aL()), this.f56545b, this.f56544a.f56987z);
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
