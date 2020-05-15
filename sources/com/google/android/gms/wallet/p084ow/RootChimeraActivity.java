package com.google.android.gms.wallet.p084ow;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.wallet.analytics.events.CreateWalletObjectsEvent;
import com.google.android.gms.wallet.common.p079ui.AccountSelector;
import com.google.android.gms.wallet.common.p079ui.ButtonBar;
import com.google.android.gms.wallet.common.p079ui.TopBarView;
import com.google.android.gms.wallet.service.p087ow.CreateWalletObjectsServiceRequest;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: com.google.android.gms.wallet.ow.RootChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RootChimeraActivity extends deu implements View.OnClickListener, awhd, bkcy, awgq, awcl {

    /* renamed from: b */
    public static final String f110284b = awhg.m79946a("createWalletObjects");

    /* renamed from: c */
    public boolean f110285c;

    /* renamed from: d */
    public boolean f110286d;

    /* renamed from: e */
    public ButtonBar f110287e;

    /* renamed from: f */
    public View f110288f;

    /* renamed from: g */
    public View f110289g;

    /* renamed from: h */
    public TopBarView f110290h;

    /* renamed from: i */
    public Account f110291i;

    /* renamed from: j */
    rjx f110292j;

    /* renamed from: k */
    private bkcz f110293k;

    /* renamed from: l */
    private String f110294l;

    /* renamed from: m */
    private String f110295m;

    /* renamed from: n */
    private String f110296n;

    /* renamed from: o */
    private btro f110297o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f110298p;

    /* renamed from: q */
    private int f110299q = -1;

    /* renamed from: r */
    private boolean f110300r;

    /* renamed from: s */
    private BuyFlowConfig f110301s;

    /* renamed from: t */
    private HashSet f110302t;

    /* renamed from: u */
    private final awpc f110303u = new awnx(this);

    /* renamed from: a */
    public static Intent m94054a(Context context, Intent intent, BuyFlowConfig buyFlowConfig) {
        sdo.m34959a(buyFlowConfig);
        sdo.m34959a(buyFlowConfig.f110418b);
        Intent intent2 = new Intent();
        intent2.setClassName(context, "com.google.android.gms.wallet.ow.RootActivity");
        intent2.putExtras(intent.getExtras());
        intent2.putExtra("buyFlowConfig", buyFlowConfig);
        return intent2;
    }

    /* renamed from: j */
    private final void m94056j() {
        if (awyf.m81495a(this)) {
            if (!this.f110302t.contains(this.f110291i)) {
                this.f110302t.add(this.f110291i);
                getSupportFragmentManager().beginTransaction().add(awhf.m79933a(this.f110291i, awyd.m81489a(this.f110301s.f110418b)), "RetrieveAuthTokensFragment").commit();
            }
            if (this.f110286d) {
                this.f110289g.setVisibility(8);
                this.f110288f.setVisibility(0);
                m94057k();
                return;
            }
            return;
        }
        mo59956g();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: k */
    private final void m94057k() {
        this.f110298p = true;
        m94062p();
        awpb awpb = m94059m().f94357a;
        btro btro = this.f110297o;
        awou awou = (awou) awpb;
        sdo.m34971a(awou.mo52430e(), (Object) "Must specify connection to OwIntService!");
        if (!awou.mo52425a(btro)) {
            Message.obtain(awou.f94784u, 18, new CreateWalletObjectsServiceRequest(awou.f94765b, btro)).sendToTarget();
        }
    }

    /* renamed from: l */
    private final void m94058l() {
        if (m94059m() != null) {
            Log.e("RootChimeraActivity", "Creating a new TransactionRetainerFragment when one already exists.");
        }
        getSupportFragmentManager().beginTransaction().add(awhg.m79945a(2, this.f110301s, this.f110291i), f110284b).commit();
        getSupportFragmentManager().executePendingTransactions();
    }

    /* renamed from: m */
    private final awhg m94059m() {
        return (awhg) getSupportFragmentManager().findFragmentByTag(f110284b);
    }

    /* renamed from: n */
    private final void m94060n() {
        if (m94059m() != null && !this.f110300r) {
            this.f110300r = true;
            m94059m().f94357a.mo52397a(this.f110303u, this.f110299q);
            this.f110299q = -1;
        }
    }

    /* renamed from: o */
    private final void m94061o() {
        if (this.f110299q < 0 && m94059m() != null) {
            this.f110300r = false;
            this.f110299q = m94059m().f94357a.mo52395a(this.f110303u);
        }
    }

    /* renamed from: p */
    private final void m94062p() {
        this.f110287e.mo59847a(!this.f110298p);
        this.f110290h.mo59894a(!this.f110298p);
    }

    /* renamed from: q */
    private final void m94063q() {
        bxvd da = bphk.f137655g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bphk bphk = (bphk) da.f164949b;
        bphk.f137658b = 3;
        bphk.f137657a |= 1;
        String stringExtra = getIntent().getStringExtra("com.google.android.gms.wallet.WOBS_ISSUER_NAME");
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bphk bphk2 = (bphk) da.f164949b;
        stringExtra.getClass();
        bphk2.f137657a |= 2;
        bphk2.f137659c = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("com.google.android.gms.wallet.EXTRA_WOBS_ISSUER_CLASS_ID");
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bphk bphk3 = (bphk) da.f164949b;
        stringExtra2.getClass();
        int i = bphk3.f137657a | 4;
        bphk3.f137657a = i;
        bphk3.f137660d = stringExtra2;
        bphk3.f137661e = 1;
        int i2 = i | 8;
        bphk3.f137657a = i2;
        bphk3.f137662f = 0;
        bphk3.f137657a = i2 | 16;
        CreateWalletObjectsEvent.m93806a(this, this.f110301s, (bphk) da.mo74062i());
        mo59953a(0, (Intent) null);
    }

    /* renamed from: b */
    public final void mo59954b(int i) {
        int i2;
        bxvd da = bphk.f137655g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bphk bphk = (bphk) da.f164949b;
        bphk.f137658b = i - 1;
        int i3 = bphk.f137657a | 1;
        bphk.f137657a = i3;
        String str = this.f110295m;
        str.getClass();
        int i4 = 2;
        int i5 = i3 | 2;
        bphk.f137657a = i5;
        bphk.f137659c = str;
        String str2 = this.f110294l;
        str2.getClass();
        bphk.f137657a = i5 | 4;
        bphk.f137660d = str2;
        if (getIntent().getIntExtra("com.google.android.gms.wallet.EXTRA_CREATE_MODE", 0) == 1) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bphk bphk2 = (bphk) da.f164949b;
        bphk2.f137661e = i2 - 1;
        int i6 = bphk2.f137657a | 8;
        bphk2.f137657a = i6;
        if (i == 2) {
            if (this.f110286d) {
                i4 = 3;
            }
            bphk2.f137662f = i4 - 1;
            bphk2.f137657a = i6 | 16;
        }
        CreateWalletObjectsEvent.m93806a(this, this.f110301s, (bphk) da.mo74062i());
    }

    /* renamed from: cn */
    public final Account mo51878cn() {
        return this.f110291i;
    }

    /* renamed from: d */
    public final void mo52162d(int i) {
        if (i != 3) {
            mo59952a(411);
        } else {
            mo59952a(7);
        }
    }

    /* renamed from: e */
    public final void mo59955e() {
        awgk[] awgkArr;
        awgq awgq;
        if (!this.f110298p) {
            this.f110288f.setVisibility(8);
            this.f110289g.setVisibility(0);
        }
        if (this.f110291i == null) {
            Account account = this.f110301s.f110418b.f110407b;
            this.f110291i = account;
            this.f110290h.mo59893a(account);
        }
        TopBarView topBarView = this.f110290h;
        AccountSelector accountSelector = topBarView.f110126a;
        if (accountSelector != null) {
            awec.m79679a();
            Account[] a = awec.m79681a(topBarView.getContext());
            if (a != null) {
                int length = a.length;
                awgkArr = new awgk[length];
                for (int i = 0; i < length; i++) {
                    awgkArr[i] = new awgk(a[i]);
                }
            } else {
                awgkArr = null;
            }
            int length2 = awgkArr.length;
            if (length2 > 1) {
                accountSelector.f110043b.setAdapter((SpinnerAdapter) new awgl(accountSelector.getContext(), awgkArr));
                accountSelector.f110043b.setVisibility(0);
            } else {
                if (length2 == 1) {
                    accountSelector.f110042a = awgkArr[0].f94305a;
                }
                accountSelector.f110043b.setVisibility(8);
            }
            accountSelector.mo59830a();
            if (length2 == 1 && (awgq = accountSelector.f110044c) != null) {
                awgq.mo52132a(accountSelector.f110042a);
            }
            accountSelector.f110044c = this;
        }
        if (m94059m() == null) {
            m94058l();
        }
        m94060n();
        if (!this.f110298p && !this.f110285c) {
            m94056j();
        }
    }

    /* renamed from: g */
    public final void mo59956g() {
        if (this.f110293k != null) {
            getSupportFragmentManager().beginTransaction().remove(this.f110293k).commit();
        }
        bkcz a = bkcz.m105336a();
        this.f110293k = a;
        a.f124032a = this;
        a.show(getSupportFragmentManager(), "RootChimeraActivity.NETWORK_ERROR_DIALOG");
    }

    /* renamed from: h */
    public final BuyFlowConfig mo51881h() {
        return this.f110301s;
    }

    public final void onBackPressed() {
        if (this.f110286d) {
            mo59953a(-1, (Intent) null);
        } else {
            m94063q();
        }
    }

    public void onClick(View view) {
        if (view.getId() == C0126R.C0129id.positive_btn) {
            m94057k();
        } else if (this.f110286d) {
            mo59953a(-1, new Intent());
        } else {
            m94063q();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awia.a(com.google.android.chimera.Activity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, boolean):void
     arg types: [com.google.android.gms.wallet.ow.RootChimeraActivity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, int]
     candidates:
      awia.a(bwiv, android.content.Intent, android.content.Context, com.google.android.gms.wallet.shared.BuyFlowConfig):android.content.Intent
      awia.a(com.google.android.chimera.Activity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, boolean):void */
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        BuyFlowConfig buyFlowConfig = (BuyFlowConfig) getIntent().getParcelableExtra("buyFlowConfig");
        this.f110301s = buyFlowConfig;
        sdo.m34959a(buyFlowConfig);
        super.onCreate(bundle);
        awia.m79981a((Activity) this, this.f110301s, awia.f94379a, false);
        setContentView((int) C0126R.C0128layout.wallet_activity_simple_dialog);
        if (this.f110292j == null) {
            this.f110292j = rjx.m33697b((Activity) this);
        }
        ButtonBar buttonBar = (ButtonBar) findViewById(C0126R.C0129id.button_bar);
        this.f110287e = buttonBar;
        buttonBar.f110057a.setOnClickListener(this);
        this.f110287e.f110059c.setOnClickListener(this);
        this.f110288f = findViewById(C0126R.C0129id.overlay_progress_spinner);
        this.f110289g = findViewById(C0126R.C0129id.dialog_content);
        this.f110290h = (TopBarView) findViewById(C0126R.C0129id.top_bar);
        m94062p();
        setTitle((int) C0126R.string.wallet_google_pay_icon_with_text_content_description);
        this.f110302t = new HashSet();
        sdo.m34959a(this.f110301s.f110418b);
        sdo.m34959a(this.f110301s.f110418b.f110407b);
        if (bundle != null) {
            this.f110299q = bundle.getInt("serviceConnectionSavePoint", -1);
            this.f110298p = bundle.getBoolean("remoteOperationInProgress", false);
            this.f110285c = bundle.getBoolean("immediateSaveFinished", false);
            this.f110291i = (Account) bundle.getParcelable("account");
            if (bundle.containsKey("accountsThatHaveRequestedAuthTokens")) {
                this.f110302t.addAll(bundle.getParcelableArrayList("accountsThatHaveRequestedAuthTokens"));
            }
        }
        this.f110297o = (btro) bjvp.m104729a(getIntent(), "com.google.android.gms.wallet.CREATE_WALLET_OBJECTS_REQUEST", (bxxk) btro.f150127e.mo74142c(7));
        this.f110295m = getIntent().getStringExtra("com.google.android.gms.wallet.WOBS_ISSUER_NAME");
        this.f110294l = getIntent().getStringExtra("com.google.android.gms.wallet.EXTRA_WOBS_ISSUER_CLASS_ID");
        this.f110296n = getIntent().getStringExtra("com.google.android.gms.wallet.WOBS_OBJECT_DESCRIPTION");
        int intExtra = getIntent().getIntExtra("com.google.android.gms.wallet.EXTRA_CREATE_MODE", 0);
        awec.m79679a();
        this.f110286d = intExtra == 1 && ((Boolean) awjk.f94538a.mo58455c()).booleanValue() && awec.m79681a(this).length == 1;
        TextView textView = (TextView) findViewById(C0126R.C0129id.confirmation_text);
        if (this.f110286d) {
            this.f110287e.f110059c.setText(getString(C0126R.string.common_got_it));
            this.f110287e.f110058b.setVisibility(8);
            if (this.f110297o.f150130b.size() > 0) {
                str2 = getString(C0126R.string.wallet_saved_loyalty_or_gift_card_wallet_object_message, new Object[]{this.f110296n});
            } else if (this.f110297o.f150131c.size() > 0) {
                str2 = getString(C0126R.string.wallet_saved_offer_wallet_object_message, new Object[]{this.f110295m});
            } else if (this.f110297o.f150132d.size() > 0) {
                str2 = getString(C0126R.string.wallet_saved_loyalty_or_gift_card_wallet_object_message, new Object[]{this.f110295m});
            } else {
                throw new IllegalStateException("CreateWalletObjectRequest should contain an offer, loyalty, or gift card object");
            }
            textView.setText(str2);
        } else {
            TypedArray obtainStyledAttributes = obtainStyledAttributes(new int[]{C0126R.attr.colorWalletNormalText});
            int color = obtainStyledAttributes.getColor(0, -16777216);
            obtainStyledAttributes.recycle();
            this.f110287e.f110059c.setTextColor(color);
            if (this.f110297o.f150130b.size() > 0) {
                str = getString(C0126R.string.wallet_confirm_loyalty_or_gift_wallet_object_creation, new Object[]{this.f110296n});
            } else if (this.f110297o.f150131c.size() > 0) {
                str = getString(C0126R.string.wallet_confirm_offer_wallet_object_creation, new Object[]{this.f110295m});
            } else if (this.f110297o.f150132d.size() > 0) {
                str = getString(C0126R.string.wallet_confirm_loyalty_or_gift_wallet_object_creation, new Object[]{this.f110295m});
            } else {
                throw new IllegalStateException("CreateWalletObjectRequest should contain an offer, loyalty, or gift card object");
            }
            textView.setText(str);
        }
        if (this.f110298p && this.f110286d) {
            this.f110289g.setVisibility(8);
            this.f110288f.setVisibility(0);
        }
        if (this.f110291i == null) {
            this.f110288f.setVisibility(0);
            aucb x = this.f110292j.mo24770x();
            x.mo50376a(this, new awnv(this));
            x.mo50375a(this, new awnw(this));
            return;
        }
        mo59955e();
    }

    public final void onPause() {
        super.onPause();
        m94061o();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        bkcz bkcz = (bkcz) getSupportFragmentManager().findFragmentByTag("RootChimeraActivity.NETWORK_ERROR_DIALOG");
        this.f110293k = bkcz;
        if (bkcz != null) {
            bkcz.f124032a = this;
        }
        m94060n();
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("account", this.f110291i);
        bundle.putParcelableArrayList("accountsThatHaveRequestedAuthTokens", new ArrayList(this.f110302t));
        m94061o();
        bundle.putInt("serviceConnectionSavePoint", this.f110299q);
        bundle.putBoolean("remoteOperationInProgress", this.f110298p);
        bundle.putBoolean("immediateSaveFinished", this.f110285c);
    }

    /* renamed from: w */
    public final void mo52163w() {
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag("RetrieveAuthTokensFragment");
        if (findFragmentByTag != null) {
            getSupportFragmentManager().beginTransaction().remove(findFragmentByTag).commit();
        }
    }

    /* renamed from: x */
    public final void mo52164x() {
        m94063q();
    }

    /* renamed from: a */
    public final void mo59952a(int i) {
        Intent intent = new Intent();
        awfm.m79848a(this.f110301s, intent, i);
        mo59954b(5);
        mo59953a(1, intent);
    }

    /* renamed from: a */
    public final void mo52044a(int i, int i2) {
        if (i2 != 1000) {
            StringBuilder sb = new StringBuilder(44);
            sb.append("Unknown error dialog error code: ");
            sb.append(i2);
            Log.e("RootChimeraActivity", sb.toString());
        } else if (i != 1) {
            m94063q();
        } else {
            m94056j();
        }
    }

    /* renamed from: a */
    public final void mo59953a(int i, Intent intent) {
        if (intent == null) {
            intent = new Intent();
        }
        setResult(i, intent);
        finish();
    }

    /* renamed from: a */
    public final void mo52132a(Account account) {
        if (!sdg.m34949a(account, this.f110291i)) {
            getIntent().removeExtra("com.google.android.gms.wallet.EXTRA_GOOGLE_TRANSACTION_ID");
            getIntent().removeExtra("com.google.android.gms.wallet.EXTRA_SELECTED_INSTRUMENT_ID");
            getIntent().removeExtra("com.google.android.gms.wallet.EXTRA_SELECTED_ADDRESS_ID");
            this.f110291i = account;
            m94061o();
            awhg m = m94059m();
            if (m != null) {
                getSupportFragmentManager().beginTransaction().remove(m).commit();
            }
            getSupportFragmentManager().executePendingTransactions();
            awyb a = BuyFlowConfig.m94176a(this.f110301s);
            awxz a2 = ApplicationParameters.m94174a(this.f110301s.f110418b);
            a2.mo52739a(account);
            a.mo52749a(a2.f95270a);
            this.f110301s = a.mo52748a();
            m94058l();
            m94060n();
            m94056j();
        }
    }
}
