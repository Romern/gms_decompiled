package p000;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: ahwb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahwb {

    /* renamed from: a */
    public final Context f68206a;

    /* renamed from: b */
    public final sqv f68207b;

    /* renamed from: c */
    public final Executor f68208c;

    /* renamed from: d */
    public final Map f68209d = new HashMap();

    /* renamed from: e */
    private final ahst f68210e;

    /* renamed from: f */
    private final ahxa f68211f;

    /* renamed from: g */
    private final ahvm f68212g;

    public ahwb(Context context) {
        bqgj b = snp.m35704b(10);
        this.f68206a = context;
        this.f68207b = (sqv) ahgz.m55754a(context, sqv.class);
        this.f68210e = (ahst) ahgz.m55754a(context, ahst.class);
        this.f68211f = (ahxa) ahgz.m55754a(context, ahxa.class);
        this.f68212g = (ahvm) ahgz.m55754a(context, ahvm.class);
        this.f68208c = b;
    }

    /* renamed from: a */
    public final void mo37217a(BluetoothDevice bluetoothDevice) {
        this.f68208c.execute(new ahvv(this, bluetoothDevice));
    }

    /* renamed from: b */
    public final ahwa mo37219b(BluetoothDevice bluetoothDevice) {
        ahwa ahwa = (ahwa) this.f68209d.get(bluetoothDevice);
        if (ahwa != null) {
            return ahwa;
        }
        ahwa ahwa2 = new ahwa();
        this.f68209d.put(bluetoothDevice, ahwa2);
        return ahwa2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: a */
    public final void mo37218a(BluetoothDevice bluetoothDevice, Runnable runnable) {
        if (bluetoothDevice.getBondState() != 12) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("RetroactivePairManager: Skip, device (%s) is not bonded", bluetoothDevice);
        } else if (this.f68210e.mo37033a(bluetoothDevice.getAddress()) != null) {
            srn srn = ahsd.f67925a;
        } else {
            runnable.run();
            ahwa b = mo37219b(bluetoothDevice);
            long b2 = this.f68207b.mo20506b();
            long j = b.f68201a;
            long j2 = j != -1 ? j - b2 : 0;
            String str = b.f68202b;
            String str2 = b.f68203c;
            ((ahuu) ahgz.m55754a(this.f68206a, ahuu.class)).mo37179a();
            if (!b.f68205e) {
                ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("RetroactivePairManager: Skip, the ble address is not changed.");
            } else if (str == null || str2 == null) {
                srn srn2 = ahsd.f67925a;
            } else {
                ((bnsl) ahsd.f67925a.mo68390d()).mo68426a("RetroactivePairManager: device=%s, remainingTime=%s, bleAddress=%s, modelId=%s", bluetoothDevice, Long.valueOf(j2), str, str2);
                if (j2 > cfog.f184854a.mo6606a().mo81977aL()) {
                    aiaa a = ahvd.m56705a(this.f68210e, this.f68211f, this.f68212g, str2);
                    if (a == null) {
                        ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("RetroactivePairManager: Skip, no item for model id (%s)", str2);
                        return;
                    }
                    b.f68204d++;
                    b.f68205e = false;
                    ((bnsl) ahsd.f67925a.mo68390d()).mo68425a("RetroactivePairManager: Start retroactive pairing attempt#%d for device (%s, %s)", Integer.valueOf(b.f68204d), bluetoothDevice, str);
                    bxvd bxvd = (bxvd) a.mo74142c(5);
                    bxvd.mo73625a((GeneratedMessageLite) a);
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    aiaa aiaa = (aiaa) bxvd.f164949b;
                    str.getClass();
                    aiaa.f68513a |= 4;
                    aiaa.f68517e = str;
                    aiaa aiaa2 = (aiaa) bxvd.mo74062i();
                    Intent putExtra = DiscoveryChimeraService.m67336a(this.f68206a).setAction("com.google.android.gms.nearby.discovery:ACTION_MAGIC_PAIR").putExtra("com.google.android.gms.nearby.discovery.EXTRA_DISCOVERY_ITEM", aiaa2.serializeToBytes()).putExtra("com.google.android.gms.nearby.discovery.EXTRA_RETROACTIVE_PAIR", true);
                    if ((aiaa2.f68513a & 8) != 0) {
                        putExtra.putExtra("com.google.android.gms.nearby.discovery:EXTRA_COMPANION_APP", ahvd.m56709a(aiaa2));
                    }
                    this.f68206a.startService(putExtra);
                    ((buqh) ahgz.m55754a(this.f68206a, buqh.class)).mo72983a(new ahvz(this, "RemoveRetroactiveDeviceCache", bluetoothDevice), j2);
                    return;
                }
                ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("RetroactivePairManager: Skip, timeout for device (%s) is expired", bluetoothDevice);
            }
        }
    }
}
