package p000;

import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: ayfy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayfy {
    /* renamed from: a */
    public static CapabilityInfoParcelable m83946a(String str, Set set) {
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(m83947a((ayac) it.next()));
        }
        return new CapabilityInfoParcelable(str, arrayList);
    }

    /* renamed from: a */
    public static NodeParcelable m83947a(ayac ayac) {
        axzf axzf = ayac.f96884a;
        String str = axzf.f96814a;
        String str2 = axzf.f96815b;
        int i = ayac.f96885b;
        return new NodeParcelable(str, str2, i, axzm.m83604a(axzf, i));
    }
}
