package p000;

import android.content.Context;
import android.database.Cursor;
import com.google.android.gms.drive.DriveId;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: vhu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vhu {

    /* renamed from: c */
    private static final sbw f49295c = new sbw("RealtimeDocumentCachePr", "");

    /* renamed from: a */
    public final uhj f49296a;

    /* renamed from: b */
    public final uhn f49297b;

    /* renamed from: d */
    private final Context f49298d;

    /* renamed from: e */
    private final vhk f49299e;

    /* renamed from: f */
    private final ConcurrentMap f49300f = new ConcurrentHashMap();

    public vhu(Context context, uhj uhj, uhn uhn) {
        this.f49298d = context;
        this.f49296a = uhj;
        this.f49299e = new vhk();
        this.f49297b = uhn;
    }

    /* renamed from: a */
    public final vhs mo28471a(vhb vhb, boolean z) {
        vhs vhs;
        do {
            umn b = mo28474b(vhb);
            vhs vhs2 = (vhs) this.f49300f.get(b.f48225c);
            vhs = null;
            if (vhs2 != null) {
                if (z) {
                    f49295c.mo25368a("RealtimeDocumentCachePr", "Closing cache (lock steal): %s", vhb);
                    vhs2.mo28468f();
                } else {
                    f49295c.mo25368a("RealtimeDocumentCachePr", "Cannot open; cache is already in use: %s", vhb);
                    return null;
                }
            }
            String str = b.f48225c;
            vhs vhs3 = new vhs(str, new vit(this.f49298d, new File(vhj.m40438a(this.f49298d), str).getAbsolutePath(), "drive_real_time"), b, this.f49300f);
            if (this.f49300f.putIfAbsent(str, vhs3) == null) {
                vhs = vhs3;
                continue;
            }
        } while (vhs == null);
        return vhs;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* renamed from: b */
    public final umn mo28474b(vhb vhb) {
        ukk ukk;
        String str;
        vhb vhb2 = vhb;
        umn c = mo28475c(vhb);
        if (c != null) {
            return c;
        }
        long j = this.f49297b.mo27437e(vhb2.f49252d, vhb2.f49253e).f48366m;
        DriveId driveId = vhb2.f49249a;
        if (driveId != null) {
            long j2 = driveId.f30729b;
            if (j2 > 0) {
                ukk = ukk.m38862a(j2);
                uhj uhj = this.f49296a;
                if (driveId == null) {
                    str = driveId.f30728a;
                } else {
                    str = null;
                }
                umn umn = new umn(uhj, -1, ukk, str, vhb2.f49250b, j, System.currentTimeMillis(), UUID.randomUUID().toString(), 0, false, false, 0);
                umn.mo27725t();
                return umn;
            }
        }
        ukk = null;
        uhj uhj2 = this.f49296a;
        if (driveId == null) {
        }
        umn umn2 = new umn(uhj2, -1, ukk, str, vhb2.f49250b, j, System.currentTimeMillis(), UUID.randomUUID().toString(), 0, false, false, 0);
        umn2.mo27725t();
        return umn2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final umn mo28475c(vhb vhb) {
        ujl e = this.f49297b.mo27437e(vhb.f49252d, vhb.f49253e);
        if (e == null) {
            return null;
        }
        long j = e.f48366m;
        uog[] uogArr = new uog[2];
        ArrayList arrayList = new ArrayList();
        DriveId driveId = vhb.f49249a;
        if (driveId != null) {
            String str = driveId.f30728a;
            if (str != null) {
                arrayList.add(ump.RESOURCE_ID.f48247n.mo27708b(str));
            }
            long j2 = driveId.f30729b;
            if (j2 != 0) {
                arrayList.add(ump.ENTRY_ID.f48247n.mo27717e(j2));
            }
        }
        if (vhb.f49250b != null) {
            arrayList.add(ump.LOCAL_ID.f48247n.mo27708b(vhb.f49250b));
        }
        uogArr[0] = uoh.m39071b(arrayList);
        uogArr[1] = ump.DRIVE_APP_ID.f48247n.mo27717e(j);
        Cursor a = this.f49296a.mo27468a(umq.f48248a.mo27735b(), (String[]) null, uoh.m39066a(uogArr), (String) null);
        try {
            if (a.getCount() == 1) {
                a.moveToFirst();
                return umn.m38963a(this.f49296a, a);
            }
            f49295c.mo25371b("No cached realtime content.");
            a.close();
            return null;
        } finally {
            a.close();
        }
    }

    /* renamed from: a */
    public final void mo28472a(List list) {
        this.f49296a.mo27476b();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                umn c = mo28475c((vhb) it.next());
                if (c != null) {
                    c.mo27726u();
                }
            }
            this.f49296a.mo27480f();
        } finally {
            this.f49296a.mo27478d();
            vhr.m40449a(this.f49298d, this.f49297b);
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo28473a(vhb vhb) {
        return mo28475c(vhb) != null;
    }
}
