package p000;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ajsl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajsl {

    /* renamed from: o */
    private static long f71228o = 0;

    /* renamed from: a */
    public long f71229a = -1;

    /* renamed from: b */
    public String f71230b;

    /* renamed from: c */
    public Uri f71231c;

    /* renamed from: d */
    public int f71232d = 1;

    /* renamed from: e */
    public Bundle f71233e = new Bundle();

    /* renamed from: f */
    public List f71234f = new ArrayList();

    /* renamed from: g */
    public List f71235g = new ArrayList();

    /* renamed from: h */
    public List f71236h = new ArrayList();

    /* renamed from: i */
    public boolean f71237i;

    /* renamed from: j */
    public String f71238j;

    /* renamed from: k */
    public boolean f71239k;

    /* renamed from: l */
    public String f71240l;

    /* renamed from: m */
    public PendingIntent f71241m;

    /* renamed from: n */
    public boolean f71242n;

    /* renamed from: c */
    private static synchronized long m58965c() {
        long j;
        synchronized (ajsl.class) {
            j = f71228o;
            f71228o = 1 + j;
        }
        return j;
    }

    /* renamed from: a */
    public final ShareTarget mo38887a() {
        long j;
        sdo.m34975b(!TextUtils.isEmpty(this.f71230b), "ShareTarget deviceName must not be null or empty.");
        long j2 = this.f71229a;
        if (j2 == -1) {
            long c = m58965c();
            this.f71229a = c;
            j = c;
        } else {
            j = j2;
        }
        return new ShareTarget(j, this.f71230b, this.f71231c, this.f71232d, this.f71233e, this.f71234f, this.f71235g, this.f71236h, this.f71237i, this.f71238j, this.f71239k, this.f71240l, this.f71241m, this.f71242n);
    }

    /* renamed from: b */
    public final void mo38888b() {
        this.f71239k = true;
    }
}
