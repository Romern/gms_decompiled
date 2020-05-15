package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: athy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class athy extends atkj {
    public athy(String str, aswm aswm) {
        super("CreateWallet", str, aswm);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49607a(status, Bundle.EMPTY);
    }

    /* renamed from: a */
    public final boolean mo50004a() {
        return false;
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        super.mo50005b(context);
        this.f90414d.mo49607a(new Status(6, null, asiw.m74197a(context, null, this.f90413c)), Bundle.EMPTY);
    }
}
