package p000;

import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteConstraintException;
import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ugz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ugz extends ugx implements uhn {

    /* renamed from: c */
    public static final sbw f47585c = new sbw("DatabaseModelLoader", "");

    /* renamed from: d */
    private final uii f47586d = new uii();

    public ugz(uhj uhj, Executor executor) {
        super(uhj, executor);
        uhj uhj2 = this.f47578a;
        uhe uhe = new uhe(uhj2);
        if (uhj2.f47638c.compareAndSet(null, uhe)) {
            new uhg("Open database in background", uhe).start();
        }
    }

    /* renamed from: a */
    public static String m38421a(Collection collection, String str) {
        if (collection == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = collection.iterator();
        boolean z = true;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!z) {
                sb.append(str);
            }
            sb.append(DatabaseUtils.sqlEscapeString(str2));
            z = false;
        }
        return sb.toString();
    }

    /* renamed from: b */
    private static final boolean m38425b(ujx ujx, String str) {
        return ujx.mo27641x() && ujx.mo27538P().equals(str) && ujx.mo27574aj().equals(bnic.m109489a(DriveSpace.f30734a)) && ujx.mo27524B();
    }

    /* renamed from: d */
    public static final String m38427d(uey uey) {
        return !uey.mo27267d() ? "MetadataView" : "ScopedMetadataView";
    }

    /* renamed from: h */
    private final long m38428h(String str) {
        Cursor a = this.f47578a.mo27468a(str, (String[]) null, (uog) null, (String) null);
        try {
            if (a.moveToFirst() && !a.isNull(0)) {
                return a.getLong(0);
            }
            a.close();
            return 0;
        } finally {
            a.close();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final uhp mo27362a() {
        return null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ugz.a(uih, boolean):java.util.Set
     arg types: [uih, int]
     candidates:
      ugz.a(java.util.Collection, java.lang.String):java.lang.String
      ugz.a(uog, boolean):uey
      ugz.a(uih, com.google.android.gms.drive.DriveId):java.lang.String
      ugz.a(ujx, boolean):java.lang.String
      ugz.a(uih, uzz):java.util.List
      ugz.a(long, java.lang.String):uey
      ugz.a(java.lang.String, uog):uig
      ugz.a(uih, long):uig
      ugz.a(long, com.google.android.gms.drive.auth.AppIdentity):uin
      ugz.a(uey, com.google.android.gms.drive.DriveId):ujx
      ugz.a(uey, java.lang.String):ujx
      ugz.a(uey, ukk):ujx
      ugz.a(ujx, java.lang.String):ukc
      ugx.a(uey, ujx):java.util.Set
      ugx.a(android.database.Cursor, uhx):uig
      ugx.a(ujx, uog):uig
      ugx.a(uih, java.lang.String):ujp
      ugx.a(ujx, long):void
      ugx.a(ujx, java.util.Set):void
      ugx.a(ukg, boolean):void
      ugx.a(ukk, long):void
      ugx.a(uey, uif):boolean
      uhl.a(uey, ujx):java.util.Set
      uhl.a(uih, java.lang.String):ujp
      uhl.a(ujx, long):void
      uhl.a(ujx, java.util.Set):void
      uhl.a(ukg, boolean):void
      uhl.a(ukk, long):void
      uhl.a(uey, uif):boolean
      uhn.a(uih, com.google.android.gms.drive.DriveId):java.lang.String
      uhn.a(ujx, boolean):java.lang.String
      uhn.a(uih, uzz):java.util.List
      uhn.a(long, java.lang.String):uey
      uhn.a(uih, long):uig
      uhn.a(uey, com.google.android.gms.drive.DriveId):ujx
      uhn.a(uey, java.lang.String):ujx
      uhn.a(uey, ukk):ujx
      uhn.a(ujx, java.lang.String):ukc
      uhl.a(uey, ujx):java.util.Set
      uhl.a(uih, java.lang.String):ujp
      uhl.a(ujx, long):void
      uhl.a(ujx, java.util.Set):void
      uhl.a(ukg, boolean):void
      uhl.a(ukk, long):void
      uhl.a(uey, uif):boolean
      ugz.a(uih, boolean):java.util.Set */
    /* renamed from: e */
    public final Set mo27436e(uih uih) {
        return m38422a(uih, true);
    }

    /* renamed from: f */
    public final ujl mo27441f(long j) {
        uog e = ujo.f47807a.f48341a.mo27717e(j);
        uhj uhj = this.f47578a;
        Cursor a = uhj.mo27468a(ujo.f47807a.mo27735b(), (String[]) null, e, (String) null);
        try {
            if (a.moveToFirst()) {
                return ujl.m38703a(uhj, a);
            }
            throw new AssertionError("Drive App row must exist due to foreign key constraint");
        } finally {
            a.close();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ugz.a(uog, boolean):uey
     arg types: [uog, int]
     candidates:
      ugz.a(java.util.Collection, java.lang.String):java.lang.String
      ugz.a(uih, boolean):java.util.Set
      ugz.a(uih, com.google.android.gms.drive.DriveId):java.lang.String
      ugz.a(ujx, boolean):java.lang.String
      ugz.a(uih, uzz):java.util.List
      ugz.a(long, java.lang.String):uey
      ugz.a(java.lang.String, uog):uig
      ugz.a(uih, long):uig
      ugz.a(long, com.google.android.gms.drive.auth.AppIdentity):uin
      ugz.a(uey, com.google.android.gms.drive.DriveId):ujx
      ugz.a(uey, java.lang.String):ujx
      ugz.a(uey, ukk):ujx
      ugz.a(ujx, java.lang.String):ukc
      ugx.a(uey, ujx):java.util.Set
      ugx.a(android.database.Cursor, uhx):uig
      ugx.a(ujx, uog):uig
      ugx.a(uih, java.lang.String):ujp
      ugx.a(ujx, long):void
      ugx.a(ujx, java.util.Set):void
      ugx.a(ukg, boolean):void
      ugx.a(ukk, long):void
      ugx.a(uey, uif):boolean
      uhl.a(uey, ujx):java.util.Set
      uhl.a(uih, java.lang.String):ujp
      uhl.a(ujx, long):void
      uhl.a(ujx, java.util.Set):void
      uhl.a(ukg, boolean):void
      uhl.a(ukk, long):void
      uhl.a(uey, uif):boolean
      uhn.a(uih, com.google.android.gms.drive.DriveId):java.lang.String
      uhn.a(ujx, boolean):java.lang.String
      uhn.a(uih, uzz):java.util.List
      uhn.a(long, java.lang.String):uey
      uhn.a(uih, long):uig
      uhn.a(uey, com.google.android.gms.drive.DriveId):ujx
      uhn.a(uey, java.lang.String):ujx
      uhn.a(uey, ukk):ujx
      uhn.a(ujx, java.lang.String):ukc
      uhl.a(uey, ujx):java.util.Set
      uhl.a(uih, java.lang.String):ujp
      uhl.a(ujx, long):void
      uhl.a(ujx, java.util.Set):void
      uhl.a(ukg, boolean):void
      uhl.a(ukk, long):void
      uhl.a(uey, uif):boolean
      ugz.a(uog, boolean):uey */
    /* renamed from: g */
    public final uey mo27444g(long j) {
        return m38423a(uiq.f47724a.f48341a.mo27717e(j), true);
    }

    /* renamed from: i */
    public final long mo27449i() {
        return m38428h("InternalCachedContentSizeView");
    }

    /* renamed from: j */
    public final long mo27451j() {
        return m38428h("SharedCachedContentSizeView");
    }

    /* renamed from: k */
    public final uig mo27452k() {
        return mo27394a("SharedCachedContentView", uoh.f48391a);
    }

    /* renamed from: c */
    private final void m38426c(long j, String str) {
        uog e = ulk.ACCOUNT_ID.f48128g.mo27717e(j);
        uog b = ulk.FEED_TYPE.f48128g.mo27708b(uzz.APPDATA.f48797f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2);
        sb.append("%");
        sb.append(str);
        sb.append("%");
        String sb2 = sb.toString();
        unp unp = ulk.FEED_PARAMETERS.f48128g;
        unp.mo27709b(2);
        this.f47578a.mo27465a(ull.f48129a, uoh.m39066a(e, b, uoh.m39082g(unp.mo27700a(), sb2)));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ugx.a(java.lang.String, boolean, uog):java.util.Set
     arg types: [java.lang.String, int, uog]
     candidates:
      ugz.a(uey, java.util.Set, uog):uig
      ugz.a(uih, long, long):uig
      ugz.a(uih, uzx, long):uli
      ugz.a(long, ukk, int):ums
      ugx.a(uif, java.lang.String, boolean):java.util.List
      ugx.a(uih, java.lang.String, java.lang.String):ujx
      ugx.a(uif, java.lang.String, java.lang.String):uot
      uhl.a(uif, java.lang.String, boolean):java.util.List
      uhl.a(uih, java.lang.String, java.lang.String):ujx
      uhl.a(uif, java.lang.String, java.lang.String):uot
      uhn.a(uey, java.util.Set, uog):uig
      uhn.a(uih, long, long):uig
      uhn.a(uih, uzx, long):uli
      uhn.a(long, ukk, int):ums
      uhl.a(uif, java.lang.String, boolean):java.util.List
      uhl.a(uih, java.lang.String, java.lang.String):ujx
      uhl.a(uif, java.lang.String, java.lang.String):uot
      ugx.a(java.lang.String, boolean, uog):java.util.Set */
    /* renamed from: b */
    public final Set mo27416b(uey uey, ujx ujx) {
        String str;
        if (uey.mo27263a()) {
            return Collections.emptySet();
        }
        String a = ujs.f47815a.f48341a.mo27700a();
        uog e = ulg.CHILD_ENTRY_ID.f48115c.mo27717e(ujx.mo27613h());
        uog a2 = uoh.m39066a(e, voz.m40970a(uey));
        if (!uey.mo27267d()) {
            str = "ParentEntryView";
        } else {
            str = "ScopedParentEntryView";
        }
        String str2 = a2.f48389a;
        int length = String.valueOf(a).length();
        int length2 = String.valueOf(a).length();
        StringBuilder sb = new StringBuilder(length + 30 + length2 + str.length() + String.valueOf(str2).length());
        sb.append(a);
        sb.append(" NOT IN (SELECT ");
        sb.append(a);
        sb.append(" FROM ");
        sb.append(str);
        sb.append(" WHERE ");
        sb.append(str2);
        sb.append(")");
        Set a3 = mo27360a("ParentEntryView", true, uoh.m39066a(e, uoh.m39064a(sb.toString(), a2.f48390b), ukm.IS_DELETED.f48022aB.mo27711c()));
        StringBuilder sb2 = new StringBuilder(String.valueOf(a).length() + 32 + String.valueOf(a).length());
        sb2.append(a);
        sb2.append(" NOT IN (SELECT ");
        sb2.append(a);
        sb2.append(" FROM EntryView)");
        return rsr.m34360a(a3, mo27360a("ParentDriveIdView", false, uoh.m39066a(uoh.m39060a(sb2.toString()), e)));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ugz.a(uih, boolean):java.util.Set
     arg types: [uih, int]
     candidates:
      ugz.a(java.util.Collection, java.lang.String):java.lang.String
      ugz.a(uog, boolean):uey
      ugz.a(uih, com.google.android.gms.drive.DriveId):java.lang.String
      ugz.a(ujx, boolean):java.lang.String
      ugz.a(uih, uzz):java.util.List
      ugz.a(long, java.lang.String):uey
      ugz.a(java.lang.String, uog):uig
      ugz.a(uih, long):uig
      ugz.a(long, com.google.android.gms.drive.auth.AppIdentity):uin
      ugz.a(uey, com.google.android.gms.drive.DriveId):ujx
      ugz.a(uey, java.lang.String):ujx
      ugz.a(uey, ukk):ujx
      ugz.a(ujx, java.lang.String):ukc
      ugx.a(uey, ujx):java.util.Set
      ugx.a(android.database.Cursor, uhx):uig
      ugx.a(ujx, uog):uig
      ugx.a(uih, java.lang.String):ujp
      ugx.a(ujx, long):void
      ugx.a(ujx, java.util.Set):void
      ugx.a(ukg, boolean):void
      ugx.a(ukk, long):void
      ugx.a(uey, uif):boolean
      uhl.a(uey, ujx):java.util.Set
      uhl.a(uih, java.lang.String):ujp
      uhl.a(ujx, long):void
      uhl.a(ujx, java.util.Set):void
      uhl.a(ukg, boolean):void
      uhl.a(ukk, long):void
      uhl.a(uey, uif):boolean
      uhn.a(uih, com.google.android.gms.drive.DriveId):java.lang.String
      uhn.a(ujx, boolean):java.lang.String
      uhn.a(uih, uzz):java.util.List
      uhn.a(long, java.lang.String):uey
      uhn.a(uih, long):uig
      uhn.a(uey, com.google.android.gms.drive.DriveId):ujx
      uhn.a(uey, java.lang.String):ujx
      uhn.a(uey, ukk):ujx
      uhn.a(ujx, java.lang.String):ukc
      uhl.a(uey, ujx):java.util.Set
      uhl.a(uih, java.lang.String):ujp
      uhl.a(ujx, long):void
      uhl.a(ujx, java.util.Set):void
      uhl.a(ukg, boolean):void
      uhl.a(ukk, long):void
      uhl.a(uey, uif):boolean
      ugz.a(uih, boolean):java.util.Set */
    /* renamed from: d */
    public final Set mo27431d(uih uih) {
        return m38422a(uih, false);
    }

    /* renamed from: e */
    public final ujl mo27437e(uih uih, String str) {
        uog a = uoh.m39066a(ujn.ACCOUNT_ID.f47806h.mo27717e(uih.f47683b), ujn.SDK_APP_ID.f47806h.mo27708b(str));
        uhj uhj = this.f47578a;
        Cursor a2 = uhj.mo27468a(ujo.f47807a.mo27735b(), (String[]) null, a, (String) null);
        try {
            if (a2.moveToFirst()) {
                return ujl.m38703a(uhj, a2);
            }
            a2.close();
            return null;
        } finally {
            a2.close();
        }
    }

    /* renamed from: g */
    public final void mo27445g() {
        sdo.m34974b(mo27382b());
        uhj uhj = this.f47578a;
        Cursor a = uhj.mo27468a(ujo.f47807a.mo27735b(), (String[]) null, uoh.m39060a(String.format("%s NOT IN (SELECT DISTINCT %s FROM %s)", ujo.f47807a.f48341a.mo27700a(), uip.DRIVE_APP_ID.f47723j.mo27700a(), uiq.f47724a.mo27735b())), (String) null);
        while (a.moveToNext()) {
            try {
                ujl a2 = ujl.m38703a(uhj, a);
                m38426c(a2.f47792a, a2.f47793b);
                a2.mo27726u();
            } finally {
                a.close();
            }
        }
    }

    /* renamed from: i */
    public final Set mo27450i(long j) {
        uhj uhj = this.f47578a;
        ArrayList arrayList = new ArrayList();
        ulc[] values = ulc.values();
        for (ulc ulc : values) {
            if (ulc.f48106N) {
                arrayList.add(ulc.f48107O.mo27717e(j));
            }
        }
        Cursor a = uhj.mo27468a(uld.f48108a.mo27735b(), (String[]) null, uoh.m39071b(arrayList), (String) null);
        try {
            HashSet hashSet = new HashSet(a.getCount());
            while (a.moveToNext()) {
                hashSet.add(ukt.m38871a(uhj, a));
            }
            return hashSet;
        } finally {
            a.close();
        }
    }

    /* renamed from: d */
    public final ujp mo27432d(long j) {
        ujp ujp = null;
        Cursor a = this.f47578a.mo27468a(ujs.f47815a.mo27735b(), (String[]) null, ujs.f47815a.f48341a.mo27717e(j), (String) null);
        try {
            if (a.moveToFirst()) {
                ujp = ujp.m38710a(this.f47578a, a);
            }
            return ujp;
        } finally {
            a.close();
        }
    }

    /* renamed from: a */
    private final Set m38422a(uih uih, boolean z) {
        uhj uhj = this.f47578a;
        HashSet hashSet = new HashSet();
        uog a = uoh.m39066a(ujn.ACCOUNT_ID.f47806h.mo27717e(uih.f47683b), ujn.IS_APPDATA_ROOT_PLACEHOLDER.f47806h.mo27704a(z));
        unp unp = ujn.SDK_APP_ID.f47806h;
        Cursor a2 = uhj.mo27468a(ujo.f47807a.mo27735b(), new String[]{unp.mo27700a()}, a, (String) null);
        while (a2.moveToNext()) {
            try {
                hashSet.add(unp.mo27702a(a2));
            } finally {
                a2.close();
            }
        }
        return hashSet;
    }

    /* renamed from: h */
    public final long mo27447h() {
        return m38428h("InternalContentSizeView");
    }

    /* renamed from: h */
    public final umd mo27448h(long j) {
        uhj uhj = this.f47578a;
        Cursor a = uhj.mo27468a(umk.f48215a.mo27735b(), (String[]) null, umk.f48215a.f48341a.mo27717e(j), (String) null);
        try {
            if (a.moveToFirst()) {
                return umd.m38952a(uhj, a);
            }
            a.close();
            return null;
        } finally {
            a.close();
        }
    }

    /* renamed from: c */
    public final long mo27426c(uih uih) {
        unp unp = ukm.SEQUENCE_NUMBER.f48022aB;
        uog b = voz.m40974b(uih.f47683b);
        Cursor a = this.f47578a.mo27469a("EntryView", new String[]{unp.mo27700a()}, b, String.valueOf(unp.mo27700a()).concat(" DESC"), "1");
        try {
            if (a.moveToFirst()) {
                return a.getLong(0);
            }
            a.close();
            return 0;
        } finally {
            a.close();
        }
    }

    /* renamed from: d */
    public final synchronized ujx mo27433d(uih uih, String str) {
        sdo.m34977c(str);
        ujx c = mo27385c(uih, "root");
        if (c != null && m38425b(c, str)) {
            return c;
        }
        mo27435d();
        try {
            ujx c2 = mo27385c(uih, "root");
            if (c2 == null) {
                c2 = mo27370a(uih, "application/vnd.google-apps.folder", "root");
            }
            if (!m38425b(c2, str)) {
                c2.mo27557a(str);
                c2.mo27622k(true);
                c2.mo27625l(false);
                c2.mo27562a(true);
                c2.mo27627m(false);
            }
            mo27442f();
            return c2;
        } finally {
            mo27439e();
        }
    }

    /* renamed from: f */
    public final void mo27442f() {
        this.f47578a.mo27480f();
    }

    /* renamed from: e */
    public final ulz mo27438e(long j) {
        return (ulz) ugx.m38386b(mo27363a(this.f47578a.mo27468a(umc.f48191a.mo27735b(), (String[]) null, umc.f48191a.f48341a.mo27717e(j), (String) null), uib.f47672a));
    }

    /* renamed from: f */
    public final void mo27443f(String str) {
        this.f47578a.mo27465a(ujd.f47755a, ujc.FILENAME.f47754b.mo27708b(str));
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: g */
    public final boolean mo27446g(String str) {
        Cursor a = this.f47578a.mo27468a("CannotDeleteFilenameView", (String[]) null, uoh.m39062a("filename", str), (String) null);
        try {
            boolean moveToFirst = a.moveToFirst();
            a.close();
            return !moveToFirst;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    /* renamed from: e */
    public final void mo27439e() {
        this.f47578a.mo27478d();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private final uey m38423a(uog uog, boolean z) {
        uhj uhj = this.f47578a;
        ArrayList arrayList = new ArrayList();
        Cursor a = uhj.mo27468a("AndroidAppView", (String[]) null, uog, (String) null);
        while (a.moveToNext()) {
            try {
                ujl a2 = ujl.m38703a(uhj, a);
                arrayList.add(new uey(mo27427c(a2.f47792a), a2.f47793b, uin.m38683a(uhj, a).f47709b, a2.f47794c, Collections.unmodifiableSet(a2.f47797f)));
            } catch (Throwable th) {
                a.close();
                throw th;
            }
        }
        a.close();
        if (arrayList.size() == 0) {
            return null;
        }
        if (!z || arrayList.size() <= 1) {
            return (uey) arrayList.get(0);
        }
        String valueOf = String.valueOf(arrayList);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 51);
        sb.append("Multiple apps present when expecting a single app: ");
        sb.append(valueOf);
        throw new AssertionError(sb.toString());
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public final uih mo27427c(long j) {
        uij uij;
        uih uih = (uih) this.f47586d.f47685b.get(Long.valueOf(j));
        if (uih != null) {
            return uih;
        }
        uhj uhj = this.f47578a;
        Cursor a = uhj.mo27468a(uim.f47706a.mo27735b(), (String[]) null, uim.f47706a.f48341a.mo27717e(j), (String) null);
        try {
            if (!a.moveToFirst()) {
                a.close();
                uij = null;
            } else {
                uij = uij.m38677a(uhj, a);
                a.close();
            }
            if (uij == null) {
                return null;
            }
            uih uih2 = new uih(uij.f47691f, uij.f48366m);
            this.f47586d.mo27509a(uih2);
            return uih2;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    /* renamed from: e */
    public final void mo27440e(String str) {
        try {
            new uja(this.f47578a, str).mo27725t();
        } catch (SQLiteConstraintException e) {
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ugz.a(uog, boolean):uey
     arg types: [uog, int]
     candidates:
      ugz.a(java.util.Collection, java.lang.String):java.lang.String
      ugz.a(uih, boolean):java.util.Set
      ugz.a(uih, com.google.android.gms.drive.DriveId):java.lang.String
      ugz.a(ujx, boolean):java.lang.String
      ugz.a(uih, uzz):java.util.List
      ugz.a(long, java.lang.String):uey
      ugz.a(java.lang.String, uog):uig
      ugz.a(uih, long):uig
      ugz.a(long, com.google.android.gms.drive.auth.AppIdentity):uin
      ugz.a(uey, com.google.android.gms.drive.DriveId):ujx
      ugz.a(uey, java.lang.String):ujx
      ugz.a(uey, ukk):ujx
      ugz.a(ujx, java.lang.String):ukc
      ugx.a(uey, ujx):java.util.Set
      ugx.a(android.database.Cursor, uhx):uig
      ugx.a(ujx, uog):uig
      ugx.a(uih, java.lang.String):ujp
      ugx.a(ujx, long):void
      ugx.a(ujx, java.util.Set):void
      ugx.a(ukg, boolean):void
      ugx.a(ukk, long):void
      ugx.a(uey, uif):boolean
      uhl.a(uey, ujx):java.util.Set
      uhl.a(uih, java.lang.String):ujp
      uhl.a(ujx, long):void
      uhl.a(ujx, java.util.Set):void
      uhl.a(ukg, boolean):void
      uhl.a(ukk, long):void
      uhl.a(uey, uif):boolean
      uhn.a(uih, com.google.android.gms.drive.DriveId):java.lang.String
      uhn.a(ujx, boolean):java.lang.String
      uhn.a(uih, uzz):java.util.List
      uhn.a(long, java.lang.String):uey
      uhn.a(uih, long):uig
      uhn.a(uey, com.google.android.gms.drive.DriveId):ujx
      uhn.a(uey, java.lang.String):ujx
      uhn.a(uey, ukk):ujx
      uhn.a(ujx, java.lang.String):ukc
      uhl.a(uey, ujx):java.util.Set
      uhl.a(uih, java.lang.String):ujp
      uhl.a(ujx, long):void
      uhl.a(ujx, java.util.Set):void
      uhl.a(ukg, boolean):void
      uhl.a(ukk, long):void
      uhl.a(uey, uif):boolean
      ugz.a(uog, boolean):uey */
    /* renamed from: b */
    public final uey mo27417b(long j, AppIdentity appIdentity) {
        return m38423a(voz.m40962a(j, appIdentity), true);
    }

    /* renamed from: d */
    public final ukp mo27434d(String str) {
        return (ukp) ugx.m38386b(mo27394a(uks.f48051a.mo27735b(), ukr.CONTENT_HASH.f48050k.mo27708b(str)));
    }

    /* renamed from: b */
    public final uij mo27418b(String str) {
        uij a = mo27367a(str);
        if (a != null) {
            return a;
        }
        AtomicReference atomicReference = new AtomicReference();
        mo27410a(new ugy(this, str, atomicReference));
        return (uij) atomicReference.get();
    }

    /* renamed from: d */
    public final void mo27435d() {
        this.f47578a.mo27476b();
    }

    /* renamed from: b */
    public final uin mo27419b(uey uey) {
        return mo27398a(uey.f47394a.f47683b, uey.f47396c);
    }

    /* renamed from: b */
    public final ujx mo27420b(uey uey, String str, String str2, boolean z) {
        return mo27369a(uey, "EntryView", "ScopedEntryView", uoh.m39066a(voz.m40964a(uey.f47394a.f47683b, str, str2, z), ukm.IS_DELETED.f48022aB.mo27711c()));
    }

    /* renamed from: c */
    public final uih mo27428c(String str) {
        uih uih = (uih) this.f47586d.f47684a.get(str);
        if (uih != null) {
            return uih;
        }
        uih uih2 = new uih(str, mo27418b(str).f48366m);
        this.f47586d.mo27509a(uih2);
        return uih2;
    }

    /* renamed from: c */
    public final ujl mo27429c(uey uey) {
        return mo27437e(uey.f47394a, uey.f47395b);
    }

    /* renamed from: b */
    public final uli mo27421b(uih uih) {
        List a = mo27391a(uih, uzz.PHOTOS);
        if (a.isEmpty()) {
            return null;
        }
        if (a.size() > 1) {
            f47585c.mo25377c("DatabaseModelLoader", "More than 1 photos feed found for an account");
        }
        return (uli) a.get(0);
    }

    /* renamed from: c */
    public final ujx mo27430c(uey uey, String str, String str2, boolean z) {
        return (ujx) ugx.m38384a(mo27364a(uey, "EntryView", "ScopedEntryView", voz.m40964a(uey.f47394a.f47683b, str, str2, z), String.valueOf(ujs.f47815a.f48341a.mo27700a()).concat(" DESC")));
    }

    /* renamed from: b */
    public final void mo27422b(long j, String str) {
        uhj uhj = this.f47578a;
        uhj.mo27476b();
        try {
            m38426c(j, str);
            this.f47578a.mo27465a(ujo.f47807a, uoh.m39066a(ujn.ACCOUNT_ID.f47806h.mo27717e(j), ujn.SDK_APP_ID.f47806h.mo27708b(str)));
            uhj.mo27480f();
        } finally {
            uhj.mo27478d();
        }
    }

    /* renamed from: a */
    private final boolean m38424a(DriveId driveId) {
        return driveId.f30730c == this.f47578a.mo27481g() && driveId.f30729b > 0;
    }

    /* renamed from: a */
    public final String mo27389a(uih uih, DriveId driveId) {
        boolean z;
        ujp d;
        if (driveId.f30728a == null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "This DriveId already has a resource ID. What are you asking me for?");
        if (!m38424a(driveId) || (d = mo27432d(driveId.f30729b)) == null || d.f47809a != uih.f47683b) {
            return null;
        }
        return d.f47810b;
    }

    /* renamed from: a */
    public final String mo27390a(ujx ujx, boolean z) {
        ulv ulv;
        uhj uhj = this.f47578a;
        Cursor a = uhj.mo27469a(uly.f48171a.mo27735b(), (String[]) null, ulx.ENTRY_ID.f48170d.mo27717e(ujx.mo27613h()), String.valueOf(ulx.ACTION_ID.f48170d.mo27700a()).concat(" DESC"), "1");
        try {
            if (a.moveToFirst()) {
                int i = ulv.f48162b;
                String a2 = ulx.CONTENT_HASH.f48170d.mo27702a(a);
                long longValue = ulx.ENTRY_ID.f48170d.mo27705b(a).longValue();
                ulv = new ulv(uhj, uly.f48171a.f48341a.mo27705b(a).longValue(), a2, ukk.m38862a(longValue), ulx.ACTION_ID.f48170d.mo27705b(a).longValue());
            } else {
                a.close();
                ulv = null;
            }
            if (ulv != null) {
                return ulv.f48163a;
            }
            List d = mo27386d(ujx.mo27582b());
            if (!d.isEmpty()) {
                unc unc = (unc) d.get(0);
                if (z || ujx.mo27569ae() == unc.f48299b) {
                    return unc.f48298a;
                }
            }
            return null;
        } finally {
            a.close();
        }
    }

    /* renamed from: b */
    public final void mo27423b(long j, ukk ukk, int i) {
        this.f47578a.mo27465a(umv.f48267a, voz.m40965a(j, ukk, i));
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
    /* renamed from: b */
    public final void mo27424b(uey uey, String str) {
        uhj uhj;
        uhj uhj2;
        boolean z;
        boolean z2;
        boolean z3;
        ujl ujl;
        uey uey2 = uey;
        String str2 = str;
        uhj uhj3 = this.f47578a;
        uhj3.mo27476b();
        try {
            uin a = mo27398a(uey2.f47394a.f47683b, uey2.f47396c);
            ujl ujl2 = null;
            if (a != null) {
                ujl f = mo27441f(a.f47708a);
                if (!f.f47793b.equals(uey2.f47395b)) {
                    f47585c.mo25375b("Existing androidAppRow has different sdkAppId (%s vs %s)", f.f47793b, uey2.f47395b);
                    a.mo27726u();
                    mo27445g();
                    a = null;
                } else {
                    f47585c.mo25371b("AndroidApp entry already exists, simply updating it");
                    f.f47794c = uey2.f47397d;
                    f.mo27517a(uey2.f47398e);
                    f.mo27725t();
                    ujl2 = f;
                }
            }
            if (a == null) {
                ujl c = mo27429c(uey);
                if (c != null) {
                    c.f47794c = uey2.f47397d;
                    c.mo27517a(uey2.f47398e);
                    c.mo27725t();
                    ujl = c;
                    uhj = uhj3;
                } else {
                    f47585c.mo25371b("No matching driveApp entry, inserting a new one");
                    uhj = uhj3;
                    try {
                        ujl ujl3 = new ujl(uhj3, -1, uey2.f47394a.f47683b, uey2.f47395b, uey2.f47397d, null, null, uey2.f47398e);
                        ujl3.mo27725t();
                        ujl = ujl3;
                    } catch (Throwable th) {
                        th = th;
                        uhj.mo27478d();
                        throw th;
                    }
                }
                f47585c.mo25371b("No matching androidApp entry, inserting a new one");
                new uin(uhj, -1, ujl.f48366m, uey2.f47396c, 1, PSKKeyManager.MAX_KEY_LENGTH_BYTES, true).mo27725t();
                ujl2 = ujl;
            } else {
                uhj = uhj3;
            }
            if (uey2.f47398e.contains(twt.f46773b)) {
                if (ujl2.f47795d == null) {
                    if (str2 != null) {
                        uih uih = uey2.f47394a;
                        uhj2 = this.f47578a;
                        if (uih.f47683b >= 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        sdo.m34976b(z, "Not persisted: %s", uih);
                        sdo.m34959a(ujl2);
                        if (ujl2.f48366m >= 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        sdo.m34976b(z2, "Not persisted: %s", ujl2);
                        if (ujl2.f47795d == null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        sdo.m34971a(z3, (Object) "App data root already exist");
                        uhj2.mo27476b();
                        ujx c2 = mo27385c(uih, str2);
                        if (c2 == null) {
                            c2 = mo27370a(uih, "application/vnd.google-apps.folder", str2);
                        }
                        if (c2.mo27524B()) {
                            if (ujl2.f47793b.equals(c2.mo27643z())) {
                                ujl2.f47795d = Long.valueOf(c2.mo27613h());
                                ujl2.mo27518b();
                                ujl2.mo27725t();
                                uhj2.mo27480f();
                                uhj2.mo27478d();
                            }
                        }
                        c2.mo27562a(true);
                        c2.mo27602e(ujl2.f47793b);
                        c2.mo27627m(false);
                        ujl2.f47795d = Long.valueOf(c2.mo27613h());
                        ujl2.mo27518b();
                        ujl2.mo27725t();
                        uhj2.mo27480f();
                        uhj2.mo27478d();
                    } else {
                        throw new IllegalArgumentException("Tried to create appData folder, but received null appDataRootResourceId.");
                    }
                }
            }
            uhj.mo27480f();
            uhj.mo27478d();
        } catch (Throwable th2) {
            th = th2;
            uhj = uhj3;
            uhj.mo27478d();
            throw th;
        }
    }

    /* renamed from: a */
    public final List mo27391a(uih uih, uzz uzz) {
        boolean z;
        if (uih.f47683b >= 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34976b(z, "Not persisted: %s", uih);
        sdo.m34959a(uzz);
        uhj uhj = this.f47578a;
        Cursor a = uhj.mo27468a(ull.f48129a.mo27735b(), (String[]) null, uoh.m39066a(ulk.FEED_TYPE.f48128g.mo27708b(uzz.f48797f), ulk.ACCOUNT_ID.f48128g.mo27717e(uih.f47683b)), (String) null);
        ArrayList arrayList = new ArrayList();
        while (a.moveToNext()) {
            try {
                arrayList.add(uli.m38926a(uhj, a));
            } finally {
                a.close();
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ugz.a(uog, boolean):uey
     arg types: [uog, int]
     candidates:
      ugz.a(java.util.Collection, java.lang.String):java.lang.String
      ugz.a(uih, boolean):java.util.Set
      ugz.a(uih, com.google.android.gms.drive.DriveId):java.lang.String
      ugz.a(ujx, boolean):java.lang.String
      ugz.a(uih, uzz):java.util.List
      ugz.a(long, java.lang.String):uey
      ugz.a(java.lang.String, uog):uig
      ugz.a(uih, long):uig
      ugz.a(long, com.google.android.gms.drive.auth.AppIdentity):uin
      ugz.a(uey, com.google.android.gms.drive.DriveId):ujx
      ugz.a(uey, java.lang.String):ujx
      ugz.a(uey, ukk):ujx
      ugz.a(ujx, java.lang.String):ukc
      ugx.a(uey, ujx):java.util.Set
      ugx.a(android.database.Cursor, uhx):uig
      ugx.a(ujx, uog):uig
      ugx.a(uih, java.lang.String):ujp
      ugx.a(ujx, long):void
      ugx.a(ujx, java.util.Set):void
      ugx.a(ukg, boolean):void
      ugx.a(ukk, long):void
      ugx.a(uey, uif):boolean
      uhl.a(uey, ujx):java.util.Set
      uhl.a(uih, java.lang.String):ujp
      uhl.a(ujx, long):void
      uhl.a(ujx, java.util.Set):void
      uhl.a(ukg, boolean):void
      uhl.a(ukk, long):void
      uhl.a(uey, uif):boolean
      uhn.a(uih, com.google.android.gms.drive.DriveId):java.lang.String
      uhn.a(ujx, boolean):java.lang.String
      uhn.a(uih, uzz):java.util.List
      uhn.a(long, java.lang.String):uey
      uhn.a(uih, long):uig
      uhn.a(uey, com.google.android.gms.drive.DriveId):ujx
      uhn.a(uey, java.lang.String):ujx
      uhn.a(uey, ukk):ujx
      uhn.a(ujx, java.lang.String):ukc
      uhl.a(uey, ujx):java.util.Set
      uhl.a(uih, java.lang.String):ujp
      uhl.a(ujx, long):void
      uhl.a(ujx, java.util.Set):void
      uhl.a(ukg, boolean):void
      uhl.a(ukk, long):void
      uhl.a(uey, uif):boolean
      ugz.a(uog, boolean):uey */
    /* renamed from: a */
    public final uey mo27392a(long j, String str) {
        return m38423a(uoh.m39066a(ujn.ACCOUNT_ID.f47806h.mo27717e(j), ujn.SDK_APP_ID.f47806h.mo27708b(str)), false);
    }

    /* renamed from: a */
    public final uig mo27393a(int i) {
        return mo27363a(this.f47578a.mo27468a(umv.f48267a.mo27735b(), (String[]) null, umu.EVENT_TYPE.f48266i.mo27717e((long) i), (String) null), umr.f48250a);
    }

    /* renamed from: a */
    public final uig mo27394a(String str, uog uog) {
        return mo27363a(this.f47578a.mo27468a(str, (String[]) null, uog, (String) null), uia.f47671a);
    }

    /* renamed from: a */
    public final uig mo27395a(uey uey, Set set, uog uog) {
        return mo27364a(uey, "EntryView", "ScopedEntryView", uoh.m39066a(uog, voz.m40969a(set)), (String) null);
    }

    /* renamed from: a */
    public final uig mo27396a(uih uih, long j) {
        return mo27364a(uey.m38255a(uih), "EntryView", "ScopedEntryView", uoh.m39072b(ukm.IS_DELETED_ACTION_ID.f48022aB.mo27717e(j), ukm.LAST_CONTENT_ACTION_ID.f48022aB.mo27717e(j)), (String) null);
    }

    /* renamed from: b */
    public final void mo27425b(unq unq) {
        unq.mo27726u();
    }

    /* renamed from: a */
    public final uig mo27397a(uih uih, long j, long j2) {
        return mo27364a(uey.m38255a(uih), "EntryView", "ScopedEntryView", uoh.m39066a(voz.m40959a(), ukm.IS_DELETED.f48022aB.mo27711c(), voz.m40971a(ukm.UNSUBSCRIBED_ON_SERVER_TIME.f48022aB, j, j2)), (String) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final uin mo27398a(long j, AppIdentity appIdentity) {
        uhj uhj = this.f47578a;
        uog a = voz.m40962a(j, appIdentity);
        uin uin = null;
        Cursor a2 = uhj.mo27468a("AndroidAppView", (String[]) null, a, (String) null);
        try {
            if (a2.moveToNext()) {
                uin = uin.m38683a(uhj, a2);
            }
            return uin;
        } finally {
            a2.close();
        }
    }

    /* renamed from: a */
    public final ujx mo27399a(uey uey) {
        Long l;
        sdo.m34974b(!uey.mo27263a());
        if (uey.f47398e.contains(twt.f46773b)) {
            if (cdqg.f181553a.mo6606a().mo78174a()) {
                ujl c = mo27429c(uey);
                if (c != null) {
                    l = c.f47795d;
                    if (l == null) {
                        throw new gid("App data root does not exist.");
                    }
                } else {
                    throw new gid("App does not exist.");
                }
            } else {
                ujl c2 = mo27429c(uey);
                sdo.checkIfNull(c2, "App does not exist.");
                l = c2.f47795d;
                sdo.checkIfNull(l, "App data root does not exist.");
            }
            try {
                return mo27402a(uey, ukk.m38862a(l.longValue()));
            } catch (uaa e) {
                throw new gid(e);
            }
        } else {
            throw new gid("App does not have APPDATA scope.");
        }
    }

    /* renamed from: a */
    public final ujx mo27400a(uey uey, DriveId driveId) {
        if (m38424a(driveId)) {
            try {
                return mo27402a(uey, ukk.m38862a(driveId.f30729b));
            } catch (uaa e) {
            }
        }
        String str = driveId.f30728a;
        if (str != null) {
            return mo27401a(uey, str);
        }
        throw new urd();
    }

    /* renamed from: a */
    public final ujx mo27401a(uey uey, String str) {
        ujx ujx;
        if ("appdata".equals(str)) {
            try {
                ujx = mo27399a(uey);
            } catch (gid e) {
                throw new uaa(ukk.m38862a(uey.f47394a.f47683b));
            }
        } else {
            ujx = mo27369a(uey, "EntryView", "ScopedEntryView", voz.m40963a(uey.f47394a.f47683b, str));
        }
        if (ujx != null) {
            return ujx;
        }
        throw new uaa(ukk.m38862a(uey.f47394a.f47683b));
    }

    /* renamed from: a */
    public final ujx mo27402a(uey uey, ukk ukk) {
        ujx a = mo27369a(uey, "EntryView", "ScopedEntryView", voz.m40961a(uey.f47394a.f47683b, ukk.f47941a));
        if (a != null) {
            return a;
        }
        throw new uaa(ukk);
    }

    /* renamed from: a */
    public final ukc mo27403a(ujx ujx, String str) {
        uog uog;
        uog e = uke.ENTRY_ID.f47867m.mo27717e(ujx.mo27613h());
        if (str != null) {
            uog = uke.ACCOUNT_IDENTIFIER.f47867m.mo27708b(str);
        } else {
            uog = uke.ACCOUNT_IDENTIFIER.f47867m.mo27716e();
        }
        boolean z = true;
        List a = mo27359a(uoh.m39066a(e, uog));
        if (a.isEmpty()) {
            return null;
        }
        if (a.size() != 1) {
            z = false;
        }
        sdo.m34970a(z);
        return (ukc) a.get(0);
    }

    /* renamed from: a */
    public final ukt mo27404a(ujx ujx) {
        boolean z = true;
        sdo.m34975b(!ujx.mo27571ag(), "Entry has genoa values already");
        if (ujx.mo27613h() < 0) {
            z = false;
        }
        sdo.m34975b(z, "Entry is not persisted");
        ukt ukt = new ukt(this.f47578a, ujx.mo27551a(), -1);
        ukt.mo27725t();
        return ukt;
    }

    /* renamed from: a */
    public final uli mo27405a(uih uih, uzx uzx, long j) {
        uli a;
        uih uih2 = uih;
        sdo.m34976b(uih2.f47683b >= 0, "Not persisted: %s", uih2);
        sdo.m34959a(uzx);
        uhj uhj = this.f47578a;
        Cursor a2 = uhj.mo27468a(ull.f48129a.mo27735b(), (String[]) null, uoh.m39066a(ulk.FEED_TYPE.f48128g.mo27708b(uzx.f48787c.f48797f), ulk.FEED_PARAMETERS.f48128g.mo27708b(uzx.mo28138a()), ulk.ACCOUNT_ID.f48128g.mo27717e(uih2.f47683b)), (String) null);
        try {
            if (!a2.moveToFirst()) {
                a = new uli(uhj, -1, uih2.f47683b, uzx, null, Long.valueOf(j), 0);
            } else {
                a = uli.m38926a(uhj, a2);
            }
            return a;
        } finally {
            a2.close();
        }
    }

    /* renamed from: a */
    public final ulz mo27406a(String str, String str2, long j, ukk ukk) {
        ulz ulz = new ulz(this.f47578a, -1, str, str2, Long.valueOf(j), ukk, null);
        ulz.mo27725t();
        return ulz;
    }

    /* renamed from: a */
    public final ums mo27407a(long j, ukk ukk, int i) {
        return (ums) ugx.m38386b(mo27363a(this.f47578a.mo27468a(umv.f48267a.mo27735b(), (String[]) null, voz.m40965a(j, ukk, i), (String) null), umr.f48250a));
    }

    /* renamed from: a */
    public final vpe mo27408a(uey uey, Set set, uog uog, String str, Set set2, boolean z, boolean z2, List list, boolean z3) {
        String str2;
        List list2 = list;
        if (str != null && !str.isEmpty()) {
            str2 = str;
        } else {
            String concat = String.valueOf(ukm.LAST_MODIFIED_DATE.f48022aB.mo27700a()).concat(" DESC");
            if (list2 == null || list.isEmpty()) {
                str2 = concat;
            } else {
                sdo.m34959a(list);
                sdo.m34970a(!list.isEmpty());
                StringBuilder sb = new StringBuilder();
                sb.append("CASE ");
                sb.append(ujr.RESOURCE_ID.f47814c.mo27700a());
                for (int i = 0; i < list.size(); i++) {
                    sb.append(" WHEN ");
                    DatabaseUtils.appendEscapedSQLString(sb, (String) list2.get(i));
                    sb.append(" THEN ");
                    sb.append(i);
                }
                sb.append(" ELSE ");
                sb.append(list.size());
                sb.append(" END");
                str2 = sb.toString() + ',' + concat;
            }
        }
        f47585c.mo25369a("Entry sorting clause for query %s", str2);
        return mo27409a(uey, set, uog, str2, set2, z, z3, z2);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ugx.a(uif, java.lang.String, boolean):java.util.List
     arg types: [uif, java.lang.String, int]
     candidates:
      ugz.a(uey, java.util.Set, uog):uig
      ugz.a(uih, long, long):uig
      ugz.a(uih, uzx, long):uli
      ugz.a(long, ukk, int):ums
      ugx.a(java.lang.String, boolean, uog):java.util.Set
      ugx.a(uih, java.lang.String, java.lang.String):ujx
      ugx.a(uif, java.lang.String, java.lang.String):uot
      uhl.a(uih, java.lang.String, java.lang.String):ujx
      uhl.a(uif, java.lang.String, java.lang.String):uot
      uhn.a(uey, java.util.Set, uog):uig
      uhn.a(uih, long, long):uig
      uhn.a(uih, uzx, long):uli
      uhn.a(long, ukk, int):ums
      uhl.a(uih, java.lang.String, java.lang.String):ujx
      uhl.a(uif, java.lang.String, java.lang.String):uot
      ugx.a(uif, java.lang.String, boolean):java.util.List */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: voz.a(java.util.List, java.lang.String, boolean):uog
     arg types: [java.util.ArrayList, java.lang.String, int]
     candidates:
      voz.a(long, ukk, int):uog
      voz.a(unp, long, long):uog
      voz.a(java.util.List, java.lang.String, boolean):uog */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0090, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0094, code lost:
        if (r25 != false) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r12 = r0.f47395b;
        r13 = r1.getColumnIndexOrThrow("sqlId");
        r5 = r1.getColumnIndexOrThrow("hasCustomProperties");
        r14 = new android.util.SparseArray();
        r1.moveToFirst();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ae, code lost:
        if (r1.isAfterLast() == false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b0, code lost:
        r1.moveToFirst();
        r10.putSparseParcelableArray("customPropertiesExtra", r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00be, code lost:
        if (r1.getLong(r5) == r2) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c0, code lost:
        r15 = mo27358a(p000.uif.m38672a(r1.getLong(r13)), r12, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d0, code lost:
        if (r15.size() <= 0) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d2, code lost:
        r9 = new p000.uyp();
        r15 = r15.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00df, code lost:
        if (r15.hasNext() != false) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e1, code lost:
        r14.put(r1.getPosition(), r9.mo28111a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ed, code lost:
        r16 = (p000.uot) r15.next();
        r3 = r16.mo27784d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00fd, code lost:
        if (r16.mo27786f() != null) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ff, code lost:
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0101, code lost:
        r11 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0102, code lost:
        r9.mo28114a(new com.google.android.gms.drive.metadata.internal.CustomProperty(new com.google.android.gms.drive.metadata.CustomPropertyKey(r3, r11), r16.mo27785e()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0114, code lost:
        r1.moveToNext();
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x011b, code lost:
        r3 = r0.f47395b;
        r6 = r1.getColumnIndexOrThrow("sqlId");
        r5 = r1.getColumnIndexOrThrow("hasCustomProperties");
        r9 = new java.util.ArrayList();
        r1.moveToFirst();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0133, code lost:
        if (r1.isAfterLast() == false) goto L_0x0283;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0135, code lost:
        r1.moveToFirst();
        r3 = p000.voz.m40968a((java.util.List) r9, r3, false);
        r6 = r7.f47578a;
        r8 = p000.uok.m39087a(p000.ujh.f47771a.mo27735b());
        r8.mo27770a(p000.ujg.f47762a);
        r8.mo27770a(p000.ujg.f47764c);
        r8.mo27770a(p000.ujg.f47766e);
        r8.mo27767a(java.lang.String.valueOf(p000.ujg.f47763b.f47770h.mo27700a()).concat(" IS NOT NULL"), "visibility");
        r8.mo27772b(r3.f48389a);
        r3 = r6.mo27475b(r8.mo27759a(), r3.mo27762a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r6 = p000.ujg.f47762a.f47770h.mo27700a();
        r8 = p000.ujg.f47764c.f47770h.mo27700a();
        r9 = p000.ujg.f47766e.f47770h.mo27700a();
        r3.getColumnIndexOrThrow(r6);
        r3.getColumnIndexOrThrow(r8);
        r3.getColumnIndexOrThrow("visibility");
        r3.getColumnIndexOrThrow(r9);
        r11 = new android.os.Bundle();
        r11.putString("entryIdColumn", r6);
        r11.putString("keyColumn", r8);
        r11.putString("visibilityColumn", "visibility");
        r11.putString("valueColumn", r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r10.putParcelable("customPropertiesExtraHolder", new com.google.android.gms.common.data.DataHolder(r3, r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0261, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0265, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x027d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x027e, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0282, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x028e, code lost:
        if (r1.getLong(r5) == 0) goto L_0x029b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0290, code lost:
        r9.add(java.lang.Long.valueOf(r1.getLong(r6)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x029b, code lost:
        r1.moveToNext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02a0, code lost:
        r0 = th;
     */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02b0  */
    /* renamed from: a */
    public final vpe mo27409a(uey uey, Set set, uog uog, String str, Set set2, boolean z, boolean z2, boolean z3) {
        uog uog2;
        DataHolder dataHolder;
        Cursor cursor;
        DataHolder dataHolder2;
        uey uey2 = uey;
        uog a = uoh.m39066a(uog, voz.m40970a(uey), voz.m40969a(set), ukm.IS_DELETED.f48022aB.mo27711c());
        if (!z3) {
            uog2 = uoh.m39066a(a, ukm.SUBSCRIBED.f48022aB.mo27719f());
        } else {
            uog2 = a;
        }
        Bundle bundle = new Bundle();
        String[] strArr = (String[]) set2.toArray(new String[set2.size()]);
        mo27435d();
        try {
            bundle.putLong("dbInstanceId", this.f47578a.mo27481g());
            Cursor a2 = mo27355a(uey2.f47394a, m38427d(uey), uog2, str, strArr);
            try {
                a2.getCount();
                Iterator it = uzm.f48736L.f48654b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (a2.getColumnIndex((String) it.next()) == -1) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z) {
                    if (!uey.mo27266c()) {
                        if (!Collections.singleton(DriveSpace.f30735b).equals(set)) {
                            dataHolder2 = null;
                        }
                    }
                    int columnIndexOrThrow = a2.getColumnIndexOrThrow("sqlId");
                    ArrayList arrayList = new ArrayList(a2.getCount());
                    a2.moveToFirst();
                    while (!a2.isAfterLast()) {
                        arrayList.add(Long.valueOf(a2.getLong(columnIndexOrThrow)));
                        a2.moveToNext();
                    }
                    a2.moveToFirst();
                    dataHolder = null;
                    Cursor a3 = this.f47578a.mo27468a("ParentDriveIdView", (String[]) null, voz.m40967a(ulg.CHILD_ENTRY_ID.f48115c.mo27700a(), arrayList), (String) null);
                    String a4 = ulg.CHILD_ENTRY_ID.f48115c.mo27700a();
                    String a5 = ulg.PARENT_ENTRY_ID.f48115c.mo27700a();
                    String a6 = ujr.RESOURCE_ID.f47814c.mo27700a();
                    a3.getColumnIndexOrThrow(a4);
                    a3.getColumnIndexOrThrow(a5);
                    a3.getColumnIndexOrThrow(a6);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("childSqlIdColumn", a4);
                    bundle2.putString("parentSqlIdColumn", a5);
                    bundle2.putString("parentResIdColumn", a6);
                    DataHolder dataHolder3 = new DataHolder(a3, bundle2);
                    try {
                        bundle.putParcelable("parentsExtraHolder", dataHolder3);
                        dataHolder2 = dataHolder3;
                    } catch (Throwable th) {
                        th = th;
                        cursor = a2;
                        dataHolder = dataHolder3;
                        if (cursor != null) {
                        }
                        if (dataHolder != null) {
                        }
                        mo27439e();
                        throw th;
                    }
                } else {
                    dataHolder2 = null;
                }
            } catch (Throwable th2) {
                th = th2;
                dataHolder = null;
                cursor = a2;
                if (cursor != null) {
                    cursor.close();
                }
                if (dataHolder != null) {
                    dataHolder.close();
                }
                mo27439e();
                throw th;
            }
            try {
                mo27442f();
                mo27439e();
                return new vpe(new DataHolder(a2, bundle));
            } catch (Throwable th3) {
                th = th3;
                dataHolder = dataHolder2;
                cursor = a2;
                if (cursor != null) {
                }
                if (dataHolder != null) {
                }
                mo27439e();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            dataHolder = null;
            cursor = null;
            if (cursor != null) {
            }
            if (dataHolder != null) {
            }
            mo27439e();
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo27410a(Runnable runnable) {
        mo27435d();
        try {
            runnable.run();
            mo27442f();
        } finally {
            mo27439e();
        }
    }

    /* renamed from: a */
    public final void mo27411a(Set set) {
        for (ujx ujx : mo27365a((uih) null, "EntryView", uoh.m39072b(uoh.m39060a(String.format(Locale.US, "%s IN (%s)", ukm.LOCAL_CONTENT_HASH.f48022aB.mo27700a(), m38421a(set, ","))), uoh.m39060a(String.format(Locale.US, "%s IN (%s)", ukm.INSYNC_CONTENT_HASH.f48022aB.mo27700a(), m38421a(set, ",")))), (String) null).mo27502a()) {
            if (set.contains(ujx.mo27633q())) {
                ujx.mo27593c(null, null);
                ujx.mo27581aq();
            }
            if (set.contains(ujx.mo27628n())) {
                ujx.mo27626m();
            }
            ujx.mo27627m(true);
        }
    }

    /* renamed from: a */
    public final void mo27412a(uih uih) {
        boolean z;
        mo27435d();
        try {
            uij a = mo27367a(uih.f47682a);
            if (a != null) {
                if (a.f48366m == uih.f47683b) {
                    z = true;
                } else {
                    z = false;
                }
                sdo.m34970a(z);
                a.mo27726u();
            }
            uii uii = this.f47586d;
            uii.f47684a.remove(uih.f47682a);
            uii.f47685b.remove(Long.valueOf(uih.f47683b));
            mo27442f();
        } finally {
            mo27439e();
        }
    }

    /* renamed from: a */
    public final void mo27413a(uih uih, txr txr, long j, long j2) {
        boolean z;
        if (txr != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "ActionType cannot be null");
        new C1596ulr(this.f47578a, -1, uih.f47683b, txr, j, j2).mo27725t();
    }

    /* renamed from: a */
    public final void mo27414a(unq unq) {
        unq.mo27725t();
    }

    /* renamed from: a */
    public final boolean mo27415a(unt unt) {
        uhj uhj = this.f47578a;
        String b = unt.mo27735b();
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 30);
        sb.append("SELECT EXISTS (SELECT * FROM ");
        sb.append(b);
        sb.append(")");
        Cursor a = uhj.mo27467a(sb.toString(), (String[]) null);
        try {
            boolean z = false;
            if (!a.moveToFirst()) {
                uhj.f47636a.mo25377c("DocListDatabase", "EXISTS returned empty.");
            } else if (a.getInt(0) == 0) {
                z = true;
            }
            return z;
        } finally {
            a.close();
        }
    }
}
