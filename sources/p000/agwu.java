package p000;

import android.view.ViewTreeObserver;
import android.widget.TextView;

/* renamed from: agwu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agwu implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    private final TextView f66754a;

    public agwu(TextView textView) {
        this.f66754a = textView;
    }

    public final void onGlobalLayout() {
        TextView textView = this.f66754a;
        textView.setMaxLines(textView.getHeight() / this.f66754a.getLineHeight());
    }
}
