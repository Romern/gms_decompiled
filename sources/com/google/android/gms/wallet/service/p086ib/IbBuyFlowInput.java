package com.google.android.gms.wallet.service.p086ib;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.tapandpay.firstparty.GetActiveCardsForAccountResponse;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentMethodTokenizationParameters;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.wallet.service.ib.IbBuyFlowInput */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class IbBuyFlowInput implements Parcelable {
    public static final Parcelable.Creator CREATOR = new awro();

    /* renamed from: a */
    public Bundle f110339a;

    /* renamed from: b */
    public blze f110340b;

    /* renamed from: c */
    public final bxvd f110341c;

    private IbBuyFlowInput(blzf blzf, bxvd bxvd) {
        bxvd bxvd2 = (bxvd) blzf.mo74142c(5);
        bxvd2.mo73625a((GeneratedMessageLite) blzf);
        blze blze = (blze) bxvd2;
        this.f110340b = blze;
        if ((((blzf) blze.f164949b).f128339a & 32) == 0) {
            blzq blzq = blzq.f128364p;
            if (blze.f164950c) {
                blze.mo74035c();
                blze.f164950c = false;
            }
            blzf blzf2 = (blzf) blze.f164949b;
            bxvu bxvu = blzf.f128336h;
            blzq.getClass();
            blzf2.f128346i = blzq;
            blzf2.f128339a |= 32;
        }
        this.f110341c = bxvd;
        if ((((bwgv) bxvd.f164949b).f159277a & 1024) == 0) {
            bmkn bmkn = (bmkn) bmks.f129878d.mo74144da();
            if (bmkn.f164950c) {
                bmkn.mo74035c();
                bmkn.f164950c = false;
            }
            bmks bmks = (bmks) bmkn.f164949b;
            bmks.f129880a |= 1;
            bmks.f129881b = false;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bwgv bwgv = (bwgv) bxvd.f164949b;
            bmks bmks2 = (bmks) bmkn.mo74062i();
            bwgv bwgv2 = bwgv.f159275p;
            bmks2.getClass();
            bwgv.f159288l = bmks2;
            bwgv.f159277a |= 1024;
        }
    }

    /* renamed from: a */
    public static bmab m94100a(PaymentMethodTokenizationParameters paymentMethodTokenizationParameters) {
        if (paymentMethodTokenizationParameters == null) {
            return null;
        }
        bxvd da = bmab.f128425d.mo74144da();
        int i = paymentMethodTokenizationParameters.f109897a;
        if (i == 1) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmab bmab = (bmab) da.f164949b;
            bmab.f128428b = 1;
            bmab.f128427a |= 1;
        } else if (i == 2) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmab bmab2 = (bmab) da.f164949b;
            bmab2.f128428b = 2;
            bmab2.f128427a |= 1;
        } else if (i != 3) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmab bmab3 = (bmab) da.f164949b;
            bmab3.f128428b = 0;
            bmab3.f128427a |= 1;
        } else {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmab bmab4 = (bmab) da.f164949b;
            bmab4.f128428b = 3;
            bmab4.f128427a |= 1;
        }
        Bundle a = paymentMethodTokenizationParameters.mo59770a();
        int size = a.size();
        ArrayList arrayList = new ArrayList(a.keySet());
        Collections.sort(arrayList);
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) arrayList.get(i2);
            bxvd da2 = blzy.f128419d.mo74144da();
            String a2 = awjn.m80013a(str);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            blzy blzy = (blzy) da2.f164949b;
            a2.getClass();
            blzy.f128421a |= 1;
            blzy.f128422b = a2;
            String a3 = awjn.m80013a(a.getString(str));
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            blzy blzy2 = (blzy) da2.f164949b;
            a3.getClass();
            blzy2.f128421a |= 2;
            blzy2.f128423c = a3;
            blzy blzy3 = (blzy) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmab bmab5 = (bmab) da.f164949b;
            blzy3.getClass();
            if (!bmab5.f128429c.mo73666a()) {
                bmab5.f128429c = GeneratedMessageLite.m124021a(bmab5.f128429c);
            }
            bmab5.f128429c.add(blzy3);
        }
        return (bmab) da.mo74062i();
    }

    /* renamed from: b */
    public static bwef m94107b(JSONObject jSONObject, awru awru) {
        bwdy bwdy = (bwdy) bwef.f158969g.mo74144da();
        List d = awrt.m80870d(jSONObject, awru);
        if (d != null) {
            bwdy.mo73518a(d);
        }
        return (bwef) bwdy.mo74062i();
    }

    /* renamed from: a */
    public final void mo59977a(Bundle bundle) {
        if (bundle != null) {
            this.f110339a = bundle;
        }
    }

    /* renamed from: c */
    public final String mo59988c(String str) {
        blzq blzq = ((blzf) this.f110340b.f164949b).f128346i;
        if (blzq == null) {
            blzq = blzq.f128364p;
        }
        if ((blzq.f128366a & 8) == 0) {
            return null;
        }
        bmab bmab = blzq.f128370e;
        if (bmab == null) {
            bmab = bmab.f128425d;
        }
        bxwc bxwc = bmab.f128429c;
        int size = bxwc.size();
        int i = 0;
        while (i < size) {
            blzy blzy = (blzy) bxwc.get(i);
            i++;
            if (str.equals(blzy.f128422b)) {
                return blzy.f128423c;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final void mo59991d(boolean z) {
        bxvd bxvd = this.f110341c;
        bmks bmks = ((bwgv) bxvd.f164949b).f159288l;
        if (bmks == null) {
            bmks = bmks.f129878d;
        }
        bxvd bxvd2 = (bxvd) bmks.mo74142c(5);
        bxvd2.mo73625a((GeneratedMessageLite) bmks);
        bmkn bmkn = (bmkn) bxvd2;
        boolean z2 = !z;
        if (bmkn.f164950c) {
            bmkn.mo74035c();
            bmkn.f164950c = false;
        }
        bmks bmks2 = (bmks) bmkn.f164949b;
        bmks2.f129880a |= 1;
        bmks2.f129881b = z2;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bwgv bwgv = (bwgv) bxvd.f164949b;
        bmks bmks3 = (bmks) bmkn.mo74062i();
        bwgv bwgv2 = bwgv.f159275p;
        bmks3.getClass();
        bwgv.f159288l = bmks3;
        bwgv.f159277a |= 1024;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo59994e() {
        blzq blzq = ((blzf) this.f110340b.f164949b).f128346i;
        if (blzq == null) {
            blzq = blzq.f128364p;
        }
        return blzq.f128367b;
    }

    /* renamed from: f */
    public final void mo59996f(boolean z) {
        blze blze = this.f110340b;
        blzq blzq = ((blzf) blze.f164949b).f128346i;
        if (blzq == null) {
            blzq = blzq.f128364p;
        }
        bxvd bxvd = (bxvd) blzq.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) blzq);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        blzq blzq2 = (blzq) bxvd.f164949b;
        blzq2.f128366a |= 32;
        blzq2.f128372g = z;
        if (blze.f164950c) {
            blze.mo74035c();
            blze.f164950c = false;
        }
        blzf blzf = (blzf) blze.f164949b;
        blzq blzq3 = (blzq) bxvd.mo74062i();
        bxvu bxvu = blzf.f128336h;
        blzq3.getClass();
        blzf.f128346i = blzq3;
        blzf.f128339a |= 32;
    }

    /* renamed from: g */
    public final String mo59998g() {
        int m = mo60005m();
        int i = m - 1;
        if (m == 0) {
            throw null;
        } else if (i == 3) {
            return "changeMaskedWallet";
        } else {
            if (i == 4) {
                return "loadFullWallet";
            }
            if (i != 5) {
                return i != 6 ? "loadMaskedWallet" : "loadPaymentData";
            }
            return "loadWebPaymentData";
        }
    }

    /* renamed from: h */
    public final boolean mo60000h() {
        return ((bwgv) this.f110341c.f164949b).f159285i;
    }

    /* renamed from: i */
    public final String mo60001i() {
        return ((bwgv) this.f110341c.f164949b).f159286j;
    }

    /* renamed from: j */
    public final boolean mo60002j() {
        blzq blzq = ((blzf) this.f110340b.f164949b).f128346i;
        if (blzq == null) {
            blzq = blzq.f128364p;
        }
        return blzq.f128372g;
    }

    /* renamed from: k */
    public final bwgs mo60003k() {
        bxvd da = bwgs.f159256c.mo74144da();
        bxvd bxvd = this.f110341c;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwgs bwgs = (bwgs) da.f164949b;
        bwgv bwgv = (bwgv) bxvd.mo74062i();
        bwgv.getClass();
        bwgs.f159259b = bwgv;
        bwgs.f159258a |= 1;
        return (bwgs) da.mo74062i();
    }

    /* renamed from: l */
    public final void mo60004l() {
        bxvd bxvd = this.f110341c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bwgv bwgv = (bwgv) bxvd.f164949b;
        bwgv bwgv2 = bwgv.f159275p;
        bwgv.f159277a |= 4096;
        bwgv.f159290n = true;
    }

    /* renamed from: m */
    public final int mo60005m() {
        blzq blzq = ((blzf) this.f110340b.f164949b).f128346i;
        if (blzq == null) {
            blzq = blzq.f128364p;
        }
        int a = blzh.m107804a(blzq.f128374i);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: n */
    public final int mo60006n() {
        blzq blzq = ((blzf) this.f110340b.f164949b).f128346i;
        if (blzq == null) {
            blzq = blzq.f128364p;
        }
        if ((blzq.f128366a & 8) == 0) {
            return 1;
        }
        blzq blzq2 = ((blzf) this.f110340b.f164949b).f128346i;
        if (blzq2 == null) {
            blzq2 = blzq.f128364p;
        }
        bmab bmab = blzq2.f128370e;
        if (bmab == null) {
            bmab = bmab.f128425d;
        }
        int a = bmaa.m107825a(bmab.f128428b);
        if (a != 0) {
            return a;
        }
        return 1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(mo59990c());
        parcel.writeBundle(this.f110339a);
    }

    /* renamed from: g */
    public final void mo59999g(boolean z) {
        blze blze = this.f110340b;
        if (blze.f164950c) {
            blze.mo74035c();
            blze.f164950c = false;
        }
        blzf blzf = (blzf) blze.f164949b;
        bxvu bxvu = blzf.f128336h;
        blzf.f128339a |= 8;
        blzf.f128343e = z;
    }

    /* renamed from: e */
    public final void mo59995e(boolean z) {
        bxvd bxvd = this.f110341c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bwgv bwgv = (bwgv) bxvd.f164949b;
        bwgv bwgv2 = bwgv.f159275p;
        bwgv.f159277a |= 16;
        bwgv.f159282f = z;
    }

    /* renamed from: b */
    public final IbBuyFlowInput mo59984b() {
        bwgv bwgv = (bwgv) this.f110341c.mo74062i();
        bxvd bxvd = (bxvd) bwgv.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bwgv);
        IbBuyFlowInput ibBuyFlowInput = new IbBuyFlowInput((blzf) this.f110340b.mo74062i(), bxvd);
        ibBuyFlowInput.mo59977a(this.f110339a);
        return ibBuyFlowInput;
    }

    /* renamed from: c */
    public final void mo59989c(boolean z) {
        bxvd bxvd = this.f110341c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bwgv bwgv = (bwgv) bxvd.f164949b;
        bwgv bwgv2 = bwgv.f159275p;
        bwgv.f159277a |= 2048;
        bwgv.f159289m = z;
        mo59985b(mo60005m());
        blzq blzq = ((blzf) this.f110340b.f164949b).f128346i;
        if (blzq == null) {
            blzq = blzq.f128364p;
        }
        mo59983a(blzq.f128375j);
        blzq blzq2 = ((blzf) this.f110340b.f164949b).f128346i;
        if (blzq2 == null) {
            blzq2 = blzq.f128364p;
        }
        mo59987b(blzq2.f128376k);
    }

    /* renamed from: b */
    public final void mo59985b(int i) {
        if (i != 0) {
            blze blze = this.f110340b;
            blzq blzq = ((blzf) blze.f164949b).f128346i;
            if (blzq == null) {
                blzq = blzq.f128364p;
            }
            bxvd bxvd = (bxvd) blzq.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) blzq);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            blzq blzq2 = (blzq) bxvd.f164949b;
            blzq2.f128374i = i - 1;
            blzq2.f128366a |= 128;
            if (blze.f164950c) {
                blze.mo74035c();
                blze.f164950c = false;
            }
            blzf blzf = (blzf) blze.f164949b;
            blzq blzq3 = (blzq) bxvd.mo74062i();
            bxvu bxvu = blzf.f128336h;
            blzq3.getClass();
            blzf.f128346i = blzq3;
            blzf.f128339a |= 32;
        } else {
            i = 0;
        }
        bxvd bxvd2 = this.f110341c;
        if (!((bwgv) bxvd2.f164949b).f159289m) {
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bwgv bwgv = (bwgv) bxvd2.f164949b;
            int i2 = i - 1;
            bwgv bwgv2 = bwgv.f159275p;
            if (i != 0) {
                bwgv.f159281e = i2;
                bwgv.f159277a |= 8;
                return;
            }
            throw null;
        }
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bwgv bwgv3 = (bwgv) bxvd2.f164949b;
        bwgv bwgv4 = bwgv.f159275p;
        bwgv3.f159281e = 0;
        bwgv3.f159277a |= 8;
    }

    /* renamed from: d */
    public final byte[] mo59992d() {
        bxvd da = bwgs.f159256c.mo74144da();
        bxvd bxvd = this.f110341c;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwgs bwgs = (bwgs) da.f164949b;
        bwgv bwgv = (bwgv) bxvd.mo74062i();
        bwgv.getClass();
        bwgs.f159259b = bwgv;
        bwgs.f159258a |= 1;
        blzf blzf = (blzf) this.f110340b.mo74062i();
        bxvd bxvd2 = (bxvd) blzf.mo74142c(5);
        bxvd2.mo73625a((GeneratedMessageLite) blzf);
        blze blze = (blze) bxvd2;
        bxtx aL = ((bwgs) da.mo74062i()).mo73639aL();
        if (blze.f164950c) {
            blze.mo74035c();
            blze.f164950c = false;
        }
        blzf blzf2 = (blzf) blze.f164949b;
        bxvu bxvu = blzf.f128336h;
        aL.getClass();
        blzf2.f128339a |= 2;
        blzf2.f128341c = aL;
        return ((blzf) blze.mo74062i()).mo73642k();
    }

    /* renamed from: f */
    public final boolean mo59997f() {
        bmks bmks = ((bwgv) this.f110341c.f164949b).f159288l;
        if (bmks == null) {
            bmks = bmks.f129878d;
        }
        return !bmks.f129881b;
    }

    /* renamed from: c */
    public final byte[] mo59990c() {
        bxvd da = byai.f165264d.mo74144da();
        blze blze = this.f110340b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byai byai = (byai) da.f164949b;
        blzf blzf = (blzf) blze.mo74062i();
        blzf.getClass();
        byai.f165268c = blzf;
        byai.f165266a |= 2;
        bxvd bxvd = this.f110341c;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byai byai2 = (byai) da.f164949b;
        bwgv bwgv = (bwgv) bxvd.mo74062i();
        bwgv.getClass();
        byai2.f165267b = bwgv;
        byai2.f165266a |= 1;
        return ((byai) da.mo74062i()).mo73642k();
    }

    /* renamed from: b */
    public final void mo59986b(String str) {
        blze blze = this.f110340b;
        blzq blzq = ((blzf) blze.f164949b).f128346i;
        if (blzq == null) {
            blzq = blzq.f128364p;
        }
        bxvd bxvd = (bxvd) blzq.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) blzq);
        sdo.m34959a((Object) str);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        blzq blzq2 = (blzq) bxvd.f164949b;
        str.getClass();
        blzq2.f128366a |= 1;
        blzq2.f128367b = str;
        if (blze.f164950c) {
            blze.mo74035c();
            blze.f164950c = false;
        }
        blzf blzf = (blzf) blze.f164949b;
        blzq blzq3 = (blzq) bxvd.mo74062i();
        bxvu bxvu = blzf.f128336h;
        blzq3.getClass();
        blzf.f128346i = blzq3;
        blzf.f128339a |= 32;
    }

    /* renamed from: b */
    public final void mo59987b(boolean z) {
        blze blze = this.f110340b;
        blzq blzq = ((blzf) blze.f164949b).f128346i;
        if (blzq == null) {
            blzq = blzq.f128364p;
        }
        bxvd bxvd = (bxvd) blzq.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) blzq);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        blzq blzq2 = (blzq) bxvd.f164949b;
        blzq2.f128366a |= 512;
        blzq2.f128376k = z;
        if (blze.f164950c) {
            blze.mo74035c();
            blze.f164950c = false;
        }
        blzf blzf = (blzf) blze.f164949b;
        blzq blzq3 = (blzq) bxvd.mo74062i();
        bxvu bxvu = blzf.f128336h;
        blzq3.getClass();
        blzf.f128346i = blzq3;
        blzf.f128339a |= 32;
        bxvd bxvd2 = this.f110341c;
        if (!((bwgv) bxvd2.f164949b).f159289m) {
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bwgv bwgv = (bwgv) bxvd2.f164949b;
            bwgv bwgv2 = bwgv.f159275p;
            bwgv.f159277a |= 64;
            bwgv.f159284h = z;
            return;
        }
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bwgv bwgv3 = (bwgv) bxvd2.f164949b;
        bwgv bwgv4 = bwgv.f159275p;
        bwgv3.f159277a |= 64;
        bwgv3.f159284h = false;
    }

    /* renamed from: a */
    public static bwdx m94101a(List list) {
        if (list == null) {
            return null;
        }
        bxvd da = bwdx.f158952b.mo74144da();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bxvd da2 = bwdw.f158948c.mo74144da();
            String str = (String) list.get(i);
            if (str != null) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bwdw bwdw = (bwdw) da2.f164949b;
                str.getClass();
                bwdw.f158950a |= 1;
                bwdw.f158951b = str;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwdx bwdx = (bwdx) da.f164949b;
            bwdw bwdw2 = (bwdw) da2.mo74062i();
            bwdw2.getClass();
            bwdx.mo73517a();
            bwdx.f158954a.add(bwdw2);
        }
        return (bwdx) da.mo74062i();
    }

    /* renamed from: a */
    public static bwdx m94102a(JSONObject jSONObject, awru awru) {
        if (awrt.m80863c(jSONObject, awru) != 1) {
            return awrt.m80813a((JSONArray) awrt.m80829a((JSONObject) awrt.m80829a(jSONObject, "shippingAddressParameters", JSONObject.class, 1086, awru), "allowedCountryCodes", JSONArray.class, 1087, awru));
        }
        return awrt.m80813a((JSONArray) awrt.m80829a((JSONObject) awrt.m80829a(jSONObject, "shippingAddressRequirements", JSONObject.class, 1097, awru), "allowedCountryCodes", JSONArray.class, 1087, awru));
    }

    /* renamed from: a */
    public static IbBuyFlowInput m94103a() {
        bxvd da = bwgv.f159275p.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwgv bwgv = (bwgv) da.f164949b;
        int i = bwgv.f159277a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        bwgv.f159277a = i;
        bwgv.f159291o = true;
        int i2 = i | 32;
        bwgv.f159277a = i2;
        bwgv.f159283g = false;
        int i3 = i2 | 128;
        bwgv.f159277a = i3;
        bwgv.f159285i = false;
        int i4 = i3 | 16;
        bwgv.f159277a = i4;
        bwgv.f159282f = false;
        int i5 = i4 | 2048;
        bwgv.f159277a = i5;
        bwgv.f159289m = false;
        bwgv.f159277a = i5 | 64;
        bwgv.f159284h = false;
        return new IbBuyFlowInput(blzf.f128337k, da);
    }

    /* renamed from: a */
    public static IbBuyFlowInput m94104a(bxtx bxtx) {
        return m94105a(bxtx.mo73780k());
    }

    /* renamed from: a */
    public static IbBuyFlowInput m94105a(byte[] bArr) {
        byai byai = (byai) bjvp.m104733a(bArr, (bxxk) byai.f165264d.mo74142c(7));
        blzf blzf = byai.f165268c;
        if (blzf == null) {
            blzf = blzf.f128337k;
        }
        bwgv bwgv = byai.f165267b;
        if (bwgv == null) {
            bwgv = bwgv.f159275p;
        }
        bxvd bxvd = (bxvd) bwgv.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bwgv);
        return new IbBuyFlowInput(blzf, bxvd);
    }

    /* renamed from: a */
    public static bmfk[] m94106a(boolean z, boolean z2, List list, int i) {
        ArrayList arrayList = new ArrayList();
        if (!z) {
            arrayList.add(bmfk.CARD_CLASS_PREPAID);
        }
        if (!z2) {
            arrayList.add(bmfk.CARD_CLASS_DEBIT);
        }
        if (i == 3) {
            arrayList.add(bmfk.CARD_NETWORK_TOKEN_DISABLED);
        }
        if (list == null || list.isEmpty()) {
            list = awmi.f94611a;
        }
        for (Map.Entry entry : awrt.f94942b.entrySet()) {
            if (!list.contains(entry.getKey())) {
                arrayList.add(bmfk.m107976a(((Integer) entry.getValue()).intValue()));
            }
        }
        return (bmfk[]) arrayList.toArray(new bmfk[arrayList.size()]);
    }

    /* renamed from: a */
    public final int mo59974a(String str) {
        bmks bmks = ((bwgv) this.f110341c.f164949b).f159288l;
        if (bmks == null) {
            bmks = bmks.f129878d;
        }
        bxwc bxwc = bmks.f129882c;
        int size = bxwc.size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            bmkr bmkr = (bmkr) bxwc.get(i2);
            if (str.equals(bmkr.f129869b) && (i = bmkp.m108124a(bmkr.f129870c)) == 0) {
                i = 1;
            }
        }
        return bjuz.m104678a(i);
    }

    /* renamed from: a */
    public final blze mo59975a(JSONObject jSONObject, String str, awru awru) {
        bwdx a = m94102a(jSONObject, awru);
        if (a == null) {
            blze blze = this.f110340b;
            if (blze.f164950c) {
                blze.mo74035c();
                blze.f164950c = false;
            }
            blzf blzf = (blzf) blze.f164949b;
            bxvu bxvu = blzf.f128336h;
            blzf.f128344f = null;
            blzf.f128339a &= -17;
        } else {
            blze blze2 = this.f110340b;
            if (blze2.f164950c) {
                blze2.mo74035c();
                blze2.f164950c = false;
            }
            blzf blzf2 = (blzf) blze2.f164949b;
            bxvu bxvu2 = blzf.f128336h;
            a.getClass();
            blzf2.f128344f = a;
            blzf2.f128339a |= 16;
        }
        blze blze3 = this.f110340b;
        blzq blzq = ((blzf) blze3.f164949b).f128346i;
        if (blzq == null) {
            blzq = blzq.f128364p;
        }
        bxvd bxvd = (bxvd) blzq.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) blzq);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        blzq blzq2 = (blzq) bxvd.f164949b;
        str.getClass();
        blzq2.f128366a |= 2048;
        blzq2.f128379o = str;
        if (blze3.f164950c) {
            blze3.mo74035c();
            blze3.f164950c = false;
        }
        blzf blzf3 = (blzf) blze3.f164949b;
        blzq blzq3 = (blzq) bxvd.mo74062i();
        blzq3.getClass();
        blzf3.f128346i = blzq3;
        blzf3.f128339a |= 32;
        if (chgl.m148678b()) {
            blze blze4 = this.f110340b;
            bwef b = m94107b(jSONObject, awru);
            if (blze4.f164950c) {
                blze4.mo74035c();
                blze4.f164950c = false;
            }
            blzf blzf4 = (blzf) blze4.f164949b;
            b.getClass();
            blzf4.f128347j = b;
            blzf4.f128339a |= 64;
        }
        return this.f110340b;
    }

    /* renamed from: a */
    public final void mo59976a(int i) {
        blze blze = this.f110340b;
        blzq blzq = ((blzf) blze.f164949b).f128346i;
        if (blzq == null) {
            blzq = blzq.f128364p;
        }
        bxvd bxvd = (bxvd) blzq.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) blzq);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        blzq blzq2 = (blzq) bxvd.f164949b;
        blzq2.f128366a |= 64;
        blzq2.f128373h = i;
        if (blze.f164950c) {
            blze.mo74035c();
            blze.f164950c = false;
        }
        blzf blzf = (blzf) blze.f164949b;
        blzq blzq3 = (blzq) bxvd.mo74062i();
        bxvu bxvu = blzf.f128336h;
        blzq3.getClass();
        blzf.f128346i = blzq3;
        blzf.f128339a |= 32;
    }

    /* renamed from: a */
    public final void mo59978a(bwey bwey) {
        if (bwey != null) {
            blze blze = this.f110340b;
            blzq blzq = ((blzf) blze.f164949b).f128346i;
            if (blzq == null) {
                blzq = blzq.f128364p;
            }
            bxvd bxvd = (bxvd) blzq.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) blzq);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            blzq blzq2 = (blzq) bxvd.f164949b;
            bwey.getClass();
            blzq2.f128371f = bwey;
            blzq2.f128366a |= 16;
            if (blze.f164950c) {
                blze.mo74035c();
                blze.f164950c = false;
            }
            blzf blzf = (blzf) blze.f164949b;
            blzq blzq3 = (blzq) bxvd.mo74062i();
            bxvu bxvu = blzf.f128336h;
            blzq3.getClass();
            blzf.f128346i = blzq3;
            blzf.f128339a |= 32;
        }
    }

    /* renamed from: a */
    public final void mo59979a(bwgu bwgu) {
        bxvd bxvd = this.f110341c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bwgv bwgv = (bwgv) bxvd.f164949b;
        bwgv bwgv2 = bwgv.f159275p;
        bwgu.getClass();
        bwgv.f159278b = bwgu;
        bwgv.f159277a |= 1;
    }

    /* renamed from: a */
    public final void mo59980a(byal byal) {
        bxvd bxvd = this.f110341c;
        String str = byal.f165283c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bwgv bwgv = (bwgv) bxvd.f164949b;
        bwgv bwgv2 = bwgv.f159275p;
        str.getClass();
        int i = bwgv.f159277a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        bwgv.f159277a = i;
        bwgv.f159286j = str;
        bxtx bxtx = byal.f165284d;
        bxtx.getClass();
        int i2 = i | 512;
        bwgv.f159277a = i2;
        bwgv.f159287k = bxtx;
        boolean z = byal.f165285e;
        bwgv.f159277a = i2 | 128;
        bwgv.f159285i = z;
    }

    /* renamed from: a */
    public final void mo59981a(GetActiveCardsForAccountResponse getActiveCardsForAccountResponse) {
        if (getActiveCardsForAccountResponse != null) {
            bxvd bxvd = this.f110341c;
            bmks bmks = ((bwgv) bxvd.f164949b).f159288l;
            if (bmks == null) {
                bmks = bmks.f129878d;
            }
            bxvd bxvd2 = (bxvd) bmks.mo74142c(5);
            bxvd2.mo73625a((GeneratedMessageLite) bmks);
            bmkn bmkn = (bmkn) bxvd2;
            if (bmkn.f164950c) {
                bmkn.mo74035c();
                bmkn.f164950c = false;
            }
            ((bmks) bmkn.f164949b).f129882c = GeneratedMessageLite.m124030de();
            bmkn.mo66799a(awrt.m80838a(getActiveCardsForAccountResponse.f108367a));
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bwgv bwgv = (bwgv) bxvd.f164949b;
            bmks bmks2 = (bmks) bmkn.mo74062i();
            bwgv bwgv2 = bwgv.f159275p;
            bmks2.getClass();
            bwgv.f159288l = bmks2;
            bwgv.f159277a |= 1024;
            return;
        }
        bxvd bxvd3 = this.f110341c;
        bmks bmks3 = ((bwgv) bxvd3.f164949b).f159288l;
        if (bmks3 == null) {
            bmks3 = bmks.f129878d;
        }
        bxvd bxvd4 = (bxvd) bmks3.mo74142c(5);
        bxvd4.mo73625a((GeneratedMessageLite) bmks3);
        bmkn bmkn2 = (bmkn) bxvd4;
        if (bmkn2.f164950c) {
            bmkn2.mo74035c();
            bmkn2.f164950c = false;
        }
        ((bmks) bmkn2.f164949b).f129882c = GeneratedMessageLite.m124030de();
        if (bxvd3.f164950c) {
            bxvd3.mo74035c();
            bxvd3.f164950c = false;
        }
        bwgv bwgv3 = (bwgv) bxvd3.f164949b;
        bmks bmks4 = (bmks) bmkn2.mo74062i();
        bwgv bwgv4 = bwgv.f159275p;
        bmks4.getClass();
        bwgv3.f159288l = bmks4;
        bwgv3.f159277a |= 1024;
    }

    /* renamed from: a */
    public final void mo59982a(PaymentDataRequest paymentDataRequest) {
        bmab a = m94100a(paymentDataRequest.f109890g);
        if (a == null) {
            blze blze = this.f110340b;
            blzq blzq = ((blzf) blze.f164949b).f128346i;
            if (blzq == null) {
                blzq = blzq.f128364p;
            }
            bxvd bxvd = (bxvd) blzq.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) blzq);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            blzq blzq2 = (blzq) bxvd.f164949b;
            blzq2.f128370e = null;
            blzq2.f128366a &= -9;
            if (blze.f164950c) {
                blze.mo74035c();
                blze.f164950c = false;
            }
            blzf blzf = (blzf) blze.f164949b;
            blzq blzq3 = (blzq) bxvd.mo74062i();
            bxvu bxvu = blzf.f128336h;
            blzq3.getClass();
            blzf.f128346i = blzq3;
            blzf.f128339a |= 32;
            return;
        }
        blze blze2 = this.f110340b;
        blzq blzq4 = ((blzf) blze2.f164949b).f128346i;
        if (blzq4 == null) {
            blzq4 = blzq.f128364p;
        }
        bxvd bxvd2 = (bxvd) blzq4.mo74142c(5);
        bxvd2.mo73625a((GeneratedMessageLite) blzq4);
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        blzq blzq5 = (blzq) bxvd2.f164949b;
        a.getClass();
        blzq5.f128370e = a;
        blzq5.f128366a |= 8;
        if (blze2.f164950c) {
            blze2.mo74035c();
            blze2.f164950c = false;
        }
        blzf blzf2 = (blzf) blze2.f164949b;
        blzq blzq6 = (blzq) bxvd2.mo74062i();
        bxvu bxvu2 = blzf.f128336h;
        blzq6.getClass();
        blzf2.f128346i = blzq6;
        blzf2.f128339a |= 32;
    }

    /* renamed from: a */
    public final void mo59983a(boolean z) {
        blze blze = this.f110340b;
        blzq blzq = ((blzf) blze.f164949b).f128346i;
        if (blzq == null) {
            blzq = blzq.f128364p;
        }
        bxvd bxvd = (bxvd) blzq.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) blzq);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        blzq blzq2 = (blzq) bxvd.f164949b;
        blzq2.f128366a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        blzq2.f128375j = z;
        if (blze.f164950c) {
            blze.mo74035c();
            blze.f164950c = false;
        }
        blzf blzf = (blzf) blze.f164949b;
        blzq blzq3 = (blzq) bxvd.mo74062i();
        bxvu bxvu = blzf.f128336h;
        blzq3.getClass();
        blzf.f128346i = blzq3;
        blzf.f128339a |= 32;
        bxvd bxvd2 = this.f110341c;
        if (!((bwgv) bxvd2.f164949b).f159289m) {
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bwgv bwgv = (bwgv) bxvd2.f164949b;
            bwgv bwgv2 = bwgv.f159275p;
            bwgv.f159277a |= 32;
            bwgv.f159283g = z;
            return;
        }
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bwgv bwgv3 = (bwgv) bxvd2.f164949b;
        bwgv bwgv4 = bwgv.f159275p;
        bwgv3.f159277a |= 32;
        bwgv3.f159283g = false;
    }
}
