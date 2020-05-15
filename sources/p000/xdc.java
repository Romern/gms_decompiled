package p000;

import android.accounts.Account;
import android.content.Context;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.credentialstore.KeyData;
import java.security.KeyPair;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

/* renamed from: xdc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xdc extends aaab {

    /* renamed from: b */
    public static final Logger f51982b = new Logger(new String[]{"ListKeysOperation"}, (short[]) null);

    /* renamed from: d */
    private static final bngx f51983d = bngx.m109361a("fido:hardware_protected_uv", "fido:software_optional_uv", "fido:strongbox_protected_up", "fido:android_software_key", "fido:android_strong_auth_key", "fido:android_strongbox_key");

    /* renamed from: a */
    public final xde f51984a = new xde(rpr.m34216b());

    /* renamed from: c */
    public final xmz f51985c;

    /* renamed from: e */
    private final String f51986e;

    /* renamed from: f */
    private final xcm f51987f = ((xcm) xcm.f51937d.mo33309a());

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    public xdc(xmz xmz, String str) {
        super(BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE, "ListKeys");
        sdo.m34969a(str, (Object) "rpId cannot be empty");
        this.f51986e = str;
        this.f51985c = xmz;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: adax.a(bngx, bmxj):bqgg
     arg types: [bngx, xcy]
     candidates:
      adax.a(bqgg, java.lang.Object):bqgg
      adax.a(java.lang.Iterable, bmxj):bqgg
      adax.a(bngx, bmxj):bqgg */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        bqgg bqgg;
        bmxv bmxv;
        PublicKey publicKey;
        Logger Logger = f51982b;
        String valueOf = String.valueOf(this.f51986e);
        Logger.mo25412b(valueOf.length() == 0 ? new String("listKeys with rpId ") : "listKeys with rpId ".concat(valueOf), new Object[0]);
        ArrayList arrayList = new ArrayList();
        try {
            for (xcl xcl : this.f51987f.mo29636b(this.f51986e)) {
                KeyPair keyPair = xcl.f51931c;
                if (keyPair != null) {
                    publicKey = keyPair.getPublic();
                } else {
                    new xde(rpr.m34216b());
                    try {
                        publicKey = xde.m42697c(xcl.f51929a);
                    } catch (adbe e) {
                        f51982b.mo25415d("Unable to get the public key.", e, new Object[0]);
                        bmxv = bmvz.f131120a;
                    }
                }
                if (publicKey != null) {
                    xcv xcv = new xcv(xcl.f51929a, publicKey);
                    xmq xmq = xcv.f51972a;
                    xmq xmq2 = xmq.KEYSTORE;
                    int ordinal = xmq.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            bmxv = xcl.f51931c != null ? bmxv.m108566b(KeyData.m23438a(xcv.mo29646b(), xcl.f51931c, xcv.mo29645a(), xcl.f51932d, xcl.f51933e)) : bmvz.f131120a;
                        } else if (ordinal != 2) {
                            bmxv = bmvz.f131120a;
                        }
                    }
                    bmxv = bmxv.m108566b(KeyData.m23437a(xmq.f52779d, xcv.mo29646b(), xcv.mo29645a(), xcl.f51932d, xcl.f51933e));
                } else {
                    bmxv = bmvz.f131120a;
                }
                if (bmxv.mo66813a()) {
                    arrayList.add((KeyData) bmxv.mo66814b());
                }
            }
            if (!this.f51986e.equals("google.com")) {
                bqgg = bqga.m112775a((Object) arrayList);
            } else {
                ios a = inl.m15759a(rpr.m34216b());
                Account[] b = adyd.m51363a(rpr.m34216b()).mo33922b();
                bngs j = bngx.m109377j();
                for (Account account : b) {
                    bnre i = f51983d.listIterator();
                    while (i.hasNext()) {
                        j.mo67668c(bqdf.m112619a(adax.m50092a(adbb.m50100a(a.mo13186b((String) i.next(), account))), iot.class, xcx.f51977a, bqfb.INSTANCE));
                    }
                }
                bqgg = bqdx.m112673a(adax.m50091a(j.mo67664a(), (bmxj) new xcy(this)), new xcw(arrayList), bqfb.INSTANCE);
            }
        } catch (adbe e2) {
            bqgg = bqga.m112777a((Throwable) e2);
        }
        bqga.m112781a(bqgg, new xdb(this), bqfb.INSTANCE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f51985c.mo29956a(status, (List) null);
    }
}
