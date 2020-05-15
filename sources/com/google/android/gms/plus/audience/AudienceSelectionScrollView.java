package com.google.android.gms.plus.audience;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AudienceSelectionScrollView extends ScrollView {

    /* renamed from: a */
    public anpw f82292a;

    /* renamed from: b */
    public anpv f82293b;

    public AudienceSelectionScrollView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.onOverScrolled(i, i2, z, z2);
        anpv anpv = this.f82293b;
        if (anpv != null) {
            anpv.mo42107a(i2, z2);
        }
    }

    /* access modifiers changed from: protected */
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        anpw anpw = this.f82292a;
        if (anpw != null) {
            anpw.mo42108a(this, i2);
        }
    }

    public AudienceSelectionScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AudienceSelectionScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
