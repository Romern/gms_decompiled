package p000;

import android.app.AlertDialog;
import android.content.DialogInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: lko */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lko implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ AtomicInteger f26260a;

    public lko(AtomicInteger atomicInteger) {
        this.f26260a = atomicInteger;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == 0 || i == 1) {
            ((AlertDialog) dialogInterface).getButton(-1).setEnabled(true);
            this.f26260a.set(i);
        }
    }
}
