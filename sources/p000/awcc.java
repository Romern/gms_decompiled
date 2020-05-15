package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.gms.wallet.activity.GenericDelegatorChimeraActivity;
import com.google.android.wallet.clientlog.LogContext;

/* renamed from: awcc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class awcc extends awcb {

    /* renamed from: a */
    public final GenericDelegatorChimeraActivity f94160a;

    /* renamed from: b */
    public LogContext f94161b;

    public awcc(GenericDelegatorChimeraActivity genericDelegatorChimeraActivity) {
        this.f94160a = genericDelegatorChimeraActivity;
    }

    /* renamed from: a */
    public static Intent m79593a(Context context, Intent intent, LogContext logContext) {
        Intent intent2 = new Intent();
        intent2.setClassName(context, "com.google.android.gms.wallet.activity.GenericDelegatorActivity");
        intent2.putExtra("logContext", logContext);
        if (intent.getExtras() != null) {
            intent2.putExtras(intent.getExtras());
        }
        return intent2;
    }

    /* renamed from: b */
    protected static Intent m79594b(Context context, Intent intent, LogContext logContext) {
        Intent a = m79593a(context, intent, logContext);
        a.setClassName(context, "com.google.android.gms.wallet.activity.GenericDelegatorInternalActivity");
        return a;
    }

    /* renamed from: c */
    public void mo51851c(Bundle bundle) {
        bundle.putParcelable("logContext", this.f94161b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo51855g() {
        return true;
    }

    /* renamed from: a */
    public void mo51845a(Bundle bundle) {
        if (bundle == null) {
            this.f94161b = (LogContext) this.f94160a.getIntent().getParcelableExtra("logContext");
        } else {
            this.f94161b = (LogContext) bundle.getParcelable("logContext");
        }
        if (this.f94161b != null) {
            bjst.m104516a(new awfj(this.f94160a.getApplicationContext(), awia.m79985a(this.f94160a)), this.f94161b.mo71783b());
        }
    }

    /* renamed from: b */
    public void mo51849b(Bundle bundle) {
        if (mo51855g()) {
            awcf.m79641a((dnx) this.f94160a);
        }
        awcf.m79640a((deu) this.f94160a);
    }

    /* renamed from: a */
    public final boolean mo51847a(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        this.f94160a.setResult(0);
        this.f94160a.finish();
        return true;
    }
}
