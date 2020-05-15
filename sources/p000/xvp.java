package p000;

import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: xvp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xvp implements Runnable {

    /* renamed from: a */
    final /* synthetic */ xvt f53239a;

    public xvp(xvt xvt) {
        this.f53239a = xvt;
    }

    public final void run() {
        TextView textView = this.f53239a.f53246d;
        textView.setTextColor(textView.getResources().getColor(C0126R.color.hint_color, null));
        TextView textView2 = this.f53239a.f53246d;
        textView2.setText(textView2.getResources().getString(C0126R.string.common_fingerprint_hint));
        this.f53239a.f53245c.setImageResource(C0126R.C0127drawable.ic_fingerprint_googblue600_48);
    }
}
