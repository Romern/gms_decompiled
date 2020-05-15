package p000;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.Locale;

/* renamed from: ulr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1596ulr extends uny {

    /* renamed from: a */
    public final txr f48150a;

    /* renamed from: b */
    public final long f48151b;

    /* renamed from: c */
    public final long f48152c;

    /* renamed from: d */
    public final long f48153d;

    public C1596ulr(uno uno, long j, long j2, txr txr, long j3, long j4) {
        super(uno, ulu.f48160a, j);
        this.f48153d = j2;
        sdo.m34959a(txr);
        this.f48150a = txr;
        this.f48151b = j3;
        this.f48152c = j4;
    }

    /* renamed from: a */
    public static C1596ulr m38942a(uno uno, Cursor cursor) {
        long longValue = ult.ACCOUNT_ID.f48159e.mo27705b(cursor).longValue();
        String a = ult.ACTION_TYPE.f48159e.mo27702a(cursor);
        return new C1596ulr(uno, ulu.f48160a.f48341a.mo27705b(cursor).longValue(), longValue, txr.m37691a(a), ult.ACTION_ID.f48159e.mo27705b(cursor).longValue(), ult.APPLY_ON_SERVER_TIME.f48159e.mo27705b(cursor).longValue());
    }

    public final String toString() {
        return String.format(Locale.US, "PendingCleanupAction [accountId=%s, actionType=%s, actionId=%s, applyOnServerTime=%s]", Long.valueOf(this.f48153d), this.f48150a, Long.valueOf(this.f48151b), Long.valueOf(this.f48152c));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27511a(ContentValues contentValues) {
        contentValues.put(ult.ACCOUNT_ID.f48159e.mo27700a(), Long.valueOf(this.f48153d));
        contentValues.put(ult.ACTION_TYPE.f48159e.mo27700a(), this.f48150a.f46950y);
        contentValues.put(ult.ACTION_ID.f48159e.mo27700a(), Long.valueOf(this.f48151b));
        contentValues.put(ult.APPLY_ON_SERVER_TIME.f48159e.mo27700a(), Long.valueOf(this.f48152c));
    }
}
