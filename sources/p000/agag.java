package p000;

import android.text.TextUtils;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: agag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agag implements Callable {

    /* renamed from: a */
    private static final int f65061a = ((int) cczu.m132315b());

    /* renamed from: b */
    private static final agcm f65062b = new agcm("MdnsQueryCallable");

    /* renamed from: c */
    private static final List f65063c = new ArrayList();

    /* renamed from: d */
    private final WeakReference f65064d;

    /* renamed from: e */
    private final agaq f65065e;

    /* renamed from: f */
    private final String[] f65066f;

    /* renamed from: g */
    private final List f65067g;

    /* renamed from: h */
    private final boolean f65068h;

    /* renamed from: i */
    private final int f65069i;

    static {
        for (String str : cczu.f180328a.mo6606a().mo77122c().split(",")) {
            try {
                f65063c.add(Integer.valueOf(Integer.parseInt(str)));
            } catch (NumberFormatException e) {
            }
        }
    }

    public agag(agbt agbt, agaq agaq, String str, Collection collection, boolean z, int i) {
        this.f65064d = new WeakReference(agbt);
        this.f65065e = agaq;
        this.f65066f = TextUtils.split(str, "\\.");
        this.f65067g = new ArrayList(collection);
        this.f65068h = z;
        this.f65069i = i;
    }

    /* renamed from: a */
    private final void m53798a(agbt agbt, InetSocketAddress inetSocketAddress) {
        agaq agaq = this.f65065e;
        DatagramPacket datagramPacket = new DatagramPacket(agaq.f65088a, agaq.f65089b, inetSocketAddress);
        if (!this.f65068h) {
            agbt.mo35202a(datagramPacket, agbt.f65193w);
        } else if (agbt.f65177g) {
            agbt.mo35202a(datagramPacket, agbt.f65194x);
        } else {
            agbt.mo35202a(datagramPacket, agbt.f65193w);
        }
    }

    /* renamed from: a */
    public final C1240of call() {
        int i;
        try {
            agbt agbt = (agbt) this.f65064d.get();
            if (agbt == null) {
                return null;
            }
            if (!this.f65067g.isEmpty()) {
                i = this.f65067g.size() + 1;
            } else {
                i = 1;
            }
            this.f65065e.mo35153b(this.f65069i);
            int i2 = 0;
            this.f65065e.mo35153b(0);
            this.f65065e.mo35153b(i);
            this.f65065e.mo35153b(0);
            this.f65065e.mo35153b(0);
            this.f65065e.mo35153b(0);
            Iterator it = this.f65067g.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                int i3 = AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                if (!hasNext) {
                    break;
                }
                String[] strArr = new String[(this.f65066f.length + 2)];
                String valueOf = String.valueOf((String) it.next());
                strArr[0] = valueOf.length() == 0 ? new String("_") : "_".concat(valueOf);
                strArr[1] = "_sub";
                String[] strArr2 = this.f65066f;
                System.arraycopy(strArr2, 0, strArr, 2, strArr2.length);
                this.f65065e.mo35152a(strArr);
                this.f65065e.mo35153b(12);
                agaq agaq = this.f65065e;
                if (!this.f65068h) {
                    i3 = 0;
                }
                agaq.mo35153b(i3 | 1);
            }
            this.f65065e.mo35152a(this.f65066f);
            this.f65065e.mo35153b(12);
            agaq agaq2 = this.f65065e;
            if (this.f65068h) {
                i2 = AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
            }
            agaq2.mo35153b(1 | i2);
            InetAddress a = agaj.m53801a();
            if (agbm.f65160f) {
                a = agaj.m53802b();
            }
            m53798a(agbt, new InetSocketAddress(a, f65061a));
            for (Integer num : f65063c) {
                m53798a(agbt, new InetSocketAddress(a, num.intValue()));
            }
            return C1240of.m19758a(Integer.valueOf(this.f65069i), this.f65067g);
        } catch (IOException e) {
            bnsl bnsl = (bnsl) f65062b.f65218b.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("agag", "a", 124, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Failed to create mDNS packet for subtype: %s.", TextUtils.join(",", this.f65067g));
            return null;
        }
    }
}
