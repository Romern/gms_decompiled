package p000;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import androidx.slice.Slice;
import androidx.slice.SliceItemHolder;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.CountDownLatch;

/* renamed from: abyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abyb extends acpn {

    /* renamed from: a */
    public int f58715a = 0;

    /* renamed from: b */
    private final Context f58716b;

    /* renamed from: c */
    private final Uri f58717c;

    /* renamed from: d */
    private final CountDownLatch f58718d = new CountDownLatch(1);

    /* renamed from: e */
    private final abya f58719e = new abya();

    /* renamed from: f */
    private final abxz f58720f;

    /* renamed from: n */
    private final apr f58721n;

    /* renamed from: o */
    private final abyl f58722o;

    /* renamed from: p */
    private long f58723p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public abyb(bqbd bqbd, String str, Context context, Uri uri, abyl abyl) {
        super(bqbd, 1, str);
        apr a = apr.m1818a(context);
        this.f58716b = context;
        this.f58717c = uri;
        this.f58720f = new abxz(this);
        this.f58721n = a;
        this.f58722o = abyl;
        bxvd da = bpwy.f139590c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpwy bpwy = (bpwy) da.f164949b;
        str.getClass();
        bpwy.f139592a |= 1;
        bpwy.f139593b = str;
        this.f58722o.mo24377a(((bpwy) da.mo74062i()).mo73642k());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11132a() {
        try {
            this.f58721n.mo2274a(this.f58717c, this.f58720f);
            this.f58723p = SystemClock.elapsedRealtime();
            mo32427a(this.f58721n.mo2277c(this.f58717c));
        } catch (Exception e) {
            this.f58719e.mo32426a(new abxx("Slice error. Internal error while trying to retrieve the Slice.", this.f58717c, bpzq.INTERNAL_ERROR));
        }
        return this.f58719e;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
        if (r4.f58718d.await(((java.lang.Long) p000.abzt.f58975cj.mo58455c()).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS) == false) goto L_0x001f;
     */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo32428b(Object obj) {
        abya abya = (abya) obj;
        if (!abya.f58714c) {
        }
        this.f58722o.mo24385d("SliceRetrievalCallbacks").mo24367a(this.f58715a);
        absg.m48203d("Took %d callbacks to retrieve Slice uri %s", Integer.valueOf(this.f58715a), this.f58717c);
        try {
            this.f58721n.mo2276b(this.f58717c, this.f58720f);
        } catch (Exception e) {
            abya.mo32426a(new abxx("Slice error. Internal error while trying to retrieve the Slice.", this.f58717c, bpzq.INTERNAL_ERROR));
            return;
        }
        this.f58722o.mo24383c("SliceRetrievalTimeouts").mo24359a();
        abya.mo32426a(new abxx("Slice error. Timed out waiting for Slice.", this.f58717c, bpzq.SLICE_TIMED_OUT));
        this.f58722o.mo24385d("SliceRetrievalCallbacks").mo24367a(this.f58715a);
        absg.m48203d("Took %d callbacks to retrieve Slice uri %s", Integer.valueOf(this.f58715a), this.f58717c);
        this.f58721n.mo2276b(this.f58717c, this.f58720f);
    }

    /* renamed from: a */
    public final void mo32427a(Slice slice) {
        if (slice != null) {
            try {
                if (apm.m1814a(slice).mo2271a() != 2) {
                    absg.m48186a("Slice retrieval incomplete. Uri %s, loadingState %d", this.f58717c, Integer.valueOf(apm.m1814a(slice).mo2271a()));
                    return;
                }
            } catch (Exception e) {
                this.f58719e.mo32426a(new abxx("Slice error. Internal error while trying to retrieve the Slice.", this.f58717c, bpzq.INTERNAL_ERROR));
                return;
            }
        }
        if (slice != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Context context = this.f58716b;
                C0030app app = new C0030app();
                app.f1940a = 2;
                app.f1941b = 2;
                synchronized (SliceItemHolder.f1662a) {
                    SliceItemHolder.f1663b = new apo(context, app);
                    avf avf = new avf(null, byteArrayOutputStream, new C1245ok(), new C1245ok(), new C1245ok());
                    avf.mo2674a(slice);
                    avf.mo2691b();
                    SliceItemHolder.f1663b = null;
                }
                abya abya = this.f58719e;
                abya.f58712a = byteArrayOutputStream;
                abya.f58714c = true;
                abyl abyl = this.f58722o;
                abyl.mo24380b("SerializedSliceBytes", abyl.f58735q).mo24368a((long) byteArrayOutputStream.size());
            } catch (Exception e2) {
                absg.m48184a("IOException while serializing Slice");
                this.f58719e.mo32426a(new abxx("Slice error. Slice is not serializable.", this.f58717c, bpzq.INVALID_SLICE_ARGUMENT));
            }
        } else {
            this.f58719e.mo32426a(new abxx("Slice error. Received null Slice.", this.f58717c, bpzq.NULL_SLICE));
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f58723p;
        abyl abyl2 = this.f58722o;
        abyl2.mo24380b("SliceRetrievalLatencyMs", abyl2.f58736r).mo24368a(elapsedRealtime);
        absg.m48203d("Retrieved Slice uri %s in %d ms", this.f58717c, Long.valueOf(elapsedRealtime));
        this.f58718d.countDown();
    }
}
