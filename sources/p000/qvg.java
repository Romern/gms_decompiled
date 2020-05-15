package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import java.util.List;

/* renamed from: qvg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qvg extends qrz implements aaai {

    /* renamed from: a */
    private final aaag f42224a;

    /* renamed from: b */
    private final Account f42225b;

    /* renamed from: c */
    private final String f42226c;

    /* renamed from: d */
    private final Context f42227d;

    public qvg(Context context, aaag aaag, Account account, String str) {
        sdo.m34959a(aaag);
        this.f42224a = aaag;
        sdo.m34959a(account);
        this.f42225b = account;
        sdo.m34959a((Object) str);
        this.f42226c = str;
        sdo.m34959a(context);
        this.f42227d = context;
    }

    /* renamed from: a */
    public final void mo24234a(qrx qrx, int i, Bundle bundle) {
        this.f42224a.mo16658a(new qsr(qrx, this.f42225b, i, bundle));
    }

    /* renamed from: b */
    public final void mo24244b(qrx qrx, List list, Bundle bundle) {
        this.f42224a.mo16658a(new qsp(qrx, this.f42225b, list));
    }

    /* renamed from: a */
    public final void mo24235a(qrx qrx, Bundle bundle) {
        this.f42224a.mo16658a(new qsn(this.f42227d, qrx, this.f42225b));
    }

    /* renamed from: b */
    public final void mo24245b(rnt rnt, int i, Bundle bundle, Bundle bundle2) {
        this.f42224a.mo16658a(new qsj(rnt, this.f42225b, i, bundle));
    }

    /* renamed from: a */
    public final void mo24236a(qrx qrx, String str) {
        this.f42224a.mo16658a(new qso(qrx, this.f42225b, bngx.m109356a(str)));
    }

    /* renamed from: b */
    public final void mo24246b(rnt rnt, int i, String str, Bundle bundle) {
        this.f42224a.mo16658a(new qsv(rnt, this.f42226c, this.f42225b, i, str));
    }

    /* renamed from: a */
    public final void mo24237a(qrx qrx, List list, Bundle bundle) {
        this.f42224a.mo16658a(new qso(qrx, this.f42225b, list));
    }

    /* renamed from: a */
    public final void mo24238a(rnt rnt) {
        this.f42224a.mo16658a(new qsl(this.f42227d, rnt, this.f42225b));
    }

    /* renamed from: a */
    public final void mo24239a(rnt rnt, int i, Bundle bundle) {
        this.f42224a.mo16658a(new qss(rnt, this.f42225b, i));
    }

    /* renamed from: a */
    public final void mo24240a(rnt rnt, int i, Bundle bundle, Bundle bundle2) {
        this.f42224a.mo16658a(new qst(rnt, this.f42225b, i, bundle));
    }

    /* renamed from: a */
    public final void mo24241a(rnt rnt, int i, String str, Bundle bundle) {
        this.f42224a.mo16658a(new qsu(rnt, this.f42226c, this.f42225b, i, str));
    }

    /* renamed from: a */
    public final void mo24242a(rnt rnt, Bundle bundle) {
        this.f42224a.mo16658a(new qsw(rnt, this.f42225b, bundle));
    }

    /* renamed from: a */
    public final void mo24243a(rnt rnt, String str, Bundle bundle) {
        this.f42224a.mo16658a(new qsx(rnt, this.f42225b, str));
    }
}
