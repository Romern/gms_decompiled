package p000;

import android.content.DialogInterface;
import com.google.android.gms.fido.u2f.api.view.BleSelectViewOptions;

/* renamed from: yby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class yby implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ycc f53577a;

    public yby(ycc ycc) {
        this.f53577a = ycc;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f53577a.f53582a.mo29788a(new BleSelectViewOptions(true));
    }
}
