package p000;

import android.accounts.Account;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;

/* renamed from: aacy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aacy extends smx {
    public aacy(Context context) {
        super(context, "games_stub");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11595a() {
        return 3586;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo11596a(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        aaeg.m21154a("GamesStubSyncAdapter", "Syncing for no-op authority; exiting");
        return true;
    }
}
