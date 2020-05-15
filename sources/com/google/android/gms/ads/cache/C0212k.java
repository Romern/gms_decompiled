package com.google.android.gms.ads.cache;

import android.content.Context;
import com.google.android.gms.ads.internal.cache.C0323e;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.util.future.C0647f;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.cache.k */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0212k implements C0323e {

    /* renamed from: a */
    public static final JSONObject f7885a = new JSONObject();

    /* renamed from: b */
    private final ExecutorService f7886b = new soc(1, 10);

    /* renamed from: a */
    public final JSONObject mo6419a(Context context) {
        return (JSONObject) C0647f.m5687a(((soc) this.f7886b).submit(new C0211j(context)), new JSONObject(), (long) ((Integer) C0371o.f8228af.mo6604a()).intValue(), TimeUnit.MILLISECONDS);
    }
}
