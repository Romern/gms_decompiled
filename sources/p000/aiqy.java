package p000;

import android.content.Context;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.Closeable;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aiqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiqy implements aiqp {

    /* renamed from: a */
    public static final byte[] f69521a = {0, 0, 0};

    /* renamed from: b */
    public final String f69522b;

    /* renamed from: c */
    public final CountDownLatch f69523c = new CountDownLatch(1);

    /* renamed from: d */
    public final airj f69524d;

    /* renamed from: e */
    public final blux f69525e;

    /* renamed from: f */
    public final aiqm f69526f;

    /* renamed from: g */
    public final Map f69527g = new C1223np();

    /* renamed from: h */
    private final ExecutorService f69528h = ahhr.m55806b();

    /* renamed from: i */
    private final blun f69529i;

    public aiqy(String str, blun blun, airj airj, aiqm aiqm) {
        this.f69522b = str;
        this.f69529i = blun;
        this.f69524d = airj;
        this.f69526f = aiqm;
        if (!(blun instanceof blvp)) {
            this.f69525e = new blvv(blun, new aiqx(this));
        } else {
            this.f69525e = new blvx(blun, new aiqx(this));
        }
    }

    /* renamed from: a */
    public static aiqy m57748a(Context context, String str, airj airj) {
        try {
            aiqy aiqy = new aiqy(str, (blun) new blvi(context, null, new aiqs(), airk.f69554a, airk.f69556c, airk.f69557d, 512).mo66750a(str).get(cfnv.m140786j(), TimeUnit.MILLISECONDS), airj, null);
            try {
                aiqy.mo37877b();
                return aiqy;
            } catch (IOException e) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("aiqy", "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("MultiplexBleSocketV1 failed to connect to server %s.", str);
                aiqy.mo37872a();
                return null;
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            if (e2 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68388c();
            bnsl2.mo68437a(e2);
            bnsl2.mo68432a("aiqy", "a", 130, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("MultiplexBleSocketV1 failed to establish a GATT connection to server %s.", str);
            return null;
        }
    }

    /* renamed from: b */
    private final void m57751b(byte[] bArr) {
        byte[] bArr2 = f69521a;
        bxvd da = bvgi.f156000e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvgi bvgi = (bvgi) da.f164949b;
        bvgi.f156003b = 2;
        bvgi.f156002a |= 1;
        bxvd da2 = bvge.f155990c.mo74144da();
        ByteString a = ByteString.m123261a(bArr);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bvge bvge = (bvge) da2.f164949b;
        a.getClass();
        bvge.f155992a |= 1;
        bvge.f155993b = a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvgi bvgi2 = (bvgi) da.f164949b;
        bvge bvge2 = (bvge) da2.mo74062i();
        bvge2.getClass();
        bvgi2.f156005d = bvge2;
        bvgi2.f156002a |= 4;
        byte[] a2 = aips.m57683a(bArr2, ((bvgi) da.mo74062i()).serializeToBytes());
        if (a2 != null) {
            this.f69525e.mo66704b(a2).mo66727a(new aiqr(this, bArr));
            return;
        }
        bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
        bnsl.mo68432a("aiqy", "b", 341, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("MultiplexBleSocketV1 failed to create a disconnection packet for service ID hash %s.", ails.m57438a(bArr));
    }

    /* renamed from: a */
    static aiqy m57749a(blvp blvp, airj airj, aiqm aiqm) {
        String c = blvp.mo66756c();
        aiqy aiqy = new aiqy(c, blvp, airj, aiqm);
        try {
            aiqy.mo37877b();
            return aiqy;
        } catch (IOException e) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("aiqy", "a", 180, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("MultiplexBleSocketV1 failed to connect to client %s.", c);
            aiqy.mo37872a();
            return null;
        }
    }

    /* renamed from: a */
    private final void m57750a(String str) {
        byte[] bArr = f69521a;
        bxvd da = bvgi.f156000e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvgi bvgi = (bvgi) da.f164949b;
        bvgi.f156003b = 1;
        bvgi.f156002a |= 1;
        bxvd da2 = bvgf.f155994d.mo74144da();
        ByteString a = ByteString.m123261a(m57752b(str));
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bvgf bvgf = (bvgf) da2.f164949b;
        a.getClass();
        int i = bvgf.f155996a | 1;
        bvgf.f155996a = i;
        bvgf.f155997b = a;
        bvgf.f155998c = 2;
        bvgf.f155996a = i | 2;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvgi bvgi2 = (bvgi) da.f164949b;
        bvgf bvgf2 = (bvgf) da2.mo74062i();
        bvgf2.getClass();
        bvgi2.f156004c = bvgf2;
        bvgi2.f156002a |= 2;
        byte[] a2 = aips.m57683a(bArr, ((bvgi) da.mo74062i()).serializeToBytes());
        if (a2 != null) {
            try {
                this.f69525e.mo66704b(a2).get(cfnv.m140787k(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                if (e instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                throw new IOException(String.format("MultiplexBleSocketV1 failed to send the introduction packet to %s for service ID %s", this.f69522b, str));
            }
        } else {
            throw new IOException(String.format("MultiplexBleSocketV1 failed to create the introduction packet for service ID %s", str));
        }
    }

    /* renamed from: b */
    private static byte[] m57752b(String str) {
        return ails.m57446a(str.getBytes(), 3);
    }

    /* renamed from: b */
    public final synchronized aiqi mo37863a(int i, String str) {
        aiqi a = mo37871a(i, m57752b(str));
        if (a == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("aiqy", "b", 228, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("MultiplexBleSocketV1 failed to create a new outgoing BLE socket for service ID %s because the BLE socket failed to initialize.", str);
            return null;
        }
        try {
            m57750a(str);
            return a;
        } catch (IOException e) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68388c();
            bnsl2.mo68432a("aiqy", "b", 239, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("MultiplexBleSocketV1 failed to create a new outgoing BLE socket for service ID %s because it failed to send an intro packet.", str);
            srz.m36171a(a);
            return null;
        }
    }

    /* renamed from: b */
    public final void mo37877b() {
        blux blux = this.f69525e;
        if (blux instanceof blvv) {
            blux.mo66733f();
        }
        try {
            if (!this.f69523c.await(cfnv.m140786j(), TimeUnit.MILLISECONDS)) {
                throw new IOException(String.format("MultiplexBleSocketV1 failed to initialize Weave protocol with %s because it never received a connection callback", this.f69522b));
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException(String.format("MultiplexBleSocketV1 failed to initialize Weave protocol with %s because it was interrupted while waiting for connection establishment", this.f69522b));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized aiqi mo37871a(int i, byte[] bArr) {
        String d = sqd.m35972d(bArr);
        if (this.f69527g.containsKey(d)) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aiqy", "a", (int) PSKKeyManager.MAX_KEY_LENGTH_BYTES, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("MultiplexBleSocketV1 failed to create a new BLE socket for service ID hash %s because there is already an active BLE socket under the same service ID.", ails.m57438a(bArr));
            return null;
        }
        PipedInputStream pipedInputStream = new PipedInputStream();
        try {
            aiqi aiqi = new aiqi(bArr, pipedInputStream, new PipedOutputStream(pipedInputStream), new aiqe(bArr, this.f69525e), new aiqq(this, bArr));
            this.f69527g.put(d, aiqi);
            return aiqi;
        } catch (IOException e) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("aiqy", "a", 272, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("MultiplexBleSocketV1 failed to create a new BLE socket for service ID hash %s because the piped output stream failed to initialize.", ails.m57438a(bArr));
            srz.m36171a((Closeable) pipedInputStream);
            return null;
        }
    }

    /* renamed from: a */
    public final synchronized void mo37872a() {
        for (aiqi aiqi : this.f69527g.values()) {
            aiqi.mo37853f();
        }
        this.f69527g.clear();
        this.f69525e.mo66698a();
        this.f69529i.mo66713b();
    }

    /* renamed from: a */
    public final void mo37873a(Runnable runnable) {
        this.f69528h.execute(runnable);
    }

    /* renamed from: a */
    public final synchronized void mo37874a(byte[] bArr) {
        aiqi aiqi = (aiqi) this.f69527g.remove(sqd.m35972d(bArr));
        if (aiqi != null) {
            aiqi.mo37853f();
            if (this.f69527g.isEmpty()) {
                mo37872a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo37875a(byte[] bArr, bluu bluu) {
        if (!bluu.mo66725b()) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aiqy", "a", 356, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68424a("MultiplexBleSocketV1 failed to send a disconnection packet to %s for service ID hash %s.", this.f69522b, ails.m57438a(bArr));
        }
    }
}
