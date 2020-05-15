package p000;

import android.accounts.Account;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.gms.googlehelp.common.HelpConfig;

/* renamed from: aath */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aath extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ HelpConfig f56541a;

    /* renamed from: b */
    final /* synthetic */ abbi f56542b;

    /* renamed from: c */
    final /* synthetic */ bebk f56543c;

    public aath(HelpConfig helpConfig, bebk bebk, abbi abbi) {
        this.f56541a = helpConfig;
        this.f56543c = bebk;
        this.f56542b = abbi;
    }

    public void onClick(View view) {
        Account account = this.f56541a.f78829d;
        try {
            bebk.m91721a(this.f56542b, account == null ? "" : account.name);
        } catch (bebj e) {
            abht.m47727a(this.f56542b, Uri.parse(ceeg.f182447a.mo6606a().mo79002av()), this.f56541a, this.f56542b.f56987z);
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
