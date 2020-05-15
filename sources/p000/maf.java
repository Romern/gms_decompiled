package p000;

import android.content.Context;

/* renamed from: maf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class maf extends bqdt {

    /* renamed from: a */
    public final int f33326a;

    /* renamed from: b */
    private final mag f33327b;

    public maf(Context context, int i, man man) {
        sdo.m34975b(true, "Cannot switch to UNKNOWN_TRANSPORT!");
        sdo.m34959a(context);
        this.f33326a = i;
        if (i == 1) {
            this.f33327b = new mah(context, man).mo19803a(this, "com.google.android.gms.backup.BackupTransportService", "com.google.android.gms/.backup.BackupTransportService");
        } else {
            this.f33327b = new mah(context, man).mo19803a(this, "com.google.android.gms.backup.component.D2dTransportService", "com.google.android.gms/.backup.migrate.service.D2dTransport");
        }
        this.f33327b.mo19801a();
    }

    public final boolean cancel(boolean z) {
        this.f33327b.mo19802b();
        return super.cancel(z);
    }
}
