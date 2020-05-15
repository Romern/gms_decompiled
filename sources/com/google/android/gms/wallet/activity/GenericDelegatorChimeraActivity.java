package com.google.android.gms.wallet.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import java.util.Locale;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GenericDelegatorChimeraActivity extends deu {

    /* renamed from: b */
    private static final Set f109913b = sqw.m36040a("com.google.android.gms.wallet.ib.ACTION_GCORE_UPDATE_REQUIRED", "com.google.android.gms.wallet.firstparty.ACTION_VERIFY_PIN_ACTIVITY", "com.google.android.gms.wallet.firstparty.ACTION_ADD_INSTRUMENT_FROM_NOTIFICATION", "com.google.android.gms.firstparty.ACTION_BENDER3");

    /* renamed from: c */
    private awcb f109914c;

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo59777e() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (!this.f109914c.mo51846a(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        char c;
        String action = getIntent().getAction();
        sdo.m34966a((Object) action, (Object) "Intent action must not be null");
        if (f109913b.contains(action) && mo59777e()) {
            throw new SecurityException("This action can't be handled through an exported activity.");
        } else if (!f109913b.contains(action) && !mo59777e()) {
            throw new SecurityException("This action can't be handled through a non exported activity.");
        } else {
            switch (action.hashCode()) {
                case -1594089724:
                    if (action.equals("com.google.android.gms.wallet.firstparty.ACTION_ADD_INSTRUMENT_FROM_NOTIFICATION")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -762011845:
                    if (action.equals("com.google.android.gms.wallet.ib.ACTION_GCORE_UPDATE_REQUIRED")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -760491807:
                    if (action.equals("com.google.android.gms.wallet.firstparty.ACTION_VERIFY_PIN_ACTIVITY")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -261123784:
                    if (action.equals("com.google.android.gms.wallet.firstparty.ACTION_FILTER_ACTIVITY")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1039885492:
                    if (action.equals("com.google.android.gms.firstparty.ACTION_BENDER3")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                this.f109914c = new axar(this);
            } else if (c == 1) {
                this.f109914c = new axcz(this);
            } else if (c == 2) {
                this.f109914c = new awmg(this);
            } else if (c == 3) {
                this.f109914c = new awmz(this);
            } else if (c == 4) {
                this.f109914c = new awef(this);
            }
            awcb awcb = this.f109914c;
            if (awcb != null) {
                awcb.mo51845a(bundle);
                super.onCreate(bundle);
                this.f109914c.mo51849b(bundle);
                return;
            }
            throw new UnsupportedOperationException(String.format(Locale.US, "Unsupported intent action: %s", action));
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        super.onDestroy();
        this.f109914c.mo51854f();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.f109914c.mo51847a(menuItem) || super.onOptionsItemSelected(menuItem);
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        this.f109914c.mo51852d();
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f109914c.mo51844a(i, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    public final void onRestart() {
        super.onRestart();
        this.f109914c.mo51843a();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        this.f109914c.mo51850c();
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f109914c.mo51851c(bundle);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        this.f109914c.mo51848b();
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        this.f109914c.mo51853e();
    }
}
