package p000;

import android.content.res.TypedArray;
import android.view.View;

/* renamed from: bhfm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhfm implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ bhfq f118476a;

    public bhfm(bhfq bhfq) {
        this.f118476a = bhfq;
    }

    public void onClick(View view) {
        bhfq bhfq = this.f118476a;
        if (bhfq.f118479a && bhfq.isShowing()) {
            bhfq bhfq2 = this.f118476a;
            if (!bhfq2.f118481c) {
                TypedArray obtainStyledAttributes = bhfq2.getContext().obtainStyledAttributes(new int[]{16843611});
                bhfq2.f118480b = obtainStyledAttributes.getBoolean(0, true);
                obtainStyledAttributes.recycle();
                bhfq2.f118481c = true;
            }
            if (bhfq2.f118480b) {
                this.f118476a.cancel();
            }
        }
    }
}
