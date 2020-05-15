package p000;

import android.content.Context;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.directtransfer.DirectTransferConfigurations;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: arqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arqx extends aaab {

    /* renamed from: a */
    public final arrh f88144a;

    /* renamed from: b */
    public final ardc f88145b;

    /* renamed from: c */
    public final ParcelFileDescriptor[] f88146c;

    /* renamed from: d */
    public final aqzq f88147d;

    /* renamed from: e */
    private final DirectTransferConfigurations f88148e;

    /* renamed from: f */
    private final Handler f88149f;

    public arqx(arrh arrh, DirectTransferConfigurations directTransferConfigurations, ParcelFileDescriptor[] parcelFileDescriptorArr, aqzq aqzq, ardc ardc, Handler handler) {
        super(BaseMfiEventCallback.TYPE_INVALID_LINKAGE_DATA, "StartDirectTransferOperation");
        this.f88144a = arrh;
        this.f88145b = ardc;
        this.f88148e = directTransferConfigurations;
        this.f88146c = parcelFileDescriptorArr;
        this.f88147d = aqzq;
        this.f88149f = handler;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        DirectTransferConfigurations directTransferConfigurations = this.f88148e;
        BootstrapConfigurations bootstrapConfigurations = new BootstrapConfigurations();
        HashMap hashMap = new HashMap();
        String str = directTransferConfigurations.f108050a;
        if (str != null) {
            hashMap.put("directTransferConfirmationBodyText", str);
        }
        String str2 = directTransferConfigurations.f108052c;
        if (str2 != null) {
            hashMap.put("directTransferConfirmationTitleText", str2);
        }
        String str3 = directTransferConfigurations.f108051b;
        if (str3 != null) {
            hashMap.put("directTransfer3pConfirmationBodyText", str3);
        }
        bootstrapConfigurations.mo59037a(hashMap);
        bootstrapConfigurations.mo59036a(new ArrayList(ardn.m72536a(context)));
        this.f88149f.post(new arqw(this, bootstrapConfigurations));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f88144a.mo48773a(status);
    }
}
