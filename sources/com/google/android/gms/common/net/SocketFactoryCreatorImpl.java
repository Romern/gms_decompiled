package com.google.android.gms.common.net;

import android.content.Context;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SocketFactoryCreatorImpl extends set {

    /* renamed from: a */
    private seu f30284a;

    /* renamed from: b */
    private final Object f30285b = new Object();

    public seu getImplV2Instance(Context context) {
        seu seu;
        synchronized (this.f30285b) {
            if (this.f30284a == null) {
                try {
                    this.f30284a = set.asInterface(waq.m41676a(context, waq.f50354b, "providerinstaller").mo29007a("com.google.android.gms.common.net.SocketFactoryCreatorImplV2"));
                } catch (wam e) {
                    this.f30284a = new SocketFactoryCreatorImplV2();
                }
            }
            seu = this.f30284a;
        }
        return seu;
    }

    public vzr newSocketFactory(vzr vzr, vzr vzr2, vzr vzr3, boolean z) {
        return getImplV2Instance((Context) vzs.m41641a(vzr)).newSocketFactory(vzr, vzr2, vzr3, z);
    }

    public vzr newSocketFactoryWithCacheDir(vzr vzr, vzr vzr2, vzr vzr3, String str) {
        return getImplV2Instance((Context) vzs.m41641a(vzr)).newSocketFactoryWithCacheDir(vzr, vzr2, vzr3, str);
    }
}
