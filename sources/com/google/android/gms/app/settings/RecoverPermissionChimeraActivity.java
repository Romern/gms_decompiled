package com.google.android.gms.app.settings;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RecoverPermissionChimeraActivity extends Activity {

    /* renamed from: a */
    private Set f9514a;

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 0 || !sft.f44147a.mo25486a(this.f9514a).isEmpty()) {
            setResult(0);
        } else {
            setResult(-1);
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("requiredGroups");
        if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
            setResult(-1);
            finish();
            return;
        }
        this.f9514a = new HashSet(stringArrayListExtra);
        Set a = sft.f44147a.mo25486a(this.f9514a);
        if (!a.isEmpty()) {
            fqh fqh = new fqh();
            Bundle bundle2 = new Bundle();
            bundle2.putStringArrayList("missingGroups", new ArrayList(a));
            fqh.setArguments(bundle2);
            fqh.show(getSupportFragmentManager(), "PermissionsDialog");
            return;
        }
        setResult(-1);
        finish();
    }
}
