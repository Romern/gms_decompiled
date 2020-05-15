package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ysa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class ysa implements yst {

    /* renamed from: a */
    public static final srn f54524a = zvt.m46581a();

    /* renamed from: b */
    protected final Context f54525b;

    public ysa(Context context) {
        this.f54525b = context;
    }

    /* renamed from: a */
    static Set m44681a(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(str, null);
        HashSet hashSet = new HashSet();
        if (string != null) {
            m44682a(hashSet, string.split(" "));
        }
        return hashSet;
    }

    /* renamed from: a */
    public void mo30712a(String str, String str2, Set set) {
        throw null;
    }

    /* renamed from: b */
    public final Set mo30715b() {
        SharedPreferences a = mo30711a();
        HashSet hashSet = new HashSet();
        for (String str : a.getAll().keySet()) {
            String[] split = str.split(" ");
            if (split.length == 2) {
                hashSet.add(split[0]);
            }
        }
        return hashSet;
    }

    /* renamed from: b */
    public void mo30716b(String str, String str2, Set set) {
        throw null;
    }

    /* renamed from: a */
    private static boolean m44682a(Collection collection, String[] strArr) {
        boolean z = false;
        for (String str : strArr) {
            if (str != null) {
                String trim = str.trim();
                if (!trim.isEmpty()) {
                    z = collection.add(trim) || z;
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final SharedPreferences mo30711a() {
        return this.f54525b.getSharedPreferences("fitness_account_scopes_v2", 0);
    }

    /* renamed from: a */
    public boolean mo30713a(String str, String str2) {
        bnsl bnsl = (bnsl) f54524a.mo68390d();
        bnsl.mo68432a("ysa", "a", 97, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68424a("Removing account %s for package %s", str, str2);
        SharedPreferences a = mo30711a();
        SharedPreferences.Editor edit = a.edit();
        boolean z = false;
        for (String str3 : a.getAll().keySet()) {
            String[] split = str3.split(" ");
            if (split.length == 2 && str.equals(split[0])) {
                if (str2 == null || str2.equals(split[1])) {
                    edit.remove(str3);
                    z = true;
                }
            }
        }
        if (z) {
            edit.apply();
        }
        return z;
    }

    /* renamed from: a */
    public final boolean mo30714a(String str, String[] strArr, String[] strArr2) {
        boolean z;
        Arrays.toString(strArr);
        Arrays.toString(strArr2);
        SharedPreferences a = mo30711a();
        Set a2 = m44681a(a, str);
        boolean z2 = true;
        if (strArr2 != null) {
            int length = strArr2.length;
            z = false;
            for (int i = 0; i < length; i++) {
                z = a2.remove(strArr2[i]) || z;
            }
        } else {
            z = false;
        }
        if (strArr == null) {
            z2 = z;
        } else if (!m44682a(a2, strArr) && !z) {
            z2 = false;
        }
        if (z2) {
            SharedPreferences.Editor edit = a.edit();
            if (a2.isEmpty()) {
                edit.remove(str);
            } else {
                edit.putString(str, TextUtils.join(" ", a2));
            }
            edit.commit();
        }
        return z2;
    }
}
