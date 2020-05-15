package p000;

import android.bluetooth.BluetoothDevice;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.beacon.BleSighting;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: buvq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buvq extends nej {

    /* renamed from: a */
    final /* synthetic */ buvu f155072a;

    public buvq(buvu buvu) {
        this.f155072a = buvu;
    }

    /* renamed from: a */
    public final void mo13773a(int i) {
        bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
        bnsl.mo68432a("buvq", "a", (int) MfiClientException.TYPE_MFICLIENT_NOT_STARTED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68409a("BleScan: BLE scanning failed with error=%d", i);
        this.f155072a.mo73159b();
    }

    /* renamed from: a */
    public final void mo13774a(int i, BleSighting bleSighting) {
        BluetoothDevice bluetoothDevice;
        byte[] a;
        int i2;
        if (bleSighting != null && (bluetoothDevice = bleSighting.f29271a) != null) {
            String address = bluetoothDevice.getAddress();
            nek nek = bleSighting.f29272b;
            if (nek != null) {
                boolean z = true;
                if (this.f155072a.f155085d != buyv.BLE_ADVERTISE_MANUFACTURER_DATA) {
                    if (this.f155072a.f155085d == buyv.BLE_ADVERTISE_SCAN_RECORD) {
                        int i3 = Integer.MIN_VALUE;
                        if (((int) ccov.m131092c()) != Integer.MIN_VALUE) {
                            i3 = bleSighting.f29274d + ((int) ccov.m131092c());
                        }
                        if (i3 >= -128 && i3 <= 128) {
                            i2 = i3;
                        } else {
                            i2 = bleSighting.f29274d;
                        }
                        buvu buvu = this.f155072a;
                        byte[] bArr = nek.f35402e;
                        BluetoothDevice bluetoothDevice2 = bleSighting.f29271a;
                        buyv buyv = buyv.BLE_ADVERTISE_SCAN_RECORD;
                        buvu buvu2 = this.f155072a;
                        if (nek.mo20526a(buwo.f155155b) == null) {
                            z = false;
                        }
                        buvu.mo73158a(bArr, bluetoothDevice2, i2, buyv, buvu2.mo73157a(z));
                        return;
                    }
                    bnsl bnsl = (bnsl) bvcm.f155598a.mo68388c();
                    bnsl.mo68432a("buvq", "a", 134, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("BleScan: unknown bleAdvertiseDataType: %s", this.f155072a.f155085d);
                } else if (this.f155072a.f155084c.mo25325a(address) == null && (a = nek.mo20525a((int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD)) != null && a.length > 2 && a[1] == 16) {
                    srn srn = bvcm.f155598a;
                    srv.m36164d(a);
                    this.f155072a.f155084c.mo25327a(address, "");
                    buvc buvc = this.f155072a.f155082a;
                    BluetoothDevice bluetoothDevice3 = bleSighting.f29271a;
                    buvc.f155028a.put(bluetoothDevice3.getAddress(), bluetoothDevice3);
                    int i4 = a[0] - 1;
                    byte[] bArr2 = new byte[i4];
                    System.arraycopy(a, 2, bArr2, 0, i4);
                    this.f155072a.mo73158a(bArr2, bleSighting.f29271a, bleSighting.f29274d, buyv.BLE_ADVERTISE_MANUFACTURER_DATA, this.f155072a.mo73157a(false));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo20523a(String str) {
        bvat bvat = this.f155072a.f155087f;
        bxvd da = buzu.f155430c.mo74144da();
        ByteString a = ByteString.m123261a(bvau.m120846a(str));
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        buzu buzu = (buzu) da.f164949b;
        a.getClass();
        buzu.f155432a |= 1;
        buzu.f155433b = a;
        buzu buzu2 = (buzu) da.mo74062i();
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
        buyw.f155350f = 2;
        int i = buyw.f155345a | 16;
        buyw.f155345a = i;
        buzu2.getClass();
        buyw.f155347c = buzu2;
        buyw.f155345a = i | 2;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        bvae bvae2 = (bvae) bxvf.f164949b;
        buyw buyw2 = (buyw) bxvf2.mo74062i();
        buyw2.getClass();
        bvae2.f155477d = buyw2;
        bvae2.f155474a |= 4;
        bvat.mo36284a(buvu.m120535a((bvae) bxvf.mo74062i()));
    }
}
