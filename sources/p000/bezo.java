package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: bezo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bezo implements cijl {

    /* renamed from: a */
    private final int[] f113177a;

    public bezo(List list) {
        this.f113177a = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.f113177a[i] = ((Long) list.get(i)).intValue();
        }
    }

    /* renamed from: b */
    public final Collection mo6445a() {
        ArrayList arrayList = new ArrayList(this.f113177a.length);
        for (int i : this.f113177a) {
            arrayList.add(bezp.m96178a(i));
        }
        return arrayList;
    }
}
