package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: wgl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wgl extends C1349sg {

    /* renamed from: a */
    private final TextView f50623a;

    public wgl(Context context) {
        super(context);
        View inflate = LayoutInflater.from(context).inflate((int) C0126R.C0128layout.fm_fragment_error_dialog, (ViewGroup) null);
        this.f50623a = (TextView) inflate.findViewById(C0126R.C0129id.fm_error_message);
        mo15907b(inflate);
        mo15902a(false);
    }

    /* renamed from: a */
    public final void mo15900a(CharSequence charSequence) {
        wgz.m41939a(this.f50623a, charSequence);
    }

    /* renamed from: d */
    public final void mo15912d(int i) {
        mo15900a(mo15890a().getText(i));
    }
}
