package p000;

import android.database.Cursor;

/* renamed from: acny */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class acny extends bnch {

    /* renamed from: a */
    protected long f60305a;

    /* renamed from: b */
    protected int f60306b;

    /* renamed from: c */
    protected Cursor f60307c;

    public acny(long j, int i) {
        this.f60306b = i;
        this.f60305a = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo8969a() {
        if (this.f60307c == null) {
            this.f60307c = mo32939b();
        }
        Cursor cursor = this.f60307c;
        if (cursor != null) {
            if (cursor.moveToNext()) {
                Object c = mo32940c();
                Cursor cursor2 = this.f60307c;
                if (cursor2 != null && cursor2.isLast()) {
                    this.f60307c.close();
                    this.f60307c = null;
                }
                return c;
            }
            this.f60307c.close();
        }
        return mo67118d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Cursor mo32939b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Object mo32940c();
}
