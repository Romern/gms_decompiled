package p000;

import android.location.Location;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: bhdc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhdc {
    /* renamed from: a */
    public static axos m100665a(List list) {
        if (!list.isEmpty()) {
            axos axos = new axos();
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                axos axos2 = new axos();
                bhdd.m100667a(axos2, (Location) it.next());
                arrayList.add(axos2);
            }
            axos.mo53329a("LOCATION_LIST", arrayList);
            bhdd.m100667a(axos, (Location) list.get(list.size() - 1));
            return axos;
        }
        throw new IllegalArgumentException();
    }
}
