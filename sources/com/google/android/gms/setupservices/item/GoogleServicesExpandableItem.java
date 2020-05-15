package com.google.android.gms.setupservices.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GoogleServicesExpandableItem extends GoogleServicesExpandableSwitchItem {
    public GoogleServicesExpandableItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo48939a(View view) {
        super.mo48939a(view);
        View findViewById = view.findViewById(C0126R.C0129id.sud_items_switch);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }
}
