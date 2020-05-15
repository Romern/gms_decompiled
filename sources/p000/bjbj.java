package p000;

import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;

/* renamed from: bjbj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjbj extends LinkMovementMethod {

    /* renamed from: a */
    public boolean f122469a = false;

    /* renamed from: b */
    public MotionEvent f122470b;

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        this.f122470b = motionEvent;
        boolean onTouchEvent = super.onTouchEvent(textView, spannable, motionEvent);
        if (motionEvent.getAction() == 0) {
            this.f122469a = Selection.getSelectionStart(spannable) != -1;
        } else {
            this.f122469a = onTouchEvent;
        }
        return onTouchEvent;
    }
}
