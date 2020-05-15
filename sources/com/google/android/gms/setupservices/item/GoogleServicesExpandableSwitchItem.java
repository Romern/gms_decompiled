package com.google.android.gms.setupservices.item;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.setupdesign.items.ExpandableSwitchItem;
import com.google.android.setupdesign.items.SwitchItem;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GoogleServicesExpandableSwitchItem extends ExpandableSwitchItem implements aqiz {

    /* renamed from: a */
    public aqje f107646a;

    /* renamed from: i */
    private aqje f107647i;

    /* renamed from: j */
    private aqje f107648j;

    /* renamed from: k */
    private final int f107649k;

    public GoogleServicesExpandableSwitchItem(int i) {
        this.f107649k = i;
    }

    /* renamed from: k */
    private final void m92470k() {
        if (this.f107648j != null) {
            mo71390a(TextUtils.concat(mo58963f(), "\n\n", this.f107648j.f86194a));
            return;
        }
        mo71390a(mo58963f());
    }

    /* renamed from: a */
    public final int mo47903a() {
        return this.f107649k;
    }

    /* renamed from: b */
    public final void mo58961b(aqje aqje) {
        this.f107647i = aqje;
        m92470k();
    }

    /* renamed from: d */
    public final aqju mo47909d() {
        int i;
        bxvd da = bsrw.f146804d.mo74144da();
        bxvd da2 = bssl.f146873c.mo74144da();
        if (!((SwitchItem) this).f151513h) {
            i = 3;
        } else {
            i = 2;
        }
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bssl bssl = (bssl) da2.f164949b;
        bssl.f146876b = i - 1;
        bssl.f146875a |= 1;
        bssl bssl2 = (bssl) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsrw bsrw = (bsrw) da.f164949b;
        bssl2.getClass();
        bsrw.f146808c = bssl2;
        bsrw.f146806a |= 2;
        bxvd da3 = bssd.f146839f.mo74144da();
        aqje aqje = this.f107646a;
        if (aqje != null) {
            bssa a = aqje.mo47912a();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bssd bssd = (bssd) da3.f164949b;
            a.getClass();
            bssd.f146843c = a;
            bssd.f146841a |= 2;
        }
        aqje aqje2 = this.f107647i;
        if (aqje2 != null) {
            bssa a2 = aqje2.mo47912a();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bssd bssd2 = (bssd) da3.f164949b;
            a2.getClass();
            bssd2.f146844d = a2;
            bssd2.f146841a |= 4;
        }
        aqje aqje3 = this.f107648j;
        if (aqje3 != null) {
            bssa a3 = aqje3.mo47912a();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bssd bssd3 = (bssd) da3.f164949b;
            a3.getClass();
            bssd3.f146845e = a3;
            bssd3.f146841a |= 8;
        }
        return new aqju((bsrw) da.mo74062i(), (bssd) da3.mo74062i());
    }

    /* renamed from: e */
    public final CharSequence mo58962e() {
        aqje aqje = this.f107646a;
        if (aqje != null) {
            return aqje.f86194a;
        }
        return null;
    }

    /* renamed from: f */
    public final CharSequence mo58963f() {
        aqje aqje = this.f107647i;
        if (aqje != null) {
            return aqje.f86194a;
        }
        return null;
    }

    public GoogleServicesExpandableSwitchItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eoi.f15395g);
        this.f107649k = obtainStyledAttributes.getResourceId(3, 0);
        mo58960a(aqje.m71717a(context, obtainStyledAttributes.getResourceId(2, 0)));
        mo58961b(aqje.m71717a(context, obtainStyledAttributes.getResourceId(1, 0)));
        this.f107646a = aqje.m71717a(context, obtainStyledAttributes.getResourceId(0, 0));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public void mo48939a(View view) {
        View findViewById;
        super.mo48939a(view);
        Context context = view.getContext();
        aqjy aqjy = aqjy.f86251b;
        if (aqjy == null) {
            synchronized (aqjy.class) {
                aqjy = aqjy.f86251b;
                if (aqjy == null) {
                    aqjy = new aqjy(context);
                    aqjy.f86251b = aqjy;
                }
            }
        }
        if (aqjy.f86252a && cglo.f187293a.mo6606a().mo84104a() && (findViewById = view.findViewById(C0126R.C0129id.sud_items_icon_container)) != null) {
            findViewById.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo58960a(aqje aqje) {
        this.f107648j = aqje;
        m92470k();
    }
}
