package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/* renamed from: bjab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjab extends ClickableSpan {

    /* renamed from: a */
    public final String f122404a;

    public bjab(String str) {
        this.f122404a = str;
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    public void onClick(View view) {
        bizz bizz;
        if (!(view instanceof bjaa) || !((bjaa) view).mo64931a()) {
            Context context = view.getContext();
            while (true) {
                if (!(context instanceof bizz)) {
                    if (!(context instanceof ContextWrapper)) {
                        bizz = null;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    bizz = (bizz) context;
                    break;
                }
            }
            if (bizz == null) {
                Log.w("LinkSpan", "Dropping click event. No listener attached.");
                if (!(view instanceof TextView)) {
                    CharSequence text = ((TextView) view).getText();
                    if (text instanceof Spannable) {
                        Selection.setSelection((Spannable) text, 0);
                        return;
                    }
                    return;
                }
                return;
            }
            bizz.mo58955a(this);
        }
        int i = Build.VERSION.SDK_INT;
        view.cancelPendingInputEvents();
        if (!(view instanceof TextView)) {
        }
    }
}
