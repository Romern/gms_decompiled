package p000;

import android.database.Cursor;

/* renamed from: adrr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class adrr implements AutoCloseable {

    /* renamed from: a */
    protected Cursor f62587a;

    /* renamed from: a */
    public final boolean mo33750a() {
        return !this.f62587a.isClosed() && this.f62587a.getCount() != 0 && !this.f62587a.isLast();
    }

    /* renamed from: b */
    public final adsg mo33751b() {
        if (this.f62587a.moveToNext()) {
            return mo33752c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract adsg mo33752c();

    public final void close() {
        this.f62587a.close();
    }

    /* renamed from: d */
    public final adsg mo33754d() {
        if (this.f62587a.isClosed() || this.f62587a.getCount() == 0) {
            return null;
        }
        int position = this.f62587a.getPosition();
        this.f62587a.moveToFirst();
        adsg c = mo33752c();
        this.f62587a.moveToPosition(position);
        return c;
    }
}
