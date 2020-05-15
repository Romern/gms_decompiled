package com.google.android.gms.smart_profile.card;

import android.content.Context;
import android.util.AttributeSet;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CardView extends androidx.cardview.widget.CardView {
    public CardView(Context context) {
        super(context);
        if (getResources().getConfiguration().orientation != 2) {
            mo1867c();
        }
        mo1865a((float) getResources().getDimensionPixelSize(C0126R.dimen.sp_card_elevation));
    }

    public CardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (getResources().getConfiguration().orientation != 2) {
            mo1867c();
        }
        mo1865a((float) getResources().getDimensionPixelSize(C0126R.dimen.sp_card_elevation));
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getResources().getConfiguration().orientation != 2) {
            mo1867c();
        }
        mo1865a((float) getResources().getDimensionPixelSize(C0126R.dimen.sp_card_elevation));
    }
}
