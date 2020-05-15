package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* renamed from: amas */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amas extends alzl {

    /* renamed from: a */
    private final rlf f74583a;

    /* renamed from: a */
    public final void mo40528a(int i, Bundle bundle, Bundle bundle2) {
        ArrayList<String> arrayList;
        Status a = amaz.m62474a(i, bundle);
        ArrayList<String> arrayList2 = null;
        if (a.mo17710c()) {
            arrayList2 = bundle2.getStringArrayList("added_circles");
            arrayList = bundle2.getStringArrayList("removed_circles");
        } else {
            arrayList = null;
        }
        this.f74583a.mo9482a(new amat(a, arrayList2, arrayList));
    }

    public amas(rlf rlf) {
        this.f74583a = rlf;
    }
}
