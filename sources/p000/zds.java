package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.internal.ClientIdentity;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: zds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zds {

    /* renamed from: a */
    public static final srn f54972a = zvt.m46581a();

    /* renamed from: b */
    public final zrk f54973b;

    /* renamed from: c */
    public final String f54974c;

    /* renamed from: d */
    private final zeb f54975d;

    /* renamed from: e */
    private final zdq f54976e;

    /* renamed from: f */
    private final zqx f54977f;

    public zds(String str, zrk zrk, zeb zeb, zqx zqx, zdq zdq) {
        this.f54974c = str;
        this.f54973b = zrk;
        this.f54975d = zeb;
        this.f54977f = zqx;
        this.f54976e = zdq;
    }

    /* renamed from: a */
    public static int m45343a(int i, int i2) {
        if (i2 == 0) {
            return MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE;
        }
        if (i == 0) {
            return 3;
        }
        return i2 == i ? 2 : 160;
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
    /* renamed from: a */
    public final int mo30962a() {
        if (!this.f54973b.mo31400b()) {
            ((bnsl) f54972a.mo68388c()).mo68405a("Skipping FitRecordingApi init since Fit DB doesn't exist");
            return MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE;
        }
        try {
            bnic a = this.f54973b.mo31396a();
            if (a.isEmpty()) {
                return MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE;
            }
            bngz a2 = bnnm.m109864a(a, zdr.f54971a);
            bnrd a3 = a2.mo67316o().iterator();
            int i = 0;
            int i2 = 0;
            while (a3.hasNext()) {
                String str = (String) a3.next();
                bngx a4 = mo30963a(str, a2.mo67692g(str));
                ((bnsl) f54972a.mo68390d()).mo68422a("Initializing package %s: %d subscriptions", (Object) str, a4.size());
                i2 += a4.size();
                bnre i3 = a4.listIterator();
                while (i3.hasNext()) {
                    if (mo30964a(str, (yqe) i3.next())) {
                        i++;
                    }
                }
            }
            ((bnsl) f54972a.mo68390d()).mo68411a("FitRecording initialized.  Recreated %d subscriptions out of %d.", i, i2);
            return m45343a(i, i2);
        } catch (IOException e) {
            bnsl bnsl = (bnsl) f54972a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Error recreating subscriptions for %s", this.f54974c);
            return 10;
        }
    }

    /* renamed from: a */
    public final bngx mo30963a(String str, bngm bngm) {
        if (str.equals("com.google.android.gms.paired")) {
            return bngx.m109376e();
        }
        if (!this.f54976e.mo30958a(str).mo66813a()) {
            ((bnsl) f54972a.mo68388c()).mo68420a("App %s is uninstalled.  Removing its subscriptions", str);
            this.f54973b.mo31397a(str);
            return bngx.m109376e();
        } else if (!this.f54976e.mo30960b(str)) {
            if (!cdyu.m135392j()) {
                ((bnsl) f54972a.mo68388c()).mo68420a("App %s is disabled.  Removing its subscriptions", str);
                this.f54973b.mo31397a(str);
            } else if (this.f54975d.mo30974b(str).isEmpty()) {
                ((bnsl) f54972a.mo68390d()).mo68420a("App %s is disabled; skipping", str);
            } else {
                ((bnsl) f54972a.mo68390d()).mo68420a("App %s is disabled; removing listeners", str);
                this.f54975d.mo30972a(str);
            }
            return bngx.m109376e();
        } else if (!this.f54976e.mo30961c(str)) {
            if (this.f54975d.mo30974b(str).isEmpty()) {
                ((bnsl) f54972a.mo68390d()).mo68420a("App %s is not whitelisted for local recording; skipping", str);
            } else {
                ((bnsl) f54972a.mo68390d()).mo68420a("App %s is not whitelisted for local recording; removing listeners", str);
                this.f54975d.mo30972a(str);
            }
            return bngx.m109376e();
        } else {
            bngs j = bngx.m109377j();
            bnrd a = bngm.iterator();
            while (a.hasNext()) {
                yqe yqe = (yqe) a.next();
                if (yqe.f54384e != 2) {
                    if (!this.f54976e.mo30959a(str, yqe.f54381b).mo17710c()) {
                        ((bnsl) f54972a.mo68388c()).mo68425a("App %s no longer has access to %s, account %s.  Ignoring subscription", str, yyo.m45045c(yqe.f54381b), this.f54974c);
                    } else {
                        bnrd a2 = this.f54977f.mo31337a(yqe).iterator();
                        while (a2.hasNext()) {
                            yqe yqe2 = (yqe) a2.next();
                            if (yqe2.f54384e != 2) {
                                j.mo67668c(yqe2);
                            }
                        }
                    }
                }
            }
            return j.mo67664a();
        }
    }

    /* renamed from: a */
    public final boolean mo30964a(String str, yqe yqe) {
        bmxv a = this.f54976e.mo30958a(str);
        if (cdyu.f181962a.mo6606a().mo78511o()) {
            bqgg a2 = this.f54975d.mo30969a(yqe, (ClientIdentity) a.mo66814b());
            try {
                if (!a2.isDone() || ((Boolean) bqga.m112780a((Future) a2)).booleanValue()) {
                    return true;
                }
                return false;
            } catch (CancellationException | ExecutionException e) {
                bnsl bnsl = (bnsl) f54972a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68424a("Error registering recording listener for %s and subscription %s", this.f54974c, yqe);
                return false;
            }
        } else {
            this.f54975d.mo30969a(yqe, (ClientIdentity) a.mo66814b());
            return true;
        }
    }
}
