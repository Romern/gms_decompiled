package com.google.android.gms.update.phone;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OtaSuggestionChimeraActivity extends Activity {
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        startActivity(new Intent().setClassName(this, "com.google.android.gms.update.SystemUpdateActivity"));
        finish();
    }
}
