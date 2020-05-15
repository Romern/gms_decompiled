package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: atio */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atio extends atkk {
    public atio(String str, aswm aswm) {
        super("DismissQuickAccessWallet", str, aswm);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49629f(status);
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        asqk asqk;
        if (ssw.m36269a() && (asqk = (asqk) asql.f89391a.get()) != null) {
            asqk.mo49369a();
        }
        this.f90414d.mo49629f(Status.f30107a);
    }
}
