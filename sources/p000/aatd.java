package p000;

import android.text.TextUtils;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import java.util.concurrent.TimeUnit;

/* renamed from: aatd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aatd {

    /* renamed from: a */
    public final HelpChimeraActivity f56533a;

    /* renamed from: b */
    public final HelpConfig f56534b;

    /* renamed from: c */
    public final aarp f56535c;

    /* renamed from: d */
    public boolean f56536d = true;

    public aatd(HelpChimeraActivity helpChimeraActivity, aarp aarp) {
        this.f56533a = helpChimeraActivity;
        this.f56534b = helpChimeraActivity.f56986y;
        this.f56535c = aarp;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aasc.a(java.lang.String, long):long
     arg types: [java.lang.String, int]
     candidates:
      aasc.a(java.lang.String, int):int
      aasc.a(java.lang.String, bxxc):bxxc
      aasc.a(java.lang.String, java.lang.String):java.lang.String
      aasc.a(bxxc, java.lang.String):void
      aasc.a(java.lang.String, boolean):boolean
      aasc.a(java.lang.String, long):long */
    /* renamed from: a */
    public static boolean m46970a(HelpConfig helpConfig, aarp aarp) {
        if (helpConfig.f78814N || !TextUtils.isEmpty(aarp.mo31697a("ongoing_chat_request_pool_id", ""))) {
            return true;
        }
        if (aarp.mo31694a("ongoing_session_last_stopped_ms", 0L) + TimeUnit.MINUTES.toMillis(ceeg.f182447a.mo6606a().mo78993am()) >= System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static void m46971b(HelpConfig helpConfig, aarp aarp) {
        helpConfig.f78814N = true;
        String a = aarp.mo31697a("ongoing_session_id", "");
        if (!TextUtils.isEmpty(a)) {
            helpConfig.f78830e = a;
        }
        if (aarp.mo31657b("ongoing_session_browse_url")) {
            aarp.mo31697a("ongoing_session_context", "");
            helpConfig.f78815O = aarp.mo31697a("ongoing_session_browse_url", "");
            helpConfig.f78816P = aarp.mo31693a("ongoing_session_click_rank", -1);
            helpConfig.f78817Q = aarp.mo31697a("ongoing_session_query", "");
            helpConfig.f78818R = aarp.f56423b.getFloat(aarp.mo31656a("ongoing_session_scroll_pos_y"), 0.0f);
            int a2 = bzqd.m126036a(aarp.mo31693a("ongoing_session_user_action_type", 0));
            if (a2 != 0) {
                helpConfig.f78825Y = a2;
            }
        }
    }

    /* renamed from: a */
    public final void mo31767a() {
        aasa a = this.f56535c.mo31695a();
        a.mo31686a("ongoing_session_last_stopped_ms");
        a.mo31686a("ongoing_session_id");
        a.mo31686a("ongoing_session_context");
        a.mo31686a("ongoing_session_browse_url");
        a.mo31686a("ongoing_session_user_action_type");
        a.mo31686a("ongoing_session_click_rank");
        a.mo31686a("ongoing_session_query");
        a.mo31686a("ongoing_session_scroll_pos_y");
        a.mo31685a();
    }
}
