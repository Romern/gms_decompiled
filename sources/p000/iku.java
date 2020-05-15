package p000;

import android.view.View;
import android.widget.Button;

/* renamed from: iku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class iku implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Button f21247a;

    /* renamed from: b */
    final /* synthetic */ View f21248b;

    /* renamed from: c */
    final /* synthetic */ Button f21249c;

    public iku(Button button, View view, Button button2) {
        this.f21247a = button;
        this.f21248b = view;
        this.f21249c = button2;
    }

    public final void run() {
        if (!igt.m15429a().booleanValue() && this.f21247a.getLineCount() > 1) {
            ikv.m15633a(this.f21248b, this.f21249c, this.f21247a);
        }
    }
}
