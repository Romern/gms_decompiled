package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

/* renamed from: anko */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anko {

    /* renamed from: a */
    private final SharedPreferences f77026a;

    public anko(Context context) {
        this.f77026a = context.getSharedPreferences("platform_prefs", 0);
    }

    /* renamed from: a */
    static String m64678a(Set set) {
        return bmxr.m108544a(":").mo66874a((Iterable) set);
    }

    /* renamed from: a */
    static TreeSet m64679a(String str) {
        TreeSet treeSet = new TreeSet();
        if (!TextUtils.isEmpty(str)) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ":");
            while (stringTokenizer.hasMoreTokens()) {
                treeSet.add(stringTokenizer.nextToken());
            }
        }
        return treeSet;
    }

    /* renamed from: a */
    private final void m64680a(String str, String str2) {
        SharedPreferences.Editor edit = this.f77026a.edit();
        edit.putString(str, str2);
        edit.commit();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo41913a(int i, String str, String str2) {
        if (str == null) {
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            } else if (i2 == 0) {
                return this.f77026a.getString(str2, null);
            } else {
                if (i2 == 1) {
                    return this.f77026a.getString(str2.length() == 0 ? new String("_boot_") : "_boot_".concat(str2), null);
                } else if (i != 0) {
                    StringBuilder sb = new StringBuilder(31);
                    sb.append("unknown ConfigType: ");
                    sb.append(i2);
                    throw new RuntimeException(sb.toString());
                } else {
                    throw null;
                }
            }
        } else {
            SharedPreferences sharedPreferences = this.f77026a;
            StringBuilder sb2 = new StringBuilder(str.length() + 1 + str2.length());
            sb2.append(str);
            sb2.append(".");
            sb2.append(str2);
            return sharedPreferences.getString(sb2.toString(), null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo41914a(int i, String str, String str2, String str3) {
        if (str == null) {
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            } else if (i2 == 0) {
                m64680a(str2, str3);
            } else if (i2 == 1) {
                m64680a(str2.length() == 0 ? new String("_boot_") : "_boot_".concat(str2), str3);
            }
        } else {
            StringBuilder sb = new StringBuilder(str.length() + 1 + str2.length());
            sb.append(str);
            sb.append(".");
            sb.append(str2);
            m64680a(sb.toString(), str3);
        }
    }
}
