package p000;

/* renamed from: cdyt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdyt implements cdys {

    /* renamed from: a */
    public static final bdyx f181942a;

    /* renamed from: b */
    public static final bdyx f181943b;

    /* renamed from: c */
    public static final bdyx f181944c;

    /* renamed from: d */
    public static final bdyx f181945d;

    /* renamed from: e */
    public static final bdyx f181946e;

    /* renamed from: f */
    public static final bdyx f181947f;

    /* renamed from: g */
    public static final bdyx f181948g;

    /* renamed from: h */
    public static final bdyx f181949h;

    /* renamed from: i */
    public static final bdyx f181950i;

    /* renamed from: j */
    public static final bdyx f181951j;

    /* renamed from: k */
    public static final bdyx f181952k;

    /* renamed from: l */
    public static final bdyx f181953l;

    /* renamed from: m */
    public static final bdyx f181954m;

    /* renamed from: n */
    public static final bdyx f181955n;

    /* renamed from: o */
    public static final bdyx f181956o;

    /* renamed from: p */
    public static final bdyx f181957p;

    /* renamed from: q */
    public static final bdyx f181958q;

    /* renamed from: r */
    public static final bdyx f181959r;

    /* renamed from: s */
    public static final bdyx f181960s;

    /* renamed from: t */
    public static final bdyx f181961t;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdyx.a(bdyw, java.lang.String, boolean):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, double):bdyx
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdyx.a(bdyw, java.lang.String, long):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, double):bdyx
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx */
    static {
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.fitness")).mo58445a("fitness.");
        f181942a = bdyx.m91609a(a, "android:activity_recognition", "android:activity_recognition");
        f181943b = bdyx.m91610a(a, "allow_recording_on_transient_auth_errors", true);
        f181944c = bdyx.m91607a(a, "auth_cache_expire_secs", 604800L);
        bdyx.m91609a(a, "wearable_auth_skip_check_packages", "com.google.android.apps.fitness,com.google.android.gms");
        f181945d = bdyx.m91609a(a, "auth_whitelisted_apps", "com.google.android.apps.fitness");
        f181946e = bdyx.m91609a(a, "first_party_only_data_type_exemptions", "");
        f181947f = bdyx.m91609a(a, "first_party_only_data_types", "");
        f181948g = bdyx.m91609a(a, "health_data_types_application_whitelist", "com.andaman7.android,com.dexcom.cgm,com.dexcom.g6,com.dexcom.cgm.mgdl,com.dexcom.cgm.mmol,com.dexcom.cgm.region1.mgdl,com.dexcom.cgm.region1.mmol,com.dexcom.cgm.region2.mgdl,com.dexcom.cgm.region2.mmol,com.dexcom.cgm.region3.mgdl,com.dexcom.cgm.region4.mmol,com.dexcom.cgm.region5.mmol,com.dexcom.cgm.region6.mmol,com.dexcom.cgm.region7.mgdl,com.dexcom.cgm.region8.mgdl,com.dexcom.cgm.region9.mgdl,com.dexcom.cgm.region10.mgdl,com.dexcom.cgm.region11.mgdl,com.dexcom.cgm.region11.mmol,com.dexcom.cgm.region12.mgdl,com.dexcom.cgm.region13.mgdl,com.dexcom.cgm.region14.mmol,com.dexcom.cgm.region15.mmol,nl.appyhapps.healthsync,uk.ac.ox.ibme.testAPP,uk.ac.ox.ibme.smwt,uk.ac.ox.ibme.gdm,com.lark.meadowlark2,com.clue.android,com.wakeup.smartband,inmovens.es.daga,com.hcl.rpm,org.ehealthinnovation.bant,org.mars3142.health,org.mars3142.health.dev,com.withings.wiscale2,com.withings.wiscale2.beta,com.getqardio.android,jp.co.arkray.android.DiabetesSmartTool,jp.co.nittsusystem.healthcare,cz.cecg.zdravel.dev,cz.cecg.zdravel.test,cz.cecg.zdravel.preprod,cz.cecg.zdravel,medicalmate.cardiocheckapp,com.orreco.myfitr.woman,com.orreco.myfitr.runner,com.orreco.myfitr.parkrun,com.alivecor.aliveecg,com.alivecor.aliveecg.debugTest,com.alivecor.aliveecg.daily,com.alivecor.aliveecg.demo,com.alivecor.aliveecg.alpha,com.alivecor.aliveecg.beta,com.omronhealthcare.omronconnect,com.omronhealthcare.omronconnect.debugTest,com.omronhealthcare.omronconnect.daily,com.omronhealthcare.omronconnect.demo,com.omronhealthcare.omronconnect.alpha,com.omronhealthcare.omronconnect.beta,it.diab,com.lifescan.reveal.adhoctest,com.lifescan.reveal.demo,com.lifescan.reveal.stage,com.lifescan.reveal,com.lifescan.reveal.plus.debug,com.lifescan.reveal.plus.nonproduction,com.lifescan.reveal.plus,co.instil.glucosemonitor,com.balanceat.beatprivatelabel,com.smartbloodpressure,de.soehnle.connect,com.lark.meadowlark2,com.lbs.ihealth,com.diabetizer.app,com.diabetizer.app.dev,com.diabetizer.app.hockey,com.diabetizer.app.hockey.dev,com.companionmedical.inpen,com.example.flopezyuste.testgooglefit,com.mobilefractals.kalenjin,com.medm.medmbp.diary,com.medm.medmbg.diary,com.medm.app.health,com.medm.medmtm.diary,com.medm.medmwt.diary,com.swissmedmobile.health,com.medm.master.health,eu.meecolabs.heartfit,com.wellsmith.phoenix.android,com.omronhealthcare.foresight,com.womanlog,com.womanlogpro");
        f181949h = bdyx.m91609a(a, "history_api_activity_recognition_exemptions", "com.google.android.apps.fitness");
        f181950i = bdyx.m91609a(a, "history_api_activity_recognition_types", "");
        f181951j = bdyx.m91609a(a, "local_recording_whitelisted_apps", "com.google.android.apps.fitness");
        bdyx.m91610a(a, "noteop_for_activity_recognition", false);
        bdyx.m91610a(a, "require_ar_permission_for_derived_subscriptions", false);
        bdyx.m91610a(a, "require_ar_permission_for_steps", false);
        f181952k = bdyx.m91610a(a, "require_install_permission_always", false);
        f181953l = bdyx.m91610a(a, "restrict_local_recording_to_whitelisted_apps", false);
        f181954m = bdyx.m91609a(a, "shareable_data_partners", "com.nike.NIKEFUEL=com.nike.plusgps,com.nike.fb,com.nike.plusgps.debug|com.adidas.jump.height=com.adidas.micoach.x_cell|com.adidas.hustle=com.adidas.micoach.x_cell|com.adidas.quickness=com.adidas.micoach.x_cell");
        f181955n = bdyx.m91609a(a, "shareable_data_schema", "com.nike.NIKEFUEL=NIKEFUEL-1|com.adidas.jump.height=height-2|com.adidas.hustle=hustle-2|com.adidas.quickness=quickness-2");
        f181956o = bdyx.m91609a(a, "shareable_read_scopes", "com.nike.NIKEFUEL=https://www.googleapis.com/auth/fitness.activity.read|com.adidas.jump.height=https://www.googleapis.com/auth/fitness.activity.read|com.adidas.hustle=https://www.googleapis.com/auth/fitness.activity.read|com.adidas.quickness=https://www.googleapis.com/auth/fitness.activity.read");
        f181957p = bdyx.m91609a(a, "shareable_read_write_scopes", "com.nike.NIKEFUEL=https://www.googleapis.com/auth/fitness.activity.write|com.adidas.jump.height=https://www.googleapis.com/auth/fitness.activity.write|com.adidas.hustle=https://www.googleapis.com/auth/fitness.activity.write|com.adidas.quickness=https://www.googleapis.com/auth/fitness.activity.write");
        f181958q = bdyx.m91610a(a, "Auth__validate_oauth_for_deletions", false);
        f181959r = bdyx.m91610a(a, "Auth__validate_oauth_for_sessions", false);
        f181960s = bdyx.m91610a(a, "Auth__validate_oauth_history_listener", false);
        f181961t = bdyx.m91609a(a, "whitelisted_zero_party_applications", "");
    }

    /* renamed from: a */
    public final String mo78475a() {
        return (String) f181942a.mo58455c();
    }

    /* renamed from: b */
    public final boolean mo78476b() {
        return ((Boolean) f181943b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final long mo78477c() {
        return ((Long) f181944c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final String mo78478d() {
        return (String) f181945d.mo58455c();
    }

    /* renamed from: e */
    public final String mo78479e() {
        return (String) f181946e.mo58455c();
    }

    /* renamed from: f */
    public final String mo78480f() {
        return (String) f181947f.mo58455c();
    }

    /* renamed from: g */
    public final String mo78481g() {
        return (String) f181948g.mo58455c();
    }

    /* renamed from: h */
    public final String mo78482h() {
        return (String) f181949h.mo58455c();
    }

    /* renamed from: i */
    public final String mo78483i() {
        return (String) f181950i.mo58455c();
    }

    /* renamed from: j */
    public final String mo78484j() {
        return (String) f181951j.mo58455c();
    }

    /* renamed from: k */
    public final boolean mo78485k() {
        return ((Boolean) f181952k.mo58455c()).booleanValue();
    }

    /* renamed from: l */
    public final boolean mo78486l() {
        return ((Boolean) f181953l.mo58455c()).booleanValue();
    }

    /* renamed from: m */
    public final String mo78487m() {
        return (String) f181954m.mo58455c();
    }

    /* renamed from: n */
    public final String mo78488n() {
        return (String) f181955n.mo58455c();
    }

    /* renamed from: o */
    public final String mo78489o() {
        return (String) f181956o.mo58455c();
    }

    /* renamed from: p */
    public final String mo78490p() {
        return (String) f181957p.mo58455c();
    }

    /* renamed from: q */
    public final boolean mo78491q() {
        return ((Boolean) f181958q.mo58455c()).booleanValue();
    }

    /* renamed from: r */
    public final boolean mo78492r() {
        return ((Boolean) f181959r.mo58455c()).booleanValue();
    }

    /* renamed from: s */
    public final boolean mo78493s() {
        return ((Boolean) f181960s.mo58455c()).booleanValue();
    }

    /* renamed from: t */
    public final String mo78494t() {
        return (String) f181961t.mo58455c();
    }
}
