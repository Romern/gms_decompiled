package p000;

/* renamed from: bexj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bexj {

    /* renamed from: a */
    private final bexi f112905a;

    public bexj(bgmm bgmm) {
        this.f112905a = new bexi(bgmm.mo62781a(beve.PHONE_SLEEP_DNN));
    }

    /* renamed from: a */
    public final int mo61226a(bexk bexk) {
        bexi bexi = this.f112905a;
        bexk bexk2 = new bexk();
        String[] strArr = bexk.f112906M;
        for (String str : strArr) {
            bexk2.mo61228a(str, bexk.mo61227a(str));
        }
        bexk2.f112920b = bexh.LIGHT.mo61225a(bexk.f112920b);
        bexk2.f112918K = bexh.HOUR.mo61225a(bexk.f112918K);
        for (int i = 0; i < bexk.f112907a.length; i++) {
            String valueOf = String.valueOf(bexk.f112907a[i]);
            String str2 = valueOf.length() == 0 ? new String("meanLightLevel") : "meanLightLevel".concat(valueOf);
            bexk2.mo61228a(str2, bexh.LIGHT_DIFF.mo61225a(bexk.mo61227a(str2)));
            String valueOf2 = String.valueOf(bexk.f112907a[i]);
            String str3 = valueOf2.length() == 0 ? new String("accelGravityDir") : "accelGravityDir".concat(valueOf2);
            bexk2.mo61228a(str3, bexh.ACCEL.mo61225a(bexk.mo61227a(str3)));
            String valueOf3 = String.valueOf(bexk.f112907a[i]);
            String str4 = valueOf3.length() == 0 ? new String("soundMeanLogBark") : "soundMeanLogBark".concat(valueOf3);
            bexk2.mo61228a(str4, bexh.LOG_BARK_DIFF.mo61225a(bexk.mo61227a(str4)));
        }
        return Math.round(bexi.f112904a.mo61173a(new float[]{bexk2.f112920b, bexk2.f112921c, bexk2.f112922d, bexk2.f112924f, bexk2.f112925g, bexk2.f112926h, bexk2.f112915H, bexk2.f112916I, bexk2.f112917J, bexk2.f112918K})[0] * 100.0f);
    }
}
