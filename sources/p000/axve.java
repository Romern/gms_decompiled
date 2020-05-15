package p000;

import android.os.ParcelFileDescriptor;
import android.util.Log;

/* renamed from: axve */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axve extends axvn {

    /* renamed from: a */
    final /* synthetic */ axvz f96461a;

    /* renamed from: b */
    final /* synthetic */ axrs f96462b;

    /* renamed from: c */
    final /* synthetic */ ParcelFileDescriptor f96463c;

    /* renamed from: d */
    final /* synthetic */ axvr f96464d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public axve(axvr axvr, axvz axvz, axrs axrs, ParcelFileDescriptor parcelFileDescriptor) {
        super(axvr);
        this.f96464d = axvr;
        this.f96461a = axvz;
        this.f96462b = axrs;
        this.f96463c = parcelFileDescriptor;
    }

    /* renamed from: a */
    public final void mo53610a() {
        try {
            axvx axvx = (axvx) this.f96464d.f96497d.mo53628a(this.f96461a);
            this.f96486g = axvx;
            if (axvx != null) {
                if (!axvx.mo53645d()) {
                    if (axvx.mo53644c()) {
                        Log.w("ChannelManager", "Error: Channel.receiveFile or Channel.getOutputStream mayonly be called once per channel");
                        axvr.m83319d(this.f96462b, 10);
                        return;
                    }
                    axvx.mo53637a(this.f96463c, (axrp) null);
                    axvr.m83319d(this.f96462b, 0);
                    return;
                }
            }
            Log.w("ChannelManager", "Called Channel.receiveFile on closed channel");
            axvr.m83319d(this.f96462b, 13);
        } catch (RuntimeException e) {
            axvr.m83319d(this.f96462b, 8);
            throw e;
        }
    }
}
