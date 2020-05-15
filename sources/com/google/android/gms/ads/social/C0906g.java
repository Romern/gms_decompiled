package com.google.android.gms.ads.social;

import android.accounts.Account;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.util.client.C0633h;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.ads.social.g */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0906g implements Callable {

    /* renamed from: a */
    final /* synthetic */ String f9479a;

    /* renamed from: b */
    final /* synthetic */ GmsDoritosProvider f9480b;

    public C0906g(GmsDoritosProvider gmsDoritosProvider, String str) {
        this.f9480b = gmsDoritosProvider;
        this.f9479a = str;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        this.f9480b.f9463c.mo7127a();
        Account[] a = this.f9480b.f9462b.mo7132a();
        String a2 = this.f9480b.f9462b.mo7131a(this.f9479a);
        ArrayList arrayList = new ArrayList();
        if (((Boolean) C0371o.f8215aB.mo6604a()).booleanValue() && this.f9480b.f9464d.mo7124a(a)) {
            C0633h.m5670c("D task.");
            this.f9480b.f9463c.mo7130d();
        }
        for (Account account : a) {
            if (!TextUtils.isEmpty(account.name)) {
                String a3 = this.f9480b.f9464d.mo7123a(account.name);
                if (!TextUtils.isEmpty(a3)) {
                    bxvd da = bqkf.f140977e.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bqkf bqkf = (bqkf) da.f164949b;
                    a3.getClass();
                    bqkf.f140979a |= 1;
                    bqkf.f140980b = a3;
                    if (account.name.equals(a2)) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bqkf bqkf2 = (bqkf) da.f164949b;
                        bqkf2.f140979a |= 2;
                        bqkf2.f140981c = true;
                    }
                    arrayList.add((bqkf) da.mo74062i());
                }
            }
        }
        if (arrayList.size() > 0) {
            bqkf bqkf3 = (bqkf) arrayList.get(0);
            bxvd bxvd = (bxvd) bqkf3.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) bqkf3);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bqkf bqkf4 = (bqkf) bxvd.f164949b;
            bqkf bqkf5 = bqkf.f140977e;
            bqkf4.f140979a |= 4;
            bqkf4.f140982d = true;
            arrayList.set(0, (bqkf) bxvd.mo74062i());
        }
        bxvd da2 = bqkg.f140983b.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bqkg bqkg = (bqkg) da2.f164949b;
        if (!bqkg.f140985a.mo73666a()) {
            bqkg.f140985a = GeneratedMessageLite.m124021a(bqkg.f140985a);
        }
        bxsy.m123078a(arrayList, bqkg.f140985a);
        return Base64.encodeToString(((bqkg) da2.mo74062i()).mo73642k(), 10);
    }
}
