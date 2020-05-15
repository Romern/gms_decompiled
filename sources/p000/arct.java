package p000;

import android.content.Context;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;

/* renamed from: arct */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arct extends aaab {

    /* renamed from: a */
    public final arit f87380a;

    /* renamed from: b */
    public final ardc f87381b;

    /* renamed from: c */
    public final BootstrapConfigurations f87382c;

    /* renamed from: d */
    public final ParcelFileDescriptor[] f87383d;

    /* renamed from: e */
    public final aqzq f87384e;

    /* renamed from: f */
    private final Handler f87385f;

    public arct(arit arit, BootstrapConfigurations bootstrapConfigurations, ParcelFileDescriptor[] parcelFileDescriptorArr, aqzq aqzq, ardc ardc, Handler handler) {
        super(75, "StartDirectTransferOperation");
        this.f87380a = arit;
        this.f87381b = ardc;
        this.f87382c = bootstrapConfigurations;
        this.f87383d = parcelFileDescriptorArr;
        this.f87384e = aqzq;
        this.f87385f = handler;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f87385f.post(new arcs(this));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f87380a.mo48583i(status);
    }
}
