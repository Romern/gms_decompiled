package com.google.android.gms.plus.audience;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AudienceSelectionListHeaderView extends LinearLayout {

    /* renamed from: a */
    public TextView f82282a;

    public AudienceSelectionListHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        findViewById(C0126R.C0129id.top_border);
        this.f82282a = (TextView) findViewById(C0126R.C0129id.audience_selection_header_text);
    }
}
