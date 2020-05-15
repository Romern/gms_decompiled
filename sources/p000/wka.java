package p000;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

/* renamed from: wka */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wka implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ why f50785a;

    /* renamed from: b */
    final /* synthetic */ wkc f50786b;

    public wka(wkc wkc, why why) {
        this.f50786b = wkc;
        this.f50785a = why;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f50786b.f50788a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((breg) this.f50785a.f50695a).f142610e)));
        this.f50786b.f50788a.f31382s.mo29110a(3, 2);
        this.f50786b.f50788a.mo18446c(-5);
    }
}
