package p000;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.wearable.internal.GetChannelInputStreamResponse;
import java.io.IOException;

/* renamed from: axvc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axvc extends axvn {

    /* renamed from: a */
    final /* synthetic */ axvz f96453a;

    /* renamed from: b */
    final /* synthetic */ axrs f96454b;

    /* renamed from: c */
    final /* synthetic */ axvr f96455c;

    /* renamed from: d */
    final /* synthetic */ axrp f96456d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public axvc(axvr axvr, axvz axvz, axrs axrs, axrp axrp) {
        super(axvr);
        this.f96455c = axvr;
        this.f96453a = axvz;
        this.f96454b = axrs;
        this.f96456d = axrp;
    }

    /* renamed from: a */
    public final void mo53610a() {
        ParcelFileDescriptor parcelFileDescriptor;
        try {
            axvx axvx = (axvx) this.f96455c.f96497d.mo53628a(this.f96453a);
            this.f96486g = axvx;
            if (axvx != null) {
                if (!axvx.mo53645d()) {
                    if (!axvx.mo53644c()) {
                        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                        parcelFileDescriptor = createPipe[0];
                        axvx.mo53637a(createPipe[1], this.f96456d);
                        try {
                            this.f96454b.mo53446a(new GetChannelInputStreamResponse(0, parcelFileDescriptor));
                            parcelFileDescriptor.close();
                            return;
                        } catch (RemoteException e) {
                            Log.w("ChannelManager", "Failed to set SUCCESS on result of Channel.getInputStream. Closing channel.");
                            try {
                                axvx.mo53634a();
                            } catch (axvv e2) {
                                mo53612a(axvx.f96513a);
                            }
                            parcelFileDescriptor.close();
                            return;
                        }
                    } else {
                        Log.w("ChannelManager", "Error: Channel.getInputStream or Channel.sendFile mayonly be called once per channel");
                        axvr.m83317b(this.f96454b, 10);
                        return;
                    }
                }
            }
            Log.w("ChannelManager", "Called Channel.getInputStream on closed channel");
            axvr.m83317b(this.f96454b, 13);
        } catch (IOException e3) {
            Log.w("ChannelManager", "Failed to create pipe", e3);
            axvr.m83317b(this.f96454b, 8);
        } catch (RuntimeException e4) {
            axvr.m83317b(this.f96454b, 8);
            throw e4;
        } catch (Throwable th) {
            parcelFileDescriptor.close();
            throw th;
        }
    }
}
