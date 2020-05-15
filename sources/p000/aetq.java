package p000;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

/* renamed from: aetq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aetq implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ aetr f63789a;

    public aetq(aetr aetr) {
        this.f63789a = aetr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f63789a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(cfaz.f183554a.mo6606a().mo80779b())));
    }
}
