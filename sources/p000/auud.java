package p000;

import android.content.DialogInterface;

/* renamed from: auud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class auud implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ boolean f92534a;

    /* renamed from: b */
    final /* synthetic */ String f92535b;

    /* renamed from: c */
    final /* synthetic */ auug f92536c;

    public auud(auug auug, boolean z, String str) {
        this.f92536c = auug;
        this.f92534a = z;
        this.f92535b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.f92534a) {
            this.f92536c.f92539a.mo50931c(this.f92535b);
        }
    }
}
