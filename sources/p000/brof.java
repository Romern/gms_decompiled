package p000;

import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: brof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brof implements brpv {

    /* renamed from: a */
    final /* synthetic */ brpv f143064a;

    /* renamed from: b */
    final /* synthetic */ brog f143065b;

    public brof(brog brog, brpv brpv) {
        this.f143065b = brog;
        this.f143064a = brpv;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69749a(Object obj) {
        brrq brrq = (brrq) obj;
        if (!TextUtils.isEmpty(brrq.f143273e)) {
            Status status = new Status(17025);
            brpj brpj = this.f143065b.f143068c;
            PhoneAuthCredential phoneAuthCredential = new PhoneAuthCredential(null, null, false, brrq.f143276h, true, brrq.f143273e, null);
            try {
                brpp brpp = brpj.f143129c;
                Parcel bj = brpp.mo8529bj();
                dcl.m8165a(bj, status);
                dcl.m8165a(bj, phoneAuthCredential);
                brpp.mo8530c(12, bj);
            } catch (RemoteException e) {
                brpj.f143128b.mo25417e("RemoteException when sending failure result.", e, new Object[0]);
            }
        } else {
            this.f143065b.f143069d.m114351a(new GetTokenResponse(brrq.f143270b, brrq.f143269a, Long.valueOf(brrq.f143271c), "Bearer"), null, "phone", Boolean.valueOf(brrq.f143272d), null, this.f143065b.f143068c, this.f143064a);
        }
    }

    /* renamed from: a */
    public final void mo69750a(String str) {
        this.f143064a.mo69750a(str);
    }
}
