package p000;

import android.content.ContentUris;
import android.net.Uri;

/* renamed from: sgp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sgp {

    /* renamed from: a */
    public String[] f44432a;

    /* renamed from: b */
    private final Uri f44433b;

    /* renamed from: c */
    private StringBuilder f44434c;

    public sgp(Uri uri, String str, String[] strArr) {
        this.f44433b = uri;
        this.f44432a = strArr;
        if (str != null) {
            this.f44434c = new StringBuilder(str);
        }
    }

    /* renamed from: a */
    public final String mo25501a() {
        StringBuilder sb = this.f44434c;
        if (sb != null) {
            return sb.toString();
        }
        return null;
    }

    /* renamed from: b */
    public final void mo25505b(String str) {
        mo25506b(str, this.f44433b.getLastPathSegment());
    }

    /* renamed from: a */
    public final void mo25502a(String str) {
        rzz.m34729a(ContentUris.parseId(this.f44433b) >= 0);
        mo25505b(str);
    }

    /* renamed from: b */
    public final void mo25506b(String str, String str2) {
        String[] strArr;
        StringBuilder sb = this.f44434c;
        if (sb == null) {
            this.f44434c = new StringBuilder("(");
        } else {
            sb.append(" AND (");
        }
        this.f44434c.append(str);
        this.f44434c.append("=?");
        this.f44434c.append(")");
        String[] strArr2 = this.f44432a;
        if (strArr2 != null) {
            int length = strArr2.length;
            strArr = new String[(length + 1)];
            System.arraycopy(strArr2, 0, strArr, 0, length);
            strArr[length] = str2;
        } else {
            strArr = new String[]{str2};
        }
        this.f44432a = strArr;
    }

    /* renamed from: a */
    public final void mo25503a(String str, long j) {
        mo25506b(str, String.valueOf(j));
    }

    /* renamed from: a */
    public final void mo25504a(String str, String str2) {
        String queryParameter = this.f44433b.getQueryParameter(str);
        if (queryParameter != null) {
            mo25506b(str2, queryParameter);
        }
    }
}
