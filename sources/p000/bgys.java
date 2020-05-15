package p000;

import android.accounts.Account;
import java.util.Arrays;

/* renamed from: bgys */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgys {

    /* renamed from: a */
    public final Account f118111a;

    /* renamed from: b */
    public final Long f118112b;

    /* renamed from: c */
    public boolean f118113c;

    /* renamed from: d */
    public final boolean f118114d;

    /* renamed from: e */
    public final boolean f118115e = false;

    /* renamed from: f */
    public boolean f118116f;

    /* renamed from: g */
    public final boolean f118117g;

    /* renamed from: h */
    public Boolean f118118h;

    /* renamed from: i */
    public final Boolean f118119i;

    /* renamed from: j */
    public final String f118120j;

    /* renamed from: k */
    public final boolean f118121k;

    /* renamed from: l */
    public final Long f118122l;

    /* renamed from: m */
    public final Integer f118123m;

    /* renamed from: n */
    public Boolean f118124n;

    /* renamed from: o */
    public final boolean f118125o;

    /* renamed from: p */
    public final Boolean f118126p;

    /* renamed from: q */
    public final Integer f118127q;

    /* renamed from: r */
    public final String f118128r;

    /* renamed from: s */
    public final boolean f118129s;

    public bgys(bgyr bgyr) {
        Account account = bgyr.f118093a;
        sdo.m34966a(account, "account");
        this.f118111a = account;
        this.f118112b = bgyr.f118094b;
        this.f118113c = bgyr.f118095c;
        this.f118114d = bgyr.f118096d;
        this.f118116f = bgyr.f118097e;
        this.f118117g = bgyr.f118098f;
        this.f118118h = bgyr.f118099g;
        this.f118119i = bgyr.f118100h;
        this.f118120j = bgyr.f118101i;
        this.f118121k = bgyr.f118102j;
        this.f118122l = bgyr.f118103k;
        this.f118123m = bgyr.f118104l;
        this.f118124n = bgyr.f118105m;
        this.f118126p = bgyr.f118106n;
        this.f118127q = bgyr.f118108p;
        this.f118125o = bgyr.f118107o;
        this.f118128r = bgyr.f118109q;
        this.f118129s = bgyr.f118110r;
    }

    /* renamed from: a */
    public static bgyr m100417a(Account account, String str) {
        return new bgyr(account, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bgys) {
            bgys bgys = (bgys) obj;
            if (this.f118111a.equals(bgys.f118111a) && bxbl.m122538a(this.f118112b, bgys.f118112b) && this.f118113c == bgys.f118113c && this.f118114d == bgys.f118114d) {
                boolean z = bgys.f118115e;
                return this.f118116f == bgys.f118116f && this.f118117g == bgys.f118117g && bxbl.m122538a(this.f118118h, bgys.f118118h) && bxbl.m122538a(this.f118119i, bgys.f118119i) && bxbl.m122538a(this.f118120j, bgys.f118120j) && bxbl.m122538a(Boolean.valueOf(this.f118121k), Boolean.valueOf(bgys.f118121k)) && bxbl.m122538a(this.f118122l, bgys.f118122l) && bxbl.m122538a(this.f118123m, bgys.f118123m) && bxbl.m122538a(this.f118124n, bgys.f118124n) && bxbl.m122538a(this.f118126p, bgys.f118126p) && bxbl.m122538a(this.f118127q, bgys.f118127q) && bxbl.m122538a(Boolean.valueOf(this.f118125o), Boolean.valueOf(bgys.f118125o)) && this.f118129s == bgys.f118129s;
            }
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f118111a, this.f118112b, Boolean.valueOf(this.f118113c), Boolean.valueOf(this.f118114d), false, Boolean.valueOf(this.f118116f), Boolean.valueOf(this.f118117g), this.f118118h, this.f118119i, this.f118120j, Boolean.valueOf(this.f118121k), this.f118122l, this.f118123m, this.f118124n, this.f118126p, this.f118127q, Boolean.valueOf(this.f118125o), Boolean.valueOf(this.f118129s)});
    }

    public final String toString() {
        String a = aeqm.m52397a(this.f118111a);
        String valueOf = String.valueOf(this.f118112b);
        boolean z = this.f118113c;
        boolean z2 = this.f118114d;
        boolean z3 = this.f118116f;
        boolean z4 = this.f118117g;
        String valueOf2 = String.valueOf(this.f118118h);
        String valueOf3 = String.valueOf(this.f118119i);
        String str = this.f118120j;
        boolean z5 = this.f118121k;
        String valueOf4 = String.valueOf(this.f118122l);
        String valueOf5 = String.valueOf(this.f118123m);
        String valueOf6 = String.valueOf(this.f118124n);
        String valueOf7 = String.valueOf(this.f118126p);
        String valueOf8 = String.valueOf(this.f118127q);
        String str2 = this.f118128r;
        boolean z6 = this.f118129s;
        int length = String.valueOf(a).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(str).length();
        int length6 = String.valueOf(valueOf4).length();
        int length7 = String.valueOf(valueOf5).length();
        int length8 = String.valueOf(valueOf6).length();
        int length9 = String.valueOf(valueOf7).length();
        StringBuilder sb = new StringBuilder(length + 356 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + String.valueOf(valueOf8).length() + String.valueOf(str2).length());
        sb.append("ConfigUpdate{mAccount=");
        sb.append(a);
        sb.append(", mReferenceUpdateNumber=");
        sb.append(valueOf);
        sb.append(", mUnconditional=");
        sb.append(z);
        sb.append(", mUiUpdate=");
        sb.append(z2);
        sb.append(", mUlrRelatedSettingUpdate=false, mLhLrMergeSettingUpdate");
        sb.append(z3);
        sb.append(", mShouldNotSync=");
        sb.append(z4);
        sb.append(", mReportingEnabled=");
        sb.append(valueOf2);
        sb.append(", mHistoryEnabled=");
        sb.append(valueOf3);
        sb.append(", mCausePackage=");
        sb.append(str);
        sb.append(", mClearCausePackage=");
        sb.append(z5);
        sb.append(", mServerMillis=");
        sb.append(valueOf4);
        sb.append(", mRestriction=");
        sb.append(valueOf5);
        sb.append(", mDirty=");
        sb.append(valueOf6);
        sb.append(", mPrimaryDevice=");
        sb.append(valueOf7);
        sb.append(", mAccountType=");
        sb.append(valueOf8);
        sb.append(", mAuditToken=");
        sb.append(str2);
        sb.append(", isAuditable=");
        sb.append(z6);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo63441a() {
        this.f118116f = true;
        this.f118124n = true;
        this.f118113c = true;
    }

    /* renamed from: a */
    public final void mo63442a(boolean z) {
        this.f118118h = Boolean.valueOf(z);
    }
}
