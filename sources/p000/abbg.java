package p000;

import android.content.DialogInterface;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: abbg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abbg implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ HelpChimeraActivity f56982a;

    /* renamed from: b */
    final /* synthetic */ abbh f56983b;

    public abbg(abbh abbh, HelpChimeraActivity helpChimeraActivity) {
        this.f56983b = abbh;
        this.f56982a = helpChimeraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            this.f56982a.mo43347d(this.f56983b.f56984a[i]);
        } catch (ClassCastException e) {
            throw new ClassCastException(String.valueOf(this.f56982a.toString()).concat(" must implement PickSupportPhoneNumberListener"));
        }
    }
}
