package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.facs.cache.FacsInternalSyncCallOptions;
import com.google.android.gms.facs.cache.SyncActivityControlsSettingsInternalResult;
import java.util.concurrent.Executor;

/* renamed from: avbs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avbs extends avat {

    /* renamed from: g */
    private static final bnsn f92922g = avex.m78396b();

    public avbs(wfy wfy, avgm avgm, ClientContext clientContext, bbjm bbjm, Executor executor, FacsInternalSyncCallOptions facsInternalSyncCallOptions) {
        super("SyncActivityControlsSettingsInternalOperation", wfy, avgm, clientContext, bbjm, executor, facsInternalSyncCallOptions);
    }

    /* renamed from: a */
    private final bxpe m78203a(avgl avgl) {
        bnsi d = f92922g.mo68390d();
        d.mo68432a("avbs", "a", 83, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68424a("Operation '%s' performing sync (type: '%s')...", this.f27820m, avgl);
        try {
            return (bxpe) m78156a(this.f92875d.mo34085d(aval.SYNC_ID_CUSTOM_CACHE, this.f92874c.f30213c).mo34066a(new avbr(this, avgl), 1, this.f92876e));
        } catch (gid e) {
            throw new aaaj(35001, "Auth error when downloading settings!", null, e);
        } catch (chuw | chux e2) {
            throw new aaaj(7, "Downloading settings failed!", null, e2);
        } catch (InterruptedException e3) {
            throw new aaaj(14, "Download thread interrupted!", null, e3);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        bnsi d = f92922g.mo68390d();
        d.mo68432a("avbs", "a", 59, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68420a("Executing operation '%s'...", this.f27820m);
        mo51127a();
        avgl avgl = !this.f92877f.f31270a ? avgl.EMPTY_CACHE : avgl.FORCED;
        bnsi d2 = f92922g.mo68390d();
        d2.mo68432a("avbs", "a", 83, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d2.mo68424a("Operation '%s' performing sync (type: '%s')...", this.f27820m, avgl);
        try {
            this.f92872a.mo29075a(Status.f30107a, new SyncActivityControlsSettingsInternalResult(((bxpe) m78156a(this.f92875d.mo34085d(aval.SYNC_ID_CUSTOM_CACHE, this.f92874c.f30213c).mo34066a(new avbr(this, avgl), 1, this.f92876e))).serializeToBytes()));
            bnsi d3 = f92922g.mo68390d();
            d3.mo68432a("avbs", "a", 70, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d3.mo68420a("Operation '%s' successful!", this.f27820m);
        } catch (gid e) {
            throw new aaaj(35001, "Auth error when downloading settings!", null, e);
        } catch (chuw | chux e2) {
            throw new aaaj(7, "Downloading settings failed!", null, e2);
        } catch (InterruptedException e3) {
            throw new aaaj(14, "Download thread interrupted!", null, e3);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f92872a.mo29075a(status, (SyncActivityControlsSettingsInternalResult) null);
        bnsi c = f92922g.mo68388c();
        c.mo68432a("avbs", "a", 77, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c.mo68422a("Operation '%s' failed with status '%d'!", (Object) this.f27820m, status.f30115i);
    }
}
