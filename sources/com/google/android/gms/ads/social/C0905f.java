package com.google.android.gms.ads.social;

import android.accounts.Account;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.C0633h;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.ads.social.f */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0905f implements Callable {

    /* renamed from: a */
    final /* synthetic */ String f9477a;

    /* renamed from: b */
    final /* synthetic */ GmsDoritosProvider f9478b;

    public C0905f(GmsDoritosProvider gmsDoritosProvider, String str) {
        this.f9478b = gmsDoritosProvider;
        this.f9477a = str;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        this.f9478b.f9463c.mo7127a();
        GmsDoritosProvider gmsDoritosProvider = this.f9478b;
        String str = this.f9477a;
        String str2 = null;
        if (str != null) {
            try {
                if (svr.m36484b(gmsDoritosProvider.f9461a).mo26176b(str, 0) != null) {
                    C0904e eVar = this.f9478b.f9462b;
                    String a = eVar.mo7131a(this.f9477a);
                    if (a == null) {
                        Account[] a2 = eVar.f9475a.mo33916a("com.google");
                        if (a2.length > 0) {
                            a = a2[0].name;
                        } else {
                            a = null;
                        }
                    }
                    if (!TextUtils.isEmpty(a)) {
                        str2 = this.f9478b.f9464d.mo7123a(a);
                        if (TextUtils.isEmpty(str2)) {
                            C0633h.m5664a("DSID cookie not found. Running refresh task.");
                            this.f9478b.f9463c.mo7130d();
                            return this.f9478b.f9464d.mo7123a(a);
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        return str2;
    }
}
