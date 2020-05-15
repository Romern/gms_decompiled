package p000;

import android.accounts.Account;
import com.google.android.location.reporting.state.update.AccountConfig;
import com.google.android.location.reporting.state.update.Conditions;

/* renamed from: bgyk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgyk {

    /* renamed from: a */
    public final Account f118062a;

    /* renamed from: b */
    public Long f118063b;

    /* renamed from: c */
    public Boolean f118064c;

    /* renamed from: d */
    public Boolean f118065d;

    /* renamed from: e */
    public Boolean f118066e;

    /* renamed from: f */
    public Boolean f118067f;

    /* renamed from: g */
    public Long f118068g;

    /* renamed from: h */
    public Integer f118069h;

    /* renamed from: i */
    public Boolean f118070i;

    /* renamed from: j */
    public String f118071j;

    /* renamed from: k */
    public Boolean f118072k;

    /* renamed from: l */
    public String f118073l;

    /* renamed from: m */
    public Conditions f118074m;

    /* renamed from: n */
    public Integer f118075n;

    /* renamed from: o */
    public String f118076o;

    /* renamed from: p */
    public Long f118077p;

    /* renamed from: q */
    public Long f118078q;

    /* renamed from: r */
    public Boolean f118079r;

    /* renamed from: s */
    public Integer f118080s;

    public bgyk(Account account) {
        sdo.checkIfNull(account, "null account");
        this.f118062a = account;
    }

    /* renamed from: a */
    public final AccountConfig mo63421a() {
        return new AccountConfig(this);
    }

    /* renamed from: a */
    public final void mo63422a(int i) {
        this.f118075n = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo63423a(boolean z) {
        this.f118067f = Boolean.valueOf(z);
    }
}
