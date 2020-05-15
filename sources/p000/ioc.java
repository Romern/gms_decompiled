package p000;

import android.accounts.Account;
import java.util.List;

/* renamed from: ioc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ioc extends inw {

    /* renamed from: a */
    final irs f21444a;

    /* renamed from: b */
    final /* synthetic */ int f21445b;

    /* renamed from: c */
    final /* synthetic */ String f21446c;

    /* renamed from: d */
    final /* synthetic */ Account f21447d;

    /* renamed from: e */
    final /* synthetic */ List f21448e;

    /* renamed from: a */
    public final void mo13162a(iqy iqy) {
        iqy.mo13276a(this.f21444a, this.f21445b, this.f21446c, this.f21447d, this.f21448e);
    }

    public ioc() {
        this.f21444a = new irs(this);
    }

    public ioc(String str, Account account, List list) {
        this.f21445b = 14;
        this.f21446c = str;
        this.f21447d = account;
        this.f21448e = list;
        this.f21444a = new irs(this);
    }
}
