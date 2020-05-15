package com.google.android.gms.audit.service;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AuditApiChimeraService extends zzx {
    public AuditApiChimeraService() {
        super((int) MfiClientException.TYPE_MFICLIENT_NOT_STARTED, "com.google.android.gms.audit.service.START", Collections.emptySet(), 1, 10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        bxvd da = bssp.f146893l.mo74144da();
        String str = Build.ID;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bssp bssp = (bssp) da.f164949b;
        str.getClass();
        bssp.f146895a |= 2;
        bssp.f146897c = str;
        int i = Build.VERSION.SDK_INT;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bssp bssp2 = (bssp) da.f164949b;
        bssp2.f146895a |= 1;
        bssp2.f146896b = i;
        String str2 = getServiceRequest.f30230d;
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(str2, 0);
            int i2 = packageInfo.versionCode;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bssp bssp3 = (bssp) da.f164949b;
            bssp3.f146895a |= 8;
            bssp3.f146899e = i2;
            if (packageInfo.versionName != null) {
                String str3 = packageInfo.versionName;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bssp bssp4 = (bssp) da.f164949b;
                str3.getClass();
                bssp4.f146895a |= 4;
                bssp4.f146898d = str3;
            }
        } catch (PackageManager.NameNotFoundException e) {
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bssp bssp5 = (bssp) da.f164949b;
        str2.getClass();
        bssp5.f146895a |= 16;
        bssp5.f146900f = str2;
        String num = Integer.toString(201515033);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bssp bssp6 = (bssp) da.f164949b;
        num.getClass();
        bssp6.f146895a |= 32;
        bssp6.f146901g = num;
        String num2 = Integer.toString(getServiceRequest.f30229c);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bssp bssp7 = (bssp) da.f164949b;
        num2.getClass();
        bssp7.f146895a |= 64;
        bssp7.f146902h = num2;
        String str4 = Build.MANUFACTURER;
        String str5 = Build.MODEL;
        StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 1 + String.valueOf(str5).length());
        sb.append(str4);
        sb.append(" ");
        sb.append(str5);
        String sb2 = sb.toString();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bssp bssp8 = (bssp) da.f164949b;
        sb2.getClass();
        bssp8.f146895a |= 128;
        bssp8.f146903i = sb2;
        Configuration configuration = getResources().getConfiguration();
        int i3 = Build.VERSION.SDK_INT;
        LocaleList locales = configuration.getLocales();
        long min = Math.min((long) locales.size(), cbwp.f178481a.mo6606a().mo75551a());
        for (int i4 = 0; ((long) i4) < min; i4++) {
            String languageTag = locales.get(i4).toLanguageTag();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bssp bssp9 = (bssp) da.f164949b;
            languageTag.getClass();
            if (!bssp9.f146904j.mo73666a()) {
                bssp9.f146904j = GeneratedMessageLite.m124021a(bssp9.f146904j);
            }
            bssp9.f146904j.add(languageTag);
        }
        bxtx a = bxtx.m123261a(sqq.m35991a(ModuleManager.get(this)).mo25982a());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bssp bssp10 = (bssp) da.f164949b;
        a.getClass();
        bssp10.f146895a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        bssp10.f146905k = a;
        aaac.mo16652a(new ghl((bssp) da.mo74062i(), new aaag(this, this.f56354e, this.f56355f)));
    }
}
