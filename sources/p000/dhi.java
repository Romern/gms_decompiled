package p000;

import android.content.Intent;
import java.util.List;

/* renamed from: dhi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dhi {

    /* renamed from: a */
    public final int f13114a;

    /* renamed from: b */
    public final boolean f13115b;

    /* renamed from: c */
    public final Intent f13116c;

    /* renamed from: d */
    public final List f13117d;

    /* renamed from: e */
    public Intent f13118e;

    /* renamed from: f */
    public Intent f13119f;

    /* renamed from: g */
    public int f13120g;

    /* renamed from: h */
    public int f13121h;

    /* renamed from: i */
    public boolean f13122i;

    /* renamed from: j */
    public String f13123j;

    /* renamed from: k */
    public boolean f13124k;

    /* renamed from: l */
    final /* synthetic */ dhm f13125l;

    public dhi(dhm dhm, Intent intent, int i, int i2, List list) {
        this.f13125l = dhm;
        this.f13116c = intent;
        this.f13117d = !dhm.f13150m ? null : list;
        this.f13118e = intent;
        this.f13119f = null;
        this.f13115b = "com.google.android.chimera.container.IntentOperationService.KEEPALIVE".equals(intent.getAction());
        this.f13114a = i;
        this.f13120g = i2;
        this.f13121h = 1;
        this.f13122i = false;
        this.f13123j = null;
        this.f13124k = false;
    }

    /* renamed from: a */
    public final String mo9013a() {
        Intent intent;
        Intent intent2 = this.f13118e;
        if (intent2 == null || (intent = (Intent) intent2.getParcelableExtra("intent")) == null) {
            return null;
        }
        this.f13123j = this.f13118e.getStringExtra("moduleid");
        this.f13118e = intent;
        return intent.getAction();
    }

    /* renamed from: b */
    public final void mo9014b() {
        int i = this.f13121h - 1;
        this.f13121h = i;
        if (i == 0) {
            this.f13118e = null;
            bmzs.m108698a(this.f13119f == null);
            this.f13125l.f13149l.mo9010a(this);
        }
    }
}
