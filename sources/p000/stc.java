package p000;

import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* renamed from: stc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class stc {
    /* renamed from: a */
    public static Set m36281a(Collection collection) {
        sdo.checkIfNull(collection, "scopeStrings can't be null.");
        return m36282a((String[]) collection.toArray(new String[collection.size()]));
    }

    /* renamed from: a */
    public static Set m36282a(String... strArr) {
        sdo.checkIfNull(strArr, "scopeStrings can't be null.");
        int length = strArr.length;
        HashSet hashSet = new HashSet(length);
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                hashSet.add(new Scope(str));
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public static String[] m36283a(Set set) {
        sdo.checkIfNull(set, "scopes can't be null.");
        return m36284a((Scope[]) set.toArray(new Scope[set.size()]));
    }

    /* renamed from: a */
    public static String[] m36284a(Scope[] scopeArr) {
        sdo.checkIfNull(scopeArr, "scopes can't be null.");
        String[] strArr = new String[scopeArr.length];
        for (int i = 0; i < scopeArr.length; i++) {
            strArr[i] = scopeArr[i].f30106b;
        }
        return strArr;
    }
}
