package p000;

import android.accounts.Account;
import android.content.Context;
import java.util.concurrent.ExecutorService;

/* renamed from: hqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hqn implements hep {

    /* renamed from: a */
    public final hnw f20233a;

    /* renamed from: b */
    public final Account f20234b;

    /* renamed from: c */
    public final String f20235c;

    /* renamed from: d */
    public final String f20236d;

    /* renamed from: e */
    public final String f20237e;

    /* renamed from: f */
    private final bqgj f20238f = bqgs.m112811a((ExecutorService) snp.m35704b(9));

    public hqn(Context context, Account account, String str, String str2, String str3) {
        this.f20233a = hnw.m14663a(context);
        this.f20234b = account;
        this.f20235c = str;
        this.f20236d = str2;
        this.f20237e = str3;
    }

    /* renamed from: a */
    public final adbj mo12290a() {
        return adbj.AUTH_API_CREDENTIALS_REQUEST_ID_TOKEN;
    }

    /* renamed from: a */
    public final bqgg mo12291a(hez hez) {
        return this.f20238f.mo25819b(new hqm(this));
    }
}
