package p000;

import android.content.Context;
import android.content.SyncResult;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.Permission;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.auth.CallingAppInfo;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.query.Query;
import com.google.android.gms.drive.query.SortOrder;
import com.google.android.gms.drive.query.internal.FieldWithSortOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: ubk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ubk {

    /* renamed from: a */
    public static final sbw f47137a = new sbw("DataServiceConnection", "");

    /* renamed from: b */
    public static final bnic f47138b = bnic.m109493a(uzm.f48740P, uzp.f48770b, uzm.f48748g, uzm.f48737M, uzm.f48762u);

    /* renamed from: v */
    private static final Set f47139v = bnic.m109491a("com.google.android.gms", "com.google.android.gms.drive.sample.texteditor", "com.google.android.gms.apitest.drive");

    /* renamed from: A */
    private Boolean f47140A;

    /* renamed from: B */
    private final ubg f47141B = new ubg(this);

    /* renamed from: c */
    public final vpu f47142c;

    /* renamed from: d */
    public final uey f47143d;

    /* renamed from: e */
    public final uhn f47144e;

    /* renamed from: f */
    public final ufu f47145f;

    /* renamed from: g */
    public final uaj f47146g;

    /* renamed from: h */
    public final vbt f47147h;

    /* renamed from: i */
    public final uvw f47148i;

    /* renamed from: j */
    public final uhj f47149j;

    /* renamed from: k */
    public final int f47150k;

    /* renamed from: l */
    public final uoz f47151l;

    /* renamed from: m */
    public final uqu f47152m;

    /* renamed from: n */
    public final vfp f47153n;

    /* renamed from: o */
    public final ufe f47154o;

    /* renamed from: p */
    public final val f47155p;

    /* renamed from: q */
    public final vcz f47156q;

    /* renamed from: r */
    public final uby f47157r;

    /* renamed from: s */
    public final uet f47158s;

    /* renamed from: t */
    public final List f47159t = new ArrayList();

    /* renamed from: u */
    public volatile boolean f47160u;

    /* renamed from: w */
    private final uex f47161w;

    /* renamed from: x */
    private final ClientContext f47162x;

    /* renamed from: y */
    private final Context f47163y;

    /* renamed from: z */
    private final DriveId f47164z;

    public ubk(ClientContext clientContext, int i, int i2, vpu vpu) {
        this.f47150k = i;
        this.f47162x = clientContext;
        this.f47142c = vpu;
        this.f47146g = vpu.f49759f;
        this.f47149j = vpu.f49756c;
        this.f47144e = vpu.f49757d;
        this.f47163y = vpu.f49755b;
        this.f47161w = vpu.f49770q;
        this.f47147h = vpu.f49779z;
        this.f47148i = new uvw(vpu);
        this.f47145f = vpu.f49767n;
        this.f47152m = vpu.f49765l;
        this.f47153n = vpu.f49768o;
        this.f47154o = vpu.f49769p;
        uev a = this.f47161w.mo27260a(clientContext);
        if (a.f47378a.f47377f) {
            this.f47143d = a.f47379b;
            this.f47158s = a.f47381d;
            this.f47155p = new val(vpu, this.f47143d);
            this.f47164z = this.f47144e.mo27433d(this.f47143d.f47394a, this.f47163y.getString(C0126R.string.drive_view_my_drive)).mo27610g();
            vdm vdm = vpu.f49749H;
            CallingAppInfo callingAppInfo = new CallingAppInfo(this.f47143d, i2);
            String str = this.f47143d.f47394a.f47682a;
            sdo.m34959a((Object) str);
            vdd vdd = new vdd(callingAppInfo, str, i, vdm.f49083a, vdm.f49084b);
            this.f47156q = vdd;
            vdd.mo28310a();
            uqh uqh = vpu.f49746E;
            this.f47151l = cdqs.f181577a.mo78193b().mo78194a() ? new upl(this.f47156q, uqh) : new upf(this.f47156q, uqh);
            this.f47157r = new uby(this.f47142c, this.f47143d, this.f47141B);
            if (vav.m39898a()) {
                this.f47151l.mo27820a(new vau(vav.m39900c(), this.f47143d.f47394a.f47682a));
            }
            this.f47160u = true;
            return;
        }
        throw a.f47380c;
    }

    /* renamed from: a */
    private final void m37916a(String str) {
        if (str != null) {
            try {
                this.f47147h.mo28207a(this.f47143d, str, vks.f49399a);
            } catch (VolleyError e) {
                throw new aaaj(7, "Failed to retrieve item from network.");
            } catch (gid e2) {
                throw mo27106n();
            }
        } else {
            throw new aaaj(1502, "Provided resourceId is invalid.");
        }
    }

    /* renamed from: b */
    private final ujx m37917b(uey uey, DriveId driveId) {
        ujx a = mo27078a(uey, driveId);
        if (a != null) {
            return a;
        }
        String i = m37919i(driveId);
        m37916a(i);
        try {
            ujx a2 = this.f47144e.mo27401a(uey, i);
            if (!a2.mo27523A()) {
                return a2;
            }
            throw m37920m();
        } catch (uaa e) {
            throw m37920m();
        }
    }

    /* renamed from: c */
    private final ujx m37918c(uey uey, DriveId driveId) {
        try {
            ujx a = this.f47144e.mo27400a(uey, driveId);
            if (a.mo27536N()) {
                return a;
            }
            return null;
        } catch (uaa e) {
            return null;
        } catch (urd e2) {
            throw new aaaj(1502, "Provided DriveId is invalid.");
        }
    }

    /* renamed from: i */
    private final String m37919i(DriveId driveId) {
        String str = driveId.f30728a;
        return str == null ? this.f47144e.mo27389a(this.f47143d.f47394a, driveId) : str;
    }

    /* renamed from: m */
    public static aaaj m37920m() {
        return new aaaj(1502, "Drive item not found, or you are not authorized to access it.");
    }

    /* renamed from: o */
    private final String m37921o() {
        return this.f47162x.f30215e;
    }

    /* renamed from: d */
    public final ujx mo27092d(DriveId driveId) {
        return m37918c(this.f47143d, driveId);
    }

    /* renamed from: e */
    public final DriveId mo27094e(DriveId driveId) {
        aaal.m21020a(driveId, "Invalid parent folder.");
        try {
            ujx b = m37917b(uey.m38255a(this.f47143d.f47394a), driveId);
            if (!b.mo27640w()) {
                throw new aaaj(10, "Invalid parent folder.");
            } else if (b.mo27524B()) {
                if (b.mo27574aj().contains(DriveSpace.f30735b)) {
                    if (!this.f47143d.f47398e.contains(twt.f46773b)) {
                        throw new aaaj(1511, "Insufficient scope for parent folder.");
                    }
                } else if (!b.mo27574aj().contains(DriveSpace.f30734a)) {
                    throw new aaaj(10, "Invalid parent folder.");
                } else if (!this.f47143d.mo27264a(EnumSet.of(twt.f46774c, twt.f46772a))) {
                    throw new aaaj(1511, "Insufficient scope for parent folder.");
                }
                return b.mo27610g();
            } else {
                throw new aaaj(10, "Cannot create new items inside a non-editable folder.");
            }
        } catch (aaaj e) {
            throw new aaaj(1502, "Invalid parent folder.");
        }
    }

    /* renamed from: f */
    public final void mo27096f(DriveId driveId) {
        if (mo27092d(driveId) == null) {
            throw new aaaj(1502, "Provided DriveId is not available.");
        }
    }

    /* renamed from: g */
    public final ujx mo27098g(DriveId driveId) {
        try {
            this.f47147h.mo28207a(this.f47143d, driveId.f30728a, vks.f49399a);
        } catch (VolleyError e) {
            f47137a.mo25376c("Unable to fetch permissions from server");
        } catch (gid e2) {
            throw mo27106n();
        }
        ujx a = mo27078a(this.f47143d, driveId);
        if (a != null) {
            return a;
        }
        throw m37920m();
    }

    /* renamed from: h */
    public final String mo27100h() {
        if (this.f47162x.mo17807d()) {
            return this.f47162x.f30215e;
        }
        return null;
    }

    /* renamed from: j */
    public final uey mo27103j() {
        uey uey = this.f47143d;
        if (uey != null) {
            return uey;
        }
        throw new aaaj(8, "Problem determining the application authorization.");
    }

    /* renamed from: k */
    public final ChangeSequenceNumber mo27104k() {
        uih uih = this.f47143d.f47394a;
        long j = uih.f47683b;
        return new ChangeSequenceNumber(this.f47144e.mo27426c(uih), this.f47149j.mo27481g(), j);
    }

    /* renamed from: l */
    public final boolean mo27105l() {
        return srq.m36142c(this.f47150k);
    }

    /* renamed from: n */
    public final aaaj mo27106n() {
        return new aaaj(13, "Authorization has been revoked by the user. Reconnect the Drive API client to reauthorize.");
    }

    /* renamed from: d */
    public final boolean mo27093d() {
        return this.f47162x.mo17805c();
    }

    /* renamed from: f */
    public final boolean mo27097f() {
        if (this.f47140A == null) {
            this.f47140A = Boolean.valueOf(rfz.m33557a(this.f47163y).mo24610b(m37921o()));
        }
        return this.f47140A.booleanValue();
    }

    /* renamed from: h */
    public final void mo27101h(DriveId driveId) {
        if (mo27091c(driveId)) {
            throw new aaaj(10, "Cannot modify permissions of root folder.");
        }
    }

    /* renamed from: i */
    public final void mo27102i() {
        ArrayList arrayList;
        this.f47160u = false;
        this.f47151l.mo27808a();
        synchronized (this.f47159t) {
            arrayList = new ArrayList(this.f47159t);
            this.f47159t.clear();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((rkh) arrayList.get(i)).mo12460c();
        }
    }

    /* renamed from: c */
    public final DriveId mo27090c() {
        if (!this.f47143d.f47398e.contains(twt.f46773b)) {
            return null;
        }
        try {
            this.f47142c.f49778y.mo28190a(this.f47143d);
        } catch (VolleyError e) {
            sbw sbw = f47137a;
            if (sbw.mo25370a(2)) {
                sbw.mo25365a("Failed to get real appData folder from server");
            }
        }
        return this.f47144e.mo27399a(this.f47143d).mo27610g();
    }

    /* renamed from: a */
    public final AppIdentity mo27070a(uey uey) {
        AppIdentity appIdentity = uey.f47396c;
        if (appIdentity != null) {
            return appIdentity;
        }
        throw new aaaj(8, "appIdentity is null.");
    }

    /* renamed from: a */
    public final MetadataBundle mo27071a(DriveId driveId, boolean z) {
        ujx ujx;
        if (mo27091c(driveId)) {
            if (this.f47143d.mo27264a(EnumSet.of(twt.f46774c, twt.f46772a))) {
                ujx = m37917b(uey.m38255a(this.f47143d.f47394a), this.f47164z);
            } else {
                throw new aaaj(1511, "Insufficient scopes authorized.");
            }
        } else if (!z) {
            ujx = mo27088b(driveId);
        } else {
            String i = m37919i(driveId);
            m37916a(i);
            try {
                ujx = this.f47144e.mo27401a(this.f47143d, i);
                if (ujx.mo27523A()) {
                    throw m37920m();
                }
            } catch (uaa e) {
                throw m37920m();
            }
        }
        MetadataBundle a = uyj.m39760a(ujx, this.f47143d.f47395b);
        int i2 = this.f47150k;
        ArrayList arrayList = new ArrayList();
        for (String str : a.f31071a.keySet()) {
            if (uyu.m39796a(str) == null || uyu.m39796a(str).mo28094d() > i2) {
                arrayList.add(str);
            }
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            a.f31071a.remove((String) arrayList.get(i3));
        }
        return a;
    }

    /* renamed from: b */
    public final DriveId mo27087b() {
        if (this.f47143d.mo27264a(EnumSet.of(twt.f46772a, twt.f46774c))) {
            return this.f47164z;
        }
        return null;
    }

    /* renamed from: g */
    public final boolean mo27099g() {
        return f47139v.contains(m37921o());
    }

    /* renamed from: b */
    public final ujx mo27088b(DriveId driveId) {
        return m37917b(this.f47143d, driveId);
    }

    /* renamed from: b */
    public final boolean mo27089b(DriveId driveId, boolean z) {
        uey j = mo27103j();
        mo27070a(j);
        mo27096f(driveId);
        ujx b = mo27088b(driveId);
        if (b.mo27565aa().mo27695a()) {
            return false;
        }
        vfq.m40318a(this.f47153n, this.f47154o, this.f47144e, j, b.mo27551a(), !z ? uml.PINNED_ACTIVE : uml.PINNED_PAUSED);
        return true;
    }

    /* renamed from: c */
    public final boolean mo27091c(DriveId driveId) {
        return this.f47164z.equals(driveId) || "root".equals(driveId.f30728a);
    }

    /* renamed from: e */
    public final uey mo27095e() {
        uev a = this.f47161w.mo27260a(this.f47162x);
        if (!a.f47378a.f47377f) {
            throw mo27106n();
        } else if (a.f47379b.equals(this.f47143d)) {
            return this.f47143d;
        } else {
            throw new aaaj(13, String.format(Locale.US, "Authorized app changed from %s to %s.", this.f47143d, a.f47379b));
        }
    }

    /* renamed from: a */
    public final Query mo27072a(Query query) {
        Set a = vpv.m41035a(this.f47143d, query.mo18285a());
        vfy vfy = new vfy(query);
        vfy.f49212d = new HashSet(a);
        return vfy.mo28407a();
    }

    /* renamed from: a */
    public final String mo27073a() {
        if (!mo27093d()) {
            return this.f47143d.f47394a.f47682a;
        }
        return null;
    }

    /* renamed from: a */
    public final List mo27074a(ujx ujx) {
        List<ukc> ak = ujx.mo27575ak();
        ArrayList arrayList = new ArrayList();
        for (ukc ukc : ak) {
            if (!ukc.mo27648b()) {
                arrayList.add(new Permission(ukc.f47843b, ukc.f47845d, ukc.f47844c, ukc.f47846e, ukc.f47847f, ukc.f47850i));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final Set mo27075a(DriveId driveId, boolean z, List<DriveId> list, Set set) {
        String str;
        if (list.size() == 1 && list.get(0) == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z2 = false;
        for (DriveId driveId2 : list) {
            if (driveId2 != null) {
                ujx b = mo27088b(driveId2);
                if (driveId.equals(driveId2)) {
                    throw new aaaj(10, "Cannot set oneself as a parent.");
                } else if (!b.mo27640w()) {
                    throw new aaaj(10, "At least one of the provided parents is not a collection. All parents must be collections.");
                } else if (b.mo27524B()) {
                    z2 = z2 || b.mo27574aj().contains(DriveSpace.f30734a);
                    if (z != b.mo27573ai()) {
                        if (!z) {
                            str = "Unable to assign a parent that belongs to the App folder to a resource that is not from within the App folder.";
                        } else {
                            str = "Unable to assign a parent that does not belong to the App folder to a resource from within the App folder.";
                        }
                        throw new aaaj(10, str);
                    }
                } else {
                    throw new aaaj(10, "At least one of the provided parents is not modifiable.");
                }
            } else {
                throw new aaaj(10, "Invalid null drive ID value in the parent set.");
            }
        }
        if (!z2) {
            return set;
        }
        C1225nr nrVar = new C1225nr(set);
        nrVar.add(DriveSpace.f30734a);
        return nrVar;
    }

    /* renamed from: a */
    public final uaw mo27076a(boolean z, String str) {
        return uaw.m37852a(uaw.f47070a.f47071b, z, mo27093d(), str, mo27100h(), uaw.f47070a.f47076g);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0082  */
    /* renamed from: a */
    public final uga mo27077a(DriveId driveId, ufx ufx) {
        String str;
        ujx a;
        ujx a2 = mo27078a(this.f47143d, driveId);
        if (a2 != null) {
            str = a2.mo27616i();
        } else {
            str = driveId.f30728a;
        }
        if (str != null) {
            if (a2 != null) {
                try {
                    if (a2.mo27624l() != null) {
                        vbt vbt = this.f47147h;
                        uey uey = this.f47143d;
                        String l = a2.mo27624l();
                        vkr b = vbt.mo28210b(uey, str, vks.f49399a);
                        if (b.mo28568c() || !l.equals(b.mo28549K())) {
                            vbt.mo28209a(uey, b);
                        } else {
                            vbt.f48967a.mo25371b("Head revision ID did not change so not persisting metadata");
                        }
                        a = this.f47144e.mo27401a(this.f47143d, str);
                        if (a.mo27523A()) {
                            uga a3 = this.f47145f.mo27303a(this.f47143d, a, this.f47142c.f49745D.mo28380a());
                            a3.mo27306a(ufx);
                            return a3;
                        }
                        throw m37920m();
                    }
                } catch (VolleyError e) {
                    f47137a.mo25377c("DataServiceConnection", "Failed to sync metadata");
                } catch (gid e2) {
                    throw mo27106n();
                }
            }
            this.f47147h.mo28207a(this.f47143d, str, vks.f49399a);
            try {
                a = this.f47144e.mo27401a(this.f47143d, str);
                if (a.mo27523A()) {
                }
            } catch (uaa e3) {
                throw m37920m();
            }
        } else {
            ufx.mo27242a(3);
            return null;
        }
    }

    /* renamed from: a */
    public final ujx mo27078a(uey uey, DriveId driveId) {
        ujx c = m37918c(uey, driveId);
        if (c == null || !c.mo27523A()) {
            return c;
        }
        throw m37920m();
    }

    /* renamed from: a */
    public final vpe mo27079a(Query query, String str, Set set, List list) {
        uog a = new vft(this.f47143d, list).mo28404a(query);
        uhn uhn = this.f47144e;
        uey uey = this.f47143d;
        query.mo18285a();
        vpe a2 = uhn.mo27408a(uey, query.mo18285a(), a, str, set, query.f31091e, query.f31093g, list, mo27105l());
        uyu.m39798a(a2.f49703a, this.f47150k);
        return a2;
    }

    /* renamed from: a */
    public final void mo27080a(DriveId driveId, Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            long j = ((DriveId) it.next()).f30729b;
            uey a = uey.m38255a(this.f47143d.f47394a);
            try {
                ujx a2 = this.f47144e.mo27402a(a, ukk.m38862a(j));
                ubj ubj = new ubj(this, a);
                ubj.mo28730d(a2);
                if (ubj.mo28729b().contains(ukk.m38862a(driveId.f30729b))) {
                    throw new aaaj(10, "Cannot create a cyclic hierarchy.");
                }
            } catch (uaa e) {
                throw m37920m();
            } catch (vpr e2) {
                throw new aaaj(8, "Traversal failure");
            }
        }
    }

    /* renamed from: a */
    public final void mo27081a(DriveId driveId, String str) {
        try {
            DriveId c = mo27090c();
            if (c == null) {
                return;
            }
            if (c.equals(driveId)) {
                throw new aaaj(10, str);
            }
        } catch (gid e) {
            throw mo27106n();
        }
    }

    /* renamed from: a */
    public final void mo27082a(DriveId driveId, vcy vcy, boolean z) {
        tzf tzf;
        String str = !z ? "untrash" : "trash";
        if (!mo27091c(driveId)) {
            ujx b = mo27088b(driveId);
            if (b.mo27573ai()) {
                StringBuilder sb = new StringBuilder(str.length() + 50);
                sb.append("Cannot ");
                sb.append(str);
                sb.append(" App Folder or files inside the App Folder.");
                throw new aaaj(10, sb.toString());
            } else if (!b.mo27601d()) {
                StringBuilder sb2 = new StringBuilder(str.length() + 45);
                sb2.append("Cannot ");
                sb2.append(str);
                sb2.append(" resources that the user does not own.");
                throw new aaaj(10, sb2.toString());
            } else if (!b.mo27640w() || twx.m37577a(tww.TRASH_FOLDERS)) {
                vcy.mo28287a(b);
                ukk a = b.mo27551a();
                if (z) {
                    uey uey = this.f47143d;
                    tzf = new tzf(uey.f47394a, uey.f47396c, a, ung.EXPLICITLY_TRASHED);
                } else {
                    uey uey2 = this.f47143d;
                    tzf = new tzf(uey2.f47394a, uey2.f47396c, a, ung.UNTRASHED);
                }
                int a2 = this.f47146g.mo26999a(tzf, vcy);
                if (a2 == 0) {
                    return;
                }
                if (a2 != 5) {
                    StringBuilder sb3 = new StringBuilder(str.length() + 20);
                    sb3.append("Failed to ");
                    sb3.append(str);
                    sb3.append(" resource.");
                    throw new aaaj(8, sb3.toString());
                }
                StringBuilder sb4 = new StringBuilder(str.length() + 57);
                sb4.append("App has no access to a descendant of the folder to be ");
                sb4.append(str);
                sb4.append("ed.");
                throw new aaaj(10, sb4.toString());
            } else {
                StringBuilder sb5 = new StringBuilder(str.length() + 15);
                sb5.append("Cannot ");
                sb5.append(str);
                sb5.append(" folders");
                throw new aaaj(8, sb5.toString());
            }
        } else {
            StringBuilder sb6 = new StringBuilder(str.length() + 19);
            sb6.append("Cannot ");
            sb6.append(str);
            sb6.append(" root folder");
            throw new aaaj(10, sb6.toString());
        }
    }

    /* renamed from: a */
    public final void mo27083a(Query query, Set set, utr utr, udv udv) {
        boolean z;
        boolean z2;
        HashSet hashSet;
        ubh ubh;
        String str;
        Query query2 = query;
        char c = 0;
        if (utr != null) {
            z = true;
        } else {
            z = false;
        }
        Query a = mo27072a(query);
        int i = 10;
        if (!query2.f31091e || this.f47143d.mo27266c() || Collections.singleton(DriveSpace.f30735b).equals(a.mo18285a())) {
            String str2 = new vfr(this.f47157r.f47223b.f47395b).mo28403a(query2).f48779b;
            SortOrder sortOrder = query2.f31089c;
            ArrayList arrayList = new ArrayList();
            Object obj = null;
            if (sortOrder == null) {
                z2 = false;
            } else {
                if (sortOrder.f31095b) {
                    arrayList.add(String.format(Locale.US, "%s <> \"%s\"", uxx.m39710a(uzm.f48738N).mo28108b(null), "application/vnd.google-apps.folder"));
                }
                if (!sortOrder.f31094a.isEmpty()) {
                    List list = sortOrder.f31094a;
                    int size = list.size();
                    int i2 = 0;
                    while (i2 < size) {
                        FieldWithSortOrder fieldWithSortOrder = (FieldWithSortOrder) list.get(i2);
                        uvy a2 = uyu.m39796a(fieldWithSortOrder.f31101a);
                        if (a2 == null) {
                            String valueOf = String.valueOf(fieldWithSortOrder.f31101a);
                            throw new aaaj(i, valueOf.length() == 0 ? new String("Incorrect sorting field provided: ") : "Incorrect sorting field provided: ".concat(valueOf));
                        }
                        String b = uxx.m39710a(a2).mo28108b(obj);
                        String str3 = "DESC";
                        if (uzp.f48774f.equals(a2)) {
                            Locale locale = Locale.US;
                            Object[] objArr = new Object[2];
                            objArr[c] = b;
                            objArr[1] = !fieldWithSortOrder.f31102b ? str3 : "ASC";
                            arrayList.add(String.format(locale, "%s IS NULL %s", objArr));
                        }
                        if (!(a2 instanceof uzg)) {
                            str = "%s COLLATE LOCALIZED %s";
                        } else {
                            str = "TRIM(%s) COLLATE LOCALIZED %s";
                        }
                        Locale locale2 = Locale.US;
                        Object[] objArr2 = new Object[2];
                        objArr2[0] = b;
                        if (fieldWithSortOrder.f31102b) {
                            str3 = "ASC";
                        }
                        objArr2[1] = str3;
                        arrayList.add(String.format(locale2, str, objArr2));
                        i2++;
                        i = 10;
                        c = 0;
                        obj = null;
                    }
                }
                z2 = false;
            }
            String join = TextUtils.join(",", arrayList);
            List<String> list2 = query2.f31090d;
            if (list2 == null) {
                list2 = new ArrayList();
            } else if (!list2.isEmpty() && !set.isEmpty()) {
                list2.addAll(set);
            }
            if (list2.isEmpty() || !((Boolean) twy.f46809T.mo58455c()).booleanValue()) {
                hashSet = bnon.f131923a;
            } else {
                HashSet hashSet2 = new HashSet();
                for (String str4 : list2) {
                    uvy a3 = uyu.m39796a(str4);
                    if (a3 != null) {
                        hashSet2.addAll(a3.mo28090b());
                    } else {
                        String valueOf2 = String.valueOf(str4);
                        throw new aaaj(10, valueOf2.length() == 0 ? new String("Unknown metadata field requested: ") : "Unknown metadata field requested: ".concat(valueOf2));
                    }
                }
                if (hashSet2.size() != 0) {
                    hashSet = hashSet2;
                } else {
                    throw new aaaj(10, "Need at least one column to project");
                }
            }
            ubh ubh2 = new ubh(this, z, query, a, join, hashSet, str2, utr, udv);
            uby uby = this.f47157r;
            List emptyList = Collections.emptyList();
            if (vgo.m40400a(query)) {
                emptyList = uby.f47224c.mo27227a(str2);
                if (!emptyList.isEmpty()) {
                    z2 = true;
                } else {
                    if (utr != null) {
                        ubh = null;
                    } else {
                        ubh = ubh2;
                    }
                    if (!uby.f47224c.mo27228a(str2, ubh)) {
                        uih uih = uby.f47223b.f47394a;
                        SyncResult syncResult = new SyncResult();
                        new vbb(uby.f47222a, uih, new vay(uzy.m39860a(new vab(str2, DriveSpace.f30738e, null), null, 0)), new vch(syncResult), syncResult).mo28187a(new ubx(uby, str2), ((Integer) twy.f46865aw.mo58455c()).intValue());
                    }
                    if (utr == null) {
                        return;
                    }
                }
            } else {
                z2 = true;
            }
            ubh2.mo27069a(emptyList, z2);
            return;
        }
        throw new aaaj(10, "Can only call include parents when FULL scope is requested or only appdata space is requested");
    }

    /* renamed from: a */
    public final void mo27084a(Iterable iterable) {
        uey a = uey.m38255a(this.f47143d.f47394a);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            DriveId driveId = (DriveId) it.next();
            if (driveId != null) {
                ujx b = m37917b(a, driveId);
                if (b.mo27640w() && !b.mo27524B()) {
                    throw new aaaj(10, "At least one of the existing parents being removed is not modifiable.");
                }
            } else {
                throw new aaaj(10, "Invalid null drive ID value in the removed parent set.");
            }
        }
    }

    /* renamed from: a */
    public final void mo27085a(vcy vcy, DriveId driveId) {
        try {
            vcy.mo28287a(m37917b(uey.m38255a(this.f47143d.f47394a), driveId));
        } catch (aaaj e) {
            f47137a.mo25376c("Failed to retrieve entry for logging");
        }
    }

    /* renamed from: a */
    public final boolean mo27086a(DriveId driveId) {
        ujx ujx;
        try {
            ujx = m37918c(uey.m38255a(this.f47143d.f47394a), driveId);
        } catch (aaaj e) {
            f47137a.mo25373b("DataServiceConnection", "Failed to retrieve entry from DB.", e);
            ujx = null;
        }
        return ujx != null && ujx.mo27573ai();
    }
}
