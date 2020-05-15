package p000;

import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: vkw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vkw {

    /* renamed from: a */
    public final List f49421a;

    /* renamed from: b */
    public final String f49422b;

    /* renamed from: c */
    public final Long f49423c;

    public vkw(List list, String str, Long l) {
        sdo.m34959a(list);
        this.f49421a = Collections.unmodifiableList(list);
        this.f49422b = str;
        this.f49423c = l;
    }

    public final String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[4];
        boolean z = false;
        objArr[0] = Integer.valueOf(this.f49421a.size());
        String str = this.f49422b;
        objArr[1] = str;
        if (str != null) {
            z = true;
        }
        objArr[2] = Boolean.valueOf(z);
        objArr[3] = this.f49423c;
        return String.format(locale, "ResultsPage[numFiles=%d, nextPageToken=%s, isClipped=%b, largestChangestamp=%d]", objArr);
    }
}
