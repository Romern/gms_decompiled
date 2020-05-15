package com.google.android.gms.googlehelp.metrics;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MetricsIntentOperation extends IntentOperation {

    /* renamed from: a */
    private abcr f78991a;

    /* renamed from: a */
    public static void m66596a(Context context, abeh abeh, boolean z) {
        GoogleHelp googleHelp = new GoogleHelp("gms:googlehelp");
        if (!TextUtils.isEmpty(abeh.f57214i)) {
            new aare(googleHelp).mo31634a(abeh.f57214i);
        }
        googleHelp.f78762e = abeh.f57209d;
        bxvd bxvd = (bxvd) abeh.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) abeh);
        if (((abeh) bxvd.f164949b).f57225t <= 0) {
            long currentTimeMillis = System.currentTimeMillis();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            abeh abeh2 = (abeh) bxvd.f164949b;
            abeh abeh3 = abeh.f57196I;
            abeh2.f57206a |= 16777216;
            abeh2.f57225t = currentTimeMillis;
        }
        if (aaya.m47228a(cees.m136640c()) && !aaya.m47228a(cees.f182559a.mo6606a().mo79046f())) {
            if (z) {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                abeh abeh4 = (abeh) bxvd.f164949b;
                abeh abeh5 = abeh.f57196I;
                abeh4.f57206a |= 33554432;
                abeh4.f57226u = -2;
            }
            abcm.m47448a(context, ((abeh) bxvd.mo74062i()).mo73642k(), googleHelp);
        } else if (z) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            abeh abeh6 = (abeh) bxvd.f164949b;
            abeh abeh7 = abeh.f57196I;
            abeh6.f57206a |= 33554432;
            abeh6.f57226u = -2;
            ArrayList arrayList = new ArrayList(1);
            arrayList.add((abeh) bxvd.mo74062i());
            if (aaya.m47228a(cehd.m136826b())) {
                bqgj a = snp.m35702a(10);
                a.execute(new abcs(context, googleHelp, a, arrayList));
                return;
            }
            abdb.m47538a(context, HelpConfig.m66350a(googleHelp, context), null, arrayList, null);
        } else {
            abcm.m47448a(context, ((abeh) bxvd.mo74062i()).mo73642k(), googleHelp);
        }
    }

    public final void onDestroy() {
        abcr abcr = this.f78991a;
        if (abcr != null) {
            abcr.close();
        }
    }

    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            Log.e("gH_MetricsIntentOp", "Null intent received.");
        } else if (intent.hasExtra("EXTRA_METRIC_DATA")) {
            try {
                bxvd da = abeh.f57196I.mo74144da();
                da.mo73635b(intent.getByteArrayExtra("EXTRA_METRIC_DATA"), bxus.m123744c());
                abcx.m47495a(da, this);
                abeh abeh = (abeh) da.mo74062i();
                HelpConfig helpConfig = new HelpConfig();
                helpConfig.f78827b = abeh.f57209d;
                helpConfig.f78830e = abeh.f57214i;
                helpConfig.f78804D = abeh.f57230y;
                helpConfig.f78828c = abeh.f57211f;
                if (intent.hasExtra("EXTRA_GOOGLE_HELP")) {
                    helpConfig = HelpConfig.m66350a((GoogleHelp) intent.getParcelableExtra("EXTRA_GOOGLE_HELP"), this);
                    abcx.m47496a(da, helpConfig);
                }
                if (helpConfig.f78833h) {
                    if (aaya.m47228a(cees.m136641d())) {
                        abcr abcr = new abcr(this);
                        this.f78991a = abcr;
                        abcr.mo32041a((abeh) da.mo74062i());
                        ReportBatchedMetricsChimeraGcmTaskService.m66601a(this, helpConfig);
                    }
                    if (aaya.m47228a(cees.m136640c())) {
                        Account account = helpConfig.f78829d;
                        abcx.m47500a(new qws(getApplicationContext(), cees.m136639b(), account != null ? account.name : null), da);
                    }
                }
            } catch (bxwf e) {
                Log.e("gH_MetricsIntentOp", "Could not parse metric data.", e);
            }
        } else {
            Log.e("gH_MetricsIntentOp", "No metric data sent!");
        }
    }

    /* renamed from: a */
    public static void m66597a(Context context, String str, String str2, int i, int i2, boolean z) {
        bxvd da = abeh.f57196I.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abeh abeh = (abeh) da.f164949b;
        abeh.f57215j = i - 1;
        int i3 = abeh.f57206a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        abeh.f57206a = i3;
        abeh.f57216k = i2 - 1;
        int i4 = i3 | 1024;
        abeh.f57206a = i4;
        str2.getClass();
        abeh.f57206a = i4 | 2;
        abeh.f57209d = str2;
        if (!TextUtils.isEmpty(str)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            abeh abeh2 = (abeh) da.f164949b;
            str.getClass();
            abeh2.f57206a |= 64;
            abeh2.f57214i = str;
        }
        m66596a(context, (abeh) da.mo74062i(), z);
    }
}
