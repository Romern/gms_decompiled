package p000;

import android.content.Context;
import android.util.Log;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;

/* renamed from: aalx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aalx {

    /* renamed from: a */
    public final Context f28422a;

    /* renamed from: b */
    public final aamk f28423b;

    /* renamed from: c */
    public final aakl f28424c;

    /* renamed from: d */
    private NavigableMap f28425d;

    /* renamed from: e */
    private String f28426e;

    public aalx(Context context, aamk aamk, aakl aakl) {
        this.f28422a = context;
        this.f28423b = aamk;
        this.f28424c = aakl;
    }

    /* renamed from: a */
    public final int mo16986a(aamh aamh) {
        int i;
        Map.Entry b = mo16989b(aamh);
        if (b != null) {
            i = ((Integer) b.getValue()).intValue();
        } else {
            i = Integer.MAX_VALUE;
        }
        return !mo16988a(aamh, System.currentTimeMillis()) ? Math.max(0, i - this.f28423b.mo17027b(aamh).f28462c) : i;
    }

    /* renamed from: b */
    public final Map.Entry mo16989b(aamh aamh) {
        NavigableMap a = mo16987a();
        if (a != null) {
            return a.floorEntry(Integer.valueOf(aajg.m21332a(aakb.m21381a().f28351l.mo17012b(aamh.f28458b), aamh)));
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized NavigableMap mo16987a() {
        String c = cebv.f182235a.mo6606a().mo78744c();
        if (!c.equals(this.f28426e)) {
            bnim bnim = null;
            if (!c.isEmpty()) {
                List c2 = bmyx.m108640a(',').mo66925c((CharSequence) c);
                if (c2.size() % 2 != 0) {
                    String valueOf = String.valueOf(c);
                    Log.w("GCM", valueOf.length() == 0 ? new String("Ignoring malformed quotas flag: ") : "Ignoring malformed quotas flag: ".concat(valueOf));
                } else {
                    bnik b = bnim.m109535b();
                    int i = 0;
                    while (i < c2.size()) {
                        try {
                            b.mo67695b(Integer.valueOf(Integer.parseInt((String) c2.get(i))), Integer.valueOf(Integer.parseInt((String) c2.get(i + 1))));
                            i += 2;
                        } catch (NumberFormatException e) {
                            String valueOf2 = String.valueOf(c);
                            Log.w("GCM", valueOf2.length() == 0 ? new String("Ignoring malformed quotas flag: ") : "Ignoring malformed quotas flag: ".concat(valueOf2));
                        }
                    }
                    bnim = b.mo67618b();
                }
            }
            this.f28425d = bnim;
            this.f28426e = c;
            return bnim;
        }
        return this.f28425d;
    }

    /* renamed from: a */
    public final boolean mo16988a(aamh aamh, long j) {
        long j2 = j - this.f28423b.mo17027b(aamh).f28461b;
        return j2 < 0 || j2 > cecz.f182285a.mo6606a().mo78807Z();
    }
}
