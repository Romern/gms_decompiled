package p000;

import android.util.Log;
import com.google.android.gms.wearable.internal.CloseChannelResponse;

/* renamed from: ayii */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayii extends ayfu {

    /* renamed from: c */
    final /* synthetic */ String f97661c;

    /* renamed from: d */
    final /* synthetic */ int f97662d;

    /* renamed from: e */
    final /* synthetic */ axrs f97663e;

    /* renamed from: f */
    final /* synthetic */ ayja f97664f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayii(ayja ayja, String str, String str2, int i, axrs axrs) {
        super(str);
        this.f97664f = ayja;
        this.f97661c = str2;
        this.f97662d = i;
        this.f97663e = axrs;
    }

    /* renamed from: a */
    public final void mo53991a() {
        try {
            ayja ayja = this.f97664f;
            axvr axvr = ayja.f97731j;
            axvz a = axvz.m83357a(ayja.f97726e, this.f97661c);
            int i = this.f97662d;
            if (!Log.isLoggable("ChannelManager", 2)) {
                sdo.m34966a(a, "token");
                axvr.mo53625a(new axvb(axvr, a, i));
                this.f97663e.mo53461b(new CloseChannelResponse(0));
                return;
            }
            Object[] objArr = new Object[3];
            objArr[0] = a;
            objArr[1] = Integer.valueOf(i);
            throw null;
        } catch (axvy e) {
            Log.w("WearableService", "Invalid channel token passed to closeWithError.", e);
            this.f97663e.mo53461b(new CloseChannelResponse(8));
        } catch (RuntimeException e2) {
            Log.w("WearableService", "closeChannelWithError: exception during processing", e2);
            this.f97663e.mo53461b(new CloseChannelResponse(8));
        }
    }
}
