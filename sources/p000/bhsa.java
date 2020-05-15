package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bhsa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhsa extends bhsd {

    /* renamed from: a */
    final /* synthetic */ bhse f119425a;

    /* renamed from: d */
    private bhqi f119426d;

    /* renamed from: e */
    private float f119427e;

    /* renamed from: f */
    private List f119428f;

    /* renamed from: g */
    private C1245ok f119429g = new C1245ok();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bhsa(bhse bhse, bhqi bhqi) {
        super(bhqi);
        this.f119425a = bhse;
        bhqi b = m101431b(bhqi);
        this.f119426d = b;
        this.f119427e = ((bhqh) b.f119318b.get(0)).f119311e;
        List b2 = bhse.m101437b(bhqi.f119318b);
        this.f119428f = b2;
        this.f119429g = bhse.m101436a(b2);
    }

    /* renamed from: b */
    private static final bhqi m101431b(bhqi bhqi) {
        ArrayList arrayList = new ArrayList();
        for (bhqh bhqh : bhqi.f119318b) {
            String str = bhqh.f119308b;
            int i = bhqh.f119309c;
            float f = bhqh.f119311e;
            arrayList.add(new bhqh(str, i, null, bhqh.f119307a, 0, f, f, null, false));
        }
        Collections.sort(arrayList, bhse.f119434a);
        return bhqi.m101332a(arrayList, bhqi.f119320d, bhqi.f119321e, bhqi.f119322f, bhqi.f119323g, bhqi.f119325i, bhqi.f119327k, bhqi.f119319c, bhqi.f119326j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0118, code lost:
        r9.f119433c = true;
        p000.bhuj.m101555a();
     */
    /* renamed from: a */
    public final bhsd mo64215a(bhqi bhqi) {
        boolean z;
        if (bhqi.f119318b.isEmpty()) {
            return new bhsb(this.f119425a, bhqi);
        }
        bhqi b = m101431b(bhqi);
        List list = b.f119318b;
        List list2 = this.f119426d.f119318b;
        this.f119433c = false;
        int c = (int) cggm.m145257c();
        int i = 0;
        while (true) {
            if (i < Math.min(c, Math.min(list.size(), list2.size()))) {
                if (!((bhqh) list.get(i)).f119308b.equals(((bhqh) list2.get(i)).f119308b)) {
                    this.f119433c = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        if (!this.f119433c && Math.abs(((bhqh) list.get(0)).f119311e - this.f119427e) > bicy.m101987f()) {
            this.f119433c = true;
        }
        if (this.f119433c) {
            this.f119427e = ((bhqh) list.get(0)).f119311e;
        }
        if (!this.f119433c && bicy.m101982a()) {
            List b2 = bhse.m101437b(bhqi.f119318b);
            if (this.f119428f.size() != b2.size()) {
                bhuj.m101555a();
                int size = this.f119428f.size();
                int size2 = b2.size();
                StringBuilder sb = new StringBuilder(107);
                sb.append("Triggering update due to change in size of the hierarchy: current size - ");
                sb.append(size);
                sb.append(" new size - ");
                sb.append(size2);
                sb.toString();
                this.f119433c = true;
            } else {
                int size3 = b2.size() - 1;
                while (true) {
                    if (size3 < 0) {
                        break;
                    }
                    bhqh bhqh = (bhqh) b2.get(size3);
                    boolean equals = bhqh.f119308b.equals(((bhqh) this.f119428f.get(size3)).f119308b);
                    C1245ok okVar = this.f119429g;
                    Integer valueOf = Integer.valueOf(-size3);
                    if (okVar.containsKey(valueOf)) {
                        z = Math.abs(bhqh.f119312f - ((Float) this.f119429g.get(valueOf)).floatValue()) <= bicy.m101987f();
                    } else {
                        z = true;
                    }
                    if (equals && z) {
                        size3--;
                    }
                }
                if (this.f119433c) {
                    this.f119428f = b2;
                    this.f119429g = bhse.m101436a(b2);
                }
            }
        }
        this.f119432b = bhqi;
        this.f119426d = b;
        return this;
    }
}
