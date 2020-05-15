package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: atig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atig extends atkj {

    /* renamed from: a */
    private final aswi f90393a;

    public atig(aswi aswi, String str, aswm aswm) {
        super("RegisterDataChangedListener", str, aswm);
        this.f90393a = aswi;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49607a(status, Bundle.EMPTY);
    }

    /* renamed from: a */
    public final boolean mo50004a() {
        return true;
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        super.mo50005b(context);
        atkl atkl = atkl.f90415a;
        aswi aswi = this.f90393a;
        aswm aswm = this.f90414d;
        synchronized (atkl.f90416b) {
            atkl.f90417c.put(aswi, aswm);
        }
        this.f90414d.mo49629f(Status.f30107a);
    }
}
