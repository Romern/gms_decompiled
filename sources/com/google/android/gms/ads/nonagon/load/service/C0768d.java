package com.google.android.gms.ads.nonagon.load.service;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.social.C0592a;
import com.google.android.gms.ads.internal.spamsignals.C0593a;
import com.google.android.gms.ads.nonagon.signals.C0785b;
import com.google.android.gms.ads.nonagon.signals.C0787d;
import com.google.android.gms.ads.nonagon.signals.C0790g;
import com.google.android.gms.ads.nonagon.signals.gmscore.C0794ac;
import com.google.android.gms.ads.nonagon.signals.gmscore.C0801aj;
import com.google.android.gms.ads.nonagon.signals.gmscore.C0805an;
import com.google.android.gms.ads.nonagon.signals.gmscore.C0809ar;
import com.google.android.gms.ads.nonagon.signals.gmscore.C0810as;
import com.google.android.gms.ads.nonagon.signals.gmscore.C0814aw;
import com.google.android.gms.ads.nonagon.signals.gmscore.C0817az;
import com.google.android.gms.ads.nonagon.signals.gmscore.C0821c;
import com.google.android.gms.ads.nonagon.signals.gmscore.C0824f;
import com.google.android.gms.ads.nonagon.signals.gmscore.C0830l;
import com.google.android.gms.ads.nonagon.signals.gmscore.C0836r;
import com.google.android.gms.ads.nonagon.signals.gmscore.C0840v;
import com.google.android.gms.ads.nonagon.util.concurrent.C0851d;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.ads.nonagon.load.service.d */
final /* synthetic */ class C0768d implements bqeh {

    /* renamed from: a */
    private final C0824f f9186a;

    public C0768d(C0824f fVar) {
        this.f9186a = fVar;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        C0824f fVar = this.f9186a;
        bqgj b = C0851d.m6032b();
        C0592a a = fVar.f9289j.mo10847a();
        C0851d.m6032b();
        C0785b bVar = new C0785b(new C0794ac(a, C0809ar.m5991a(fVar.f9280a)), 0, (ScheduledExecutorService) fVar.f9289j.f16643e.mo6445a());
        cazf.m127593a(bVar, "Cannot return null from a non-@Nullable @Provides method");
        C0785b bVar2 = new C0785b(new C0801aj(fic.m11738a(fia.m11732a(fVar.f9289j.f16639a)), (ScheduledExecutorService) fVar.f9289j.f16643e.mo6445a(), fVar.f9280a.mo7062a(), C0810as.m5994a(fVar.f9280a)), ((Long) C0371o.f8225ac.mo6604a()).longValue(), (ScheduledExecutorService) fVar.f9289j.f16643e.mo6445a());
        cazf.m127593a(bVar2, "Cannot return null from a non-@Nullable @Provides method");
        fhu fhu = fVar.f9289j.f16639a;
        C0785b bVar3 = new C0785b(new C0805an(fid.m11740b(), (ScheduledExecutorService) fVar.f9289j.f16643e.mo6445a(), fia.m11732a(fVar.f9289j.f16639a)), ((Long) C0371o.f8227ae.mo6604a()).longValue(), (ScheduledExecutorService) fVar.f9289j.f16643e.mo6445a());
        cazf.m127593a(bVar3, "Cannot return null from a non-@Nullable @Provides method");
        C0785b bVar4 = new C0785b(new C0821c(fVar.f9289j.mo10848b(), fia.m11732a(fVar.f9289j.f16639a), (ScheduledExecutorService) fVar.f9289j.f16643e.mo6445a(), C0851d.m6032b()), 0, (ScheduledExecutorService) fVar.f9289j.f16643e.mo6445a());
        cazf.m127593a(bVar4, "Cannot return null from a non-@Nullable @Provides method");
        C0785b bVar5 = new C0785b(new C0817az(C0851d.m6032b()), 0, (ScheduledExecutorService) fVar.f9289j.f16643e.mo6445a());
        cazf.m127593a(bVar5, "Cannot return null from a non-@Nullable @Provides method");
        C0787d dVar = C0814aw.f9265a;
        cazf.m127593a(dVar, "Cannot return null from a non-@Nullable @Provides method");
        fhu fhu2 = fVar.f9289j.f16639a;
        fhu fhu3 = fVar.f9289j.f16639a;
        C0593a b2 = fVar.f9289j.mo10848b();
        int i = fVar.f9280a.f9259b;
        Context a2 = fia.m11732a(fVar.f9289j.f16639a);
        fhu fhu4 = fVar.f9289j.f16639a;
        return new C0790g(b, bnic.m109494a(bVar, bVar2, bVar3, bVar4, bVar5, dVar, new C0830l(fhw.m11716b(), fia.m11732a(fVar.f9289j.f16639a), C0809ar.m5991a(fVar.f9280a), C0851d.m6032b()), new C0840v(fhy.m11720b(), C0851d.m6032b(), fia.m11732a(fVar.f9289j.f16639a)), fVar.mo7069a(), fVar.mo7070b(), new C0836r(b2, i, a2, fhx.m11718b(), (ScheduledExecutorService) fVar.f9289j.f16643e.mo6445a(), C0851d.m6032b()), (C0787d) fVar.f9289j.f16647i.mo6445a())).mo7059a(C0387d.m5363a().mo6848a((Bundle) obj));
    }
}
