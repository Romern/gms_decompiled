package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: ahuj */
public final /* synthetic */ class ahuj implements Runnable {

    /* renamed from: a */
    private final Context f68091a;

    /* renamed from: b */
    private final buru f68092b;

    /* renamed from: c */
    private final List f68093c;

    public ahuj(Context context, buru buru, List list) {
        this.f68091a = context;
        this.f68092b = buru;
        this.f68093c = list;
    }

    public final void run() {
        int i;
        Context context = this.f68091a;
        buru buru = this.f68092b;
        List list = this.f68093c;
        bngs bngs = new bngs();
        for (Account account : soz.m35801d(context, context.getPackageName())) {
            try {
                busr busr = busr.f154819a;
                bngs.mo67666b((Iterable) ((List) bqdx.m112673a(buru.mo73069d(account).mo55925a(basa.f101652c), burn.f154777a, bqfb.INSTANCE).get()));
            } catch (InterruptedException | ExecutionException e) {
                ((bnsl) ahsd.f67925a.mo68388c()).mo68420a("FastPair: RemoveInvalidDevice: Read exception from account %s", account.name);
            }
        }
        bngx a = bngs.mo67664a();
        srn srn = ahsd.f67925a;
        a.size();
        if (!a.isEmpty()) {
            bngs bngs2 = new bngs();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ahyz ahyz = (ahyz) it.next();
                byte[] c = buru.m120323c(bnzi.m110902d().mo68722a(bqce.m112562a(ahyz.f68429c.mo73780k(), aynj.m84359a(ahyz.f68428b))).mo68740b());
                bnre i2 = a.listIterator();
                while (true) {
                    if (i2.hasNext()) {
                        if (Arrays.equals(((ahza) i2.next()).f68446d.mo73780k(), c)) {
                            bngs2.mo67668c(ahyz);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            bngx a2 = bngs2.mo67664a();
            ((bnsl) ahsd.f67925a.mo68390d()).mo68409a("FastPair: RemoveInvalidDevice: invalid device number=%s.", a2.size());
            int size = a2.size();
            for (i = 0; i < size; i++) {
                ahyz ahyz2 = (ahyz) a2.get(i);
                ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPair: RemoveInvalidDevice: Remove device %s by cloud sync", ahyz2.f68428b);
                context.startService(DiscoveryChimeraService.m67336a(context).setAction("com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_UNPAIR").putExtra("com.google.android.gms.nearby.discovery:EXTRA_PRIVATE_BLE_ADDRESS", ahyz2.f68428b).putExtra("com.google.android.gms.nearby.discovery.ACCOUNT_KEY", ahyz2.f68429c.mo73780k()));
            }
        }
    }
}
