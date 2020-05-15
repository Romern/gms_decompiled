package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.util.List;

/* renamed from: fpv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class fpv extends qkh implements suh, rjz, rka {

    /* renamed from: b */
    public txg f17110b;

    /* renamed from: c */
    public sui f17111c;

    /* renamed from: d */
    private rkb f17112d;

    static {
        Scope scope = twn.f46755a;
    }

    /* renamed from: a */
    public static Intent m12148a(Context context) {
        return new Intent().setClassName(context, "com.google.android.gms.app.settings.DataManagementActivity");
    }

    /* renamed from: e */
    public final void mo11116e() {
        int i;
        int a = this.f17110b.mo18217a();
        sui sui = this.f17111c;
        if (a != 2) {
            i = C0126R.string.core_drive_network_usage_all;
        } else {
            i = C0126R.string.core_drive_network_usage_wifi;
        }
        sui.mo26107d(i);
    }

    /* renamed from: g */
    public final void mo11117g() {
        Toast.makeText(this, (int) C0126R.string.core_drive_settings_save_failed_toast, 0).show();
    }

    /* renamed from: i */
    public final void mo7107i() {
    }

    public final boolean onContextItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == C0126R.C0129id.core_drive_network_usage_all) {
            m12149a(false);
        } else if (itemId != C0126R.C0129id.core_drive_network_usage_wifi) {
            return super.onContextItemSelected(menuItem);
        } else {
            m12149a(true);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = Build.VERSION.SDK_INT;
        if (mo8628aW() != null) {
            mo8628aW().mo15853b(true);
        }
        List d = soz.m35801d(this, getPackageName());
        if (d.size() > 0) {
            String str = ((Account) d.get(0)).name;
            rjy rjy = new rjy(this);
            rjo rjo = twn.f46758d;
            twl twl = new twl();
            twl.f46753a.putBoolean("bypass_initial_sync", true);
            rjy.mo24780a(rjo, twl.mo26841a());
            rjy.mo24777a(twn.f46755a);
            rjy.mo24777a(twn.f46756b);
            rjy.mo24778a(str);
            rjy.mo24775a(this, 0, this);
            rjy.mo24781a((rjz) this);
            this.f17112d = rjy.mo24784b();
        }
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        getMenuInflater().inflate(C0126R.C0130menu.core_network_drive, contextMenu);
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0126R.C0130menu.core_data_management_settings_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != C0126R.C0129id.settings_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        GoogleHelp a = GoogleHelp.m66336a("android_main");
        a.mo43195a(this);
        a.f78776s = sjx.m35499a(this);
        new aarh(this).mo31646a(a.mo43194a());
        return true;
    }

    /* renamed from: a */
    private final void m12149a(boolean z) {
        int i;
        txg txg = this.f17110b;
        if (!z) {
            i = 1;
        } else {
            i = 2;
        }
        if (txg.mo18217a() != i) {
            txi txi = new txi(this.f17110b);
            txi.f46910b = i;
            this.f17110b = txi.mo26871a();
            mo11116e();
            rkb rkb = this.f17112d;
            rkb.mo24795b(new uru(rkb, this.f17110b)).mo9458a((rkl) new fpt(this, txg));
        }
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        rkb rkb = this.f17112d;
        rkb.mo24795b(new use(rkb)).mo9458a((rkl) new fpu(this));
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
        this.f17111c.mo26104a(false);
    }

    /* renamed from: a */
    public final void mo7099a(View view, sui sui) {
        if (!this.f17112d.mo24805i()) {
            mo11117g();
            return;
        }
        registerForContextMenu(view);
        openContextMenu(view);
        unregisterForContextMenu(view);
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        this.f17111c.mo26104a(false);
        rfi.f42868a.mo24579a(getContainerActivity(), connectionResult.f30065c, 0).show();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7102a(sug sug, Bundle bundle) {
        if (!this.f41602h) {
            this.f41602h = true;
            this.f41603i = qkh.m32281a(this, getPackageName(), "com.google");
            qkh.m32281a(this, getPackageName(), "cn.google");
        }
        if (this.f41603i) {
            sui b = qkh.m32282b(this);
            this.f17111c = b;
            b.mo26106c(C0126R.string.core_drive_network_usage);
            this.f17111c.mo26104a(false);
            this.f17111c.mo26102a(this);
            ((svi) sug).f45221a.mo26149a(this.f17111c);
        }
    }
}
