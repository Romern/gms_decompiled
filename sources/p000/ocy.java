package p000;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* renamed from: ocy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ocy {

    /* renamed from: a */
    private final qws f37208a;

    public ocy(Context context) {
        qws qws = new qws(context, "CAR", null);
        bmxy.m108581a(qws);
        this.f37208a = qws;
    }

    /* renamed from: a */
    public final void mo21983a(int i, bpcl bpcl, List list) {
        qwo a = this.f37208a.mo24335a(bpcl.serializeToBytes());
        int i2 = i - 1;
        if (i != 0) {
            a.mo24328b(i2);
            a.mo24325a("com.google.android.gms.car");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a.mo24322a(((Integer) it.next()).intValue());
            }
            a.mo24327b();
            return;
        }
        throw null;
    }
}
