package com.google.android.gms.trustagent.common.framework.model;

import android.content.Context;
import android.content.Intent;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ModelStore$DataChangeReceiver extends aacn {

    /* renamed from: a */
    private final aumr f109146a;

    public ModelStore$DataChangeReceiver(aumr aumr) {
        super("trustagent");
        sdo.m34959a(aumr);
        this.f109146a = aumr;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if ("com.google.android.gms.trustagent.framework.model.action.DATA_CHANGE_NOTIFICATION".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("data_operation", -1);
            String stringExtra = intent.getStringExtra("model_type");
            String stringExtra2 = intent.getStringExtra("model_id");
            if (intExtra != -1 && stringExtra != null && stringExtra2 != null) {
                aumr aumr = this.f109146a;
                synchronized (aumr.f92091b) {
                    List<aumq> list = (List) aumr.f92090a.get(stringExtra);
                    if (list != null) {
                        for (aumq aumq : list) {
                            if (intExtra == 1) {
                                aumq.mo50648b();
                            } else if (intExtra == 2) {
                                aumq.mo50647a();
                            }
                        }
                    }
                }
            }
        }
    }
}
