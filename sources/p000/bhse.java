package p000;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: bhse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhse implements bhry {

    /* renamed from: a */
    public static final Comparator f119434a = new bhrz();

    /* renamed from: b */
    public final bicy f119435b;

    /* renamed from: c */
    private bhsd f119436c = new bhsc(this);

    /* renamed from: d */
    private boolean f119437d;

    public bhse(bicy bicy) {
        this.f119435b = bicy;
        this.f119437d = false;
    }

    /* renamed from: a */
    public static C1245ok m101436a(List list) {
        C1245ok okVar = new C1245ok();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bhqh bhqh = (bhqh) list.get(i);
            if (!okVar.containsKey(Integer.valueOf(bhqh.f119314h))) {
                okVar.put(Integer.valueOf(bhqh.f119314h), Float.valueOf(bhqh.f119312f));
            }
        }
        return okVar;
    }

    /* renamed from: b */
    public static List m101437b(List list) {
        ArrayList arrayList = new ArrayList();
        if (list.size() != 0) {
            C1225nr nrVar = new C1225nr();
            nrVar.add(((bhqh) list.get(0)).f119308b);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                bhqh bhqh = (bhqh) it.next();
                if (nrVar.contains(bhqh.f119308b)) {
                    nrVar.clear();
                    nrVar.addAll(bhqh.f119313g);
                    arrayList.add(bhqh);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo64210a(boolean z) {
        this.f119437d = z;
    }

    /* renamed from: a */
    public final boolean mo64211a() {
        return this.f119436c.f119433c;
    }

    /* renamed from: b */
    public final bhqi mo64212b() {
        return this.f119436c.f119432b;
    }

    /* renamed from: c */
    public final boolean mo64213c() {
        return this.f119437d;
    }

    /* renamed from: a */
    public final void mo64209a(bhqi bhqi) {
        this.f119436c = this.f119436c.mo64215a(bhqi);
    }
}
