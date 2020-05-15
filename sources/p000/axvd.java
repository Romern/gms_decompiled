package p000;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.wearable.internal.GetChannelOutputStreamResponse;
import java.io.IOException;

/* renamed from: axvd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axvd extends axvn {

    /* renamed from: a */
    final /* synthetic */ axvz f96457a;

    /* renamed from: b */
    final /* synthetic */ axrs f96458b;

    /* renamed from: c */
    final /* synthetic */ axvr f96459c;

    /* renamed from: d */
    final /* synthetic */ axrp f96460d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public axvd(axvr axvr, axvz axvz, axrs axrs, axrp axrp) {
        super(axvr);
        this.f96459c = axvr;
        this.f96457a = axvz;
        this.f96458b = axrs;
        this.f96460d = axrp;
    }

    /* renamed from: a */
    public final void mo53610a() {
        ParcelFileDescriptor parcelFileDescriptor;
        try {
            axvx axvx = (axvx) this.f96459c.f96497d.mo53628a(this.f96457a);
            this.f96486g = axvx;
            if (axvx != null) {
                if (!axvx.mo53649f()) {
                    if (!axvx.mo53647e()) {
                        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                        ParcelFileDescriptor parcelFileDescriptor2 = createPipe[0];
                        parcelFileDescriptor = createPipe[1];
                        axvx.mo53638a(parcelFileDescriptor2, this.f96460d, 0, -1);
                        try {
                            this.f96458b.mo53447a(new GetChannelOutputStreamResponse(0, parcelFileDescriptor));
                            parcelFileDescriptor.close();
                            return;
                        } catch (RemoteException e) {
                            Log.w("ChannelManager", "Failed to set SUCCESS on result of Channel.getOutputStream. Closing channel.");
                            try {
                                axvx.mo53634a();
                            } catch (axvv e2) {
                                mo53612a(axvx.f96513a);
                            }
                            parcelFileDescriptor.close();
                            return;
                        }
                    } else {
                        Log.w("ChannelManager", "Error: Channel.getOutputStream or Channel.receiveFile mayonly be called once per channel");
                        axvr.m83318c(this.f96458b, 10);
                        return;
                    }
                }
            }
            Log.w("ChannelManager", "Called Channel.getOutputStream on closed channel");
            axvr.m83318c(this.f96458b, 13);
        } catch (IOException e3) {
            Log.w("ChannelManager", "Failed to create pipe", e3);
            axvr.m83318c(this.f96458b, 8);
        } catch (RuntimeException e4) {
            axvr.m83318c(this.f96458b, 8);
            throw e4;
        } catch (Throwable th) {
            parcelFileDescriptor.close();
            throw th;
        }
    }
}
