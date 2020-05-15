package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: amqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class amqd extends aaab {

    /* renamed from: Dl */
    private bmza f75724Dl;

    /* renamed from: Dm */
    private final Set f75725Dm;

    /* renamed from: Dr */
    private final boolean f75726Dr;

    /* renamed from: h */
    public final sce f75727h;

    /* renamed from: i */
    protected final String f75728i;

    /* renamed from: j */
    protected final int f75729j;

    /* renamed from: k */
    public final String f75730k;

    /* renamed from: l */
    public final String f75731l;

    /* renamed from: o */
    public boolean f75732o;

    /* renamed from: p */
    public boolean f75733p;

    /* renamed from: q */
    public final Set f75734q;

    /* renamed from: r */
    protected almh f75735r;

    public amqd(String str, int i, String str2, String str3) {
        this(str, i, str2, str3, null);
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        try {
            if (!this.f75726Dr || almh.m61258a(this.f75730k) != 1) {
                mo40603b(context);
            } else {
                almh almh = new almh(this.f75730k);
                this.f75735r = almh;
                almh.f73688b = this.f75731l;
                almh.f73689c = this.f75728i;
                almh.mo40510b(1, 0);
                mo40603b(context);
                this.f75735r.mo40509a(almk.m61269b(2, this.f75724Dl.mo66928a(TimeUnit.MICROSECONDS)));
                almh almh2 = this.f75735r;
                almh2.f73687a.mo40512a(1, almh2.f73703q, almh2.f73688b, almh2.f73689c, almh2.f73704r, almh2.f73691e, almh2.f73707u, almh2.f73690d, null, null, null, cfyx.f186184a.mo6606a().mo83151c());
                this.f75724Dl.mo66931e();
            }
        } finally {
            mo41261b(this.f75732o);
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo40627a(boolean z) {
    }

    /* renamed from: b */
    public abstract void mo40603b(Context context);

    /* renamed from: b */
    public final void mo41261b(boolean z) {
        if (!z) {
            for (anco anco : this.f75734q) {
                Log.w("PipeCreator", "This log should only show up during unit tests.");
                anco.mo41704a(false);
            }
        } else {
            for (DataHolder dataHolder : this.f75725Dm) {
                dataHolder.close();
            }
            for (anco anco2 : this.f75734q) {
                anco2.close();
            }
        }
        mo40627a(z);
    }

    protected amqd(String str, int i, String str2, String str3, byte[] bArr) {
        super(5, str3);
        boolean z = false;
        this.f75732o = false;
        this.f75733p = false;
        this.f75725Dm = new HashSet();
        this.f75734q = new HashSet();
        sdo.m34977c(str);
        sdo.m34974b(i != 0 ? true : z);
        this.f75728i = str;
        this.f75729j = i;
        this.f75730k = str3;
        this.f75731l = str2;
        boolean c = cfyx.m143986c();
        this.f75726Dr = c;
        if (c) {
            this.f75724Dl = bmza.m108659b(bmvy.f131119a);
        }
        this.f75727h = new amqc(this);
    }

    /* renamed from: a */
    public final void mo41260a(DataHolder dataHolder) {
        if (dataHolder != null) {
            this.f75725Dm.add(dataHolder);
        }
    }
}
