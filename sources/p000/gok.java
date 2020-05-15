package p000;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.GetAccountsRequest;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;
import com.google.android.gms.common.api.Status;

/* renamed from: gok */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gok extends gpi implements aaai {

    /* renamed from: a */
    private final aaag f18769a;

    /* renamed from: b */
    private final imk f18770b;

    /* renamed from: c */
    private final imk f18771c;

    /* renamed from: d */
    private final rfz f18772d;

    /* renamed from: e */
    private final ily f18773e;

    /* renamed from: f */
    private final gsg f18774f;

    /* renamed from: g */
    private final svq f18775g;

    /* renamed from: h */
    private final ilo f18776h;

    /* renamed from: i */
    private final gko f18777i;

    public gok(aaag aaag, imk imk, imk imk2, rfz rfz, ily ily, gsg gsg, svq svq, ilo ilo, gko gko) {
        this.f18769a = aaag;
        this.f18770b = imk;
        this.f18771c = imk2;
        this.f18772d = rfz;
        this.f18773e = ily;
        this.f18774f = gsg;
        this.f18775g = svq;
        this.f18776h = ilo;
        this.f18777i = gko;
    }

    /* renamed from: a */
    public final void mo12106a(goo goo, Account account) {
        int callingUid = Binder.getCallingUid();
        if (this.f18773e.mo13133b(callingUid) || this.f18772d.mo24608b(callingUid)) {
            this.f18769a.mo16658a(new gqz(goo, account));
        } else {
            goo.mo12112a(Status.f30111e, (Bundle) null);
        }
    }

    /* renamed from: a */
    public final void mo12107a(goo goo, String str) {
        int callingUid = Binder.getCallingUid();
        String[] a = this.f18775g.mo26175a(callingUid);
        if (a != null) {
            int length = a.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (a[i].equals(str)) {
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
        }
        goo.mo12112a(new Status(10), gsh.m13824a());
        this.f18769a.mo16658a(new gra(goo, this.f18774f, this.f18772d.mo24608b(callingUid), str));
    }

    /* renamed from: a */
    public final void mo12108a(gos gos, AccountChangeEventsRequest accountChangeEventsRequest) {
        this.f18769a.mo16658a(new gqp(gos, this.f18770b, accountChangeEventsRequest));
    }

    /* renamed from: a */
    public final void mo12109a(gox gox, GetAccountsRequest getAccountsRequest) {
        if (this.f18772d.mo24608b(Binder.getCallingUid())) {
            this.f18769a.mo16658a(new gqt(gox, getAccountsRequest));
        } else {
            gox.mo12117a(Status.f30111e, null);
        }
    }

    /* renamed from: a */
    public final void mo12110a(gpg gpg, Account account, String str, Bundle bundle) {
        int callingUid = Binder.getCallingUid();
        this.f18769a.mo16658a(new gqy(gpg, this.f18770b, account, str, bundle, this.f18776h, this.f18775g, this.f18777i, callingUid, this.f18772d.mo24608b(callingUid)));
    }

    /* renamed from: a */
    public final void mo12111a(rnt rnt, ClearTokenRequest clearTokenRequest) {
        this.f18769a.mo16658a(new gqn(rnt, clearTokenRequest));
    }
}
