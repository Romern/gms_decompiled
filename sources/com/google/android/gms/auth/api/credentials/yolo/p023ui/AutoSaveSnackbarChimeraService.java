package com.google.android.gms.auth.api.credentials.yolo.p023ui;

import android.content.Intent;
import android.os.IBinder;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Service;
import com.google.android.gms.common.widget.phone.SnackbarLayout;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.auth.api.credentials.yolo.ui.AutoSaveSnackbarChimeraService */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AutoSaveSnackbarChimeraService extends Service {

    /* renamed from: a */
    public static final long f10147a = TimeUnit.SECONDS.toMillis(3);

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
        SnackbarLayout snackbarLayout = (SnackbarLayout) LayoutInflater.from(new ContextThemeWrapper(this, (int) C0126R.style.SignInSnackbar)).inflate((int) C0126R.C0128layout.credential_auto_save_toast, (ViewGroup) null, false);
        hdj.m14213a(snackbarLayout);
        snackbarLayout.setAccessibilityDelegate(new hso(this));
        new suu(this, snackbarLayout, f10147a).mo26135a();
        stopSelf();
        return 2;
    }
}
