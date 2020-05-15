package p000;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.matchstick.net.MessagingService;
import java.util.Collections;

/* renamed from: azff */
public final /* synthetic */ class azff implements Runnable {

    /* renamed from: a */
    private final MessagingService f99222a;

    /* renamed from: b */
    private final Intent f99223b;

    public azff(MessagingService messagingService, Intent intent) {
        this.f99222a = messagingService;
        this.f99223b = intent;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public final void run() {
        bmxv bmxv;
        char c;
        String str;
        cbbl cbbl;
        Uri data;
        MessagingService messagingService = this.f99222a;
        Intent intent = this.f99223b;
        bmxv bmxv2 = bmvz.f131120a;
        Intent intent2 = (Intent) intent.getParcelableExtra("android.intent.extra.INTENT");
        if (intent2 != null) {
            String action = intent2.getAction();
            switch (action.hashCode()) {
                case -1908079756:
                    if (action.equals("com.google.business.ACTION_INITIATE_BUSINESS_CHAT")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1301767051:
                    if (action.equals("com.google.business.ACTION_INITIATE_NEW_BUSINESS_CHAT")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1173171990:
                    if (action.equals("android.intent.action.VIEW")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1087299525:
                    if (action.equals("com.google.business.ACTION_CHAT")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 766882747:
                    if (action.equals("com.google.business.ACTION_INITIATE_CHAT")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0 || c == 1 || c == 2 || c == 3) {
                str = intent2.getStringExtra("args");
            } else if (c != 4) {
                str = "";
            } else {
                str = intent2.getData().getQueryParameter("args");
            }
            if (!TextUtils.isEmpty(str)) {
                cbbl cbbl2 = (cbbl) azol.m85935a((bxxk) cbbl.f176575p.mo74142c(7), sqd.m35969b(str));
                if (cbbl2 != null) {
                    bmxv = bmxv.m108566b(Long.valueOf(cbbl2.f176591o));
                }
            }
            if ("com.google.business.ACTION_MESSAGE".equals(intent2.getAction())) {
                cbex cbex = null;
                if ("com.google.business.ACTION_MESSAGE".equals(intent2.getAction())) {
                    String stringExtra = intent2.getStringExtra("args");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        cbex = MessagingService.m94555a(stringExtra);
                    }
                } else if ("android.intent.action.VIEW".equals(intent2.getAction()) && (data = intent2.getData()) != null) {
                    String queryParameter = data.getQueryParameter("args");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        cbex = MessagingService.m94555a(queryParameter);
                    }
                }
                if (!(cbex == null || !cbex.mo75231a(cfeo.m138848E()) || (cbbl = (cbbl) azol.m85935a((bxxk) cbbl.f176575p.mo74142c(7), ((bxte) Collections.unmodifiableMap(cbex.f176863b).get(cfeo.m138848E())).f164766b.getKey())) == null)) {
                    bmxv = bmxv.m108566b(Long.valueOf(cbbl.f176591o));
                }
            }
            bmxv = bmvz.f131120a;
        } else {
            bmxv = bmvz.f131120a;
        }
        if (bmxv.mo66813a()) {
            bmxv2 = azqf.m86130a(messagingService.f111093m).mo55211a(((Long) bmxv.mo66814b()).longValue());
        }
        if (!bmxv2.mo66813a()) {
            bmxv2 = azqf.m86130a(messagingService.f111093m).mo55210a();
        }
        if (bmxv2.mo66813a()) {
            azbj.m85193a(messagingService.f111093m).mo54564d().mo56322a((bcoh) bmxv2.mo66814b());
            messagingService.f111090j.mo55125a(1732);
            return;
        }
        azoj.m85933c("MessagingService", "No valid account on the device, cannot open bind connection.", new Object[0]);
        messagingService.f111090j.mo55126a(1733, 56);
    }
}
