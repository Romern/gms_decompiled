package p000;

import android.text.format.Formatter;
import android.widget.TextView;
import com.google.android.gms.app.settings.ManageSpaceChimeraActivity;

/* renamed from: fqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fqc implements aubw {

    /* renamed from: a */
    final /* synthetic */ ManageSpaceChimeraActivity f17123a;

    public fqc(ManageSpaceChimeraActivity manageSpaceChimeraActivity) {
        this.f17123a = manageSpaceChimeraActivity;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10462a(Object obj) {
        long j;
        rkj rkj = (rkj) obj;
        long j2 = 0;
        if (rkj != null) {
            j2 = rkj.mo24820n();
            j = rkj.mo24821o();
        } else {
            j = 0;
        }
        ManageSpaceChimeraActivity manageSpaceChimeraActivity = this.f17123a;
        manageSpaceChimeraActivity.f9503b.setText(Formatter.formatFileSize(manageSpaceChimeraActivity, j2));
        ManageSpaceChimeraActivity manageSpaceChimeraActivity2 = this.f17123a;
        TextView textView = manageSpaceChimeraActivity2.f9505d;
        if (textView != null) {
            textView.setText(Formatter.formatFileSize(manageSpaceChimeraActivity2, j));
        }
    }
}
