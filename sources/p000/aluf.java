package p000;

import android.accounts.Account;
import android.util.Pair;
import com.google.android.gms.people.internal.SyncStatus;

/* renamed from: aluf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aluf implements auca {

    /* renamed from: a */
    final /* synthetic */ Account f74298a;

    public aluf(Account account) {
        this.f74298a = account;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ aucb mo13157a(Object obj) {
        SyncStatus syncStatus = (SyncStatus) obj;
        return aucu.m76778a(Pair.create(alug.m61886a(this.f74298a), String.format("%s: %s", Integer.valueOf(syncStatus.f81931a), syncStatus.f81932b)));
    }
}
