package com.google.android.gms.auth.api.credentials.yolo.p023ui;

import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.chimera.Service;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.widget.phone.SnackbarLayout;

/* renamed from: com.google.android.gms.auth.api.credentials.yolo.ui.AutoSignInWarmWelcomeChimeraService */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AutoSignInWarmWelcomeChimeraService extends Service implements View.OnClickListener {

    /* renamed from: a */
    public suu f10148a;

    /* renamed from: b */
    private String f10149b;

    /* renamed from: c */
    private qws f10150c;

    /* renamed from: a */
    private final void m6370a(int i) {
        if (ccda.m129287b()) {
            qws qws = this.f10150c;
            bxvd da = bong.f133782r.mo74144da();
            String str = this.f10149b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bong bong = (bong) da.f164949b;
            str.getClass();
            int i2 = bong.f133784a | 2;
            bong.f133784a = i2;
            bong.f133786c = str;
            bong.f133785b = 6;
            bong.f133784a = i2 | 1;
            bxvd da2 = bonb.f133754f.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bonb bonb = (bonb) da2.f164949b;
            bonb.f133757b = i - 1;
            bonb.f133756a |= 1;
            bonb bonb2 = (bonb) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bong bong2 = (bong) da.f164949b;
            bonb2.getClass();
            bong2.f133791h = bonb2;
            bong2.f133784a |= 64;
            qws.mo24333a(da.mo74062i()).mo24327b();
        }
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public void onClick(View view) {
        if (view.getId() == C0126R.C0129id.common_got_it) {
            view.postDelayed(new hsq(this), 400);
            bxvd da = bodk.f132702h.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bodk bodk = (bodk) da.f164949b;
            bodk.f132705b = 302;
            int i = bodk.f132704a | 1;
            bodk.f132704a = i;
            bodk.f132704a = i | 16;
            bodk.f132709f = true;
            his.m14426a().mo12510a((bodk) da.mo74062i());
            m6370a(304);
        } else if (view.getId() == C0126R.C0129id.credentials_learn_more) {
            Intent addFlags = new Intent("android.intent.action.VIEW", Uri.parse((String) hfe.f19643e.mo58455c())).addFlags(268435456);
            if (addFlags.resolveActivity(getPackageManager()) != null) {
                startActivity(addFlags);
            } else {
                Toast.makeText(this, getResources().getString(C0126R.string.common_no_browser_found), 1).show();
            }
            bxvd da2 = bodk.f132702h.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bodk bodk2 = (bodk) da2.f164949b;
            bodk2.f132705b = ErrorInfo.TYPE_FSC_HTTP_ERROR;
            int i2 = bodk2.f132704a | 1;
            bodk2.f132704a = i2;
            bodk2.f132704a = i2 | 16;
            bodk2.f132709f = true;
            his.m14426a().mo12510a((bodk) da2.mo74062i());
            m6370a(303);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, ?[OBJECT, ARRAY], int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final int onStartCommand(Intent intent, int i, int i2) {
        String stringExtra = intent.getStringExtra("log_session_id");
        sdo.m34959a((Object) stringExtra);
        this.f10149b = stringExtra;
        SnackbarLayout snackbarLayout = (SnackbarLayout) LayoutInflater.from(new ContextThemeWrapper(this, (int) C0126R.style.SignInWarmWelcome)).inflate((int) C0126R.C0128layout.credential_auto_signin_warm_welcome, (ViewGroup) null, false);
        hte.m14835a(this, snackbarLayout, (Credential) sef.m35067a(intent, "com.google.android.gms.credentials.Credential", Credential.CREATOR));
        snackbarLayout.findViewById(C0126R.C0129id.common_got_it).setOnClickListener(this);
        View findViewById = snackbarLayout.findViewById(C0126R.C0129id.credentials_learn_more);
        if (findViewById != null) {
            findViewById.setOnClickListener(this);
        }
        this.f10148a = new suu(this, snackbarLayout, 0, null);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.flags = 2;
        layoutParams.dimAmount = 0.7f;
        suu suu = this.f10148a;
        suu.f45202e = layoutParams;
        suu.mo26135a();
        gvq.m14020a(this, hid.m14370a(this.f10149b).mo12481a()).mo12278a();
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
        bodk.f132709f = true;
        his.m14426a().mo12510a((bodk) da.mo74062i());
        this.f10150c = new qws(this, "IDENTITY_GMSCORE", null);
        m6370a(302);
        stopSelf();
        return 2;
    }
}
