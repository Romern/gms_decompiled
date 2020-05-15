package com.google.android.gms.nearby.sharing.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.libraries.view.text.ExpandableTextView;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ExpandableView extends LinearLayout {

    /* renamed from: a */
    public ExpandableTextView f81147a;

    public ExpandableView(Context context) {
        super(context);
        m67620a(context);
    }

    /* renamed from: a */
    private final void m67620a(Context context) {
        int i;
        LayoutInflater.from(context).inflate((int) C0126R.C0128layout.sharing_view_expandable_titled_text, this);
        View findViewById = findViewById(C0126R.C0129id.expandableView);
        ExpandableTextView expandableTextView = (ExpandableTextView) findViewById(C0126R.C0129id.expandable_text);
        this.f81147a = expandableTextView;
        expandableTextView.f150655a = bmxv.m108567c(findViewById(C0126R.C0129id.toggle_icon));
        if (!expandableTextView.f150657c && expandableTextView.f150655a.mo66813a()) {
            View view = (View) expandableTextView.f150655a.mo66814b();
            if (!expandableTextView.mo70845a()) {
                i = 4;
            } else {
                i = 0;
            }
            view.setVisibility(i);
        }
        findViewById.setOnClickListener(new akja(this));
    }

    public ExpandableView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m67620a(context);
    }

    public ExpandableView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m67620a(context);
    }
}
