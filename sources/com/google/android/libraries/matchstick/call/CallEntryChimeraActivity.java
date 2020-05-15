package com.google.android.libraries.matchstick.call;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.chimera.Activity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CallEntryChimeraActivity extends Activity {

    /* renamed from: a */
    public static final bqgg f111063a = bqga.m112775a(Pair.create(Boolean.TRUE, null));

    /* renamed from: b */
    public static final bqgg f111064b = bqga.m112775a(Pair.create(Boolean.FALSE, null));

    /* renamed from: c */
    public static final ComponentName f111065c = new ComponentName("com.google.android.gms", dds.m8209b("ContactsVideoActionActivity"));

    /* renamed from: d */
    public static final ComponentName f111066d = new ComponentName("com.google.android.gms", dds.m8209b("ContactsAudioActionActivity"));

    /* renamed from: e */
    public static final ComponentName f111067e = new ComponentName("com.google.android.gms", dds.m8209b("ContactsPrivilegedVideoActionActivity"));

    /* renamed from: f */
    public static final ComponentName f111068f = new ComponentName("com.google.android.gms", dds.m8209b("ContactsPrivilegedAudioActionActivity"));

    /* renamed from: g */
    public String f111069g;

    /* renamed from: h */
    public azat f111070h;

    /* renamed from: i */
    private bnhe f111071i;

    /* renamed from: a */
    public final bqgg mo60368a(Uri uri, boolean z, boolean z2) {
        if (!dds.m8208a(uri)) {
            azoj.m85933c("CallEntryActivity", "invalid data uri: %s", uri);
            return f111064b;
        }
        Object[] objArr = {Boolean.valueOf(z), Boolean.valueOf(z2)};
        runOnUiThread(new azbd(this, uri, z, z2));
        return f111063a;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        bqgg bqgg;
        super.onCreate(bundle);
        if (cfeo.f183719a.mo6606a().mo80975ai()) {
            Intent intent = getIntent();
            if (intent == null) {
                azoj.m85932b("CallEntryActivity", "null intent.", new Object[0]);
                setResult(0);
                return;
            }
            Object[] objArr = {intent.getComponent().getClassName(), intent.getComponent().getPackageName()};
            String action = intent.getAction();
            if (TextUtils.isEmpty(action)) {
                azoj.m85932b("CallEntryActivity", "No action is specified.", new Object[0]);
                setResult(0);
                return;
            }
            this.f111069g = getCallingPackage();
            this.f111070h = azat.m85170a(getApplicationContext());
            if (this.f111071i == null) {
                bnha a = bnhe.m109406a(6);
                a.mo67695b(ddr.f12948d, new azaw(this));
                a.mo67695b(ddr.f12949e, new azax(this));
                a.mo67695b(ddr.f12950f, new azay(this));
                a.mo67695b(ddr.f12951g, new azaz(this));
                a.mo67695b("android.intent.action.VIEW", new azba(this));
                this.f111071i = a.mo67618b();
            }
            azbf azbf = (azbf) this.f111071i.get(action);
            if (azbf != null) {
                bqgg = azbf.mo54559a(intent);
            } else {
                azoj.m85933c("CallEntryActivity", "Unknown action: %s", action);
                bqgg = f111064b;
            }
            bqga.m112781a(bqdx.m112673a(bqdf.m112620a(bqfl.m112747c(bqgg), Throwable.class, azbb.f98890a, bqfb.INSTANCE), new azbc(this), bqfb.INSTANCE), new azbe(), bqfb.INSTANCE);
            return;
        }
        azoj.m85932b("CallEntryActivity", "TS API disabled.", new Object[0]);
        setResult(0);
    }

    /* renamed from: a */
    public final void mo60369a(int i) {
        azph.m85998a(this).mo55143a(i, azcv.m85357a(this).mo54692a(false), this.f111069g);
    }
}
