package p000;

import com.google.android.gms.nearby.internal.connection.ParcelablePayload;

/* renamed from: ahqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahqv implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ParcelablePayload f67835a;

    /* renamed from: b */
    final /* synthetic */ String[] f67836b;

    /* renamed from: c */
    final /* synthetic */ ahkv f67837c;

    /* renamed from: d */
    final /* synthetic */ ahra f67838d;

    public ahqv(ahra ahra, ParcelablePayload parcelablePayload, String[] strArr, ahkv ahkv) {
        this.f67838d = ahra;
        this.f67835a = parcelablePayload;
        this.f67836b = strArr;
        this.f67837c = ahkv;
    }

    public final void run() {
        ahnq ahnq;
        ahqy ahqy;
        buut buut;
        boolean booleanValue;
        ParcelablePayload parcelablePayload = this.f67835a;
        bqgj bqgj = this.f67838d.f67853b;
        String[] strArr = this.f67836b;
        int i = parcelablePayload.f80606b;
        if (i == 1) {
            ahnq = new ahnr(parcelablePayload);
        } else if (i == 2) {
            ahnq = new ahnv(parcelablePayload);
        } else if (i != 3) {
            ahnq = null;
        } else {
            ahnq = new ahnw(parcelablePayload, bqgj);
        }
        if (ahnq != null) {
            ahqy = new ahqy(ahnq, bnkn.m109665a(strArr), false);
            this.f67838d.f67855d.mo36989a(ahnq.mo36897a(), ahqy);
        } else {
            ahqy = null;
        }
        if (ahqy == null) {
            this.f67838d.mo36995b(this.f67837c, this.f67836b, this.f67835a);
            ParcelablePayload parcelablePayload2 = this.f67835a;
            ((bnsl) ahkm.f67363a.mo68390d()).mo68416a("PayloadManager failed to create InternalPayload for outgoing payload (ID: %d, type: %d), aborting sendPayload().", parcelablePayload2.f80605a, parcelablePayload2.f80606b);
            return;
        }
        this.f67838d.mo36993a(this.f67837c, this.f67836b, this.f67835a);
        ahnq ahnq2 = ahqy.f67847a;
        bxvd da = buut.f154979e.mo74144da();
        long a = ahnq2.mo36897a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        buut buut2 = (buut) da.f164949b;
        buut2.f154981a = 1 | buut2.f154981a;
        buut2.f154982b = a;
        long b = ahnq2.mo36900b();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        buut buut3 = (buut) da.f164949b;
        buut3.f154981a |= 4;
        buut3.f154984d = b;
        if (ahnq2.mo36902d() == 0) {
            buut = (buut) da.mo74062i();
        } else {
            int d = ahnq2.mo36902d();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            buut buut4 = (buut) da.f164949b;
            int i2 = d - 1;
            if (d != 0) {
                buut4.f154983c = i2;
                buut4.f154981a |= 2;
                buut = (buut) da.mo74062i();
            } else {
                throw null;
            }
        }
        ahkn ahkn = this.f67838d.f67857f;
        ahqu ahqu = new ahqu(this, ahqy, buut);
        try {
            srn srn = ahkm.f67363a;
            String str = ahkn.f67364a;
            do {
                String str2 = ahkn.f67364a;
                booleanValue = ahqu.call().booleanValue();
                String str3 = ahkn.f67364a;
            } while (booleanValue);
        } catch (Exception e) {
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("ahkn", "a", 68, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("LoopRunner %s got exception, exiting", ahkn.f67364a);
        }
    }
}
