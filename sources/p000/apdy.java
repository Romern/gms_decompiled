package p000;

import android.util.Pair;
import com.google.android.gms.backup.ParcelableDevice;
import java.util.ArrayList;
import java.util.List;

/* renamed from: apdy */
final /* synthetic */ class apdy implements auca {
    /* renamed from: a */
    public final aucb mo13157a(Object obj) {
        aoyj.m69819a().mo46988a(14);
        ArrayList arrayList = new ArrayList();
        for (ParcelableDevice parcelableDevice : (List) obj) {
            arrayList.add((ltn) bxvk.m124016a(ltn.f32960g, parcelableDevice.f28992a, bxus.m123744c()));
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ltn ltn = (ltn) arrayList.get(i);
            if (ltn.f32966e >= cgkf.f187143a.mo6606a().mo83980o()) {
                apei apei = new apei(null, ltn.f32965d);
                apei.f84219b = Long.valueOf(ltn.f32963b);
                apei.f84228k = ltn;
                apei.f84221d = ltn.f32964c;
                arrayList2.add(apei.mo47135a());
            } else {
                String valueOf = String.valueOf(ltn.f32965d);
                if (valueOf.length() == 0) {
                    new String("Skipping GMS backup from API level P and below : ");
                } else {
                    "Skipping GMS backup from API level P and below : ".concat(valueOf);
                }
            }
        }
        return aucu.m76778a(Pair.create("gms_backup", arrayList2));
    }
}
