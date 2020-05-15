package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.romanesco.protomodel.SourceStatsEntity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: apev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apev extends aaab {

    /* renamed from: a */
    private final aoyh f84265a = aoyh.m69805a("FetchGmsBackupStatsOps");

    /* renamed from: b */
    private final apbn f84266b;

    /* renamed from: c */
    private final String f84267c;

    /* renamed from: d */
    private final long f84268d;

    public apev(apbn apbn, String str, long j) {
        super(135, "FetchGmsBackupStatsOps");
        this.f84266b = apbn;
        this.f84267c = str;
        this.f84268d = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        btem a = apfa.f84284a.mo47146a(this.f84267c, Long.toString(this.f84268d));
        ArrayList arrayList = new ArrayList();
        if (a == null) {
            this.f84265a.mo46986d("No response found in cache for  account %s, deviceId %d", this.f84267c, Long.valueOf(this.f84268d));
            this.f84266b.mo46969c(Status.f30109c, arrayList);
            return;
        }
        HashMap hashMap = new HashMap();
        bxwc bxwc = a.f148534a;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            btfi btfi = (btfi) bxwc.get(i);
            if (hashMap.containsKey(btfi.f148664g)) {
                String str = btfi.f148664g;
                hashMap.put(str, Integer.valueOf(((Integer) hashMap.get(str)).intValue() + 1));
            } else {
                hashMap.put(btfi.f148664g, 1);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            arrayList.add(new SourceStatsEntity((String) entry.getKey(), (Integer) entry.getValue()));
        }
        this.f84265a.mo46979a("Number of source stats found for account %s, device %s : %d", this.f84267c, Long.valueOf(this.f84268d), Integer.valueOf(arrayList.size()));
        this.f84266b.mo46969c(Status.f30107a, arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
    }
}
