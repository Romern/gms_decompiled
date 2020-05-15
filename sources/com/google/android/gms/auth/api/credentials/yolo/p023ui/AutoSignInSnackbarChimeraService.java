package com.google.android.gms.auth.api.credentials.yolo.p023ui;

import android.content.Intent;
import android.os.IBinder;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Service;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.widget.phone.SnackbarLayout;

/* renamed from: com.google.android.gms.auth.api.credentials.yolo.ui.AutoSignInSnackbarChimeraService */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AutoSignInSnackbarChimeraService extends Service {
    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, ?[OBJECT, ARRAY], int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final int onStartCommand(Intent intent, int i, int i2) {
        Credential credential = (Credential) sef.m35067a(intent, "com.google.android.gms.credentials.Credential", Credential.CREATOR);
        SnackbarLayout snackbarLayout = (SnackbarLayout) LayoutInflater.from(new ContextThemeWrapper(this, (int) C0126R.style.SignInSnackbar)).inflate((int) C0126R.C0128layout.credential_auto_signin_toast, (ViewGroup) null, false);
        hte.m14835a(this, snackbarLayout, credential);
        hdj.m14213a(snackbarLayout);
        snackbarLayout.setAccessibilityDelegate(new hsp(this, credential));
        new suu(this, snackbarLayout, 3000).mo26135a();
        bxvd da = bodk.f132702h.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bodk bodk = (bodk) da.f164949b;
        bodk.f132705b = 300;
        int i3 = bodk.f132704a | 1;
        bodk.f132704a = i3;
        bodk.f132704a = i3 | 16;
        bodk.f132709f = false;
        his.m14426a().mo12510a((bodk) da.mo74062i());
        if (ccda.m129287b()) {
            qws qws = new qws(this, "IDENTITY_GMSCORE", null);
            bxvd da2 = bong.f133782r.mo74144da();
            String stringExtra = intent.getStringExtra("log_session_id");
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bong bong = (bong) da2.f164949b;
            stringExtra.getClass();
            int i4 = bong.f133784a | 2;
            bong.f133784a = i4;
            bong.f133786c = stringExtra;
            bong.f133785b = 6;
            bong.f133784a = i4 | 1;
            bxvd da3 = bonb.f133754f.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bonb bonb = (bonb) da3.f164949b;
            bonb.f133757b = 510;
            bonb.f133756a |= 1;
            bonb bonb2 = (bonb) da3.mo74062i();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bong bong2 = (bong) da2.f164949b;
            bonb2.getClass();
            bong2.f133791h = bonb2;
            bong2.f133784a |= 64;
            qws.mo24333a(da2.mo74062i()).mo24327b();
        }
        stopSelf();
        return 2;
    }
}
