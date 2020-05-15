package com.google.android.gms.wallet.p088ui.component.pagefooter;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.wallet.ui.component.pagefooter.PageFooterView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PageFooterView extends LinearLayout {

    /* renamed from: a */
    public final ArrayList f110580a = new ArrayList(2);

    public PageFooterView(Context context) {
        super(context);
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        int size = this.f110580a.size();
        for (int i = 0; i < size; i++) {
            ((awzs) this.f110580a.get(i)).mo52808n(z);
        }
    }

    public PageFooterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PageFooterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
