package p000;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: fge */
final /* synthetic */ class fge implements bmzi {

    /* renamed from: a */
    private final fgh f16496a;

    public fge(fgh fgh) {
        this.f16496a = fgh;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        Context context = this.f16496a.f16503c;
        String[] strArr = fgh.f16500a;
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            try {
                return context.getPackageManager().getPackageInfo(strArr[i], 0).versionName;
            } catch (PackageManager.NameNotFoundException e) {
                i++;
            }
        }
        return null;
    }
}
