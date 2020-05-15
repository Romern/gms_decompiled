package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.cryptauth.ExportedSymmetricKey;
import com.google.android.gms.common.api.Status;

/* renamed from: iqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iqz extends dcj implements irb {
    public iqz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.cryptauth.internal.IExportedSymmetricKeyCallback");
    }

    /* renamed from: a */
    public final void mo13174a(ExportedSymmetricKey exportedSymmetricKey) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, exportedSymmetricKey);
        mo8530c(1, bj);
    }

    /* renamed from: a */
    public final void mo13175a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(2, bj);
    }
}
