package p000;

import android.content.DialogInterface;
import com.google.android.gms.fido.u2f.api.view.NfcViewOptions;

/* renamed from: yca */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class yca implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ycc f53579a;

    public yca(ycc ycc) {
        this.f53579a = ycc;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f53579a.f53582a.mo29788a(new NfcViewOptions(false, true));
    }
}
