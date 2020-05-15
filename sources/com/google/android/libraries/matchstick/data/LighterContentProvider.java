package com.google.android.libraries.matchstick.data;

import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.chimera.ContentProvider;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LighterContentProvider extends ContentProvider {
    /* renamed from: a */
    private final bdae m94545a(Uri uri) {
        if (TextUtils.equals(uri.getPathSegments().get(0), "REGISTRATION")) {
            return azbj.m85193a(getContext().getApplicationContext()).f98901a.f111329m;
        }
        return azbj.m85193a(getContext().getApplicationContext()).f98901a.f111327k.mo56560a(Long.parseLong(uri.getPathSegments().get(2)));
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return m94545a(uri).mo54675a(uri, str, strArr);
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        long a = m94545a(uri).mo54676a(uri, contentValues, (int) ContentUris.parseId(uri));
        if (a != -1) {
            return ContentUris.withAppendedId(uri, a);
        }
        return null;
    }

    public final boolean onCreate() {
        return true;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        char c;
        String str3 = uri.getPathSegments().get(1);
        switch (str3.hashCode()) {
            case -284475740:
                if (str3.equals("IN_TRANSACTION")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -279543109:
                if (str3.equals("TRANSACTION_SUCCESSFUL")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1063620922:
                if (str3.equals("END_TRANSACTION")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1929494536:
                if (str3.equals("BEGIN_TRANSACTION")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            if (!m94545a(uri).mo54680c()) {
                m94545a(uri).mo54678a();
            }
            return new MatrixCursor(new String[0]);
        } else if (c == 1) {
            if (m94545a(uri).mo54680c()) {
                m94545a(uri).mo54679b();
            }
            return new MatrixCursor(new String[0]);
        } else if (c == 2) {
            boolean c2 = m94545a(uri).mo54680c();
            MatrixCursor matrixCursor = new MatrixCursor(new String[]{"in_transaction"});
            matrixCursor.addRow(new Object[]{Integer.valueOf(c2 ? 1 : 0)});
            return matrixCursor;
        } else if (c != 3) {
            return m94545a(uri).mo54677a(uri, strArr, str, strArr2, str2, null);
        } else {
            if (m94545a(uri).mo54680c()) {
                m94545a(uri).mo54681d();
            }
            return new MatrixCursor(new String[0]);
        }
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return m94545a(uri).mo54674a(uri, contentValues, str, strArr);
    }
}
