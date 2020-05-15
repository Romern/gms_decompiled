package p000;

import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: lkv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lkv implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ lkx f26269a;

    public lkv(lkx lkx) {
        this.f26269a = lkx;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        lkx lkx = this.f26269a;
        lkx.f26159a.startActivity(new Intent("android.app.action.SET_NEW_PASSWORD"));
    }
}
