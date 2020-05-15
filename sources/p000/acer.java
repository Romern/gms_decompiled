package p000;

import android.accounts.Account;
import android.content.Context;
import android.util.Log;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: acer */
final /* synthetic */ class acer implements bmxj {

    /* renamed from: a */
    private final acev f59681a;

    public acer(acev acev) {
        this.f59681a = acev;
    }

    public final Object apply(Object obj) {
        bmzi bmzi;
        acev acev = this.f59681a;
        List<Account> list = (List) obj;
        if (list == null) {
            Log.e("AppsUpload", "Missing accounts list.");
            return null;
        }
        synchronized (acev.f59690e) {
            HashSet hashSet = new HashSet(acev.f59690e.keySet());
            for (Account account : list) {
                if (!acev.f59690e.containsKey(account)) {
                    try {
                        Map map = acev.f59690e;
                        aceo aceo = acev.f59689d;
                        String b = aytd.m84776b(account.name, (String) acev.f59686a.mo16713a());
                        if (b != null) {
                            byte[] bytes = b.getBytes(bmwy.f131158c);
                            baso baso = aceo.f59673g;
                            cayo cayo = aceo.f59668b;
                            Executor executor = aceo.f59669c;
                            if (!((Boolean) aceo.f59670d.mo6606a()).booleanValue()) {
                                Context context = aceo.f59667a;
                                auzx auzx = new auzx();
                                auzx.f92843a = account;
                                bmzi = new acft(new rjx(context, auzx.mo51097a()));
                            } else {
                                bmzi = new acfq(aceo.f59669c, aceo.f59673g, account, aceo.f59671e);
                            }
                            map.put(account, new acen(bytes, account, baso, cayo, executor, bmzi, aceo.f59672f));
                        } else {
                            throw new acet();
                        }
                    } catch (Exception e) {
                        throw new acet(e);
                    } catch (acet e2) {
                        ((bads) acev.f59687b.mo16713a()).mo32743a(12005);
                        Log.e("AppsUpload", "Failed to calculate instance ID", e2);
                    }
                } else {
                    hashSet.remove(account);
                }
            }
            acev.f59690e.keySet().removeAll(hashSet);
        }
        return null;
    }
}
