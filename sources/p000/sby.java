package p000;

import android.content.Context;
import android.util.SparseIntArray;

/* renamed from: sby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sby {

    /* renamed from: a */
    private final SparseIntArray f44045a;

    /* renamed from: b */
    private rfj f44046b;

    public sby() {
        this(rfi.f42868a);
    }

    /* renamed from: a */
    public final int mo25381a(Context context, rjm rjm) {
        sdo.m34959a(context);
        sdo.m34959a(rjm);
        int i = 0;
        if (!rjm.mo24650r()) {
            return 0;
        }
        int d = rjm.mo6465d();
        int i2 = this.f44045a.get(d, -1);
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= this.f44045a.size()) {
                i = i2;
                break;
            }
            int keyAt = this.f44045a.keyAt(i3);
            if (keyAt > d && this.f44045a.get(keyAt) == 0) {
                break;
            }
            i3++;
        }
        if (i == -1) {
            i = this.f44046b.mo24590b(context);
        }
        this.f44045a.put(d, i);
        return i;
    }

    public sby(rfj rfj) {
        this.f44045a = new SparseIntArray();
        sdo.m34959a(rfj);
        this.f44046b = rfj;
    }

    /* renamed from: a */
    public final void mo25382a() {
        this.f44045a.clear();
    }
}
