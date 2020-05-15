package p000;

import android.content.DialogInterface;
import com.google.android.gms.family.p042v2.create.FamilyCreationChimeraActivity;

/* renamed from: wiw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wiw implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ FamilyCreationChimeraActivity f50753a;

    public wiw(FamilyCreationChimeraActivity familyCreationChimeraActivity) {
        this.f50753a = familyCreationChimeraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.f50753a.mo18458o()) {
            this.f50753a.mo18453j();
            dialogInterface.dismiss();
            return;
        }
        this.f50753a.f31382s.mo29110a(3, 3);
        this.f50753a.mo18446c(-7);
    }
}
