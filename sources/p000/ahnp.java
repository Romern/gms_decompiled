package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: ahnp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahnp {

    /* renamed from: a */
    public final ahne f67634a;

    /* renamed from: b */
    public final bqgj f67635b = ahhr.m55806b();

    /* renamed from: c */
    public final Map f67636c = new C1223np();

    /* renamed from: d */
    public final bqgj f67637d = ahhr.m55802a(50);

    /* renamed from: e */
    public final bqgj f67638e = ahhr.m55802a(50);

    public ahnp(ahne ahne) {
        this.f67634a = ahne;
    }

    /* renamed from: a */
    public final List mo36891a(List list, byte[] bArr, long j, long j2, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            ahna a = this.f67634a.mo36876a(str2);
            if (a == null) {
                ((bnsl) ahkm.f67363a.mo68387b()).mo68426a("EndpointManager failed to find EndpointChannel over which to write %s at offset %d of Payload %d to endpoint %s", str, Long.valueOf(j2), Long.valueOf(j), str2);
                arrayList.add(str2);
            } else {
                try {
                    a.mo36799a(bArr);
                } catch (IOException e) {
                    bnsl bnsl = (bnsl) ahkm.f67363a.mo68387b();
                    bnsl.mo68437a(e);
                    bnsl.mo68426a("EndpointManager failed to write %s at offset %d of Payload %d to endpoint %s", str, Long.valueOf(j2), Long.valueOf(j), str2);
                    arrayList.add(str2);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo36896b(buuw buuw, ahnm ahnm) {
        mo36895a(new ahng(this, buuw, ahnm));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36892a(ahkv ahkv, String str) {
        mo36895a(new ahnk(this, ahkv, str));
    }

    /* renamed from: a */
    public final void mo36893a(ahkv ahkv, String str, boolean z) {
        if (this.f67634a.mo36882b(str)) {
            ahkv.mo36741r(str);
            CountDownLatch countDownLatch = new CountDownLatch(((C1245ok) this.f67636c).f26809h);
            for (ahnm ahnm : this.f67636c.values()) {
                ahnm.mo36782a(ahkv, str, countDownLatch);
            }
            ahhf.m55775a("waitForEndpointDisconnectionProcessing", countDownLatch, cfnv.f184625a.mo6606a().mo81742aA());
            ahkv.mo36702a(str, z);
            srn srn = ahkm.f67363a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36894a(buuw buuw, ahnm ahnm) {
        mo36895a(new ahnf(this, buuw, ahnm));
    }

    /* renamed from: a */
    public final void mo36895a(Runnable runnable) {
        this.f67635b.execute(runnable);
    }
}
