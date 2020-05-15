package p000;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.Locale;

/* renamed from: uij */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uij extends uny {

    /* renamed from: a */
    public long f47686a = 0;

    /* renamed from: b */
    public long f47687b = 0;

    /* renamed from: c */
    public long f47688c = 5242880000000L;

    /* renamed from: d */
    public long f47689d;

    /* renamed from: e */
    public long f47690e = 0;

    /* renamed from: f */
    public final String f47691f;

    /* renamed from: g */
    public boolean f47692g;

    public uij(uno uno, long j, String str) {
        super(uno, uim.f47706a, j);
        this.f47691f = str.intern();
    }

    /* renamed from: a */
    public static uij m38677a(uno uno, Cursor cursor) {
        uij uij = new uij(uno, uim.f47706a.f48341a.mo27705b(cursor).longValue(), uil.ACCOUNT_HOLDER_NAME.f47705l.mo27702a(cursor));
        uij.f47692g = uil.FORCE_FULL_SYNC.f47705l.mo27718e(cursor);
        uij.mo27510a(uil.LAST_SYNC_SEQUENCE_NUMBER.f47705l.mo27705b(cursor).longValue());
        uij.mo27512b(uil.MINIMUM_CHANGE_SEQUENCE_NUMBER.f47705l.mo27705b(cursor).longValue());
        uij.f47690e = uil.LAST_SYNC_CHANGE_STAMP.f47705l.mo27705b(cursor).longValue();
        uij.f47688c = uil.MAX_UPLOAD_SIZE.f47705l.mo27705b(cursor).longValue();
        uij.f47689d = uil.FORCE_FULL_SYNC_LEVEL.f47705l.mo27705b(cursor).longValue();
        return uij;
    }

    /* renamed from: b */
    public final void mo27512b(long j) {
        sdo.m34974b(j >= 0);
        this.f47687b = j;
    }

    public final String toString() {
        return String.format(Locale.US, "Account[%s, sqlId=%d, forceFullSyncLevel=%d]", this.f47691f, Long.valueOf(this.f48366m), Long.valueOf(this.f47689d));
    }

    /* renamed from: a */
    public final void mo27510a(long j) {
        sdo.m34974b(j >= 0);
        this.f47686a = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27511a(ContentValues contentValues) {
        contentValues.put(uil.ACCOUNT_HOLDER_NAME.f47705l.mo27700a(), this.f47691f);
        contentValues.put(uil.FORCE_FULL_SYNC.f47705l.mo27700a(), Boolean.valueOf(this.f47692g));
        contentValues.put(uil.LAST_SYNC_SEQUENCE_NUMBER.f47705l.mo27700a(), Long.valueOf(this.f47686a));
        contentValues.put(uil.MINIMUM_CHANGE_SEQUENCE_NUMBER.f47705l.mo27700a(), Long.valueOf(this.f47687b));
        contentValues.put(uil.LAST_SYNC_CHANGE_STAMP.f47705l.mo27700a(), Long.valueOf(this.f47690e));
        contentValues.put(uil.MAX_UPLOAD_SIZE.f47705l.mo27700a(), Long.valueOf(this.f47688c));
        contentValues.put(uil.FORCE_FULL_SYNC_LEVEL.f47705l.mo27700a(), Long.valueOf(this.f47689d));
    }
}
