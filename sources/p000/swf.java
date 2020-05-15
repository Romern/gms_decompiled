package p000;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.config.ConfigChimeraService;
import com.google.android.gms.config.internal.FetchConfigIpcResponse;
import java.util.HashMap;
import java.util.Map;

/* renamed from: swf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class swf extends swx {

    /* renamed from: a */
    final /* synthetic */ swy f45259a;

    /* renamed from: b */
    final /* synthetic */ int f45260b;

    /* renamed from: c */
    final /* synthetic */ String f45261c;

    /* renamed from: d */
    final /* synthetic */ String f45262d;

    /* renamed from: e */
    final /* synthetic */ swz f45263e;

    public swf(swz swz, swy swy, int i, String str, String str2) {
        this.f45263e = swz;
        this.f45259a = swy;
        this.f45260b = i;
        this.f45261c = str;
        this.f45262d = str2;
    }

    /* renamed from: a */
    public final void mo26197a(Status status, FetchConfigIpcResponse fetchConfigIpcResponse) {
        if (fetchConfigIpcResponse != null) {
            fetchConfigIpcResponse.mo17966a();
        }
        try {
            swy swy = this.f45259a;
            Status status2 = Status.f30107a;
            ConfigChimeraService configChimeraService = this.f45263e.f45324a;
            int i = this.f45260b;
            String str = this.f45261c;
            String str2 = this.f45262d;
            byte[] bArr = null;
            if (configChimeraService.mo17954a(i, str)) {
                synchronized (configChimeraService.f30432a) {
                    Map map = configChimeraService.f30433b;
                    if (map != null && map.get(str) != null) {
                        Map map2 = (Map) ((HashMap) configChimeraService.f30433b.get(str)).get("configns:p4");
                        if (map2 != null) {
                            bArr = (byte[]) map2.get(str2);
                        }
                    }
                }
            }
            swy.mo26217a(status2, bArr);
        } catch (RemoteException e) {
            Log.e("ConfigChimeraService", "Exception at callback.", e);
        }
    }
}
