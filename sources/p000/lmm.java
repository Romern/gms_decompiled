package p000;

import android.content.Intent;
import android.view.View;

/* renamed from: lmm */
final /* synthetic */ class lmm implements View.OnClickListener {

    /* renamed from: a */
    private final lmu f26387a;

    public lmm(lmu lmu) {
        this.f26387a = lmu;
    }

    public void onClick(View view) {
        lmu lmu = this.f26387a;
        if (lqo.m19536b(lmu.f26406f)) {
            lmu.mo15275h();
            return;
        }
        lmu.f26159a.startActivity(new Intent("android.settings.ADD_ACCOUNT_SETTINGS").putExtra("account_types", new String[]{"com.google"}));
    }
}
