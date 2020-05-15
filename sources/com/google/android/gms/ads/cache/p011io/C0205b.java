package com.google.android.gms.ads.cache.p011io;

import com.google.android.gms.ads.cache.C0196b;
import com.google.android.gms.ads.cache.C0197c;
import com.google.android.gms.ads.cache.C0200f;
import com.google.android.gms.ads.cache.C0215n;
import com.google.android.gms.ads.cache.C0217p;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.util.client.C0633h;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.google.android.gms.ads.cache.io.b */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0205b {

    /* renamed from: a */
    public static final C0205b f7864a = new C0205b();

    /* renamed from: b */
    private final ThreadPoolExecutor f7865b = new soc(((Integer) C0371o.f8229ag.mo6604a()).intValue(), 10);

    /* renamed from: c */
    private final C1245ok f7866c = new C1245ok();

    /* renamed from: d */
    private final C1245ok f7867d = new C1245ok();

    public C0205b() {
        C0371o.m5339a(rpr.m34216b());
    }

    /* renamed from: a */
    public final synchronized void mo6399a(String str, OutputStream outputStream, C0196b bVar) {
        if (!this.f7866c.containsKey(str)) {
            this.f7866c.put(str, bVar);
            this.f7867d.put(str, ((soc) this.f7865b).submit(new C0204a(this, str, outputStream)));
        }
    }

    /* renamed from: b */
    public final synchronized void mo6402b(String str) {
        Future future = (Future) this.f7867d.remove(str);
        if (future != null) {
            this.f7866c.remove(str);
            future.cancel(true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo6400a(String str, boolean z) {
        C0196b bVar = (C0196b) this.f7866c.remove(str);
        if (bVar != null) {
            try {
                C0197c cVar = bVar.f7839a;
                cVar.mo6385a();
                bxvd a = C0217p.f7911g.mo74141a(cVar.f7841b);
                C0215n nVar = cVar.f7841b.f7917e;
                if (nVar == null) {
                    nVar = C0215n.f7897h;
                }
                bxvd a2 = C0215n.f7897h.mo74141a(nVar);
                if (a2.f164950c) {
                    a2.mo74035c();
                    a2.f164950c = false;
                }
                C0215n nVar2 = (C0215n) a2.f164949b;
                nVar2.f7899a |= 8;
                nVar2.f7904f = z;
                if (a.f164950c) {
                    a.mo74035c();
                    a.f164950c = false;
                }
                C0217p pVar = (C0217p) a.f164949b;
                C0215n nVar3 = (C0215n) a2.mo74062i();
                nVar3.getClass();
                pVar.f7917e = nVar3;
                pVar.f7913a |= 8;
                cVar.f7841b = (C0217p) a.mo74062i();
                cVar.f7843d.mo6390b(cVar.f7841b);
                if (!z) {
                    try {
                        cVar.f7842c.mo6413c().close();
                    } catch (IOException e) {
                        C0633h.m5673d("Unable to truncate partially downloaded file.", e);
                    }
                }
            } catch (C0200f e2) {
                C0633h.m5669b("Unable to update entry's download state.", e2);
            }
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo6401a(String str) {
        return this.f7866c.containsKey(str);
    }
}
