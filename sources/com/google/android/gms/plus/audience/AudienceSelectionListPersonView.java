package com.google.android.gms.plus.audience;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AudienceSelectionListPersonView extends anpr {

    /* renamed from: i */
    private static Bitmap f82283i;

    /* renamed from: a */
    public TextView f82284a;

    /* renamed from: b */
    public TextView f82285b;

    /* renamed from: c */
    public ImageView f82286c;

    /* renamed from: h */
    public anop f82287h;

    public AudienceSelectionListPersonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo42095a() {
        anop anop = this.f82287h;
        if (anop != null) {
            anop.f77316a.mo9460b();
            this.f82287h = null;
        }
        mo46551a((int) C0126R.C0127drawable.default_avatar);
        super.mo42095a();
    }

    public /* bridge */ /* synthetic */ void onClick(View view) {
        super.onClick(view);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f82284a = (TextView) findViewById(C0126R.C0129id.audience_selection_person_name);
        this.f82285b = (TextView) findViewById(C0126R.C0129id.audience_selection_secondary_text);
        this.f82286c = (ImageView) findViewById(C0126R.C0129id.audience_selection_person_avatar);
    }

    /* renamed from: a */
    public void mo46551a(int i) {
        if (i == C0126R.C0127drawable.default_avatar) {
            ImageView imageView = this.f82286c;
            if (f82283i == null) {
                f82283i = ssa.m36185a(((BitmapDrawable) getResources().getDrawable(C0126R.C0127drawable.default_avatar)).getBitmap());
            }
            imageView.setImageBitmap(f82283i);
            return;
        }
        this.f82286c.setImageResource(i);
    }
}
