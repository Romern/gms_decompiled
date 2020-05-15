package p000;

import android.widget.Button;

/* renamed from: iky */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class iky implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ikz f21273a;

    public iky(ikz ikz) {
        this.f21273a = ikz;
    }

    public final void run() {
        for (Button button : this.f21273a.mo13101b()) {
            button.setEnabled(true);
            button.setAlpha(1.0f);
        }
    }
}
