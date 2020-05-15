package p000;

import android.provider.Settings;

/* renamed from: ablu */
final /* synthetic */ class ablu implements bqeh {

    /* renamed from: a */
    private final ablw f57675a;

    public ablu(ablw ablw) {
        this.f57675a = ablw;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        ablw ablw = this.f57675a;
        bsmh bsmh = (bsmh) obj;
        if (!ablw.mo32208a(bsmh, cejv.f182809a.mo6606a().mo79199c())) {
            return ablw.f57679c.mo32147a();
        }
        String string = Settings.Secure.getString(ablw.f57680d.getContentResolver(), "default_input_method");
        if (string != null) {
            bxwc bxwc = cejv.f182809a.mo6606a().mo79201e().f165797a;
            int size = bxwc.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (string.startsWith((String) bxwc.get(i))) {
                    abij abij = ablw.f57678b;
                    String str = bsmh.f145029c;
                    int i3 = bsmh.f145030d;
                    bxvd da = bspu.f146587f.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bspu bspu = (bspu) da.f164949b;
                    bspu.f146591c = 18;
                    bspu.f146589a |= 2;
                    abij.mo32129a(str, i3, da);
                    return ablw.f57679c.mo32147a();
                }
                i = i2;
            }
        }
        ablw.mo32209b();
        return bqga.m112775a((Object) null);
    }
}
