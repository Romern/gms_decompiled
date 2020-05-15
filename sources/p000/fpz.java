package p000;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.chimera.GoogleSettingsItem;
import java.util.ArrayList;

/* renamed from: fpz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class fpz extends qkh {
    /* renamed from: a */
    public final void mo7102a(sug sug, Bundle bundle) {
        Intent intent = getIntent();
        if (intent.hasExtra("items")) {
            ArrayList b = sef.m35076b(intent, "items", GoogleSettingsItem.CREATOR);
            int size = b.size();
            for (int i = 0; i < size; i++) {
                GoogleSettingsItem googleSettingsItem = (GoogleSettingsItem) b.get(i);
                sui b2 = qkh.m32282b(this);
                b2.mo26085a(googleSettingsItem.f29958d);
                b2.mo26100a(googleSettingsItem.f29956b);
                b2.mo26105b(googleSettingsItem.f29963i);
                b2.mo26104a(googleSettingsItem.f29964j);
                int i2 = googleSettingsItem.f29959e;
                if (i2 > 0) {
                    b2.mo26086b(i2);
                }
                ((svi) sug).f45221a.mo26149a(b2);
            }
        }
    }

    /* renamed from: i */
    public final void mo7107i() {
        getIntent().getIntExtra("id", 0);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent.hasExtra("title")) {
            setTitle(intent.getStringExtra("title"));
        }
    }
}
