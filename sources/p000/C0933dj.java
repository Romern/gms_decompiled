package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;

/* renamed from: dj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0933dj implements Closeable {

    /* renamed from: b */
    private static final String[] f13299b = new String[0];

    /* renamed from: a */
    public final SQLiteDatabase f13300a;

    public C0933dj(SQLiteDatabase sQLiteDatabase) {
        this.f13300a = sQLiteDatabase;
    }

    /* renamed from: a */
    public final Cursor mo9111a(C0931dh dhVar) {
        return this.f13300a.rawQueryWithFactory(new C0932di(dhVar), dhVar.mo8483a(), f13299b, null);
    }

    /* renamed from: b */
    public final void mo9114b() {
        this.f13300a.endTransaction();
    }

    /* renamed from: c */
    public final C0939dp mo9116c(String str) {
        return new C0939dp(this.f13300a.compileStatement(str));
    }

    public final void close() {
        this.f13300a.close();
    }

    /* renamed from: d */
    public final boolean mo9119d() {
        return this.f13300a.inTransaction();
    }

    /* renamed from: e */
    public final boolean mo9120e() {
        return this.f13300a.isOpen();
    }

    /* renamed from: f */
    public final String mo9121f() {
        return this.f13300a.getPath();
    }

    /* renamed from: b */
    public final void mo9115b(String str) {
        this.f13300a.execSQL(str);
    }

    /* renamed from: c */
    public final void mo9117c() {
        this.f13300a.setTransactionSuccessful();
    }

    /* renamed from: a */
    public final Cursor mo9112a(String str) {
        return mo9111a(new C0924db(str));
    }

    /* renamed from: a */
    public final void mo9113a() {
        this.f13300a.beginTransaction();
    }
}
