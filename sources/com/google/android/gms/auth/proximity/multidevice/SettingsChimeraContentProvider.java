package com.google.android.gms.auth.proximity.multidevice;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.ContentProvider;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SettingsChimeraContentProvider extends ContentProvider {
    /* renamed from: a */
    public static String m6884a(Context context, String str) {
        sdo.m34960a();
        SyncedCryptauthDevice a = jpv.m17085a(context, str);
        return a != null ? a.f11188c : Build.MODEL;
    }

    public final Bundle call(String str, String str2, Bundle bundle) {
        List<String> pathSegments;
        String str3;
        Uri parse = Uri.parse(str2);
        if (parse != null && "content".equals(parse.getScheme()) && "com.google.android.gms.auth.proximity.multidevice.settings.provider".equals(parse.getAuthority()) && parse.getPort() == -1 && (pathSegments = parse.getPathSegments()) != null && pathSegments.size() == 2 && str.equals(pathSegments.get(0))) {
            String str4 = pathSegments.get(1);
            if ("getText".equals(str)) {
                Bundle bundle2 = new Bundle();
                if ("summary".equals(str4)) {
                    if (jpe.m17064a(getContext())) {
                        str3 = getContext().getString(C0126R.string.settings_summary_enabled);
                    } else {
                        str3 = getContext().getString(C0126R.string.settings_summary_disabled, getContext().getString(C0126R.string.default_device_name));
                    }
                    bundle2.putString("com.android.settings.summary", str3);
                }
                if (!bundle2.isEmpty()) {
                    return bundle2;
                }
                return null;
            }
        }
        return null;
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        return false;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
