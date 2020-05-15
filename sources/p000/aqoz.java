package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Looper;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.api.Status;

/* renamed from: aqoz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqoz extends aaab {

    /* renamed from: a */
    private final Account f86458a;

    /* renamed from: b */
    private final int f86459b;

    /* renamed from: c */
    private final boolean f86460c;

    /* renamed from: d */
    private final String f86461d;

    /* renamed from: e */
    private final aqpc f86462e;

    public aqoz(aqpg aqpg, Account account, int i, boolean z, aqpc aqpc) {
        super(44, "SaveDefaultAccount");
        this.f86458a = account;
        this.f86459b = i;
        this.f86460c = z;
        String str = aqpg.f86480c;
        sdo.m34977c(str);
        this.f86461d = str;
        this.f86462e = aqpc;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        Object obj;
        aqpc aqpc = this.f86462e;
        Account account = this.f86458a;
        String str = this.f86461d;
        int i = this.f86459b;
        soz.m35788a(context, str, account);
        aqpc.f86468c.mo48019a(str, i);
        if (this.f86460c) {
            String str2 = this.f86458a.name;
            try {
                obj = svr.m36484b(context).mo26177b(this.f86461d);
            } catch (PackageManager.NameNotFoundException e) {
                obj = null;
            }
            if (obj == null) {
                obj = context.getString(C0126R.string.signin_unknown_app_name);
            }
            new adzt(Looper.getMainLooper()).post(new aqpb(context, context.getString(C0126R.string.signin_cross_client_auth_toast_text, obj, str2)));
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
    }
}
