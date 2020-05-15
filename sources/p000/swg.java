package p000;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.config.ConfigChimeraService;
import com.google.android.gms.config.internal.FetchConfigIpcResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: swg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class swg extends swx {

    /* renamed from: a */
    final /* synthetic */ swy f45264a;

    /* renamed from: b */
    final /* synthetic */ int f45265b;

    /* renamed from: c */
    final /* synthetic */ String f45266c;

    /* renamed from: d */
    final /* synthetic */ List f45267d;

    /* renamed from: e */
    final /* synthetic */ swz f45268e;

    public swg(swz swz, swy swy, int i, String str, List list) {
        this.f45268e = swz;
        this.f45264a = swy;
        this.f45265b = i;
        this.f45266c = str;
        this.f45267d = list;
    }

    /* renamed from: a */
    public final void mo26197a(Status status, FetchConfigIpcResponse fetchConfigIpcResponse) {
        if (fetchConfigIpcResponse != null) {
            fetchConfigIpcResponse.mo17966a();
        }
        try {
            swy swy = this.f45264a;
            Status status2 = Status.f30107a;
            ConfigChimeraService configChimeraService = this.f45268e.f45324a;
            int i = this.f45265b;
            String str = this.f45266c;
            List<String> list = this.f45267d;
            TreeMap treeMap = null;
            if (configChimeraService.mo17954a(i, str)) {
                if (list != null && !list.isEmpty()) {
                    synchronized (configChimeraService.f30432a) {
                        Map map = configChimeraService.f30433b;
                        if (map != null && map.get(str) != null && ((HashMap) configChimeraService.f30433b.get(str)).get("configns:p4") != null) {
                            TreeMap treeMap2 = (TreeMap) ((HashMap) configChimeraService.f30433b.get(str)).get("configns:p4");
                            if (treeMap2 != null) {
                                treeMap = new TreeMap();
                                for (String str2 : list) {
                                    treeMap.put(str2, (byte[]) treeMap2.get(str2));
                                }
                            }
                        }
                    }
                }
            }
            swy.mo26216a(status2, treeMap);
        } catch (RemoteException e) {
            Log.e("ConfigChimeraService", "Exception at callback.", e);
        }
    }
}
