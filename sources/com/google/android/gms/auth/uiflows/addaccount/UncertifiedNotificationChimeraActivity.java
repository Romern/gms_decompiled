package com.google.android.gms.auth.uiflows.addaccount;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.auth.uiflows.minutemaid.GlifMinuteMaidLayout;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UncertifiedNotificationChimeraActivity extends deu {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: rrp.a(com.google.android.chimera.Activity, boolean, android.content.Context):void
     arg types: [com.google.android.gms.auth.uiflows.addaccount.UncertifiedNotificationChimeraActivity, int, com.google.android.gms.auth.uiflows.addaccount.UncertifiedNotificationChimeraActivity]
     candidates:
      rrp.a(com.google.android.chimera.Activity, java.lang.String, boolean):void
      rrp.a(com.google.android.chimera.Activity, boolean, android.content.Context):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: rrp.a(com.google.android.chimera.Activity, java.lang.String, boolean):void
     arg types: [com.google.android.gms.auth.uiflows.addaccount.UncertifiedNotificationChimeraActivity, java.lang.String, int]
     candidates:
      rrp.a(com.google.android.chimera.Activity, boolean, android.content.Context):void
      rrp.a(com.google.android.chimera.Activity, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!cbxb.f178503a.mo6606a().mo75569a()) {
            if (cbzk.m128961c()) {
                rrp.m34303a(this, "glif_light");
                rrp.m34305a((Activity) this, false, (Context) this);
            } else {
                rrp.m34304a((Activity) this, "glif_light", false);
            }
            setContentView((int) C0126R.C0128layout.auth_uncertified_activity);
            GlifMinuteMaidLayout glifMinuteMaidLayout = (GlifMinuteMaidLayout) findViewById(C0126R.C0129id.setup_wizard_layout);
            glifMinuteMaidLayout.mo7904a(true);
            glifMinuteMaidLayout.mo7903a(getResources().getString(C0126R.string.common_ok), 5, new jwq(this));
            return;
        }
        if (cbzk.m128961c()) {
            rrp.m34303a(this, "glif_v3_light");
            rrp.m34305a((Activity) this, false, (Context) this);
        } else {
            rrp.m34304a((Activity) this, "glif_v3_light", false);
        }
        setContentView((int) C0126R.C0128layout.auth_uncertified_activity_v2);
        ((Button) findViewById(C0126R.C0129id.finishButton)).setOnClickListener(new jwp(this));
    }
}
