package p000;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: alxl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alxl implements alzw {

    /* renamed from: a */
    final /* synthetic */ alxn f74527a;

    public alxl(alxn alxn) {
        this.f74527a = alxn;
    }

    /* renamed from: a */
    public final void mo40839a(int i, Bundle bundle) {
        bundle.setClassLoader(getClass().getClassLoader());
        DataHolder dataHolder = (DataHolder) bundle.getParcelable("gaia_map");
        boolean z = bundle.getBoolean("response_complete");
        if (dataHolder != null) {
            this.f74527a.f74530b.add(dataHolder);
        }
        alxn alxn = this.f74527a;
        if (alxn.f74529a.f74405d && !alxn.f74535p) {
            if (dataHolder != null || z) {
                alxn.f74535p = true;
                this.f74527a.mo40841a(dataHolder);
            }
        }
    }
}
