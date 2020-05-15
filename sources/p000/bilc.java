package p000;

import android.view.View;

/* renamed from: bilc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bilc implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ aepm f120816a;

    /* renamed from: b */
    final /* synthetic */ int f120817b;

    /* renamed from: c */
    final /* synthetic */ bild f120818c;

    public bilc(bild bild, aepm aepm, int i) {
        this.f120818c = bild;
        this.f120816a = aepm;
        this.f120817b = i;
    }

    public void onClick(View view) {
        aepm aepm = this.f120816a;
        View view2 = this.f120818c.f201a;
        int i = this.f120817b;
        aepm.onItemClick(null, view2, i, (long) i);
    }
}
