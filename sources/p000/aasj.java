package p000;

import com.google.android.gms.googlehelp.common.HelpConfig;

/* renamed from: aasj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aasj {
    /* renamed from: a */
    public static C1245ok m46867a(HelpConfig helpConfig) {
        C1245ok okVar = new C1245ok(23);
        okVar.put("last_seen_account_change_index", 0);
        okVar.put("ongoing_session_last_stopped_ms", 0L);
        okVar.put("ongoing_session_id", "");
        okVar.put("ongoing_session_context", "");
        okVar.put("ongoing_session_browse_url", "");
        okVar.put("ongoing_session_user_action_type", "");
        okVar.put("ongoing_session_click_rank", -1);
        okVar.put("ongoing_session_query", "");
        okVar.put("ongoing_session_scroll_pos_y", Float.valueOf(0.0f));
        okVar.put("ongoing_chat_request_pool_id", "");
        okVar.put("hangout_was_opened", false);
        okVar.put("last_seen_chat_conversation_event_id", -1L);
        okVar.put(m46868b(helpConfig), -1L);
        okVar.put(m46869c(helpConfig), "");
        okVar.put(m46870d(helpConfig), -1);
        okVar.put(m46871e(helpConfig), 0);
        okVar.put("escalation_options", bzqp.f171047j);
        okVar.put("cached_chat_conversation", abdd.f57067e);
        okVar.put("should_contact_card_show_chat_available", false);
        return okVar;
    }

    /* renamed from: b */
    public static String m46868b(HelpConfig helpConfig) {
        String valueOf = String.valueOf(helpConfig.mo43241p());
        return valueOf.length() == 0 ? new String("chat_version:") : "chat_version:".concat(valueOf);
    }

    /* renamed from: c */
    public static String m46869c(HelpConfig helpConfig) {
        String valueOf = String.valueOf(helpConfig.mo43241p());
        return valueOf.length() == 0 ? new String("chat_convo_id:") : "chat_convo_id:".concat(valueOf);
    }

    /* renamed from: d */
    public static String m46870d(HelpConfig helpConfig) {
        String valueOf = String.valueOf(helpConfig.mo43241p());
        return valueOf.length() == 0 ? new String("chat_queue_pos:") : "chat_queue_pos:".concat(valueOf);
    }

    /* renamed from: e */
    public static String m46871e(HelpConfig helpConfig) {
        String valueOf = String.valueOf(helpConfig.mo43241p());
        return valueOf.length() == 0 ? new String("chat_failed_attempts:") : "chat_failed_attempts:".concat(valueOf);
    }
}
