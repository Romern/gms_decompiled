package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.facs.cache.FacsCacheCallOptions;
import com.google.android.gms.facs.cache.FacsInternalSyncCallOptions;
import com.google.android.gms.facs.cache.UpdateActivityControlsSettingsResult;
import java.util.concurrent.Executor;

/* renamed from: avbw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avbw extends avas {

    /* renamed from: o */
    private static final bnsn f92927o = avex.m78396b();

    /* renamed from: k */
    public final bxqf f92928k;

    /* renamed from: l */
    public final avfh f92929l;

    /* renamed from: p */
    private final ayte f92930p;

    /* renamed from: q */
    private long f92931q;

    public avbw(wfs wfs, ClientContext clientContext, avgm avgm, bxqf bxqf, avfh avfh, bbjm bbjm, Executor executor, FacsCacheCallOptions facsCacheCallOptions, aveu aveu, bdro bdro, ayte ayte, wfh wfh) {
        super("UpdateActivityControlsSettingsOperation", wfs, clientContext, avgm, bbjm, executor, facsCacheCallOptions, aveu, bdro, 1007, wfh);
        this.f92928k = bxqf;
        this.f92929l = avfh;
        this.f92930p = ayte;
    }

    /* renamed from: d */
    private final bxqg m78211d() {
        bnsi d = f92927o.mo68390d();
        d.mo68432a("avbw", "d", 93, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68420a("Operation '%s' performing upload...", this.f27820m);
        try {
            return (bxqg) m78149a(this.f92865d.mo34085d(aval.SYNC_ID_CUSTOM_CACHE, this.f92863b.f30213c).mo34066a(new avbv(this), 1, this.f92866e));
        } catch (gid e) {
            throw new aaaj(35001, "Auth error when uploading settings!", null, e);
        } catch (chuw | chux e2) {
            throw new aaaj(7, "Uploading settings failed!", null, e2);
        } catch (InterruptedException e3) {
            throw new aaaj(14, "Upload thread interrupted!", null, e3);
        }
    }

    /* renamed from: e */
    private final byte[] m78212e() {
        bnsi d = f92927o.mo68390d();
        d.mo68432a("avbw", "e", 149, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68420a("Forwarding operation '%s' to internal FACS API...", this.f27820m);
        wfh wfh = this.f92870i;
        bxqf bxqf = this.f92928k;
        FacsInternalSyncCallOptions facsInternalSyncCallOptions = new FacsInternalSyncCallOptions(false);
        roz b = rpa.m34196b();
        b.f43472a = new wfc(bxqf, facsInternalSyncCallOptions);
        return (byte[]) m78148a(wfh.mo24701a(b.mo24977a()));
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        byte[] bArr;
        bnsi d = f92927o.mo68390d();
        d.mo68432a("avbw", "a", 123, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68420a("Executing operation '%s'...", this.f27820m);
        this.f92931q = this.f92930p.mo54418b();
        mo51122a();
        mo51124a(chbh.f188248a.mo6606a().mo84919A());
        this.f92869h.mo58314a();
        if (chbh.m148009g()) {
            bnsi d2 = f92927o.mo68390d();
            d2.mo68432a("avbw", "e", 149, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68420a("Forwarding operation '%s' to internal FACS API...", this.f27820m);
            wfh wfh = this.f92870i;
            bxqf bxqf = this.f92928k;
            FacsInternalSyncCallOptions facsInternalSyncCallOptions = new FacsInternalSyncCallOptions(false);
            roz b = rpa.m34196b();
            b.f43472a = new wfc(bxqf, facsInternalSyncCallOptions);
            bArr = (byte[]) m78148a(wfh.mo24701a(b.mo24977a()));
        } else {
            bnsi d3 = f92927o.mo68390d();
            d3.mo68432a("avbw", "d", 93, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d3.mo68420a("Operation '%s' performing upload...", this.f27820m);
            try {
                bArr = ((bxqg) m78149a(this.f92865d.mo34085d(aval.SYNC_ID_CUSTOM_CACHE, this.f92863b.f30213c).mo34066a(new avbv(this), 1, this.f92866e))).serializeToBytes();
            } catch (gid e) {
                throw new aaaj(35001, "Auth error when uploading settings!", null, e);
            } catch (chuw | chux e2) {
                throw new aaaj(7, "Uploading settings failed!", null, e2);
            } catch (InterruptedException e3) {
                throw new aaaj(14, "Upload thread interrupted!", null, e3);
            }
        }
        mo51123a(Status.f30107a.f30115i, this.f92930p.mo54418b() - this.f92931q);
        this.f92862a.mo29068a(Status.f30107a, new UpdateActivityControlsSettingsResult(bArr));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        mo51123a(status.f30115i, this.f92930p.mo54418b() - this.f92931q);
        this.f92862a.mo29068a(status, (UpdateActivityControlsSettingsResult) null);
    }
}
