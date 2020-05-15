package com.google.android.gms.common.analytics;

import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CoreAnalyticsInitHandler extends qlf {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        int i2 = i & 8;
        if ((i & 2) > 0) {
            ril.m33641a();
            ril.m33643a(this, 9, ((Long) rst.f43607b.mo25081c()).longValue());
        }
        if (i2 > 0) {
            int i3 = getSharedPreferences("coreanalyticsprefs", 0).getInt("last_install_version_code", 0);
            int e = spn.m35881e(this);
            if (i3 != e) {
                rik.m33637a();
                bxvd da = bpvf.f139321t.mo74144da();
                bpvc a = rik.m33636a(this);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpvf bpvf = (bpvf) da.f164949b;
                a.getClass();
                bpvf.f139324b = a;
                bpvf.f139323a |= 1;
                rik.m33640a(this, "install", ((bpvf) da.mo74062i()).mo73642k());
                getSharedPreferences("coreanalyticsprefs", 0).edit().putInt("last_install_version_code", e).apply();
            }
            ril.m33641a();
            ril.m33643a(this, 10, ((Long) rst.f43609d.mo25081c()).longValue());
        }
    }
}
