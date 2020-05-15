package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: gwe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class gwe extends hig {

    /* renamed from: a */
    private final aucf f19112a;

    public gwe(aucf aucf) {
        this.f19112a = aucf;
    }

    /* renamed from: a */
    public final void mo12276a(Bundle bundle) {
        gvk gvk = new gvk((Status) sef.m35069a((byte[]) sdo.m34959a(bundle.getByteArray("status")), Status.CREATOR), bundle.getBoolean("boolean"));
        if (gvk.f19075a.mo17710c()) {
            this.f19112a.mo50391a(Boolean.valueOf(gvk.f19076b));
        } else {
            this.f19112a.mo50390a((Exception) rzy.m34725a(gvk.f19075a));
        }
    }
}
