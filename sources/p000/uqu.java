package p000;

import android.database.SQLException;
import android.os.RemoteException;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.auth.CallingAppInfo;
import com.google.android.gms.drive.events.ChangesAvailableOptions;
import com.google.android.gms.drive.events.TransferStateOptions;
import com.google.android.gms.drive.events.internal.TransferProgressData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: uqu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uqu {

    /* renamed from: a */
    public static final sbw f48560a = new sbw("SubscriptionStore", "");

    /* renamed from: b */
    public final uhn f48561b;

    /* renamed from: c */
    public final uqp f48562c;

    /* renamed from: d */
    public final Map f48563d = new HashMap();

    /* renamed from: e */
    public final Set f48564e = new HashSet();

    /* renamed from: f */
    final Set f48565f = new HashSet();

    /* renamed from: g */
    private final uhj f48566g;

    /* renamed from: h */
    private final uqh f48567h;

    /* renamed from: i */
    private final vcz f48568i;

    public uqu(uhj uhj, uhn uhn, uqp uqp, uqh uqh, vcz vcz, sqv sqv) {
        sdo.m34959a(uhj);
        this.f48566g = uhj;
        sdo.m34959a(uhn);
        this.f48561b = uhn;
        sdo.m34959a(uqp);
        this.f48562c = uqp;
        sdo.m34959a(uqh);
        this.f48567h = uqh;
        sdo.m34959a(vcz);
        this.f48568i = vcz;
        sdo.m34959a(sqv);
    }

    /* renamed from: a */
    private final List m39265a(uey uey, uov uov) {
        ArrayList arrayList = new ArrayList();
        this.f48561b.mo27435d();
        try {
            for (TransferProgressData transferProgressData : this.f48567h.mo27865a()) {
                try {
                    if (uov.mo27795a(this.f48561b.mo27402a(uey, ukk.m38862a(transferProgressData.f30792b.f30729b)))) {
                        arrayList.add(transferProgressData);
                    }
                } catch (uaa e) {
                }
            }
            this.f48561b.mo27442f();
            this.f48561b.mo27439e();
            return arrayList;
        } catch (SQLException e2) {
            throw new aaaj(8, "Unable to load entry");
        } catch (Throwable th) {
            this.f48561b.mo27439e();
            throw th;
        }
    }

    /* renamed from: b */
    private final void m39267b(long j) {
        m39266a(7, this.f48565f, j);
    }

    /* renamed from: b */
    public final void mo27896b(uey uey) {
        this.f48561b.mo27435d();
        try {
            uin b = this.f48561b.mo27419b(uey);
            sdo.m34959a(b);
            long j = b.f48366m;
            this.f48561b.mo27423b(j, null, 7);
            m39267b(j);
            this.f48561b.mo27442f();
            this.f48561b.mo27439e();
        } catch (SQLException e) {
            throw new aaaj(8, "Unable to remove transfer state subscription");
        } catch (Throwable th) {
            this.f48561b.mo27439e();
            throw th;
        }
    }

    /* renamed from: a */
    private static final void m39266a(int i, Set set, long j) {
        synchronized (set) {
            Iterator it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ums b = ((uqr) it.next()).mo27791b();
                if (b.f48254c == i && b.f48253b == j && b.f48252a == null) {
                    it.remove();
                    break;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00aa, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ab, code lost:
        p000.uqu.f48560a.mo25378c("SubscriptionStore", "Error reloading changes available subscription from the DB", r5);
        r4.mo27726u();
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a2 A[Catch:{ JSONException -> 0x00aa, RemoteException -> 0x008f, all -> 0x01ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a6 A[Catch:{ JSONException -> 0x00aa, RemoteException -> 0x008f, all -> 0x01ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00aa A[Catch:{ JSONException -> 0x00aa, RemoteException -> 0x008f, all -> 0x01ad }, ExcHandler: JSONException (r5v7 'e' org.json.JSONException A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:27:0x007b] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01a1  */
    /* renamed from: a */
    public final void mo27886a() {
        ums ums;
        uou uou;
        uig uig = null;
        try {
            uig a = this.f48561b.mo27393a(1);
            try {
                synchronized (this.f48563d) {
                    this.f48563d.clear();
                    Iterator it = a.iterator();
                    while (it.hasNext()) {
                        ums ums2 = (ums) it.next();
                        ukk ukk = ums2.f48252a;
                        Set set = (Set) this.f48563d.get(ukk);
                        if (set == null) {
                            set = new HashSet();
                            this.f48563d.put(ukk, set);
                        }
                        set.add(ums2);
                    }
                }
                if (a != null) {
                    a.close();
                }
                HashSet hashSet = new HashSet();
                this.f48561b.mo27435d();
                try {
                    uig a2 = this.f48561b.mo27393a(4);
                    try {
                        Iterator it2 = a2.iterator();
                        while (it2.hasNext()) {
                            ums ums3 = (ums) it2.next();
                            uey g = this.f48561b.mo27444g(ums3.f48253b);
                            if (g == null) {
                                f48560a.mo25372b("SubscriptionStore", "App no longer exists when reloading subscription");
                                ums3.mo27726u();
                            } else {
                                try {
                                    uou = new uou(ums3, new uqs(this, g.f47396c.f30764b));
                                    uou.mo27790a(g, this.f48561b);
                                } catch (JSONException e) {
                                } catch (RemoteException e2) {
                                    e = e2;
                                    uou = null;
                                    f48560a.mo25378c("SubscriptionStore", "Error raising initial changes available subscription event", e);
                                    if (uou.mo27792c()) {
                                    }
                                }
                                if (uou.mo27792c()) {
                                    hashSet.add(uou);
                                } else {
                                    ums3.mo27726u();
                                }
                            }
                        }
                        this.f48561b.mo27442f();
                        if (a2 != null) {
                            a2.close();
                        }
                        this.f48561b.mo27439e();
                        synchronized (this.f48564e) {
                            this.f48564e.clear();
                            this.f48564e.addAll(hashSet);
                        }
                        HashSet hashSet2 = new HashSet();
                        this.f48561b.mo27435d();
                        try {
                            uig = this.f48561b.mo27393a(7);
                            try {
                                Iterator it3 = uig.iterator();
                                while (it3.hasNext()) {
                                    ums = (ums) it3.next();
                                    uey g2 = this.f48561b.mo27444g(ums.f48253b);
                                    if (g2 == null) {
                                        f48560a.mo25372b("SubscriptionStore", "App no longer exists when reloading subscription");
                                        ums.mo27726u();
                                    } else {
                                        hashSet2.add(new uov(ums, new uqt(this, g2.f47396c.f30764b)));
                                    }
                                }
                                this.f48561b.mo27442f();
                                if (uig != null) {
                                    uig.close();
                                }
                                this.f48561b.mo27439e();
                                synchronized (this.f48565f) {
                                    HashSet hashSet3 = new HashSet();
                                    for (uov uov : this.f48565f) {
                                        if (!uov.f48439b) {
                                            hashSet3.add(Long.valueOf(uov.mo27796c()));
                                        }
                                    }
                                    this.f48565f.clear();
                                    this.f48565f.addAll(hashSet2);
                                    for (uov uov2 : this.f48565f) {
                                        if (!hashSet3.contains(Long.valueOf(uov2.mo27796c()))) {
                                            uov2.mo27793a();
                                        }
                                    }
                                }
                            } catch (JSONException e3) {
                                f48560a.mo25378c("SubscriptionStore", "Error reloading transfer state subscription from the DB", e3);
                                ums.mo27726u();
                            } catch (Throwable th) {
                                th = th;
                                if (uig != null) {
                                }
                                this.f48561b.mo27439e();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (uig != null) {
                                uig.close();
                            }
                            this.f48561b.mo27439e();
                            throw th;
                        }
                    } catch (JSONException e4) {
                    } catch (RemoteException e5) {
                        e = e5;
                        f48560a.mo25378c("SubscriptionStore", "Error raising initial changes available subscription event", e);
                        if (uou.mo27792c()) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        uig = a2;
                        if (uig != null) {
                        }
                        this.f48561b.mo27439e();
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (uig != null) {
                        uig.close();
                    }
                    this.f48561b.mo27439e();
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                uig = a;
            }
        } catch (Throwable th6) {
            th = th6;
            if (uig != null) {
                uig.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo27887a(int i, uey uey, ujx ujx) {
        vcy c = this.f48568i.mo28312c();
        c.mo28300c(2, i);
        c.mo28299c(1);
        c.mo28281a(new CallingAppInfo(uey, 0));
        c.mo28309j();
        if (ujx != null) {
            c.mo28287a(ujx);
        }
        c.mo28274a();
    }

    /* renamed from: a */
    public final void mo27888a(long j) {
        m39266a(4, this.f48564e, j);
    }

    /* renamed from: a */
    public final void mo27889a(TransferProgressData transferProgressData) {
        HashSet<uov> hashSet = new HashSet();
        synchronized (this.f48565f) {
            hashSet.addAll(this.f48565f);
        }
        if (!hashSet.isEmpty()) {
            HashSet<ums> hashSet2 = new HashSet();
            for (uov uov : hashSet) {
                ums ums = uov.f48438a;
                uey g = this.f48561b.mo27444g(ums.f48253b);
                if (g != null) {
                    try {
                        ujx a = this.f48561b.mo27402a(g, ukk.m38862a(transferProgressData.f30792b.f30729b));
                        try {
                            if (uov.f48439b && uov.mo27795a(a)) {
                                uov.mo27794a(bngx.m109356a(transferProgressData));
                                f48560a.mo25371b("Raised transfer state event to subscription");
                                mo27887a(71, g, (ujx) null);
                            }
                        } catch (RemoteException e) {
                            f48560a.mo25378c("SubscriptionStore", "Error raising transfer state event to one subscriber", e);
                        }
                    } catch (uaa e2) {
                    }
                } else {
                    hashSet2.add(ums);
                }
            }
            synchronized (this.f48565f) {
                for (ums ums2 : hashSet2) {
                    m39267b(ums2.f48253b);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo27890a(uey uey) {
        this.f48561b.mo27435d();
        try {
            uin b = this.f48561b.mo27419b(uey);
            sdo.m34959a(b);
            long j = b.f48366m;
            this.f48561b.mo27423b(j, null, 4);
            mo27888a(j);
            this.f48561b.mo27442f();
            this.f48561b.mo27439e();
        } catch (SQLException e) {
            throw new aaaj(8, "Unable to remove changes available subscription");
        } catch (Throwable th) {
            this.f48561b.mo27439e();
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo27891a(uey uey, DriveId driveId) {
        sdo.m34959a(driveId);
        ukk a = ukk.m38862a(driveId.f30729b);
        this.f48561b.mo27435d();
        try {
            uin b = this.f48561b.mo27419b(uey);
            sdo.m34959a(b);
            long j = b.f48366m;
            this.f48561b.mo27423b(j, a, 1);
            mo27895a(a, j);
            this.f48561b.mo27442f();
            this.f48561b.mo27439e();
        } catch (SQLException e) {
            String valueOf = String.valueOf(driveId);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
            sb.append("Unable to remove change event subscription: id = ");
            sb.append(valueOf);
            throw new aaaj(8, sb.toString());
        } catch (Throwable th) {
            this.f48561b.mo27439e();
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo27892a(uey uey, boolean z, DriveId driveId) {
        ums ums;
        long j;
        ums ums2;
        sdo.m34959a(driveId);
        ukk a = ukk.m38862a(driveId.f30729b);
        this.f48561b.mo27435d();
        try {
            uin b = this.f48561b.mo27419b(uey);
            sdo.m34959a(b);
            long j2 = b.f48366m;
            ums = this.f48561b.mo27407a(j2, a, 1);
            if (!z) {
                try {
                    j = System.currentTimeMillis();
                } catch (SQLException e) {
                    e = e;
                    try {
                        f48560a.mo25378c("SubscriptionStore", String.format("Unable to insert change event subscription: %s", ums), e);
                        throw new aaaj(8, "Unable to store change event subscription");
                    } catch (Throwable th) {
                        this.f48561b.mo27439e();
                        throw th;
                    }
                }
            } else {
                j = Long.MAX_VALUE;
            }
            if (ums == null) {
                ums2 = new ums(this.f48566g, a, null, j2, 1, j);
            } else {
                ums.f48255d = j;
                ums2 = ums;
            }
            try {
                ums2.mo27725t();
                synchronized (this.f48563d) {
                    if (ums != null) {
                        mo27895a(a, j2);
                    }
                    Set set = (Set) this.f48563d.get(a);
                    if (set == null) {
                        set = new HashSet();
                        this.f48563d.put(a, set);
                    }
                    set.add(ums2);
                }
                this.f48561b.mo27442f();
                this.f48561b.mo27439e();
            } catch (SQLException e2) {
                e = e2;
                ums = ums2;
            }
        } catch (SQLException e3) {
            e = e3;
            ums = null;
            f48560a.mo25378c("SubscriptionStore", String.format("Unable to insert change event subscription: %s", ums), e);
            throw new aaaj(8, "Unable to store change event subscription");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0098, code lost:
        r0 = e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0098 A[ExcHandler: SQLException (e android.database.SQLException), Splitter:B:1:0x000c] */
    /* renamed from: a */
    public final void mo27893a(uey uey, boolean z, ChangesAvailableOptions changesAvailableOptions, String str, Set set) {
        long j;
        ums ums;
        uey uey2 = uey;
        this.f48561b.mo27435d();
        ums ums2 = null;
        try {
            uin b = this.f48561b.mo27419b(uey2);
            sdo.m34959a(b);
            long j2 = b.f48366m;
            String a = uqq.m39259a(changesAvailableOptions, str, set, this.f48561b.mo27426c(uey2.f47394a));
            ums2 = this.f48561b.mo27407a(j2, (ukk) null, 4);
            if (!z) {
                try {
                    j = System.currentTimeMillis();
                } catch (SQLException e) {
                    e = e;
                    try {
                        f48560a.mo25378c("SubscriptionStore", String.format("Unable to insert changes available subscription: %s", ums2), e);
                        throw new aaaj(8, "Unable to store changes available subscription");
                    } catch (Throwable th) {
                        this.f48561b.mo27439e();
                        throw th;
                    }
                } catch (JSONException e2) {
                    e = e2;
                    f48560a.mo25378c("SubscriptionStore", String.format("Unable to insert changes available subscription: %s", ums2), e);
                    throw new aaaj(8, "Unable to store changes available subscription");
                }
            } else {
                j = Long.MAX_VALUE;
            }
            if (ums2 == null) {
                ums = new ums(this.f48566g, null, a, j2, 4, j);
            } else {
                ums2.f48256e = a;
                ums2.f48255d = j;
                ums = ums2;
            }
            try {
                ums.mo27725t();
                uou uou = new uou(ums, new uqs(this, uey2.f47396c.f30764b));
                uou.mo27789a();
                synchronized (this.f48564e) {
                    if (ums2 != null) {
                        mo27888a(j2);
                    }
                    this.f48564e.add(uou);
                }
                this.f48561b.mo27442f();
                this.f48561b.mo27439e();
            } catch (SQLException | JSONException e3) {
                e = e3;
                ums2 = ums;
            }
        } catch (JSONException e4) {
            throw new aaaj(8, "Unable to store changes available subscription");
        } catch (SQLException e5) {
        } catch (JSONException e6) {
            e = e6;
            f48560a.mo25378c("SubscriptionStore", String.format("Unable to insert changes available subscription: %s", ums2), e);
            throw new aaaj(8, "Unable to store changes available subscription");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c8 A[ExcHandler: SQLException (e android.database.SQLException), Splitter:B:1:0x000c] */
    /* renamed from: a */
    public final void mo27894a(uey uey, boolean z, TransferStateOptions transferStateOptions, String str, Set set) {
        long j;
        ums ums;
        uey uey2 = uey;
        this.f48561b.mo27435d();
        ums ums2 = null;
        try {
            uin b = this.f48561b.mo27419b(uey2);
            sdo.m34959a(b);
            long j2 = b.f48366m;
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("optionsSpaces", uqq.m39261a(transferStateOptions.mo18165a()));
            jSONObject.putOpt("account", str);
            jSONObject.put("spaces", uqq.m39261a(set));
            String jSONObject2 = jSONObject.toString();
            ums2 = this.f48561b.mo27407a(j2, (ukk) null, 7);
            if (!z) {
                try {
                    j = System.currentTimeMillis();
                } catch (SQLException e) {
                    e = e;
                    try {
                        f48560a.mo25378c("SubscriptionStore", String.format("Unable to insert transfer state subscription: %s", ums2), e);
                        throw new aaaj(8, "Unable to store transfer state subscription");
                    } catch (Throwable th) {
                        this.f48561b.mo27439e();
                        throw th;
                    }
                } catch (JSONException e2) {
                    e = e2;
                    f48560a.mo25378c("SubscriptionStore", String.format("Unable to insert transfer state subscription: %s", ums2), e);
                    throw new aaaj(8, "Unable to store transfer state subscription");
                }
            } else {
                j = Long.MAX_VALUE;
            }
            if (ums2 == null) {
                ums = new ums(this.f48566g, null, jSONObject2, j2, 7, j);
            } else {
                ums2.f48256e = jSONObject2;
                ums2.f48255d = j;
                ums = ums2;
            }
            try {
                ums.mo27725t();
                uov uov = new uov(ums, new uqt(this, uey2.f47396c.f30764b));
                synchronized (this.f48565f) {
                    if (ums2 != null) {
                        m39267b(j2);
                    }
                    this.f48565f.add(uov);
                }
                this.f48561b.mo27442f();
                this.f48561b.mo27439e();
                synchronized (this.f48565f) {
                    try {
                        uov.mo27794a(m39265a(uey2, uov));
                    } catch (RemoteException e3) {
                        f48560a.mo25378c("SubscriptionStore", "Error raising transfer state event", e3);
                    }
                    uov.mo27793a();
                }
            } catch (SQLException | JSONException e4) {
                e = e4;
                ums2 = ums;
            }
        } catch (JSONException e5) {
            throw new aaaj(8, "Unable to store transfer state subscription");
        } catch (SQLException e6) {
        } catch (JSONException e7) {
            e = e7;
            f48560a.mo25378c("SubscriptionStore", String.format("Unable to insert transfer state subscription: %s", ums2), e);
            throw new aaaj(8, "Unable to store transfer state subscription");
        }
    }

    /* renamed from: a */
    public final void mo27895a(ukk ukk, long j) {
        synchronized (this.f48563d) {
            Set set = (Set) this.f48563d.get(ukk);
            if (set != null) {
                Iterator it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ums ums = (ums) it.next();
                    if (ums.f48254c == 1 && ums.f48253b == j && sdg.m34949a(ums.f48252a, ukk)) {
                        it.remove();
                        break;
                    }
                }
                if (set.isEmpty()) {
                    this.f48563d.remove(ukk);
                }
            }
        }
    }
}
