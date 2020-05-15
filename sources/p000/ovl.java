package p000;

import android.bluetooth.BluetoothDevice;
import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: ovl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ovl implements pcl, otr {

    /* renamed from: a */
    private static final bnsn f38482a = odk.m28481a("CAR.WIFI");

    /* renamed from: b */
    private final orn f38483b;

    public ovl(orn orn) {
        this.f38483b = orn;
    }

    /* renamed from: a */
    public final void mo22690a() {
        orn orn = this.f38483b;
        bxvd b = orn.mo22550b();
        bxvd da = bpdv.f136400i.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpdv bpdv = (bpdv) da.f164949b;
        bpdv.f136402a |= 1;
        bpdv.f136403b = 3;
        if (b.f164950c) {
            b.mo74035c();
            b.f164950c = false;
        }
        bpcl bpcl = (bpcl) b.f164949b;
        bpdv bpdv2 = (bpdv) da.mo74062i();
        bpcl bpcl2 = bpcl.f135759L;
        bpdv2.getClass();
        bpcl.f135798z = bpdv2;
        bpcl.f135774b |= 8;
        orn.mo22547a(b, 45);
    }

    /* renamed from: a */
    public final void mo22691a(int i, int i2, int i3, int i4, BluetoothDevice bluetoothDevice) {
        this.f38483b.mo22543a(2, i, i2, i3, i4, null, pck.m30193a(bluetoothDevice));
    }

    /* renamed from: a */
    public final void mo22692a(int i, int i2, int i3, long j, BluetoothDevice bluetoothDevice) {
        this.f38483b.mo22543a(1, i, i2, i3, 0, Integer.valueOf((int) j), pck.m30193a(bluetoothDevice));
    }

    /* renamed from: a */
    public final void mo22619a(int i, Integer num, Integer num2, int i2, Integer num3) {
        orn orn = this.f38483b;
        bxvd b = orn.mo22550b();
        bxvd da = bpei.f137280g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpei bpei = (bpei) da.f164949b;
        bpei.f137282a |= 1;
        bpei.f137283b = i;
        if (num != null) {
            int intValue = num.intValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpei bpei2 = (bpei) da.f164949b;
            bpei2.f137282a |= 2;
            bpei2.f137284c = intValue;
        }
        if (num2 != null) {
            int intValue2 = num2.intValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpei bpei3 = (bpei) da.f164949b;
            bpei3.f137282a |= 4;
            bpei3.f137285d = intValue2;
        }
        if (i2 != 0) {
            bpei bpei4 = (bpei) da.f164949b;
            bpei4.f137282a |= 8;
            bpei4.f137286e = i2 - 1;
        }
        if (num3 != null) {
            int intValue3 = num3.intValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpei bpei5 = (bpei) da.f164949b;
            bpei5.f137282a |= 16;
            bpei5.f137287f = intValue3;
        }
        if (b.f164950c) {
            b.mo74035c();
            b.f164950c = false;
        }
        bpcl bpcl = (bpcl) b.f164949b;
        bpei bpei6 = (bpei) da.mo74062i();
        bpcl bpcl2 = bpcl.f135759L;
        bpei6.getClass();
        bpcl.f135762B = bpei6;
        bpcl.f135774b |= 64;
        orn.mo22547a(b, 49);
    }

    /* renamed from: a */
    public final void mo22693a(bpdh bpdh) {
        bnsi b = f38482a.mo68387b();
        b.mo68432a("ovl", "a", 99, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        b.mo68420a("logWirelessNonUiEvent was expected to be dead code within GMSCore: %s", bpdh.name());
    }

    /* renamed from: a */
    public final void mo22694a(bpea bpea) {
        bnsi b = f38482a.mo68387b();
        b.mo68432a("ovl", "a", (int) ErrorInfo.TYPE_SDU_MEMORY_FULL, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        b.mo68420a("logWirelessUiEvent was expected to be dead code within GMSCore: %s", bpea.name());
    }

    /* renamed from: a */
    public final void mo22695a(boolean z, bixd bixd, int i) {
        bxvd da = bpeg.f137266g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpeg bpeg = (bpeg) da.f164949b;
        bpeg.f137268a |= 1;
        bpeg.f137269b = false;
        int a = pck.m30194a(bixd) - 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpeg bpeg2 = (bpeg) da.f164949b;
        int i2 = bpeg2.f137268a | 2;
        bpeg2.f137268a = i2;
        bpeg2.f137270c = a;
        int i3 = i2 | 8;
        bpeg2.f137268a = i3;
        bpeg2.f137272e = 2;
        bpeg2.f137268a = i3 | 16;
        bpeg2.f137273f = i - 1;
        this.f38483b.mo22549a(z, (bpeg) da.mo74062i(), (Integer) null);
    }

    /* renamed from: a */
    public final void mo22696a(boolean z, boolean z2, bixd bixd, int i, long j) {
        bxvd da = bpeg.f137266g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpeg bpeg = (bpeg) da.f164949b;
        bpeg.f137268a |= 1;
        bpeg.f137269b = z2;
        int a = pck.m30194a(bixd) - 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpeg bpeg2 = (bpeg) da.f164949b;
        int i2 = 2;
        int i3 = bpeg2.f137268a | 2;
        bpeg2.f137268a = i3;
        bpeg2.f137270c = a;
        if (i <= 2400 || i >= 2500) {
            i2 = i > 4900 ? i >= 5900 ? 1 : 3 : 1;
        }
        int i4 = i3 | 4;
        bpeg2.f137268a = i4;
        bpeg2.f137271d = i2 - 1;
        bpeg2.f137268a = i4 | 8;
        bpeg2.f137272e = 1;
        this.f38483b.mo22549a(z, (bpeg) da.mo74062i(), Integer.valueOf((int) j));
    }
}
