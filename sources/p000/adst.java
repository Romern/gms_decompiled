package p000;

import android.database.Cursor;
import android.net.Uri;

/* renamed from: adst */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adst extends bnch {

    /* renamed from: a */
    private final String f62663a;

    /* renamed from: b */
    private final adnr f62664b;

    /* renamed from: c */
    private final Uri f62665c;

    /* renamed from: d */
    private int f62666d = 0;

    /* renamed from: e */
    private Cursor f62667e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8969a() {
        if (this.f62667e == null) {
            adnr adnr = this.f62664b;
            Uri uri = this.f62665c;
            String str = this.f62663a;
            String[] strArr = {str};
            String concat = str.concat(" > ?");
            String[] strArr2 = {String.valueOf(this.f62666d)};
            String str2 = this.f62663a;
            StringBuilder sb = new StringBuilder(str2.length() + 15);
            sb.append(str2);
            sb.append(" ASC LIMIT 1000");
            this.f62667e = adnr.mo33689a(uri, strArr, concat, strArr2, sb.toString());
        }
        Cursor cursor = this.f62667e;
        if (cursor != null) {
            if (cursor.moveToNext()) {
                Integer a = sra.m36060a(this.f62667e, 0);
                if (a != null) {
                    this.f62666d = a.intValue();
                }
                if (this.f62667e.isLast()) {
                    this.f62667e.close();
                    this.f62667e = null;
                }
                return Integer.valueOf(this.f62666d);
            }
            this.f62667e.close();
        }
        return (Integer) mo67118d();
    }

    public adst(String str, adnr adnr, Uri uri) {
        this.f62663a = str;
        this.f62664b = adnr;
        this.f62665c = uri;
    }
}
