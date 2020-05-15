package com.google.android.gms.common.p037ui;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.SignInButtonConfig;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.google.android.gms.common.ui.SignInButtonCreatorImpl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SignInButtonCreatorImpl extends scy {
    public static final String CHIMERA_MODULE_ID = "com.google.android.gms.signinbutton_dynamite";

    /* renamed from: a */
    private Lock f30397a = new ReentrantLock();

    /* renamed from: b */
    private Context f30398b;

    /* renamed from: c */
    private Context f30399c;

    /* renamed from: a */
    private final vzr m22735a(vzr vzr, soo soo) {
        Context context = (Context) vzs.m41641a(vzr);
        this.f30397a.lock();
        try {
            Context applicationContext = context.getApplicationContext();
            Context context2 = this.f30398b;
            if (context2 == null || applicationContext != context2) {
                Context a = qls.m32403a(applicationContext, CHIMERA_MODULE_ID);
                if (a == null) {
                    Log.e("SignInButtonProxy", "Unexpected null moduleContext for: com.google.android.gms.signinbutton_dynamite. newCreator failed and will return null");
                    return null;
                }
                this.f30399c = a;
                this.f30398b = applicationContext;
            }
            this.f30397a.unlock();
            try {
                scz asInterface = scy.asInterface(qls.m32404a(this.f30399c.getClassLoader(), "com.google.android.gms.common.ui.SignInButtonCreatorChimeraImpl"));
                if (asInterface != null) {
                    return soo.mo25886a(asInterface, vzs.m41642a(new Context[]{this.f30399c, context}));
                }
                Log.e("SignInButtonProxy", "Failed to get the actual SignInButtonCreator.");
                return null;
            } catch (RemoteException e) {
                Log.e("SignInButtonProxy", "Failed to create SignInButton using dynamite package", e);
            }
        } finally {
            this.f30397a.unlock();
        }
    }

    public vzr newSignInButton(vzr vzr, int i, int i2) {
        return m22735a(vzr, new som(i, i2));
    }

    public vzr newSignInButtonFromConfig(vzr vzr, SignInButtonConfig signInButtonConfig) {
        return m22735a(vzr, new son(signInButtonConfig));
    }
}
