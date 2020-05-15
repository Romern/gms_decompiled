package com.google.android.gms.gass;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PackageChangeBroadcastReceiverImpl extends aagh {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo16856a() {
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final byte[] mo16857a(Intent intent, Context context) {
        String str;
        Uri data = intent.getData();
        if (data != null) {
            str = data.getSchemeSpecificPart();
            if (str == null || str.isEmpty()) {
                new Object[1][0] = data;
                return null;
            }
        } else {
            str = null;
        }
        if (!cebm.f182225a.mo6606a().mo78736b() || intent.getIntExtra("android.content.pm.extra.DATA_LOADER_TYPE", -1) != 2) {
            bxvd da = aaiq.f28214c.mo74144da();
            if (str != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                aaiq aaiq = (aaiq) da.f164949b;
                str.getClass();
                aaiq.f28216a |= 1;
                aaiq.f28217b = str;
            }
            return ((aaiq) da.mo74062i()).mo73642k();
        }
        new Object[1][0] = data;
        if (cebm.f182225a.mo6606a().mo78735a()) {
            aagi.m21209a(context).mo16858a(5013, -1);
        }
        return null;
    }
}
