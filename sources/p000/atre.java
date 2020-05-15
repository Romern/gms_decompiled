package p000;

import android.content.Intent;
import android.view.View;
import com.google.android.gms.tapandpay.tokenization.SummaryChimeraActivity;

/* renamed from: atre */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atre implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ SummaryChimeraActivity f90702a;

    /* renamed from: b */
    private final Intent f90703b;

    public atre(SummaryChimeraActivity summaryChimeraActivity, Intent intent) {
        this.f90702a = summaryChimeraActivity;
        this.f90703b = intent;
    }

    public void onClick(View view) {
        SummaryChimeraActivity summaryChimeraActivity = this.f90702a;
        int i = 0;
        if (summaryChimeraActivity.f108889b) {
            if (this.f90703b.getIntExtra("next_step", 0) == 1) {
                this.f90702a.setResult(17);
            } else {
                this.f90702a.setResult(0);
            }
            this.f90702a.finish();
            return;
        }
        Intent intent = this.f90703b;
        if (intent != null) {
            i = -1;
        }
        summaryChimeraActivity.setResult(i, intent);
        this.f90702a.finish();
    }
}
