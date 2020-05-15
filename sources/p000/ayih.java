package p000;

import android.util.Log;
import com.google.android.gms.wearable.internal.CloseChannelResponse;

/* renamed from: ayih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayih extends ayfu {

    /* renamed from: c */
    final /* synthetic */ String f97658c;

    /* renamed from: d */
    final /* synthetic */ axrs f97659d;

    /* renamed from: e */
    final /* synthetic */ ayja f97660e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayih(ayja ayja, String str, String str2, axrs axrs) {
        super(str);
        this.f97660e = ayja;
        this.f97658c = str2;
        this.f97659d = axrs;
    }

    /* renamed from: a */
    public final void mo53991a() {
        try {
            ayja ayja = this.f97660e;
            axvr axvr = ayja.f97731j;
            axvz a = axvz.m83357a(ayja.f97726e, this.f97658c);
            if (Log.isLoggable("ChannelManager", 2)) {
                Log.v("ChannelManager", String.format("Posting closeChannel(%s)", a));
            }
            sdo.checkIfNull(a, "token");
            axvr.mo53625a(new axva(axvr, a));
            this.f97659d.mo53442a(new CloseChannelResponse(0));
        } catch (axvy e) {
            Log.w("WearableService", "Invalid channel token passed to close.", e);
            this.f97659d.mo53442a(new CloseChannelResponse(8));
        } catch (RuntimeException e2) {
            Log.w("WearableService", "closeChannel: exception during processing", e2);
            this.f97659d.mo53442a(new CloseChannelResponse(8));
        }
    }
}
