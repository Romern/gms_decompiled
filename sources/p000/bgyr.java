package p000;

import android.accounts.Account;

/* renamed from: bgyr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgyr {

    /* renamed from: a */
    public final Account f118093a;

    /* renamed from: b */
    public Long f118094b;

    /* renamed from: c */
    public boolean f118095c = false;

    /* renamed from: d */
    public boolean f118096d = false;

    /* renamed from: e */
    public boolean f118097e = false;

    /* renamed from: f */
    public boolean f118098f = false;

    /* renamed from: g */
    public Boolean f118099g;

    /* renamed from: h */
    public Boolean f118100h;

    /* renamed from: i */
    public final String f118101i;

    /* renamed from: j */
    public boolean f118102j = false;

    /* renamed from: k */
    public Long f118103k;

    /* renamed from: l */
    public Integer f118104l;

    /* renamed from: m */
    public Boolean f118105m;

    /* renamed from: n */
    public Boolean f118106n;

    /* renamed from: o */
    public boolean f118107o;

    /* renamed from: p */
    public Integer f118108p;

    /* renamed from: q */
    public String f118109q;

    /* renamed from: r */
    public boolean f118110r = false;

    public bgyr(Account account, String str) {
        sdo.checkIfNull(account, "null account");
        this.f118093a = account;
        this.f118101i = str;
    }

    /* renamed from: a */
    public final bgys mo63432a() {
        return new bgys(this);
    }

    /* renamed from: b */
    public final void mo63437b() {
        this.f118095c = true;
    }

    /* renamed from: c */
    public final void mo63438c() {
        this.f118107o = true;
        mo63436a(true);
        mo63437b();
    }

    /* renamed from: d */
    public final void mo63439d() {
        this.f118110r = true;
        mo63436a(true);
        mo63437b();
    }

    /* renamed from: e */
    public final void mo63440e() {
        this.f118096d = true;
        mo63436a(true);
        mo63437b();
    }

    /* renamed from: a */
    public final void mo63433a(int i) {
        this.f118104l = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo63434a(long j) {
        this.f118094b = Long.valueOf(j);
    }

    /* renamed from: a */
    public final void mo63435a(bgwb bgwb) {
        this.f118099g = bgwb.f117794b;
        this.f118100h = bgwb.f117796d;
        this.f118103k = bgwb.f117793a;
        mo63433a(bgwb.f117798f);
        Boolean bool = bgwb.f117801i;
        this.f118106n = null;
        this.f118108p = Integer.valueOf(bgwb.f117802j);
    }

    /* renamed from: a */
    public final void mo63436a(boolean z) {
        this.f118105m = Boolean.valueOf(z);
    }
}
