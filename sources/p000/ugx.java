package p000;

import android.database.Cursor;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.UserMetadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: ugx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ugx implements uhl, vdz {

    /* renamed from: a */
    public final uhj f47578a;

    /* renamed from: b */
    public final uhz f47579b = new uhz(this, this.f47581d, this.f47580c);

    /* renamed from: c */
    private final Executor f47580c;

    /* renamed from: d */
    private final uhu f47581d = new uhu(this);

    protected ugx(uhj uhj, Executor executor) {
        sdo.m34959a(uhj);
        this.f47578a = uhj;
        sdo.m34959a(executor);
        this.f47580c = executor;
    }

    /* renamed from: a */
    protected static Object m38384a(uig uig) {
        try {
            if (!uig.isEmpty()) {
                return uig.get(0);
            }
            uig.close();
            return null;
        } finally {
            uig.close();
        }
    }

    /* renamed from: b */
    public static Object m38386b(uig uig) {
        try {
            if (uig.isEmpty()) {
                uig.close();
                return null;
            } else if (uig.size() == 1) {
                return uig.get(0);
            } else {
                int size = uig.size();
                StringBuilder sb = new StringBuilder(59);
                sb.append("Result list has ");
                sb.append(size);
                sb.append(" items, but only 1 was expected.");
                throw new IllegalArgumentException(sb.toString());
            }
        } finally {
            uig.close();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract uhp mo27362a();

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public final long mo27383c() {
        long j;
        uhj uhj = this.f47578a;
        uhp a = mo27362a();
        AtomicLong atomicLong = uhj.f47640e;
        if (atomicLong == null) {
            synchronized (uhj) {
                atomicLong = uhj.f47640e;
                if (atomicLong == null) {
                    String a2 = ukm.SEQUENCE_NUMBER.f48022aB.mo27700a();
                    Cursor a3 = uhj.mo27471a(a, ukn.f48023a.mo27735b(), new String[]{a2}, null, null, String.valueOf(a2).concat(" DESC"), "1");
                    try {
                        if (a3.moveToFirst()) {
                            j = a3.getLong(0);
                        } else {
                            j = 0;
                        }
                        a3.close();
                        atomicLong = new AtomicLong(j);
                        uhj.f47640e = atomicLong;
                    } catch (Throwable th) {
                        a3.close();
                        throw th;
                    }
                }
            }
        }
        return atomicLong.incrementAndGet();
    }

    /* renamed from: d */
    public List mo27386d(uif uif) {
        if (!uif.mo27498a()) {
            return Collections.EMPTY_LIST;
        }
        return mo27363a(this.f47578a.mo27470a(mo27362a(), unf.f48306a.mo27735b(), (String[]) null, une.ENTRY_ID.f48305d.mo27717e(uif.f47676a.longValue()), String.valueOf(une.VERSION.f48305d.mo27700a()).concat(" DESC")), uid.f47674a).mo27502a();
    }

    /* renamed from: e */
    public List mo27387e(uif uif) {
        if (!uif.mo27498a()) {
            return Collections.EMPTY_LIST;
        }
        return mo27363a(this.f47578a.mo27470a(mo27362a(), umq.f48248a.mo27735b(), (String[]) null, ump.ENTRY_ID.f48247n.mo27717e(uif.f47676a.longValue()), (String) null), uic.f47673a).mo27502a();
    }

    /* renamed from: a */
    private final List m38385a(Cursor cursor) {
        uig a = mo27363a(cursor, uhw.f47666a);
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = a.iterator();
            while (it.hasNext()) {
                uje uje = (uje) it.next();
                arrayList.add(new uot(new vdy(this, uje.f47757a, uje.f47759c, uje.f47758b), uje));
            }
            return arrayList;
        } finally {
            a.close();
        }
    }

    /* renamed from: a */
    public long mo27354a(UserMetadata userMetadata) {
        unk unk;
        boolean z;
        Cursor a = this.f47578a.mo27470a(mo27362a(), unn.f48330a.mo27735b(), (String[]) null, unm.PERMISSIONS_ID.f48329f.mo27708b(userMetadata.f30749a), (String) null);
        try {
            boolean z2 = true;
            if (a.moveToFirst()) {
                unk = unk.m38984a(this.f47578a, a);
                String str = userMetadata.f30749a;
                String str2 = userMetadata.f30750b;
                String str3 = userMetadata.f30751c;
                boolean z3 = userMetadata.f30752d;
                String str4 = userMetadata.f30753e;
                if (!sdg.m34949a(unk.f48318a, str)) {
                    sdo.m34959a((Object) str);
                    unk.f48318a = str;
                    z = true;
                } else {
                    z = false;
                }
                if (!sdg.m34949a(unk.f48319b, str2)) {
                    unk.f48319b = str2;
                    z = true;
                }
                if (!sdg.m34949a(unk.f48320c, str3)) {
                    unk.f48320c = str3;
                    z = true;
                }
                if (unk.f48321d != z3) {
                    unk.f48321d = z3;
                    z = true;
                }
                if (sdg.m34949a(unk.f48322e, str4)) {
                    z2 = z;
                } else {
                    unk.f48322e = str4;
                }
            } else {
                unk = new unk(this.f47578a, -1, userMetadata.f30749a, userMetadata.f30750b, userMetadata.f30751c, userMetadata.f30752d, userMetadata.f30753e);
            }
            if (z2) {
                mo27414a(unk);
            }
            return unk.f48366m;
        } finally {
            a.close();
        }
    }

    /* renamed from: b */
    public ujp mo27379b(uih uih, String str) {
        return new ujp(this.f47578a, -1, uih.f47683b, str);
    }

    /* renamed from: b */
    public ukt mo27380b(uif uif) {
        if (!uif.mo27498a()) {
            return null;
        }
        long longValue = uif.f47676a.longValue();
        if (longValue < 0) {
            return null;
        }
        Cursor a = this.f47578a.mo27470a(mo27362a(), uld.f48108a.mo27735b(), (String[]) null, ulc.ENTRY_ID.f48107O.mo27717e(longValue), (String) null);
        try {
            if (a.moveToFirst()) {
                return ukt.m38871a(this.f47578a, a);
            }
            a.close();
            return null;
        } finally {
            a.close();
        }
    }

    /* renamed from: c */
    public List mo27384c(uif uif) {
        if (!uif.mo27498a()) {
            return Collections.EMPTY_LIST;
        }
        return mo27359a(uke.ENTRY_ID.f47867m.mo27717e(uif.f47676a.longValue()));
    }

    /* renamed from: c */
    public ujx mo27385c(uih uih, String str) {
        return mo27369a(uey.m38255a(uih), "EntryView", "ScopedEntryView", voz.m40963a(uih.f47683b, str));
    }

    /* renamed from: b */
    public final void mo27381b(long j) {
        this.f47578a.mo27464a(mo27362a(), ulh.f48116a, ulg.CHILD_ENTRY_ID.f48115c.mo27717e(j));
        this.f47578a.mo27464a(mo27362a(), ulh.f48116a, ulg.PARENT_ENTRY_ID.f48115c.mo27717e(j));
    }

    /* renamed from: b */
    public final boolean mo27382b() {
        return this.f47578a.mo27472a().inTransaction();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Cursor mo27355a(uih uih, String str, uog uog, String str2, String[] strArr) {
        uog uog2;
        if (uih != null) {
            uog2 = uoh.m39066a(voz.m40974b(uih.f47683b), uog);
        } else {
            uog2 = uog;
        }
        return this.f47578a.mo27470a(mo27362a(), str, strArr, uog2, str2);
    }

    /* renamed from: a */
    public List mo27356a(Long l) {
        return m38385a(this.f47578a.mo27470a(mo27362a(), ujh.f47771a.mo27735b(), (String[]) null, ujg.ACTION_ID.f47770h.mo27717e(l.longValue()), (String) null));
    }

    /* renamed from: a */
    public List mo27357a(uey uey, String str, String str2, boolean z) {
        return mo27364a(uey, "EntryView", "ScopedEntryView", voz.m40964a(uey.f47394a.f47683b, str, str2, z), String.valueOf(ujs.f47815a.f48341a.mo27700a()).concat(" ASC")).mo27502a();
    }

    /* renamed from: a */
    public List mo27358a(uif uif, String str, boolean z) {
        if (!uif.mo27498a()) {
            return Collections.EMPTY_LIST;
        }
        return m38385a(this.f47578a.mo27470a(mo27362a(), ujh.f47771a.mo27735b(), (String[]) null, voz.m40968a(Collections.singletonList(uif.f47676a), str, z), (String) null));
    }

    /* renamed from: a */
    public final List mo27359a(uog uog) {
        Cursor a = this.f47578a.mo27470a(mo27362a(), ukf.f47868a.mo27735b(), (String[]) null, uog, (String) null);
        ArrayList arrayList = new ArrayList();
        while (a.moveToNext()) {
            try {
                arrayList.add(new ukc(this.f47578a, ukf.f47868a.f48341a.mo27705b(a).longValue(), uke.ENTRY_ID.f47867m.mo27705b(a).longValue(), uke.PERMISSION_ID.f47867m.mo27702a(a), uke.ACCOUNT_IDENTIFIER.f47867m.mo27702a(a), uke.ACCOUNT_NAME.f47867m.mo27702a(a), uke.ACCOUNT_TYPE.f47867m.mo27705b(a).intValue(), uke.PHOTO_LINK.f47867m.mo27702a(a), uke.ROLE.f47867m.mo27705b(a).intValue(), uke.GENOA_ROLE_VALUE.f47867m.mo27705b(a), uke.GENOA_ROLE_ACTION_ID.f47867m.mo27705b(a), uke.IS_LINK_REQUIRED.f47867m.mo27718e(a), uke.GENOA_IS_LINK_REQUIRED_VALUE.f47867m.mo27713d(a), uke.GENOA_IS_LINK_REQUIRED_ACTION_ID.f47867m.mo27705b(a)));
            } finally {
                a.close();
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final Set mo27360a(String str, boolean z, uog uog) {
        int i;
        int i2;
        String a = ujs.f47815a.f48341a.mo27700a();
        String a2 = ujr.RESOURCE_ID.f47814c.mo27700a();
        String a3 = ukm.MIME_TYPE.f48022aB.mo27700a();
        Cursor a4 = this.f47578a.mo27471a(mo27362a(), str, z ? new String[]{a, a2, a3} : new String[]{a, a2}, uog, a, null, null);
        HashSet hashSet = new HashSet();
        int columnIndexOrThrow = a4.getColumnIndexOrThrow(a);
        int columnIndexOrThrow2 = a4.getColumnIndexOrThrow(a2);
        if (z) {
            i = a4.getColumnIndexOrThrow(a3);
        } else {
            i = 0;
        }
        long g = this.f47578a.mo27481g();
        while (a4.moveToNext()) {
            try {
                if (z) {
                    i2 = "application/vnd.google-apps.folder".equals(a4.getString(i)) ? 1 : 0;
                } else {
                    i2 = -1;
                }
                hashSet.add(new DriveId(a4.getString(columnIndexOrThrow2), a4.getLong(columnIndexOrThrow), g, i2));
            } finally {
                a4.close();
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public final Set mo27361a(uey uey, ujx ujx) {
        String str;
        sdo.m34959a(uey);
        sdo.m34959a(ujx);
        uog a = uoh.m39066a(voz.m40970a(uey), ulg.CHILD_ENTRY_ID.f48115c.mo27717e(ujx.mo27613h()));
        if (uey.mo27263a()) {
            str = "ParentDriveIdView";
        } else {
            str = !uey.mo27267d() ? "ParentEntryView" : "ScopedParentEntryView";
        }
        return mo27360a(str, !uey.mo27263a(), a);
    }

    /* renamed from: a */
    public final uig mo27363a(Cursor cursor, uhx uhx) {
        return new uig(this.f47578a, cursor, uhx);
    }

    /* renamed from: a */
    public final uig mo27364a(uey uey, String str, String str2, uog uog, String str3) {
        sdo.m34959a(uey);
        if (uey.mo27267d()) {
            str = str2;
        }
        return mo27365a(uey.f47394a, str, uoh.m39066a(uog, voz.m40970a(uey)), str3);
    }

    /* renamed from: a */
    public final uig mo27365a(uih uih, String str, uog uog, String str2) {
        return mo27363a(mo27355a(uih, str, uog, str2, (String[]) null), this.f47579b);
    }

    /* renamed from: a */
    public final uig mo27366a(ujx ujx, uog uog) {
        return mo27363a(this.f47578a.mo27470a(mo27362a(), ukb.f47839a.mo27735b(), (String[]) null, uoh.m39066a(uog, uka.ENTRY_ID.f47838c.mo27717e(ujx.mo27613h())), (String) null), new uhy(ujx));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final uij mo27367a(String str) {
        uhj uhj = this.f47578a;
        Cursor a = uhj.mo27470a(mo27362a(), uim.f47706a.mo27735b(), (String[]) null, uil.ACCOUNT_HOLDER_NAME.f47705l.mo27708b(str), (String) null);
        try {
            if (a.moveToFirst()) {
                return uij.m38677a(uhj, a);
            }
            a.close();
            return null;
        } finally {
            a.close();
        }
    }

    /* renamed from: a */
    public ujp mo27368a(uih uih, String str) {
        sdo.m34959a((Object) str);
        Cursor a = this.f47578a.mo27470a(mo27362a(), ujs.f47815a.mo27735b(), (String[]) null, uoh.m39066a(ujr.ACCOUNT_ID.f47814c.mo27717e(uih.f47683b), ujr.RESOURCE_ID.f47814c.mo27708b(str)), (String) null);
        try {
            if (a.moveToFirst()) {
                return ujp.m38710a(this.f47578a, a);
            }
            a.close();
            return null;
        } finally {
            a.close();
        }
    }

    /* renamed from: a */
    public final ujx mo27369a(uey uey, String str, String str2, uog uog) {
        return (ujx) m38384a(mo27364a(uey, str, str2, uog, (String) null));
    }

    /* renamed from: a */
    public ujx mo27370a(uih uih, String str, String str2) {
        ujp ujp;
        ujp ujp2;
        if (str2 != null) {
            ujp = mo27368a(uih, str2);
        } else {
            ujp = null;
        }
        if (ujp == null) {
            ujp2 = mo27379b(uih, str2);
        } else {
            ujp2 = ujp;
        }
        uhj uhj = this.f47578a;
        ujx ujx = new ujx(uhj, mo27373a(new uif(null)), this.f47581d, this.f47580c, ujp2, new ukg(uhj, ujp2.f48366m, false));
        ujx.mo27611g(str);
        return ujx;
    }

    /* renamed from: a */
    public unk mo27371a(long j) {
        return (unk) m38386b(mo27363a(this.f47578a.mo27470a(mo27362a(), unn.f48330a.mo27735b(), (String[]) null, unn.f48330a.f48341a.mo27717e(j), (String) null), uie.f47675a));
    }

    /* renamed from: a */
    public final uot mo27372a(uif uif, String str, String str2) {
        return new uot(new vdy(this, uif, str, str2), new uje(this.f47578a, uif, str, str2));
    }

    /* renamed from: a */
    public final vea mo27373a(uif uif) {
        return new vea(this, uif);
    }

    /* renamed from: a */
    public void mo27374a(ujx ujx, long j) {
        mo27414a(new ule(this.f47578a, ujx.mo27613h(), j));
    }

    /* renamed from: a */
    public void mo27375a(ujx ujx, Set set) {
        sdo.m34975b(ujx.mo27641x(), "entry must be saved to database before authorized apps are set");
        mo27410a(new ugw(this, ujx, set));
    }

    /* renamed from: a */
    public final void mo27376a(ukg ukg, boolean z) {
        long c = mo27383c();
        ukg.f47907aj = c;
        if (z) {
            ukg.f47908ak = c;
        }
        mo27414a(ukg);
    }

    /* renamed from: a */
    public void mo27377a(ukk ukk, long j) {
        uog e = ulg.CHILD_ENTRY_ID.f48115c.mo27717e(ukk.f47941a);
        uog e2 = ulg.PARENT_ENTRY_ID.f48115c.mo27717e(j);
        this.f47578a.mo27464a(mo27362a(), ulh.f48116a, uoh.m39066a(e, e2));
    }

    /* renamed from: a */
    public boolean mo27378a(uey uey, uif uif) {
        if (!uif.mo27498a() || mo27369a(uey, "EntryView", "ScopedEntryView", voz.m40961a(uey.f47394a.f47683b, uif.f47676a.longValue())) == null) {
            return false;
        }
        return true;
    }
}
