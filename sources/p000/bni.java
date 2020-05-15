package p000;

import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;

/* renamed from: bni */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bni extends LinkMovementMethod {

    /* renamed from: a */
    public boolean f5190a = false;

    /* renamed from: b */
    public MotionEvent f5191b;

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        this.f5191b = motionEvent;
        boolean onTouchEvent = super.onTouchEvent(textView, spannable, motionEvent);
        if (motionEvent.getAction() == 0) {
            this.f5190a = Selection.getSelectionStart(spannable) != -1;
        } else {
            this.f5190a = onTouchEvent;
        }
        return onTouchEvent;
    }
}
