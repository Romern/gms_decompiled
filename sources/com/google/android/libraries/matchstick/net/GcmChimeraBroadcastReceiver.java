package com.google.android.libraries.matchstick.net;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmChimeraBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: b */
    private static final List f111080b = Arrays.asList(cfeo.f183719a.mo6606a().mo80920G().split(","));

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0109  */
    public final void onReceive(Context context, Intent intent) {
        char c;
        LocalEntityId localEntityId;
        new Object[1][0] = intent;
        String action = intent.getAction();
        int hashCode = action.hashCode();
        if (hashCode != 366519424) {
            if (hashCode == 1736128796 && action.equals("com.google.android.c2dm.intent.REGISTRATION")) {
                c = 0;
                if (c == 0) {
                    SilentRegisterIntentOperation.m94575a(new Intent("com.google.android.gms.matchstick.refresh_gcm_token_action"), context);
                    return;
                } else if (c != 1) {
                    new Object[1][0] = intent.getAction();
                    return;
                } else if (TextUtils.equals(cfeo.m138879j(), intent.getStringExtra("msRecvApp"))) {
                    Intent intent2 = new Intent("com.google.android.apps.libraries.matchstick.action.lighter_message_action");
                    intent2.putExtras(intent);
                    MessagingService.m94557b(intent2, context);
                    return;
                } else {
                    String stringExtra = intent.getStringExtra("event");
                    if ("server_command".equals(stringExtra)) {
                        Intent intent3 = new Intent("com.google.android.apps.libraries.matchstick.action.tickle_handle_action");
                        intent3.putExtras(intent);
                        MessagingService.m94557b(intent3, context);
                        return;
                    } else if (!cfeo.f183719a.mo6606a().mo80942aB() || TextUtils.isEmpty(stringExtra) || !f111080b.contains(stringExtra)) {
                        Intent intent4 = new Intent("com.google.android.apps.libraries.matchstick.action.GCM_TICKLE_ACTION");
                        intent4.putExtras(intent);
                        String stringExtra2 = intent.getStringExtra("msRecvId");
                        if (!TextUtils.isEmpty(stringExtra2)) {
                            try {
                                localEntityId = LocalEntityId.m94551b((cbma) azol.m85935a((bxxk) cbma.f177591f.mo74142c(7), Base64.decode(stringExtra2, 2)));
                            } catch (Exception e) {
                                azoj.m85931a("InProcessReceiver", e, "Failed to decode recipient id %s", stringExtra2);
                                return;
                            }
                        } else {
                            azdl.m85412a(context);
                            if (azdl.m85419g(context)) {
                                azdl.m85412a(context);
                                localEntityId = new LocalEntityId(azdl.m85414b(context), 1, "MS");
                            } else {
                                localEntityId = azcv.f99014b;
                            }
                        }
                        azoi.m85926a(intent4, localEntityId);
                        MessagingService.m94558c(intent4, context);
                        return;
                    } else {
                        Intent intent5 = new Intent("com.google.android.gms.matchstick.device_unregistered_action");
                        intent5.putExtra("id_hash", intent.getStringExtra("id_hash"));
                        intent5.putExtra("msRecvId", intent.getStringExtra("msRecvId"));
                        SilentRegisterIntentOperation.m94575a(intent5, context);
                        return;
                    }
                }
            }
        } else if (action.equals("com.google.android.c2dm.intent.RECEIVE")) {
            c = 1;
            if (c == 0) {
            }
        }
        c = 65535;
        if (c == 0) {
        }
    }
}
