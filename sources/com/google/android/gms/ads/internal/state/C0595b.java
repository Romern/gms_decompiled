package com.google.android.gms.ads.internal.state;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.csi.C0376a;
import com.google.android.gms.ads.internal.csi.C0377b;
import com.google.android.gms.ads.internal.csi.C0378c;
import com.google.android.gms.ads.internal.csi.C0383h;
import com.google.android.gms.ads.internal.flag.C0396i;
import com.google.android.gms.ads.internal.util.C0624b;
import com.google.android.gms.ads.internal.util.client.C0633h;
import com.google.android.gms.ads.internal.util.future.C0645d;
import java.io.File;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.ads.internal.state.b */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0595b extends C0624b {

    /* renamed from: a */
    final /* synthetic */ C0597d f8892a;

    public C0595b(C0597d dVar) {
        this.f8892a = dVar;
    }

    /* renamed from: a */
    public final void mo6780a() {
        C0597d dVar = this.f8892a;
        C0376a aVar = new C0376a(dVar.f8896b, dVar.f8897c.f8949a);
        synchronized (this.f8892a.f8895a) {
            try {
                C0387d.m5375m();
                C0378c cVar = this.f8892a.f8898d;
                if (aVar.f8276c == null) {
                    throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
                } else if (!TextUtils.isEmpty(aVar.f8277d)) {
                    Context context = aVar.f8276c;
                    String str = aVar.f8277d;
                    String str2 = aVar.f8274a;
                    Map map = aVar.f8275b;
                    cVar.f8283e = context;
                    cVar.f8284f = str;
                    cVar.f8282d = str2;
                    cVar.f8285g = new AtomicBoolean(false);
                    cVar.f8285g.set(((Boolean) C0396i.f8337b.mo6621a()).booleanValue());
                    if (cVar.f8285g.get()) {
                        File externalStorageDirectory = Environment.getExternalStorageDirectory();
                        if (externalStorageDirectory != null) {
                            cVar.f8286h = new File(externalStorageDirectory, "sdk_csi_data.txt");
                        }
                    }
                    for (Map.Entry entry : map.entrySet()) {
                        cVar.f8280b.put((String) entry.getKey(), (String) entry.getValue());
                    }
                    C0645d.f8973a.execute(new C0377b(cVar));
                    cVar.f8281c.put("action", C0383h.f8289b);
                    cVar.f8281c.put("ad_format", C0383h.f8289b);
                    cVar.f8281c.put("e", C0383h.f8290c);
                } else {
                    throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
                }
            } catch (IllegalArgumentException e) {
                C0633h.m5673d("Cannot config CSI reporter.", e);
            }
        }
    }
}
