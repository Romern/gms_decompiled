package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: zsu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zsu implements Closeable {

    /* renamed from: a */
    public final Cursor f55836a;

    public zsu(Cursor cursor) {
        this.f55836a = cursor;
    }

    /* renamed from: d */
    private final String m46256d(int i) {
        try {
            return this.f55836a.getString(i);
        } catch (SQLiteException e) {
            throw new IOException(e);
        }
    }

    /* renamed from: i */
    private final int m46257i(String str) {
        try {
            return this.f55836a.getColumnIndexOrThrow(str);
        } catch (SQLiteException e) {
            throw new IOException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo31469a() {
        try {
            return this.f55836a.getCount();
        } catch (SQLiteException e) {
            throw new IOException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo31472b(String str) {
        return mo31470a(m46257i(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Long mo31475c(String str) {
        int i = m46257i(str);
        if (!mo31477c(i)) {
            return Long.valueOf(mo31473b(i));
        }
        return null;
    }

    public final void close() {
        this.f55836a.close();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final String mo31480e(String str) {
        int i = m46257i(str);
        if (!mo31477c(i)) {
            return m46256d(i);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final String mo31481f(String str) {
        int i = m46257i(str);
        bmxy.m108596a(!mo31477c(i), "%s was null", str);
        return m46256d(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final byte[] mo31482g(String str) {
        int i = m46257i(str);
        bmxy.m108596a(!mo31477c(i), "%s was null", str);
        try {
            return this.f55836a.getBlob(i);
        } catch (SQLiteException e) {
            throw new IOException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo31483h(String str) {
        try {
            return this.f55836a.getColumnIndex(str);
        } catch (SQLiteException e) {
            throw new IOException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final long mo31473b(int i) {
        try {
            return this.f55836a.getLong(i);
        } catch (SQLiteException e) {
            throw new IOException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo31476c() {
        try {
            return this.f55836a.moveToNext();
        } catch (SQLiteException e) {
            throw new IOException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo31470a(int i) {
        try {
            return this.f55836a.getInt(i);
        } catch (SQLiteException e) {
            throw new IOException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final long mo31479d(String str) {
        return mo31473b(m46257i(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo31474b() {
        try {
            return this.f55836a.moveToFirst();
        } catch (SQLiteException e) {
            throw new IOException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo31477c(int i) {
        try {
            return this.f55836a.isNull(i);
        } catch (SQLiteException e) {
            throw new IOException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo31471a(String str) {
        return mo31472b(str) != 0;
    }
}
