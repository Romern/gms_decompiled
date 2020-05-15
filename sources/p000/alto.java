package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.util.Log;
import java.util.BitSet;

/* renamed from: alto */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alto {

    /* renamed from: c */
    public static int f74230c = 0;

    /* renamed from: d */
    public static int f74231d = 0;

    /* renamed from: a */
    public final altl f74232a;

    /* renamed from: b */
    public final SQLiteDatabase f74233b;

    /* renamed from: e */
    private final Context f74234e;

    /* renamed from: f */
    private final altq f74235f;

    /* renamed from: g */
    private final boolean f74236g;

    /* renamed from: h */
    private int f74237h;

    /* renamed from: i */
    private final BitSet f74238i = new BitSet();

    /* renamed from: j */
    private boolean f74239j;

    public alto(Context context, altq altq, altl altl, SQLiteDatabase sQLiteDatabase, boolean z) {
        this.f74234e = context;
        this.f74235f = altq;
        this.f74232a = altl;
        this.f74233b = sQLiteDatabase;
        this.f74236g = z;
    }

    /* renamed from: a */
    private final void m61777a(boolean z) {
        if (cgay.m144136i()) {
            f74231d++;
        }
        m61779j();
        mo40754e();
        this.f74232a.mo40735c();
        int i = this.f74237h - 1;
        this.f74237h = i;
        if (!this.f74238i.get(i)) {
            this.f74239j = true;
            if (!z) {
                Log.i("PeopleDatabase", "Transaction rolling back");
                aluj.m61903a(this.f74234e, "PeopleDatabase", "Transaction rolling back", new ancl());
            }
        }
        if (this.f74237h == 0) {
            if (!this.f74239j) {
                this.f74233b.setTransactionSuccessful();
                this.f74235f.mo40769d();
            } else {
                this.f74235f.mo40769d();
            }
            this.f74233b.endTransaction();
        }
        this.f74232a.mo40734b();
    }

    /* renamed from: h */
    public static final void m61778h() {
        f74230c = 0;
        f74231d = 0;
    }

    /* renamed from: j */
    private final void m61779j() {
        if (!this.f74236g) {
            Log.w("PeopleDatabase", "Write detected on readonly db", new ancl());
        }
    }

    /* renamed from: b */
    public final long mo40749b(String str, String[] strArr) {
        return DatabaseUtils.longForQuery(this.f74233b, str, strArr);
    }

    /* renamed from: c */
    public final String mo40751c(String str, String[] strArr) {
        try {
            return DatabaseUtils.stringForQuery(this.f74233b, str, strArr);
        } catch (SQLiteDoneException e) {
            return null;
        }
    }

    /* renamed from: d */
    public final void mo40753d() {
        m61777a(false);
    }

    /* renamed from: e */
    public final void mo40754e() {
        sdo.m34970a(mo40756g());
    }

    /* renamed from: f */
    public final void mo40755f() {
        sdo.m34970a(!mo40756g());
    }

    /* renamed from: g */
    public final boolean mo40756g() {
        return this.f74233b.inTransaction();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.BitSet.set(int, boolean):void}
     arg types: [int, int]
     candidates:
      ClspMth{java.util.BitSet.set(int, int):void}
      ClspMth{java.util.BitSet.set(int, boolean):void} */
    /* renamed from: b */
    public final void mo40750b() {
        m61779j();
        mo40754e();
        this.f74232a.mo40735c();
        this.f74238i.set(this.f74237h - 1, true);
    }

    /* renamed from: c */
    public final void mo40752c() {
        m61777a(true);
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
    /* renamed from: i */
    public final void mo40757i() {
        boolean z;
        m61779j();
        mo40754e();
        this.f74232a.mo40735c();
        if (this.f74237h == 1) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        sdo.m34971a(!this.f74238i.get(0), (Object) "Trying to yield after setTransactionSuccessful");
        sdo.m34971a(!this.f74239j, (Object) "Trying to yield on failed transaction.");
        this.f74235f.mo40769d();
        this.f74233b.setTransactionSuccessful();
        this.f74233b.endTransaction();
        this.f74233b.beginTransaction();
    }

    /* renamed from: a */
    public final int mo40740a(String str, ContentValues contentValues, String str2, String[] strArr) {
        m61779j();
        this.f74232a.mo40733a();
        try {
            return this.f74233b.update(str, contentValues, str2, strArr);
        } finally {
            this.f74232a.mo40734b();
        }
    }

    /* renamed from: a */
    public final int mo40741a(String str, String str2, String[] strArr) {
        m61779j();
        this.f74232a.mo40733a();
        try {
            return this.f74233b.delete(str, str2, strArr);
        } finally {
            this.f74232a.mo40734b();
        }
    }

    /* renamed from: a */
    public final long mo40742a(String str, ContentValues contentValues) {
        m61779j();
        this.f74232a.mo40733a();
        try {
            return this.f74233b.insertOrThrow(str, null, contentValues);
        } finally {
            this.f74232a.mo40734b();
        }
    }

    /* renamed from: a */
    public final long mo40743a(String str, String[] strArr, long j) {
        try {
            return DatabaseUtils.longForQuery(this.f74233b, str, strArr);
        } catch (SQLiteDoneException e) {
            return j;
        }
    }

    /* renamed from: a */
    public final Cursor mo40744a(String str, String[] strArr) {
        return this.f74233b.rawQuery(str, strArr, null);
    }

    /* renamed from: a */
    public final Cursor mo40745a(String str, String[] strArr, String str2, String[] strArr2) {
        return this.f74233b.query(str, strArr, str2, strArr2, null, null, null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.BitSet.set(int, boolean):void}
     arg types: [int, int]
     candidates:
      ClspMth{java.util.BitSet.set(int, int):void}
      ClspMth{java.util.BitSet.set(int, boolean):void} */
    /* renamed from: a */
    public final void mo40746a() {
        if (cgay.m144136i()) {
            f74230c++;
        }
        m61779j();
        this.f74232a.mo40733a();
        this.f74238i.set(this.f74237h, false);
        int i = this.f74237h + 1;
        this.f74237h = i;
        if (i == 1) {
            this.f74239j = false;
            this.f74233b.beginTransaction();
        }
    }

    /* renamed from: a */
    public final void mo40747a(String str) {
        m61779j();
        this.f74232a.mo40733a();
        try {
            this.f74233b.execSQL(str);
        } finally {
            this.f74232a.mo40734b();
        }
    }

    /* renamed from: a */
    public final void mo40748a(String str, Object[] objArr) {
        m61779j();
        this.f74232a.mo40733a();
        try {
            this.f74233b.execSQL(str, objArr);
        } finally {
            this.f74232a.mo40734b();
        }
    }
}
