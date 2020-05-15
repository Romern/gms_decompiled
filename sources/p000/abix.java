package p000;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.concurrent.Callable;

/* renamed from: abix */
final /* synthetic */ class abix implements Callable {

    /* renamed from: a */
    private final abjd f57560a;

    /* renamed from: b */
    private final bslw f57561b;

    /* renamed from: c */
    private final String f57562c;

    public abix(abjd abjd, bslw bslw, String str) {
        this.f57560a = abjd;
        this.f57561b = bslw;
        this.f57562c = str;
    }

    public final Object call() {
        abjd abjd = this.f57560a;
        bslw bslw = this.f57561b;
        String str = this.f57562c;
        try {
            boolean z = false;
            PackageInfo packageInfo = abjd.f57571a.getPackageManager().getPackageInfo(bslw.f144970a, 0);
            bslz bslz = bslw.f144973d;
            if (bslz == null) {
                bslz = bslz.f144984c;
            }
            boolean c = abjd.m47787a(bslz).mo6527a(Long.valueOf((long) packageInfo.versionCode));
            if (packageInfo.applicationInfo != null && packageInfo.applicationInfo.enabled) {
                z = true;
            }
            if (bslw.f144971b) {
                if (c && bslw.f144972c == z) {
                    return abjc.m47783c();
                }
            }
            return abjc.m47781a(str);
        } catch (PackageManager.NameNotFoundException e) {
            return bslw.f144971b ? abjc.m47781a(str) : abjc.m47783c();
        }
    }
}
