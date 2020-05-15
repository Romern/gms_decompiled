package p000;

import android.content.Context;
import android.os.Build;
import android.webkit.WebView;

/* renamed from: bjyr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bjyr extends WebView {
    public bjyr(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = Build.VERSION.SDK_INT;
    }

    public final boolean onCheckIsTextEditor() {
        return true;
    }
}
