package com.google.android.gms.trustagent.common.framework.model.p069be;

import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.google.android.chimera.ContentProvider;
import java.util.HashMap;

/* renamed from: com.google.android.gms.trustagent.common.framework.model.be.ModelContentChimeraProvider */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ModelContentChimeraProvider extends ContentProvider {

    /* renamed from: a */
    private static final sbw f109147a = new sbw("TrustAgent", "[ModelContentChimeraProvider] ");

    /* renamed from: b */
    private static final UriMatcher f109148b;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f109148b = uriMatcher;
        uriMatcher.addURI("com.google.android.gms.trustagent.framework.model.be.provider", "/*", 1);
        f109148b.addURI("com.google.android.gms.trustagent.framework.model.be.provider", "/*/id/*", 2);
    }

    /* renamed from: a */
    public static Uri m93415a(String str) {
        return Uri.parse("content://" + "com.google.android.gms.trustagent.framework.model.be.provider/" + str);
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        if (f109148b.match(uri) == 2) {
            String str2 = uri.getPathSegments().get(0);
            try {
                aump.m77318a(str2).mo50667a(getContext()).mo50694b(uri.getPathSegments().get(2));
                return 1;
            } catch (aumn e) {
                sbw sbw = f109147a;
                sbw.mo25378c(sbw.f44039a, String.format("Cannot find model definition given for model name: %s.", str2), e);
                return 0;
            }
        } else {
            sbw sbw2 = f109147a;
            sbw2.mo25377c(sbw2.f44039a, String.format("Cannot recognize the URI: %s.", uri));
            return 0;
        }
    }

    public final String getType(Uri uri) {
        return "";
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        if (f109148b.match(uri) == 2) {
            String str = uri.getPathSegments().get(0);
            String str2 = uri.getPathSegments().get(2);
            if (contentValues == null) {
                try {
                    f109147a.mo25372b(f109147a.f44039a, String.format("Null model values, skipping database insert for: %s.", uri));
                } catch (aumn e) {
                    sbw sbw = f109147a;
                    sbw.mo25378c(sbw.f44039a, String.format("Cannot find model definition given for model name: %s.", str), e);
                    return Uri.EMPTY;
                }
            } else {
                aump.m77318a(str).mo50667a(getContext()).mo50693a(str2, contentValues);
            }
            return m93416a(str, str2);
        }
        sbw sbw2 = f109147a;
        sbw2.mo25377c(sbw2.f44039a, String.format("Cannot recognize the URI: %s.", uri));
        return Uri.EMPTY;
    }

    public final boolean onCreate() {
        return true;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int match = f109148b.match(uri);
        if (match == 1) {
            String str3 = uri.getPathSegments().get(0);
            HashMap hashMap = new HashMap();
            for (String str4 : uri.getQueryParameterNames()) {
                String queryParameter = uri.getQueryParameter(str4);
                if (queryParameter != null) {
                    hashMap.put(str4, queryParameter);
                }
            }
            try {
                return aump.m77318a(str3).mo50667a(getContext()).mo50691a(hashMap);
            } catch (aumn e) {
                sbw sbw = f109147a;
                sbw.mo25378c(sbw.f44039a, String.format("Cannot find model definition given for model name: %s.", str3), e);
                return new MatrixCursor(new String[0]);
            }
        } else if (match == 2) {
            String str5 = uri.getPathSegments().get(0);
            try {
                return aump.m77318a(str5).mo50667a(getContext()).mo50690a(uri.getPathSegments().get(2));
            } catch (aumn e2) {
                sbw sbw2 = f109147a;
                sbw2.mo25378c(sbw2.f44039a, String.format("Cannot find model definition given for model name: %s.", str5), e2);
                return new MatrixCursor(new String[0]);
            }
        } else {
            sbw sbw3 = f109147a;
            sbw3.mo25377c(sbw3.f44039a, String.format("Cannot recognize the URI: %s.", uri));
            return new MatrixCursor(new String[0]);
        }
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public static Uri m93416a(String str, String str2) {
        return Uri.parse("content://" + "com.google.android.gms.trustagent.framework.model.be.provider/" + str + "/id/" + str2);
    }
}
