package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: ztk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ztk implements Closeable {

    /* renamed from: a */
    public SQLiteDatabase f55883a;

    /* renamed from: b */
    final /* synthetic */ ztl f55884b;

    public ztk(ztl ztl, SQLiteDatabase sQLiteDatabase) {
        this.f55884b = ztl;
        this.f55883a = sQLiteDatabase;
    }

    /* renamed from: e */
    private final void m46287e() {
        if (this.f55883a == null) {
            throw new IllegalStateException("Attempt to use SQL database after closure.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo31488a(String str, ContentValues contentValues, String str2, String[] strArr) {
        mo31499c();
        try {
            return this.f55883a.update(str, contentValues, str2, strArr);
        } catch (SQLiteException e) {
            throw new IOException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo31498b() {
        m46287e();
        this.f55883a.setTransactionSuccessful();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo31499c() {
        m46287e();
        bmxy.m108601b(this.f55883a.inTransaction(), "Not in an active transaction!");
        bmzs.m108696a(this.f55883a);
    }

    public final void close() {
        SQLiteDatabase sQLiteDatabase = this.f55883a;
        if (sQLiteDatabase == null) {
            return;
        }
        if (!sQLiteDatabase.isOpen()) {
            bnsl bnsl = (bnsl) ztl.f55885a.mo68387b();
            bnsl.mo68432a("ztk", "close", (int) BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Database has already been closed");
            this.f55883a = null;
            return;
        }
        try {
            if (this.f55883a.inTransaction()) {
                mo31501d();
            }
        } finally {
            this.f55884b.mo31504c();
            this.f55883a = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo31501d() {
        m46287e();
        try {
            this.f55883a.endTransaction();
        } catch (SQLiteException e) {
            throw new IOException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo31489a(String str, String str2, String[] strArr) {
        mo31499c();
        try {
            return this.f55883a.delete(str, str2, strArr);
        } catch (SQLiteException e) {
            throw new IOException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo31490a(String str, ContentValues contentValues) {
        mo31499c();
        try {
            return this.f55883a.insertOrThrow(str, null, contentValues);
        } catch (SQLiteException e) {
            throw new IOException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final zsu mo31491a(String str, String[] strArr) {
        srn srn = ztl.f55885a;
        return mo31493a(str, strArr, null, null, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final zsu mo31492a(String str, String[] strArr, String str2, String[] strArr2) {
        mo31499c();
        srn srn = ztl.f55885a;
        return mo31494a(str, strArr, str2, strArr2, null, -1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final zsu mo31493a(String str, String[] strArr, String str2, String[] strArr2, String str3) {
        mo31499c();
        return mo31494a(str, strArr, str2, strArr2, str3, -1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final zsu mo31494a(String str, String[] strArr, String str2, String[] strArr2, String str3, int i) {
        String str4;
        if (i != -1) {
            str4 = String.valueOf(i);
        } else {
            srn srn = ztl.f55885a;
            str4 = null;
        }
        srn srn2 = ztl.f55885a;
        return mo31495a(str, strArr, str2, strArr2, str3, str4, null);
    }

    /* renamed from: a */
    public final zsu mo31495a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        m46287e();
        try {
            try {
                return new zsu(this.f55883a.query(str, strArr, str2, strArr2, str5, null, str3, str4));
            } catch (SQLiteException e) {
                e = e;
                throw new IOException(e);
            }
        } catch (SQLiteException e2) {
            e = e2;
            throw new IOException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ztv mo31496a(String str, Object... objArr) {
        m46287e();
        try {
            return new ztv(this.f55883a.compileStatement(String.format(str, objArr)));
        } catch (SQLiteException e) {
            throw new IOException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo31497a() {
        m46287e();
        try {
            this.f55883a.beginTransactionNonExclusive();
        } catch (SQLiteException e) {
            throw new IOException(e);
        }
    }
}
