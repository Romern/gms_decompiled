package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;

/* renamed from: gsd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gsd extends rzu {

    /* renamed from: a */
    final gse f18935a;

    /* renamed from: b */
    final ily f18936b;

    public gsd(Context context, gse gse, ily ily) {
        super(context, 120, new int[0]);
        this.f18935a = gse;
        this.f18936b = ily;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo12163a(String str, int i) {
        if (spn.m35869b()) {
            return;
        }
        if (str == null || !this.f18936b.mo13132a(str)) {
            String valueOf = String.valueOf(str);
            throw new SecurityException(valueOf.length() == 0 ? new String("Can't manage work accounts: ") : "Can't manage work accounts: ".concat(valueOf));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6393a(sbj sbj, GetServiceRequest getServiceRequest) {
        gse gse = this.f18935a;
        gse.asBinder();
        sbj.mo16678a(0, gse, (Bundle) null);
    }
}
