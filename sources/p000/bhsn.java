package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: bhsn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhsn implements bhto {

    /* renamed from: a */
    final /* synthetic */ bhso f119471a;

    /* renamed from: b */
    private final bhtx f119472b;

    /* renamed from: c */
    private final Collection f119473c;

    /* renamed from: d */
    private final int f119474d;

    /* renamed from: e */
    private final int f119475e;

    public bhsn(bhso bhso, bhtx bhtx, Collection collection, int i, int i2) {
        this.f119471a = bhso;
        this.f119472b = bhtx;
        this.f119473c = collection;
        this.f119474d = i;
        this.f119475e = i2;
    }

    /* renamed from: a */
    public final void mo64222a(Collection collection, Collection collection2) {
        bhsk bhsk = this.f119471a.f119485j;
        if (bhsk != null) {
            bhtx bhtx = this.f119472b;
            if (bhsk.f119463a != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    bvoa bvoa = (bvoa) it.next();
                    bhsu a = bhsu.m101471a(bvoa);
                    if (a != null) {
                        arrayList.add(a);
                    } else {
                        bhwp a2 = bhuj.m101555a();
                        String valueOf = String.valueOf(bvoa);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
                        sb.append("Unable to create candidate from proto: ");
                        sb.append(valueOf);
                        a2.mo64360b(sb.toString());
                    }
                }
                if (bicy.m101982a()) {
                    arrayList.addAll(bhst.m101466a(arrayList));
                }
                bhsi bhsi = (bhsi) bhsk.f119463a;
                if (bhsi.f119449d) {
                    bhsi.f119450e.mo64193a(bhtx, arrayList);
                    for (bhro bhro : bhsi.f119448c.values()) {
                        bhro.mo64193a(bhtx, arrayList);
                    }
                }
            } else {
                bhuj.m101555a();
            }
            bhso.m101457a(this.f119471a);
            bhuk bhuk = this.f119471a.f119478c;
            int size = collection.size();
            int size2 = this.f119473c.size();
            int i = this.f119474d;
            int size3 = collection2.size();
            int i2 = this.f119475e;
            bxvd da = bpnd.f138387h.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpnd bpnd = (bpnd) da.f164949b;
            int i3 = bpnd.f138389a | 1;
            bpnd.f138389a = i3;
            bpnd.f138390b = size;
            int i4 = i3 | 2;
            bpnd.f138389a = i4;
            bpnd.f138391c = size2;
            int i5 = i4 | 4;
            bpnd.f138389a = i5;
            bpnd.f138392d = i;
            int i6 = i5 | 8;
            bpnd.f138389a = i6;
            bpnd.f138393e = size3;
            int i7 = i6 | 16;
            bpnd.f138389a = i7;
            bpnd.f138394f = false;
            bpnd.f138395g = i2 - 1;
            bpnd.f138389a = i7 | 32;
            bicx bicx = (bicx) bhuk;
            bicx.mo64534a(bicx.mo64531a((bpnd) da.mo74062i()));
            return;
        }
        bhuj.m101555a().mo64360b("Candidate selection completed while InferenceDataManager stopped - ignoring");
    }
}
