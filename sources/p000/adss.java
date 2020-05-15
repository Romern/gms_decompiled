package p000;

import android.database.Cursor;

/* renamed from: adss */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class adss extends bnch {

    /* renamed from: a */
    protected long f62660a;

    /* renamed from: b */
    protected int f62661b;

    /* renamed from: c */
    protected Cursor f62662c;

    public adss(long j, int i) {
        this.f62661b = i;
        this.f62660a = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo8969a() {
        if (this.f62662c == null) {
            this.f62662c = mo33787b();
        }
        Cursor cursor = this.f62662c;
        if (cursor != null) {
            if (cursor.moveToNext()) {
                Object c = mo33788c();
                if (this.f62662c.isLast()) {
                    this.f62662c.close();
                    this.f62662c = null;
                }
                return c;
            }
            this.f62662c.close();
        }
        return mo67118d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Cursor mo33787b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Object mo33788c();
}
