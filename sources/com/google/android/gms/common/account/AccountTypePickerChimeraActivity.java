package com.google.android.gms.common.account;

import android.accounts.AuthenticatorDescription;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountTypePickerChimeraActivity extends Activity {

    /* renamed from: a */
    public ArrayList f30091a;

    /* renamed from: b */
    private final HashMap f30092b = new HashMap();

    /* renamed from: a */
    public static Intent m22472a(Context context, ria ria) {
        String[] strArr;
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.common.account.AccountTypePickerActivity");
        intent.setFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        bngx bngx = ria.f43014a;
        if (bngx != null) {
            strArr = (String[]) bngx.toArray(new String[bngx.size()]);
        } else {
            strArr = null;
        }
        intent.putExtra("allowableAccountTypes", strArr);
        return intent;
    }

    public final void onCreate(Bundle bundle) {
        HashSet hashSet;
        super.onCreate(bundle);
        String[] stringArrayExtra = getIntent().getStringArrayExtra("allowableAccountTypes");
        if (stringArrayExtra != null) {
            int length = stringArrayExtra.length;
            hashSet = new HashSet(length);
            for (String str : stringArrayExtra) {
                hashSet.add(str);
            }
        } else {
            hashSet = null;
        }
        m22473a();
        this.f30091a = new ArrayList(this.f30092b.size());
        for (Map.Entry entry : this.f30092b.entrySet()) {
            String str2 = (String) entry.getKey();
            rgx rgx = (rgx) entry.getValue();
            if (hashSet == null || hashSet.contains(str2)) {
                this.f30091a.add(rgx);
            }
        }
        if (this.f30091a.isEmpty()) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("errorMessage", "no allowable account types");
            setResult(-1, new Intent().putExtras(bundle2));
            finish();
        } else if (this.f30091a.size() == 1) {
            mo17690a(((rgx) this.f30091a.get(0)).f42945a.type);
        } else {
            setContentView((int) C0126R.C0128layout.common_account_type_picker);
            ListView listView = (ListView) findViewById(16908298);
            listView.setAdapter((ListAdapter) new rgw(this, this.f30091a));
            listView.setChoiceMode(0);
            listView.setTextFilterEnabled(false);
            listView.setOnItemClickListener(new rgv(this));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006d  */
    /* renamed from: a */
    private final void m22473a() {
        Drawable drawable;
        String str;
        AuthenticatorDescription[] a = adyd.m51363a(this).mo33918a();
        for (AuthenticatorDescription authenticatorDescription : a) {
            try {
                Context createPackageContext = createPackageContext(authenticatorDescription.packageName, 0);
                drawable = createPackageContext.getResources().getDrawable(authenticatorDescription.iconId);
                try {
                    CharSequence text = createPackageContext.getResources().getText(authenticatorDescription.labelId);
                    if (text != null) {
                        text.toString();
                    }
                    str = text.toString();
                } catch (PackageManager.NameNotFoundException e) {
                    if (Log.isLoggable("AccountChooser", 5)) {
                    }
                    str = null;
                    this.f30092b.put(authenticatorDescription.type, new rgx(authenticatorDescription, str, drawable));
                } catch (Resources.NotFoundException e2) {
                    if (Log.isLoggable("AccountChooser", 5)) {
                    }
                    str = null;
                    this.f30092b.put(authenticatorDescription.type, new rgx(authenticatorDescription, str, drawable));
                }
            } catch (PackageManager.NameNotFoundException e3) {
                drawable = null;
                if (Log.isLoggable("AccountChooser", 5)) {
                    String valueOf = String.valueOf(authenticatorDescription.type);
                    Log.w("AccountChooser", valueOf.length() == 0 ? new String("No icon name for account type ") : "No icon name for account type ".concat(valueOf));
                }
                str = null;
                this.f30092b.put(authenticatorDescription.type, new rgx(authenticatorDescription, str, drawable));
            } catch (Resources.NotFoundException e4) {
                drawable = null;
                if (Log.isLoggable("AccountChooser", 5)) {
                    String valueOf2 = String.valueOf(authenticatorDescription.type);
                    Log.w("AccountChooser", valueOf2.length() == 0 ? new String("No icon resource for account type ") : "No icon resource for account type ".concat(valueOf2));
                }
                str = null;
                this.f30092b.put(authenticatorDescription.type, new rgx(authenticatorDescription, str, drawable));
            }
            this.f30092b.put(authenticatorDescription.type, new rgx(authenticatorDescription, str, drawable));
        }
    }

    /* renamed from: a */
    public final void mo17690a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("accountType", str);
        setResult(-1, new Intent().putExtras(bundle));
        finish();
    }
}
