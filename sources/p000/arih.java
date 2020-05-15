package p000;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;

/* renamed from: arih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arih extends dcj implements arij {
    public arih(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.smartdevice.d2d.internal.IDirectTransferListener2");
    }

    /* renamed from: a */
    public final void mo48561a(int i, String str) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        bj.writeString(str);
        mo8528b(5, bj);
    }

    /* renamed from: a */
    public final void mo48562a(PendingIntent pendingIntent) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, pendingIntent);
        mo8528b(4, bj);
    }

    /* renamed from: a */
    public final void mo48563a(BootstrapCompletionResult bootstrapCompletionResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, bootstrapCompletionResult);
        mo8528b(1, bj);
    }

    /* renamed from: a */
    public final void mo48564a(BootstrapOptions bootstrapOptions) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, bootstrapOptions);
        mo8528b(3, bj);
    }

    /* renamed from: a */
    public final void mo48565a(BootstrapProgressResult bootstrapProgressResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, bootstrapProgressResult);
        mo8528b(2, bj);
    }
}
