package com.google.android.gms.update.phone;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.ContentProvider;
import com.google.android.gms.update.SystemUpdateStatus;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OtaSuggestionSummaryChimeraProvider extends ContentProvider {

    /* renamed from: a */
    private static final sek f109498a = avpq.m79022i("OtaSuggestionSummaryChimeraProvider");

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    public final Bundle call(String str, String str2, Bundle bundle) {
        int i;
        String str3;
        String str4;
        f109498a.mo25414c("OtaSuggestionSummaryChimeraProvider is called!", new Object[0]);
        Bundle bundle2 = new Bundle();
        Context context = getContext();
        try {
            long currentTimeMillis = System.currentTimeMillis() - ((SystemUpdateStatus) aucu.m76782a(avko.m78681a(context).mo51341a())).f109472n;
            int max = (int) Math.max(TimeUnit.MILLISECONDS.toDays(currentTimeMillis), 1L);
            int b = avmd.m78787b(currentTimeMillis);
            if ("getSummary".equals(str)) {
                if (b != 2) {
                    i = b != 3 ? C0126R.C0127drawable.quantum_gm_ic_system_update_blue_24 : C0126R.C0127drawable.quantum_gm_ic_system_update_red_24;
                } else {
                    i = C0126R.C0127drawable.quantum_gm_ic_system_update_orange_24;
                }
                Icon createWithResource = Icon.createWithResource(context, qkj.m32287a(context, i));
                if (b == 0) {
                    str3 = context.getText(C0126R.string.system_update_overdue_suggestion_title_text).toString();
                } else {
                    str3 = context.getText(C0126R.string.system_update_overdue_status_text).toString();
                }
                bundle2.putString("com.android.settings.title", str3);
                if (b == 0) {
                    str4 = context.getText(C0126R.string.system_update_update_available_title_text).toString();
                } else {
                    str4 = TextUtils.expandTemplate(context.getText(C0126R.string.system_update_overdue_warning), context.getResources().getQuantityString(C0126R.plurals.ota_unit_days, max, Integer.valueOf(max))).toString();
                }
                bundle2.putString("com.android.settings.summary", str4);
                bundle2.putParcelable("com.android.settings.icon", createWithResource);
            }
            return bundle2;
        } catch (InterruptedException | ExecutionException e) {
            f109498a.mo25417e("Unable to get SystemUpdateStatus", e, new Object[0]);
            return bundle2;
        }
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("delete operation not supported currently.");
    }

    public final String getType(Uri uri) {
        throw new UnsupportedOperationException("getType operation not supported currently.");
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("insert operation not supported currently.");
    }

    public final boolean onCreate() {
        return true;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new UnsupportedOperationException("query operation not supported currently.");
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("update operation not supported currently.");
    }
}
