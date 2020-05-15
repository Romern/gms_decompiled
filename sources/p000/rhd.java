package p000;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;

/* renamed from: rhd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class rhd extends adcc {

    /* renamed from: b */
    private static final Logger f42974b = new Logger("CommonAccount", "DelegationActivity");

    /* renamed from: c */
    private String f42975c;

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract String mo17687e();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo17697g() {
        return true;
    }

    public final void onCreate(Bundle bundle) {
        String stringExtra;
        setTheme(2132017676);
        super.onCreate(bundle);
        boolean g = mo17697g();
        Intent intent = getIntent();
        String a = spn.m35852a((Activity) this);
        if (a == null) {
            f42974b.mo25416d("Unable to get caller identity", new Object[0]);
            a = null;
        } else if (g && !adbx.m50147a(this, a)) {
            f42974b.mo25416d("App was not signed by Google.", new Object[0]);
            a = null;
        } else if (bmwb.m108443a(a, getPackageName()) && (stringExtra = intent.getStringExtra("realClientPackage")) != null) {
            a = stringExtra;
        }
        this.f42975c = a;
        if (a != null) {
            String e = mo17687e();
            Intent intent2 = getIntent();
            Intent intent3 = new Intent();
            intent3.setClassName(this, e);
            intent3.replaceExtras(intent2.getExtras());
            intent3.putExtra("realClientPackage", this.f42975c);
            intent3.setFlags(33554432);
            startActivity(intent3);
            finish();
            return;
        }
        finish();
    }
}
