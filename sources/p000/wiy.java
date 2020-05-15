package p000;

import android.content.DialogInterface;
import com.google.android.gms.family.p042v2.create.FamilyCreationChimeraActivity;

/* renamed from: wiy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wiy implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ FamilyCreationChimeraActivity f50755a;

    public wiy(FamilyCreationChimeraActivity familyCreationChimeraActivity) {
        this.f50755a = familyCreationChimeraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f50755a.getSupportLoaderManager().restartLoader(5, null, new wjx(this.f50755a));
        this.f50755a.mo18444b(5);
        this.f50755a.getSupportLoaderManager().restartLoader(6, null, new wjo(this.f50755a));
        this.f50755a.mo18444b(6);
        this.f50755a.getSupportLoaderManager().restartLoader(4, null, new wjb(this.f50755a));
        this.f50755a.mo18444b(4);
        this.f50755a.getSupportLoaderManager().restartLoader(7, null, new wjk(this.f50755a));
        this.f50755a.mo18444b(7);
    }
}
