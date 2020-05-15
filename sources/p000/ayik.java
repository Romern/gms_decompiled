package p000;

import android.util.Log;
import com.google.android.gms.wearable.internal.GetChannelInputStreamResponse;

/* renamed from: ayik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayik extends ayfu {

    /* renamed from: c */
    final /* synthetic */ String f97667c;

    /* renamed from: d */
    final /* synthetic */ axrs f97668d;

    /* renamed from: e */
    final /* synthetic */ ayja f97669e;

    /* renamed from: f */
    final /* synthetic */ axrp f97670f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayik(ayja ayja, String str, String str2, axrs axrs, axrp axrp) {
        super(str);
        this.f97669e = ayja;
        this.f97667c = str2;
        this.f97668d = axrs;
        this.f97670f = axrp;
    }

    /* renamed from: a */
    public final void mo53991a() {
        try {
            ayja ayja = this.f97669e;
            axvr axvr = ayja.f97731j;
            axvz a = axvz.m83357a(ayja.f97726e, this.f97667c);
            axrs axrs = this.f97668d;
            axrp axrp = this.f97670f;
            sdo.m34959a(a);
            sdo.m34959a(axrs);
            axvr.mo53625a(new axvc(axvr, a, axrs, axrp));
        } catch (axvy e) {
            Log.w("WearableService", "Invalid channel token passed to Channel.getInputStream.", e);
            this.f97668d.mo53446a(new GetChannelInputStreamResponse(8, null));
        } catch (RuntimeException e2) {
            Log.w("WearableService", "getChannelInputStream: exception during processing", e2);
            this.f97668d.mo53446a(new GetChannelInputStreamResponse(8, null));
        }
    }
}
