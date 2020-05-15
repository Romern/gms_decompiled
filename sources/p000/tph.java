package p000;

import com.google.android.chimera.Activity;
import java.util.Iterator;
import java.util.List;

/* renamed from: tph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tph {

    /* renamed from: a */
    public final bngx f46440a;

    /* renamed from: b */
    public final Activity f46441b;

    public tph(Activity activity, List list) {
        this.f46441b = activity;
        bngs j = bngx.m109377j();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bmxv g = ((tqj) it.next()).mo26742g();
            if (g.mo66813a()) {
                j.mo67668c((String) g.mo66814b());
            }
        }
        this.f46440a = j.mo67664a();
    }
}
