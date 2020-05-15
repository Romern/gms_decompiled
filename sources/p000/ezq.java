package p000;

import android.content.Intent;
import android.view.View;

/* renamed from: ezq */
final /* synthetic */ class ezq implements View.OnClickListener {

    /* renamed from: a */
    private final ezr f16116a;

    /* renamed from: b */
    private final evk f16117b;

    public ezq(ezr ezr, evk evk) {
        this.f16116a = ezr;
        this.f16117b = evk;
    }

    public void onClick(View view) {
        ezr ezr = this.f16116a;
        evk evk = this.f16117b;
        if (!evk.f15882e) {
            Intent intent = evk.f15883f;
            if (intent != null) {
                ezr.startActivityForResult(intent, 9);
                return;
            }
            return;
        }
        fdz fdz = ezr.f16118a;
        fdz.f16354b.mo10680a(((fck) fdz.f16353a).f16277a);
    }
}
