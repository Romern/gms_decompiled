package com.google.android.gms.ads.identifier.settings;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.ads.identifier.settings.b */
public final /* synthetic */ class C0284b implements C0286d {

    /* renamed from: a */
    private final C0287e f8013a;

    /* renamed from: b */
    private final String f8014b;

    /* renamed from: c */
    private final int f8015c;

    /* renamed from: d */
    private final byte[] f8016d;

    public C0284b(C0287e eVar, String str, int i, byte[] bArr) {
        this.f8013a = eVar;
        this.f8014b = str;
        this.f8015c = i;
        this.f8016d = bArr;
    }

    /* renamed from: a */
    public final void mo6504a(bxvd bxvd) {
        bxvd bxvd2;
        C0287e eVar = this.f8013a;
        String str = this.f8014b;
        int i = this.f8015c;
        byte[] bArr = this.f8016d;
        String a = eVar.mo6507a(str, i);
        bqkp a2 = eVar.f8022b.mo6534a(a);
        if (a2 != null) {
            bxvd2 = bqkp.f141022g.mo74141a(a2);
        } else if (!TextUtils.isEmpty(a)) {
            bxvd2 = eVar.mo6506a(a);
            eVar.f8022b.mo6535a(a, (bqkp) bxvd2.mo74062i());
        } else {
            bxvd2 = bqkp.f141022g.mo74144da();
        }
        if (eVar.mo6518i()) {
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bqkp bqkp = (bqkp) bxvd2.f164949b;
            bqkp bqkp2 = bqkp.f141022g;
            bqkp.f141024a |= 1;
            bqkp.f141025b = true;
        }
        bxvd da = bqkn.f141015d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bqkn bqkn = (bqkn) da.f164949b;
        bqkp bqkp3 = (bqkp) bxvd2.mo74062i();
        bqkp3.getClass();
        bqkn.f141019c = bqkp3;
        bqkn.f141017a |= 2;
        if (!C0287e.m5196a(bArr)) {
            bxtx a3 = bxtx.m123261a(bArr);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bqkn bqkn2 = (bqkn) da.f164949b;
            a3.getClass();
            bqkn2.f141017a = 1 | bqkn2.f141017a;
            bqkn2.f141018b = a3;
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bqkt bqkt = (bqkt) bxvd.f164949b;
        bqkn bqkn3 = (bqkn) da.mo74062i();
        bqkt bqkt2 = bqkt.f141038i;
        bqkn3.getClass();
        bqkt.f141042c = bqkn3;
        bqkt.f141041b = 3;
    }
}
