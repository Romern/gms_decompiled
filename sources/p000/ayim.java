package p000;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.wearable.internal.ChannelReceiveFileResponse;

/* renamed from: ayim */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayim extends ayfu {

    /* renamed from: c */
    final /* synthetic */ String f97675c;

    /* renamed from: d */
    final /* synthetic */ ParcelFileDescriptor f97676d;

    /* renamed from: e */
    final /* synthetic */ axrs f97677e;

    /* renamed from: f */
    final /* synthetic */ ayja f97678f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayim(ayja ayja, String str, String str2, ParcelFileDescriptor parcelFileDescriptor, axrs axrs) {
        super(str);
        this.f97678f = ayja;
        this.f97675c = str2;
        this.f97676d = parcelFileDescriptor;
        this.f97677e = axrs;
    }

    /* renamed from: a */
    public final void mo53991a() {
        ParcelFileDescriptor parcelFileDescriptor;
        try {
            ayja ayja = this.f97678f;
            axvr axvr = ayja.f97731j;
            axvz a = axvz.m83357a(ayja.f97726e, this.f97675c);
            ParcelFileDescriptor parcelFileDescriptor2 = this.f97676d;
            axrs axrs = this.f97677e;
            sdo.m34959a(a);
            sdo.m34959a(parcelFileDescriptor2);
            sdo.m34959a(axrs);
            axvr.mo53625a(new axve(axvr, a, axrs, parcelFileDescriptor2));
            return;
        } catch (axvy e) {
            Log.w("WearableService", "Invalid channel token passed to Channel.receiveFile.", e);
            this.f97677e.mo53440a(new ChannelReceiveFileResponse(8));
            parcelFileDescriptor = this.f97676d;
        } catch (RuntimeException e2) {
            Log.w("WearableService", "writeChannelInputToFileDescriptor: uncaught exception", e2);
            this.f97677e.mo53440a(new ChannelReceiveFileResponse(8));
            parcelFileDescriptor = this.f97676d;
        } catch (Throwable th) {
            srz.m36170a(this.f97676d);
            throw th;
        }
        srz.m36170a(parcelFileDescriptor);
    }
}
