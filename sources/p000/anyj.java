package p000;

import android.content.Context;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: anyj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anyj extends anxz {

    /* renamed from: d */
    private TextView f77869d;

    public anyj(Context context, boolean z) {
        super(context, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo42413a() {
        return C0126R.C0128layout.plus_oob_field_hidden_button;
    }

    /* renamed from: b */
    public final boolean mo42416b() {
        return true;
    }

    /* renamed from: c */
    public final aoed mo42417c() {
        return null;
    }

    /* renamed from: j */
    public final String mo42443j() {
        TextView textView = this.f77869d;
        if (textView != null) {
            return textView.getText().toString();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo42415a(aoed aoed, anxy anxy) {
        super.mo42415a(aoed, anxy);
        this.f77869d = (TextView) findViewWithTag(mo42414a(C0126R.string.plus_oob_field_view_tag_hidden_button));
        if (aoed.mo42603j() && aoed.mo42602i().mo42579d()) {
            this.f77869d.setText(aoed.mo42602i().mo42578c());
        }
    }
}
