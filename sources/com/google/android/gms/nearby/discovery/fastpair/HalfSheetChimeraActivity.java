package com.google.android.gms.nearby.discovery.fastpair;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.support.p002v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class HalfSheetChimeraActivity extends deu {

    /* renamed from: b */
    private ahyw f80496b;

    /* renamed from: c */
    private ahyn f80497c;

    /* renamed from: g */
    private final void m67325g() {
        ahhd.m55768a(this, new Intent("com.google.android.gms.nearby.ACTION_FAST_PAIR_HALF_SHEET_CANCEL").putExtra("com.google.android.gms.nearby.discovery.fastpair.halfsheet:MODEL_ID", this.f80496b.f68393b));
    }

    /* renamed from: e */
    public final void mo44194e() {
        m67325g();
        finish();
    }

    public final void onBackPressed() {
        super.onBackPressed();
        m67325g();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a1  */
    public final void onCreate(Bundle bundle) {
        ahym ahym;
        super.onCreate(bundle);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("com.google.android.gms.nearby.discovery.HALF_SHEET");
        String stringExtra = getIntent().getStringExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_TYPE");
        if (!cfoj.m141525F() || byteArrayExtra == null || stringExtra == null) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("HalfSheetActivity: exit flag off or do not have enough half sheet information.");
            finish();
            return;
        }
        if (((stringExtra.hashCode() == -1067344449 && stringExtra.equals("DEVICE_PAIRING")) ? (char) 0 : 65535) != 0) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("HalfSheetActivity: there is no valid type for half sheet");
            finish();
            return;
        }
        Intent intent = getIntent();
        Bundle bundle2 = new Bundle();
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("com.google.android.gms.nearby.discovery.HALF_SHEET");
        boolean booleanExtra = intent.getBooleanExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_IS_RETROACTIVE", false);
        srn srn = ahsd.f67925a;
        if (booleanExtra) {
            Intent intent2 = (Intent) intent.getParcelableExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_CLOUD_SYNC_INTENT");
            String stringExtra2 = intent.getStringExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_ACCOUNT_NAME");
            if (intent2 == null || stringExtra2 == null) {
                ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("HalfSheetActivity: retroactive pair does not have required info");
                ahym = null;
                this.f80497c = ahym;
                if (ahym == null) {
                    ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("HalfSheetActivity: device pairing fragment has error.");
                    finish();
                }
                getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.fragment_container, this.f80497c).addToBackStack(null).commit();
                setContentView((int) C0126R.C0128layout.fast_pair_half_sheet);
                mo8626a((Toolbar) findViewById(C0126R.C0129id.toolbar));
                mo8628aW().mo15858c(false);
                mo8628aW().mo15853b(false);
                findViewById(C0126R.C0129id.background).setOnClickListener(new ahvh(this));
                this.f80496b = (ahyw) GeneratedMessageLite.m124016a(ahyw.f68389A, byteArrayExtra, bxus.m123744c());
            }
            bundle2.putParcelable("com.google.android.gms.nearby.discovery.HALF_SHEET_CLOUD_SYNC_INTENT", intent2);
            bundle2.putString("com.google.android.gms.nearby.discovery.HALF_SHEET_ACCOUNT_NAME", stringExtra2);
        }
        bundle2.putByteArray("com.google.android.gms.nearby.discovery.HALF_SHEET", byteArrayExtra2);
        bundle2.putBoolean("com.google.android.gms.nearby.discovery.HALF_SHEET_IS_RETROACTIVE", booleanExtra);
        ahym = new ahym();
        ahym.setArguments(bundle2);
        this.f80497c = ahym;
        if (ahym == null) {
        }
        getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.fragment_container, this.f80497c).addToBackStack(null).commit();
        setContentView((int) C0126R.C0128layout.fast_pair_half_sheet);
        mo8626a((Toolbar) findViewById(C0126R.C0129id.toolbar));
        mo8628aW().mo15858c(false);
        mo8628aW().mo15853b(false);
        findViewById(C0126R.C0129id.background).setOnClickListener(new ahvh(this));
        try {
            this.f80496b = (ahyw) GeneratedMessageLite.m124016a(ahyw.f68389A, byteArrayExtra, bxus.m123744c());
        } catch (bxwf e) {
            bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68405a("HalfSheetActivity: error happens when pass info to half sheet");
        }
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0126R.C0130menu.halfsheet_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public final boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem findItem = menu.findItem(C0126R.C0129id.avatar);
        List d = soz.m35801d(this, getPackageName());
        if (d.isEmpty()) {
            findItem.setVisible(false);
            return false;
        }
        Account account = (Account) d.get(0);
        findItem.setVisible(true);
        findItem.setTitle(account.name);
        allp allp = new allp();
        allp.f73626a = 80;
        allq a = allp.mo40491a();
        if (ahvd.f68151a == null) {
            ahvd.f68151a = allr.m61234a(this, a);
        }
        aucu.m76780a(new soc(1, 9), new ahvc(account, this)).mo50373a(new ahvi(findItem));
        return super.onPrepareOptionsMenu(menu);
    }

    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        ((TextView) findViewById(C0126R.C0129id.toolbar_title)).setText(charSequence);
    }
}
