package com.google.android.gms.backup.base;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SetBackupAccountChimeraActivity extends Activity {

    /* renamed from: a */
    public static final lvn f29004a = new lvn("SetBackupAccountChimeraActivity");

    /* renamed from: b */
    public Parcelable[] f29005b = null;

    /* renamed from: c */
    public final ConcurrentHashMap f29006c = new ConcurrentHashMap();

    /* renamed from: d */
    public lvm f29007d;

    /* renamed from: e */
    private ExecutorService f29008e = snp.m35704b(9);

    /* renamed from: f */
    private final AccountManagerCallback f29009f = new lvf(this);

    /* renamed from: b */
    private final void m21876b() {
        if (!isFinishing() && ccno.f179554a.mo6606a().mo76478j() && mau.m24777a(this).isEmpty()) {
            setResult(0);
            finish();
        }
    }

    /* renamed from: a */
    public final void mo17217a() {
        String str;
        adyd a = adyd.m51363a(this);
        if (!sre.m36080a(this)) {
            str = "com.google";
        } else {
            str = "cn.google";
        }
        a.mo33913a(str, null, null, null, getContainerActivity(), this.f29009f);
    }

    public final void onCreate(Bundle bundle) {
        Drawable drawable;
        List<Account> a = mau.m24777a(this);
        if (a.isEmpty()) {
            f29004a.mo25409a("No accounts for backup on device, launching add account", new Object[0]);
            setTheme(16973840);
            super.onCreate(bundle);
            mo17217a();
            return;
        }
        if (this.f29007d == null) {
            this.f29007d = new lvm(this);
        }
        super.onCreate(bundle);
        Parcelable[] parcelableArr = new Parcelable[a.size()];
        this.f29005b = parcelableArr;
        Parcelable[] parcelableArr2 = (Parcelable[]) a.toArray(parcelableArr);
        this.f29005b = parcelableArr2;
        int length = parcelableArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int length2 = ((Account) this.f29005b[i]).name.length();
            int i4 = length2 > i3 ? length2 : i3;
            if (length2 > i3) {
                i2 = i;
            }
            i++;
            i3 = i4;
        }
        if (i2 != 0) {
            Parcelable[] parcelableArr3 = this.f29005b;
            Parcelable parcelable = parcelableArr3[0];
            parcelableArr3[0] = parcelableArr3[i2];
            parcelableArr3[i2] = parcelable;
        }
        String[] strArr = new String[(length + 1)];
        for (int i5 = 0; i5 < length; i5++) {
            strArr[i5] = ((Account) this.f29005b[i5]).name;
        }
        strArr[length] = getResources().getString(C0126R.string.common_add_account);
        setContentView((int) C0126R.C0128layout.set_backup_account);
        Drawable drawable2 = getResources().getDrawable(C0126R.C0127drawable.product_logo_avatar_circle_blue_color_48);
        if (ccop.m131034d()) {
            Drawable drawable3 = getResources().getDrawable(C0126R.C0127drawable.quantum_gm_ic_person_add_gm_grey_24);
            drawable3.setColorFilter(C1133kh.m17843b(this, C0126R.color.account_menu_line_item_tint), PorterDuff.Mode.SRC_IN);
            drawable = drawable3;
        } else {
            drawable = getResources().getDrawable(C0126R.C0127drawable.quantum_ic_add_vd_theme_24);
        }
        TextView textView = (TextView) findViewById(16908310);
        int i6 = Build.VERSION.SDK_INT;
        if (!ccod.m130982c()) {
            textView.setTextAppearance(this, 16974345);
        }
        int i7 = Build.VERSION.SDK_INT;
        textView.setLayoutDirection(2);
        textView.setSingleLine(false);
        textView.setMaxLines(2);
        ListView listView = (ListView) findViewById(16908298);
        lvj lvj = new lvj(this, this, strArr, drawable2, drawable);
        listView.setAdapter((ListAdapter) lvj);
        listView.setChoiceMode(1);
        listView.setTextFilterEnabled(true);
        listView.setOnItemClickListener(new lvg(this));
        for (Account account : a) {
            if (account.name != null && !this.f29006c.containsKey(account.name)) {
                this.f29008e.execute(new lvh(this, account, this, lvj));
            }
        }
    }

    /* renamed from: a */
    public final void mo17218a(Account account) {
        int i = Build.VERSION.SDK_INT;
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.backup.component.SetBackupAccountFlowActivity");
        intent.putExtra("account", account);
        intent.putExtra("turnOff", getIntent().getBooleanExtra("turnOff", false));
        intent.putExtra("showDone", getIntent().getBooleanExtra("showDone", false));
        startActivity(intent);
        finish();
    }

    /* renamed from: a */
    public final /* synthetic */ void mo17219a(AccountManagerFuture accountManagerFuture) {
        try {
            Bundle bundle = (Bundle) accountManagerFuture.getResult();
            if (bundle.containsKey("authAccount")) {
                mo17218a(new Account((String) bundle.get("authAccount"), (String) bundle.get("accountType")));
            }
            setResult(-1);
            if (f29004a.mo19637a(2)) {
                lvn lvn = f29004a;
                String valueOf = String.valueOf(bundle);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
                sb.append("account added: ");
                sb.append(valueOf);
                lvn.mo25409a(sb.toString(), new Object[0]);
            }
        } catch (OperationCanceledException e) {
            if (f29004a.mo19637a(2)) {
                f29004a.mo25409a("addAccount was canceled.", new Object[0]);
            }
            m21876b();
        } catch (AuthenticatorException | IOException e2) {
            if (f29004a.mo19637a(2)) {
                f29004a.mo25408a("addAccount failed: ", e2, new Object[0]);
            }
            m21876b();
        }
    }
}
