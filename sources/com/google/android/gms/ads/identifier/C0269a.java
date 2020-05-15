package com.google.android.gms.ads.identifier;

import android.net.Uri;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.identifier.a */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0269a extends Thread {

    /* renamed from: a */
    final /* synthetic */ Map f7980a;

    public C0269a(Map map) {
        this.f7980a = map;
    }

    public final void run() {
        Map map = this.f7980a;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        C0273e.m5157a(buildUpon.build().toString());
    }
}
