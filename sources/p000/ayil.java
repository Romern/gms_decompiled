package p000;

import android.util.Log;
import com.google.android.gms.wearable.internal.GetChannelOutputStreamResponse;

/* renamed from: ayil */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayil extends ayfu {

    /* renamed from: c */
    final /* synthetic */ String f97671c;

    /* renamed from: d */
    final /* synthetic */ axrs f97672d;

    /* renamed from: e */
    final /* synthetic */ ayja f97673e;

    /* renamed from: f */
    final /* synthetic */ axrp f97674f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayil(ayja ayja, String str, String str2, axrs axrs, axrp axrp) {
        super(str);
        this.f97673e = ayja;
        this.f97671c = str2;
        this.f97672d = axrs;
        this.f97674f = axrp;
    }

    /* renamed from: a */
    public final void mo53991a() {
        try {
            ayja ayja = this.f97673e;
            axvr axvr = ayja.f97731j;
            axvz a = axvz.m83357a(ayja.f97726e, this.f97671c);
            axrs axrs = this.f97672d;
            axrp axrp = this.f97674f;
            sdo.m34959a(a);
            sdo.m34959a(axrs);
            sdo.m34959a(axrp);
            axvr.mo53625a(new axvd(axvr, a, axrs, axrp));
        } catch (axvy e) {
            Log.w("WearableService", "Invalid channel token passed to Channel.getOutputStream.", e);
            this.f97672d.mo53447a(new GetChannelOutputStreamResponse(8, null));
        } catch (RuntimeException e2) {
            Log.w("WearableService", "getChannelOutputStream: exception during processing", e2);
            this.f97672d.mo53447a(new GetChannelOutputStreamResponse(8, null));
        }
    }
}
