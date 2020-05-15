package p000;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: bhrq */
final /* synthetic */ class bhrq implements Runnable {

    /* renamed from: a */
    private final bhrt f119394a;

    /* renamed from: b */
    private final bhtx f119395b;

    /* renamed from: c */
    private final List f119396c;

    /* renamed from: d */
    private final bhun f119397d;

    public bhrq(bhrt bhrt, bhtx bhtx, List list, bhun bhun) {
        this.f119394a = bhrt;
        this.f119395b = bhtx;
        this.f119396c = list;
        this.f119397d = bhun;
    }

    public final void run() {
        int i;
        int i2;
        int i3;
        List list;
        bhrt bhrt = this.f119394a;
        bhtx bhtx = this.f119395b;
        List list2 = this.f119396c;
        bhun bhun = this.f119397d;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        bhrw bhrw = bhrt.f119402a;
        ArrayList arrayList = new ArrayList();
        String l = cggg.f186820a.mo6606a().mo83694l();
        List asList = l.length() > 0 ? Arrays.asList(l.split(",")) : Collections.emptyList();
        List list3 = bhrw.f119420a;
        int size = list3.size();
        for (int i4 = 0; i4 < size; i4++) {
            bhve bhve = (bhve) list3.get(i4);
            if (asList.contains(bhve.mo64340a())) {
                bhuj.m101555a();
                String valueOf = String.valueOf(bhve.mo64340a());
                if (valueOf.length() == 0) {
                    new String("Module is blacklisted: ");
                } else {
                    "Module is blacklisted: ".concat(valueOf);
                }
            } else {
                bhvi a = bhve.mo64339a(bhtx, list2);
                if (a != null) {
                    arrayList.add(a);
                }
            }
        }
        if (arrayList.isEmpty()) {
            list = Collections.emptyList();
            i3 = 1;
            i2 = 1;
            i = 0;
        } else if (bhun != null) {
            List a2 = bhrw.f119422c.mo64208a(bhun, arrayList);
            int i5 = bhun.f119647f;
            i = bhun.f119646e;
            list = a2;
            i2 = i5;
            i3 = 0;
        } else {
            list = Collections.emptyList();
            i3 = 3;
            i2 = 1;
            i = 0;
        }
        bhqi a3 = bhqi.m101332a(list, SystemClock.elapsedRealtime(), bhrw.f119421b, i3, bhtx.f119585f, false, i2, i, null);
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        int size2 = list2.size();
        if (size2 > 0) {
            bhuj.m101555a();
            double d = (double) elapsedRealtime2;
            double d2 = (double) size2;
            Double.isNaN(d);
            Double.isNaN(d2);
            bhrt.mo64203a(String.format("Inference computation on %d candidates: %d millis (%.3f millis/candidate)", Integer.valueOf(size2), Long.valueOf(elapsedRealtime2), Double.valueOf(d / d2)));
        }
        bhrt.mo64204a(a3);
    }
}
