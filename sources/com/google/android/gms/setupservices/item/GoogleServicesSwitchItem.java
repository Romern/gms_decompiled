package com.google.android.gms.setupservices.item;

import com.felicanetworks.mfc.C0126R;
import com.google.android.setupdesign.items.SwitchItem;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GoogleServicesSwitchItem extends SwitchItem implements aqiz {

    /* renamed from: a */
    public aqje f107650a;

    /* renamed from: b */
    public aqje f107651b;

    /* renamed from: i */
    private final int f107652i = C0126R.C0129id.section_device_maintenance;

    /* renamed from: a */
    public final int mo47903a() {
        return this.f107652i;
    }

    /* renamed from: bI */
    public final CharSequence mo58964bI() {
        aqje aqje = this.f107651b;
        if (aqje != null) {
            return aqje.f86194a;
        }
        return null;
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
        aqje aqje = this.f107650a;
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
        aqje aqje2 = this.f107651b;
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
        return new aqju((bsrw) da.mo74062i(), (bssd) da3.mo74062i());
    }

    /* renamed from: e */
    public final CharSequence mo58962e() {
        aqje aqje = this.f107650a;
        if (aqje != null) {
            return aqje.f86194a;
        }
        return null;
    }
}
