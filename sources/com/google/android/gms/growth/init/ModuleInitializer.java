package com.google.android.gms.growth.init;

import android.app.NotificationChannel;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.gms.growth.notifications.NotificationActionChimeraActivity;
import com.google.android.gms.growth.p048ui.GrowthDebugChimeraActivity;
import com.google.android.gms.growth.p048ui.webview.GrowthWebViewChimeraActivity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ModuleInitializer extends qlf {

    /* renamed from: a */
    private static final srn f79019a = srn.m36127a(sgj.GROWTH);

    /* renamed from: b */
    private static final String[] f79020b = {GrowthDebugChimeraActivity.f79028b, GrowthWebViewChimeraActivity.f79030a, NotificationActionChimeraActivity.f79027a, "com.google.android.gms.growth.notifications.GcmBroadcastReceiver"};

    /* renamed from: a */
    private final void m66637a() {
        try {
            abio k = abif.m47744a().mo32128k();
            abij abij = (abij) k.f57543a.mo6445a();
            abio.m47776a(abij, 1);
            abhu abhu = (abhu) k.f57544b.mo6445a();
            abio.m47776a(abhu, 2);
            int i = 3;
            abio.m47776a(this, 3);
            abin abin = new abin(abij, abhu, this);
            bxvd da = bsqd.f146621e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsqd bsqd = (bsqd) da.f164949b;
            bsqd.f146624b = 1;
            bsqd.f146623a |= 1;
            if (!sey.m35126a(abin.f57540a).mo25460a()) {
                i = 2;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsqd bsqd2 = (bsqd) da.f164949b;
            bsqd2.f146625c = i - 1;
            bsqd2.f146623a |= 2;
            bxwc bxwc = cejr.f182803a.mo6606a().mo79193a().f165797a;
            int size = bxwc.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str = (String) bxwc.get(i2);
                bxvd da2 = bsqb.f146615d.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bsqb bsqb = (bsqb) da2.f164949b;
                str.getClass();
                int i3 = bsqb.f146617a | 1;
                bsqb.f146617a = i3;
                bsqb.f146618b = str;
                bsqb.f146619c = 0;
                bsqb.f146617a = i3 | 2;
                int i4 = Build.VERSION.SDK_INT;
                NotificationChannel a = sex.m35104a(abin.f57540a).mo25437a(str);
                if (a != null) {
                    if (a.getImportance() < 2) {
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bsqb bsqb2 = (bsqb) da2.f164949b;
                        bsqb2.f146619c = 1;
                        bsqb2.f146617a |= 2;
                    } else {
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bsqb bsqb3 = (bsqb) da2.f164949b;
                        bsqb3.f146619c = 2;
                        bsqb3.f146617a |= 2;
                    }
                }
                bsqb bsqb4 = (bsqb) da2.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bsqd bsqd3 = (bsqd) da.f164949b;
                bsqb4.getClass();
                if (!bsqd3.f146626d.mo73666a()) {
                    bsqd3.f146626d = bxvk.m124021a(bsqd3.f146626d);
                }
                bsqd3.f146626d.add(bsqb4);
            }
            for (String str2 : abin.f57542c.mo32118a()) {
                abin.f57541b.mo32131b(str2, da);
            }
        } catch (RuntimeException e) {
            bnsl bnsl = (bnsl) f79019a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("com.google.android.gms.growth.init.ModuleInitializer", "a", 59, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to log notification block state");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6343a(Intent intent) {
        m66637a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.growth.init.ModuleInitializer, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6268a(Intent intent, boolean z) {
        for (String str : f79020b) {
            spn.m35856a((Context) this, str, true);
        }
        m66637a();
    }
}
