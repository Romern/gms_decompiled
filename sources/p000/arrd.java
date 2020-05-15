package p000;

import android.content.Context;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.directtransfer.DirectTransferOptions;

/* renamed from: arrd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arrd extends aaab {

    /* renamed from: a */
    public final DirectTransferOptions f88167a;

    /* renamed from: b */
    public final ParcelFileDescriptor[] f88168b;

    /* renamed from: c */
    public final aqzq f88169c;

    /* renamed from: d */
    public final argg f88170d;

    /* renamed from: e */
    public final arrh f88171e;

    /* renamed from: f */
    private final Handler f88172f;

    public arrd(arrh arrh, argg argg, DirectTransferOptions directTransferOptions, ParcelFileDescriptor[] parcelFileDescriptorArr, aqzq aqzq, Handler handler) {
        super(BaseMfiEventCallback.TYPE_CARD_NOT_ACTIVE, "StartDirectTransferOperation");
        this.f88167a = directTransferOptions;
        this.f88168b = parcelFileDescriptorArr;
        this.f88169c = aqzq;
        this.f88170d = argg;
        this.f88171e = arrh;
        this.f88172f = handler;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f88172f.post(new arrc(this));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f88171e.mo48773a(status);
    }
}
