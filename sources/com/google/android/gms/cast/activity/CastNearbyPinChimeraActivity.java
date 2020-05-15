package com.google.android.gms.cast.activity;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.FragmentActivity;
import java.util.HashMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CastNearbyPinChimeraActivity extends FragmentActivity {

    /* renamed from: a */
    static HashMap f29864a;

    /* renamed from: b */
    public phs f29865b;

    static {
        HashMap hashMap = new HashMap();
        f29864a = hashMap;
        hashMap.put("com.google.android.gms.cast.session.CAST_NEARBY_PIN_REQUEST", pgx.f39090a);
        f29864a.put("consent", pgy.f39091a);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        phs phs = this.f29865b;
        if (phs != null) {
            phs.mo23064a(i, i2, intent);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f29865b = null;
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("ACTIVITY_TYPE");
        if (stringExtra == null) {
            stringExtra = intent.getAction();
        }
        if (stringExtra != null && f29864a.containsKey(stringExtra)) {
            phs a = ((phr) f29864a.get(stringExtra)).mo23066a(this);
            this.f29865b = a;
            a.mo23065a(bundle);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        super.onDestroy();
        phs phs = this.f29865b;
        if (phs != null) {
            phs.mo23081d();
        }
    }

    public final void onNewIntent(Intent intent) {
        phs phs = this.f29865b;
        if (phs != null) {
            phs.mo23077a(intent);
        }
    }

    /* access modifiers changed from: protected */
    public final void onRestart() {
        super.onRestart();
        phs phs = this.f29865b;
        if (phs != null) {
            phs.mo23079b();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        phs phs = this.f29865b;
        if (phs != null) {
            phs.mo23076a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        phs phs = this.f29865b;
        if (phs != null) {
            phs.mo23080c();
        }
    }
}
