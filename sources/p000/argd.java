package p000;

import android.content.Context;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;

/* renamed from: argd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class argd extends aaab {

    /* renamed from: a */
    public final BootstrapOptions f87636a;

    /* renamed from: b */
    public final ParcelFileDescriptor[] f87637b;

    /* renamed from: c */
    public final aqzq f87638c;

    /* renamed from: d */
    public final argg f87639d;

    /* renamed from: e */
    public final arjf f87640e;

    /* renamed from: f */
    private final Handler f87641f;

    public argd(arjf arjf, argg argg, BootstrapOptions bootstrapOptions, ParcelFileDescriptor[] parcelFileDescriptorArr, aqzq aqzq, Handler handler) {
        super(76, "StartDirectTransferOperation");
        this.f87636a = bootstrapOptions;
        this.f87637b = parcelFileDescriptorArr;
        this.f87638c = aqzq;
        this.f87639d = argg;
        this.f87640e = arjf;
        this.f87641f = handler;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f87641f.post(new argc(this));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f87640e.mo48604d(status);
    }
}
