package p000;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.chimera.Activity;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: azmh */
final /* synthetic */ class azmh implements Runnable {

    /* renamed from: a */
    private final azmx f99641a;

    public azmh(azmx azmx) {
        this.f99641a = azmx;
    }

    public final void run() {
        bmxv bmxv;
        azmx azmx = this.f99641a;
        Activity activity = azmx.getActivity();
        Intent intent = activity.getIntent();
        if (intent == null) {
            azoj.m85933c("WebAppFragment", "Null intent when attempting to parse intent args and generate conversation ID", new Object[0]);
            azph.m85998a(activity).mo55126a(1741, 52);
        } else if (TextUtils.equals(intent.getAction(), "com.google.android.apps.libraries.matchstick.action.INTERNAL_VIEW")) {
            azpk.m86089a(activity).mo55183c("Matchstick.Latency.Lighter.CheckRegistrationToNewConversationId.Time");
        } else {
            azpk.m86089a(activity).mo55187e("Matchstick.Latency.Lighter.OnCreateToCheckRegistration.Time");
            azpk.m86089a(activity).mo55185d("Matchstick.Latency.Lighter.CheckRegistrationToNewConversationId.Time");
            azph.m85998a(activity).mo55125a(1578);
            azpy.m86121a().mo55205a(bopw.CHECK_REGISTRATION, System.currentTimeMillis());
            if (!cfgs.m139387G() || !azdl.m85412a(activity).mo54735I()) {
                azmx.m85838a(activity, intent, true);
                azph.m85998a(activity).mo55125a(1740);
                return;
            }
            azph.m85998a(activity).mo55125a(1738);
            azpy.m86121a();
            azpy.m86122a("WebAppFragment", "Attempting to parse args in UI process", new Object[0]);
            azpy.m86121a().mo55205a(bopw.ATTEMPT_PARSE_ARGS_IN_UI_PROCESS, System.currentTimeMillis());
            if (!intent.hasExtra("args")) {
                azpy.m86121a();
                azpy.m86122a("WebAppFragment", "Unable to get args from extra, falling back to GMS intent", new Object[0]);
                azmx.m85838a(activity, intent, true);
                azph.m85998a(activity).mo55126a(1739, 75);
                return;
            }
            azqh.m86163a(activity);
            bmxv c = bmxv.m108567c((cbbl) azol.m85935a((bxxk) cbbl.f176575p.mo74142c(7), sqd.m35969b(intent.getStringExtra("args"))));
            if (!c.mo66813a()) {
                azpy.m86121a();
                azpy.m86122a("WebAppFragment", "Unable to parse args from extra, falling back to GMS intent", new Object[0]);
                azmx.m85838a(activity, intent, true);
                azph.m85998a(activity).mo55126a(1739, 74);
                return;
            }
            cbbl cbbl = (cbbl) c.mo66814b();
            azqh a = azqh.m86163a(activity);
            bmxv bmxv2 = bmvz.f131120a;
            if (cfgs.m139414t()) {
                azpy.m86121a();
                azpy.m86122a("LWLaunchUtils", "Attempting to get the match LU account", new Object[0]);
                bmxv2 = azqf.m86130a(a.f99884a).mo55211a(cbbl.f176591o);
            }
            if (!bmxv2.mo66813a()) {
                bmxv2 = azqf.m86130a(a.f99884a).mo55210a();
            }
            if (!bmxv2.mo66813a()) {
                azpy.m86121a();
                azpy.m86122a("WebAppFragment", "No valid account in Lighter, checking registration in GMS process", new Object[0]);
                azmx.m85838a(activity, intent, true);
                azph.m85998a(activity).mo55126a(1739, 56);
                return;
            }
            azpy.m86121a();
            azpy.m86122a("WebAppFragment", "Sending AccountContext to Web app", new Object[0]);
            bcoh bcoh = (bcoh) bmxv2.mo66814b();
            azmx.mo55074a(bcoh);
            azph.m85998a(activity).mo55125a(1736);
            azqh a2 = azqh.m86163a(activity);
            azmr azmr = new azmr(azmx);
            cbds cbds = cbbl.f176587k;
            if (cbds == null) {
                cbds = cbds.f176782e;
            }
            if (cfgs.m139404j()) {
                bxvd bxvd = (bxvd) cbds.mo74142c(5);
                bxvd.mo73625a((bxvk) cbds);
                String e = cfgs.m139399e();
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                e.getClass();
                ((cbds) bxvd.f164949b).f176787d = e;
                cbds = (cbds) bxvd.mo74062i();
            }
            cbev cbev = (cbev) cbex.f176860f.mo74144da();
            if (cbev.f164950c) {
                cbev.mo74035c();
                cbev.f164950c = false;
            }
            cbds.getClass();
            ((cbex) cbev.f164949b).f176862a = cbds;
            bmxv a3 = azbj.m85193a(a2.f99884a).mo54564d().mo56314a(bcoh, boan.f132471e.mo68783a().mo68794a(((cbex) cbev.mo74062i()).mo73642k()));
            if (!a3.mo66813a()) {
                azph.m85998a(a2.f99884a).mo55126a(1705, 72);
                azmr.apply("Could not parse conversation intent");
                bmxv = bmvz.f131120a;
            } else {
                ConversationId a4 = ((bcsp) a3.mo66814b()).mo57317a();
                if (!bnkn.m109663a(bmyx.m108640a(',').mo66918a((CharSequence) cfgs.m139384D())).contains(azqh.m86164a(a4))) {
                    azoj.m85933c("LWLaunchUtils", "unsupported app: %s", azqh.m86164a(a4));
                    azph.m85998a(a2.f99884a).mo55126a(1705, 76);
                    azmr.apply("unsupported app");
                    bmxv = bmvz.f131120a;
                } else {
                    bmxv = bmxv.m108566b(a4);
                }
            }
            if (!bmxv.mo66813a()) {
                azoj.m85933c("WebAppFragment", "Unable to get conversationId", new Object[0]);
                azph.m85998a(activity).mo55126a(1739, 55);
                azmx.m85838a(activity, intent, true);
                return;
            }
            azpy.m86121a();
            azpy.m86122a("WebAppFragment", "Sending ConversationId to Web app", new Object[0]);
            azmx.mo55073a(activity, (ConversationId) bmxv.mo66814b());
            azph.m85998a(activity).mo55146a(1737, (ConversationId) bmxv.mo66814b());
            azpy.m86121a().mo55205a(bopw.PARSE_ARGS_IN_UI_PROCESS_SUCCESS, System.currentTimeMillis());
            azmx.m85838a(activity, intent, false);
        }
    }
}
