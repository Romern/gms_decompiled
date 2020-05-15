package p000;

import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;

/* renamed from: ayyf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayyf implements ayvw, ayyd {

    /* renamed from: a */
    public final bptv f98735a;

    /* renamed from: b */
    public final List f98736b;

    /* renamed from: c */
    public final List f98737c;

    /* renamed from: d */
    public final SparseIntArray f98738d;

    /* renamed from: e */
    private final bngx f98739e;

    public ayyf(bptv bptv, List list, List list2, SparseIntArray sparseIntArray, List list3, SparseIntArray sparseIntArray2) {
        this.f98735a = bptv;
        this.f98736b = Collections.unmodifiableList(list);
        this.f98737c = Collections.unmodifiableList(list2);
        this.f98738d = sparseIntArray;
        Collections.unmodifiableList(list3);
        boolean z = true;
        bmxy.m108589a(!list.isEmpty(), "Must have at least one graft");
        bmxy.m108589a((list2.size() == sparseIntArray.size() && list3.size() == sparseIntArray2.size()) ? z : false, "All children must have a parent specified.");
        this.f98739e = bngx.m109356a(ayyc.m85065b((ayye) list.iterator().next()));
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bmxy.m108588a(ayyc.m85065b((ayye) list.get(i)).equals(this.f98739e.get(0)));
        }
    }

    /* renamed from: a */
    public final List mo54525a() {
        return this.f98739e;
    }

    /* renamed from: b */
    public final aywu mo54526b() {
        return ayyc.m85065b(this);
    }
}
