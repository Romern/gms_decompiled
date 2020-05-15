package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: akoh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akoh {
    /* renamed from: a */
    public static blfh m60131a(Context context, String str, byug byug) {
        int i;
        if (byug == null) {
            byug = byug.GOOGLE_PLAY_SERVICES;
        }
        boolean a = sre.m36081a(context.getResources());
        bxvd da = cixj.f191673e.mo74144da();
        try {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            i = 0;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cixj cixj = (cixj) da.f164949b;
        int i2 = cixj.f191675a | 512;
        cixj.f191675a = i2;
        cixj.f191677c = i;
        str.getClass();
        cixj.f191675a = i2 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        cixj.f191676b = str;
        bxvd da2 = byuj.f168295f.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        byuj byuj = (byuj) da2.f164949b;
        byuj.f168299c = byug.f168292ja;
        int i3 = byuj.f168297a | 2;
        byuj.f168297a = i3;
        byuj.f168298b = (!a ? 3 : 4) - 1;
        int i4 = i3 | 1;
        byuj.f168297a = i4;
        byuj.f168300d = 2;
        int i5 = i4 | 4;
        byuj.f168297a = i5;
        byuj.f168301e = 100;
        byuj.f168297a = i5 | 8;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cixj cixj2 = (cixj) da.f164949b;
        byuj byuj2 = (byuj) da2.mo74062i();
        byuj2.getClass();
        cixj2.f191678d = byuj2;
        cixj2.f191675a |= 8192;
        cixj cixj3 = (cixj) da.mo74062i();
        bxvd da3 = blfh.f126361c.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        blfh blfh = (blfh) da3.f164949b;
        cixj3.getClass();
        blfh.f126364b = cixj3;
        blfh.f126363a |= 2;
        return (blfh) da3.mo74062i();
    }
}
