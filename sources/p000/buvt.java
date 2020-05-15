package p000;

import android.bluetooth.BluetoothDevice;

/* renamed from: buvt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buvt extends buqn {

    /* renamed from: a */
    final /* synthetic */ BluetoothDevice f155076a;

    /* renamed from: b */
    final /* synthetic */ byte[] f155077b;

    /* renamed from: c */
    final /* synthetic */ buyv f155078c;

    /* renamed from: d */
    final /* synthetic */ int f155079d;

    /* renamed from: e */
    final /* synthetic */ buvu f155080e;

    /* renamed from: f */
    final /* synthetic */ int f155081f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public buvt(buvu buvu, String str, BluetoothDevice bluetoothDevice, byte[] bArr, buyv buyv, int i, int i2) {
        super(str);
        this.f155080e = buvu;
        this.f155076a = bluetoothDevice;
        this.f155077b = bArr;
        this.f155078c = buyv;
        this.f155079d = i;
        this.f155081f = i2;
    }

    public final void run() {
        if (this.f155080e.f155087f != null) {
            String address = this.f155076a.getAddress();
            bxvd da = buzq.f155418c.mo74144da();
            bxtx a = bxtx.m123261a(this.f155077b);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            buzq buzq = (buzq) da.f164949b;
            a.getClass();
            buzq.f155420a |= 1;
            buzq.f155421b = a;
            buzq buzq2 = (buzq) da.mo74062i();
            buyv buyv = this.f155078c;
            bxvd da2 = buzu.f155430c.mo74144da();
            bxtx a2 = bxtx.m123261a(bvau.m120846a(address));
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            buzu buzu = (buzu) da2.f164949b;
            a2.getClass();
            buzu.f155432a |= 1;
            buzu.f155433b = a2;
            buzu buzu2 = (buzu) da2.mo74062i();
            boolean q = cfoa.f184773a.mo6606a().mo81876q();
            int i = this.f155079d;
            int i2 = this.f155081f;
            bxvf bxvf = (bxvf) bvae.f155472e.mo74144da();
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            bvae bvae = (bvae) bxvf.f164949b;
            bvae.f155475b = 4;
            bvae.f155474a |= 1;
            bxvf bxvf2 = (bxvf) buyw.f155343h.mo74144da();
            if (bxvf2.f164950c) {
                bxvf2.mo74035c();
                bxvf2.f164950c = false;
            }
            buyw buyw = (buyw) bxvf2.f164949b;
            buyw.f155350f = 1;
            int i3 = buyw.f155345a | 16;
            buyw.f155345a = i3;
            buzq2.getClass();
            buyw.f155346b = buzq2;
            int i4 = i3 | 1;
            buyw.f155345a = i4;
            buyw.f155348d = buyv.f155342e;
            int i5 = i4 | 4;
            buyw.f155345a = i5;
            buzu2.getClass();
            buyw.f155347c = buzu2;
            int i6 = i5 | 2;
            buyw.f155345a = i6;
            int i7 = i2 - 1;
            if (i2 != 0) {
                buyw.f155351g = i7;
                int i8 = i6 | 32;
                buyw.f155345a = i8;
                if (q) {
                    buyw.f155345a = i8 | 8;
                    buyw.f155349e = i;
                }
                if (bxvf.f164950c) {
                    bxvf.mo74035c();
                    bxvf.f164950c = false;
                }
                bvae bvae2 = (bvae) bxvf.f164949b;
                buyw buyw2 = (buyw) bxvf2.mo74062i();
                buyw2.getClass();
                bvae2.f155477d = buyw2;
                bvae2.f155474a |= 4;
                this.f155080e.f155087f.mo36284a(buvu.m120535a((bvae) bxvf.mo74062i()));
                return;
            }
            throw null;
        }
    }
}
