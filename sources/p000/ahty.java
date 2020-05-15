package p000;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.os.Build;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.libraries.bluetooth.BluetoothException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ahty */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahty {
    /* renamed from: a */
    public static bvkn m56652a(Context context, String str) {
        bvkp bvkp;
        bvkn bvkn;
        if (str != null) {
            ahvm ahvm = (ahvm) ahgz.m55754a(context, ahvm.class);
            try {
                long b = ahvm.m56733b(str);
                try {
                    ahse ahse = ahvm.f68166a;
                    ClientContext a = ahvm.mo37206a();
                    bxvd da = bvko.f156448b.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ((bvko) da.f164949b).f156450a = b;
                    bvko bvko = (bvko) da.mo74062i();
                    if (ahse.f67927c == null) {
                        ahse.f67927c = chtv.m149566a(chtu.UNARY, "location.nearby.v1.NearbyDevicesService/GetFirmware", ciie.m150370a(bvko.f156448b), ciie.m150370a(bvkp.f156451b));
                    }
                    bvkp = (bvkp) ahse.f67928a.mo25553a(ahse.f67927c, a, bvko, 10000, TimeUnit.MILLISECONDS);
                } catch (chuw | gid e) {
                    bnsl bnsl = (bnsl) ahsd.f67925a.mo68390d();
                    bnsl.mo68437a(e);
                    bnsl.mo68405a("FastPair: Failed to get device firmware info.");
                    bvkp = null;
                }
            } catch (ahvl e2) {
                bnsl bnsl2 = (bnsl) ahsd.f67925a.mo68388c();
                bnsl2.mo68437a(e2);
                bnsl2.mo68405a("FastPair: Failed to parse model ID.");
                bvkp = null;
            }
            if (bvkp == null || (bvkn = bvkp.f156453a) == null) {
                ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPair: device %s does not support firmware version check.", str);
                return null;
            }
            ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPair: get latest firmware from server version code: %s", bvkn.f156447b);
            return bvkn;
        }
        ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPair: model id is null skip get firmware version.");
        return null;
    }

    /* renamed from: a */
    public static String m56653a(Context context, String str, ahti ahti) {
        Throwable e;
        String str2;
        try {
            ahti.mo37122a(bvjc.READ_FIRMWARE_VERSION);
            ayqi a = ahvg.m56719a();
            a.mo54244h(cfoj.m141559i());
            str2 = new aypk(context, str, a.mo54224a(), new ahts(ahti)).mo54200d();
            try {
                ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPair: Device firmware firmware version number %s", str2);
                ahti.mo37126b();
                if (cfoj.m141551af()) {
                    int i = Build.VERSION.SDK_INT;
                    BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                    if (!(defaultAdapter == null || str2 == null)) {
                        buqx.m120258a(defaultAdapter.getRemoteDevice(str), 2, str2);
                    }
                }
                return str2;
            } catch (BluetoothException | InterruptedException | ExecutionException | TimeoutException e2) {
                e = e2;
                bnsl bnsl = (bnsl) ahsd.f67925a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68405a("FastPair: Unable to get the firmware version number from device");
                ahti.mo37123a(e);
                return str2;
            }
        } catch (BluetoothException | InterruptedException | ExecutionException | TimeoutException e3) {
            e = e3;
            str2 = null;
            bnsl bnsl2 = (bnsl) ahsd.f67925a.mo68387b();
            bnsl2.mo68437a(e);
            bnsl2.mo68405a("FastPair: Unable to get the firmware version number from device");
            ahti.mo37123a(e);
            return str2;
        }
    }
}
