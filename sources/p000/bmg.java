package p000;

import android.view.View;

/* renamed from: bmg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bmg implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ bmf f5157a;

    /* renamed from: b */
    final /* synthetic */ bmi f5158b;

    public bmg(bmi bmi, bmf bmf) {
        this.f5158b = bmi;
        this.f5157a = bmf;
    }

    public void onClick(View view) {
        bmb bmb = this.f5157a.f5156t;
        if (this.f5158b.f5160d != null && bmb != null && bmb.mo3264d()) {
            this.f5158b.f5160d.f49956a.mo28805a(bmb);
        }
    }
}
