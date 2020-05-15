package p000;

import android.content.Intent;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: iap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class iap extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ iaq f20643a;

    public iap(iaq iaq) {
        this.f20643a = iaq;
    }

    public void onClick(View view) {
        iaq iaq = this.f20643a;
        iaq.f20644c.mo12886a(iaq.f13641a.f1882a, ibh.m15193j(iaq.f20645d));
        Intent intent = new Intent("android.settings.REQUEST_SET_AUTOFILL_SERVICE");
        intent.setData(Uri.parse("package:com.google.android.gms.auth.api.phone"));
        view.getContext().startActivity(intent);
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
