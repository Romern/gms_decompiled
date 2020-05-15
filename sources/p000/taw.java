package p000;

import android.net.Uri;
import android.view.MenuItem;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.constellation.p038ui.ConstellationSettingsChimeraActivity;
import java.util.concurrent.TimeUnit;

/* renamed from: taw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class taw extends tdq {

    /* renamed from: a */
    boolean f45586a = false;

    /* renamed from: b */
    final /* synthetic */ ConstellationSettingsChimeraActivity f45587b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public taw(ConstellationSettingsChimeraActivity constellationSettingsChimeraActivity) {
        super(constellationSettingsChimeraActivity.f30547d);
        this.f45587b = constellationSettingsChimeraActivity;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00cb A[SYNTHETIC, Splitter:B:26:0x00cb] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ef A[Catch:{ tdw -> 0x0100 }] */
    /* renamed from: a */
    public final void mo26345a() {
        try {
            sza j = this.f45587b.mo17982j();
            ConstellationSettingsChimeraActivity constellationSettingsChimeraActivity = this.f45587b;
            sek sek = ConstellationSettingsChimeraActivity.f30536b;
            tdx tdx = constellationSettingsChimeraActivity.f30537A;
            bxvd da = cbqa.f177983b.mo74144da();
            cbqj a = j.mo26251a(tdx, null, false, false, "getMessageOverrides");
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a.getClass();
            ((cbqa) da.f164949b).f177985a = a;
            cbqa cbqa = (cbqa) da.mo74062i();
            bqjd bqjd = (bqjd) bqje.f140932h.mo74144da();
            if (bqjd.f164950c) {
                bqjd.mo74035c();
                bqjd.f164950c = false;
            }
            bqje bqje = (bqje) bqjd.f164949b;
            bqje.f140935b = bqjw.m112936a(11);
            bqje.f140934a |= 1;
            bqje bqje2 = (bqje) bqjd.mo74062i();
            j.f45467d.mo26409a(tdx, 7, bqje2);
            sza.f45464c.mo25412b("GetMessageOverridesRequest: %s", cbqa);
            try {
                sze a2 = j.mo26255a();
                ClientContext clientContext = j.f45466b;
                long j2 = j.f45468e;
                if (sze.f45482f == null) {
                    sze.f45482f = chtv.m149566a(chtu.UNARY, "google.internal.communications.phonedeviceverification.v1.PhoneDeviceVerification/GetMessageOverrides", ciie.m150370a(cbqa.f177983b), ciie.m150370a(cbqb.f177986o));
                }
                cbqb cbqb = (cbqb) a2.f45483a.mo25553a(sze.f45482f, clientContext, cbqa, j2, TimeUnit.MILLISECONDS);
                sza.f45464c.mo25412b("GetMessageOverridesResponse: %s", cbqb);
                j.f45467d.mo26409a(tdx, 8, bqje2);
                constellationSettingsChimeraActivity.f30563w = cbqb;
                this.f45586a = true;
            } catch (gid e) {
                e = e;
                j.f45467d.mo26413a(tdx, e, bqje2, (cbqy) null);
                if (!(e instanceof chuw)) {
                    chuw chuw = (chuw) e;
                    sza.f45464c.mo25417e("GetMessageOverrides failed with status: %s\nException: ", e, chuw.f189236a.toString());
                    throw new tdu("getMessageOverrides", bqjk.m112922b(chuw.f189236a.f189233s.f189211r), false);
                }
                sza.f45464c.mo25417e("GetMessageOverrides failed with GoogleAuthException: ", e, new Object[0]);
                throw new tdu("getMessageOverrides", 30, false);
            } catch (chuw e2) {
                e = e2;
                j.f45467d.mo26413a(tdx, e, bqje2, (cbqy) null);
                if (!(e instanceof chuw)) {
                }
            }
        } catch (tdw e3) {
            ConstellationSettingsChimeraActivity.f30536b.mo25417e("Couldn't fetch message overrides", e3, new Object[0]);
        }
    }

    /* renamed from: b */
    public final void mo26346b() {
        MenuItem findItem;
        ConstellationSettingsChimeraActivity constellationSettingsChimeraActivity = this.f45587b;
        sek sek = ConstellationSettingsChimeraActivity.f30536b;
        cbqb cbqb = constellationSettingsChimeraActivity.f30563w;
        if (!(cbqb == null || constellationSettingsChimeraActivity.f30564x == null)) {
            if (!cbqb.f178000m.isEmpty()) {
                ConstellationSettingsChimeraActivity constellationSettingsChimeraActivity2 = this.f45587b;
                constellationSettingsChimeraActivity2.f30565y = Uri.parse(constellationSettingsChimeraActivity2.f30563w.f178000m);
            }
            if (!this.f45587b.f30563w.f178001n.isEmpty() && (findItem = this.f45587b.f30564x.findItem(C0126R.C0129id.c11n_learn_more)) != null) {
                findItem.setTitle(this.f45587b.f30563w.f178001n);
            }
        }
        synchronized (this.f45587b.f30539C) {
            if (!this.f45586a) {
                this.f45587b.f30543G = true;
            }
            this.f45587b.f30544H = false;
            this.f45587b.mo17980g();
        }
    }
}
