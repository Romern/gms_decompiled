package com.google.android.gms.constellation.util;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OnSyncCompletedListener$Receiver extends ResultReceiver {

    /* renamed from: a */
    private tdl f30605a;

    public OnSyncCompletedListener$Receiver(Handler handler, tdl tdl) {
        super(handler);
        this.f30605a = tdl;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: tdl.a(boolean, java.util.Map):void
     arg types: [int, ?[OBJECT, ARRAY]]
     candidates:
      tdl.a(java.lang.String, java.util.ArrayList):void
      tdl.a(boolean, java.util.Map):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: tdl.a(boolean, java.util.Map):void
     arg types: [int, java.util.HashMap]
     candidates:
      tdl.a(java.lang.String, java.util.ArrayList):void
      tdl.a(boolean, java.util.Map):void */
    public final void onReceiveResult(int i, Bundle bundle) {
        tdw tdw = null;
        HashMap hashMap = null;
        if (i == 0) {
            if (bundle != null) {
                tdw = (tdw) bundle.getSerializable("failure_verification_exception_key");
            }
            if (tdw == null) {
                tdw = new tdw(39, false);
            }
            this.f30605a.mo11624a(tdw);
        } else if (i != 1) {
            int i2 = 2;
            if (i == 2) {
                this.f30605a.mo11625a(false, (Map) null);
            } else if (i != 3) {
                if (i == 4) {
                    if (bundle != null) {
                        if (((Boolean) bundle.getSerializable("success_consent_value_key")).booleanValue()) {
                            i2 = 3;
                        } else {
                            i2 = 4;
                        }
                    }
                    this.f30605a.mo11623a(i2);
                } else if (i == 5) {
                    this.f30605a.mo11625a(true, (Map) null);
                }
            } else if (bundle != null) {
                ArrayList<String> stringArrayList = bundle.getStringArrayList("gaia_tokens");
                this.f30605a.mo26315a(bundle.getString("iid_token"), stringArrayList);
            } else {
                this.f30605a.mo26315a((String) null, (ArrayList) null);
            }
        } else {
            if (bundle != null) {
                hashMap = (HashMap) bundle.getSerializable("success_server_result_data_key");
            }
            this.f30605a.mo11625a(true, (Map) hashMap);
        }
    }
}
