package com.google.android.libraries.matchstick.p091ui;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.libraries.matchstick.ui.WebAppFragment$3 */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WebAppFragment$3 extends aacn {

    /* renamed from: a */
    final /* synthetic */ azmx f111258a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebAppFragment$3(azmx azmx, Context context) {
        super(context);
        this.f111258a = azmx;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        char c;
        String str;
        azmx azmx = this.f111258a;
        String action = intent.getAction();
        switch (action.hashCode()) {
            case -1854091714:
                if (action.equals("com.google.android.apps.libraries.matchstick.action.conversation_updated")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1754335873:
                if (action.equals("com.google.android.apps.libraries.matchstick.action.UPDATE_WEB_APP")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -69606606:
                if (action.equals("com.google.android.apps.libraries.matchstick.action.AIDL_FALLBACK")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 146360169:
                if (action.equals("com.google.android.apps.libraries.matchstick.action.messages_for_conversation_updated")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            azph.m85998a(context).mo55165b(1939);
            String stringExtra = intent.getStringExtra("extra_messages_json_array");
            if (azmx.f99676j != null && !TextUtils.isEmpty(stringExtra)) {
                aztu aztu = azmx.f99676j;
                if (intent.hasExtra("extra_conversation_id_json")) {
                    str = intent.getStringExtra("extra_conversation_id_json");
                } else {
                    str = "";
                }
                aztu.mo55288a(stringExtra, str);
            }
        } else if (c != 1) {
            if (c == 2 || c == 3) {
                azph.m85998a(context).mo55125a(1552);
                if (cfgs.m139400f()) {
                    if (intent.hasExtra("evalute_js_call") && !TextUtils.isEmpty(intent.getStringExtra("evalute_js_call"))) {
                        new Object[1][0] = intent.getStringExtra("evalute_js_call");
                        azmx.mo54821a(intent.getStringExtra("evalute_js_call"));
                        azph.m85998a(context).mo55125a(1922);
                    }
                    if (intent.hasExtra("add_js_bridges") && intent.getStringArrayExtra("add_js_bridges") != null) {
                        azmx.mo54822a(intent.getStringArrayExtra("add_js_bridges"));
                        azph.m85998a(context).mo55125a(1924);
                    }
                    if (intent.hasExtra("reconnect_aidl_connection") && intent.getBooleanExtra("reconnect_aidl_connection", false)) {
                        azph.m85998a(context).mo55125a(1927);
                        azmx.mo55071a(context);
                    }
                }
                if (intent.hasExtra("lighter_conversation_id")) {
                    azqf.m86130a(context);
                    bmxv b = azqf.m86144b(intent.getStringExtra("lighter_conversation_id"), azmk.f99645a);
                    if (b.mo66813a()) {
                        azmx.mo55073a(context, (ConversationId) b.mo66814b());
                        return;
                    }
                    azmx.mo55077b("Failed to convert JSON to Conversation ID");
                    azph.m85998a(context).mo55126a(1572, 58);
                } else if (intent.hasExtra("account_context")) {
                    if (cfgs.m139388H()) {
                        azqf.m86130a(context);
                        bmxv b2 = azqf.m86144b(intent.getStringExtra("account_context"), azml.f99646a);
                        if (b2.mo66813a()) {
                            azmx.mo55074a((bcoh) b2.mo66814b());
                            return;
                        }
                        azoj.m85933c("WebAppFragment", "Failed to convert JSON to Account Context", new Object[0]);
                        azph.m85998a(context).mo55126a(1824, 58);
                    }
                } else if (intent.hasExtra("error")) {
                    azmx.mo55077b(intent.getStringExtra("error"));
                } else if (intent.hasExtra("intent_map") && cfgs.m139415u()) {
                    try {
                        azmx.mo55070a().f100104d = bmxv.m108566b(new JSONObject(intent.getStringExtra("intent_map")));
                    } catch (JSONException e) {
                        azoj.m85933c("WebAppVM", "Could not convert metadata to JSON", new Object[0]);
                    }
                }
            } else {
                azoj.m85933c("WebAppFragment", "Unknown intent broadcast received: %s", intent.getAction());
                azph.m85998a(context).mo55172c(1550, intent.getAction());
            }
        } else if (cfgs.m139397c()) {
            String stringExtra2 = intent.getStringExtra("extra_conversation_json");
            if (azmx.f99676j != null && !TextUtils.isEmpty(stringExtra2)) {
                azmx.f99676j.mo55287a(stringExtra2);
            }
        }
    }
}
