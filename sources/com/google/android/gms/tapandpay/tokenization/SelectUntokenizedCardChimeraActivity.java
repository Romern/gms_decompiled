package com.google.android.gms.tapandpay.tokenization;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.material.button.MaterialButton;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SelectUntokenizedCardChimeraActivity extends atex {

    /* renamed from: o */
    public static final /* synthetic */ int f108831o = 0;

    /* renamed from: p */
    private static final srn f108832p = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    public btjq f108833b = null;

    /* renamed from: c */
    public boolean f108834c = false;

    /* renamed from: d */
    public boolean f108835d;

    /* renamed from: e */
    public View f108836e;

    /* renamed from: f */
    public atqr f108837f;

    /* renamed from: g */
    public byte[] f108838g;

    /* renamed from: h */
    public List f108839h;

    /* renamed from: i */
    public boolean f108840i;

    /* renamed from: j */
    public byte[] f108841j;

    /* renamed from: k */
    public atqs f108842k;

    /* renamed from: l */
    atzf f108843l;

    /* renamed from: m */
    ayxa f108844m;

    /* renamed from: n */
    rjx f108845n;

    /* renamed from: q */
    private TextView f108846q;

    /* renamed from: r */
    private View f108847r;

    /* renamed from: s */
    private askf f108848s;

    /* renamed from: t */
    private AccountInfo f108849t;

    /* renamed from: u */
    private byte[] f108850u;

    /* renamed from: v */
    private long f108851v;

    /* renamed from: w */
    private atfg f108852w = new atfg();

    /* renamed from: x */
    private boolean f108853x;

    /* renamed from: h */
    private final void m93234h() {
        this.f108849t = (AccountInfo) getIntent().getParcelableExtra("extra_account_info");
        this.f108850u = getIntent().getByteArrayExtra("extra_client_token");
        this.f108840i = getIntent().getBooleanExtra("extra_should_show_customer_selector", false);
        this.f108841j = getIntent().getByteArrayExtra("extra_customer_selector_params");
        this.f108839h = new ArrayList();
        Serializable serializableExtra = getIntent().getSerializableExtra("extra_card_list");
        if (serializableExtra != null) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) serializableExtra).iterator();
                while (it.hasNext()) {
                    bxus c = bxus.m123744c();
                    arrayList.add((btjq) bxvk.m124016a(btjq.f149162e, (byte[]) it.next(), c));
                }
                this.f108839h = arrayList;
            } catch (bxwf e) {
                bnsl bnsl = (bnsl) f108832p.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectUntokenizedCardChimeraActivity", "h", 238, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Failed to parse untokenized card");
            }
        }
        this.f108853x = getIntent().getBooleanExtra("EXTRA_USE_SUW_UI", false);
    }

    /* renamed from: e */
    public final void mo59455e() {
        Toast.makeText(getBaseContext(), (int) C0126R.string.tp_activate_unable_to_load_customer, 0).show();
        this.f108839h.clear();
        mo59456g();
    }

    /* renamed from: g */
    public final void mo59456g() {
        int a;
        if (this.f108835d) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List list = this.f108839h;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                btjq btjq = (btjq) list.get(i);
                btjo btjo = btjq.f149167d;
                if (btjo == null || (a = btjn.m116843a(btjo.f149155a)) == 0 || a != 3) {
                    arrayList2.add(btjq);
                } else {
                    arrayList.add(btjq);
                }
            }
            this.f108839h = arrayList2;
            arrayList2.addAll(arrayList);
        }
        this.f108842k.clear();
        this.f108842k.addAll(this.f108839h);
        this.f108836e.setVisibility(0);
        this.f108847r.setVisibility(8);
        TextView textView = (TextView) findViewById(C0126R.C0129id.ChooseCardPrompt);
        if (this.f108839h.isEmpty()) {
            ((TextView) findViewById(C0126R.C0129id.heading)).setText((int) C0126R.string.tp_activate_no_card_title);
            textView.setText(getString(C0126R.string.tp_activate_no_cards_header));
            this.f108846q.setText((int) C0126R.string.tp_activate_add_card);
        } else {
            textView.setText(getString(C0126R.string.tp_activate_single_or_more_cards_header));
            this.f108846q.setText((int) C0126R.string.tp_activate_add_another_card);
        }
        if (this.f108833b == null && !this.f108834c) {
            if (!this.f108839h.isEmpty()) {
                this.f108833b = (btjq) this.f108839h.get(0);
            } else {
                this.f108834c = true;
            }
        }
        if (this.f108833b == null && !this.f108834c) {
            findViewById(C0126R.C0129id.ConfirmButton).setEnabled(false);
        }
        if (this.f108834c) {
            ((RadioButton) this.f108836e.findViewById(C0126R.C0129id.left_icon_radio)).setChecked(true);
        }
        this.f108842k.notifyDataSetChanged();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1) {
            return;
        }
        if (i2 == -1) {
            long j = this.f108851v;
            this.f108851v = intent.getLongExtra("com.google.android.gms.wallet.firstparty.EXTRA_CUSTOMER_ID", 0);
            boolean booleanExtra = intent.getBooleanExtra("com.google.android.gms.wallet.firstparty.EXTRA_NEW_CUSTOMER", false);
            if (j != this.f108851v || booleanExtra) {
                this.f108847r.setVisibility(0);
                this.f108836e.setVisibility(8);
                this.f108842k.clear();
                this.f108842k.notifyDataSetChanged();
                bxvd da = btjf.f149105c.mo74144da();
                bxtx a = bxtx.m123261a(this.f108850u);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                a.getClass();
                ((btjf) da.f164949b).f149107a = a;
                bxvd da2 = btjm.f149149c.mo74144da();
                long j2 = this.f108851v;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                btjm btjm = (btjm) da2.f164949b;
                btjm.f149152b = j2;
                btjm.f149151a = (!booleanExtra ? 4 : 3) - 2;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                btjm btjm2 = (btjm) da2.mo74062i();
                btjm2.getClass();
                ((btjf) da.f164949b).f149108b = btjm2;
                this.f108852w.mo49920a(this.f108848s, "t/untokenizedcards/list", (btjf) da.mo74062i(), btjg.f149109e, new atqp(this, booleanExtra), this);
            }
        } else if (i2 != 0) {
            mo59455e();
        } else {
            mo59456g();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0126R.C0128layout.tp_select_untokenized_card_activity);
        setTitle("");
        View findViewById = findViewById(16908290);
        findViewById.setVisibility(4);
        if (bundle != null) {
            byte[] byteArray = bundle.getByteArray("selected_card");
            if (byteArray != null) {
                try {
                    this.f108833b = (btjq) bxvk.m124016a(btjq.f149162e, byteArray, bxus.m123744c());
                } catch (bxwf e) {
                    bnsl bnsl = (bnsl) f108832p.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectUntokenizedCardChimeraActivity", "onCreate", (int) MfiClientException.TYPE_MFICLIENT_NOT_STARTED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Failed to parse untokenized card");
                }
            }
            this.f108834c = bundle.getBoolean("selected_add");
        }
        this.f108849t = (AccountInfo) getIntent().getParcelableExtra("extra_account_info");
        this.f108850u = getIntent().getByteArrayExtra("extra_client_token");
        this.f108840i = getIntent().getBooleanExtra("extra_should_show_customer_selector", false);
        this.f108841j = getIntent().getByteArrayExtra("extra_customer_selector_params");
        this.f108839h = new ArrayList();
        Serializable serializableExtra = getIntent().getSerializableExtra("extra_card_list");
        if (serializableExtra != null) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) serializableExtra).iterator();
                while (it.hasNext()) {
                    bxus c = bxus.m123744c();
                    arrayList.add((btjq) bxvk.m124016a(btjq.f149162e, (byte[]) it.next(), c));
                }
                this.f108839h = arrayList;
            } catch (bxwf e2) {
                bnsl bnsl2 = (bnsl) f108832p.mo68388c();
                bnsl2.mo68437a(e2);
                bnsl2.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectUntokenizedCardChimeraActivity", "h", 238, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Failed to parse untokenized card");
            }
        }
        this.f108853x = getIntent().getBooleanExtra("EXTRA_USE_SUW_UI", false);
        this.f108835d = cgvr.f187829a.mo6606a().mo84551a();
        this.f108837f = new atqr(this);
        LayoutInflater from = LayoutInflater.from(this);
        ListView listView = (ListView) findViewById(C0126R.C0129id.PaymentCardList);
        View inflate = from.inflate((int) C0126R.C0128layout.tp_select_untokenized_card_activity_header, (ViewGroup) null);
        listView.addHeaderView(inflate);
        View inflate2 = from.inflate((int) C0126R.C0128layout.tp_select_untokenized_card_item, (ViewGroup) null);
        this.f108836e = inflate2;
        listView.addFooterView(inflate2, null, true);
        this.f108848s = new askf(this.f108849t, askc.m74272b(), this);
        this.f108847r = findViewById(C0126R.C0129id.Spinner);
        this.f108836e.setOnClickListener(this.f108837f);
        this.f108836e.setTag("AddCardRow");
        this.f108846q = (TextView) this.f108836e.findViewById(C0126R.C0129id.label);
        this.f108836e.findViewById(C0126R.C0129id.left_icon_radio).setVisibility(8);
        this.f108836e.findViewById(C0126R.C0129id.left_icon_plus).setVisibility(0);
        MaterialButton materialButton = (MaterialButton) findViewById(C0126R.C0129id.ConfirmButton);
        materialButton.setOnClickListener(new atqo(this));
        if (this.f108853x && cgwn.m147270t()) {
            inflate.findViewById(C0126R.C0129id.Logo).setVisibility(0);
            C1334rs.m20104a((TextView) inflate.findViewById(C0126R.C0129id.heading), 2132018984);
            C1334rs.m20104a((TextView) inflate.findViewById(C0126R.C0129id.ChooseCardPrompt), 2132018990);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) materialButton.getLayoutParams();
            layoutParams.removeRule(14);
            layoutParams.addRule(21);
            materialButton.setLayoutParams(layoutParams);
        }
        findViewById.setVisibility(0);
        atqs atqs = new atqs(this, this, new ArrayList());
        this.f108842k = atqs;
        listView.setAdapter((ListAdapter) atqs);
        mo59456g();
        String stringExtra = getIntent().getStringExtra("nodeId");
        if (!TextUtils.isEmpty(stringExtra)) {
            if (this.f108845n == null) {
                this.f108845n = axoz.m82854b(this);
            }
            atzr atzr = new atzr(this.f108845n, stringExtra, this.f108849t, getIntent().getBooleanExtra("shouldCompressRpcs", false));
            this.f108852w = atzr;
            this.f108843l = new atzf(this.f108845n, atzr);
        }
        View findViewById2 = findViewById(C0126R.C0129id.TopShadow);
        View findViewById3 = findViewById(C0126R.C0129id.BottomShadow);
        mo59454a(listView, findViewById2, findViewById3);
        listView.setOnScrollListener(new atqq(this, listView, findViewById2, findViewById3));
        atpm atpm = new atpm();
        alir a = aliq.m60909a();
        cazf.m127594a(a);
        atpm.f90635a = a;
        cazf.m127595a(atpm.f90635a, alir.class);
        ayxa a2 = new atpn(atpm.f90635a).f90636a.mo40366a();
        cazf.m127593a(a2, "Cannot return null from a non-@Nullable component method");
        this.f108844m = a2;
        if (cgwn.m147275y()) {
            aywx a3 = this.f108844m.f98673b.mo54504a(88994);
            a3.mo54481a(ayxb.m85017a(this.f108849t.f108326b));
            a3.mo54503a(getContainerActivity());
        }
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0126R.C0130menu.tp_menu_account_selector, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            mo59453a(0, (btjq) null);
            return true;
        } else if (menuItem.getItemId() != C0126R.C0129id.OpenAccountSelector) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            awky awky = new awky(this);
            awky.mo52187a(askc.m74269a());
            awky.mo52188a(new Account(this.f108849t.f108326b, "com.google"));
            awky.mo52190a(atvh.m76455a(this));
            awky.mo52192b(3);
            awky.f94574a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS", this.f108841j);
            startActivityForResult(awky.mo52186a(), 1);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        atzf atzf = this.f108843l;
        if (atzf != null) {
            atzf.mo50328b();
        }
    }

    public final boolean onPrepareOptionsMenu(Menu menu) {
        if (this.f108840i) {
            menu.findItem(C0126R.C0129id.OpenAccountSelector).setVisible(true);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        atzf atzf = this.f108843l;
        if (atzf != null) {
            atzf.mo50327a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        btjq btjq = this.f108833b;
        if (btjq != null) {
            bundle.putByteArray("selected_card", btjq.mo73642k());
        }
        bundle.putBoolean("selected_add", this.f108834c);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        asjl.m74236a(this, "Choose Card");
    }

    /* renamed from: a */
    public final void mo59453a(int i, btjq btjq) {
        Intent intent = new Intent();
        if (btjq != null) {
            intent.putExtra("output_untokenized_card", btjq.mo73642k());
        }
        byte[] bArr = this.f108838g;
        if (bArr != null) {
            intent.putExtra("output_add_token", bArr);
        }
        setResult(i, intent);
        finish();
    }

    /* renamed from: a */
    public final void mo59454a(ListView listView, View view, View view2) {
        if (listView.getChildCount() == 0 || (listView.getFirstVisiblePosition() == 0 && listView.getChildAt(0).getTop() == listView.getPaddingTop())) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        if (listView.getChildCount() == 0 || (listView.getLastVisiblePosition() == (this.f108839h.size() - 1) + listView.getHeaderViewsCount() + listView.getFooterViewsCount() && listView.getChildAt(listView.getChildCount() - 1).getBottom() <= (listView.getHeight() - listView.getPaddingBottom()) - listView.getPaddingTop())) {
            view2.setVisibility(4);
        } else {
            view2.setVisibility(0);
        }
    }
}
