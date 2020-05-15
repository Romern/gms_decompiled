package p000;

import android.app.PendingIntent;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;

/* renamed from: arii */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arii extends dck implements arij {

    /* renamed from: a */
    public final arib f87778a;

    /* renamed from: b */
    protected final Handler f87779b;

    public arii() {
        super("com.google.android.gms.smartdevice.d2d.internal.IDirectTransferListener2");
    }

    /* renamed from: a */
    public final void mo48561a(int i, String str) {
        this.f87779b.sendMessage(this.f87779b.obtainMessage(3, i, 0, str));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public arii(arib arib) {
        super("com.google.android.gms.smartdevice.d2d.internal.IDirectTransferListener2");
        Looper mainLooper = Looper.getMainLooper();
        sdo.m34959a(arib);
        this.f87778a = arib;
        this.f87779b = new arid(this, mainLooper);
    }

    /* renamed from: a */
    public final void mo48562a(PendingIntent pendingIntent) {
        Handler handler = this.f87779b;
        handler.sendMessage(handler.obtainMessage(2, pendingIntent));
    }

    /* renamed from: a */
    public final void mo48563a(BootstrapCompletionResult bootstrapCompletionResult) {
        this.f87779b.sendMessage(this.f87779b.obtainMessage(0, bootstrapCompletionResult));
    }

    /* renamed from: a */
    public final void mo48564a(BootstrapOptions bootstrapOptions) {
        this.f87779b.sendMessage(this.f87779b.obtainMessage(4, bootstrapOptions));
    }

    /* renamed from: a */
    public final void mo48565a(BootstrapProgressResult bootstrapProgressResult) {
        Handler handler = this.f87779b;
        handler.sendMessage(handler.obtainMessage(1, bootstrapProgressResult));
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo48563a((BootstrapCompletionResult) dcl.m8163a(parcel, BootstrapCompletionResult.CREATOR));
        } else if (i == 2) {
            mo48565a((BootstrapProgressResult) dcl.m8163a(parcel, BootstrapProgressResult.CREATOR));
        } else if (i == 3) {
            mo48564a((BootstrapOptions) dcl.m8163a(parcel, BootstrapOptions.CREATOR));
        } else if (i == 4) {
            mo48562a((PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR));
        } else if (i != 5) {
            return false;
        } else {
            mo48561a(parcel.readInt(), parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
