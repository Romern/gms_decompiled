package p000;

import android.accounts.Account;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;
import android.util.Log;

/* renamed from: amvf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amvf extends smx {

    /* renamed from: a */
    private final Context f75999a;

    /* renamed from: b */
    private amve f76000b;

    public amvf(Context context) {
        super(context.getApplicationContext(), false, "people");
        this.f75999a = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11595a() {
        return 5380;
    }

    public final void onSyncCanceled() {
        Log.i("FSA2_GmsContactsSyncAdapter", "onSyncCanceled");
        amve amve = this.f76000b;
        if (amve == null) {
            super.onSyncCanceled();
        } else {
            amve.mo41364a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo11596a(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        Log.i("FSA2_GmsContactsSyncAdapter", "@onPerformSync");
        Context context = this.f75999a;
        ampm a = ampm.m63135a(context, context.getApplicationInfo().uid);
        Context applicationContext = this.f75999a.getApplicationContext();
        ContentResolver contentResolver = this.f75999a.getContentResolver();
        alsj a2 = alsj.m61651a(this.f75999a);
        andd andd = new andd(this.f75999a);
        amvd.m63344a();
        amve a3 = amve.m63345a(applicationContext, contentResolver, a, a2, andd);
        this.f76000b = a3;
        a3.mo41365a(account, bundle, "com.android.contacts", syncResult);
        return true;
    }
}
