package p000;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.C0271c;

/* renamed from: fik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class fik extends fiy {

    /* renamed from: a */
    public final fkm f16658a;

    /* renamed from: b */
    public boolean f16659b;

    public fik(fkm fkm) {
        super(fkm.mo10958b(), fkm.f16787c);
        this.f16658a = fkm;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10850a(fiv fiv) {
        String str;
        fju fju = (fju) fiv.mo10875b(fju.class);
        if (TextUtils.isEmpty(fju.f16751b)) {
            fju.f16751b = this.f16658a.mo10963g().mo11000b();
        }
        if (this.f16659b && TextUtils.isEmpty(fju.f16753d)) {
            fka f = this.f16658a.mo10962f();
            f.mo10954t();
            C0271c b = f.mo10912b();
            String str2 = null;
            if (b != null) {
                str = b.f7985a;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                str2 = str;
            }
            fju.f16753d = str2;
            f.mo10954t();
            C0271c b2 = f.mo10912b();
            boolean z = false;
            if (b2 != null && !b2.f7986b) {
                z = true;
            }
            fju.f16754e = z;
        }
    }
}
