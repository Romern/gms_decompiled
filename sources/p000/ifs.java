package p000;

import android.accounts.Account;
import android.content.Context;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.authzen.gencode.server.api.DeviceClassifierEntity;
import com.google.android.gms.auth.authzen.gencode.server.api.ToggleEasyUnlockRequestEntity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: ifs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ifs extends ift {

    /* renamed from: c */
    private static final sek f20879c = new sek("ChangeEasyUnlockStateOperation");

    /* renamed from: a */
    private final boolean f20880a;

    /* renamed from: b */
    private final Account f20881b;

    /* renamed from: d */
    private final C1077iid f20882d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ifs(C1077iid iid, Account account, boolean z) {
        super("ChangeEasyUnlockState");
        long j = ifj.f20859a;
        this.f20881b = account;
        sdo.m34959a(iid);
        this.f20882d = iid;
        this.f20880a = z;
    }

    /* renamed from: c */
    private final String m15377c(Context context) {
        try {
            return sqd.m35970c(ifj.m15366a(context, this.f20881b).f10517b);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            throw new aaaj(8, e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f20882d.mo13039a(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo12978b(Context context) {
        C1077iid iid = this.f20882d;
        igx igx = new igx(context);
        ihz ihz = new ihz();
        ihz.f21042b = this.f20880a;
        ihz.f21044d.add(4);
        ihz.f21043c = m15377c(context);
        ihz.f21044d.add(7);
        ihz.f21041a = (DeviceClassifierEntity) igx.mo13002a();
        ihz.f21044d.add(3);
        ToggleEasyUnlockRequestEntity toggleEasyUnlockRequestEntity = new ToggleEasyUnlockRequestEntity(ihz.f21044d, false, ihz.f21041a, ihz.f21042b, null, false, ihz.f21043c);
        boolean z = true;
        try {
            String str = this.f20881b.name;
            int i = context.getApplicationInfo().uid;
            String packageName = context.getPackageName();
            ClientContext clientContext = new ClientContext(i, str, str, packageName, packageName);
            clientContext.mo17806d(igi.m15411b());
            ihm ihm = new ihm(new shj(context, igi.m15410a(), "cryptauth/v1/", false, true, null, null, 4098));
            ihm.f21028a.mo25539a(clientContext, 1, new StringBuilder("deviceSync/toggleeasyunlock").toString(), toggleEasyUnlockRequestEntity);
        } catch (VolleyError | gid e) {
            f20879c.mo25417e("Failed to make the API call to change EasyUnlock state.", e, new Object[0]);
            z = false;
        }
        iid.mo13039a(z);
    }
}
