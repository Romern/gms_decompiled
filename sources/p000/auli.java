package p000;

import android.os.Bundle;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;

/* renamed from: auli */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class auli extends aulb implements aukq {
    /* renamed from: a */
    public final void mo50621a() {
        mo50650e();
        finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo50650e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract int mo50651f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract String mo50652g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract String mo50653h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract String mo50654i();

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("gms.trustagent.TrustAgentOnBoardingActivity.Fragment");
        if (findFragmentByTag == null) {
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            aukp aukp = new aukp();
            aukp.mo50617a(mo50651f());
            aukp.mo50620c(mo50652g());
            aukp.mo50619b(mo50653h());
            aukp.mo50618a(mo50654i());
            beginTransaction.add(16908290, aukp.mo50616a(), "gms.trustagent.TrustAgentOnBoardingActivity.Fragment").commit();
        } else {
            supportFragmentManager.beginTransaction().show(findFragmentByTag).commit();
        }
        getSupportFragmentManager().executePendingTransactions();
    }
}
