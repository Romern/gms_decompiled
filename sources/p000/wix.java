package p000;

import android.content.DialogInterface;
import com.google.android.gms.family.p042v2.create.FamilyCreationChimeraActivity;

/* renamed from: wix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wix implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ FamilyCreationChimeraActivity f50754a;

    public wix(FamilyCreationChimeraActivity familyCreationChimeraActivity) {
        this.f50754a = familyCreationChimeraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.f50754a.mo18458o()) {
            this.f50754a.mo18453j();
            dialogInterface.dismiss();
            return;
        }
        this.f50754a.f31382s.mo29110a(3, 4);
        this.f50754a.mo18446c(-6);
    }
}
