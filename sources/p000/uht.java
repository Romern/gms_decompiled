package p000;

import android.database.Cursor;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.drive.UserMetadata;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: uht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uht extends ugx implements uhl {

    /* renamed from: c */
    private final uhp f47662c;

    /* renamed from: d */
    private final uhr f47663d = new uhr();

    public uht(uhj uhj, uhp uhp, Executor executor) {
        super(uhj, executor);
        this.f47662c = uhp;
    }

    /* renamed from: a */
    public final long mo27354a(UserMetadata userMetadata) {
        mo27495d();
        return super.mo27354a(userMetadata);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ List mo27356a(Long l) {
        throw null;
    }

    /* renamed from: a */
    public final List mo27357a(uey uey, String str, String str2, boolean z) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final uhp mo27362a() {
        return this.f47662c;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
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
    /* renamed from: b */
    public final ujp mo27379b(uih uih, String str) {
        uhq a = this.f47663d.mo27490a(uih);
        sdo.m34959a(a);
        sdo.m34966a((Object) str, (Object) "Can't create a DriveIdMapping for a local entry in TransactionDriveModel");
        sdo.m34971a(!a.mo27488a(str), (Object) "Can't create a DriveIdMapping that's already in the cache");
        ujp b = super.mo27379b(uih, str);
        a.mo27487a(b);
        return b;
    }

    /* renamed from: c */
    public final List mo27384c(uif uif) {
        mo27495d();
        return super.mo27384c(uif);
    }

    /* renamed from: d */
    public final List mo27386d(uif uif) {
        mo27495d();
        return super.mo27386d(uif);
    }

    /* renamed from: e */
    public final List mo27387e(uif uif) {
        mo27495d();
        return super.mo27387e(uif);
    }

    /* renamed from: c */
    public final ujx mo27385c(uih uih, String str) {
        uhq a = this.f47663d.mo27490a(uih);
        sdo.m34959a(a);
        ujx ujx = (ujx) a.f47656b.f47660a.get(str);
        if (ujx != null) {
            return ujx;
        }
        ujx c = super.mo27385c(uih, str);
        if (c != null) {
            a.f47656b.mo27491a(c);
        }
        return c;
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
    /* renamed from: d */
    public final void mo27495d() {
        sdo.m34971a(this.f47662c.f47653b, (Object) "This drive model is not active");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ugx.a(uif, java.lang.String, boolean):java.util.List
     arg types: [uif, ?[OBJECT, ARRAY], int]
     candidates:
      uht.a(uih, java.lang.String, java.lang.String):ujx
      ugx.a(java.lang.String, boolean, uog):java.util.Set
      ugx.a(uih, java.lang.String, java.lang.String):ujx
      ugx.a(uif, java.lang.String, java.lang.String):uot
      uhl.a(uih, java.lang.String, java.lang.String):ujx
      uhl.a(uif, java.lang.String, java.lang.String):uot
      uhl.a(uih, java.lang.String, java.lang.String):ujx
      uhl.a(uif, java.lang.String, java.lang.String):uot
      ugx.a(uif, java.lang.String, boolean):java.util.List */
    /* renamed from: a */
    public final List mo27358a(uif uif, String str, boolean z) {
        mo27495d();
        return super.mo27358a(uif, (String) null, true);
    }

    /* renamed from: a */
    public final ujp mo27368a(uih uih, String str) {
        uhq a = this.f47663d.mo27490a(uih);
        sdo.m34959a(a);
        ujp ujp = (ujp) a.f47657c.get(str);
        if (ujp != null) {
            return ujp;
        }
        ujp a2 = super.mo27368a(uih, str);
        if (a2 != null) {
            a.mo27487a(a2);
        }
        return a2;
    }

    /* renamed from: b */
    public final ukt mo27380b(uif uif) {
        mo27495d();
        return super.mo27380b(uif);
    }

    /* renamed from: b */
    public final uos mo27494b(String str) {
        uos uos;
        boolean z;
        if (this.f47663d.f47658a.containsKey(str)) {
            return this.f47663d.mo27489a(str).f47655a;
        }
        uhj uhj = this.f47578a;
        Cursor a = uhj.mo27470a(this.f47662c, uim.f47706a.mo27735b(), (String[]) null, uil.ACCOUNT_HOLDER_NAME.f47705l.mo27708b(str), (String) null);
        try {
            if (a.moveToFirst()) {
                uij a2 = uij.m38677a(uhj, a);
                uos = new uos(new vdx(this, new uih(str, a2.f48366m)), a2);
            } else {
                a.close();
                uos = null;
            }
            uhr uhr = this.f47663d;
            if (uos != null) {
                z = true;
            } else {
                z = false;
            }
            sdo.m34974b(z);
            sdo.m34970a(true ^ uhr.f47658a.containsKey(uos.mo27781d()));
            uhq uhq = new uhq(uos);
            uhr.f47658a.put(uos.mo27781d(), uhq);
            uhr.f47659b.mo15540b(uos.mo27782e().f47683b, uhq);
            return uos;
        } finally {
            a.close();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
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
    /* renamed from: a */
    public final ujx mo27370a(uih uih, String str, String str2) {
        uhq a = this.f47663d.mo27490a(uih);
        sdo.m34959a(a);
        sdo.m34966a((Object) str2, (Object) "Can't create a local entry in TransactionDriveModel");
        sdo.m34971a(!a.f47656b.mo27492a(str2), (Object) "Can't create an entry that's already in the cache");
        ujx a2 = super.mo27370a(uih, str, str2);
        a.f47656b.mo27491a(a2);
        return a2;
    }

    /* renamed from: a */
    public final unk mo27371a(long j) {
        throw new IllegalStateException("Method not supported in a transaction drive model");
    }

    /* renamed from: a */
    public final void mo27410a(Runnable runnable) {
        mo27495d();
        runnable.run();
    }

    /* renamed from: b */
    public final void mo27425b(unq unq) {
        mo27495d();
        sdo.m34970a(unq.f48336ao);
        sdo.m34975b(!unq.f48335an.equals(ukn.f48023a), "Entries should be marked as deleted on the server, but never deleted directly.");
        this.f47578a.mo27464a(this.f47662c, unq.f48335an, unq.mo27514a());
        unq.mo27724s();
    }

    /* renamed from: a */
    public final void mo27374a(ujx ujx, long j) {
        mo27495d();
        super.mo27374a(ujx, j);
    }

    /* renamed from: a */
    public final void mo27375a(ujx ujx, Set set) {
        mo27495d();
        super.mo27375a(ujx, set);
    }

    /* renamed from: a */
    public final void mo27377a(ukk ukk, long j) {
        mo27495d();
        super.mo27377a(ukk, j);
    }

    /* renamed from: a */
    public final void mo27414a(unq unq) {
        mo27495d();
        if (unq.f48336ao) {
            this.f47578a.mo27474a(this.f47662c, unq.f48335an, unq.mo27514a(), unq.mo27723r());
        } else {
            unq.mo27722c(this.f47578a.mo27466a(this.f47662c, unq.f48335an, unq.mo27723r()));
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo27493a(uos uos, Collection collection) {
        mo27495d();
        uhq a = this.f47663d.mo27489a(uos.mo27781d());
        sdo.m34970a(a != null);
        uih e = uos.mo27782e();
        uhs uhs = a.f47656b;
        HashSet<String> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet<Pair> hashSet3 = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            vkr vkr = (vkr) it.next();
            String g = vkr.mo28572g();
            if (!uhs.mo27492a(g)) {
                hashSet.add(g);
            }
            if (!vkr.mo28568c()) {
                hashSet3.add(Pair.create(vkr.mo28572g(), vkr.mo28582q()));
                hashSet.addAll(vkr.mo28570e());
            } else {
                hashSet2.add(vkr.mo28572g());
            }
        }
        Cursor a2 = mo27355a(e, "EntryView", voz.m40967a(ujr.RESOURCE_ID.f47814c.mo27700a(), hashSet), (String) null, (String[]) null);
        uhj uhj = this.f47578a;
        uhz uhz = this.f47579b;
        HashSet<ujx> hashSet4 = new HashSet();
        while (a2.moveToNext()) {
            try {
                hashSet4.add(uhz.mo27496a(uhj, a2));
            } catch (NullPointerException e2) {
                Log.e("TransactionDriveModel", "Queried entry could not be loaded.", e2);
            } catch (Throwable th) {
                a2.close();
                throw th;
            }
        }
        a2.close();
        for (ujx ujx : hashSet4) {
            uhs.mo27491a(ujx);
            a.mo27487a(ujx.f47827c);
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            vkr vkr2 = (vkr) it2.next();
            if (!vkr2.mo28568c() && !uhs.mo27492a(vkr2.mo28572g()) && vkr2.mo28550L() != null && vkr2.mo28551M() != null && vkr2.mo28547I()) {
                uey a3 = uey.m38255a(e);
                List<ujx> a4 = super.mo27357a(a3, vkr2.mo28550L(), vkr2.mo28551M(), vkr2.mo28547I());
                uhq a5 = this.f47663d.mo27490a(a3.f47394a);
                if (a5 != null) {
                    uhs uhs2 = a5.f47656b;
                    ArrayList arrayList = new ArrayList();
                    for (ujx ujx2 : a4) {
                        ujx ujx3 = (ujx) uhs2.f47661b.get(ujx2.mo27582b());
                        if (ujx3 != null) {
                            ujx2 = ujx3;
                        }
                        arrayList.add(ujx2);
                    }
                    a4 = Collections.unmodifiableList(arrayList);
                }
                if (!a4.isEmpty()) {
                    ujx ujx4 = (ujx) a4.get(0);
                    ujx4.mo27585b(vkr2.mo28572g());
                    uhs.mo27491a(ujx4);
                    a.mo27487a(ujx4.f47827c);
                }
            }
        }
        uog a6 = uoh.m39066a(voz.m40974b(e.f47683b), voz.m40967a(ujr.RESOURCE_ID.f47814c.mo27700a(), hashSet), uoh.m39060a(String.format(Locale.US, "%s NOT IN (SELECT %s FROM %s)", ujs.f47815a.f48341a.mo27700a(), ukm.ENTRY_ID.f48022aB.mo27700a(), ukn.f48023a.mo27735b())));
        HashSet<ujp> hashSet5 = new HashSet();
        Cursor a7 = this.f47578a.mo27470a(this.f47662c, ujs.f47815a.mo27735b(), (String[]) null, a6, (String) null);
        while (a7.moveToNext()) {
            try {
                hashSet5.add(ujp.m38710a(this.f47578a, a7));
            } catch (Throwable th2) {
                a7.close();
                throw th2;
            }
        }
        a7.close();
        for (ujp ujp : hashSet5) {
            if (!a.mo27488a(ujp.f47810b)) {
                a.mo27487a(ujp);
            }
        }
        for (String str : hashSet) {
            if (!a.mo27488a(str) && !hashSet2.contains(str)) {
                mo27379b(e, str);
            }
        }
        for (Pair pair : hashSet3) {
            String str2 = (String) pair.first;
            String str3 = (String) pair.second;
            if (!uhs.mo27492a(str2)) {
                mo27370a(e, str3, str2);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo27378a(uey uey, uif uif) {
        throw new IllegalStateException("Method not supported in a transaction drive model");
    }
}
