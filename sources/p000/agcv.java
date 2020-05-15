package p000;

import android.text.TextUtils;
import java.util.List;

/* renamed from: agcv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agcv {

    /* renamed from: A */
    private boolean f65234A;

    /* renamed from: B */
    private boolean f65235B;

    /* renamed from: C */
    private String f65236C;

    /* renamed from: D */
    private long f65237D;

    /* renamed from: E */
    private long f65238E;

    /* renamed from: F */
    private long f65239F;

    /* renamed from: a */
    public final agje f65240a;

    /* renamed from: b */
    public Boolean f65241b;

    /* renamed from: c */
    public List f65242c;

    /* renamed from: d */
    public long f65243d;

    /* renamed from: e */
    public long f65244e;

    /* renamed from: f */
    public long f65245f;

    /* renamed from: g */
    public long f65246g;

    /* renamed from: h */
    public long f65247h;

    /* renamed from: i */
    public long f65248i;

    /* renamed from: j */
    public String f65249j;

    /* renamed from: k */
    public boolean f65250k;

    /* renamed from: l */
    private final String f65251l;

    /* renamed from: m */
    private String f65252m;

    /* renamed from: n */
    private String f65253n;

    /* renamed from: o */
    private String f65254o;

    /* renamed from: p */
    private String f65255p;

    /* renamed from: q */
    private long f65256q;

    /* renamed from: r */
    private long f65257r;

    /* renamed from: s */
    private long f65258s;

    /* renamed from: t */
    private String f65259t;

    /* renamed from: u */
    private long f65260u;

    /* renamed from: v */
    private String f65261v;

    /* renamed from: w */
    private long f65262w;

    /* renamed from: x */
    private long f65263x;

    /* renamed from: y */
    private boolean f65264y;

    /* renamed from: z */
    private long f65265z;

    public agcv(agje agje, String str) {
        sdo.m34959a(agje);
        sdo.m34977c(str);
        this.f65240a = agje;
        this.f65251l = str;
        agje.mo35512p();
    }

    /* renamed from: a */
    public final String mo35248a() {
        this.f65240a.mo35512p();
        return this.f65251l;
    }

    /* renamed from: b */
    public final String mo35252b() {
        this.f65240a.mo35512p();
        return this.f65252m;
    }

    /* renamed from: c */
    public final String mo35256c() {
        this.f65240a.mo35512p();
        return this.f65253n;
    }

    /* renamed from: d */
    public final String mo35260d() {
        this.f65240a.mo35512p();
        return this.f65236C;
    }

    /* renamed from: e */
    public final String mo35263e() {
        this.f65240a.mo35512p();
        return this.f65254o;
    }

    /* renamed from: f */
    public final String mo35266f() {
        this.f65240a.mo35512p();
        return this.f65255p;
    }

    /* renamed from: g */
    public final long mo35269g() {
        this.f65240a.mo35512p();
        return this.f65257r;
    }

    /* renamed from: h */
    public final long mo35272h() {
        this.f65240a.mo35512p();
        return this.f65258s;
    }

    /* renamed from: i */
    public final String mo35275i() {
        this.f65240a.mo35512p();
        return this.f65259t;
    }

    /* renamed from: j */
    public final long mo35277j() {
        this.f65240a.mo35512p();
        return this.f65260u;
    }

    /* renamed from: k */
    public final String mo35279k() {
        this.f65240a.mo35512p();
        return this.f65261v;
    }

    /* renamed from: l */
    public final long mo35280l() {
        this.f65240a.mo35512p();
        return this.f65262w;
    }

    /* renamed from: m */
    public final long mo35281m() {
        this.f65240a.mo35512p();
        return this.f65263x;
    }

    /* renamed from: n */
    public final long mo35282n() {
        this.f65240a.mo35512p();
        return this.f65237D;
    }

    /* renamed from: o */
    public final boolean mo35283o() {
        this.f65240a.mo35512p();
        return this.f65264y;
    }

    /* renamed from: p */
    public final long mo35284p() {
        this.f65240a.mo35512p();
        return this.f65256q;
    }

    /* renamed from: q */
    public final long mo35285q() {
        this.f65240a.mo35512p();
        return this.f65238E;
    }

    /* renamed from: r */
    public final long mo35286r() {
        this.f65240a.mo35512p();
        return this.f65239F;
    }

    /* renamed from: s */
    public final void mo35287s() {
        this.f65240a.mo35512p();
        long j = this.f65256q + 1;
        if (j > 2147483647L) {
            this.f65240a.mo35497E().f65567f.mo35436a("Bundle index overflow. appId", agid.m54288a(this.f65251l));
            j = 0;
        }
        this.f65250k = true;
        this.f65256q = j;
    }

    /* renamed from: t */
    public final String mo35288t() {
        this.f65240a.mo35512p();
        return this.f65249j;
    }

    /* renamed from: u */
    public final long mo35289u() {
        this.f65240a.mo35512p();
        return this.f65265z;
    }

    /* renamed from: v */
    public final boolean mo35290v() {
        this.f65240a.mo35512p();
        return this.f65234A;
    }

    /* renamed from: w */
    public final boolean mo35291w() {
        this.f65240a.mo35512p();
        return this.f65235B;
    }

    /* renamed from: x */
    public final Boolean mo35292x() {
        this.f65240a.mo35512p();
        return this.f65241b;
    }

    /* renamed from: y */
    public final List mo35293y() {
        this.f65240a.mo35512p();
        return this.f65242c;
    }

    /* renamed from: a */
    public final void mo35249a(long j) {
        this.f65240a.mo35512p();
        this.f65250k |= this.f65257r != j;
        this.f65257r = j;
    }

    /* renamed from: b */
    public final void mo35253b(long j) {
        this.f65240a.mo35512p();
        this.f65250k |= this.f65258s != j;
        this.f65258s = j;
    }

    /* renamed from: c */
    public final void mo35257c(long j) {
        this.f65240a.mo35512p();
        this.f65250k |= this.f65260u != j;
        this.f65260u = j;
    }

    /* renamed from: d */
    public final void mo35261d(long j) {
        this.f65240a.mo35512p();
        this.f65250k |= this.f65262w != j;
        this.f65262w = j;
    }

    /* renamed from: e */
    public final void mo35264e(long j) {
        this.f65240a.mo35512p();
        this.f65250k |= this.f65263x != j;
        this.f65263x = j;
    }

    /* renamed from: f */
    public final void mo35267f(long j) {
        this.f65240a.mo35512p();
        this.f65250k |= this.f65237D != j;
        this.f65237D = j;
    }

    /* renamed from: g */
    public final void mo35270g(long j) {
        boolean z = true;
        sdo.m34974b(j >= 0);
        this.f65240a.mo35512p();
        boolean z2 = this.f65250k;
        if (this.f65256q == j) {
            z = false;
        }
        this.f65250k = z | z2;
        this.f65256q = j;
    }

    /* renamed from: h */
    public final void mo35273h(long j) {
        this.f65240a.mo35512p();
        this.f65250k |= this.f65238E != j;
        this.f65238E = j;
    }

    /* renamed from: i */
    public final void mo35276i(long j) {
        this.f65240a.mo35512p();
        this.f65250k |= this.f65239F != j;
        this.f65239F = j;
    }

    /* renamed from: j */
    public final void mo35278j(long j) {
        this.f65240a.mo35512p();
        this.f65250k |= this.f65265z != j;
        this.f65265z = j;
    }

    /* renamed from: a */
    public final void mo35250a(String str) {
        this.f65240a.mo35512p();
        this.f65250k |= !agms.m54594b(this.f65252m, str);
        this.f65252m = str;
    }

    /* renamed from: b */
    public final void mo35254b(String str) {
        this.f65240a.mo35512p();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f65250k |= !agms.m54594b(this.f65253n, str);
        this.f65253n = str;
    }

    /* renamed from: c */
    public final void mo35258c(String str) {
        this.f65240a.mo35512p();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f65250k |= !agms.m54594b(this.f65236C, str);
        this.f65236C = str;
    }

    /* renamed from: d */
    public final void mo35262d(String str) {
        this.f65240a.mo35512p();
        this.f65250k |= !agms.m54594b(this.f65254o, str);
        this.f65254o = str;
    }

    /* renamed from: e */
    public final void mo35265e(String str) {
        this.f65240a.mo35512p();
        this.f65250k |= !agms.m54594b(this.f65255p, str);
        this.f65255p = str;
    }

    /* renamed from: f */
    public final void mo35268f(String str) {
        this.f65240a.mo35512p();
        this.f65250k |= !agms.m54594b(this.f65259t, str);
        this.f65259t = str;
    }

    /* renamed from: g */
    public final void mo35271g(String str) {
        this.f65240a.mo35512p();
        this.f65250k |= !agms.m54594b(this.f65261v, str);
        this.f65261v = str;
    }

    /* renamed from: h */
    public final void mo35274h(String str) {
        this.f65240a.mo35512p();
        this.f65250k |= !agms.m54594b(this.f65249j, str);
        this.f65249j = str;
    }

    /* renamed from: a */
    public final void mo35251a(boolean z) {
        this.f65240a.mo35512p();
        this.f65250k |= this.f65264y != z;
        this.f65264y = z;
    }

    /* renamed from: b */
    public final void mo35255b(boolean z) {
        this.f65240a.mo35512p();
        this.f65250k |= this.f65234A != z;
        this.f65234A = z;
    }

    /* renamed from: c */
    public final void mo35259c(boolean z) {
        this.f65240a.mo35512p();
        this.f65250k |= this.f65235B != z;
        this.f65235B = z;
    }
}
