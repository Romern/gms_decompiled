package p000;

import java.util.ArrayList;

/* renamed from: anft */
final /* synthetic */ class anft implements bmzi {

    /* renamed from: a */
    static final bmzi f76777a = new anft();

    private anft() {
    }

    /* renamed from: a */
    public final Object mo6606a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("packageName");
        arrayList.add("version");
        arrayList.add("params");
        arrayList.add("dynamicParams");
        arrayList.add("weak");
        arrayList.add("androidPackageName");
        arrayList.add("isSynced");
        arrayList.add("serializedDeclarativeRegInfo");
        if (((Integer) anfw.f76781b.mo6606a()).intValue() >= 23) {
            arrayList.add("configTier");
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
