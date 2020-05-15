package com.google.android.gms.accountsettings.p007mg.poc.p008ui.search;

import android.content.Context;
import android.util.AttributeSet;
import com.felicanetworks.mfc.C0126R;
import java.util.List;

/* renamed from: com.google.android.gms.accountsettings.mg.poc.ui.search.SearchItemsListView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SearchItemsListView extends evj {

    /* renamed from: a */
    public evl f7774a;

    /* renamed from: b */
    public ewz f7775b;

    /* renamed from: c */
    public eww f7776c;

    /* renamed from: d */
    public evk f7777d;

    /* renamed from: e */
    public evm f7778e;

    /* renamed from: f */
    public fgt f7779f;

    public SearchItemsListView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final int mo6332a() {
        return getResources().getDimensionPixelSize(C0126R.dimen.as_search_list_vertical_item_padding);
    }

    public SearchItemsListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        addItemDecoration(new ewq(mo6332a()));
    }

    /* renamed from: a */
    public final void mo6333a(List list, bswf bswf, String str) {
        sdo.m34959a(this.f7779f);
        eww eww = new eww(getContext(), list, new ewx(this), bswf, new ewy(this), str, this.f7779f);
        this.f7776c = eww;
        eww.mo10554a(this.f7777d, this.f7778e);
        setAdapter(this.f7776c);
    }
}
