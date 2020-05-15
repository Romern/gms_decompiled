package p000;

import android.app.ProgressDialog;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.constellation.p038ui.ConstellationSettingsChimeraActivity;
import java.util.ArrayList;

/* renamed from: tba */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class tba extends tdq {

    /* renamed from: a */
    final boolean f45593a;

    /* renamed from: b */
    final boolean f45594b;

    /* renamed from: c */
    boolean f45595c = false;

    /* renamed from: d */
    final /* synthetic */ ConstellationSettingsChimeraActivity f45596d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tba(ConstellationSettingsChimeraActivity constellationSettingsChimeraActivity, boolean z, boolean z2) {
        super(constellationSettingsChimeraActivity.f30547d);
        this.f45596d = constellationSettingsChimeraActivity;
        this.f45593a = z;
        this.f45594b = z2;
    }

    /* renamed from: a */
    public final void mo26345a() {
        try {
            sza j = this.f45596d.mo17982j();
            ConstellationSettingsChimeraActivity constellationSettingsChimeraActivity = this.f45596d;
            Logger Logger = ConstellationSettingsChimeraActivity.f30536b;
            j.mo26257a(constellationSettingsChimeraActivity.f30537A, this.f45593a, this.f45594b);
            if (!this.f45593a) {
                ConstellationSettingsChimeraActivity constellationSettingsChimeraActivity2 = this.f45596d;
                constellationSettingsChimeraActivity2.f30559s.mo26287a(false);
                constellationSettingsChimeraActivity2.f30559s.mo26286a((Boolean) false);
                szr.m36692a();
                szr.m36695a(new ArrayList());
                constellationSettingsChimeraActivity2.f30559s.mo26288b();
                constellationSettingsChimeraActivity2.f30559s.mo26283a();
                constellationSettingsChimeraActivity2.f30559s.mo26299j();
            }
            this.f45595c = true;
        } catch (tdw e) {
            ConstellationSettingsChimeraActivity.f30536b.mo25417e("Couldn't change consent", e, new Object[0]);
        }
    }

    /* renamed from: b */
    public final void mo26346b() {
        ConstellationSettingsChimeraActivity.f30536b.mo25412b("setConsent %s", Boolean.valueOf(this.f45595c));
        ProgressDialog progressDialog = this.f45596d.f30546c;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f45596d.f30546c.dismiss();
        }
        if (this.f45595c) {
            Toast.makeText(this.f45596d.f30558r, (int) C0126R.string.common_saved, 0).show();
            this.f45596d.f30542F = true;
            this.f45596d.recreate();
            return;
        }
        Toast.makeText(this.f45596d.f30558r, (int) C0126R.string.common_something_went_wrong, 0).show();
    }
}
