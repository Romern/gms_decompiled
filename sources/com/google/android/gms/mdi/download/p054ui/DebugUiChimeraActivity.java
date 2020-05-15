package com.google.android.gms.mdi.download.p054ui;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.mdi.download.ui.DebugUiChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DebugUiChimeraActivity extends deu {

    /* renamed from: b */
    public ArrayAdapter f80024b;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: rjx.<init>(android.content.Context, boolean[]):void
     arg types: [com.google.android.gms.mdi.download.ui.DebugUiChimeraActivity, ?[OBJECT, ARRAY]]
     candidates:
      rjx.<init>(android.content.Context, allq):void
      rjx.<init>(android.content.Context, auzy):void
      rjx.<init>(android.content.Context, avty):void
      rjx.<init>(android.content.Context, rjg):void
      rjx.<init>(android.content.Context, rjw):void
      rjx.<init>(android.content.Context, byte[]):void
      rjx.<init>(android.content.Context, char[]):void
      rjx.<init>(android.content.Context, float[]):void
      rjx.<init>(android.content.Context, int[]):void
      rjx.<init>(android.content.Context, short[]):void
      rjx.<init>(android.content.Context, boolean[]):void */
    /* renamed from: e */
    public final void mo43956e() {
        new rjx((Context) this, (boolean[]) null).mo24701a((rpa) new afjr()).mo50373a(new afqf(this));
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0126R.C0128layout.mdd_debug_activity);
        setTitle((int) C0126R.string.mdd_debug_ui_title);
        ((Button) findViewById(C0126R.C0129id.refresh_file_group_list)).setOnClickListener(new afpv(this));
        ((Button) findViewById(C0126R.C0129id.delete_all_downloaded_files)).setOnClickListener(new afpw(this));
        ((Button) findViewById(C0126R.C0129id.trigger_download)).setOnClickListener(new afpx(this));
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367043, new ArrayList());
        this.f80024b = arrayAdapter;
        ((ListView) findViewById(C0126R.C0129id.file_group_list)).setAdapter((ListAdapter) arrayAdapter);
        mo43956e();
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 1, 0, "Trigger Maintenance Task").setOnMenuItemClickListener(new afqg(this));
        return super.onCreateOptionsMenu(menu);
    }
}
