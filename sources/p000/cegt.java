package p000;

/* renamed from: cegt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cegt implements cegs {

    /* renamed from: a */
    public static final bdyx f182649a;

    /* renamed from: b */
    public static final bdyx f182650b;

    /* renamed from: c */
    public static final bdyx f182651c;

    /* renamed from: d */
    public static final bdyx f182652d;

    /* renamed from: e */
    public static final bdyx f182653e;

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
    static {
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.googlehelp")).mo58443a();
        bdyx.m91610a(a, "AndroidGoogleHelp__enable_app_package_name_override", false);
        bdyx.m91609a(a, "AndroidGoogleHelp__enable_app_package_name_override_whitelist", "com.google.android.libraries.googlehelp.googlehelpapp,com.google.android.gms.test.googlehelp.googlehelpapp,com.google.android.gms,com.google.android.gms.common.uxtester,com.android.settings,com.google.android.wearable.app,com.google.android.googlequicksearchbox,com.google.android.apps.subscriptions.red,com.google.android.apps.nbu.paisa.user.dev,com.google.android.apps.nbu.paisa.user.teamfood,com.google.android.apps.nbu.paisa.user.teamfood2,com.google.android.apps.nbu.paisa.user.dogfood,com.google.android.apps.nbu.paisa.user.qa,com.google.android.apps.nbu.paisa.user");
        bdyx.m91610a(a, "AndroidGoogleHelp__enable_experimental_autocomplete_client_name_config_entry", false);
        f182649a = bdyx.m91610a(a, "AndroidGoogleHelp__enable_material_2_search_view", true);
        bdyx.m91610a(a, "AndroidGoogleHelp__enable_material_2_send_button_selector", false);
        bdyx.m91610a(a, "AndroidGoogleHelp__enable_privacy_policy_redirect_in_article_link", false);
        bdyx.m91609a(a, "AndroidGoogleHelp__enable_privacy_policy_redirect_in_article_link_blacklist", "");
        bdyx.m91609a(a, "AndroidGoogleHelp__enable_privacy_policy_redirect_in_article_link_whitelist", "com.google.android.libraries.inapphelp.testapp,com.google.android.gms.test.googlehelp.googlehelpapp,com.google.android.gms.feedback.testapp");
        bdyx.m91610a(a, "AndroidGoogleHelp__set_soft_input_mode_in_Material2_chat_request_form", true);
        f182650b = bdyx.m91610a(a, "AndroidGoogleHelp__use_c2c_form_id_from_mojo", false);
        f182651c = bdyx.m91609a(a, "AndroidGoogleHelp__valid_privacy_policy_url_languages", "af,am,ar,as,az,be,bg,bn,bs,ca,cs,da,de,el,en,en-GB,es,es-419,es-US,et,eu,fa,fi,fil,fr,fr-CA,gl,gu,hi,hr,hu,hy,id,in,is,it,iw,ja,ka,kk,km,kn,ko,ky,lo,lt,lv,mk,ml,mn,mr,ms,my,nb,ne,nl,no,or,pa,pl,pt,pt-BR,pt-PT,ro,ru,si,sk,sl,sq,sr,sr-Latn,sv,sw,ta,te,th,tl,tr,uk,ur,uz,vi,zh,zh-CN,zh-HK,zh-TW,zu");
        f182652d = bdyx.m91609a(a, "AndroidGoogleHelp__valid_privacy_policy_urls", "https://www.google.com/policies/privacy,https://www.google.com/policies/privacy/,https://policies.google.com/privacy,https://policies.google.com/privacy/embedded,https://myaccount.google.com/privacypolicy");
        f182653e = bdyx.m91609a(a, "AndroidGoogleHelp__valid_privacy_policy_urls_with_language", "https://families.google.com/intl/%1$s/familylink/privacy/child-policy/,https://gsuite.google.com/intl/%1$s/terms/education_privacy.html,https://www.google.com/intl/%1$s/policies/privacy/");
    }

    /* renamed from: a */
    public final boolean mo79112a() {
        return ((Boolean) f182649a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo79113b() {
        return ((Boolean) f182650b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final String mo79114c() {
        return (String) f182651c.mo58455c();
    }

    /* renamed from: d */
    public final String mo79115d() {
        return (String) f182652d.mo58455c();
    }

    /* renamed from: e */
    public final String mo79116e() {
        return (String) f182653e.mo58455c();
    }
}
