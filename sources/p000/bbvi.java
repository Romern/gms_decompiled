package p000;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: bbvi */
final /* synthetic */ class bbvi implements Runnable {

    /* renamed from: a */
    private final bbwq f103511a;

    /* renamed from: b */
    private final bcoh f103512b;

    /* renamed from: c */
    private final bctr f103513c;

    /* renamed from: d */
    private final boolean f103514d;

    public bbvi(bbwq bbwq, bcoh bcoh, bctr bctr, boolean z) {
        this.f103511a = bbwq;
        this.f103512b = bcoh;
        this.f103513c = bctr;
        this.f103514d = z;
    }

    public final void run() {
        bbwq bbwq = this.f103511a;
        bcoh bcoh = this.f103512b;
        bctr bctr = this.f103513c;
        boolean z = this.f103514d;
        bbpi bbpi = bbwq.f103605c;
        new Object[1][0] = bctr.mo57359a();
        azbq azbq = (azbq) bbpi;
        azph.m85998a(azbq.f98916a).mo55152a(1709, bctr.mo57359a(), (String) null, bctr.mo57361c());
        if (!cfgs.m139400f()) {
            azbq.mo54576a(bcoh, bctr.mo57361c());
        }
        if (cfgs.m139418x() && bcoh.mo57058b().mo57069a().mo66813a() && TextUtils.equals(bctr.mo57360b().mo60492a(), (CharSequence) bcoh.mo57058b().mo57069a().mo66814b())) {
            azbj.m85193a(azbq.f98916a).mo54564d().mo56324a(bcoh, Arrays.asList(bctr));
        } else if (!z) {
            azpw.m86109a(azbq.f98916a).mo55198a(bcoh, bctr);
            azfy azfy = (azfy) azbq.f98917b.get();
            if (azfy == null) {
                azph.m85998a(azbq.f98916a).mo55129a(1710, 36, bctr.mo57361c());
            } else if (azfy.mo54887a(bctr.mo57361c())) {
                return;
            }
            azpw.m86109a(azbq.f98916a).mo55199a(bcoh, bctr.mo57361c());
        } else if (cfgs.m139418x()) {
            azbj.m85193a(azbq.f98916a).mo54564d().mo56324a(bcoh, Arrays.asList(bctr));
        }
    }
}
