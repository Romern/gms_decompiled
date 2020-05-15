package p000;

import android.view.View;
import com.google.android.gms.tapandpay.tokenization.AcceptTosChimeraActivity;

/* renamed from: atox */
public final /* synthetic */ class atox implements View.OnClickListener {

    /* renamed from: a */
    private final AcceptTosChimeraActivity f90619a;

    public atox(AcceptTosChimeraActivity acceptTosChimeraActivity) {
        this.f90619a = acceptTosChimeraActivity;
    }

    public void onClick(View view) {
        AcceptTosChimeraActivity acceptTosChimeraActivity = this.f90619a;
        if (acceptTosChimeraActivity.f108745c) {
            acceptTosChimeraActivity.setResult(-1);
            acceptTosChimeraActivity.finish();
            return;
        }
        acceptTosChimeraActivity.mo59426e();
    }
}
