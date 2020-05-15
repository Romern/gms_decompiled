package p000;

import com.google.android.gms.auth.uiflows.addaccount.PreAddAccountChimeraActivity;

/* renamed from: jwh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jwh implements aubw {

    /* renamed from: a */
    final /* synthetic */ PreAddAccountChimeraActivity f23400a;

    public jwh(PreAddAccountChimeraActivity preAddAccountChimeraActivity) {
        this.f23400a = preAddAccountChimeraActivity;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10462a(Object obj) {
        Integer num = (Integer) obj;
        sek sek = PreAddAccountChimeraActivity.f11420a;
        String valueOf = String.valueOf(num);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("Checkin result status: ");
        sb.append(valueOf);
        sek.mo25418e(sb.toString(), new Object[0]);
        if (rjs.m33680f(num.intValue())) {
            this.f23400a.f11424e.mo14171a(true);
        } else {
            this.f23400a.f11424e.mo14171a(false);
        }
    }
}
