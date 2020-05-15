package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.FragmentActivity;
import com.google.android.gms.chromesync.phone.p035ui.CustomPassphrasePhoneChimeraDialog;

/* renamed from: qwg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class qwg extends FragmentActivity implements View.OnClickListener {

    /* renamed from: a */
    private Account f42311a;

    /* renamed from: e */
    public CustomPassphrasePhoneChimeraDialog f42312e;

    /* renamed from: a */
    public static PendingIntent m32995a(Context context, Account account) {
        bmxy.m108581a(context);
        bmxy.m108581a(account);
        Intent className = new Intent().setClassName(context, "com.google.android.gms.chromesync.ui.CustomPassphraseDialog");
        className.setData(Uri.parse(String.format("content://com.google.android.gms.chromesync.ui.CustomPassphraseDialog/%s", account)));
        className.putExtra("account", account);
        return PendingIntent.getActivity(context, 0, className, 134217728);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract CustomPassphrasePhoneChimeraDialog mo17651a();

    public void onClick(View view) {
        if (view.getId() == this.f42312e.f30016b.getId()) {
            mo24317a(Uri.parse((String) qqv.f41964a.mo58455c()));
        } else if (view.getId() == this.f42312e.f30017c.getId()) {
            this.f42312e.mo17652a(false);
            view.setEnabled(false);
            qqf a = qqg.m32654a();
            a.f41945a = this.f42311a;
            rjx d = qqb.m32648d(this, a.mo24204a());
            String obj = this.f42312e.f30015a.getText().toString();
            sdo.m34977c(obj);
            d.mo24732b(new qqe(obj)).mo50371a(new qwe(this, view));
        } else if (view.getId() == this.f42312e.f30018d.getId()) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setResult(0);
        if (bundle == null) {
            bundle = getIntent().getExtras();
        }
        if (bundle == null || !bundle.containsKey("account")) {
            finish();
            return;
        }
        this.f42311a = (Account) bundle.getParcelable("account");
        CustomPassphrasePhoneChimeraDialog a = mo17651a();
        this.f42312e = a;
        a.f30015a.addTextChangedListener(new qwf(this));
        TextView textView = this.f42312e.f30016b;
        textView.setText(Html.fromHtml(getResources().getString(C0126R.string.chromesync_custom_passphrase_explanation, this.f42311a.name, qqv.f41964a.mo58455c())));
        textView.setOnClickListener(this);
        this.f42312e.f30017c.setOnClickListener(this);
        this.f42312e.f30018d.setOnClickListener(this);
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("account", this.f42311a);
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo24317a(Uri uri) {
        try {
            startActivity(new Intent("android.intent.action.VIEW", uri));
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this, getString(C0126R.string.common_no_browser_found), 1).show();
        }
    }
}
