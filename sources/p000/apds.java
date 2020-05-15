package p000;

import android.util.Pair;
import com.google.android.gms.romanesco.protomodel.BackedUpContactsPerDeviceEntity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: apds */
final /* synthetic */ class apds implements auca {

    /* renamed from: a */
    private final apeh f84190a;

    public apds(apeh apeh) {
        this.f84190a = apeh;
    }

    /* renamed from: a */
    public final aucb mo13157a(Object obj) {
        apeh apeh = this.f84190a;
        ArrayList arrayList = new ArrayList();
        for (BackedUpContactsPerDeviceEntity backedUpContactsPerDeviceEntity : (List) obj) {
            arrayList.add(apeh.f84212b.mo47125a(backedUpContactsPerDeviceEntity));
        }
        return aucu.m76778a(Pair.create("footprint_backup", arrayList));
    }
}
