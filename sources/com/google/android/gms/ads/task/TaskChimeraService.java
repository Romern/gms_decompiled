package com.google.android.gms.ads.task;

import com.google.android.gms.ads.identifier.settings.C0302t;
import com.google.android.gms.ads.internal.util.client.C0633h;
import com.google.android.gms.ads.jams.C0728a;
import com.google.android.gms.ads.jams.C0730c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class TaskChimeraService extends aeah {

    /* renamed from: a */
    private final List f9481a = new ArrayList();

    /* renamed from: b */
    private final Map f9482b = new HashMap();

    public TaskChimeraService() {
        C0728a aVar = new C0728a(new C0730c(rpr.m34216b()));
        C0302t tVar = new C0302t();
        this.f9481a.add(aVar);
        this.f9481a.add(tVar);
        this.f9482b.put("jams-negotiation-task", aVar);
        this.f9482b.put("ads.fetch_integrity_token.one_time", tVar);
        this.f9482b.put("ads.fetch_integrity_token.periodic", tVar);
    }

    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        String str = aecc.f63128a;
        if (this.f9482b.containsKey(str)) {
            return ((C0907a) this.f9482b.get(str)).mo6525b();
        }
        String valueOf = String.valueOf(str);
        C0633h.m5664a(valueOf.length() == 0 ? new String("Unexpected task tag: ") : "Unexpected task tag: ".concat(valueOf));
        return 2;
    }

    /* renamed from: aZ */
    public final void mo7135aZ() {
        List list = this.f9481a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C0907a) list.get(i)).mo6524a();
        }
    }
}
