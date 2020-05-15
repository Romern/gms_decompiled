package p000;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Locale;
import java.util.Stack;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: uhj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uhj implements uno {

    /* renamed from: a */
    public static final sbw f47636a = new sbw("DocListDatabase", "");

    /* renamed from: b */
    public final uhk f47637b;

    /* renamed from: c */
    public final AtomicReference f47638c = new AtomicReference();

    /* renamed from: d */
    public final ThreadLocal f47639d = new uhd();

    /* renamed from: e */
    public volatile AtomicLong f47640e;

    /* renamed from: f */
    public final ThreadLocal f47641f = new ThreadLocal();

    /* renamed from: g */
    private final AtomicLong f47642g = new AtomicLong(0);

    /* renamed from: h */
    private final Executor f47643h;

    /* renamed from: i */
    private final ThreadLocal f47644i = new uhf();

    /* renamed from: j */
    private final ThreadLocal f47645j = new ThreadLocal();

    /* renamed from: k */
    private final void m38514k() {
        m38515l();
        mo27472a().beginTransaction();
    }

    /* renamed from: l */
    private final void m38515l() {
        boolean z;
        if (this.f47638c.get() != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        this.f47639d.set(Long.valueOf(((Long) this.f47639d.get()).longValue() + 1));
        this.f47642g.incrementAndGet();
    }

    /* renamed from: m */
    private final void m38516m() {
        long longValue = ((Long) this.f47639d.get()).longValue() - 1;
        this.f47639d.set(Long.valueOf(longValue));
        if (longValue == 0) {
            this.f47639d.remove();
        }
        this.f47642g.decrementAndGet();
    }

    /* renamed from: a */
    public final int mo27464a(uhp uhp, unt unt, uog uog) {
        String[] strArr;
        mo27473a(uhp);
        String str = null;
        if (uog != null) {
            String str2 = uog.f48389a;
            strArr = uog.mo27762a();
            if (strArr.length == 0) {
                strArr = null;
                str = str2;
            } else {
                str = str2;
            }
        } else {
            strArr = null;
        }
        m38515l();
        try {
            return mo27472a().delete(unt.mo27735b(), str, strArr);
        } finally {
            m38516m();
        }
    }

    /* renamed from: b */
    public final Cursor mo27475b(String str, String[] strArr) {
        mo27473a(null);
        m38515l();
        try {
            return mo27472a().rawQuery(str, strArr);
        } finally {
            m38516m();
        }
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
    /* renamed from: c */
    public final uhp mo27477c() {
        boolean z;
        sdo.m34971a(((Stack) this.f47644i.get()).isEmpty(), (Object) "Cannot be in savepoint state");
        if (((Long) this.f47639d.get()).longValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(z, (Object) "Cannot be already in a transaction");
        m38514k();
        uhp uhp = new uhp(this, this.f47643h);
        this.f47641f.set(uhp);
        return uhp;
    }

    /* renamed from: d */
    public final void mo27478d() {
        mo27473a(null);
        Stack stack = (Stack) this.f47644i.get();
        if (!stack.empty()) {
            uhh uhh = (uhh) stack.peek();
            sdo.m34970a(!uhh.f47600a.empty());
            uhh.f47601b |= !((Boolean) uhh.f47600a.pop()).booleanValue();
            return;
        }
        mo27479e();
    }

    /* renamed from: e */
    public final void mo27479e() {
        mo27472a().endTransaction();
        m38516m();
    }

    /* renamed from: f */
    public final void mo27480f() {
        mo27473a(null);
        Stack stack = (Stack) this.f47644i.get();
        if (!stack.empty()) {
            Stack stack2 = ((uhh) stack.peek()).f47600a;
            sdo.m34970a(!stack2.empty());
            sdo.m34970a(!((Boolean) stack2.pop()).booleanValue());
            stack2.push(true);
            return;
        }
        mo27472a().setTransactionSuccessful();
    }

    /* renamed from: g */
    public final long mo27481g() {
        mo27472a();
        uhk uhk = this.f47637b;
        long j = uhk.f47647b;
        if (j == -1) {
            vfg vfg = (vfg) uhk.f47646a;
            SharedPreferences d = vfg.mo28388d();
            if (!d.contains("databaseInstanceId")) {
                SharedPreferences c = vfg.mo28387c();
                if (c.contains("databaseInstanceId")) {
                    vfg.mo28386a(c.getLong("databaseInstanceId", 0));
                }
            }
            long j2 = d.getLong("databaseInstanceId", 0);
            if (j2 == 0) {
                vfg.f49167a.mo25372b("PreferencesImpl", "Database creation timestamp not found! Re-initing to current timestamp");
                j = vfg.mo28385b();
            } else {
                j = j2;
            }
            uhk.f47647b = j;
        }
        return j;
    }

    /* renamed from: h */
    public final void mo27482h() {
        mo27473a(null);
        boolean inTransaction = mo27472a().inTransaction();
        Stack stack = (Stack) this.f47644i.get();
        int size = stack.size();
        f47636a.mo25369a("Begin savepoint %d", Integer.valueOf(size));
        if (size == 0) {
            this.f47645j.set(Boolean.valueOf(!inTransaction));
            if (!inTransaction) {
                m38514k();
            }
        }
        mo27472a().execSQL(String.format(Locale.US, ";savepoint s%d", Integer.valueOf(size)));
        stack.push(new uhh());
    }

    /* renamed from: i */
    public final void mo27483i() {
        mo27473a(null);
        Stack stack = (Stack) this.f47644i.get();
        sdo.m34970a(!stack.empty());
        uhh uhh = (uhh) stack.peek();
        boolean z = false;
        if (!uhh.f47602c && uhh.f47600a.empty()) {
            z = true;
        }
        sdo.m34970a(z);
        uhh.f47602c = true;
    }

    /* renamed from: j */
    public final void mo27484j() {
        mo27473a(null);
        Stack stack = (Stack) this.f47644i.get();
        sdo.m34970a(!stack.empty());
        uhh uhh = (uhh) stack.pop();
        sdo.m34970a(uhh.f47600a.empty());
        int size = stack.size();
        if (!uhh.f47602c || uhh.f47601b) {
            sbw sbw = f47636a;
            Integer valueOf = Integer.valueOf(size);
            sbw.mo25369a("Rollback savepoint %d", valueOf);
            mo27472a().execSQL(String.format(Locale.US, ";rollback to s%d", valueOf));
        }
        sbw sbw2 = f47636a;
        Integer valueOf2 = Integer.valueOf(size);
        sbw2.mo25369a("Release savepoint %d", valueOf2);
        mo27472a().execSQL(String.format(Locale.US, ";release s%d", valueOf2));
        if (size == 0 && ((Boolean) this.f47645j.get()).booleanValue()) {
            mo27480f();
            mo27479e();
        }
    }

    public uhj(Context context, Executor executor, vff vff) {
        sdo.m34959a(context);
        this.f47643h = executor;
        this.f47637b = new uhk(context, "DocList.db", vff);
    }

    /* renamed from: b */
    public final void mo27476b() {
        mo27473a(null);
        Stack stack = (Stack) this.f47644i.get();
        if (!stack.empty()) {
            ((uhh) stack.peek()).f47600a.push(false);
        } else {
            m38514k();
        }
    }

    /* renamed from: a */
    public final int mo27465a(unt unt, uog uog) {
        return mo27464a((uhp) null, unt, uog);
    }

    /* renamed from: a */
    public final long mo27466a(uhp uhp, unt unt, ContentValues contentValues) {
        mo27473a(uhp);
        m38515l();
        try {
            return mo27472a().insertOrThrow(unt.mo27735b(), null, contentValues);
        } finally {
            m38516m();
        }
    }

    /* renamed from: a */
    public final Cursor mo27467a(String str, String[] strArr) {
        return mo27475b(str, strArr);
    }

    /* renamed from: a */
    public final Cursor mo27468a(String str, String[] strArr, uog uog, String str2) {
        return mo27470a((uhp) null, str, strArr, uog, str2);
    }

    /* renamed from: a */
    public final Cursor mo27469a(String str, String[] strArr, uog uog, String str2, String str3) {
        return mo27471a(null, str, strArr, uog, null, str2, str3);
    }

    /* renamed from: a */
    public final Cursor mo27470a(uhp uhp, String str, String[] strArr, uog uog, String str2) {
        mo27473a(uhp);
        return mo27471a(uhp, str, strArr, uog, null, str2, null);
    }

    /* renamed from: a */
    public final Cursor mo27471a(uhp uhp, String str, String[] strArr, uog uog, String str2, String str3, String str4) {
        String str5;
        String[] strArr2;
        uog uog2 = uog;
        mo27473a(uhp);
        if (uog2 != null) {
            str5 = uog2.f48389a;
        } else {
            str5 = null;
        }
        if (uog2 != null) {
            strArr2 = uog.mo27762a();
        } else {
            strArr2 = null;
        }
        m38515l();
        try {
            return mo27472a().query(str, strArr, str5, strArr2, str2, null, str3, str4);
        } finally {
            m38516m();
        }
    }

    /* renamed from: a */
    public final SQLiteDatabase mo27472a() {
        vpj vpj = (vpj) this.f47638c.get();
        sdo.m34970a(vpj != null);
        return (SQLiteDatabase) vpj.mo27461b();
    }

    /* renamed from: a */
    public final void mo27473a(uhp uhp) {
        sdo.m34970a(uhp == this.f47641f.get());
    }

    /* renamed from: a */
    public final void mo27474a(uhp uhp, unt unt, uog uog, ContentValues contentValues) {
        String str;
        mo27473a(uhp);
        String[] strArr = null;
        if (uog != null) {
            str = uog.f48389a;
        } else {
            str = null;
        }
        if (uog != null) {
            strArr = uog.mo27762a();
        }
        m38515l();
        try {
            mo27472a().update(unt.mo27735b(), contentValues, str, strArr);
        } finally {
            m38516m();
        }
    }
}
