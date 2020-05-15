package com.google.android.gms.chimera.debug;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ModuleSetJournalUpdate$ModuleSetJournalIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final Comparator f29994a = qow.f41904a;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo17645a(byte[] bArr, boolean z) {
        C1245ok okVar;
        byte[] bArr2 = bArr;
        if (bArr2 != null) {
            try {
                qor qor = (qor) GeneratedMessageLite.m124016a(qor.f41889b, bArr2, bxus.m123743b());
                qli a = qli.m32351a(this);
                qor c = a.mo24079c();
                C1245ok okVar2 = new C1245ok();
                if (c != null) {
                    bxwc bxwc = c.f41891a;
                    int size = bxwc.size();
                    for (int i = 0; i < size; i++) {
                        qov qov = (qov) bxwc.get(i);
                        okVar2.put(qox.m32596a(qov), qov);
                    }
                }
                if (z) {
                    okVar = new C1245ok();
                } else {
                    okVar = okVar2;
                }
                bxwc bxwc2 = qor.f41891a;
                int size2 = bxwc2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    qov qov2 = (qov) bxwc2.get(i2);
                    String a2 = qox.m32596a(qov2);
                    qov qov3 = (qov) okVar2.get(a2);
                    if (qov3 != null) {
                        bxwc bxwc3 = qov2.f41902d;
                        bxvd bxvd = (bxvd) qov2.mo74142c(5);
                        bxvd.mo73625a((GeneratedMessageLite) qov2);
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        ((qov) bxvd.f164949b).f41902d = GeneratedMessageLite.m124030de();
                        bxvd.mo73943F(bxwc3);
                        bxvd.mo73943F(qov3.f41902d);
                        if (((qov) bxvd.f164949b).f41902d.size() >= 2) {
                            ArrayList arrayList = new ArrayList();
                            qou qou = qou.f41893c;
                            for (qou qou2 : Collections.unmodifiableList(((qov) bxvd.f164949b).f41902d)) {
                                int a3 = qot.m32591a(qou2.f41896b);
                                int i3 = 1;
                                if (a3 == 0) {
                                    a3 = 1;
                                }
                                int a4 = qot.m32591a(qou.f41896b);
                                if (a4 != 0) {
                                    i3 = a4;
                                }
                                if (a3 != i3) {
                                    arrayList.add(qou2);
                                    qou = qou2;
                                }
                            }
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            ((qov) bxvd.f164949b).f41902d = GeneratedMessageLite.m124030de();
                            bxvd.mo73943F(arrayList);
                        }
                        qox.m32597a(bxvd);
                        qov2 = (qov) bxvd.mo74062i();
                    }
                    okVar.put(a2, qov2);
                }
                ArrayList arrayList2 = new ArrayList(okVar.f26809h);
                for (int i4 = 0; i4 < okVar.f26809h; i4++) {
                    arrayList2.add((qov) okVar.mo15621c(i4));
                }
                Collections.sort(arrayList2, f29994a);
                bxvd da = qor.f41889b.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                qor qor2 = (qor) da.f164949b;
                qor2.mo24176a();
                bxsy.m123078a(arrayList2, qor2.f41891a);
                qor qor3 = (qor) da.mo74062i();
                if (a.mo24082f()) {
                    a.f41640a.edit().putString("Chimera.moduleSetJournal", sqd.m35968b(qor3.mo73642k())).commit();
                }
            } catch (bxwf e) {
                Log.w("ModuleSetJournalIntentOp", "Failed to parse module set journal.");
            }
        } else {
            Log.w("ModuleSetJournalIntentOp", "Ignoring null module set journal bytes.");
        }
    }

    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        boolean z = false;
        if ("com.google.android.gms.chimera.debug.WRITE_JOURNAL_UPDATE_ACTION".equals(action)) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("entries");
            if (intent.getIntExtra("isComprehensive", 0) != 0) {
                z = true;
            }
            mo17645a(byteArrayExtra, z);
        } else if ("com.google.android.chimera.MODULE_CONFIGURATION_CHANGED".equals(action)) {
            ModuleManager moduleManager = ModuleManager.get(this);
            try {
                qox qox = new qox();
                for (ModuleManager.ModuleSetInfo moduleSetInfo : moduleManager.getCurrentConfig().moduleSets) {
                    qox.mo24181a(moduleSetInfo.moduleSetId, moduleSetInfo.moduleSetVersion, 2);
                }
                mo17645a(qox.mo24184a(), false);
            } catch (InvalidConfigException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
                sb.append("Chimera module config error: ");
                sb.append(valueOf);
                Log.w("ModuleSetJournalIntentOp", sb.toString());
            }
        }
    }
}
