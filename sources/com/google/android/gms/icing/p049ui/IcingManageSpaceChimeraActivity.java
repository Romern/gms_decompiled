package com.google.android.gms.icing.p049ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: com.google.android.gms.icing.ui.IcingManageSpaceChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class IcingManageSpaceChimeraActivity extends deu implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public View f79095b;

    /* renamed from: c */
    public View f79096c;

    /* renamed from: d */
    public TextView f79097d;

    /* renamed from: e */
    public ListView f79098e;

    /* renamed from: f */
    public TextView f79099f;

    /* renamed from: g */
    private actk f79100g;

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0126R.C0128layout.icing_manage_space_activity);
        this.f79095b = findViewById(C0126R.C0129id.main_view);
        this.f79096c = findViewById(C0126R.C0129id.icing_progress_bar);
        this.f79097d = (TextView) findViewById(C0126R.C0129id.total_size_text);
        ListView listView = (ListView) findViewById(C0126R.C0129id.apps_list);
        this.f79098e = listView;
        listView.setOnItemClickListener(this);
        TextView textView = (TextView) findViewById(C0126R.C0129id.empty_list_view);
        this.f79099f = textView;
        this.f79098e.setEmptyView(textView);
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0126R.C0130menu.icing_manage_settings_menu, menu);
        return true;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        actn actn = (actn) this.f79098e.getAdapter();
        if (actn != null && i >= 0 && i < actn.getCount()) {
            String str = actn.getItem(i).f60757a;
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", str, null));
            startActivity(intent);
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == C0126R.C0129id.icing_settings_help) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String) abzt.f58851S.mo58455c())));
            return true;
        } else if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            C1094ix.m16252a(getContainerActivity());
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        actk actk = this.f79100g;
        if (actk != null) {
            actk.cancel(true);
            this.f79100g = null;
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        actk actk = new actk(this);
        this.f79100g = actk;
        actk.execute(new Void[0]);
        new abym(getApplicationContext()).mo32453b(8004);
    }
}
