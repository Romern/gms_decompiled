package p000;

import android.content.Context;
import android.os.SystemClock;
import java.util.Random;

/* renamed from: bftg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bftg {

    /* renamed from: a */
    public final qws f115200a;

    /* renamed from: b */
    public final Random f115201b;

    /* renamed from: c */
    public int f115202c;

    /* renamed from: d */
    public int f115203d;

    /* renamed from: e */
    public int f115204e;

    /* renamed from: f */
    public int f115205f;

    /* renamed from: g */
    public int f115206g;

    /* renamed from: h */
    public int f115207h;

    /* renamed from: i */
    public int f115208i;

    /* renamed from: j */
    public int f115209j;

    /* renamed from: k */
    public long f115210k;

    /* renamed from: l */
    public long f115211l;

    /* renamed from: m */
    public long f115212m;

    /* renamed from: n */
    public long f115213n;

    /* renamed from: o */
    public long f115214o;

    /* renamed from: p */
    public long f115215p;

    /* renamed from: q */
    public long f115216q;

    /* renamed from: r */
    public final rjx f115217r;

    public bftg(Context context) {
        qws qws = new qws(context, "LE", null);
        rjx b = avtz.m79338b(context);
        Random random = new Random();
        this.f115200a = qws;
        this.f115217r = b;
        this.f115201b = random;
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: a */
    public final void mo62235a(boolean z) {
        if (cest.m138200f()) {
            if (this.f115214o > 0) {
                this.f115206g = (int) (SystemClock.elapsedRealtime() - this.f115214o);
            }
            this.f115214o = 0;
            if (z) {
                this.f115203d++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo62236a(boolean z, boolean z2) {
        if (cest.m138200f()) {
            if (this.f115214o > 0) {
                this.f115206g = (int) (SystemClock.elapsedRealtime() - this.f115214o);
            }
            this.f115214o = 0;
            if (z) {
                this.f115204e++;
            }
            if (z2) {
                this.f115203d++;
            }
        }
    }
}
