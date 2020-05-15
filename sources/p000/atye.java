package p000;

import android.content.Context;
import android.content.Intent;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.felicanetworks.mfc.C0126R;

/* renamed from: atye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atye extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ Context f91107a;

    /* renamed from: b */
    final /* synthetic */ Intent f91108b;

    public atye(Context context, Intent intent) {
        this.f91107a = context;
        this.f91108b = intent;
    }

    public void onClick(View view) {
        this.f91107a.startActivity(this.f91108b);
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setColor(this.f91107a.getResources().getColor(C0126R.color.tp_action_color));
    }
}
