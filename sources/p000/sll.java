package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

/* renamed from: sll */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class sll implements srl {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo21850a(Object obj) {
        Context context = (Context) obj;
        SharedPreferences sharedPreferences = context.getSharedPreferences("NetworkUsageUploadStats", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        long j = sharedPreferences.getLong("timeLastUpdate", 0);
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = context.getSharedPreferences("NetworkReportServicePrefs", 0).getLong("lastDailyReportTaskEndTimestamp", smh.m35658c(currentTimeMillis).longValue());
        long longValue = j2 - ((Long) skj.f44622e.mo58455c()).longValue();
        if (j >= currentTimeMillis) {
            return null;
        }
        edit.putLong("timeLastUpdate", currentTimeMillis);
        if (edit.commit()) {
            return smg.m35653a(context.getContentResolver(), longValue, j2);
        }
        Log.e("StatsUploader", "statsuploader editor.commit failed");
        return null;
    }
}
