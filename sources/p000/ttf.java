package p000;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: ttf */
final /* synthetic */ class ttf implements View.OnClickListener {

    /* renamed from: a */
    private final ttp f46631a;

    public ttf(ttp ttp) {
        this.f46631a = ttp;
    }

    public void onClick(View view) {
        ttp ttp = this.f46631a;
        if (ttp.mo26797f().getBoolean("dontShowAgain", false)) {
            ttp.mo26794c();
            return;
        }
        bhia bhia = new bhia(ttp.getContext());
        bhia.mo63785d();
        bhia.mo63786d((int) C0126R.string.common_got_it, new ttl(ttp));
        ttp.f46651d = bhia.mo15910c();
        ((TextView) ttp.f46651d.findViewById(C0126R.C0129id.pwm_save_edits_textview)).setText(TextUtils.expandTemplate(ttp.getResources().getText(C0126R.string.pwm_save_edits_info_dialog), ttp.f46650c.f46577e.f167739b));
    }
}
