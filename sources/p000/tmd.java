package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Process;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;

/* renamed from: tmd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tmd extends sbm {

    /* renamed from: a */
    public static dqa f46256a = dqa.f13805a;

    /* renamed from: b */
    public final Looper f46257b;

    /* renamed from: c */
    public final ContextManagerClientInfo f46258c;

    /* renamed from: d */
    public egk f46259d;

    /* renamed from: e */
    private egk f46260e;

    /* renamed from: a */
    public static Handler m37186a(Looper looper) {
        dqa dqa = f46256a;
        if (dqa == null) {
            return dqa.f13805a.mo9431a(looper);
        }
        return dqa.mo9431a(looper);
    }

    /* renamed from: n */
    private final egk m37187n() {
        if (this.f46260e == null) {
            this.f46260e = new egk(this.f46257b, tlu.f46246a);
        }
        return this.f46260e;
    }

    /* renamed from: H */
    public final boolean mo16778H() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.contextmanager.service.ContextManagerService.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.contextmanager.internal.IContextManagerService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12451000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Bundle mo12238f() {
        Bundle bundle = new Bundle();
        bundle.putByteArray("com.google.android.contextmanager.service.args", sef.m35074a(this.f46258c));
        return bundle;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tmd(Context context, Looper looper, sat sat, lri lri, rjz rjz, rka rka) {
        super(context, looper, 47, sat, rjz, rka);
        String str;
        ContextManagerClientInfo contextManagerClientInfo;
        Context context2 = context;
        lri lri2 = lri;
        this.f46257b = looper;
        Account account = sat.f43963a;
        if (account != null) {
            str = account.name;
        } else {
            str = "@@ContextManagerNullAccount@@";
        }
        if (lri2 == null) {
            contextManagerClientInfo = new ContextManagerClientInfo(str, context.getPackageName(), Process.myUid(), context.getPackageName(), sqr.m35996a(context2, context.getPackageName()), 3, null, null, -1, Process.myPid());
        } else {
            contextManagerClientInfo = ContextManagerClientInfo.m22890a(context2, str, lri2);
        }
        this.f46258c = contextManagerClientInfo;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextManagerService");
        if (queryLocalInterface instanceof tmr) {
            return (tmr) queryLocalInterface;
        }
        return new tmp(iBinder);
    }

    /* renamed from: a */
    public final void mo26652a(rlf rlf, ContextDataFilterImpl contextDataFilterImpl, tjc tjc, PendingIntent pendingIntent) {
        boolean z;
        tml tml;
        boolean z2 = true;
        if (tjc == null) {
            z = true;
        } else {
            z = false;
        }
        if (pendingIntent != null) {
            z2 = false;
        }
        sdo.m34970a(z2 ^ z);
        mo25288A();
        tmr tmr = (tmr) mo25289B();
        tmi a = tmi.m37203a(rlf, (tmc) null);
        ContextManagerClientInfo contextManagerClientInfo = this.f46258c;
        String str = contextManagerClientInfo.f30678b;
        String str2 = contextManagerClientInfo.f30677a;
        String str3 = contextManagerClientInfo.f30680d;
        if (tjc != null) {
            tml = (tml) m37187n().mo10090a(tjc);
        } else {
            tml = null;
        }
        tmr.mo9991a(a, str, str2, str3, contextDataFilterImpl, tml, pendingIntent);
    }

    /* renamed from: a */
    public final void mo26653a(rlf rlf, tjc tjc, PendingIntent pendingIntent) {
        boolean z;
        tlu tlu;
        boolean z2 = true;
        if (tjc == null) {
            z = true;
        } else {
            z = false;
        }
        if (pendingIntent != null) {
            z2 = false;
        }
        sdo.m34970a(z2 ^ z);
        mo25288A();
        if (tjc != null) {
            tlu tlu2 = (tlu) ((IInterface) m37187n().f14861a.remove(tjc));
            if (tlu2 != null) {
                tlu = tlu2;
            } else {
                rlf.mo9482a((Object) new Status(0));
                return;
            }
        } else {
            tlu = null;
        }
        tmi a = tmi.m37203a(rlf, new tmc(tlu));
        ContextManagerClientInfo contextManagerClientInfo = this.f46258c;
        ((tmr) mo25289B()).mo9995a(a, contextManagerClientInfo.f30678b, contextManagerClientInfo.f30677a, contextManagerClientInfo.f30680d, tlu, pendingIntent);
    }
}
