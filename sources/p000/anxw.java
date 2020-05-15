package p000;

import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: anxw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anxw extends ClickableSpan {

    /* renamed from: a */
    private final Activity f77851a;

    /* renamed from: b */
    private final anxu f77852b;

    /* renamed from: c */
    private final anxv f77853c;

    public anxw(Activity activity, anxu anxu, anxv anxv) {
        this.f77851a = activity;
        this.f77852b = anxu;
        this.f77853c = anxv;
    }

    public void onClick(View view) {
        anxv anxv = this.f77853c;
        if (anxv != null) {
            shz.m35338a(anxv.f77846a, anxv.f77847b, anxv.f77848c, anxv.f77849d, anxv.f77850e);
        }
        this.f77851a.startActivityForResult(this.f77852b.f77845a, 100);
    }

    public final void updateDrawState(TextPaint textPaint) {
        Resources resources = this.f77851a.getResources();
        textPaint.setUnderlineText(resources.getBoolean(C0126R.bool.plus_links_underlined));
        textPaint.setColor(resources.getColor(C0126R.color.plus_oob_link_color));
    }
}
