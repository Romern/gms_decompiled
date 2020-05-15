package p000;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: ujp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ujp extends uny {

    /* renamed from: a */
    public final long f47809a;

    /* renamed from: b */
    public String f47810b;

    public ujp(uno uno, long j, long j2, String str) {
        super(uno, ujs.f47815a, j);
        this.f47809a = j2;
        this.f47810b = str;
    }

    /* renamed from: a */
    public static ujp m38710a(uno uno, Cursor cursor) {
        return new ujp(uno, ujs.f47815a.f48341a.mo27705b(cursor).longValue(), ujr.ACCOUNT_ID.f47814c.mo27705b(cursor).longValue(), ujr.RESOURCE_ID.f47814c.mo27702a(cursor));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27511a(ContentValues contentValues) {
        contentValues.put(ujr.ACCOUNT_ID.f47814c.mo27700a(), Long.valueOf(this.f47809a));
        contentValues.put(ujr.RESOURCE_ID.f47814c.mo27700a(), this.f47810b);
    }
}
