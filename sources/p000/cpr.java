package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: cpr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cpr {

    /* renamed from: a */
    private final List f11783a = new ArrayList();

    /* renamed from: b */
    private final Map f11784b = new HashMap();

    /* renamed from: a */
    private final synchronized List m7258a(String str) {
        List list;
        if (!this.f11783a.contains(str)) {
            this.f11783a.add(str);
        }
        list = (List) this.f11784b.get(str);
        if (list == null) {
            list = new ArrayList();
            this.f11784b.put(str, list);
        }
        return list;
    }

    /* renamed from: b */
    public final synchronized List mo8092b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        List list = this.f11783a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            List<cpq> list2 = (List) this.f11784b.get((String) list.get(i));
            if (list2 != null) {
                for (cpq cpq : list2) {
                    if (cpq.mo8088a(cls, cls2) && !arrayList.contains(cpq.f11780a)) {
                        arrayList.add(cpq.f11780a);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final synchronized List mo8089a(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        List list = this.f11783a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            List<cpq> list2 = (List) this.f11784b.get((String) list.get(i));
            if (list2 != null) {
                for (cpq cpq : list2) {
                    if (cpq.mo8088a(cls, cls2)) {
                        arrayList.add(cpq.f11781b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final synchronized void mo8090a(String str, cdm cdm, Class cls, Class cls2) {
        m7258a(str).add(new cpq(cls, cls2, cdm));
    }

    /* renamed from: a */
    public final synchronized void mo8091a(List list) {
        ArrayList arrayList = new ArrayList(this.f11783a);
        this.f11783a.clear();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            this.f11783a.add((String) list.get(i));
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String str = (String) arrayList.get(i2);
            if (!list.contains(str)) {
                this.f11783a.add(str);
            }
        }
    }
}
