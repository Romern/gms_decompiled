package p000;

import android.bluetooth.BluetoothDevice;

/* renamed from: ahmq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahmq implements ahll, ahoo {

    /* renamed from: a */
    private final ahov f67563a;

    /* renamed from: b */
    private final ahlk f67564b;

    /* renamed from: c */
    private final String f67565c = ails.m57437a(10);

    public ahmq(ahov ahov, ahlk ahlk) {
        this.f67563a = ahov;
        this.f67564b = ahlk;
    }

    /* renamed from: a */
    public final ahna mo36792a(ahkv ahkv, String str, butx butx) {
        butq butq = butx.f154899e;
        if (butq == null) {
            butq = butq.f154862d;
        }
        int i = butq.f154864a;
        if ((i & 1) == 0 || (i & 2) == 0) {
            throw new ahli(bvhu.PROTOCOL_ERROR, 19, "BluetoothBandwidthUpgradeMedium failed to parse UpgradePathInfo.");
        }
        String str2 = butq.f154865b;
        String str3 = butq.f154866c;
        srn srn = ahkm.f67363a;
        BluetoothDevice c = this.f67563a.mo36925c(str3);
        if (c != null) {
            aipa a = this.f67563a.mo36913a(c, str2, ahkv.mo36739q(str));
            if (a != null) {
                ahms a2 = ahms.m56191a(a);
                if (a2 != null) {
                    return a2;
                }
                srz.m36171a(a);
                throw new ahli(bvhu.BLUETOOTH_MEDIUM_ERROR, 31, String.format("BluetoothBandwidthUpgradeMedium failed to create Bluetooth endpoint channel to the Bluetooth device (%s, %s) for endpoint %s", str2, str3, str));
            }
            throw new ahli(bvhu.BLUETOOTH_MEDIUM_ERROR, 19, String.format("BluetoothBandwidthUpgradeMedium failed to connect to the Bluetooth device (%s, %s) for endpoint %s", str2, str3, str));
        }
        throw new ahli(bvhu.BLUETOOTH_MEDIUM_ERROR, 20, String.format("BluetoothBandwidthUpgradeMedium failed to derive a valid Bluetooth device from the MAC address (%s) for endpoint %s", str3, str));
    }

    /* renamed from: a */
    public final void mo36793a() {
        this.f67563a.mo36924b(this.f67565c);
        srn srn = ahkm.f67363a;
    }

    /* renamed from: a */
    public final void mo36866a(aipa aipa) {
        this.f67564b.mo36783a(new ahlj(ahms.m56191a(aipa), aipa));
    }

    /* renamed from: a */
    public final byte[] mo36794a(ahkv ahkv, String str) {
        if (!this.f67563a.mo36917a(this.f67565c)) {
            if (this.f67563a.mo36919a(this.f67565c, this)) {
                srn srn = ahkm.f67363a;
            } else {
                throw new ahli(bvhu.BLUETOOTH_MEDIUM_ERROR, 17, String.format("BluetoothBandwidthUpgradeMedium couldn't initiate the BLUETOOTH upgrade for endpoint %s because it failed to start listening for incoming Bluetooth connections.", str));
            }
        }
        String b = this.f67563a.mo36923b();
        if (b != null) {
            String str2 = this.f67565c;
            bxvd da = butq.f154862d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            butq butq = (butq) da.f164949b;
            str2.getClass();
            int i = butq.f154864a | 1;
            butq.f154864a = i;
            butq.f154865b = str2;
            b.getClass();
            butq.f154864a = i | 2;
            butq.f154866c = b;
            butq butq2 = (butq) da.mo74062i();
            bxvd da2 = butx.f154893h.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            butx butx = (butx) da2.f164949b;
            butx.f154896b = 2;
            int i2 = butx.f154895a | 1;
            butx.f154895a = i2;
            butq2.getClass();
            butx.f154899e = butq2;
            butx.f154895a = i2 | 8;
            return ahoy.m56310a((butx) da2.mo74062i());
        }
        throw new ahli(bvhu.BLUETOOTH_MEDIUM_ERROR, 18, String.format("BluetoothBandwidthUpgradeMedium couldn't initiate the BLUETOOTH upgrade for endpoint %s because the Bluetooth MAC address was unable to be obtained.", str));
    }
}
