package p000;

import android.util.Log;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;

/* renamed from: tpp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class tpp {

    /* renamed from: a */
    public final tsa f46456a;

    /* renamed from: b */
    public final adcf f46457b;

    public tpp(tsa tsa, adcf adcf) {
        this.f46456a = tsa;
        this.f46457b = adcf;
    }

    /* renamed from: a */
    public final void mo26711a(tql tql) {
        if (tql != null) {
            int c = tql.mo26737c();
            if (c == 0) {
                throw null;
            } else if (c != 3) {
            } else {
                if (!(tql.mo26736b() instanceof rjp) || ((rjp) tql.mo26736b()).mo24655a() != 7) {
                    Log.e("pwm.BlacklistCtlr", "An unknown error occurred", tql.mo26736b());
                    Toast.makeText(this.f46457b.getContext(), (int) C0126R.string.common_something_went_wrong, 0).show();
                    return;
                }
                Log.e("pwm.BlacklistCtlr", "A network error occurred", tql.mo26736b());
                Toast.makeText(this.f46457b.getContext(), (int) C0126R.string.common_no_network, 0).show();
            }
        }
    }
}
