package p000;

import android.database.Cursor;
import android.net.Uri;

/* renamed from: acoc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acoc extends bnch {

    /* renamed from: a */
    private final String f60317a;

    /* renamed from: b */
    private final acne f60318b;

    /* renamed from: c */
    private final Uri f60319c;

    /* renamed from: d */
    private int f60320d = 0;

    /* renamed from: e */
    private Cursor f60321e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8969a() {
        if (this.f60321e == null) {
            acne acne = this.f60318b;
            Uri uri = this.f60319c;
            String str = this.f60317a;
            String[] strArr = {str};
            String concat = str.concat(" > ?");
            String[] strArr2 = {String.valueOf(this.f60320d)};
            String str2 = this.f60317a;
            StringBuilder sb = new StringBuilder(str2.length() + 15);
            sb.append(str2);
            sb.append(" ASC LIMIT 1000");
            this.f60321e = acne.mo32907a(uri, strArr, concat, strArr2, sb.toString());
        }
        Cursor cursor = this.f60321e;
        if (cursor != null) {
            if (cursor.moveToNext()) {
                Integer a = sra.m36060a(this.f60321e, 0);
                if (a != null) {
                    this.f60320d = a.intValue();
                }
                if (this.f60321e.isLast()) {
                    this.f60321e.close();
                    this.f60321e = null;
                }
                return Integer.valueOf(this.f60320d);
            }
            this.f60321e.close();
        }
        return (Integer) mo67118d();
    }

    public acoc(String str, acne acne, Uri uri) {
        this.f60317a = str;
        this.f60318b = acne;
        this.f60319c = uri;
    }
}
