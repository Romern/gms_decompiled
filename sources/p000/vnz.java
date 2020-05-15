package p000;

import android.widget.SectionIndexer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: vnz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vnz implements rkh {

    /* renamed from: a */
    public final SectionIndexer f49610a;

    /* renamed from: b */
    private final List f49611b;

    /* renamed from: c */
    private final txb f49612c;

    public vnz(List list, List list2, txb txb) {
        this.f49611b = m40904a(list);
        sdo.m34959a(txb);
        this.f49612c = txb;
        this.f49610a = new vnw(this.f49611b, m40904a(list2));
    }

    /* renamed from: a */
    private static List m40904a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            vnx vnx = (vnx) list.get(i);
            if (vnx.f49607b != 0) {
                arrayList.add(vnx);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final void mo12460c() {
        this.f49612c.mo12460c();
    }

    /* renamed from: a */
    public final int mo28682a() {
        return this.f49611b.size() + this.f49612c.mo24660a();
    }

    /* renamed from: a */
    public final vny mo28683a(int i) {
        List list = this.f49611b;
        int size = list.size();
        int i2 = i;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            vnx vnx = (vnx) list.get(i4);
            if (i2 == 0) {
                return new vny(vnx, null);
            }
            int i5 = vnx.f49607b + 1;
            if (i2 < i5) {
                return new vny(null, this.f49612c.mo24661a((i - i3) - 1));
            }
            i2 -= i5;
            i3++;
        }
        throw new IndexOutOfBoundsException();
    }
}
