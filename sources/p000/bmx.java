package p000;

import android.util.Log;
import android.widget.ScrollView;
import com.android.setupwizardlib.view.BottomScrollView;

@Deprecated
/* renamed from: bmx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmx {
    public bmx(ScrollView scrollView) {
        if (scrollView instanceof BottomScrollView) {
            BottomScrollView bottomScrollView = (BottomScrollView) scrollView;
            return;
        }
        String valueOf = String.valueOf(scrollView);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
        sb.append("Cannot set non-BottomScrollView. Found=");
        sb.append(valueOf);
        Log.w("ScrollViewDelegate", sb.toString());
    }
}
