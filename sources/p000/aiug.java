package p000;

import android.net.wifi.aware.DiscoverySession;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: aiug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aiug {

    /* renamed from: a */
    public final aivd f69778a;

    /* renamed from: b */
    public final aitq f69779b;

    /* renamed from: c */
    public final ExecutorService f69780c;

    /* renamed from: d */
    public final ExecutorService f69781d;

    /* renamed from: e */
    public final ScheduledExecutorService f69782e;

    /* renamed from: f */
    public final aiuf f69783f;

    public aiug(aivd aivd, aitq aitq) {
        ScheduledExecutorService a = ahhr.m55804a();
        bqgj b = ahhr.m55806b();
        bqgj b2 = ahhr.m55806b();
        this.f69778a = aivd;
        this.f69779b = aitq;
        this.f69782e = a;
        this.f69780c = b;
        this.f69781d = b2;
        this.f69783f = new aiuf(aivd);
    }

    /* renamed from: a */
    private final bvgz m57961a(InputStream inputStream, int i, boolean z) {
        Short sh = null;
        while (true) {
            bvgz bvgz = (bvgz) GeneratedMessageLite.m124026b(bvgz.f156059f, inputStream);
            int i2 = 1;
            if (bvgz != null) {
                int i3 = bvgz.f156061a;
                if (!((i3 & 32) == 0 || (i3 & 64) == 0 || bvgz.f156065e.mo73744a() != 2)) {
                    sh = Short.valueOf(bqct.m112601a(bvgz.f156065e.getKey()));
                    int i4 = bvgz.f156064d;
                    if (i4 <= this.f69783f.mo38039a(sh.shortValue())) {
                        srn srn = ailf.f69111a;
                    } else {
                        this.f69783f.mo38040a(sh.shortValue(), i4);
                    }
                }
                int b = bvgy.m121106b(bvgz.f156062b);
                if (b == 0) {
                    b = 1;
                }
                if (b == i) {
                    return bvgz;
                }
                int b2 = bvgy.m121106b(bvgz.f156062b);
                if (b2 != 0 && b2 == 5) {
                    Object[] objArr = new Object[1];
                    String a = bvgy.m121105a(i);
                    if (i != 0) {
                        objArr[0] = a;
                        throw new IOException(String.format("Remotely cancelled while waiting for frame %s", objArr));
                    }
                    throw null;
                }
                bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
                bnsl.mo68432a("aiug", "a", 514, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                int b3 = bvgy.m121106b(bvgz.f156062b);
                if (b3 != 0) {
                    i2 = b3;
                }
                String a2 = bvgy.m121105a(i2);
                String a3 = bvgy.m121105a(i);
                if (i != 0) {
                    bnsl.mo68424a("Found WifiAwareFrame of type %s instead %s. Skipping and continuing to read.", a2, a3);
                } else {
                    throw null;
                }
            } else {
                if (sh != null) {
                    this.f69783f.mo38042a(sh.shortValue(), z);
                }
                Object[] objArr2 = new Object[1];
                String a4 = bvgy.m121105a(i);
                if (i != 0) {
                    objArr2[0] = a4;
                    throw new bxwf(String.format("Failed to parse WifiAwareFrame of type %s", objArr2));
                }
                throw null;
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aiug.a(java.io.InputStream, int, boolean):bvgz
     arg types: [java.io.InputStream, int, int]
     candidates:
      aiug.a(aivg, java.lang.String, ahfk):aivx
      aiug.a(aivg, java.lang.String, aivo):void
      aiug.a(java.io.InputStream, int, boolean):bvgz */
    /* renamed from: b */
    public final bvgz mo38054b(InputStream inputStream, int i) {
        return m57961a(inputStream, i, false);
    }

    /* renamed from: a */
    public static void m57962a(aivg aivg, bvgz bvgz) {
        srn srn = ailf.f69111a;
        int i = bvgz.f156062b;
        byte[] k = bvgz.serializeToBytes();
        int length = k.length;
        aive aive = aivg.f69869e;
        byte[] bArr = new byte[(length + 1)];
        System.arraycopy(new byte[]{(byte) length}, 0, bArr, 0, 1);
        System.arraycopy(k, 0, bArr, 1, length);
        aive.write(bArr);
    }

    /* renamed from: a */
    public final aivx mo38047a(aivg aivg, String str, ahfk ahfk) {
        aitq aitq;
        aivg aivg2 = aivg;
        short a = bqct.m112601a(aivg2.f69865a.f69912d);
        DiscoverySession discoverySession = aivg2.f69865a.f69911c;
        if (this.f69783f.mo38043b(a)) {
            srn srn = ailf.f69111a;
            ails.m57438a(this.f69778a.mo38105d());
            return null;
        }
        this.f69783f.mo38041a(a, aivg2);
        bqgy c = bqgy.m112818c();
        this.f69780c.execute(new aitt(this, aivg, ahfk, str, a, c));
        try {
            this.f69779b.mo38012a(discoverySession);
            aivx aivx = (aivx) c.get();
            this.f69779b.mo38021b(discoverySession);
            return aivx;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aiug", "a", 432, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Interrupted while waiting to connect to WiFi Aware network");
            aitq = this.f69779b;
        } catch (ExecutionException e2) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
            bnsl2.mo68437a(e2);
            bnsl2.mo68432a("aiug", "a", 434, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Failed to connect to WiFi Aware network");
            aitq = this.f69779b;
        } catch (Throwable th) {
            this.f69779b.mo38021b(discoverySession);
            throw th;
        }
        aitq.mo38021b(discoverySession);
        this.f69783f.mo38045d(a);
        return null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aiug.a(java.io.InputStream, int, boolean):bvgz
     arg types: [java.io.InputStream, int, int]
     candidates:
      aiug.a(aivg, java.lang.String, ahfk):aivx
      aiug.a(aivg, java.lang.String, aivo):void
      aiug.a(java.io.InputStream, int, boolean):bvgz */
    /* renamed from: a */
    public final bvgz mo38048a(InputStream inputStream, int i) {
        return m57961a(inputStream, i, true);
    }

    /* renamed from: a */
    public final bvgz mo38049a(byte[] bArr) {
        bxvd da = bvgz.f156059f.mo74144da();
        ByteString a = ByteString.m123261a(bArr);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvgz bvgz = (bvgz) da.f164949b;
        a.getClass();
        bvgz.f156061a |= 64;
        bvgz.f156065e = a;
        int a2 = this.f69783f.mo38038a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvgz bvgz2 = (bvgz) da.f164949b;
        int i = bvgz2.f156061a | 32;
        bvgz2.f156061a = i;
        bvgz2.f156064d = a2;
        bvgz2.f156062b = 4;
        bvgz2.f156061a = i | 1;
        return (bvgz) da.mo74062i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo38050a(aivg aivg, ahfk ahfk, String str, short s, bqgy bqgy) {
        byte[] d = this.f69778a.mo38105d();
        srn srn = ailf.f69111a;
        ahfi b = ahfi.m55635b(new aitu(this, aivg, d), cfnv.m140758T() * 1000, this.f69782e);
        ahfk.mo36399a(new aitv(this, aivg, d));
        if (ahfk.mo36401b()) {
            aivg.close();
        }
        try {
            bxvd da = bvgz.f156059f.mo74144da();
            ByteString a = ByteString.m123261a(this.f69778a.mo38105d());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvgz bvgz = (bvgz) da.f164949b;
            a.getClass();
            bvgz.f156061a |= 64;
            bvgz.f156065e = a;
            int a2 = this.f69783f.mo38038a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvgz bvgz2 = (bvgz) da.f164949b;
            int i = bvgz2.f156061a | 32;
            bvgz2.f156061a = i;
            bvgz2.f156064d = a2;
            bvgz2.f156062b = 1;
            bvgz2.f156061a = 1 | i;
            m57962a(aivg, (bvgz) da.mo74062i());
            ails.m57438a(this.f69778a.mo38105d());
            mo38054b(aivg.f69867c, 3);
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aiug", "a", 382, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Received incoming notice that a Wifi Aware network is available");
            if (this.f69778a.mo38093a(aivg.f69865a, str, ahfk)) {
                InetSocketAddress a3 = this.f69778a.mo38087a(aivg.f69865a);
                if (a3 != null) {
                    bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
                    bnsl2.mo68432a("aiug", "a", 403, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("Immediately received the ip/port. No need to wait for notice.");
                } else {
                    bvgw bvgw = mo38054b(aivg.f69867c, 4).f156063c;
                    if (bvgw == null) {
                        bvgw = bvgw.f156053d;
                    }
                    InetSocketAddress inetSocketAddress = new InetSocketAddress(bvgw.f156056b, bvgw.f156057c);
                    bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
                    bnsl3.mo68432a("aiug", "a", 400, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68405a("Received incoming notice that a Wifi Aware ServerSocket is available");
                    a3 = inetSocketAddress;
                }
                aivx a4 = this.f69778a.mo38086a(aivg.f69865a, a3, ahfk);
                if (a4 != null) {
                    a4.mo37637a(new aitw(this, s));
                    bqgy.mo69138b(a4);
                    b.mo36396b();
                    aivg.close();
                    return;
                }
                this.f69778a.mo38099b(aivg.f69865a);
                throw new IOException("Failed to connect to the Wifi Aware ServerSocket");
            }
            throw new IOException("Failed to join the Wifi Aware network");
        } catch (IOException e) {
            bqgy.mo69136a((Throwable) e);
        } catch (Throwable th) {
            b.mo36396b();
            aivg.close();
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo38051a(aivg aivg, String str, int i, ahfi ahfi) {
        try {
            bxvd da = bvgz.f156059f.mo74144da();
            ByteString a = ByteString.m123261a(this.f69778a.mo38105d());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvgz bvgz = (bvgz) da.f164949b;
            a.getClass();
            bvgz.f156061a |= 64;
            bvgz.f156065e = a;
            int a2 = this.f69783f.mo38038a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvgz bvgz2 = (bvgz) da.f164949b;
            int i2 = bvgz2.f156061a | 32;
            bvgz2.f156061a = i2;
            bvgz2.f156064d = a2;
            bvgz2.f156062b = 3;
            bvgz2.f156061a = i2 | 1;
            bxvd da2 = bvgw.f156053d.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bvgw bvgw = (bvgw) da2.f164949b;
            str.getClass();
            int i3 = bvgw.f156055a | 1;
            bvgw.f156055a = i3;
            bvgw.f156056b = str;
            bvgw.f156055a = i3 | 2;
            bvgw.f156057c = i;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvgz bvgz3 = (bvgz) da.f164949b;
            bvgw bvgw2 = (bvgw) da2.mo74062i();
            bvgw2.getClass();
            bvgz3.f156063c = bvgw2;
            bvgz3.f156061a |= 8;
            m57962a(aivg, (bvgz) da.mo74062i());
            srn srn = ailf.f69111a;
            aivg.close();
        } catch (IOException e) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("aiug", "a", 268, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("L2ProtocolRunner failed to inform the remote device about the ServerSocket");
            ahfi.mo36396b();
            aivg.close();
            this.f69778a.mo38099b(aivg.f69865a);
            this.f69783f.mo38044c(bqct.m112601a(aivg.f69865a.f69912d));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo38052a(aivg aivg, String str, aivo aivo) {
        byte[] d = this.f69778a.mo38105d();
        srn srn = ailf.f69111a;
        ahfi b = ahfi.m55635b(new aity(this, aivg, d), cfnv.m140758T() * 1000, this.f69782e);
        try {
            bvgz a = mo38048a(aivg.f69867c, 2);
            if ((a.f156061a & 64) != 0) {
                byte[] k = a.f156065e.getKey();
                aivg.f69865a.f69912d = k;
                Arrays.toString(k);
            }
            short a2 = bqct.m112601a(d);
            short a3 = bqct.m112601a(aivg.f69865a.f69912d);
            if (this.f69783f.mo38043b(a3)) {
                if (a2 > a3) {
                    aivg e = this.f69783f.mo38046e(a3);
                    if (e != null) {
                        e.close();
                    }
                } else {
                    b.mo36396b();
                    aivg.close();
                    return;
                }
            }
            if (!this.f69778a.mo38094a(aivg.f69865a, str, new aiuc(this, aivg, b, aivo))) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
                bnsl.mo68432a("aiug", "a", (int) BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("L2ProtocolRunner failed to host a network");
                b.mo36396b();
                aivg.close();
                this.f69783f.mo38044c(a3);
                return;
            }
            new soa(9, new aitz(this, aivg, b, a3)).start();
            try {
                bxvd da = bvgz.f156059f.mo74144da();
                ByteString a4 = ByteString.m123261a(this.f69778a.mo38105d());
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvgz bvgz = (bvgz) da.f164949b;
                a4.getClass();
                bvgz.f156061a |= 64;
                bvgz.f156065e = a4;
                int a5 = this.f69783f.mo38038a();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvgz bvgz2 = (bvgz) da.f164949b;
                int i = bvgz2.f156061a | 32;
                bvgz2.f156061a = i;
                bvgz2.f156064d = a5;
                bvgz2.f156062b = 2;
                bvgz2.f156061a = i | 1;
                m57962a(aivg, (bvgz) da.mo74062i());
            } catch (IOException e2) {
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
                bnsl2.mo68437a(e2);
                bnsl2.mo68432a("aiug", "a", 249, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("L2ProtocolRunner failed to inform the remote device about the network");
                b.mo36396b();
                aivg.close();
                this.f69778a.mo38099b(aivg.f69865a);
                this.f69783f.mo38044c(a3);
            }
        } catch (IOException e3) {
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68387b();
            bnsl3.mo68437a(e3);
            bnsl3.mo68432a("aiug", "a", 142, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("L2ProtocolRunner failed to read from the remote device");
            b.mo36396b();
            aivg.close();
        }
    }

    /* renamed from: a */
    public final void mo38053a(Runnable runnable) {
        this.f69781d.execute(runnable);
    }
}
