package p000;

import android.view.View;
import android.widget.Button;

/* renamed from: ikt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ikt implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Button f21244a;

    /* renamed from: b */
    final /* synthetic */ View f21245b;

    /* renamed from: c */
    final /* synthetic */ Button f21246c;

    public ikt(Button button, View view, Button button2) {
        this.f21244a = button;
        this.f21245b = view;
        this.f21246c = button2;
    }

    public final void run() {
        if (!igt.m15429a().booleanValue() && this.f21244a.getLineCount() > 1) {
            ikv.m15633a(this.f21245b, this.f21244a, this.f21246c);
        }
    }
}
