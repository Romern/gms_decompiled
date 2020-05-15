package p000;

import com.google.android.gms.nearby.bootstrap.Device;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ahcd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahcd implements ahcv {

    /* renamed from: a */
    public static final bnsp f66974a = bnsp.m110328a("NearbyBootstrap");

    /* renamed from: b */
    public ahdv f66975b;

    /* renamed from: c */
    public boolean f66976c;

    /* renamed from: d */
    final bvat f66977d = new ahcc(this);

    /* renamed from: e */
    public final buqb f66978e;

    /* renamed from: f */
    private final buye f66979f;

    /* renamed from: g */
    private bvaa f66980g;

    /* renamed from: h */
    private final Map f66981h;

    public ahcd(buye buye, buqb buqb) {
        this.f66979f = buye;
        this.f66981h = new HashMap();
        this.f66976c = false;
        this.f66978e = buqb;
    }

    /* renamed from: a */
    public final Device mo36285a(bvai bvai) {
        int a;
        if (bvai.f155484c.size() > 0 && (a = bvag.m120831a(((bvae) bvai.f155484c.get(0)).f155475b)) != 0 && a == 5 && (((bvae) bvai.f155484c.get(0)).f155474a & 4) != 0) {
            buyw buyw = ((bvae) bvai.f155484c.get(0)).f155477d;
            if (buyw == null) {
                buyw = buyw.f155343h;
            }
            buzq buzq = buyw.f155346b;
            if (buzq == null) {
                buzq = buzq.f155418c;
            }
            if ((buzq.f155420a & 1) != 0) {
                buzu buzu = buyw.f155347c;
                if (buzu == null) {
                    buzu = buzu.f155430c;
                }
                if ((buzu.f155432a & 1) != 0) {
                    buyv a2 = buyv.m120788a(buyw.f155348d);
                    if (a2 == null) {
                        a2 = buyv.BLE_ADVERTISE_DATA_TYPE_UNKNOWN;
                    }
                    if (a2 == buyv.BLE_ADVERTISE_MANUFACTURER_DATA) {
                        buzu buzu2 = buyw.f155347c;
                        if (buzu2 == null) {
                            buzu2 = buzu.f155430c;
                        }
                        String a3 = ahcj.m55464a(buzu2.f155433b.mo73780k());
                        this.f66981h.put(a3, a3);
                        buzq buzq2 = buyw.f155346b;
                        if (buzq2 == null) {
                            buzq2 = buzq.f155418c;
                        }
                        byte[] k = buzq2.f155421b.mo73780k();
                        int length = k.length;
                        if (length <= 4) {
                            return null;
                        }
                        byte b = k[0];
                        if (((b & 224) >>> 5) != 1) {
                            return null;
                        }
                        byte b2 = b & 31;
                        if (b2 > 4) {
                            b2 = 0;
                        }
                        int i = length - 3;
                        byte[] bArr = new byte[i];
                        System.arraycopy(k, 3, bArr, 0, i);
                        return new Device(new String(bArr), Integer.toString(((k[1] & 255) * 256) + (k[2] & 255)), a3, (byte) b2);
                    }
                }
            }
            bnsl bnsl = (bnsl) f66974a.mo68388c();
            bnsl.mo68432a("ahcd", "a", 94, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("BleScanner: scan status does not contain payload");
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo36288b() {
        ahdv ahdv = this.f66975b;
        return (ahdv == null || ahdv.asBinder() == null || !this.f66975b.asBinder().isBinderAlive()) ? false : true;
    }

    /* renamed from: c */
    public final boolean mo36289c() {
        return this.f66976c;
    }

    /* renamed from: a */
    public final synchronized void mo36286a() {
        if (this.f66976c) {
            this.f66976c = false;
            bvaa bvaa = this.f66980g;
            if (bvaa != null) {
                this.f66979f.mo73259a(bvaa.f155451b);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo36287a(ahdv ahdv) {
        bxvf bxvf = (bxvf) bvad.f155465e.mo74144da();
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        bvad bvad = (bvad) bxvf.f164949b;
        bvad.f155468b = 4;
        bvad.f155467a |= 1;
        bxvd da = buzb.f155365f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        buzb buzb = (buzb) da.f164949b;
        buzb.f155368b = 2;
        buzb.f155367a |= 1;
        buyv buyv = buyv.BLE_ADVERTISE_MANUFACTURER_DATA;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        buzb buzb2 = (buzb) da.f164949b;
        buzb2.f155369c = buyv.f155342e;
        buzb2.f155367a |= 2;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        bvad bvad2 = (bvad) bxvf.f164949b;
        buzb buzb3 = (buzb) da.mo74062i();
        buzb3.getClass();
        bvad2.f155470d = buzb3;
        bvad2.f155467a |= 4;
        bvad bvad3 = (bvad) bxvf.mo74062i();
        if (!this.f66979f.mo73261a(bvad3)) {
            bnsl bnsl = (bnsl) f66974a.mo68388c();
            bnsl.mo68432a("ahcd", "a", 122, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("BleScanner: this device is unable to do BLE scanning");
            return;
        }
        this.f66975b = ahdv;
        this.f66976c = true;
        this.f66980g = this.f66979f.mo73254a(bvad3, this.f66977d);
    }
}
