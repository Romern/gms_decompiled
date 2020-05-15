package p000;

import android.os.Build;
import android.support.p002v7.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* renamed from: bhgx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhgx extends abz {

    /* renamed from: a */
    final /* synthetic */ bhhp f118631a;

    /* renamed from: b */
    final /* synthetic */ MaterialButton f118632b;

    /* renamed from: c */
    final /* synthetic */ bhhb f118633c;

    public bhgx(bhhb bhhb, bhhp bhhp, MaterialButton materialButton) {
        this.f118633c = bhhb;
        this.f118631a = bhhp;
        this.f118632b = materialButton;
    }

    /* renamed from: a */
    public final void mo270a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            CharSequence text = this.f118632b.getText();
            int i2 = Build.VERSION.SDK_INT;
            recyclerView.announceForAccessibility(text);
        }
    }

    /* renamed from: a */
    public final void mo271a(RecyclerView recyclerView, int i, int i2) {
        int i3;
        if (i >= 0) {
            i3 = this.f118633c.mo63753j().mo84q();
        } else {
            i3 = this.f118633c.mo63753j().mo83p();
        }
        this.f118633c.f118648c = this.f118631a.mo63774f(i3);
        this.f118632b.setText(this.f118631a.mo63774f(i3).f151173b);
    }
}
