package com.google.android.gms.plus.audience;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AudienceSelectionListCircleView extends anpr {

    /* renamed from: a */
    public TextView f82278a;

    /* renamed from: b */
    public TextView f82279b;

    /* renamed from: c */
    public TextView f82280c;

    /* renamed from: h */
    private ImageView f82281h;

    public AudienceSelectionListCircleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo42095a() {
        mo46547a((int) C0126R.C0127drawable.ic_circles_24dp);
        mo46548b();
        mo46549c();
        super.mo42095a();
    }

    /* renamed from: b */
    public final void mo46548b() {
        this.f82279b.setVisibility(8);
    }

    /* renamed from: c */
    public final void mo46549c() {
        this.f82280c.setVisibility(8);
    }

    public /* bridge */ /* synthetic */ void onClick(View view) {
        super.onClick(view);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f82278a = (TextView) findViewById(C0126R.C0129id.audience_selection_circle_name);
        this.f82279b = (TextView) findViewById(C0126R.C0129id.audience_selection_circle_count);
        this.f82281h = (ImageView) findViewById(C0126R.C0129id.audience_selection_circle_icon);
        this.f82280c = (TextView) findViewById(C0126R.C0129id.audience_selection_circle_description);
    }

    /* renamed from: a */
    public final void mo46547a(int i) {
        this.f82281h.setImageResource(i);
    }
}
