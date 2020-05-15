package com.google.android.gms.wallet.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OrchestrationDelegatorChimeraActivity extends awce {

    /* renamed from: i */
    private awcd f109915i;

    /* renamed from: a */
    public static Intent m93799a(Context context, Intent intent, BuyFlowConfig buyFlowConfig) {
        sdo.m34959a(buyFlowConfig);
        sdo.m34959a(buyFlowConfig.f110418b);
        Intent intent2 = new Intent();
        intent2.setClassName(context, "com.google.android.gms.wallet.activity.OrchestrationDelegatorActivity");
        intent2.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig);
        intent2.putExtra("com.google.android.gms.wallet.account", buyFlowConfig.f110418b.f110407b);
        if (intent.getExtras() != null) {
            intent2.putExtras(intent.getExtras());
        }
        return intent2;
    }

    /* renamed from: b */
    public final void mo51870b(int i) {
        if (!this.f109915i.mo51857g()) {
            super.mo51870b(i);
        }
    }

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
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0077  */
    public final void onCreate(Bundle bundle) {
        char c;
        awcd awcd;
        String action = getIntent().getAction();
        sdo.m34966a((Object) action, (Object) "Intent action must not be null");
        Locale locale = Locale.US;
        new Object[1][0] = action;
        int hashCode = action.hashCode();
        if (hashCode != -361129170) {
            if (hashCode != 50241942) {
                if (hashCode == 1565825493 && action.equals("com.google.android.gms.wallet.firstparty.ACTION_WEB_VIEW_WIDGET")) {
                    c = 2;
                    if (c != 0) {
                        this.f109915i = new awjo(this);
                    } else if (c == 1) {
                        this.f109915i = new awnq(this);
                    } else if (c == 2) {
                        this.f109915i = new axdg(this);
                    }
                    awcd = this.f109915i;
                    if (awcd == null) {
                        awcd.mo51845a(bundle);
                        super.onCreate(bundle);
                        this.f109915i.mo51849b(bundle);
                        return;
                    }
                    throw new UnsupportedOperationException(String.format(Locale.US, "Unsupported intent action: %s", action));
                }
            } else if (action.equals("com.google.android.gms.wallet.firstparty.ACTION_INVOICE_SUMMARY")) {
                c = 1;
                if (c != 0) {
                }
                awcd = this.f109915i;
                if (awcd == null) {
                }
            }
        } else if (action.equals("com.google.android.gms.wallet.firstparty.ACTION_EMBEDDED_LANDING_PAGE")) {
            c = 0;
            if (c != 0) {
            }
            awcd = this.f109915i;
            if (awcd == null) {
            }
        }
        c = 65535;
        if (c != 0) {
        }
        awcd = this.f109915i;
        if (awcd == null) {
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        super.onDestroy();
        this.f109915i.mo51854f();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.f109915i.mo51847a(menuItem) || super.onOptionsItemSelected(menuItem);
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        this.f109915i.mo51852d();
    }

    /* access modifiers changed from: protected */
    public final void onRestart() {
        super.onRestart();
        this.f109915i.mo51843a();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        this.f109915i.mo51850c();
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f109915i.mo51851c(bundle);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        this.f109915i.mo51848b();
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        this.f109915i.mo51853e();
    }

    /* renamed from: a */
    public final void mo51864a(Parcelable parcelable, boolean z) {
        if (!this.f109915i.mo51856a(parcelable, z)) {
            super.mo51864a(parcelable, z);
        }
    }
}
