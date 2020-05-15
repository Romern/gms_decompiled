package p000;

import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.IOException;

/* renamed from: adhq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adhq extends adfj {

    /* renamed from: b */
    final /* synthetic */ adhu f61718b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public adhq(adhu adhu) {
        super("getUidForPackage");
        this.f61718b = adhu;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0068, code lost:
        if (r1.f61725e.mo33538f(r7) != null) goto L_0x0077;
     */
    /* renamed from: a */
    public final Bundle mo33418a(adfi adfi, String str, Bundle bundle) {
        String string = bundle.getString("packageName");
        Integer a = ((adhl) this.f61718b.f61724d).f61715b.mo33546a(string);
        Bundle bundle2 = new Bundle();
        if (a != null) {
            adhu adhu = this.f61718b;
            if (adfi.f61555a != adhu.f61722b && !adhu.f61726f.mo33421a(adfi.f61555a) && !TextUtils.equals(adfi.f61556b.packageName, string)) {
                if (!adfi.f61557c) {
                    try {
                        adhk adhk = adhu.f61724d;
                        adhd b = ((adhl) adhk).f61714a.mo33533b(string);
                        ApplicationInfo applicationInfo = null;
                        if (!(b == null || b.f61669d == null)) {
                            applicationInfo = adlc.m50786a(string, 128, b, ((adhl) adhk).f61715b.mo33546a(string));
                        }
                        if (applicationInfo != null) {
                            if (applicationInfo.uid != 0) {
                            }
                        }
                    } catch (IOException e) {
                        adhu.f61721a.mo33425a(e, "Exception checking application info", new Object[0]);
                    }
                }
            }
            bundle2.putInt("result", a.intValue());
        }
        return bundle2;
    }
}
