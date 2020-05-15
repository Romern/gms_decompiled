package p000;

import android.view.View;

/* renamed from: bhgy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhgy implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ bhhb f118634a;

    public bhgy(bhhb bhhb) {
        this.f118634a = bhhb;
    }

    public void onClick(View view) {
        bhhb bhhb = this.f118634a;
        int i = bhhb.f118644ac;
        if (i == 2) {
            bhhb.mo63752c(1);
        } else if (i == 1) {
            bhhb.mo63752c(2);
        }
    }
}
