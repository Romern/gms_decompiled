package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: afqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class afqn {
    /* renamed from: a */
    static absl m53449a(Uri uri, List list) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            absl absl = (absl) list.get(i);
            String path = uri.getPath();
            String str = absl.f58111a;
            ArrayList arrayList = new ArrayList(Uri.parse(str).getPathSegments());
            ArrayList arrayList2 = new ArrayList(uri.getPathSegments());
            if (arrayList2.size() >= 3 && arrayList.size() >= 3 && TextUtils.equals((CharSequence) arrayList.get(2), "*")) {
                arrayList.set(2, (String) arrayList2.get(2));
                String str2 = File.separator;
                String join = TextUtils.join(File.separator, arrayList);
                String str3 = File.separator;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + String.valueOf(join).length() + String.valueOf(str3).length());
                sb.append(str2);
                sb.append(join);
                sb.append(str3);
                str = sb.toString();
            }
            i++;
            if (path.startsWith(str)) {
                return absl;
            }
        }
        return null;
    }
}
