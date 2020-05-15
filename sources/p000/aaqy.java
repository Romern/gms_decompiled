package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.Map;

/* renamed from: aaqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aaqy extends aara {

    /* renamed from: a */
    final /* synthetic */ aalr f28964a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aaqy(aamh aamh, Bundle bundle, Map map, aalr aalr) {
        super(0, aamh, bundle, map);
        this.f28964a = aalr;
    }

    /* renamed from: a */
    public final void mo17198a(Context context, Bundle bundle) {
        aalr aalr = this.f28964a;
        int i = aalr.f28412a;
        if (i == 0) {
            m21848a(aalr.f28416e, mo17200a(bundle));
        } else if (aalr.f28413b) {
            StringBuilder sb = new StringBuilder(57);
            sb.append("Got oneWay request when expecting twoWay for: ");
            sb.append(i);
            Log.w("GCM", sb.toString());
        } else {
            Bundle bundle2 = new Bundle();
            bundle2.putBundle("data", bundle);
            aalr.mo16977a(bundle2);
        }
    }
}
