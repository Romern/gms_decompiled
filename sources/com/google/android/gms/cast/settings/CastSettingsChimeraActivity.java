package com.google.android.gms.cast.settings;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import java.util.HashMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CastSettingsChimeraActivity extends qkh {

    /* renamed from: b */
    static HashMap f29925b;

    /* renamed from: c */
    qab f29926c;

    static {
        HashMap hashMap = new HashMap();
        f29925b = hashMap;
        hashMap.put("RCN", pzw.f40762a);
        f29925b.put("Debug", pzx.f40763a);
    }

    /* renamed from: a */
    public final void mo17606a(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* renamed from: i */
    public final void mo7107i() {
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        this.f29926c = null;
        String stringExtra = getIntent().getStringExtra("ACTIVITY_TYPE");
        if (stringExtra == null || !f29925b.containsKey(stringExtra)) {
            super.onCreate(bundle);
            return;
        }
        qab a = ((qaa) f29925b.get(stringExtra)).mo23832a(this);
        this.f29926c = a;
        a.mo23823a(bundle);
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        qab qab = this.f29926c;
        if (qab != null) {
            return qab.mo23825a(menu);
        }
        return true;
    }

    public final void onDestroy() {
        qab qab = this.f29926c;
        if (qab != null) {
            qab.mo23829a();
        }
        super.onDestroy();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        qab qab = this.f29926c;
        if (qab != null) {
            return qab.mo23826a(menuItem);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7102a(sug sug, Bundle bundle) {
        qab qab = this.f29926c;
        if (qab != null) {
            qab.mo23824a(sug);
        }
    }

    /* renamed from: a */
    public final boolean mo17607a(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    /* renamed from: a */
    public final boolean mo17608a(MenuItem menuItem) {
        return super.onOptionsItemSelected(menuItem);
    }
}
