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

@Deprecated
/* renamed from: bmo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmo extends ClickableSpan {
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    public void onClick(View view) {
        bmm bmm;
        if (!(view instanceof bmn) || !((bmn) view).mo3283a()) {
            Context context = view.getContext();
            while (true) {
                if (!(context instanceof bmm)) {
                    if (!(context instanceof ContextWrapper)) {
                        bmm = null;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    bmm = (bmm) context;
                    break;
                }
            }
            if (bmm == null) {
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
            bmm.mo3282a();
        }
        int i = Build.VERSION.SDK_INT;
        view.cancelPendingInputEvents();
        if (!(view instanceof TextView)) {
        }
    }
}
