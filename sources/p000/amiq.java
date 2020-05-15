package p000;

import android.content.DialogInterface;
import com.google.android.gms.people.profile.AvatarChimeraActivity;

/* renamed from: amiq */
final /* synthetic */ class amiq implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final amis f74944a;

    public amiq(amis amis) {
        this.f74944a = amis;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        amis amis = this.f74944a;
        ((AvatarChimeraActivity) amis.getActivity()).mo46370e();
        amis.dismiss();
    }
}
