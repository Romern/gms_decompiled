package p000;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.net.URISyntaxException;

/* renamed from: abab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abab {

    /* renamed from: a */
    private final Context f56922a;

    public abab(Context context) {
        this.f56922a = context;
    }

    /* renamed from: a */
    public static final Boolean m47339a(String str) {
        if (str.equals("1")) {
            return true;
        }
        return str.equals("0") ? false : null;
    }

    /* renamed from: d */
    private final aazz m47340d(bzpb bzpb) {
        Cursor a;
        if (!TextUtils.isEmpty(bzpb.f170895c) && (a = mo31962a(new Uri.Builder().scheme("content").authority("com.google.android.settings.external").path("settings_manager").appendPath(bzpb.f170895c).build())) != null) {
            try {
                a.moveToPosition(0);
                aazz aazz = new aazz();
                aazz.f56918a = a.getString(0);
                aazz.f56919b = a.getString(1);
                aazz.f56920c = a.getString(2);
                return aazz;
            } catch (Exception e) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public final Intent mo31964b(bzpb bzpb) {
        aazz d = m47340d(bzpb);
        if (d == null || TextUtils.isEmpty(d.f56920c)) {
            return null;
        }
        try {
            return Intent.parseUri(d.f56920c, 0);
        } catch (URISyntaxException e) {
            String valueOf = String.valueOf(d.f56920c);
            if (valueOf.length() == 0) {
                new String("Invalid intent Uri: ");
            } else {
                "Invalid intent Uri: ".concat(valueOf);
            }
            return null;
        }
    }

    /* renamed from: c */
    public final Boolean mo31965c(bzpb bzpb) {
        aazz d;
        String str;
        int a = bzpa.m126002a(bzpb.f170894b);
        if (a == 0 || a != 2 || (d = m47340d(bzpb)) == null || (str = d.f56918a) == null) {
            return null;
        }
        return m47339a(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Cursor mo31962a(Uri uri) {
        try {
            return this.f56922a.getContentResolver().query(uri, null, null, null, null);
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: a */
    public final boolean mo31963a(bzpb bzpb) {
        String str;
        aazz d = m47340d(bzpb);
        if (d == null || (str = d.f56919b) == null) {
            return false;
        }
        return str.equals("0");
    }
}
