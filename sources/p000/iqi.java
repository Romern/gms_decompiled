package p000;

import android.accounts.Account;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: iqi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iqi {

    /* renamed from: a */
    private static final Logger f21562a = new Logger(new String[]{"DeviceSyncUpdater"}, (byte[]) null);

    /* renamed from: b */
    private final Context f21563b;

    /* renamed from: c */
    private final ipw f21564c;

    public iqi(Context context) {
        ipw ipw = new ipw(context);
        this.f21563b = context;
        this.f21564c = ipw;
    }

    /* renamed from: a */
    public final boolean mo13260a(Account account, String str, String str2) {
        bngx bngx;
        ipv a = this.f21564c.mo13238a();
        try {
            Map a2 = a.mo13232a(str);
            a.close();
            List list = (List) a2.get(account.name);
            if (list == null || list.isEmpty()) {
                bngx = bngx.m109376e();
            } else {
                ArrayList arrayList = new ArrayList();
                bxwc bxwc = ((bqlc) list.get(0)).f141080b;
                int size = bxwc.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(((bqlb) bxwc.get(i)).f141074a);
                }
                bngx = bngx.m109368a((Collection) arrayList);
            }
            if (bngx.isEmpty()) {
                f21562a.mo25416d("Tried to initiate sync with no previous features synced", new Object[0]);
                return true;
            }
            Context context = this.f21563b;
            iqb a3 = iqa.m15886a(context, account, isr.m16057a(context, 0, 3));
            byte[] a4 = new ipy(this.f21563b, account.name).mo13245a(str);
            if (a4 == null) {
                f21562a.mo25416d("Tried to initiate sync with no previous metadata synced", new Object[0]);
                return true;
            }
            boolean a5 = iqe.m15892a(this.f21563b, a3).mo13258a(account, str, a4, bngx, 0, str2);
            a3.mo13254a();
            if (!a5) {
                iqg.m15898a(this.f21563b).mo13259a(account);
            }
            return a5;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
