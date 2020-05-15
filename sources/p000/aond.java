package p000;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.CheckBox;
import android.widget.TextView;

/* renamed from: aond */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aond extends LinkMovementMethod implements Handler.Callback {

    /* renamed from: a */
    private final Handler f78565a = new adzt(this);

    /* renamed from: b */
    private final CheckBox f78566b;

    public aond(CheckBox checkBox) {
        this.f78566b = checkBox;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.f78566b.setChecked(false);
            return true;
        } else if (i != 1) {
            return false;
        } else {
            this.f78566b.setChecked(true);
            return true;
        }
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        Rect rect = new Rect(textView.getCompoundPaddingLeft(), textView.getPaddingTop(), textView.getWidth() - textView.getCompoundPaddingRight(), textView.getHeight() - textView.getPaddingBottom());
        boolean onTouchEvent = super.onTouchEvent(textView, spannable, motionEvent);
        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        if (onTouchEvent) {
            this.f78565a.sendEmptyMessage(this.f78566b.isChecked() ? 1 : 0);
        }
        return onTouchEvent;
    }
}
