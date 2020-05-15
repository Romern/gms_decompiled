package com.google.android.gms.wearable.p090ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: com.google.android.gms.wearable.ui.WearableManageSpaceChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WearableManageSpaceChimeraActivity extends Activity implements AdapterView.OnItemClickListener, View.OnClickListener {

    /* renamed from: a */
    public View f111034a;

    /* renamed from: b */
    public TextView f111035b;

    /* renamed from: c */
    public Button f111036c;

    /* renamed from: d */
    public ListView f111037d;

    /* renamed from: e */
    public volatile rkb f111038e;

    /* renamed from: f */
    private ayjf f111039f;

    /* renamed from: g */
    private ayje f111040g;

    /* renamed from: a */
    public final void mo60329a() {
        this.f111034a.setVisibility(0);
        this.f111036c.setEnabled(false);
        ayjf ayjf = this.f111039f;
        if (ayjf != null) {
            ayjf.cancel(true);
        }
        ayjf ayjf2 = new ayjf(this);
        this.f111039f = ayjf2;
        ayjf2.execute(new Void[0]);
    }

    public void onClick(View view) {
        Button button = this.f111036c;
        if (view == button) {
            button.setEnabled(false);
            this.f111034a.setVisibility(0);
            this.f111036c.setEnabled(false);
            ayje ayje = this.f111040g;
            if (ayje != null) {
                ayje.cancel(true);
            }
            ayje ayje2 = new ayje(this);
            this.f111040g = ayje2;
            ayje2.execute(new Void[0]);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0126R.C0128layout.wearable_manage_space_activity);
        this.f111034a = findViewById(C0126R.C0129id.wearable_progress_bar);
        this.f111035b = (TextView) findViewById(C0126R.C0129id.total_size_text);
        this.f111036c = (Button) findViewById(C0126R.C0129id.reclaim_button);
        ListView listView = (ListView) findViewById(C0126R.C0129id.apps_list);
        this.f111037d = listView;
        listView.setOnItemClickListener(this);
        this.f111036c.setOnClickListener(this);
        if (!chng.f188808a.mo6606a().mo85372a()) {
            rjy rjy = new rjy(this);
            rjy.mo24779a(axoz.f96226a);
            this.f111038e = rjy.mo24784b();
        }
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ayjd ayjd = (ayjd) this.f111037d.getAdapter();
        if (ayjd != null && i >= 0 && i < ayjd.getCount()) {
            String str = ayjd.getItem(i).f110956a;
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", str, null));
            startActivity(intent);
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        C1094ix.m16252a(getContainerActivity());
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        ayjf ayjf = this.f111039f;
        if (ayjf != null) {
            ayjf.cancel(true);
            this.f111039f = null;
        }
        ayje ayje = this.f111040g;
        if (ayje != null) {
            ayje.cancel(true);
            this.f111040g = null;
        }
        if (this.f111038e != null) {
            this.f111038e.mo24803g();
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        if (this.f111038e != null) {
            this.f111038e.mo24801e();
        }
        mo60329a();
    }
}
