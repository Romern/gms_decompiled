package com.google.android.wallet.bender3.impl.p096ui.common.selector.dropdown;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;
import java.util.ArrayList;

/* renamed from: com.google.android.wallet.bender3.impl.ui.common.selector.dropdown.DropDownAutoCompleteTextView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DropDownAutoCompleteTextView extends C1492xo {

    /* renamed from: a */
    public final ArrayList f151789a = new ArrayList();

    /* renamed from: b */
    public AutoCompleteTextView.OnDismissListener f151790b;

    /* renamed from: c */
    public bjgv f151791c;

    public DropDownAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = Build.VERSION.SDK_INT;
        super.setOnDismissListener(new bjra(this));
    }

    /* access modifiers changed from: protected */
    public final CharSequence convertSelectionToString(Object obj) {
        return this.f151791c.f122693b.mo65131a(((bwxl) obj).f161388d, bjrd.class).mo65122h();
    }

    /* access modifiers changed from: protected */
    public final void performFiltering(CharSequence charSequence, int i) {
    }

    public final void setOnDismissListener(AutoCompleteTextView.OnDismissListener onDismissListener) {
        this.f151790b = onDismissListener;
    }
}
