package com.google.android.gms.plus.audience;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ListView;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AudienceSelectionListView extends ListView {

    /* renamed from: a */
    public anpu f82290a;

    /* renamed from: b */
    public anpt f82291b;

    public AudienceSelectionListView(Context context) {
        super(context);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        anpt anpt = this.f82291b;
        if (anpt != null) {
            anpt.mo42105a(this);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.onOverScrolled(i, i2, z, z2);
        anpu anpu = this.f82290a;
        if (anpu != null) {
            anpu.mo42106a(this, z2);
        }
    }

    public AudienceSelectionListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AudienceSelectionListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
