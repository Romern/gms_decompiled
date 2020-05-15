package p000;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.google.android.wallet.p097ui.common.MaterialFieldLayout;

/* renamed from: bkej */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkej implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ TextView f124083a;

    /* renamed from: b */
    final /* synthetic */ MaterialFieldLayout f124084b;

    public bkej(MaterialFieldLayout materialFieldLayout, TextView textView) {
        this.f124084b = materialFieldLayout;
        this.f124083a = textView;
    }

    public final void afterTextChanged(Editable editable) {
        this.f124084b.mo72048a(this.f124083a.isFocused(), this.f124083a);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
