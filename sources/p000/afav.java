package p000;

import android.util.Base64;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.WireMessageParams;
import com.google.android.gms.magictether.host.TetherListenerChimeraService;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: afav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afav implements aezw {

    /* renamed from: a */
    public final List f64104a = new ArrayList();

    /* renamed from: b */
    public afaa f64105b;

    /* renamed from: c */
    public Timer f64106c;

    /* renamed from: d */
    public final afba f64107d = afaz.m52798a();

    /* renamed from: e */
    public final /* synthetic */ TetherListenerChimeraService f64108e;

    public afav(TetherListenerChimeraService tetherListenerChimeraService) {
        this.f64108e = tetherListenerChimeraService;
    }

    /* renamed from: a */
    public final void mo34719a() {
        Timer timer = this.f64106c;
        if (timer != null) {
            timer.cancel();
            this.f64106c = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d1, code lost:
        return false;
     */
    /* renamed from: a */
    public final boolean mo34720a(RemoteDevice remoteDevice, bxxc bxxc) {
        int i;
        String str;
        try {
            afbr afbr = new afbr(bxxc);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", afbr.f64156b - 1);
            jSONObject.put("data", Base64.encodeToString(afbr.f64155a.serializeToBytes(), 10));
            byte[] bytes = jSONObject.toString().getBytes(StandardCharsets.UTF_8);
            synchronized (this.f64108e.f79825b) {
                aezx aezx = this.f64108e.f79826c;
                if (aezx != null && aezx.f64062c) {
                    Logger Logger = TetherListenerChimeraService.f79824e;
                    if (bxxc instanceof afbm) {
                        str = "TETHER_AVAILABILITY_RESPONSE";
                        i = afbl.m52815a(((afbm) bxxc).f64147b);
                        if (i == 0) {
                            i = 1;
                        }
                    } else if (bxxc instanceof afbe) {
                        str = "CONNECT_TETHERING_RESPONSE";
                        int a = afbd.m52807a(((afbe) bxxc).f64120b);
                        if (a == 0) {
                            a = 1;
                        }
                        i = afbl.m52815a(a - 1);
                    } else {
                        str = bxxc instanceof afbi ? "KEEP_ALIVE_TICKLE_RESPONSE" : null;
                        i = 1;
                    }
                    sdo.m34959a((Object) str);
                    Object[] objArr = new Object[3];
                    objArr[0] = str;
                    objArr[1] = remoteDevice.mo7784a();
                    int i2 = i - 1;
                    if (i != 0) {
                        objArr[2] = Integer.valueOf(i2);
                        Logger.mo25414c(String.format("Sending %s to device with ID %s; response code: %d", objArr), new Object[0]);
                        aezx aezx2 = this.f64108e.f79826c;
                        synchronized (aezx2.f64063d) {
                            if (aezx2.mo34697a(remoteDevice.f11138b) == null) {
                                aezx.f64058f.mo25418e("Can't send message for device with ID %s.", remoteDevice.mo7784a());
                            } else {
                                aezx2.f64060a.mo13889a(new WireMessageParams(remoteDevice.f11138b, bytes, "magic_tether"));
                            }
                        }
                        return true;
                    }
                    throw null;
                }
            }
        } catch (JSONException e) {
            throw new RuntimeException(e);
        } catch (afbq e2) {
            TetherListenerChimeraService.f79824e.mo25417e("Invalid response message.", e2, new Object[0]);
            return false;
        }
    }
}
