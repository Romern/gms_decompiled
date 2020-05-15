package p000;

/* renamed from: yhq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yhq {
    /* renamed from: a */
    public static bmxz m44118a(float f) {
        return new yhp(f);
    }

    /* renamed from: b */
    public static yjk m44130b() {
        yjj yjj = new yjj("AppendingHeight");
        yjj.f53927b = "merge_height";
        yjj.f53928c = "com.google.height";
        yjj.f53929d = "default_height";
        return yjj.mo30569b();
    }

    /* renamed from: c */
    public static yjk m44132c() {
        yjj yjj = new yjj("AppendingLocationSample");
        yjj.f53927b = "merge_location_samples";
        yjj.f53928c = "com.google.location.sample";
        yjj.f53929d = "default_location_samples";
        return yjj.mo30569b();
    }

    /* renamed from: d */
    public static yjk m44134d() {
        yjj yjj = new yjj("AppendingPowerSample");
        yjj.f53927b = "merge_power_sample";
        yjj.f53928c = "com.google.power.sample";
        yjj.f53929d = "default_power_sample";
        return yjj.mo30569b();
    }

    /* renamed from: e */
    public static yjk m44136e() {
        yjj yjj = new yjj("AppendingSpeed");
        yjj.f53927b = "merge_speed";
        yjj.f53928c = "com.google.speed";
        yjj.f53929d = "default_speed";
        return yjj.mo30569b();
    }

    /* renamed from: f */
    public static yjk m44137f() {
        yjj yjj = new yjj("AppendingBmr");
        yjj.f53927b = "merged";
        yjj.f53928c = "com.google.calories.bmr";
        yjj.f53929d = "default";
        return yjj.mo30569b();
    }

    /* renamed from: g */
    public static yjk m44138g() {
        yjj yjj = new yjj("AppendingWeight");
        yjj.f53927b = "merge_weight";
        yjj.f53928c = "com.google.weight";
        yjj.f53929d = "default_weight";
        return yjj.mo30569b();
    }

    /* renamed from: h */
    public static ygd m44139h() {
        return ygv.m44058b(ygv.f53777g, ygv.m44056b(ygv.f53772b));
    }

    /* renamed from: i */
    public static btwy m44140i() {
        btwx a = btwy.m118968a();
        a.f152763a = ((Boolean) yno.f54190c.mo58455c()).booleanValue();
        a.f152764b = ((Long) yno.f54200m.mo58455c()).longValue();
        a.f152765c = ((Long) yno.f54144H.mo58455c()).longValue();
        a.f152766d = ((Long) yno.f54141E.mo58455c()).longValue();
        a.f152767e = ((Long) yno.f54143G.mo58455c()).longValue();
        a.f152768f = ((Boolean) yno.f54195h.mo58455c()).booleanValue();
        a.f152769g = ((Long) yno.f54142F.mo58455c()).longValue();
        a.f152770h = ((Boolean) yno.f54192e.mo58455c()).booleanValue();
        a.f152771i = (int) ((Long) yno.f54211x.mo58455c()).longValue();
        a.f152772j = (int) ((Long) yno.f54210w.mo58455c()).longValue();
        return a.mo72453a();
    }

    /* renamed from: j */
    public static yix m44141j() {
        return new yix(bnhe.m109409a(7, new yiw(((Double) yno.f54166ac.mo58455c()).floatValue(), ((Double) yno.f54165ab.mo58455c()).floatValue(), ((Double) yno.f54164aa.mo58455c()).floatValue(), ((Double) yno.f54145I.mo58455c()).floatValue(), ((Double) yno.f54207t.mo58455c()).floatValue()), 8, new yiw(((Double) yno.f54162Z.mo58455c()).floatValue(), ((Double) yno.f54161Y.mo58455c()).floatValue(), ((Double) yno.f54160X.mo58455c()).floatValue(), ((Double) yno.f54137A.mo58455c()).floatValue(), ((Double) yno.f54201n.mo58455c()).floatValue())), ((Double) yno.f54140D.mo58455c()).floatValue(), ((Double) yno.f54204q.mo58455c()).floatValue());
    }

    /* renamed from: a */
    public static String m44119a(ynn ynn) {
        return ynn != ynn.LOCAL_ONLY ? "merge_weight" : "default_weight";
    }

    /* renamed from: a */
    public static yjk m44120a() {
        yjj yjj = new yjj("AppendingHeartRateBpm");
        yjj.f53927b = "merge_heart_rate_bpm";
        yjj.f53928c = "com.google.heart_rate.bpm";
        yjj.f53929d = "default_heart_rate_bpm";
        return yjj.mo30569b();
    }

    /* renamed from: b */
    public static yln m44131b(ceae ceae, yhs yhs) {
        yjg yjg = new yjg("PreferLocalAppendingStepCountDelta");
        yjg.f53975p = ceae.mo30629p();
        yjg.f53923l = yhs;
        yjg.f53924m = ceae.mo30630q();
        yjg.mo30554a("merge_step_deltas");
        yjg.f53907h = "com.google.step_count.delta";
        yjg.f53909j = "default_step_deltas";
        yjg.mo30556a(m44123a(ceae));
        yjg.f53904e = yjq.m44240b("PreferLocalAppendingStepCountDelta");
        return yjg.mo30568e();
    }

    /* renamed from: c */
    public static yln m44133c(ceae ceae, yhs yhs) {
        yjg yjg = new yjg("AppendingMoveMinute");
        yjg.f53975p = false;
        yjg.f53923l = yhs;
        yjg.f53924m = ceae.mo30630q();
        yjg.mo30554a("merge_active_minutes");
        yjg.f53907h = "com.google.active_minutes";
        yjg.f53909j = "default_active_minutes";
        yjg.f53904e = new ykq();
        yjg.mo30556a(m44123a(ceae));
        return yjg.mo30568e();
    }

    /* renamed from: d */
    public static yln m44135d(ceae ceae, yhs yhs) {
        yjg yjg = new yjg("AppendingHeartPoint");
        yjg.f53975p = false;
        yjg.f53923l = yhs;
        yjg.f53924m = ceae.mo30630q();
        yjg.mo30554a("merge_heart_minutes");
        yjg.f53907h = "com.google.heart_minutes";
        yjg.f53909j = "default_heart_minutes";
        yjg.f53904e = new ykq();
        yjg.mo30556a(m44123a(ceae));
        return yjg.mo30568e();
    }

    /* renamed from: a */
    public static yjk m44121a(yjx yjx) {
        yjj yjj = new yjj("AppendingCaloriesConsumed");
        yjj.f53930e = yjx;
        yjj.f53927b = "merge_calories_consumed";
        yjj.f53928c = "com.google.calories.consumed";
        yjj.f53929d = "default_calories_consumed";
        return yjj.mo30569b();
    }

    /* renamed from: a */
    public static ykl m44122a(ceae ceae, ynn ynn, yjx yjx) {
        yky yky = new yky();
        yky.mo30596b(bngx.m109357a("from_activities", "from_height&weight"));
        ykz a = yky.mo30593a();
        ymz ymz = new ymz();
        ymz.f53975p = ceae.mo30629p();
        ymz.f54040r = ynn;
        ymz.f53907h = "com.google.calories.expended";
        ymz.f53909j = "platform_calories_expended";
        ymz.f53908i = "default_calories_expended";
        ymz.mo30556a(a);
        ymz.f53904e = yjx;
        ymz.mo30557b();
        return new ykl(ymz);
    }

    /* renamed from: a */
    public static ykz m44123a(ceae ceae) {
        yky yky = new yky();
        yky.f53999a = true;
        yky.mo30595b();
        yky.f54000b = ceae.mo30628o();
        return yky.mo30593a();
    }

    /* renamed from: a */
    public static yln m44124a(caah caah) {
        String valueOf = String.valueOf(caah.f172336b);
        yjj yjj = new yjj(valueOf.length() == 0 ? new String("Appending_") : "Appending_".concat(valueOf));
        yjj.f53927b = "merged";
        yjj.f53929d = "default";
        yjj.f53928c = caah.f172336b;
        return yjj.mo30569b();
    }

    /* renamed from: a */
    public static yln m44125a(ceae ceae, yhs yhs) {
        yjg yjg = new yjg("AppendingDistanceDelta");
        yjg.f53975p = ceae.mo30629p();
        yjg.f53923l = yhs;
        yjg.f53924m = ceae.mo30630q();
        yjg.mo30554a("merge_distance_delta");
        yjg.f53907h = "com.google.distance.delta";
        yjg.f53909j = "default_distance_delta";
        yjg.mo30556a(m44123a(ceae));
        yjg.f53904e = yjq.m44239a("AppendingDistanceDelta");
        return yjg.mo30568e();
    }

    /* renamed from: a */
    public static yln m44126a(ceae ceae, yhs yhs, yjx yjx) {
        yjg yjg = new yjg("AppendingCaloriesExpended");
        yjg.f53975p = ceae.mo30629p();
        yjg.f53923l = yhs;
        yjg.f53924m = ceae.mo30630q();
        yjg.mo30554a("merge_calories_expended");
        yjg.f53907h = "com.google.calories.expended";
        yjg.f53909j = "default_calories_expended";
        yjg.f53904e = yjx;
        yjg.mo30556a(m44123a(ceae));
        return yjg.mo30568e();
    }

    /* renamed from: a */
    public static ymj m44127a(yhs yhs) {
        ymf ymf = new ymf();
        ymf.f54089l = yhs;
        ymf.mo30556a(new yky().mo30593a());
        ymf.mo30557b();
        return new ymj(ymf);
    }

    /* renamed from: a */
    public static ypj m44128a(double d) {
        return new ype(bngx.m109357a(new ypl(d), new ypp()));
    }

    /* renamed from: a */
    public static ypj m44129a(float f, long j) {
        return new ype(bngx.m109358a(new ypl((double) f), new ypo(j), new ypp()));
    }
}
