package p000;

import android.view.View;
import android.widget.TextView;
import com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity;
import java.util.List;

/* renamed from: atqv */
final /* synthetic */ class atqv implements View.OnClickListener {

    /* renamed from: a */
    private final SelectVerificationMethodChimeraActivity f90690a;

    /* renamed from: b */
    private final List f90691b;

    /* renamed from: c */
    private final TextView f90692c;

    public atqv(SelectVerificationMethodChimeraActivity selectVerificationMethodChimeraActivity, List list, TextView textView) {
        this.f90690a = selectVerificationMethodChimeraActivity;
        this.f90691b = list;
        this.f90692c = textView;
    }

    public void onClick(View view) {
        SelectVerificationMethodChimeraActivity selectVerificationMethodChimeraActivity = this.f90690a;
        List list = this.f90691b;
        TextView textView = this.f90692c;
        selectVerificationMethodChimeraActivity.mo59462a(list);
        textView.setVisibility(8);
    }
}
