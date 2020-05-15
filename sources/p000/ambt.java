package p000;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* renamed from: ambt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ambt {

    /* renamed from: a */
    private final char f74670a = 2;

    /* renamed from: b */
    private final String f74671b = Pattern.quote("\u0001");

    /* renamed from: c */
    private final String f74672c = Pattern.quote(String.valueOf(this.f74670a));

    /* renamed from: d */
    private final Bundle f74673d;

    static {
        new ambs(Bundle.EMPTY);
        new ambr(Bundle.EMPTY);
    }

    public ambt(Bundle bundle) {
        this.f74673d = bundle;
    }

    /* renamed from: a */
    private static double m62555a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0.0d;
        }
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e) {
            Log.e("PhoneEmailDecoder", "NumberFormatException", e);
            return 0.0d;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo41118a(String str, String str2, double d, double d2, double d3, double d4, double d5, String str3, String str4, String str5, String str6, String str7);

    /* renamed from: a */
    private static int m62556a(String str, int i, int i2) {
        int indexOf = str.indexOf(1, i);
        if (indexOf >= 0 && indexOf < i2) {
            return indexOf;
        }
        return -1;
    }

    /* renamed from: a */
    private final void m62557a(ArrayList arrayList, String str, String str2, String str3, double d, double d2, double d3, double d4, double d5, String str4, String str5, String str6, String str7, String str8) {
        if (!TextUtils.isEmpty(str3)) {
            String string = this.f74673d.getString(str);
            arrayList.add(mo41118a(str3, TextUtils.isEmpty(string) ? str2 : string, d, d2, d3, d4, d5, str4, str5, str6, str7, str8));
        }
    }

    /* renamed from: a */
    public final ArrayList mo41119a(String str, boolean z) {
        int i;
        int i2;
        String[] strArr;
        int i3;
        int i4;
        ambt ambt = this;
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        if (z) {
            String[] split = TextUtils.split(str2, ambt.f74672c);
            int length = split.length;
            int i5 = 0;
            while (i5 < length) {
                String[] split2 = TextUtils.split(split[i5], ambt.f74671b);
                if (split2.length >= 13) {
                    i4 = i5;
                    i3 = length;
                    strArr = split;
                    m62557a(arrayList, split2[0], split2[1], split2[2], m62555a(split2[3]), m62555a(split2[4]), m62555a(split2[5]), m62555a(split2[6]), m62555a(split2[7]), ancm.m64014c(split2[8]), ancm.m64014c(split2[9]), ancm.m64014c(split2[10]), ancm.m64014c(split2[11]), ancm.m64014c(split2[12]));
                } else {
                    strArr = split;
                    i4 = i5;
                    i3 = length;
                    Log.w("PhoneEmailDecoder", "Invalid string");
                }
                i5 = i4 + 1;
                ambt = this;
                length = i3;
                split = strArr;
            }
        } else {
            int length2 = str.length();
            int i6 = 0;
            while (i6 < length2) {
                int indexOf = str2.indexOf(this.f74670a, i6);
                int length3 = indexOf < 0 ? str.length() : indexOf;
                int a = m62556a(str2, i6, length3);
                int i7 = a + 1;
                int a2 = m62556a(str2, i7, length3);
                if (a < 0) {
                    i = length2;
                    i2 = length3;
                } else if (a2 >= 0) {
                    i2 = length3;
                    i = length2;
                    m62557a(arrayList, str2.substring(i6, a), str2.substring(i7, a2), str2.substring(a2 + 1, length3), 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, null, null, null, null);
                } else {
                    i = length2;
                    i2 = length3;
                }
                i6 = i2 + 1;
                str2 = str;
                length2 = i;
            }
        }
        return arrayList;
    }
}
