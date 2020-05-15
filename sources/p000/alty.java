package p000;

import android.net.Uri;
import java.io.Serializable;

/* renamed from: alty */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alty implements Serializable {

    /* renamed from: a */
    String f74277a;

    /* renamed from: b */
    String[] f74278b;

    /* renamed from: c */
    String f74279c;

    /* renamed from: d */
    String[] f74280d;

    public alty(Uri uri, String[] strArr) {
        this(uri, strArr, null, null);
    }

    public alty(Uri uri, String[] strArr, String str, String[] strArr2) {
        this.f74277a = uri.toString();
        this.f74278b = strArr;
        this.f74279c = str;
        this.f74280d = strArr2;
    }
}
