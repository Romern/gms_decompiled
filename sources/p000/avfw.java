package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.util.SparseBooleanArray;
import java.util.Set;

/* renamed from: avfw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avfw {

    /* renamed from: a */
    private final Context f93113a;

    public avfw(Context context) {
        this.f93113a = context;
    }

    /* renamed from: a */
    public final void mo51198a(Account account) {
        this.f93113a.sendBroadcast(new Intent("com.google.android.gms.udc.action.FACS_CACHE_UPDATED"));
        for (String str : bmyx.m108640a(',').mo66917a().mo66925c((CharSequence) chbh.f188248a.mo6606a().mo84961u())) {
            String str2 = account.name;
            if (rfz.m33557a(this.f93113a).mo24610b(str)) {
                this.f93113a.sendBroadcast(new Intent("com.google.android.gms.udc.action.FACS_CACHE_UPDATED_EXPLICIT").setPackage(str).putExtra("com.google.android.gms.udc.extra.facsCacheAccountName", str2));
            }
        }
    }

    /* renamed from: a */
    public final void mo51199a(Account account, bxpe bxpe, auzj auzj) {
        int a;
        if (chbh.m148017o()) {
            if ((chbh.m148011i() || chbh.m148012j() || !sre.m36079a()) && chbh.m148015m() && (auzj != null || chbh.m148011i())) {
                Set b = sqw.m36045b();
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                if (auzj != null) {
                    bxpe bxpe2 = auzj.f92830b;
                    if (bxpe2 == null) {
                        bxpe2 = bxpe.f164247d;
                    }
                    bxwc bxwc = bxpe2.f164250b;
                    int size = bxwc.size();
                    for (int i = 0; i < size; i++) {
                        bxpd bxpd = (bxpd) bxwc.get(i);
                        sparseBooleanArray.put(bxpd.f164243b, bxpd.f164244c);
                    }
                }
                SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
                if (auzj != null) {
                    bxpe bxpe3 = auzj.f92830b;
                    if (bxpe3 == null) {
                        bxpe3 = bxpe.f164247d;
                    }
                    bxwc bxwc2 = bxpe3.f164250b;
                    int size2 = bxwc2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        bxpd bxpd2 = (bxpd) bxwc2.get(i2);
                        sparseBooleanArray2.put(bxpd2.f164243b, bxpd2.f164245d);
                    }
                }
                Set a2 = avjj.m78611a();
                bxwc bxwc3 = bxpe.f164250b;
                int size3 = bxwc3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    bxpd bxpd3 = (bxpd) bxwc3.get(i3);
                    if (!((sparseBooleanArray.indexOfKey(bxpd3.f164243b) >= 0 && sparseBooleanArray.get(bxpd3.f164243b) == bxpd3.f164244c && sparseBooleanArray2.get(bxpd3.f164243b) == bxpd3.f164245d) || (a = avjl.m78613a(bxpd3.f164243b)) == 0)) {
                        Integer valueOf = Integer.valueOf(a);
                        if (!a2.contains(valueOf)) {
                            b.add(valueOf);
                        }
                    }
                }
                if (!b.isEmpty()) {
                    sbv.m34875a(this.f93113a, account.name, sqc.m35960a(b));
                }
            }
            if (auzj != null) {
                bxpe bxpe4 = auzj.f92830b;
                if (bxpe4 == null) {
                    bxpe4 = bxpe.f164247d;
                }
                if (bxpe.equals(bxpe4)) {
                    return;
                }
            }
            mo51198a(account);
        }
    }
}
