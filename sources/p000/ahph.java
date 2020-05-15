package p000;

import android.bluetooth.BluetoothDevice;
import java.util.Arrays;

/* renamed from: ahph */
public final /* synthetic */ class ahph implements Runnable {

    /* renamed from: a */
    private final ahpj f67715a;

    /* renamed from: b */
    private final aisb f67716b;

    /* renamed from: c */
    private final byte[] f67717c;

    /* renamed from: d */
    private final byte[] f67718d;

    public ahph(ahpj ahpj, aisb aisb, byte[] bArr, byte[] bArr2) {
        this.f67715a = ahpj;
        this.f67716b = aisb;
        this.f67717c = bArr;
        this.f67718d = bArr2;
    }

    public final void run() {
        ahpj ahpj = this.f67715a;
        aisb aisb = this.f67716b;
        byte[] bArr = this.f67717c;
        byte[] bArr2 = this.f67718d;
        if (!ahpj.f67721a.mo36728k()) {
            ((bnsl) ahkm.f67363a.mo68388c()).mo68420a("Skipping discovery of NfcDevice %s because we are no longer discovering.", aisb);
            return;
        }
        ahox a = ahox.m56302a(bArr);
        if (a == null) {
            srn srn = ahkm.f67363a;
            ahkm.m55981a(bArr);
        } else if (a.f67679b != ahpj.f67726f.mo36959h()) {
            srn srn2 = ahkm.f67363a;
            ahkm.m55981a(bArr);
        } else if (!Arrays.equals(a.f67681d, ahpj.f67723c)) {
            srn srn3 = ahkm.f67363a;
            ahkm.m55981a(bArr);
            ahkm.m55981a(ahpj.f67723c);
            ahkm.m55981a(a.f67681d);
        } else {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68425a("Found NfcTag %s (with EndpointId %s and EndpointInfo %s)", a, a.f67680c, ahkm.m55981a(a.f67682e));
            ahmi ahmi = new ahmi(aisb, a.f67680c, a.f67682e, ahpj.f67722b);
            ahpj.f67724d.put(aisb, ahmi);
            ahpj.f67726f.mo36851b(ahpj.f67721a, ahmi);
            ahpj.f67721a.mo36703a(a.f67680c, bArr2);
            ahpj.f67726f.mo36845a(ahpj.f67721a, a.f67680c, bvif.NFC, 2);
            String str = a.f67683f;
            if (str == null) {
                ((bnsl) ahkm.f67363a.mo68390d()).mo68420a("No Bluetooth Classic MAC address found in NfcTag %s", a);
                return;
            }
            BluetoothDevice c = ahpj.f67726f.f67765j.mo36925c(str);
            if (c == null) {
                ((bnsl) ahkm.f67363a.mo68388c()).mo68424a("A valid Bluetooth device could not be derived from the MAC address (%s) found in NfcTag %s", str, a);
                return;
            }
            ahme ahme = new ahme(c, a.f67680c, a.f67682e, ahpj.f67722b);
            ahpj.f67725e.put(aisb, ahme);
            ahpj.f67726f.mo36851b(ahpj.f67721a, ahme);
        }
    }
}
