package p000;

import android.util.Log;
import com.google.android.gms.wearable.internal.GetAllCapabilitiesResponse;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* renamed from: ayht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayht extends ayfu {

    /* renamed from: c */
    final /* synthetic */ int f97624c;

    /* renamed from: d */
    final /* synthetic */ axrs f97625d;

    /* renamed from: e */
    final /* synthetic */ ayja f97626e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayht(ayja ayja, String str, int i, axrs axrs) {
        super(str);
        this.f97626e = ayja;
        this.f97624c = i;
        this.f97625d = axrs;
    }

    /* renamed from: a */
    public final void mo53991a() {
        try {
            ayja ayja = this.f97626e;
            Map a = ayja.f97729h.mo53598a(ayja.f97726e, (String) null, this.f97624c);
            ArrayList arrayList = new ArrayList(a.size());
            for (Map.Entry entry : a.entrySet()) {
                arrayList.add(ayfy.m83946a((String) entry.getKey(), (Set) entry.getValue()));
            }
            this.f97625d.mo53444a(new GetAllCapabilitiesResponse(0, arrayList));
        } catch (Exception e) {
            Log.e("WearableService", "getConnectedCapabilities: exception during processing", e);
            this.f97625d.mo53444a(new GetAllCapabilitiesResponse(8, null));
        }
    }
}
