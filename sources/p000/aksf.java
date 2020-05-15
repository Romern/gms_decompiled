package p000;

import android.widget.TextView;

/* renamed from: aksf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aksf implements Runnable {

    /* renamed from: a */
    final String f72611a;

    /* renamed from: b */
    final TextView f72612b;

    public aksf(String str, TextView textView) {
        this.f72611a = str;
        this.f72612b = textView;
    }

    public final void run() {
        this.f72612b.setText(this.f72611a);
    }
}
