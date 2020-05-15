package p000;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ubx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ubx {

    /* renamed from: a */
    final /* synthetic */ String f47220a;

    /* renamed from: b */
    final /* synthetic */ uby f47221b;

    public ubx(uby uby, String str) {
        this.f47221b = uby;
        this.f47220a = str;
    }

    /* renamed from: a */
    public final void mo27225a(vba vba) {
        List<ucb> list;
        List list2 = vba.f48902b;
        uca uca = this.f47221b.f47224c;
        String str = this.f47220a;
        List arrayList = vba.f48901a ? new ArrayList(list2) : bngx.m109376e();
        synchronized (uca) {
            sdo.m34970a(uca.f47229b.containsKey(str));
            if (!arrayList.isEmpty()) {
                uca.f47228a.put(str, new ubz(arrayList, SystemClock.elapsedRealtime()));
            }
            list = (List) uca.f47229b.get(str);
            uca.f47229b.remove(str);
        }
        for (ucb ucb : list) {
            ucb.mo27069a(arrayList, true);
        }
        this.f47221b.f47225d.f47120a.f47151l.mo27814a(this.f47220a, list2.isEmpty());
    }
}
