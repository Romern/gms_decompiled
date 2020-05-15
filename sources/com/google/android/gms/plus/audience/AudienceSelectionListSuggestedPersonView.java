package com.google.android.gms.plus.audience;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AudienceSelectionListSuggestedPersonView extends AudienceSelectionListPersonView {

    /* renamed from: i */
    public ImageView f82288i;

    /* renamed from: j */
    private View f82289j;

    public AudienceSelectionListSuggestedPersonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo46551a(int i) {
        this.f82288i.setImageResource(i);
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        super.onCheckedChanged(compoundButton, z);
        this.f82289j.setVisibility(!z ? 8 : 0);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f82289j = findViewById(C0126R.C0129id.audience_selection_suggested_check);
        this.f82288i = (ImageView) findViewById(C0126R.C0129id.audience_selection_person_avatar);
    }

    public final void setChecked(boolean z) {
        super.setChecked(z);
        this.f82289j.setVisibility(!z ? 8 : 0);
    }
}
