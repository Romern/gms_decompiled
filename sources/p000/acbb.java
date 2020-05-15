package p000;

import android.accounts.Account;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.Executor;

/* renamed from: acbb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acbb implements bdqz {

    /* renamed from: a */
    public final Account f59413a;

    /* renamed from: b */
    public final adym f59414b;

    /* renamed from: c */
    private final int f59415c;

    /* renamed from: d */
    private final String f59416d;

    /* renamed from: e */
    private final Executor f59417e;

    public acbb(Account account, adym adym, int i, String str, Executor executor) {
        this.f59413a = account;
        this.f59414b = adym;
        this.f59415c = i;
        this.f59416d = str;
        this.f59417e = executor;
    }

    /* renamed from: a */
    private final bqgg m48801a(bqgg bqgg) {
        return bqdf.m112620a(bqgg, gid.class, acay.f59408a, this.f59417e);
    }

    public final void close() {
        this.f59414b.f62911a.mo25561g();
    }

    /* renamed from: a */
    public final bqgg mo32599a(bxpg bxpg) {
        return m48801a(bqga.m112778a(new acba(this, bxpg), this.f59417e));
    }

    /* renamed from: a */
    public final bqgg mo32600a(bxqj bxqj) {
        return m48801a(bqga.m112778a(new acaz(this, bxqj), this.f59417e));
    }

    /* renamed from: a */
    public final ClientContext mo32601a(Account account) {
        ClientContext clientContext = new ClientContext();
        clientContext.f30212b = this.f59415c;
        clientContext.f30213c = account;
        String str = this.f59416d;
        clientContext.f30215e = str;
        clientContext.f30216f = str;
        clientContext.mo17806d("https://www.googleapis.com/auth/webhistory");
        return clientContext;
    }
}
