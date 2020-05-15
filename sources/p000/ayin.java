package p000;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.wearable.internal.ChannelSendFileResponse;

/* renamed from: ayin */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayin extends ayfu {

    /* renamed from: c */
    final /* synthetic */ String f97679c;

    /* renamed from: d */
    final /* synthetic */ ParcelFileDescriptor f97680d;

    /* renamed from: e */
    final /* synthetic */ axrs f97681e;

    /* renamed from: f */
    final /* synthetic */ long f97682f;

    /* renamed from: g */
    final /* synthetic */ long f97683g;

    /* renamed from: h */
    final /* synthetic */ ayja f97684h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayin(ayja ayja, String str, String str2, ParcelFileDescriptor parcelFileDescriptor, axrs axrs, long j, long j2) {
        super(str);
        this.f97684h = ayja;
        this.f97679c = str2;
        this.f97680d = parcelFileDescriptor;
        this.f97681e = axrs;
        this.f97682f = j;
        this.f97683g = j2;
    }

    /* renamed from: a */
    public final void mo53991a() {
        ParcelFileDescriptor parcelFileDescriptor;
        try {
            ayja ayja = this.f97684h;
            axvr axvr = ayja.f97731j;
            axvz a = axvz.m83357a(ayja.f97726e, this.f97679c);
            ParcelFileDescriptor parcelFileDescriptor2 = this.f97680d;
            axrs axrs = this.f97681e;
            long j = this.f97682f;
            long j2 = this.f97683g;
            sdo.m34959a(a);
            sdo.m34959a(parcelFileDescriptor2);
            sdo.m34959a(axrs);
            sdo.m34976b(j >= 0, "invalid startOffset %s", Long.valueOf(j));
            sdo.m34976b(j2 >= -1, "invalid length %s", Long.valueOf(j2));
            axvr.mo53625a(new axvf(axvr, a, axrs, parcelFileDescriptor2, j, j2));
            return;
        } catch (axvy e) {
            Log.w("WearableService", "Invalid channel token passed to Channel.sendFile.", e);
            this.f97681e.mo53441a(new ChannelSendFileResponse(8));
            parcelFileDescriptor = this.f97680d;
        } catch (RuntimeException e2) {
            Log.w("WearableService", "readChannelOutputFromFileDescriptor: uncaught exception", e2);
            this.f97681e.mo53441a(new ChannelSendFileResponse(8));
            parcelFileDescriptor = this.f97680d;
        } catch (Throwable th) {
            srz.m36170a(this.f97680d);
            throw th;
        }
        srz.m36170a(parcelFileDescriptor);
    }
}
