package p000;

import android.content.DialogInterface;
import android.widget.CheckBox;
import com.felicanetworks.mfc.C0126R;

/* renamed from: ttl */
final /* synthetic */ class ttl implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final ttp f46639a;

    public ttl(ttp ttp) {
        this.f46639a = ttp;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ttp ttp = this.f46639a;
        ttp.mo26797f().edit().putBoolean("dontShowAgain", ((CheckBox) ttp.f46651d.findViewById(C0126R.C0129id.pwm_dont_show_again_checkbox)).isChecked()).apply();
        ttp.mo26794c();
    }
}
