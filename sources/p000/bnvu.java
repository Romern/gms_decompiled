package p000;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: bnvu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnvu implements Iterable, Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public ArrayList f132251a = new ArrayList();

    /* renamed from: a */
    public final void mo68597a() {
        ArrayList arrayList = this.f132251a;
        Collections.sort(arrayList);
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            bnvt bnvt = (bnvt) arrayList.get(i2);
            if (i <= 0 || !((bnvt) arrayList.get(i - 1)).mo68580a(bnvt)) {
                while (i > 0) {
                    int i3 = i - 1;
                    if (!bnvt.mo68580a((bnvt) arrayList.get(i3))) {
                        break;
                    }
                    i = i3;
                }
                while (i >= 3) {
                    int i4 = i - 3;
                    int i5 = i - 2;
                    int i6 = i - 1;
                    if (((((bnvt) arrayList.get(i4)).f132250b ^ ((bnvt) arrayList.get(i5)).f132250b) ^ ((bnvt) arrayList.get(i6)).f132250b) != bnvt.f132250b) {
                        break;
                    }
                    long j = bnvt.mo68595j();
                    long j2 = j + j;
                    long j3 = (j2 + (j2 + j2)) ^ -1;
                    long j4 = bnvt.f132250b & j3;
                    if ((((bnvt) arrayList.get(i4)).f132250b & j3) != j4 || (((bnvt) arrayList.get(i5)).f132250b & j3) != j4 || (((bnvt) arrayList.get(i6)).f132250b & j3) != j4 || bnvt.mo68587d()) {
                        break;
                    }
                    bnvt = bnvt.mo68591g();
                    i = i4;
                }
                arrayList.set(i, bnvt);
                i++;
            }
        }
        int size = arrayList.size();
        while (i < size) {
            size--;
            arrayList.remove(size);
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        bnvu bnvu = new bnvu();
        bnvu.f132251a = bnkn.m109663a((Iterable) this.f132251a);
        return bnvu;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bnvu) {
            return this.f132251a.equals(((bnvu) obj).f132251a);
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 17;
        while (it.hasNext()) {
            i = (i * 37) + ((bnvt) it.next()).hashCode();
        }
        return i;
    }

    public final Iterator iterator() {
        return this.f132251a.iterator();
    }
}
