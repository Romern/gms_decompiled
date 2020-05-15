package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.util.Arrays;

/* renamed from: oyg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oyg extends oyf {

    /* renamed from: d */
    private final String[] f38612d;

    public oyg(String str, String[] strArr) {
        super(str);
        this.f38612d = strArr;
    }

    /* renamed from: b */
    public final int mo22781b(Context context) {
        String[] strArr = this.f38612d;
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            PackageInfo a = oyf.m29988a(context, str);
            if (a == null) {
                i++;
            } else if (mo22780a(a)) {
                return 1;
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 54);
                sb.append("Beta package: ");
                sb.append(str);
                sb.append(" installed but does not meet min version");
                throw new IllegalStateException(sb.toString());
            }
        }
        return super.mo22781b(context);
    }

    public final String toString() {
        String oyf = super.toString();
        String arrays = Arrays.toString(this.f38612d);
        StringBuilder sb = new StringBuilder(String.valueOf(oyf).length() + 18 + String.valueOf(arrays).length());
        sb.append(oyf);
        sb.append(", satisfiablePkgs=");
        sb.append(arrays);
        return sb.toString();
    }
}
