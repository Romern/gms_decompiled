package p000;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: php */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class php implements TextView.OnEditorActionListener {

    /* renamed from: a */
    final /* synthetic */ phq f39134a;

    public php(phq phq) {
        this.f39134a = phq;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        String a = this.f39134a.mo23093a();
        if (i != 6 || !phj.m30330a(a)) {
            return false;
        }
        this.f39134a.mo23094a(a);
        return true;
    }
}
