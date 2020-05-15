package p000;

import android.database.Cursor;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.QueryResultEventParcelable;
import com.google.android.gms.drive.internal.OnEventResponse;
import com.google.android.gms.drive.query.Query;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: uqm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uqm extends uqi {

    /* renamed from: c */
    private final String f48545c;

    /* renamed from: d */
    private Set f48546d;

    /* renamed from: e */
    private boolean f48547e = false;

    /* renamed from: f */
    private final Query f48548f;

    /* renamed from: g */
    private final vcz f48549g;

    /* renamed from: h */
    private final ubi f48550h;

    public uqm(utr utr, Query query, String str, ubi ubi, Set set, vcz vcz) {
        super(3, utr);
        sdo.m34959a((Object) str);
        this.f48545c = str;
        sdo.m34959a(query);
        this.f48548f = query;
        this.f48550h = ubi;
        this.f48546d = set;
        this.f48549g = vcz;
    }

    /* renamed from: a */
    public static Set m39249a(vpe vpe) {
        HashSet hashSet = new HashSet();
        if (vpe != null) {
            Iterator it = new txb(vpe.f49703a).iterator();
            while (it.hasNext()) {
                hashSet.add(((twz) it.next()).mo26854a());
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public static uqi m39250a(utr utr) {
        return new uqi(3, utr);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: uqm.a(boolean, boolean):void
     arg types: [boolean, int]
     candidates:
      uqm.a(java.lang.String, boolean):void
      uqm.a(boolean, boolean):void */
    /* renamed from: a */
    public final void mo27877a(String str, boolean z) {
        if (this.f48545c.equals(str)) {
            mo27878a(!z, true);
        }
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:2:0x0005 */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:4:0x001d */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: vpe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: vpe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: vpe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: vpe} */
    /* JADX WARN: Type inference failed for: r11v5, assign insn: PHI: (r11v5 ?) = (r11v0 boolean), (r11v9 ?) binds: [B:2:0x0005, B:4:0x001d] */
    /* JADX WARN: Type inference failed for: r11v9, types: [vpe], assign insn: 0x0019: INVOKE  (r11v9 ? I:vpe) = 
      (r4v6 ubk)
      (r5v6 com.google.android.gms.drive.query.Query)
      (r6v3 java.lang.String)
      (r11v8 java.util.Set)
      (r3v8 java.util.List)
     type: VIRTUAL call: ubk.a(com.google.android.gms.drive.query.Query, java.lang.String, java.util.Set, java.util.List):vpe */
    /* JADX WARNING: Incorrect type for immutable var: ssa=boolean, code=vpe, for r11v0, types: [boolean], assign insn: null */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo27878a(vpe vpe, boolean z) {
        QueryResultEventParcelable queryResultEventParcelable;
        DataHolder dataHolder;
        Integer num;
        boolean z2 = true;
        vpe vpe2 = null;
        if (vpe != 0) {
            try {
                ubi ubi = this.f48550h;
                vpe = ubi.f47134e.mo27079a(ubi.f47131b, ubi.f47132c, ubi.f47133d, ubi.f47134e.f47157r.mo27226a(ubi.f47130a));
                this.f48546d = m39249a((vpe) vpe);
            } catch (Throwable th) {
                th = th;
                queryResultEventParcelable = null;
                z2 = false;
                vpe = vpe;
                vpe2 = vpe;
                vpe2.mo28719a();
                throw th;
            }
        } else {
            vpe = null;
        }
        boolean z3 = this.f48547e;
        boolean z4 = z3 ? false : z;
        boolean z5 = z | z3;
        this.f48547e = z5;
        if (vpe != null) {
            dataHolder = vpe.f49703a;
        } else {
            dataHolder = null;
        }
        queryResultEventParcelable = new QueryResultEventParcelable(dataHolder, z4, z5);
        try {
            this.f48535b.mo27248a(new OnEventResponse(queryResultEventParcelable));
            if (vpe != null) {
                try {
                    num = Integer.valueOf(vpe.f49703a.f30168h);
                } catch (Throwable th2) {
                    th = th2;
                    vpe2 = vpe;
                    if (vpe2 != null && (!z2 || (queryResultEventParcelable != null && queryResultEventParcelable.f30754a))) {
                        vpe2.mo28719a();
                    }
                    throw th;
                }
            } else {
                num = null;
            }
            vdk d = ((vdd) this.f48549g).mo28316d();
            d.mo28300c(2, 35);
            d.mo28283a(this.f48548f, true, num, Boolean.valueOf(z4), Integer.valueOf(z5));
            d.mo28299c(0);
            d.mo28309j();
            d.mo28274a();
            if (vpe != null && queryResultEventParcelable.f30754a) {
                vpe.mo28719a();
            }
        } catch (Throwable th3) {
            th = th3;
            vpe2 = vpe;
            z2 = false;
            vpe2.mo28719a();
            throw th;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: uqm.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      uqm.a(java.lang.String, boolean):void
      uqm.a(boolean, boolean):void */
    /* renamed from: a */
    public final boolean mo27879a(Set set) {
        if (!Collections.disjoint(this.f48546d, set)) {
            mo27878a(true, false);
            return true;
        }
        ubi ubi = this.f48550h;
        uog a = new vft(ubi.f47134e.f47143d, ubi.f47134e.f47157r.mo27226a(ubi.f47130a)).mo28404a(ubi.f47131b);
        ubk ubk = ubi.f47134e;
        uhn uhn = ubk.f47144e;
        uey uey = ubk.f47143d;
        if (!set.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((DriveId) it.next()).f30729b));
            }
            uog a2 = uoh.m39066a(a, voz.m40970a(uey), voz.m40967a(ujs.f47815a.f48341a.mo27700a(), arrayList), ukm.SUBSCRIBED.f48022aB.mo27719f());
            String d = ugz.m38427d(uey);
            String str = a2.f48389a;
            StringBuilder sb = new StringBuilder(d.length() + 29 + String.valueOf(str).length());
            sb.append("SELECT 1 FROM ");
            sb.append(d);
            sb.append(" WHERE ");
            sb.append(str);
            sb.append(" LIMIT 1");
            Cursor a3 = ((ugx) uhn).f47578a.mo27467a(sb.toString(), a2.mo27762a());
            try {
                if (a3.moveToFirst()) {
                    mo27878a(true, false);
                    return true;
                }
            } finally {
                a3.close();
            }
        }
        return false;
    }
}
