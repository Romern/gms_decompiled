package p000;

import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.UserMetadata;
import com.google.android.gms.drive.internal.model.Permission;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: ujx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ujx {

    /* renamed from: a */
    public final ukg f47825a;

    /* renamed from: b */
    public Map f47826b;

    /* renamed from: c */
    public ujp f47827c;

    /* renamed from: d */
    public final vea f47828d;

    /* renamed from: e */
    public final Executor f47829e;

    /* renamed from: f */
    private final uno f47830f;

    /* renamed from: g */
    private final uhu f47831g;

    public ujx(uno uno, vea vea, uhu uhu, Executor executor, ujp ujp, ukg ukg) {
        boolean z;
        this.f47830f = uno;
        this.f47828d = vea;
        this.f47831g = uhu;
        this.f47829e = executor;
        this.f47827c = ujp;
        this.f47825a = ukg;
        if (ukg.f47902ae == ujp.f48366m) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
    }

    /* renamed from: a */
    private final void m38714a(ukc ukc) {
        this.f47828d.mo27414a(ukc);
    }

    /* renamed from: ar */
    private final void m38716ar() {
        if (this.f47826b == null) {
            this.f47826b = uot.m39108a(this.f47828d.mo28337c());
        }
    }

    /* renamed from: c */
    private final Long m38717c(UserMetadata userMetadata) {
        if (userMetadata != null) {
            return Long.valueOf(this.f47831g.f47664a.mo27354a(userMetadata));
        }
        return null;
    }

    /* renamed from: A */
    public final boolean mo27523A() {
        return this.f47825a.f47876E;
    }

    /* renamed from: B */
    public final boolean mo27524B() {
        return this.f47825a.f47891T;
    }

    /* renamed from: C */
    public final Date mo27525C() {
        return this.f47825a.f47884M;
    }

    /* renamed from: D */
    public final Date mo27526D() {
        return this.f47825a.f47911c;
    }

    /* renamed from: E */
    public final Date mo27527E() {
        return this.f47825a.f47883L;
    }

    /* renamed from: F */
    public final Date mo27528F() {
        return this.f47825a.f47913e;
    }

    /* renamed from: G */
    public final Date mo27529G() {
        return this.f47825a.f47910b;
    }

    /* renamed from: H */
    public final String mo27530H() {
        return this.f47825a.f47889R;
    }

    /* renamed from: I */
    public final String mo27531I() {
        return this.f47825a.f47874C;
    }

    /* renamed from: J */
    public final boolean mo27532J() {
        return this.f47825a.f47916h != null;
    }

    /* renamed from: K */
    public final void mo27533K() {
        this.f47825a.mo27655c();
        ukg ukg = this.f47825a;
        if (ukg.f47916h == null) {
            ukg.f47876E = true;
        }
        mo27631o(false);
    }

    /* renamed from: L */
    public final void mo27534L() {
        if (this.f47825a.mo27656d()) {
            ukg ukg = this.f47825a;
            if (ukg.f47876E && ukg.f47916h == null) {
                return;
            }
        }
        if (!this.f47825a.mo27656d()) {
            this.f47825a.mo27655c();
        }
        ukg ukg2 = this.f47825a;
        ukg2.f47916h = null;
        ukg2.f47876E = true;
        mo27631o(true);
    }

    /* renamed from: M */
    public final void mo27535M() {
        ukg ukg = this.f47825a;
        ukg.f47914f = null;
        if (ukg.f47916h == null) {
            ukg.f47876E = false;
        }
    }

    /* renamed from: N */
    public final boolean mo27536N() {
        return !mo27523A() || !mo27537O() || mo27532J();
    }

    /* renamed from: O */
    public final boolean mo27537O() {
        return this.f47825a.mo27656d();
    }

    /* renamed from: P */
    public final String mo27538P() {
        return this.f47825a.f47887P;
    }

    /* renamed from: Q */
    public final boolean mo27539Q() {
        return this.f47825a.f47879H;
    }

    /* renamed from: R */
    public final boolean mo27540R() {
        return this.f47825a.f47878G;
    }

    /* renamed from: S */
    public final bngx mo27541S() {
        return this.f47825a.f47885N;
    }

    /* renamed from: T */
    public final String mo27542T() {
        return this.f47825a.f47922n;
    }

    /* renamed from: U */
    public final boolean mo27543U() {
        return this.f47825a.f47900ac;
    }

    /* renamed from: V */
    public final Long mo27544V() {
        return Long.valueOf(this.f47825a.f47905ah);
    }

    /* renamed from: W */
    public final boolean mo27545W() {
        return this.f47825a.f47893V;
    }

    /* renamed from: X */
    public final String mo27546X() {
        return this.f47825a.f47934z;
    }

    /* renamed from: Y */
    public final boolean mo27547Y() {
        return this.f47825a.f47901ad;
    }

    /* renamed from: Z */
    public final String mo27548Z() {
        return this.f47825a.f47888Q;
    }

    /* renamed from: a */
    public final void mo27553a(long j) {
        this.f47825a.f47903af = j;
    }

    /* renamed from: a */
    public final void mo27554a(bngx bngx) {
        this.f47825a.f47885N = bngx;
    }

    /* renamed from: a */
    public final void mo27559a(Date date) {
        this.f47825a.f47884M = date;
    }

    /* renamed from: a */
    public final void mo27562a(boolean z) {
        this.f47825a.f47891T = z;
    }

    /* renamed from: aa */
    public final uml mo27565aa() {
        return this.f47825a.f47886O;
    }

    /* renamed from: ab */
    public final boolean mo27566ab() {
        return this.f47827c.f47810b == null;
    }

    /* renamed from: ac */
    public final long mo27567ac() {
        return this.f47827c.f47809a;
    }

    /* renamed from: ad */
    public final boolean mo27568ad() {
        return this.f47825a.f47894W;
    }

    /* renamed from: ae */
    public final long mo27569ae() {
        return this.f47825a.f47882K;
    }

    /* renamed from: af */
    public final boolean mo27570af() {
        return this.f47825a.f47880I;
    }

    /* renamed from: ag */
    public final boolean mo27571ag() {
        return this.f47825a.f47877F;
    }

    /* renamed from: ah */
    public final ukt mo27572ah() {
        if (mo27571ag()) {
            return this.f47828d.mo28336a();
        }
        return null;
    }

    /* renamed from: ai */
    public final boolean mo27573ai() {
        return this.f47825a.mo27654b();
    }

    /* renamed from: aj */
    public final Set mo27574aj() {
        C1225nr nrVar = new C1225nr();
        if (this.f47825a.f47897Z) {
            nrVar.add(DriveSpace.f30734a);
        }
        if (this.f47825a.mo27654b()) {
            nrVar.add(DriveSpace.f30735b);
        }
        if (this.f47825a.f47898aa) {
            nrVar.add(DriveSpace.f30736c);
        }
        return nrVar;
    }

    /* renamed from: ak */
    public final List mo27575ak() {
        return this.f47828d.mo28338d();
    }

    /* renamed from: al */
    public final long mo27576al() {
        return this.f47825a.f47904ag;
    }

    /* renamed from: am */
    public final boolean mo27577am() {
        if (mo27633q() == null || (mo27632p() == null && !sdg.m34949a(mo27624l(), mo27630o()))) {
            return false;
        }
        return true;
    }

    /* renamed from: an */
    public final void mo27578an() {
        mo27629n(false);
    }

    /* renamed from: ao */
    public final void mo27579ao() {
        this.f47828d.mo27425b(this.f47825a);
    }

    /* renamed from: ap */
    public final void mo27580ap() {
        vea vea = this.f47828d;
        for (unc unc : vea.f49098a.mo27386d(vea.f49105b)) {
            this.f47828d.mo27425b(unc);
        }
    }

    /* renamed from: aq */
    public final void mo27581aq() {
        this.f47825a.f47909al = true;
    }

    /* renamed from: b */
    public final uif mo27582b() {
        return this.f47828d.f49105b;
    }

    /* renamed from: b */
    public final void mo27584b(Long l) {
        this.f47825a.f47917i = l;
    }

    /* renamed from: b */
    public final void mo27587b(Date date) {
        this.f47825a.f47911c = date;
    }

    /* renamed from: b */
    public final void mo27588b(boolean z) {
        this.f47825a.f47879H = z;
    }

    /* renamed from: c */
    public final void mo27590c(long j) {
        this.f47825a.f47905ah = j;
    }

    /* renamed from: c */
    public final void mo27591c(Long l) {
        this.f47825a.f47915g = l;
    }

    /* renamed from: c */
    public final void mo27592c(String str) {
        this.f47825a.f47925q = str;
    }

    /* renamed from: c */
    public final void mo27593c(String str, String str2) {
        ukg ukg = this.f47825a;
        ukg.f47906ai = str;
        ukg.f47929u = str2;
    }

    /* renamed from: c */
    public final void mo27594c(Date date) {
        this.f47825a.f47883L = date;
    }

    /* renamed from: c */
    public final void mo27595c(boolean z) {
        this.f47825a.f47878G = z;
    }

    /* renamed from: d */
    public final void mo27597d(String str) {
        this.f47825a.f47875D = str;
    }

    /* renamed from: d */
    public final void mo27599d(Date date) {
        this.f47825a.f47913e = date;
    }

    /* renamed from: d */
    public final void mo27600d(boolean z) {
        this.f47825a.f47900ac = z;
    }

    /* renamed from: e */
    public final void mo27602e(String str) {
        this.f47825a.f47932x = str;
    }

    /* renamed from: e */
    public final void mo27603e(Date date) {
        this.f47825a.f47910b = date;
    }

    /* renamed from: e */
    public final void mo27604e(boolean z) {
        this.f47825a.f47899ab = z;
    }

    /* renamed from: f */
    public final void mo27606f() {
        mo27627m(false);
    }

    /* renamed from: f */
    public final void mo27607f(String str) {
        this.f47825a.f47933y = str;
    }

    /* renamed from: f */
    public final void mo27608f(Date date) {
        this.f47825a.f47912d = date;
    }

    /* renamed from: f */
    public final void mo27609f(boolean z) {
        this.f47825a.f47901ad = z;
    }

    /* renamed from: g */
    public final DriveId mo27610g() {
        String str;
        String i = mo27616i();
        if (i == null || !i.startsWith("appdata")) {
            str = i;
        } else {
            str = null;
        }
        return new DriveId(str, this.f47825a.f47902ae, this.f47830f.mo27481g(), mo27640w() ? 1 : 0);
    }

    /* renamed from: g */
    public final void mo27612g(boolean z) {
        this.f47825a.f47894W = z;
    }

    /* renamed from: h */
    public final long mo27613h() {
        return this.f47825a.f47902ae;
    }

    /* renamed from: h */
    public final void mo27614h(String str) {
        this.f47825a.f47922n = str;
    }

    /* renamed from: h */
    public final void mo27615h(boolean z) {
        this.f47825a.f47880I = z;
    }

    /* renamed from: i */
    public final String mo27616i() {
        return this.f47827c.f47810b;
    }

    /* renamed from: i */
    public final void mo27617i(String str) {
        this.f47825a.f47931w = str;
    }

    /* renamed from: j */
    public final void mo27619j(String str) {
        this.f47825a.mo27653b(str);
    }

    /* renamed from: k */
    public final void mo27622k(boolean z) {
        this.f47825a.f47897Z = z;
    }

    /* renamed from: l */
    public final String mo27624l() {
        return this.f47825a.f47926r;
    }

    /* renamed from: l */
    public final void mo27625l(boolean z) {
        this.f47825a.f47898aa = z;
    }

    /* renamed from: m */
    public final void mo27626m() {
        ukg ukg = this.f47825a;
        ukg.f47927s = null;
        ukg.f47928t = null;
    }

    /* renamed from: n */
    public final String mo27628n() {
        return this.f47825a.f47927s;
    }

    /* renamed from: o */
    public final String mo27630o() {
        return this.f47825a.f47928t;
    }

    /* renamed from: p */
    public final Long mo27632p() {
        return this.f47825a.f47917i;
    }

    /* renamed from: q */
    public final String mo27633q() {
        return this.f47825a.f47906ai;
    }

    /* renamed from: r */
    public final String mo27634r() {
        return this.f47825a.f47929u;
    }

    /* renamed from: s */
    public final long mo27635s() {
        return this.f47825a.f47903af;
    }

    /* renamed from: t */
    public final Long mo27636t() {
        return this.f47825a.f47915g;
    }

    public final String toString() {
        return String.format(Locale.US, "Entry for %s", this.f47825a);
    }

    /* renamed from: u */
    public final String mo27638u() {
        return this.f47825a.f47925q;
    }

    /* renamed from: v */
    public final ung mo27639v() {
        return this.f47825a.f47890S;
    }

    /* renamed from: w */
    public final boolean mo27640w() {
        return this.f47825a.mo27657e();
    }

    /* renamed from: x */
    public final boolean mo27641x() {
        return this.f47825a.f48336ao;
    }

    /* renamed from: y */
    public final long mo27642y() {
        return this.f47825a.f47907aj;
    }

    /* renamed from: z */
    public final String mo27643z() {
        return this.f47825a.f47932x;
    }

    /* renamed from: a */
    private final void m38715a(boolean z, boolean z2) {
        this.f47828d.mo27410a(new ujv(this, z, z2));
    }

    /* renamed from: b */
    public final void mo27583b(UserMetadata userMetadata) {
        this.f47825a.f47918j = m38717c(userMetadata);
    }

    /* renamed from: d */
    public final void mo27598d(String str, String str2) {
        this.f47825a.mo27650a(str, str2);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: j */
    public final void mo27620j(boolean z) {
        sdo.m34971a(this.f47825a.f48336ao, (Object) "The entry must already be persisted");
        this.f47825a.f47877F = z;
    }

    /* renamed from: k */
    public final boolean mo27623k() {
        return "writer".equals(this.f47825a.f47888Q);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ujx.a(boolean, boolean):void
     arg types: [int, boolean]
     candidates:
      ujx.a(java.lang.String, boolean):java.util.List
      ujx.a(java.lang.String, java.lang.String):uot
      ujx.a(boolean, long):void
      ujx.a(boolean, boolean):void */
    /* renamed from: m */
    public final void mo27627m(boolean z) {
        m38715a(false, z);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ujx.a(boolean, boolean):void
     arg types: [int, boolean]
     candidates:
      ujx.a(java.lang.String, boolean):java.util.List
      ujx.a(java.lang.String, java.lang.String):uot
      ujx.a(boolean, long):void
      ujx.a(boolean, boolean):void */
    /* renamed from: n */
    public final void mo27629n(boolean z) {
        m38715a(true, z);
    }

    /* renamed from: o */
    public final void mo27631o(boolean z) {
        ukg ukg = this.f47825a;
        if (ukg.f47876E && ukg.mo27656d() && this.f47825a.f47916h == null) {
            this.f47828d.mo27410a(new ujw(this, z));
        }
    }

    /* renamed from: a */
    public final UserMetadata mo27549a(Long l) {
        unk unk;
        if (l != null) {
            unk = this.f47831g.f47664a.mo27371a(l.longValue());
        } else {
            unk = null;
        }
        if (unk != null) {
            return new UserMetadata(unk.f48318a, unk.f48319b, unk.f48320c, unk.f48321d, unk.f48322e);
        }
        return null;
    }

    /* renamed from: i */
    public final void mo27618i(boolean z) {
        if (!z) {
            ukg ukg = this.f47825a;
            ukg.f47880I = false;
            ukg.f47920l = Long.valueOf(System.currentTimeMillis());
            return;
        }
        ukg ukg2 = this.f47825a;
        if (ukg2.f47920l != null) {
            ukg2.f47920l = null;
            ukg2.f47880I = true;
        }
    }

    /* renamed from: j */
    public final boolean mo27621j() {
        return "owner".equals(this.f47825a.f47888Q);
    }

    /* renamed from: b */
    public final void mo27585b(String str) {
        sdo.m34959a((Object) str);
        sdo.m34970a(mo27566ab());
        this.f47827c.f47810b = str;
    }

    /* renamed from: e */
    public final boolean mo27605e() {
        if (this.f47825a.mo27657e() || this.f47825a.f47889R.startsWith("application/vnd.google-apps") || !mo27639v().mo27699b() || !this.f47825a.f47894W) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final void mo27611g(String str) {
        this.f47825a.mo27649a(str);
    }

    /* renamed from: b */
    public final void mo27586b(String str, String str2) {
        ukg ukg = this.f47825a;
        sdo.m34959a((Object) str);
        ukg.f47927s = str;
        ukg ukg2 = this.f47825a;
        sdo.m34959a((Object) str2);
        ukg2.f47928t = str2;
    }

    /* renamed from: d */
    public final boolean mo27601d() {
        ukg ukg = this.f47825a;
        String str = ukg.f47888Q;
        return !ukg.mo27654b() && (str == null || str.equals("owner"));
    }

    /* renamed from: a */
    public final List mo27550a(String str, boolean z) {
        boolean z2;
        m38716ar();
        ArrayList arrayList = new ArrayList();
        for (uot uot : this.f47826b.values()) {
            boolean z3 = false;
            if (str == null || uot.mo27786f() == null || sdg.m34949a(uot.mo27786f(), str)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z || uot.mo27785e() != null) {
                z3 = true;
            }
            if (z2 && z3) {
                arrayList.add(uot);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final boolean mo27589b(long j) {
        Long l = this.f47825a.f47916h;
        if (l == null || l.longValue() != j) {
            return false;
        }
        ukg ukg = this.f47825a;
        ukg.f47916h = null;
        ukg.f47876E = mo27537O();
        mo27631o(false);
        return true;
    }

    /* renamed from: a */
    public final ukk mo27551a() {
        long j = this.f47825a.f47902ae;
        if (j >= 0) {
            return ukk.m38862a(j);
        }
        return null;
    }

    /* renamed from: c */
    public final boolean mo27596c() {
        return this.f47828d.mo27382b();
    }

    /* renamed from: a */
    public final uot mo27552a(String str, String str2) {
        m38716ar();
        String a = uot.m39107a(str, str2);
        if (this.f47826b.containsKey(a)) {
            return (uot) this.f47826b.get(a);
        }
        vea vea = this.f47828d;
        uot a2 = vea.f49098a.mo27372a(vea.f49105b, str, str2);
        this.f47826b.put(a, a2);
        return a2;
    }

    /* renamed from: a */
    public final void mo27555a(UserMetadata userMetadata) {
        this.f47825a.f47919k = m38717c(userMetadata);
    }

    /* renamed from: a */
    public final void mo27556a(Permission permission) {
        int b;
        Permission permission2 = permission;
        uno uno = this.f47830f;
        long h = mo27613h();
        int i = ukc.f47841l;
        int a = vph.m41008a(permission);
        ukc ukc = null;
        if (!(a == -1 || (b = vph.m41013b(permission)) == -1)) {
            ukc = new ukc(uno, h, permission2.f31040e, vph.m41014c(permission), permission2.f31041f, b, permission2.f31042g, a, null, null, permission2.f31046k, null, null);
        }
        if (ukc != null) {
            m38714a(ukc);
        }
    }

    /* renamed from: a */
    public final void mo27557a(String str) {
        this.f47825a.f47887P = vpw.m41036a(str);
    }

    /* renamed from: a */
    public final void mo27558a(String str, int i, int i2, boolean z, long j) {
        boolean z2;
        if (i2 != -100) {
            z2 = true;
        } else {
            z2 = false;
        }
        sdo.m34970a(z2);
        uno uno = this.f47830f;
        long h = mo27613h();
        Long valueOf = Long.valueOf(j);
        m38714a(new ukc(uno, h, null, str, null, i, null, i2, -100L, valueOf, z, false, valueOf));
    }

    /* renamed from: a */
    public final void mo27560a(uml uml) {
        this.f47825a.mo27651a(uml);
    }

    /* renamed from: a */
    public final void mo27561a(ung ung) {
        this.f47825a.mo27652a(ung);
    }

    /* renamed from: a */
    public final void mo27563a(boolean z, long j) {
        ukg ukg = this.f47825a;
        ukg.f47876E = z;
        ukg.f47916h = Long.valueOf(j);
    }

    /* renamed from: a */
    public final boolean mo27564a(uey uey) {
        vea vea = this.f47828d;
        return vea.f49098a.mo27378a(uey, vea.f49105b);
    }
}
