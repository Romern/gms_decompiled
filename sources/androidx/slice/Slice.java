package androidx.slice;

import android.net.Uri;
import android.support.p001v4.graphics.drawable.IconCompat;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class Slice extends CustomVersionedParcelable implements avg {

    /* renamed from: a */
    static final String[] f1650a = new String[0];

    /* renamed from: b */
    static final SliceItem[] f1651b = new SliceItem[0];

    /* renamed from: c */
    public SliceSpec f1652c;

    /* renamed from: d */
    public SliceItem[] f1653d;

    /* renamed from: e */
    public String[] f1654e;

    /* renamed from: f */
    String f1655f;

    public Slice() {
        this.f1652c = null;
        this.f1653d = f1651b;
        this.f1654e = f1650a;
        this.f1655f = null;
    }

    /* renamed from: a */
    public static void m1631a(StringBuilder sb, String[] strArr) {
        int length;
        if (strArr != null && (length = strArr.length) != 0) {
            sb.append('(');
            int i = length - 1;
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(strArr[i2]);
                sb.append(", ");
            }
            sb.append(strArr[i]);
            sb.append(")");
        }
    }

    /* renamed from: b */
    public final List mo2045b() {
        return Arrays.asList(this.f1653d);
    }

    /* renamed from: c */
    public final List mo2046c() {
        return Arrays.asList(this.f1654e);
    }

    public final String toString() {
        return mo2044a("");
    }

    public Slice(ArrayList arrayList, String[] strArr, Uri uri, SliceSpec sliceSpec) {
        this.f1652c = null;
        this.f1653d = f1651b;
        this.f1655f = null;
        this.f1654e = strArr;
        this.f1653d = (SliceItem[]) arrayList.toArray(new SliceItem[arrayList.size()]);
        this.f1655f = uri.toString();
        this.f1652c = sliceSpec;
    }

    /* renamed from: a */
    public static boolean m1632a(IconCompat iconCompat) {
        if (iconCompat == null) {
            return false;
        }
        if (iconCompat.f1030a != 2 || iconCompat.mo1111c() != 0) {
            return true;
        }
        throw new IllegalArgumentException("Failed to add icon, invalid resource id: " + iconCompat.mo1111c());
    }

    /* renamed from: a */
    public final Uri mo2043a() {
        return Uri.parse(this.f1655f);
    }

    /* renamed from: a */
    public final String mo2044a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("Slice ");
        String[] strArr = this.f1654e;
        if (strArr.length > 0) {
            m1631a(sb, strArr);
            sb.append(' ');
        }
        sb.append('[');
        sb.append(this.f1655f);
        sb.append("] {\n");
        String str2 = str + "  ";
        int i = 0;
        while (true) {
            SliceItem[] sliceItemArr = this.f1653d;
            if (i < sliceItemArr.length) {
                sb.append(sliceItemArr[i].mo2052b(str2));
                i++;
            } else {
                sb.append(str);
                sb.append('}');
                return sb.toString();
            }
        }
    }
}
