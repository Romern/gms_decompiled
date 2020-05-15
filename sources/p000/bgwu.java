package p000;

import android.accounts.Account;
import com.google.android.location.reporting.server.RemoteDevice;
import com.google.android.ulr.ApiUserSettings;
import com.google.android.ulr.RemoteDeviceInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bgwu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgwu {

    /* renamed from: a */
    public final bgwb f117867a;

    /* renamed from: b */
    public final List f117868b;

    public bgwu(bgwb bgwb, List list) {
        this.f117867a = bgwb;
        bgzo.m100464a(list);
        this.f117868b = list;
    }

    /* renamed from: a */
    public static bgwu m100185a(Account account, bvxs bvxs) {
        bvxn bvxn = bvxs.f158096a;
        if (bvxn == null) {
            bvxn = bvxn.f158064j;
        }
        bgwb a = bgwb.m100150a(account, bvxn);
        bxwc bxwc = bvxs.f158097b;
        ArrayList arrayList = new ArrayList();
        if (bxwc != null) {
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                bvyg bvyg = (bvyg) bxwc.get(i);
                arrayList.add(new RemoteDevice(bvyg.f158154a, bvyg.f158157d, bvyg.f158156c, bvyg.f158155b, Long.valueOf(bvyg.f158158e), Long.valueOf(bvyg.f158159f)));
            }
        }
        return new bgwu(a, arrayList);
    }

    /* renamed from: a */
    public static bgwu m100186a(Account account, ApiUserSettings apiUserSettings) {
        boolean z;
        bgwb a = bgwb.m100151a(account, apiUserSettings.getSettings());
        ArrayList remoteDeviceInfos = apiUserSettings.getRemoteDeviceInfos();
        ArrayList arrayList = new ArrayList();
        if (remoteDeviceInfos != null) {
            int size = remoteDeviceInfos.size();
            for (int i = 0; i < size; i++) {
                RemoteDeviceInfo remoteDeviceInfo = (RemoteDeviceInfo) remoteDeviceInfos.get(i);
                if (remoteDeviceInfo.mo71691b() == null || !remoteDeviceInfo.mo71691b().booleanValue()) {
                    z = false;
                } else {
                    z = true;
                }
                arrayList.add(new RemoteDevice(((Integer) remoteDeviceInfo.f44540b.get("deviceTag")).intValue(), (String) remoteDeviceInfo.f44540b.get("devicePrettyName"), ((Boolean) remoteDeviceInfo.f44540b.get("isRestricted")).booleanValue(), z, (Long) remoteDeviceInfo.f44540b.get("lastReportTimestampMs"), (Long) remoteDeviceInfo.f44540b.get("lastModifiedTimestampMs")));
            }
        }
        return new bgwu(a, arrayList);
    }
}
