package com.google.android.gms.googlehelp.helpactivities;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OpenHelpChimeraActivity extends Activity {
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent g = spn.m35889g("com.google.android.gms.googlehelp.HELP");
        Intent intent = getIntent();
        if (intent.hasExtra("EXTRA_HELP_CONFIG")) {
            g.putExtras(intent);
            if (intent.getData() != null) {
                g.setData(intent.getData());
            }
            startActivityForResult(g, 111);
            return;
        }
        throw new IllegalStateException("OpenHelpChimeraActivity requires a HelpConfig extra.");
    }
}
