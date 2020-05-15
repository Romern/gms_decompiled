package p000;

import com.google.android.gms.nearby.connection.PayloadTransferUpdate;

/* renamed from: mlo */
final /* synthetic */ class mlo implements Runnable {

    /* renamed from: a */
    private final mlp f33953a;

    /* renamed from: b */
    private final PayloadTransferUpdate f33954b;

    public mlo(mlp mlp, PayloadTransferUpdate payloadTransferUpdate) {
        this.f33953a = mlp;
        this.f33954b = payloadTransferUpdate;
    }

    public final void run() {
        mlp mlp = this.f33953a;
        mlp.f33955a.mo20154a(this.f33954b);
    }
}
