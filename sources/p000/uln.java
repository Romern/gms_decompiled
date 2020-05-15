package p000;

import android.content.ContentValues;
import java.util.Locale;

/* renamed from: uln */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uln extends uny {

    /* renamed from: h */
    public static final /* synthetic */ int f48131h = 0;

    /* renamed from: a */
    public final long f48132a;

    /* renamed from: b */
    public String f48133b;

    /* renamed from: c */
    public int f48134c;

    /* renamed from: d */
    public ukk f48135d;

    /* renamed from: e */
    public final long f48136e;

    /* renamed from: f */
    public volatile boolean f48137f;

    /* renamed from: g */
    public String f48138g;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    public uln(uno uno, long j, long j2, String str, ukk ukk, int i, long j3, boolean z, String str2) {
        super(uno, ulq.f48148a, j);
        this.f48132a = j2;
        sdo.m34966a((Object) str, (Object) "null payload");
        this.f48133b = str;
        this.f48135d = ukk;
        this.f48134c = i;
        this.f48136e = j3;
        this.f48137f = z;
        this.f48138g = str2;
    }

    /* renamed from: b */
    public static uhx m38936b() {
        return new ulm();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27511a(ContentValues contentValues) {
        contentValues.put(ulp.ACCOUNT_ID.f48147h.mo27700a(), Long.valueOf(this.f48132a));
        contentValues.put(ulp.PAYLOAD.f48147h.mo27700a(), this.f48133b);
        contentValues.put(ulp.ATTEMPT_COUNT.f48147h.mo27700a(), Integer.valueOf(this.f48134c));
        if (this.f48135d == null) {
            contentValues.putNull(ulp.REQUIRED_ENTRY_ID.f48147h.mo27700a());
        } else {
            contentValues.put(ulp.REQUIRED_ENTRY_ID.f48147h.mo27700a(), Long.valueOf(this.f48135d.f47941a));
        }
        contentValues.put(ulp.APPLY_LOCALLY_TIMESTAMP.f48147h.mo27700a(), Long.valueOf(this.f48136e));
        contentValues.put(ulp.IS_PAUSED.f48147h.mo27700a(), Boolean.valueOf(this.f48137f));
        contentValues.put(ulp.TRANSFER_PREFERENCES_OVERRIDE.f48147h.mo27700a(), this.f48138g);
    }

    public final String toString() {
        return String.format(Locale.US, "PendingAction[accountSqlId=%d, payload=%s, sqlId=%s]", Long.valueOf(this.f48132a), this.f48133b, Long.valueOf(this.f48366m));
    }

    /* renamed from: a */
    public final void mo27693a(String str) {
        sdo.m34959a((Object) str);
        this.f48133b = str;
    }

    /* renamed from: a */
    public final void mo27694a(boolean z) {
        this.f48137f = z;
        mo27725t();
    }
}
