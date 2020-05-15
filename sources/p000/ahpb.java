package p000;

import android.bluetooth.BluetoothDevice;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: ahpb */
final /* synthetic */ class ahpb implements Runnable {

    /* renamed from: a */
    private final ahpd f67694a;

    /* renamed from: b */
    private final byte[] f67695b;

    /* renamed from: c */
    private final boolean f67696c;

    /* renamed from: d */
    private final aipt f67697d;

    public ahpb(ahpd ahpd, byte[] bArr, boolean z, aipt aipt) {
        this.f67694a = ahpd;
        this.f67695b = bArr;
        this.f67696c = z;
        this.f67697d = aipt;
    }

    public final void run() {
        ahmo ahmo;
        ahpd ahpd = this.f67694a;
        byte[] bArr = this.f67695b;
        boolean z = this.f67696c;
        aipt aipt = this.f67697d;
        if (!ahpd.f67700a.mo36728k()) {
            ((bnsl) ahkm.f67363a.mo68388c()).mo68420a("Skipping discovery of BleAdvertisement header %s because we are no longer discovering.", ahkm.m55981a(bArr));
            return;
        }
        if (!z) {
            ahmo = ahmo.m56179a(bArr, false);
        } else {
            ahmo = ahmo.m56179a(bArr, true);
        }
        if (ahmo == null) {
            srn srn = ahkm.f67363a;
            ahkm.m55981a(bArr);
        } else if (ahmo.f67557a != ahpd.f67705f.mo36959h()) {
            srn srn2 = ahkm.f67363a;
            ahkm.m55981a(bArr);
        } else if (!z && !Arrays.equals(ahmo.f67558b, ahpd.f67702c)) {
            srn srn3 = ahkm.f67363a;
            ahkm.m55981a(bArr);
            ahkm.m55981a(ahpd.f67702c);
            ahkm.m55981a(ahmo.f67558b);
        } else {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68425a("Found BleAdvertisement %s (with EndpointId %s and EndpointInfo %s)", ahkm.m55981a(bArr), ahmo.f67559c, ahkm.m55981a(ahmo.f67560d));
            ahmd ahmd = new ahmd(aipt, ahmo.f67559c, ahmo.f67560d, ahpd.f67701b);
            ahpd.f67703d.put(aipt, ahmd);
            ahpz ahpz = ahpd.f67705f;
            String str = ahmo.f67559c;
            String str2 = ahmo.f67561e;
            ahme ahme = null;
            if (ahpz.f67766k != null && !TextUtils.isEmpty(str2)) {
                Iterator it = ahpz.f67766k.f67713d.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ahme ahme2 = (ahme) it.next();
                    if (!str.equals(ahme2.f67521b) && bmwb.m108443a(str2, ahme2.f67518a.getAddress())) {
                        ahme = ahme2;
                        break;
                    }
                }
            }
            if (ahme != null) {
                ((bnsl) ahkm.f67363a.mo68388c()).mo68425a("Found duplicated Bluetooth endpoint which have same MAC address (%s) but different endpointId (%s)/(%s)", ahmo.f67561e, ahmo.f67559c, ahme.f67521b);
                ahpd.f67705f.mo36854c(ahpd.f67700a, ahme);
            }
            ahpd.f67705f.mo36851b(ahpd.f67700a, ahmd);
            ahpd.f67705f.mo36845a(ahpd.f67700a, ahmo.f67559c, bvif.BLE, 1);
            if (cfnv.m140781e()) {
                String str3 = ahmo.f67561e;
                if (str3 == null) {
                    ((bnsl) ahkm.f67363a.mo68390d()).mo68420a("No Bluetooth Classic MAC address found in %s", ahkm.m55981a(bArr));
                    return;
                }
                BluetoothDevice c = ahpd.f67705f.f67765j.mo36925c(str3);
                if (c != null) {
                    ahme ahme3 = new ahme(c, ahmo.f67559c, ahmo.f67560d, ahpd.f67701b);
                    ahpd.f67704e.put(aipt, ahme3);
                    ahpd.f67705f.mo36851b(ahpd.f67700a, ahme3);
                    return;
                }
                ((bnsl) ahkm.f67363a.mo68388c()).mo68424a("A valid Bluetooth device could not be derived from the MAC address (%s) found in %s", str3, ahkm.m55981a(bArr));
            }
        }
    }
}
