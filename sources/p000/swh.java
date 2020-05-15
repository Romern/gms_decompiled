package p000;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.config.ConfigChimeraService;
import com.google.android.gms.config.internal.FetchConfigIpcResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: swh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class swh extends swx {

    /* renamed from: a */
    final /* synthetic */ swy f45269a;

    /* renamed from: b */
    final /* synthetic */ int f45270b;

    /* renamed from: c */
    final /* synthetic */ String f45271c;

    /* renamed from: d */
    final /* synthetic */ String f45272d;

    /* renamed from: e */
    final /* synthetic */ swz f45273e;

    public swh(swz swz, swy swy, int i, String str, String str2) {
        this.f45273e = swz;
        this.f45269a = swy;
        this.f45270b = i;
        this.f45271c = str;
        this.f45272d = str2;
    }

    /* renamed from: a */
    public final void mo26197a(Status status, FetchConfigIpcResponse fetchConfigIpcResponse) {
        if (fetchConfigIpcResponse != null) {
            fetchConfigIpcResponse.mo17966a();
        }
        try {
            swy swy = this.f45269a;
            Status status2 = Status.f30107a;
            ConfigChimeraService configChimeraService = this.f45273e.f45324a;
            int i = this.f45270b;
            String str = this.f45271c;
            String str2 = this.f45272d;
            SortedMap sortedMap = null;
            String str3 = null;
            sortedMap = null;
            sortedMap = null;
            if (configChimeraService.mo17954a(i, str)) {
                synchronized (configChimeraService.f30432a) {
                    Map map = configChimeraService.f30433b;
                    if (map != null && map.get(str) != null && ((HashMap) configChimeraService.f30433b.get(str)).get("configns:p4") != null) {
                        TreeMap treeMap = (TreeMap) ((HashMap) configChimeraService.f30433b.get(str)).get("configns:p4");
                        if (treeMap != null) {
                            int length = str2.length() - 1;
                            while (true) {
                                if (length < 0) {
                                    break;
                                }
                                char charAt = str2.charAt(length);
                                if (charAt < 65535) {
                                    String substring = str2.substring(0, length);
                                    StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 1);
                                    sb.append(substring);
                                    sb.append((char) (charAt + 1));
                                    str3 = sb.toString();
                                    break;
                                }
                                length--;
                            }
                            sortedMap = str3 != null ? treeMap.subMap(str2, str3) : treeMap.tailMap(str2);
                        }
                    }
                }
            }
            swy.mo26216a(status2, sortedMap);
        } catch (RemoteException e) {
            Log.e("ConfigChimeraService", "Exception at callback.", e);
        }
    }
}
