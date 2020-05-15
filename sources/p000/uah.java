package p000;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: uah */
final /* synthetic */ class uah implements Runnable {

    /* renamed from: a */
    private final uaj f47012a;

    public uah(uaj uaj) {
        this.f47012a = uaj;
    }

    public final void run() {
        Cursor a;
        uaj uaj = this.f47012a;
        if (!uaj.f47022f.mo28343a()) {
            uaj.f47016a.mo25371b("Do not attempt to cleanup while offline. Will retry when we go online");
            return;
        }
        HashMap hashMap = new HashMap();
        uaj.f47018b.mo27435d();
        try {
            if (!uaj.f47018b.mo27415a(ulu.f48160a)) {
                long currentTimeMillis = System.currentTimeMillis();
                uhn uhn = uaj.f47018b;
                long j = uaj.f47021e;
                long j2 = currentTimeMillis - j;
                long j3 = currentTimeMillis + j;
                uhj uhj = ((ugx) uhn).f47578a;
                unp unp = ult.APPLY_ON_SERVER_TIME.f48159e;
                a = uhj.mo27468a(ulu.f48160a.mo27735b(), (String[]) null, uoh.m39072b(unp.mo27703a(j2), unp.mo27715d(j3)), String.valueOf(ult.ACTION_ID.f48159e.mo27700a()).concat(" ASC"));
                ArrayList<C1596ulr> arrayList = new ArrayList(a.getCount());
                while (a.moveToNext()) {
                    arrayList.add(C1596ulr.m38942a(uhj, a));
                }
                a.close();
                for (C1596ulr ulr : arrayList) {
                    String str = uaj.f47018b.mo27427c(ulr.f48153d).f47682a;
                    long j4 = ulr.f48366m;
                    List list = (List) hashMap.get(str);
                    if (list == null) {
                        list = new ArrayList();
                        hashMap.put(str, list);
                    }
                    list.add(Long.valueOf(j4));
                }
                uaj.f47018b.mo27442f();
                uaj.f47018b.mo27439e();
                vcg vcg = uaj.f47019c.f49763j;
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    List list2 = (List) entry.getValue();
                    int a2 = vcg.mo28218a(str2, 102, 4, (List) null);
                    if (a2 == 0 || a2 == 1) {
                        vcg.mo28222a(str2, new uai(uaj, str2, list2));
                    }
                }
                uaj.mo27003d();
                return;
            }
            uaj.f47016a.mo25371b("Stopping cleanup loop. No pending cleanups");
            uaj.f47018b.mo27442f();
            uaj.f47018b.mo27439e();
        } catch (Throwable th) {
            uaj.f47018b.mo27439e();
            throw th;
        }
    }
}
