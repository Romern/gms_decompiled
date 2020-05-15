package com.google.android.setupdesign.items;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DescriptionItem extends Item {
    public DescriptionItem() {
    }

    /* renamed from: a */
    public final void mo48939a(View view) {
        super.mo48939a(view);
        TextView textView = (TextView) view.findViewById(C0126R.C0129id.sud_items_title);
    }

    public DescriptionItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
