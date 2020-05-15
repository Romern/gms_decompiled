package p000;

import com.google.android.gms.nearby.bootstrap.Device;

/* renamed from: ahch */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahch extends ahdb {

    /* renamed from: a */
    public static final bnsp f66983a = bnsp.m110328a("NearbyBootstrap");

    /* renamed from: v */
    private bvaa f66984v = null;

    public ahch(buye buye, buqb buqb, String str, String str2, byte b, ahdj ahdj, ahdm ahdm, ahcs ahcs) {
        super(buye, buqb, str, str2, b, ahdj, ahdm, ahcs);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Device mo36291a(buyn buyn) {
        if ((buyn.f155318a & 2) == 0) {
            return null;
        }
        buzt buzt = buyn.f155320c;
        if (buzt == null) {
            buzt = buzt.f155423f;
        }
        int a = buzz.m120822a(buzt.f155426b);
        if (a == 0 || a != 3) {
            return null;
        }
        buzt buzt2 = buyn.f155320c;
        if (buzt2 == null) {
            buzt2 = buzt.f155423f;
        }
        if ((buzt2.f155425a & 16) == 0) {
            return null;
        }
        buzt buzt3 = buyn.f155320c;
        if (buzt3 == null) {
            buzt3 = buzt.f155423f;
        }
        buzx buzx = buzt3.f155427c;
        if (buzx == null) {
            buzx = buzx.f155443c;
        }
        String str = buzx.f155446b;
        buzt buzt4 = buyn.f155320c;
        if (buzt4 == null) {
            buzt4 = buzt.f155423f;
        }
        buzu buzu = buzt4.f155429e;
        if (buzu == null) {
            buzu = buzu.f155430c;
        }
        return new Device(ahcj.m55464a(buzu.f155433b.getKey()), "", str, (byte) 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final buym mo36293b() {
        bxvd da = buym.f155312c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        buym buym = (buym) da.f164949b;
        buym.f155315b = 2;
        buym.f155314a |= 1;
        return (buym) da.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo36294c() {
        bvaa bvaa = this.f66984v;
        if (bvaa != null) {
            this.f67021c.mo73259a(bvaa.f155451b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo36292a() {
        byte[] a = ahce.m55451a(this.f67030l, this.f67031m, this.f67032n);
        bxvf bxvf = (bxvf) buyq.f155323f.mo74144da();
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        buyq buyq = (buyq) bxvf.f164949b;
        buyq.f155326b = 3;
        buyq.f155325a |= 1;
        bxvd da = buzq.f155418c.mo74144da();
        ByteString a2 = ByteString.m123261a(a);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        buzq buzq = (buzq) da.f164949b;
        a2.getClass();
        buzq.f155420a |= 1;
        buzq.f155421b = a2;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        buyq buyq2 = (buyq) bxvf.f164949b;
        buzq buzq2 = (buzq) da.mo74062i();
        buzq2.getClass();
        buyq2.f155327c = buzq2;
        buyq2.f155325a |= 2;
        bxvd da2 = buyx.f155353d.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        buyx buyx = (buyx) da2.f164949b;
        buyx.f155355a |= 1;
        buyx.f155356b = true;
        buyv buyv = buyv.BLE_ADVERTISE_MANUFACTURER_DATA;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        buyx buyx2 = (buyx) da2.f164949b;
        buyx2.f155357c = buyv.f155342e;
        buyx2.f155355a |= 2;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        buyq buyq3 = (buyq) bxvf.f164949b;
        buyx buyx3 = (buyx) da2.mo74062i();
        buyx3.getClass();
        buyq3.f155329e = buyx3;
        buyq3.f155325a |= 8;
        buyq buyq4 = (buyq) bxvf.mo74062i();
        if (!this.f67021c.mo73260a(buyq4)) {
            bnsl bnsl = (bnsl) f66983a.mo68388c();
            bnsl.mo68432a("ahch", "a", 56, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("BleTargetDevice:  this device is not able to do BLE advertising");
            return false;
        }
        this.f66984v = this.f67021c.mo73252a(buyq4, new ahcg());
        return true;
    }
}
