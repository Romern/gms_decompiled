package p000;

import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: ztv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ztv implements Closeable {

    /* renamed from: a */
    public final SQLiteStatement f55907a;

    public ztv(SQLiteStatement sQLiteStatement) {
        this.f55907a = sQLiteStatement;
    }

    public final void close() {
        this.f55907a.close();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo31510a() {
        try {
            this.f55907a.execute();
        } catch (SQLiteException e) {
            throw new IOException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo31511a(int i, long j) {
        this.f55907a.bindLong(i, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo31512a(byte[] bArr) {
        this.f55907a.bindBlob(5, bArr);
    }
}
