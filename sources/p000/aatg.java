package p000;

import android.content.Context;
import android.content.Intent;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.gms.googlehelp.common.HelpConfig;

/* renamed from: aatg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aatg extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ aasf f56538a;

    /* renamed from: b */
    final /* synthetic */ HelpConfig f56539b;

    /* renamed from: c */
    final /* synthetic */ bzps f56540c;

    public aatg(aasf aasf, HelpConfig helpConfig, bzps bzps) {
        this.f56538a = aasf;
        this.f56539b = helpConfig;
        this.f56540c = bzps;
    }

    public void onClick(View view) {
        Intent intent = new Intent();
        aasf aasf = this.f56538a;
        aasf.mo18630k();
        Intent putExtra = intent.setClassName((Context) aasf, "com.google.android.gms.feedback.PreviewActivity").putExtra("EXTRA_HELP_CONFIG", this.f56539b).putExtra("EXTRA_START_TICK", this.f56539b.f78819S);
        aasf aasf2 = this.f56538a;
        aasf2.mo18630k();
        ((Context) aasf2).startActivity(putExtra);
        abcx.m47481a(this.f56538a, this.f56540c);
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
