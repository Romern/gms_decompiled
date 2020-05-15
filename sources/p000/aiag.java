package p000;

import android.content.Context;

/* renamed from: aiag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiag {

    /* renamed from: a */
    public final burh f68562a;

    /* renamed from: b */
    public final ahsi f68563b;

    /* renamed from: c */
    private final sqv f68564c;

    public aiag(Context context) {
        this.f68562a = (burh) ahgz.m55754a(context, burh.class);
        this.f68564c = (sqv) ahgz.m55754a(context, sqv.class);
        this.f68563b = (ahsi) ahgz.m55754a(context, ahsi.class);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo37331a() {
        this.f68562a.mo73033a(0);
        this.f68562a.mo73034a(mo37333c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo37332b() {
        return this.f68562a.mo73043g() || this.f68562a.mo73039c().getLong("KEY_NOTIFICATION_ALLOWED_AT_TIMESTAMP_SECONDS", 0) <= mo37333c();
    }

    /* renamed from: c */
    public final long mo37333c() {
        return this.f68564c.mo20505a() / 1000;
    }
}
