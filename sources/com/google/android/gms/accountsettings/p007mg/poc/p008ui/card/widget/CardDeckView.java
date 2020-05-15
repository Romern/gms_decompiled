package com.google.android.gms.accountsettings.p007mg.poc.p008ui.card.widget;

import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.accountsettings.mg.poc.ui.card.widget.CardDeckView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CardDeckView extends evj {

    /* renamed from: a */
    public evl f7764a;

    /* renamed from: b */
    public euz f7765b;

    /* renamed from: c */
    public eui f7766c;

    /* renamed from: d */
    public evk f7767d;

    /* renamed from: e */
    public evm f7768e;

    /* renamed from: f */
    public bdej f7769f;

    /* renamed from: g */
    public bsxp f7770g;

    /* renamed from: h */
    public ffl f7771h;

    /* renamed from: i */
    public List f7772i = new ArrayList();

    /* renamed from: j */
    public fgt f7773j;

    public CardDeckView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo6330a() {
        euz euz = this.f7765b;
        if (euz != null) {
            bsxp bsxp = this.f7770g;
            List list = this.f7772i;
            ffl ffl = this.f7771h;
            euz.mo10555a(euz.m11155a(bsxp, list));
            euz.f15807e = ffl;
            euz.mo171aJ();
            return;
        }
        mo6331b();
    }

    /* renamed from: b */
    public final void mo6331b() {
        bmxy.m108582a(this.f7773j, "initialize() needs to be called once before setting up the adapter and calling any setter method.");
        bmxy.m108582a(this.f7769f, "initialize() needs to be called once before setting up the adapter and calling any setter method.");
        Context context = getContext();
        bsxp bsxp = this.f7770g;
        List list = this.f7772i;
        euz euz = new euz(context, euz.m11155a(bsxp, list), new eug(this), new euh(this), this.f7773j, this.f7769f, this.f7771h);
        this.f7765b = euz;
        euz.mo10554a(this.f7767d, this.f7768e);
        setAdapter(this.f7765b);
    }

    public CardDeckView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
