package p000;

import android.content.DialogInterface;

/* renamed from: apxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apxv implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ apxw f85092a;

    /* renamed from: b */
    final /* synthetic */ apxx f85093b;

    public apxv(apxx apxx, apxw apxw) {
        this.f85093b = apxx;
        this.f85092a = apxw;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        apwr apwr = this.f85093b.f85094a;
        if (apwr != null) {
            apwr.mo47665a(4, 8);
        }
        apxw apxw = this.f85092a;
        if (apxw != null) {
            apxw.mo47695e();
        }
    }
}
