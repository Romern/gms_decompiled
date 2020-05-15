package p000;

import android.widget.TextView;

/* renamed from: bkic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkic implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bkie f124268a;

    public bkic(bkie bkie) {
        this.f124268a = bkie;
    }

    public final void run() {
        TextView textView = this.f124268a.f124274g;
        bkfr.m105567a(textView, textView.getText());
    }
}
