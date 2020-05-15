package p000;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: aqwj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aqwj extends tih {
    public aqwj(Context context) {
        super(context);
        ArrayList arrayList = new ArrayList();
        if (this.f46067a == null) {
            this.f46067a = new adzt();
        } else {
            super.mo26559a();
        }
        ((tih) this).f46068b = new tig(this, arrayList);
        this.f46067a.postDelayed(((tih) this).f46068b, 2000);
    }
}
