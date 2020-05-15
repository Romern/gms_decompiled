package com.google.android.gms.auth.authzen.transaction;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.felicanetworks.sdu.ErrorInfo;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BaseTransactionActivity$4 extends aacn {

    /* renamed from: a */
    final /* synthetic */ ijt f10495a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseTransactionActivity$4(ijt ijt, String str) {
        super(str);
        this.f10495a = ijt;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ijt.a(int, boolean):void
     arg types: [int, int]
     candidates:
      ijt.a(byoo, int):void
      iko.a(ikz, int):boolean
      ijt.a(int, boolean):void */
    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        char c;
        ijt ijt = this.f10495a;
        String action = intent.getAction();
        switch (action.hashCode()) {
            case -1727120031:
                if (action.equals("AUTHZEN_UPDATE_ACTIVITY")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 298102201:
                if (action.equals("AUTHZEN_ACTIVITY_EXPIRED")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1455446650:
                if (action.equals("AUTHZEN_CLOSE_ACTIVITY")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1899719742:
                if (action.equals("AUTHZEN_REPLACE_ACTIVITY")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c == 1) {
                if (TextUtils.equals(ijt.f21140k, intent.getStringExtra("notification_tag")) && !Arrays.equals(ijt.f21134e.f167308b.mo73780k(), intent.getByteArrayExtra("transaction_id"))) {
                    ijt.f21129r.mo25414c("Closing %s activity with notification tag: %s", ijt.getClass().getSimpleName(), ijt.f21140k);
                    if (!ijt.f21142m) {
                        ijt.mo13074a(byoo.DISMISSED, (int) ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE);
                    }
                    ijt.finish();
                }
            } else if (c != 2) {
                if (c == 3 && intent.getLongExtra("creation_elapsed_time", -1) == ijt.f21136g) {
                    if (!ijt.f21142m) {
                        ijt.mo13073a(byoo.EXPIRED);
                    }
                    ijt.f21129r.mo25414c("%s activity expired.", ijt.getClass().getSimpleName());
                    ijt.setResult(0);
                    ijt.finish();
                }
            } else if (Arrays.equals(ijt.f21134e.f167308b.mo73780k(), intent.getByteArrayExtra("transaction_id"))) {
                ijt.f21129r.mo25414c("Activity received broadcast update", new Object[0]);
                ikm.m15621c(-1);
                int b = ikm.m15620b(intent.getIntExtra("transaction_state", -1));
                ijt.f21146q = b;
                if (b == 46) {
                    ijt.mo13071a(603, false);
                }
                int i = ijt.f21146q;
                if (i == 0) {
                    throw null;
                } else if (i == 70 || i == -1) {
                    ijt.finish();
                }
            }
        } else if (Arrays.equals(ijt.f21134e.f167308b.mo73780k(), intent.getByteArrayExtra("transaction_id"))) {
            ijt.f21129r.mo25414c("Closing %s due to cancel request from the server.", ijt.getClass().getSimpleName());
            if (!ijt.f21142m) {
                ijt.mo13074a(byoo.DISMISSED, 501);
            }
            ijt.finish();
        }
    }
}
