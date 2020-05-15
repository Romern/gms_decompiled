package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.facs.cache.FacsCacheCallOptions;
import com.google.android.gms.facs.cache.FacsInternalSyncCallOptions;
import com.google.android.gms.facs.cache.ForceSettingsCacheRefreshResult;
import java.util.concurrent.Executor;

/* renamed from: avbc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avbc extends avas {

    /* renamed from: k */
    private static final bnsn f92893k = avex.m78396b();

    /* renamed from: l */
    private final ayte f92894l;

    /* renamed from: o */
    private long f92895o;

    public avbc(wfs wfs, ClientContext clientContext, avgm avgm, bbjm bbjm, Executor executor, FacsCacheCallOptions facsCacheCallOptions, aveu aveu, bdro bdro, ayte ayte, wfh wfh) {
        super("ForceSettingsCacheRefreshOperation", wfs, clientContext, avgm, bbjm, executor, facsCacheCallOptions, aveu, bdro, 1006, wfh);
        this.f92894l = ayte;
    }

    /* renamed from: d */
    private final byte[] m78180d() {
        bnsi d = f92893k.mo68390d();
        d.mo68432a("avbc", "d", 94, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68420a("Forwarding operation '%s' to internal FACS API...", this.f27820m);
        return (byte[]) m78148a(this.f92870i.mo29076a(new FacsInternalSyncCallOptions(true)));
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        byte[] bArr;
        bnsi d = f92893k.mo68390d();
        d.mo68432a("avbc", "a", 68, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68420a("Executing operation '%s'...", this.f27820m);
        this.f92895o = this.f92894l.mo54418b();
        mo51122a();
        mo51124a(chbh.f188248a.mo6606a().mo84965y());
        this.f92869h.mo58314a();
        if (!chbh.m148009g()) {
            bArr = mo51121a(avgl.FORCED).mo73642k();
        } else {
            bnsi d2 = f92893k.mo68390d();
            d2.mo68432a("avbc", "d", 94, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68420a("Forwarding operation '%s' to internal FACS API...", this.f27820m);
            bArr = (byte[]) m78148a(this.f92870i.mo29076a(new FacsInternalSyncCallOptions(true)));
        }
        mo51123a(Status.f30107a.f30115i, this.f92894l.mo54418b() - this.f92895o);
        this.f92862a.mo29067a(Status.f30107a, new ForceSettingsCacheRefreshResult(bArr));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        mo51123a(status.f30115i, this.f92894l.mo54418b() - this.f92895o);
        this.f92862a.mo29067a(status, (ForceSettingsCacheRefreshResult) null);
    }
}
