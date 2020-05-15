package p000;

import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;

/* renamed from: oxa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class oxa extends LinkMovementMethod {

    /* renamed from: a */
    final /* synthetic */ oxb f38550a;

    public oxa(oxb oxb) {
        this.f38550a = oxb;
    }

    /* access modifiers changed from: protected */
    public final boolean handleMovementKey(TextView textView, Spannable spannable, int i, int i2, KeyEvent keyEvent) {
        oxb oxb = this.f38550a;
        int i3 = oxb.f38551a;
        oxb.mo22734a();
        return super.handleMovementKey(textView, spannable, i, i2, keyEvent);
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        oxb oxb = this.f38550a;
        int i = oxb.f38551a;
        oxb.mo22734a();
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
