package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.auth.api.accounttransfer.DeviceAuthInfo;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: gvb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gvb extends guz {

    /* renamed from: i */
    private static final sbw f19063i = new sbw("AccountTransfer", "[ATExportSetupBaseOperation]");

    public gvb(int i, guk guk, AccountTransferMsg accountTransferMsg, DeviceAuthInfo deviceAuthInfo, ArrayList arrayList) {
        super(i, guk, "ExportSetupAccountsOperation", accountTransferMsg, deviceAuthInfo, arrayList, 2);
    }

    /* renamed from: b */
    public final void mo12253b(Context context) {
        super.mo12253b(context);
        f19063i.mo25379d("Sending START_ACCOUNT_EXPORT broadcast");
        gty a = gty.m13895a();
        Map a2 = gub.m13906a().mo12225a(context);
        C1225nr<String> nrVar = new C1225nr();
        synchronized (a.f19010d) {
            a.mo12217a(context, 2);
            for (Map.Entry entry : a.f19011e.entrySet()) {
                if ("registered".equals(entry.getValue())) {
                    nrVar.add((String) entry.getKey());
                }
            }
        }
        for (String str : nrVar) {
            Intent intent = new Intent();
            intent.setAction("com.google.android.gms.auth.START_ACCOUNT_EXPORT");
            intent.setFlags(268435456);
            intent.setPackage((String) a2.get(str));
            intent.putExtra("key_extra_account_type", str);
            context.sendBroadcast(intent);
        }
        mo12252b();
    }
}
