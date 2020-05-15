package p000;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: afqu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class afqu {
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0076, code lost:
        if (r6.equals(".") != false) goto L_0x007a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x004c A[SYNTHETIC] */
    /* renamed from: a */
    public static void m53465a(Uri uri, Context context) {
        befj.m94963a(context);
        befj.m94965a(uri);
        if (!TextUtils.equals(uri.getAuthority(), "com.google.android.gms")) {
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
            sb.append("Expected uri package to be [com.google.android.gms]: ");
            sb.append(valueOf);
            throw new begt(sb.toString());
        } else if (TextUtils.isEmpty(uri.getFragment())) {
            Uri.Builder buildUpon = uri.normalizeScheme().buildUpon();
            String path = uri.getPath();
            bmxy.m108581a(path);
            String str = "/";
            if (path.length() != 0) {
                Iterable a = bmyx.m108640a('/').mo66917a().mo66918a((CharSequence) path);
                ArrayList arrayList = new ArrayList();
                Iterator it = a.iterator();
                while (true) {
                    char c = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    String str2 = (String) it.next();
                    int hashCode = str2.hashCode();
                    if (hashCode != 46) {
                        if (hashCode == 1472 && str2.equals("..")) {
                            c = 1;
                            if (c != 0) {
                                if (c != 1) {
                                    arrayList.add(str2);
                                } else if (arrayList.size() <= 0 || ((String) arrayList.get(arrayList.size() - 1)).equals("..")) {
                                    arrayList.add("..");
                                } else {
                                    arrayList.remove(arrayList.size() - 1);
                                }
                            }
                        }
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                }
                String a2 = bmxr.m108543a('/').mo66874a((Iterable) arrayList);
                if (path.charAt(0) == '/') {
                    String valueOf2 = String.valueOf(a2);
                    a2 = valueOf2.length() == 0 ? new String(str) : str.concat(valueOf2);
                }
                while (a2.startsWith("/../")) {
                    a2 = a2.substring(3);
                }
                if (!a2.equals("/..")) {
                    str = "".equals(a2) ? "." : a2;
                }
            } else {
                str = ".";
            }
            if (!uri.equals(buildUpon.path(str).build())) {
                String valueOf3 = String.valueOf(uri);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 35);
                sb2.append("Potential path traversal detected: ");
                sb2.append(valueOf3);
                throw new begt(sb2.toString());
            }
        } else {
            String valueOf4 = String.valueOf(uri);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf4).length() + 30);
            sb3.append("Fragment not supported (yet): ");
            sb3.append(valueOf4);
            throw new begt(sb3.toString());
        }
    }
}
