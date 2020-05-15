package com.google.android.gms.feedback;

import android.content.Intent;
import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.googlehelp.common.HelpConfig;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PreviewChimeraActivity extends Activity implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public HelpConfig f31617a;

    /* renamed from: b */
    public wvg f31618b;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo18621a(ErrorReport errorReport) {
        setContentView((int) C0126R.C0128layout.show_list_activity);
        try {
            this.f31618b = new wvg(this, errorReport);
            ListView listView = (ListView) findViewById(C0126R.C0129id.list);
            listView.setAdapter((ListAdapter) this.f31618b);
            listView.setOnItemClickListener(this);
        } catch (NoSuchFieldException e) {
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!intent.hasExtra("EXTRA_HELP_CONFIG") && (bundle == null || bundle.getParcelable("EXTRA_HELP_CONFIG") == null)) {
            ErrorReport j = FeedbackChimeraActivity.m23367j();
            if (j == null) {
                finish();
                return;
            }
            if (aayi.m47267a()) {
                aayi.m47264a(this, j, (int) C0126R.style.DialogActivityStyle, (int) C0126R.style.DarkDialogActivityStyle, (int) C0126R.style.DayNightDialogActivityStyle);
            } else if (aayi.m47268a(j)) {
                setTheme(C0126R.style.DarkDialogActivityStyle);
            }
            mo18621a(j);
            return;
        }
        HelpConfig a = HelpConfig.m66349a(this, bundle, intent);
        if (a != null) {
            this.f31617a = a;
            if (aayi.m47267a()) {
                aayi.m47266a(this, a, (int) C0126R.style.DialogActivityStyle, (int) C0126R.style.DarkDialogActivityStyle, (int) C0126R.style.DayNightDialogActivityStyle);
            } else if (aayi.m47269a(a)) {
                setTheme(C0126R.style.DarkDialogActivityStyle);
            }
            setTitle((int) C0126R.string.gf_account_and_system_info_title);
            setContentView((int) C0126R.C0128layout.gf_preview_activity);
            RecyclerView recyclerView = (RecyclerView) findViewById(C0126R.C0129id.gf_account_and_system_info_viewer);
            recyclerView.setLayoutManager(new aah());
            recyclerView.setAdapter(new wut(this));
            return;
        }
        throw new IllegalStateException("No HelpConfig provided!");
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        wvg wvg = this.f31618b;
        if (wvg != null) {
            wvf wvf = (wvf) wvg.f51411a.get(i);
            if (wvf.mo29445b()) {
                Intent className = new Intent().setClassName(wvg.f51412b, wvf.f51406b);
                className.putExtra("feedback.FIELD_NAME", wvf.f51405a);
                className.putExtra("feedback.FIELD_VALUE", wvf.f51410f);
                if (wvf.f51410f.equals("product specific binary data details")) {
                    className.putExtra("feedback.OBJECT_VALUE", wvf.f51409e.toString());
                }
                wvg.f51412b.startActivity(className);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        HelpConfig helpConfig = this.f31617a;
        if (helpConfig != null) {
            bundle.putParcelable("EXTRA_HELP_CONFIG", helpConfig);
            bundle.putLong("EXTRA_START_TICK", this.f31617a.f78819S);
        }
        super.onSaveInstanceState(bundle);
    }
}
