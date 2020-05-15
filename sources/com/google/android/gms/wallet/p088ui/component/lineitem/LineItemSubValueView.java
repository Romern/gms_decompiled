package com.google.android.gms.wallet.p088ui.component.lineitem;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: com.google.android.gms.wallet.ui.component.lineitem.LineItemSubValueView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LineItemSubValueView extends TextView implements awyz {
    public LineItemSubValueView(Context context) {
        super(context, null, C0126R.attr.styleLineItemSubValueText);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo52802a(Object obj) {
        setText(awia.m79968a((String) obj));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo52803b(Object obj) {
        return !TextUtils.isEmpty((String) obj);
    }
}
