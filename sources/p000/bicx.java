package p000;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* renamed from: bicx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bicx implements bhuk {

    /* renamed from: a */
    public int[] f120259a;

    /* renamed from: b */
    private final long f120260b = SystemClock.elapsedRealtime();

    /* renamed from: c */
    private final bhpt f120261c;

    /* renamed from: d */
    private final boolean f120262d;

    /* renamed from: e */
    private final int f120263e;

    /* renamed from: f */
    private final ConnectivityManager f120264f;

    /* renamed from: g */
    private final bicu f120265g;

    /* renamed from: h */
    private final Queue f120266h;

    public bicx(ConnectivityManager connectivityManager, bhpt bhpt, boolean z, int i, bicu bicu) {
        this.f120264f = connectivityManager;
        this.f120261c = bhpt;
        this.f120262d = z;
        this.f120263e = i;
        this.f120265g = bicu;
        this.f120266h = new ArrayDeque();
    }

    /* renamed from: b */
    public static bpnx m101968b() {
        bxvd da = bpnx.f138442j.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpnx bpnx = (bpnx) da.f164949b;
        bpnx.f138445b = 3;
        bpnx.f138444a |= 1;
        bpoi bpoi = bpoi.f138528c;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpnx bpnx2 = (bpnx) da.f164949b;
        bpoi.getClass();
        bpnx2.f138450g = bpoi;
        bpnx2.f138444a |= 64;
        return (bpnx) da.mo74062i();
    }

    /* renamed from: a */
    public final bpnx mo64529a(int i) {
        bxvd da = bpnx.f138442j.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpnx bpnx = (bpnx) da.f164949b;
        bpnx.f138445b = 1;
        bpnx.f138444a = 1 | bpnx.f138444a;
        int c = mo64536c();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpnx bpnx2 = (bpnx) da.f164949b;
        bpnx2.f138448e = c - 1;
        bpnx2.f138444a |= 8;
        int d = mo64537d();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpnx bpnx3 = (bpnx) da.f164949b;
        bpnx3.f138451h = d - 1;
        int i2 = bpnx3.f138444a | 128;
        bpnx3.f138444a = i2;
        bpnx3.f138444a = i2 | 4;
        bpnx3.f138447d = i;
        bpoj bpoj = bpoj.f138532f;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpnx bpnx4 = (bpnx) da.f164949b;
        bpoj.getClass();
        bpnx4.f138449f = bpoj;
        bpnx4.f138444a |= 16;
        return (bpnx) da.mo74062i();
    }

    /* renamed from: c */
    public final int mo64536c() {
        NetworkInfo activeNetworkInfo = this.f120264f.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
            return 1;
        }
        if (activeNetworkInfo.getType() != 1) {
            return activeNetworkInfo.getType() == 0 ? 3 : 4;
        }
        return 2;
    }

    /* renamed from: d */
    public final int mo64537d() {
        Intent registerReceiver = this.f120265g.f120250a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("plugged", -1);
            int intExtra2 = registerReceiver.getIntExtra("level", -1);
            int intExtra3 = registerReceiver.getIntExtra("scale", -1);
            float f = (intExtra2 == -1 || intExtra3 == -1 || intExtra3 == 0) ? -1.0f : ((float) intExtra2) / ((float) intExtra3);
            if (intExtra != -1) {
                if (intExtra != 0) {
                    return 4;
                }
                if (f != -1.0f) {
                    return f >= 0.2f ? 3 : 2;
                }
                return 1;
            }
        }
        return 1;
    }

    /* renamed from: a */
    public final bpoh mo64530a() {
        bxvd da = bpoh.f138508s.mo74144da();
        int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - this.f120260b);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpoh bpoh = (bpoh) da.f164949b;
        int i = bpoh.f138510a | 8;
        bpoh.f138510a = i;
        bpoh.f138513d = seconds;
        boolean z = this.f120262d;
        int i2 = i | 16;
        bpoh.f138510a = i2;
        bpoh.f138514e = z;
        int i3 = this.f120263e;
        bpoh.f138510a = i2 | 32;
        bpoh.f138516g = i3;
        int[] iArr = this.f120259a;
        if (iArr != null) {
            List b = bqcn.m112586b(iArr);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpoh bpoh2 = (bpoh) da.f164949b;
            if (!bpoh2.f138515f.mo73666a()) {
                bpoh2.f138515f = GeneratedMessageLite.m124019a(bpoh2.f138515f);
            }
            bxsy.m123078a(b, bpoh2.f138515f);
        }
        return (bpoh) da.mo74062i();
    }

    /* renamed from: a */
    public final bpoh mo64531a(bpnd bpnd) {
        bpoh a = mo64530a();
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpoh bpoh = (bpoh) bxvd.f164949b;
        bpoh bpoh2 = bpoh.f138508s;
        bpoh.f138512c = 3;
        int i = bpoh.f138510a | 2;
        bpoh.f138510a = i;
        if (bpnd != null) {
            bpnd.getClass();
            bpoh.f138519j = bpnd;
            bpoh.f138510a = i | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        return (bpoh) bxvd.mo74062i();
    }

    /* renamed from: a */
    public final bpoh mo64532a(bpnx bpnx) {
        bpoh a = mo64530a();
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpoh bpoh = (bpoh) bxvd.f164949b;
        bpoh bpoh2 = bpoh.f138508s;
        bpoh.f138512c = 1;
        int i = bpoh.f138510a | 2;
        bpoh.f138510a = i;
        if (bpnx != null) {
            bpnx.getClass();
            bpoh.f138517h = bpnx;
            bpoh.f138510a = i | 64;
        }
        return (bpoh) bxvd.mo74062i();
    }

    /* renamed from: a */
    public final bpoh mo64533a(bpop bpop) {
        bpoh a = mo64530a();
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpoh bpoh = (bpoh) bxvd.f164949b;
        bpoh bpoh2 = bpoh.f138508s;
        bpoh.f138512c = 10;
        int i = bpoh.f138510a | 2;
        bpoh.f138510a = i;
        if (bpop != null) {
            bpop.getClass();
            bpoh.f138525p = bpop;
            bpoh.f138510a = 32768 | i;
        }
        return (bpoh) bxvd.mo74062i();
    }

    /* renamed from: a */
    public final void mo64317a(int i, int i2, int i3) {
        bxvd da = bpnj.f138406e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpnj bpnj = (bpnj) da.f164949b;
        bpnj.f138409b = i - 1;
        bpnj.f138408a |= 1;
        bpnj bpnj2 = (bpnj) da.f164949b;
        bpnj2.f138410c = i2 - 1;
        bpnj2.f138408a |= 2;
        bpnj bpnj3 = (bpnj) da.f164949b;
        bpnj3.f138411d = i3 - 1;
        bpnj3.f138408a |= 4;
        bpnj bpnj4 = (bpnj) da.mo74062i();
        bpoh a = mo64530a();
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpoh bpoh = (bpoh) bxvd.f164949b;
        bpoh bpoh2 = bpoh.f138508s;
        bpoh.f138512c = 8;
        int i4 = bpoh.f138510a | 2;
        bpoh.f138510a = i4;
        if (bpnj4 != null) {
            bpnj4.getClass();
            bpoh.f138524o = bpnj4;
            bpoh.f138510a = i4 | 8192;
        }
        mo64534a((bpoh) bxvd.mo74062i());
    }

    /* renamed from: a */
    public final void mo64318a(int i, int i2, int i3, int i4) {
        bxvd da = bpnp.f138429f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpnp bpnp = (bpnp) da.f164949b;
        bpnp.f138432b = i - 1;
        bpnp.f138431a |= 1;
        bpnp bpnp2 = (bpnp) da.f164949b;
        bpnp2.f138433c = i2 - 1;
        bpnp2.f138431a |= 2;
        if (i3 != 0) {
            bpnp bpnp3 = (bpnp) da.f164949b;
            bpnp3.f138434d = i3 - 1;
            bpnp3.f138431a |= 4;
        }
        bpnp bpnp4 = (bpnp) da.f164949b;
        bpnp4.f138431a |= 8;
        bpnp4.f138435e = i4;
        bpnp bpnp5 = (bpnp) da.mo74062i();
        bpoh a = mo64530a();
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpoh bpoh = (bpoh) bxvd.f164949b;
        bpoh bpoh2 = bpoh.f138508s;
        bpoh.f138512c = 11;
        int i5 = bpoh.f138510a | 2;
        bpoh.f138510a = i5;
        if (bpnp5 != null) {
            bpnp5.getClass();
            bpoh.f138526q = bpnp5;
            bpoh.f138510a = 65536 | i5;
        }
        mo64534a((bpoh) bxvd.mo74062i());
    }

    /* renamed from: a */
    public final void mo64319a(int i, int i2, int i3, int i4, int i5, boolean z, int i6, int i7) {
        bxvd da = bpob.f138459j.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpob bpob = (bpob) da.f164949b;
        int i8 = bpob.f138461a | 2;
        bpob.f138461a = i8;
        bpob.f138463c = i2;
        int i9 = i8 | 1;
        bpob.f138461a = i9;
        bpob.f138462b = i;
        int i10 = i9 | 4;
        bpob.f138461a = i10;
        bpob.f138464d = i3;
        int i11 = i10 | 8;
        bpob.f138461a = i11;
        bpob.f138465e = i4;
        int i12 = i11 | 16;
        bpob.f138461a = i12;
        bpob.f138466f = i5;
        int i13 = i12 | 32;
        bpob.f138461a = i13;
        bpob.f138467g = z;
        bpob.f138468h = i6 - 1;
        int i14 = i13 | 64;
        bpob.f138461a = i14;
        bpob.f138469i = i7 - 1;
        bpob.f138461a = i14 | 128;
        bpob bpob2 = (bpob) da.mo74062i();
        bpoh a = mo64530a();
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpoh bpoh = (bpoh) bxvd.f164949b;
        bpoh bpoh2 = bpoh.f138508s;
        bpoh.f138512c = 5;
        int i15 = bpoh.f138510a | 2;
        bpoh.f138510a = i15;
        if (bpob2 != null) {
            bpob2.getClass();
            bpoh.f138521l = bpob2;
            bpoh.f138510a = i15 | 1024;
        }
        mo64534a((bpoh) bxvd.mo74062i());
    }

    /* renamed from: a */
    public final void mo64320a(int i, boolean z, long j) {
        bxvd da = bpnm.f138421e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpnm bpnm = (bpnm) da.f164949b;
        bpnm.f138424b = i - 1;
        int i2 = bpnm.f138423a | 1;
        bpnm.f138423a = i2;
        int i3 = i2 | 2;
        bpnm.f138423a = i3;
        bpnm.f138425c = z;
        bpnm.f138423a = i3 | 4;
        bpnm.f138426d = j;
        bpnm bpnm2 = (bpnm) da.mo74062i();
        bpoh a = mo64530a();
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpoh bpoh = (bpoh) bxvd.f164949b;
        bpoh bpoh2 = bpoh.f138508s;
        bpoh.f138512c = 12;
        int i4 = bpoh.f138510a | 2;
        bpoh.f138510a = i4;
        if (bpnm2 != null) {
            bpnm2.getClass();
            bpoh.f138527r = bpnm2;
            bpoh.f138510a = 131072 | i4;
        }
        mo64534a((bpoh) bxvd.mo74062i());
    }

    /* renamed from: a */
    public final void mo64534a(bpoh bpoh) {
        synchronized (this) {
            while (this.f120266h.size() >= 50) {
                this.f120266h.remove();
            }
            this.f120266h.add(bpoh);
        }
        if (cgfr.f186745a.mo6606a().mo83645t()) {
            bhpt bhpt = this.f120261c;
            bxvd da = bonq.f133833p.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bonq bonq = (bonq) da.f164949b;
            bonq.f133836b = 4;
            int i = bonq.f133835a | 1;
            bonq.f133835a = i;
            if (bpoh != null) {
                bpoh.getClass();
                bonq.f133840f = bpoh;
                bonq.f133835a = i | 16;
            }
            bhpt.mo64139a((bonq) da.mo74062i());
        }
    }

    /* renamed from: a */
    public final synchronized void mo64535a(PrintWriter printWriter) {
        if (!this.f120266h.isEmpty()) {
            printWriter.println("\nPlace Inference Clearcut Logs:");
            for (bpoh bpoh : this.f120266h) {
                printWriter.print(" ");
                printWriter.println(sqd.m35970c(bpoh.serializeToBytes()));
            }
        }
    }
}
