package p000;

import android.content.DialogInterface;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.constellation.p038ui.ConstellationSettingsChimeraActivity;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: taq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class taq implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ConstellationSettingsChimeraActivity f45580a;

    public taq(ConstellationSettingsChimeraActivity constellationSettingsChimeraActivity) {
        this.f45580a = constellationSettingsChimeraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        boolean z;
        boolean z2 = true;
        this.f45580a.f30551k = true;
        dialogInterface.dismiss();
        ConstellationSettingsChimeraActivity constellationSettingsChimeraActivity = this.f45580a;
        if (constellationSettingsChimeraActivity.f30554n != constellationSettingsChimeraActivity.f30553m) {
            constellationSettingsChimeraActivity.f30546c.setMessage(constellationSettingsChimeraActivity.getString(C0126R.string.common_saving));
            this.f45580a.f30546c.show();
            try {
                ConstellationSettingsChimeraActivity constellationSettingsChimeraActivity2 = this.f45580a;
                Executor executor = constellationSettingsChimeraActivity2.f30548e;
                int i2 = constellationSettingsChimeraActivity2.f30554n;
                if (i2 != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (i2 == 1) {
                    z2 = false;
                }
                executor.execute(new tba(constellationSettingsChimeraActivity2, z, z2));
            } catch (RejectedExecutionException e) {
                ConstellationSettingsChimeraActivity.f30536b.mo25417e("Couldn't start SetConsentTask", e, new Object[0]);
            }
        }
    }
}
