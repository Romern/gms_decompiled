package p000;

import android.content.Context;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.locationsharing.common.model.LocationShare;

/* renamed from: aevi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aevi extends aesx {

    /* renamed from: b */
    public final LocationShare f63889b;

    public aevi(Context context, String str, LocationShare locationShare) {
        super(context, str);
        this.f63889b = locationShare;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aevn.b(com.google.android.gms.locationsharing.common.model.LocationShare, boolean):void
     arg types: [com.google.android.gms.locationsharing.common.model.LocationShare, int]
     candidates:
      abh.b(android.view.ViewGroup, int):acm
      abh.b(int, int):void
      abh.b(acm, int):void
      aevn.b(com.google.android.gms.locationsharing.common.model.LocationShare, boolean):void */
    /* renamed from: a */
    public static void m52590a(Context context, String str, aevn aevn, LocationShare locationShare, boolean z, View view) {
        int i;
        if (z) {
            aevn.mo34607a(locationShare);
            aevh aevh = new aevh(aevn, locationShare, context, str);
            if (!locationShare.mo43760f()) {
                i = C0126R.string.location_sharing_stopped_sharing;
            } else {
                i = C0126R.string.location_sharing_stopped_sharing_link;
            }
            bhnh a = bhnh.m101202a(view, context.getString(i, locationShare.mo43757d()), 0);
            if (!locationShare.mo43760f()) {
                a.mo64030a((int) C0126R.string.location_sharing_undo, aevh);
            }
            a.mo64020c();
            return;
        }
        aevn.mo34610b(locationShare, true);
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        String str = ((aesx) this).f63753a;
        Context context = getContext();
        LocationShare locationShare = this.f63889b;
        return Boolean.valueOf(new aeub(str, context).mo34566a(locationShare.f79627a, locationShare.f79628b));
    }
}
