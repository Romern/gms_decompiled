package p000;

import android.content.Context;
import android.util.Log;

/* renamed from: abga */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abga extends soa {

    /* renamed from: a */
    final /* synthetic */ Context f57385a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public abga(Context context) {
        super(10);
        this.f57385a = context;
    }

    public final void run() {
        Context context = this.f57385a;
        sdo.m34973b("Must be called from a worker thread.");
        if (context != null && context.getDatabasePath("history_query.db").exists() && !context.deleteDatabase("history_query.db")) {
            Log.e("gH_SearchQueryHDb", "Failed to delete old database file.");
        }
    }
}
