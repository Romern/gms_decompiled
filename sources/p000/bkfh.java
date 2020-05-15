package p000;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.wallet.p097ui.common.SummaryTextLayout;

/* renamed from: bkfh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkfh implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ SummaryTextLayout f124141a;

    public bkfh(SummaryTextLayout summaryTextLayout) {
        this.f124141a = summaryTextLayout;
    }

    public final void afterTextChanged(Editable editable) {
        this.f124141a.mo72110c();
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
