package p000;

import android.database.sqlite.SQLiteProgram;

/* renamed from: do */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C0938do implements C0930dg {

    /* renamed from: a */
    public final SQLiteProgram f13665a;

    public C0938do(SQLiteProgram sQLiteProgram) {
        this.f13665a = sQLiteProgram;
    }

    /* renamed from: a */
    public final void mo8917a(int i) {
        this.f13665a.bindNull(i);
    }

    public final void close() {
        this.f13665a.close();
    }

    /* renamed from: a */
    public final void mo8918a(int i, long j) {
        this.f13665a.bindLong(i, j);
    }

    /* renamed from: a */
    public final void mo8919a(int i, String str) {
        this.f13665a.bindString(i, str);
    }

    /* renamed from: a */
    public final void mo8920a(int i, byte[] bArr) {
        this.f13665a.bindBlob(i, bArr);
    }
}
