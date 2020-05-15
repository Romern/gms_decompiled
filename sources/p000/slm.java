package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: slm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class slm implements srl {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo21850a(Object obj) {
        Context context = (Context) obj;
        SharedPreferences sharedPreferences = context.getSharedPreferences("NetworkUsageUploadStats", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        long j = sharedPreferences.getLong("timeLastUpdate", 0);
        long timeInMillis = sqn.m35983a().getTimeInMillis();
        if (j >= timeInMillis) {
            return null;
        }
        long j2 = -86400000 + timeInMillis;
        edit.putLong("timeLastUpdate", timeInMillis);
        if (edit.commit()) {
            return smg.m35653a(context.getContentResolver(), j2, timeInMillis - 1);
        }
        return null;
    }
}
