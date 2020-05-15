package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: lnj */
final /* synthetic */ class lnj implements Runnable {

    /* renamed from: a */
    private final lno f26450a;

    /* renamed from: b */
    private final View f26451b;

    public lnj(lno lno, View view) {
        this.f26450a = lno;
        this.f26451b = view;
    }

    public final void run() {
        lno lno = this.f26450a;
        bhnh a = bhnh.m101201a(this.f26451b, (int) C0126R.string.autofill_waiting_for_sms, -2);
        ProgressBar progressBar = new ProgressBar(lno.f26159a);
        progressBar.setIndeterminate(true);
        int dimensionPixelSize = lno.f26159a.getResources().getDimensionPixelSize(C0126R.dimen.autofill_snackbar_progress_bar_size);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        layoutParams.gravity = 17;
        ((ViewGroup) ((TextView) a.f119110e.findViewById(C0126R.C0129id.snackbar_text)).getParent()).addView(progressBar, 0, layoutParams);
        a.mo64032a(lno.f26159a.getText(C0126R.string.close_button_label), new lnl(lno));
        a.mo64020c();
    }
}
