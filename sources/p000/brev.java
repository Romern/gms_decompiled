package p000;

import com.felicanetworks.mfc.AppInfo;
import com.felicanetworks.mfc.Felica;
import com.felicanetworks.mfc.FelicaEventListener;
import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.mfi.MfiClient;

/* renamed from: brev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brev implements FelicaEventListener {

    /* renamed from: a */
    final /* synthetic */ Felica f142732a;

    /* renamed from: b */
    final /* synthetic */ brew f142733b;

    public brev(brew brew, Felica felica) {
        this.f142733b = brew;
        this.f142732a = felica;
    }

    public final void errorOccurred(int i, String str, AppInfo appInfo) {
        try {
            this.f142733b.f142737d.mo69503a(i, str, appInfo);
            this.f142733b.f142734a.mo49936a(bret.m113948a(i, str, appInfo));
            this.f142733b.f142737d.mo69480a(5);
        } finally {
            brew brew = this.f142733b;
            brew.f142737d.mo69508b(this.f142732a, brew.f142738e);
            this.f142733b.f142737d.mo69509c();
        }
    }

    public final void finished() {
        this.f142733b.f142737d.mo69507b(2);
        try {
            MfiClient mfiClient = this.f142732a.getMfiClient();
            mfiClient.start(MfiClient.ACCOUNT_ISSUER_GOOGLE, this.f142733b.f142736c, new breu(this, mfiClient));
        } catch (FelicaException e) {
            this.f142733b.f142737d.mo69502a(12, e);
            this.f142733b.f142734a.mo49936a(bret.m113949a(e));
            this.f142733b.f142737d.mo69480a(4);
            brew brew = this.f142733b;
            brew.f142737d.mo69481a(this.f142732a, brew.f142738e);
        } catch (Throwable th) {
            brew brew2 = this.f142733b;
            brew2.f142737d.mo69481a(this.f142732a, brew2.f142738e);
            throw th;
        }
    }
}
