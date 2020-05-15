package com.google.android.gms.setupservices.item;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.setupdesign.items.Item;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GoogleServicesTextItem extends Item {

    /* renamed from: a */
    public aqje f107653a;

    /* renamed from: b */
    private aqje f107654b;

    public GoogleServicesTextItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eoi.f15405q);
        this.f107653a = aqje.m71717a(context, obtainStyledAttributes.getResourceId(4, 0));
        this.f107654b = aqje.m71717a(context, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final bssd mo58965a() {
        bxvd da = bssd.f146839f.mo74144da();
        aqje aqje = this.f107653a;
        if (aqje != null) {
            bssa a = aqje.mo47912a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bssd bssd = (bssd) da.f164949b;
            a.getClass();
            bssd.f146843c = a;
            bssd.f146841a |= 2;
        }
        aqje aqje2 = this.f107654b;
        if (aqje2 != null) {
            bssa a2 = aqje2.mo47912a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bssd bssd2 = (bssd) da.f164949b;
            a2.getClass();
            bssd2.f146844d = a2;
            bssd2.f146841a |= 4;
        }
        return (bssd) da.mo74062i();
    }

    /* renamed from: bI */
    public final CharSequence mo58964bI() {
        aqje aqje = this.f107654b;
        if (aqje != null) {
            return aqje.f86194a;
        }
        return null;
    }

    /* renamed from: e */
    public final CharSequence mo58962e() {
        aqje aqje = this.f107653a;
        if (aqje != null) {
            return aqje.f86194a;
        }
        return null;
    }
}
