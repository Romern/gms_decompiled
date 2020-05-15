package p000;

import android.content.Context;
import android.os.RemoteException;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* renamed from: aptq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aptq {

    /* renamed from: b */
    private static aptq f84868b;

    /* renamed from: a */
    seu f84869a;

    /* renamed from: c */
    private final Object f84870c = new Object();

    /* renamed from: a */
    public static aptq m70987a() {
        if (f84868b == null) {
            f84868b = new aptq();
        }
        return f84868b;
    }

    /* renamed from: a */
    public final SSLSocketFactory mo47608a(Context context, TrustManager[] trustManagerArr, boolean z) {
        try {
            return (SSLSocketFactory) vzs.m41641a(mo47609a(context).newSocketFactory(vzs.m41642a(context), vzs.m41642a((Object) null), vzs.m41642a(trustManagerArr), z));
        } catch (RemoteException | vzt e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final seu mo47609a(Context context) {
        seu seu;
        synchronized (this.f84870c) {
            if (this.f84869a == null) {
                sdo.checkIfNull(context, "Context must not be null");
                try {
                    this.f84869a = set.asInterface(waq.m41676a(context, waq.f50354b, "providerinstaller").mo29007a("com.google.android.gms.common.net.SocketFactoryCreatorImplV2"));
                } catch (wam e) {
                    this.f84869a = (seu) new aptp().mo29000a(context);
                }
            }
            seu = this.f84869a;
        }
        return seu;
    }
}
