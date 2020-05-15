package com.google.android.gms.wallet.p088ui.component.lineitem;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.wallet.ui.component.lineitem.LineItemContainerView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LineItemContainerView extends FrameLayout implements awyz {

    /* renamed from: a */
    public ArrayList f110566a;

    /* renamed from: b */
    public boolean f110567b;

    /* renamed from: c */
    public bmjv f110568c;

    /* renamed from: d */
    public axbu f110569d;

    /* renamed from: e */
    private LinearLayout f110570e;

    public LineItemContainerView(Context context) {
        super(context);
        mo60121a(context);
    }

    /* renamed from: a */
    public final void mo60120a() {
        if (this.f110566a != null) {
            for (int i = 0; i < this.f110566a.size(); i++) {
                LineItemBundleView lineItemBundleView = (LineItemBundleView) this.f110566a.get(i);
                lineItemBundleView.f110552k = this.f110569d;
                lineItemBundleView.mo60114c();
            }
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo52803b(Object obj) {
        return ((bmjv) obj) != null;
    }

    public LineItemContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo60121a(context);
    }

    public LineItemContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo60121a(context);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.gms.wallet.ui.component.lineitem.LineItemContainerView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo60121a(Context context) {
        this.f110570e = (LinearLayout) LayoutInflater.from(context).inflate((int) C0126R.C0128layout.wallet_view_line_item_container, (ViewGroup) this, true).findViewById(C0126R.C0129id.line_item_container_bundles);
    }

    public LineItemContainerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo60121a(context);
    }

    /* renamed from: a */
    public final void mo52802a(bmjv bmjv) {
        this.f110568c = bmjv;
        mo60123a(bmjv, this.f110567b);
    }

    /* renamed from: a */
    public final void mo60123a(bmjv bmjv, boolean z) {
        ArrayList a = awza.m81597a(getContext(), this.f110570e, bmjv.f129755b, LineItemBundleView.class);
        this.f110566a = a;
        if (a != null) {
            int size = a.size();
            for (int i = 0; i < size; i++) {
                LineItemBundleView lineItemBundleView = (LineItemBundleView) this.f110566a.get(i);
                lineItemBundleView.f110549h = z;
                bmju bmju = lineItemBundleView.f110548g;
                if (bmju != null) {
                    lineItemBundleView.mo60111a(bmju, z);
                }
            }
        }
        mo60120a();
    }
}
