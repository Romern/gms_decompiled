package p000;

import com.google.android.gms.car.CrashInfoParcel;

/* renamed from: nui */
final /* synthetic */ class nui implements Runnable {

    /* renamed from: a */
    private final nuk f36510a;

    /* renamed from: b */
    private final RuntimeException f36511b;

    /* renamed from: c */
    private final CrashInfoParcel f36512c;

    public nui(nuk nuk, RuntimeException runtimeException, CrashInfoParcel crashInfoParcel) {
        this.f36510a = nuk;
        this.f36511b = runtimeException;
        this.f36512c = crashInfoParcel;
    }

    public final void run() {
        nuk nuk = this.f36510a;
        RuntimeException runtimeException = this.f36511b;
        CrashInfoParcel crashInfoParcel = this.f36512c;
        nij nij = (nij) nuk.mo21726f();
        if (nij != null) {
            nij.mo20768a(runtimeException, crashInfoParcel, false);
        }
    }
}
