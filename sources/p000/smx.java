package p000;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.SyncResult;
import android.os.Bundle;

/* renamed from: smx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class smx extends AbstractThreadedSyncAdapter {

    /* renamed from: a */
    private final Context f44783a;

    /* renamed from: b */
    private final String f44784b;

    /* renamed from: c */
    private final aacb f44785c;

    @Deprecated
    public smx(Context context, String str) {
        this(context, false, false, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo11595a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo11596a(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.framework.tracing.AbstractGmsTracer.a(java.lang.String, bmzi, android.content.Intent, boolean):blji
     arg types: [java.lang.String, ?[OBJECT, ARRAY], ?[OBJECT, ARRAY], int]
     candidates:
      com.google.android.gms.framework.tracing.AbstractGmsTracer.a(aabt, java.lang.String, zzq, boolean):blji
      com.google.android.gms.framework.tracing.AbstractGmsTracer.a(java.lang.String, bmzi, android.content.Intent, boolean):blji */
    public final void onPerformSync(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        blji blji;
        try {
            aacb aacb = this.f44785c;
            blji = null;
            if (aacb != null) {
                blji = aacb.mo19212a(aacb.mo19214a(new smw(str).f44782a), (bmzi) null, (Intent) null, false);
            }
            sdo.m34959a((Object) this.f44784b);
            Context context = this.f44783a;
            String str2 = this.f44784b;
            slw.m35610a(context, slp.m35590a(this, str2), 10, str2, null, 0, null);
            shr.m35316b(mo11595a());
            mo11596a(account, bundle, str, contentProviderClient, syncResult);
            Context context2 = this.f44783a;
            String str3 = this.f44784b;
            slw.m35610a(context2, slp.m35590a(this, str3), 11, str3, null, 0, null);
            if (blji != null) {
                blji.close();
            }
            shr.m35312a();
            return;
        } catch (Throwable th) {
            shr.m35312a();
            throw th;
        }
        throw th;
    }

    public smx(Context context, boolean z, String str) {
        this(context, z, false, str);
    }

    public smx(Context context, boolean z, boolean z2, String str) {
        super(context, z, z2);
        this.f44783a = context.getApplicationContext();
        String valueOf = String.valueOf(shq.m35306a(mo11595a()));
        this.f44784b = valueOf.length() == 0 ? new String("sync:") : "sync:".concat(valueOf);
        this.f44785c = new aacb(getClass(), str);
    }
}
