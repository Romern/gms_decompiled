package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: ahui */
public final /* synthetic */ class ahui implements Runnable {

    /* renamed from: a */
    private final Context f68088a;

    /* renamed from: b */
    private final buru f68089b;

    /* renamed from: c */
    private final ahyz f68090c;

    public ahui(Context context, buru buru, ahyz ahyz) {
        this.f68088a = context;
        this.f68089b = buru;
        this.f68090c = ahyz;
    }

    public final void run() {
        Account account;
        ahsu ahsu;
        Context context = this.f68088a;
        buru buru = this.f68089b;
        ahyz ahyz = this.f68090c;
        Iterator it = soz.m35801d(context, context.getPackageName()).iterator();
        while (true) {
            account = null;
            if (!it.hasNext()) {
                ahsu = null;
                break;
            }
            account = (Account) it.next();
            try {
                ahza a = ahur.m56666a((List) buru.mo73055a(account).get(), ahyz);
                if (a != null) {
                    try {
                        ahsu = new ahsu(context, (aiaa) GeneratedMessageLite.m124016a(aiaa.f68501K, a.f68445c.getKey(), bxus.m123744c()));
                        break;
                    } catch (bxwf e) {
                        ((bnsl) ahsd.f67925a.mo68388c()).mo68405a("FastPair: RemoveBond: parse item failed");
                    }
                } else {
                    continue;
                }
            } catch (InterruptedException | ExecutionException e2) {
                ((bnsl) ahsd.f67925a.mo68388c()).mo68405a("FastPair: RemoveBond: read footprints failed");
            }
        }
        String str = ahyz.f68428b;
        if (cfoj.m141550ae()) {
            ((ahyr) ahgz.m55754a(context, ahyr.class)).mo37304a(str);
        }
        if (account != null) {
            byte[] k = ahyz.f68429c.getKey();
            buru.mo73060a(account, k, bnzi.m110902d().mo68722a(bqce.m112562a(k, aynj.m84359a(str))).mo68740b());
            ahvb ahvb = new ahvb(context, ahsu, true);
            if (cfoj.m141534O()) {
                ahvb.mo37190a();
            }
            ((ahvf) ahgz.m55754a(context, ahvf.class)).mo37202b("android.bluetooth.device.action.ACL_DISCONNECTED", ahyz);
            int i = Build.VERSION.SDK_INT;
        }
        ahst ahst = (ahst) ahgz.m55754a(context, ahst.class);
        if (cfoj.f184966a.mo6606a().mo82052C() || account != null) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPair: RemoveBond: Remove device %s from local cache", str);
            ahst.mo37049c(str);
            if (cfoj.m141560j() && ahst.mo37044b(ahyz.f68437k) == 0) {
                ahzt.m56926a(context, ahyz.f68437k);
            }
            if (cfoj.m141526G()) {
                ((ahwk) ahgz.m55754a(context, ahwk.class)).mo37232a(ahyz.f68429c);
            }
        }
    }
}
