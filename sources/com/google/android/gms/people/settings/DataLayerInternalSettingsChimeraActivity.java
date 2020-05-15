package com.google.android.gms.people.settings;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DataLayerInternalSettingsChimeraActivity extends deu {

    /* renamed from: b */
    private amqx f82045b;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class DataLayerSettingsOperation extends qld {
        /* renamed from: b */
        public final GoogleSettingsItem mo7154b() {
            amig.m62939a();
            if (((Boolean) amho.f74917a.mo41191a()).booleanValue()) {
                Intent intent = new Intent("com.google.android.gms.people.settings.INTERNAL_SETTINGS");
                intent.putExtra("settings_mode", 2);
                GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(intent, 2, "APDL Debug", 5);
                googleSettingsItem.f29961g = true;
                return googleSettingsItem;
            }
            GoogleSettingsItem googleSettingsItem2 = new GoogleSettingsItem(new Intent("com.google.android.gms.people.settings.DATA_LAYER_SETTINGS"), 2, "APDL Debug", 5);
            googleSettingsItem2.f29961g = true;
            return googleSettingsItem2;
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        amqx amqx = new amqx(true);
        this.f82045b = amqx;
        amqx.mo41264a(this);
        ViewGroup viewGroup = (ViewGroup) findViewById(16908290);
        viewGroup.addView(this.f82045b.mo41263a(getLayoutInflater(), viewGroup));
    }
}
