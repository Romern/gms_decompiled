package com.google.android.gms.app.settings;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.MenuItem;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OpenSourceLicensesChimeraActivity extends deu {

    /* renamed from: b */
    public static final bngx f9510b = bngx.m109358a(new Pair("com.google.android.ims", "Carrier Service"), new Pair("com.google.android.apps.pixelmigrate", "Data Transfer Tool"), new Pair("com.google.android.apps.restore", "Data Restore Tool"));

    /* renamed from: c */
    public Handler f9511c;

    /* renamed from: d */
    public bqgj f9512d;

    /* renamed from: e */
    public TextView f9513e;

    /* renamed from: a */
    public static void m6135a(Context context, String str, StringBuilder sb, String str2) {
        InputStream openRawResource;
        try {
            Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(str);
            openRawResource = resourcesForApplication.openRawResource(resourcesForApplication.getIdentifier("third_party_licenses", "raw", str));
            sb.append(str2);
            sb.append(new Scanner(openRawResource).useDelimiter("\\A").next());
            if (openRawResource != null) {
                openRawResource.close();
                return;
            }
            return;
        } catch (PackageManager.NameNotFoundException | Resources.NotFoundException | IOException e) {
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0126R.C0128layout.common_activity_oss_licenses);
        TextView textView = (TextView) findViewById(C0126R.C0129id.text);
        this.f9513e = textView;
        textView.setText((int) C0126R.string.fetching_licenses);
        this.f9511c = new fqf(this);
        bqgj b = snp.m35704b(10);
        this.f9512d = b;
        b.execute(new fqg(this));
        mo8628aW().mo15853b(true);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        C1094ix.m16252a(getContainerActivity());
        return true;
    }
}
