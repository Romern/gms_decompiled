package p000;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientActionDataEntity;

/* renamed from: shz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class shz {
    /* renamed from: a */
    public static void m35337a(Context context, String str, FavaDiagnosticsEntity favaDiagnosticsEntity, FavaDiagnosticsEntity favaDiagnosticsEntity2, FavaDiagnosticsEntity favaDiagnosticsEntity3, String str2) {
        if (context.getPackageName() == null) {
            Log.e("PlusAnalytics", "Package name for the given context is null. Unable to log given action.");
            return;
        }
        shy shy = new shy(context);
        shy.mo25576a(str);
        shy.mo25573a(favaDiagnosticsEntity);
        shy.mo25581c(favaDiagnosticsEntity2);
        shy.mo25582c((String) null);
        shy.mo25579b(str2);
        m35341a(context, shy);
        shy shy2 = new shy(context);
        shy2.mo25576a(str);
        shy2.mo25581c(favaDiagnosticsEntity2);
        shy2.mo25578b(favaDiagnosticsEntity3);
        shy2.mo25579b(str2);
        m35341a(context, shy2);
    }

    /* renamed from: a */
    public static void m35338a(Context context, String str, FavaDiagnosticsEntity favaDiagnosticsEntity, FavaDiagnosticsEntity favaDiagnosticsEntity2, String str2) {
        if (context == null || context.getPackageName() == null) {
            Log.e("PlusAnalytics", "Package name for the given context is null. Unable to log given action.");
            return;
        }
        shy shy = new shy(context);
        shy.mo25576a(str);
        shy.mo25581c(favaDiagnosticsEntity);
        shy.mo25578b(favaDiagnosticsEntity2);
        shy.mo25579b(str2);
        m35341a(context, shy);
    }

    /* renamed from: a */
    public static void m35339a(Context context, String str, String str2, FavaDiagnosticsEntity favaDiagnosticsEntity, FavaDiagnosticsEntity favaDiagnosticsEntity2, String str3) {
        m35340a(context, str, str2, favaDiagnosticsEntity, favaDiagnosticsEntity2, str3, null);
    }

    /* renamed from: a */
    public static void m35340a(Context context, String str, String str2, FavaDiagnosticsEntity favaDiagnosticsEntity, FavaDiagnosticsEntity favaDiagnosticsEntity2, String str3, ClientActionDataEntity clientActionDataEntity) {
        if (context == null || context.getPackageName() == null) {
            Log.e("PlusAnalytics", "Package name for the given context is null. Unable to log given action.");
            return;
        }
        shy shy = new shy(context);
        shy.mo25576a(str);
        shy.mo25573a(favaDiagnosticsEntity);
        shy.mo25581c(favaDiagnosticsEntity2);
        shy.mo25582c(str2);
        shy.mo25579b(str3);
        if (clientActionDataEntity != null) {
            shy.mo25575a(clientActionDataEntity);
        }
        m35341a(context, shy);
    }

    /* renamed from: a */
    public static void m35341a(Context context, shy shy) {
        Intent e = shy.mo25584e();
        if (!context.getPackageManager().queryIntentServices(e, 0).isEmpty()) {
            context.startService(e);
        } else if (Log.isLoggable("PlusAnalytics", 5)) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Unable to log plus action: ");
            sb.append(valueOf);
            Log.w("PlusAnalytics", sb.toString());
        }
    }
}
