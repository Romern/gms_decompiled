package com.google.android.gms.common.config;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.phenotype.RegistrationInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PhenotypeRegistrationOperation extends IntentOperation {

    /* renamed from: b */
    private static final String[] f30151b = {"com.google.android.chimera.MODULE_CONFIGURATION_CHANGED", "com.google.android.gms.phenotype.DAILY_CHECKIN", "android.intent.action.BOOT_COMPLETED"};

    /* renamed from: a */
    aney f30152a;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo17758a(List list) {
        try {
            aucu.m76783a(this.f30152a.mo41762a((RegistrationInfo[]) list.toArray(new RegistrationInfo[list.size()])), 10, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e) {
            Log.w("PhenotypeRegOp", "Phenotype bulk registration failed", e);
        } catch (ExecutionException e2) {
            Log.e("PhenotypeRegOp", "Phenotype bulk registration failed", e2);
        }
    }

    public final void onCreate() {
        this.f30152a = anef.m64089a(this);
    }

    public final void onHandleIntent(Intent intent) {
        if (intent == null || !sqc.m35963b(f30151b, intent.getAction())) {
            Log.e("PhenotypeRegOp", "Invalid intent");
            return;
        }
        try {
            Collection<ModuleManager.ModuleInfo> allModulesWithMetadata = ModuleManager.get(this).getAllModulesWithMetadata("com.google.android.gms.phenotype.registration.proto");
            C1245ok okVar = new C1245ok();
            for (ModuleManager.ModuleInfo moduleInfo : allModulesWithMetadata) {
                try {
                    byte[] byteArray = moduleInfo.getMetadata(this).getByteArray("com.google.android.gms.phenotype.registration.proto");
                    if (byteArray == null) {
                        String valueOf = String.valueOf(moduleInfo.moduleId);
                        Log.e("PhenotypeRegOp", valueOf.length() == 0 ? new String("Failed to read metadata for ") : "Failed to read metadata for ".concat(valueOf));
                    } else {
                        for (RegistrationInfo registrationInfo : rtf.m34393a(this, (zzv) GeneratedMessageLite.m124014a(zzv.f56346b, byteArray), moduleInfo.moduleVersion)) {
                            if (okVar.containsKey(registrationInfo.f82115a)) {
                                "com.google.android.gms".equals(registrationInfo.f82115a);
                                String valueOf2 = String.valueOf(registrationInfo.f82115a);
                                Log.e("PhenotypeRegOp", valueOf2.length() == 0 ? new String("Attempting to overwrite config package for ") : "Attempting to overwrite config package for ".concat(valueOf2));
                            } else {
                                okVar.put(registrationInfo.f82115a, registrationInfo);
                                String valueOf3 = String.valueOf(moduleInfo.moduleId);
                                if (valueOf3.length() == 0) {
                                    new String("Phenotype registered for module: ");
                                } else {
                                    "Phenotype registered for module: ".concat(valueOf3);
                                }
                            }
                        }
                    }
                } catch (IOException e) {
                    e = e;
                    String str = moduleInfo.moduleId;
                    String message = e.getMessage();
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 44 + String.valueOf(message).length());
                    sb.append("Failed to build phenotype registration for ");
                    sb.append(str);
                    sb.append(":");
                    sb.append(message);
                    Log.e("PhenotypeRegOp", sb.toString());
                } catch (RuntimeException e2) {
                    e = e2;
                    String str2 = moduleInfo.moduleId;
                    String message2 = e.getMessage();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 44 + String.valueOf(message2).length());
                    sb2.append("Failed to build phenotype registration for ");
                    sb2.append(str2);
                    sb2.append(":");
                    sb2.append(message2);
                    Log.e("PhenotypeRegOp", sb2.toString());
                }
            }
            if (!okVar.containsKey("com.google.android.gms")) {
                Log.e("PhenotypeRegOp", "Core gms application properties were not set in phenotype registration.");
            }
            ArrayList arrayList = new ArrayList(okVar.f26809h);
            for (int i = 0; i < okVar.f26809h; i++) {
                arrayList.add((RegistrationInfo) okVar.mo15621c(i));
            }
            mo17758a(arrayList);
        } catch (InvalidConfigException e3) {
            Log.e("PhenotypeRegOp", "Failed to load module configuration", e3);
        }
    }
}
