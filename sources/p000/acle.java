package p000;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Process;
import com.google.android.chimera.ContentProvider;

/* renamed from: acle */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class acle extends ContentProvider {
    /* renamed from: a */
    public static void m49371a(Context context) {
        int callingUid = Binder.getCallingUid();
        if (callingUid != Process.myUid()) {
            try {
                if (context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).uid == callingUid) {
                    int i = rfx.f42891a;
                    return;
                }
                StringBuilder sb = new StringBuilder(52);
                sb.append("Calling UID ");
                sb.append(callingUid);
                sb.append(" is not Google Play Services.");
                throw new SecurityException(sb.toString());
            } catch (PackageManager.NameNotFoundException e) {
                throw new SecurityException("Google Play Services not installed", e);
            }
        }
    }

    /* renamed from: a */
    public abstract Cursor mo32832a(Uri uri, String[] strArr);

    /* renamed from: a */
    public abstract String mo32833a(Uri uri);

    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("delete not supported.");
    }

    public final String getType(Uri uri) {
        m49371a(getContext());
        return mo32833a(uri);
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("insert not supported.");
    }

    public final boolean onCreate() {
        return true;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        m49371a(getContext());
        return mo32832a(uri, strArr2);
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("update not supported.");
    }
}
