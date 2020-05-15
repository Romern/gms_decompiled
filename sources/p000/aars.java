package p000;

import android.text.TextUtils;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Map;

/* renamed from: aars */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aars {

    /* renamed from: a */
    public static final String f56377a = Boolean.toString(false);

    /* renamed from: b */
    public static final aars f56378b = new aars("product_id_string", "");

    /* renamed from: c */
    public static final aars f56379c = new aars("helpcenter_name", "");

    /* renamed from: d */
    public static final aars f56380d = new aars("top_level_topic_url", "");

    /* renamed from: e */
    public static final aars f56381e = new aars("contact_card_position", "");

    /* renamed from: f */
    public static final aars f56382f;

    /* renamed from: g */
    public static final aars f56383g;

    /* renamed from: h */
    public static final aars f56384h;

    /* renamed from: i */
    public static final aars f56385i;

    /* renamed from: j */
    public static final aars f56386j;

    /* renamed from: k */
    public static final aars f56387k;

    /* renamed from: l */
    public static final aars f56388l;

    /* renamed from: m */
    public static final aars f56389m;

    /* renamed from: n */
    public static final aars f56390n;

    /* renamed from: o */
    public static final aars f56391o = new aars("autocomplete_client_name", 1, "help");

    /* renamed from: p */
    public static final aars f56392p = new aars("smart_journey_configured", 1, f56377a);

    /* renamed from: q */
    public static final aars f56393q = new aars("smart_journey_path", 1, "");

    /* renamed from: r */
    public static final aars f56394r = new aars("community_path", 1, "");

    /* renamed from: s */
    public static final aars f56395s = new aars("smart_journey_existing_chat_case_id", 1, "");

    /* renamed from: t */
    public static final aars f56396t = new aars("smart_journey_existing_chat_pool_id", 1, "");

    /* renamed from: u */
    public final abee f56397u;

    /* renamed from: v */
    public final String f56398v;

    static {
        Boolean.toString(true);
        String z = ceeg.m136421z();
        StringBuilder sb = new StringBuilder(String.valueOf(z).length() + 275);
        sb.append(z);
        sb.append("/%1$s/apis/render?v=1&id=%2$s&hl=%3$s&page_type=1&request_source=3&extra_params=api_client.ghandroid,lc.1,ff.1,full_page.1&components=PCT_NONE,PCT_TITLE,PCT_METADATA,PCT_NOTIFICATIONS,PCT_ARTICLE_QUALITY_SURVEY,PCT_CONTEXT_SELECTOR&key=AIzaSyC4gyROYSkqjyykTdfouAxjwLBLYAk-XJE");
        f56382f = new aars("answer_rendering_url_format", 2, sb.toString());
        String z2 = ceeg.m136421z();
        StringBuilder sb2 = new StringBuilder(String.valueOf(z2).length() + 275);
        sb2.append(z2);
        sb2.append("/%1$s/apis/render?v=1&id=%2$s&hl=%3$s&page_type=2&request_source=3&extra_params=api_client.ghandroid,lc.1,ff.1,full_page.1&components=PCT_NONE,PCT_TITLE,PCT_METADATA,PCT_NOTIFICATIONS,PCT_ARTICLE_QUALITY_SURVEY,PCT_CONTEXT_SELECTOR&key=AIzaSyC4gyROYSkqjyykTdfouAxjwLBLYAk-XJE");
        f56383g = new aars("topic_rendering_url_format", 2, sb2.toString());
        String z3 = ceeg.m136421z();
        StringBuilder sb3 = new StringBuilder(String.valueOf(z3).length() + 225);
        sb3.append(z3);
        sb3.append("/%1$s/apis/render?v=1&id=%2$s&hl=%3$s&page_type=4&request_source=3&extra_params=api_client.ghandroid,lc.1,ff.1,js_request_id.survey_request,full_page.1&components=PCT_NONE,PCT_TITLE&key=AIzaSyC4gyROYSkqjyykTdfouAxjwLBLYAk-XJE");
        f56384h = new aars("form_rendering_url_format", 2, sb3.toString());
        String z4 = ceeg.m136421z();
        StringBuilder sb4 = new StringBuilder(String.valueOf(z4).length() + AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD);
        sb4.append(z4);
        sb4.append("/%1$s/apis/render?v=1&id=%2$s&hl=%3$s&page_type=22&request_source=3&extra_params=api_client.ghandroid,lc.1,ff.1,full_page.1&components=PCT_NONE,PCT_TITLE,PCT_ARTICLE_QUALITY_SURVEY&key=AIzaSyC4gyROYSkqjyykTdfouAxjwLBLYAk-XJE");
        f56385i = new aars("support_forum_rendering_url_format", 1, sb4.toString());
        String z5 = ceeg.m136421z();
        StringBuilder sb5 = new StringBuilder(String.valueOf(z5).length() + 187);
        sb5.append(z5);
        sb5.append("/%1$s/apis/render?v=1&id=%2$s&hl=%3$s&page_type=25&request_source=3&extra_params=api_client.ghandroid,lc.1,ff.1,full_page.1&components=PCT_NONE&key=AIzaSyC4gyROYSkqjyykTdfouAxjwLBLYAk-XJE");
        f56386j = new aars("support_forum_thread_rendering_url_format", 1, sb5.toString());
        String z6 = ceeg.m136421z();
        StringBuilder sb6 = new StringBuilder(String.valueOf(z6).length() + 179);
        sb6.append(z6);
        sb6.append("/%1$s/apis/render?v=1&hl=%3$s&page_type=26&request_source=3&extra_params=api_client.ghandroid,lc.1,ff.1,full_page.1&components=PCT_NONE&key=AIzaSyC4gyROYSkqjyykTdfouAxjwLBLYAk-XJE");
        f56387k = new aars("support_forum_new_thread_rendering_url_format", 1, sb6.toString());
        String z7 = ceeg.m136421z();
        StringBuilder sb7 = new StringBuilder(String.valueOf(z7).length() + 187);
        sb7.append(z7);
        sb7.append("/%1$s/apis/render?v=1&id=%2$s&hl=%3$s&page_type=28&request_source=3&extra_params=api_client.ghandroid,lc.1,ff.1,full_page.1&components=PCT_NONE&key=AIzaSyC4gyROYSkqjyykTdfouAxjwLBLYAk-XJE");
        f56388l = new aars("support_forum_profile_rendering_url_format", 1, sb7.toString());
        String z8 = ceeg.m136421z();
        StringBuilder sb8 = new StringBuilder(String.valueOf(z8).length() + 179);
        sb8.append(z8);
        sb8.append("/%1$s/apis/render?v=1&hl=%3$s&page_type=24&request_source=3&extra_params=api_client.ghandroid,lc.1,ff.1,full_page.1&components=PCT_NONE&key=AIzaSyC4gyROYSkqjyykTdfouAxjwLBLYAk-XJE");
        f56389m = new aars("support_forum_threads_rendering_url_format", 1, sb8.toString());
        String z9 = ceeg.m136421z();
        StringBuilder sb9 = new StringBuilder(String.valueOf(z9).length() + 187);
        sb9.append(z9);
        sb9.append("/%1$s/apis/render?v=1&id=%2$s&hl=%3$s&page_type=31&request_source=3&extra_params=api_client.ghandroid,lc.1,ff.1,full_page.1&components=PCT_NONE&key=AIzaSyC4gyROYSkqjyykTdfouAxjwLBLYAk-XJE");
        f56390n = new aars("support_forum_community_rendering_url_format", 1, sb9.toString());
    }

    private aars(String str, int i, String str2) {
        this.f56397u = aatb.m46960a(str, i);
        this.f56398v = str2;
    }

    /* renamed from: a */
    public static aars[] m46805a() {
        return new aars[]{f56382f, f56383g, f56384h, f56385i, f56386j, f56387k, f56388l, f56389m, f56390n};
    }

    /* renamed from: b */
    public static Map m46806b() {
        aars[] aarsArr = {f56378b, f56380d, f56381e, f56382f, f56383g, f56384h, f56385i, f56386j, f56387k, f56388l, f56389m, f56390n, f56391o, f56395s, f56396t};
        C1223np npVar = new C1223np(15);
        for (int i = 0; i < 15; i++) {
            aars aars = aarsArr[i];
            npVar.put(new aarr(aars.f56397u), aars);
        }
        aars[] aarsArr2 = {f56392p, f56393q};
        for (int i2 = 0; i2 < 2; i2++) {
            aars aars2 = aarsArr2[i2];
            npVar.put(new aarr(aars2.f56397u), aars2);
        }
        npVar.put(new aarr(f56394r.f56397u), f56394r);
        return npVar;
    }

    private aars(String str, String str2) {
        this.f56397u = aatb.m46959a(str);
        this.f56398v = str2;
    }

    /* renamed from: a */
    public static aars m46803a(String str) {
        String concat = String.valueOf(ceeg.m136407l()).concat(".%s");
        if (str.equals(String.format(concat, "answer_rendering_url_format"))) {
            return f56382f;
        }
        if (str.equals(String.format(concat, "topic_rendering_url_format"))) {
            return f56383g;
        }
        if (str.equals(String.format(concat, "form_rendering_url_format"))) {
            return f56384h;
        }
        if (str.equals(String.format(concat, "support_forum_rendering_url_format"))) {
            return f56385i;
        }
        if (str.equals("autocomplete_client_name")) {
            return f56391o;
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m46804a(abee abee, abee abee2) {
        if (abee == null && abee2 == null) {
            return true;
        }
        return abee != null && abee2 != null && abee.f57184c == abee2.f57184c && TextUtils.equals(abee.f57183b, abee2.f57183b);
    }
}
