package com.google.android.location.settings;

import android.app.AutomaticZenRule;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import com.google.android.chimera.ConditionProviderService;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CarDndNotifierIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        String str;
        if (ceut.m138271b() && intent != null) {
            try {
                if (intent.getAction().equalsIgnoreCase("com.google.android.location.internal.CAR_DND_ACTION") && intent.hasExtra("car_dnd_key")) {
                    boolean booleanExtra = intent.getBooleanExtra("car_dnd_key", false);
                    sex a = sex.m35104a(this);
                    if (a != null) {
                        ComponentName componentName = new ComponentName(getApplicationContext().getPackageName(), "com.google.android.location.settings.DrivingConditionProvider");
                        Pair a2 = vqz.m41087a(a, componentName);
                        AutomaticZenRule automaticZenRule = null;
                        if (a2 != null) {
                            str = (String) a2.first;
                        } else {
                            str = null;
                        }
                        if (a2 != null) {
                            automaticZenRule = (AutomaticZenRule) a2.second;
                        }
                        if (str != null && automaticZenRule != null) {
                            Log.i("CarDndNotifierIntOpr", "rule already exist");
                            automaticZenRule.setConditionId(bhae.m100520a(this, booleanExtra));
                            int i = Build.VERSION.SDK_INT;
                            if (ceuw.m138274b()) {
                                if (!booleanExtra && ceyg.f183508a.mo6606a().removeDndRuleUponDrivingModeTurnedOff()) {
                                    Log.i("CarDndNotifierIntOpr", "Removing dnd rule upon driving mode turned off.");
                                    a.mo25452d(str);
                                }
                            }
                            if (!automaticZenRule.isEnabled()) {
                                automaticZenRule.setEnabled(true);
                            }
                            a.mo25446a(str, automaticZenRule);
                        } else if (booleanExtra) {
                            bhae.m100522a(this, a, true);
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        if (ceuw.m138274b()) {
                            ConditionProviderService.requestRebind(componentName);
                        }
                    }
                }
            } catch (Exception e) {
                Log.e("CarDndNotifierIntOpr", "Exception in OnHandleIntent in CarDndNotifierIntentOperation", e);
            }
        }
    }
}
