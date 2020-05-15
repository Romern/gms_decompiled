package p000;

import android.os.RemoteException;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ChangesAvailableOptions;
import com.google.android.gms.drive.events.TransferProgressEvent;
import com.google.android.gms.drive.events.TransferProgressOptions;
import com.google.android.gms.drive.query.Query;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: upf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class upf implements uoz {

    /* renamed from: a */
    public static final sbw f48457a = new sbw("CallbackStoreImpl", "");

    /* renamed from: b */
    final Set f48458b = new HashSet();

    /* renamed from: c */
    final Set f48459c = new HashSet();

    /* renamed from: d */
    private final ConcurrentMap f48460d = new ConcurrentHashMap();

    /* renamed from: e */
    private final Object f48461e = new Object();

    /* renamed from: f */
    private final ConcurrentMap f48462f = new ConcurrentHashMap();

    /* renamed from: g */
    private final Object f48463g = new Object();

    /* renamed from: h */
    private final ConcurrentMap f48464h = new ConcurrentHashMap();

    /* renamed from: i */
    private final Object f48465i = new Object();

    /* renamed from: j */
    private final vcz f48466j;

    /* renamed from: k */
    private final uqh f48467k;

    /* renamed from: l */
    private volatile vau f48468l;

    public upf(vcz vcz, uqh uqh) {
        sdo.m34959a(vcz);
        this.f48466j = vcz;
        sdo.m34959a(uqh);
        this.f48467k = uqh;
    }

    /* renamed from: a */
    private static final uox m39156a(TransferProgressEvent transferProgressEvent, String str) {
        return new upb(transferProgressEvent, str);
    }

    /* renamed from: a */
    public final void mo27820a(vau vau) {
        this.f48468l = vau;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo27825b() {
        boolean z;
        boolean z2;
        vau vau = this.f48468l;
        if (vau != null) {
            boolean z3 = (!this.f48460d.isEmpty()) | (!this.f48462f.isEmpty());
            synchronized (this.f48458b) {
                z = z3 | (!this.f48458b.isEmpty());
            }
            synchronized (this.f48459c) {
                z2 = z | (!this.f48459c.isEmpty());
            }
            vau.mo28180a(z2);
        }
    }

    /* renamed from: a */
    private static void m39157a(DriveId driveId, Set set, ConcurrentMap concurrentMap) {
        synchronized (set) {
            if (set.isEmpty()) {
                concurrentMap.remove(driveId, set);
            }
        }
    }

    /* renamed from: a */
    private final void m39158a(DriveId driveId, ConcurrentMap concurrentMap, uox uox) {
        Set set = (Set) concurrentMap.get(driveId);
        if (set != null) {
            m39161a(set, uox);
            m39157a(driveId, set, concurrentMap);
        }
    }

    /* renamed from: b */
    public final void mo27822b(TransferProgressEvent transferProgressEvent, DriveId driveId) {
        m39158a(driveId, this.f48464h, m39156a(transferProgressEvent, "pinned download"));
    }

    /* renamed from: b */
    public final void mo27823b(utr utr) {
        m39162a(upq.m39209a(utr), this.f48459c);
    }

    /* renamed from: a */
    private final void m39159a(DriveId driveId, uqi uqi, Object obj, ConcurrentMap concurrentMap) {
        boolean add;
        sdo.m34959a(driveId);
        synchronized (obj) {
            Set set = (Set) concurrentMap.get(driveId);
            if (set == null) {
                set = new HashSet();
            }
            synchronized (set) {
                add = set.add(uqi);
                concurrentMap.putIfAbsent(driveId, set);
            }
        }
        if (add) {
            mo27825b();
        }
    }

    /* renamed from: a */
    private final void m39160a(DriveId driveId, uqi uqi, ConcurrentMap concurrentMap) {
        sdo.m34959a(driveId);
        Set set = (Set) concurrentMap.get(driveId);
        if (set != null) {
            m39162a(uqi, set);
            m39157a(driveId, set, concurrentMap);
        }
    }

    /* renamed from: a */
    private final void m39161a(Set set, uox uox) {
        boolean removeAll;
        HashSet<uqi> hashSet = new HashSet();
        synchronized (set) {
            hashSet.addAll(set);
        }
        HashSet hashSet2 = new HashSet();
        for (uqi uqi : hashSet) {
            try {
                if (!uox.mo27802a(uqi)) {
                    f48457a.mo25372b("CallbackStoreImpl", "Callback is no longer needed; removing");
                    hashSet2.add(uqi);
                }
            } catch (RemoteException e) {
                f48457a.mo25373b("CallbackStoreImpl", "Callback caused RemoteException; removing", e);
                hashSet2.add(uqi);
            }
        }
        synchronized (set) {
            removeAll = set.removeAll(hashSet2);
        }
        if (removeAll) {
            mo27825b();
        }
    }

    /* renamed from: a */
    private final void m39162a(uqi uqi, Set set) {
        boolean remove;
        synchronized (set) {
            remove = set.remove(uqi);
        }
        if (remove) {
            mo27825b();
        }
    }

    /* renamed from: a */
    public final void mo27808a() {
        this.f48460d.clear();
        this.f48462f.clear();
        this.f48464h.clear();
        synchronized (this.f48458b) {
            this.f48458b.clear();
        }
        synchronized (this.f48459c) {
            this.f48459c.clear();
        }
        mo27825b();
    }

    /* renamed from: a */
    public final void mo27824a(int i, ujx ujx) {
        vdk d = ((vdd) this.f48466j).mo28316d();
        d.mo28300c(2, i);
        d.mo28299c(0);
        d.mo28309j();
        if (ujx != null) {
            d.mo28287a(ujx);
        }
        d.mo28274a();
    }

    /* renamed from: a */
    public final void mo27809a(DriveId driveId, long j, utr utr) {
        m39159a(driveId, new upm(utr, driveId, j), this.f48461e, this.f48460d);
    }

    /* renamed from: a */
    public final void mo27810a(DriveId driveId, utr utr) {
        m39160a(driveId, upm.m39205a(utr), this.f48460d);
    }

    /* renamed from: a */
    public final void mo27811a(DriveId driveId, utr utr, TransferProgressOptions transferProgressOptions) {
        int i = transferProgressOptions.f30788a;
        if (i == 0) {
            m39160a(driveId, uqv.m39279a(utr), this.f48462f);
        } else if (i != 1) {
            f48457a.mo25374b("CallbackStoreImpl", "Invalid transfer type: %d", Integer.valueOf(transferProgressOptions.f30788a));
        } else {
            m39160a(driveId, uqv.m39279a(utr), this.f48464h);
        }
    }

    /* renamed from: a */
    public final void mo27812a(ChangeEvent changeEvent, ujx ujx) {
        DriveId driveId = changeEvent.f30770a;
        sdo.m34959a(driveId);
        sdo.m34966a(ujx, "Entry can't be null for change events");
        sdo.m34975b(driveId.equals(ujx.mo27610g()), "Event and entry mismatch");
        m39158a(ujx.mo27610g(), this.f48460d, new upd(this, changeEvent, ujx));
        m39161a(this.f48459c, new upe(this, ujx));
    }

    /* renamed from: a */
    public final void mo27813a(TransferProgressEvent transferProgressEvent, DriveId driveId) {
        m39158a(driveId, this.f48462f, m39156a(transferProgressEvent, "upload"));
    }

    /* renamed from: a */
    public final void mo27814a(String str, boolean z) {
        m39161a(this.f48458b, new upc(str, z));
    }

    /* renamed from: a */
    public final void mo27815a(Set set) {
        m39161a(this.f48458b, new upa(this, set));
    }

    /* renamed from: a */
    public final void mo27816a(uqv uqv) {
        int i = uqv.f48570d;
        if (i == 0) {
            m39159a(uqv.f48569c, uqv, this.f48465i, this.f48462f);
        } else if (i != 1) {
            f48457a.mo25374b("CallbackStoreImpl", "Invalid transfer type: %s", Integer.valueOf(uqv.f48570d));
        } else {
            m39159a(uqv.f48569c, uqv, this.f48463g, this.f48464h);
        }
        try {
            uqv.mo27897a(new TransferProgressEvent(this.f48467k.mo27864a(uqv.f48570d, uqv.f48569c)));
        } catch (RemoteException e) {
            f48457a.mo25378c("CallbackStoreImpl", "Error raising progress event", e);
        }
    }

    /* renamed from: a */
    public final void mo27817a(utr utr) {
        m39162a(uqm.m39250a(utr), this.f48458b);
    }

    /* renamed from: a */
    public final void mo27818a(utr utr, long j, ChangesAvailableOptions changesAvailableOptions, Set set) {
        boolean add;
        sdo.m34959a(utr);
        sdo.m34959a(changesAvailableOptions);
        sdo.m34959a(set);
        synchronized (this.f48459c) {
            add = this.f48459c.add(new upq(utr, j, changesAvailableOptions, set));
        }
        if (add) {
            mo27825b();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: uqm.a(boolean, boolean):void
     arg types: [int, boolean]
     candidates:
      uqm.a(java.lang.String, boolean):void
      uqm.a(boolean, boolean):void */
    /* renamed from: a */
    public final void mo27819a(utr utr, Query query, String str, ubi ubi, Set set, boolean z) {
        boolean add;
        uqm uqm = new uqm(utr, query, str, ubi, set, this.f48466j);
        try {
            uqm.mo27878a(true, z);
            synchronized (this.f48458b) {
                add = this.f48458b.add(uqm);
            }
            if (add) {
                mo27825b();
            }
        } catch (RemoteException e) {
            f48457a.mo25376c("Unable to raise a query callback. The callback is not added.");
        }
    }

    /* renamed from: a */
    public final boolean mo27821a(DriveId driveId) {
        synchronized (this.f48459c) {
            if (this.f48459c.isEmpty()) {
                return this.f48460d.containsKey(driveId);
            }
            return true;
        }
    }
}
