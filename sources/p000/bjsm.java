package p000;

import android.content.DialogInterface;

/* renamed from: bjsm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjsm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ DialogInterface f123239a;

    /* renamed from: b */
    final /* synthetic */ bjsn f123240b;

    public bjsm(bjsn bjsn, DialogInterface dialogInterface) {
        this.f123240b = bjsn;
        this.f123239a = dialogInterface;
    }

    public final void run() {
        this.f123240b.f123241a.onCancel(this.f123239a);
    }
}
