package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.SystemClock;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetSocketAddress;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Timer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: agbt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agbt {

    /* renamed from: a */
    public static final agcm f65168a = new agcm("MdnsClient");

    /* renamed from: b */
    public static final long f65169b = cczu.f180328a.mo6606a().mo77136q();

    /* renamed from: A */
    private final boolean f65170A = cczu.f180328a.mo6606a().mo77123d();

    /* renamed from: B */
    private agbs f65171B;

    /* renamed from: C */
    private int f65172C = 0;

    /* renamed from: c */
    public final byte[] f65173c = new byte[2048];

    /* renamed from: d */
    public final byte[] f65174d;

    /* renamed from: e */
    public final WifiManager.MulticastLock f65175e;

    /* renamed from: f */
    public final qws f65176f;

    /* renamed from: g */
    public final boolean f65177g = cczu.f180328a.mo6606a().mo77139t();

    /* renamed from: h */
    public final long f65178h = cczu.f180328a.mo6606a().mo77124e();

    /* renamed from: i */
    public final Object f65179i = new Object();

    /* renamed from: j */
    public final Object f65180j = new Object();

    /* renamed from: k */
    public volatile boolean f65181k;

    /* renamed from: l */
    public agbm f65182l;

    /* renamed from: m */
    public agbm f65183m;

    /* renamed from: n */
    public Timer f65184n;

    /* renamed from: o */
    public AtomicInteger f65185o;

    /* renamed from: p */
    public Timer f65186p;

    /* renamed from: q */
    boolean f65187q;

    /* renamed from: r */
    boolean f65188r;

    /* renamed from: s */
    final AtomicBoolean f65189s = new AtomicBoolean(false);

    /* renamed from: t */
    volatile Thread f65190t;

    /* renamed from: u */
    Thread f65191u;

    /* renamed from: v */
    Thread f65192v;

    /* renamed from: w */
    final Queue f65193w = new ArrayDeque();

    /* renamed from: x */
    final Queue f65194x = new ArrayDeque();

    /* renamed from: y */
    private final Context f65195y;

    /* renamed from: z */
    private final agau f65196z;

    public agbt(Context context, WifiManager.MulticastLock multicastLock) {
        this.f65195y = context;
        this.f65175e = multicastLock;
        this.f65196z = new agau(srb.f45012a, null);
        if (ccyq.m132226b()) {
            this.f65176f = new qws(context, "CAST_SENDER_SDK", null);
        } else {
            this.f65176f = qws.m33019a(context, "CAST_SENDER_SDK");
        }
        if (this.f65177g) {
            this.f65174d = new byte[2048];
        } else {
            this.f65174d = null;
        }
    }

    /* renamed from: a */
    private final int m53882a(DatagramPacket datagramPacket, String str) {
        int i = this.f65172C + 1;
        this.f65172C = i;
        LinkedList<agat> linkedList = new LinkedList();
        int a = this.f65196z.mo35173a(datagramPacket, linkedList);
        if (a == 0) {
            if (str.equals("multicast")) {
                this.f65187q = true;
                if (this.f65189s.getAndSet(false)) {
                    bnsl bnsl = (bnsl) f65168a.f65218b.mo68387b();
                    bnsl.mo68432a("agbt", "a", 466, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Recovered from the state where the phone can't receive any multicast response");
                    qwo a2 = this.f65176f.mo24335a(mo35207c().mo73642k());
                    a2.mo24328b((int) BaseMfiEventCallback.TYPE_OPSRV_ACCOUNT_ERROR);
                    a2.mo24327b();
                }
            } else {
                this.f65188r = true;
            }
            for (agat agat : linkedList) {
                String j = agat.mo35171j();
                agcm agcm = f65168a;
                bnsl a3 = agcm.f65218b.mo26019b(agcm.f65217a);
                a3.mo68432a("agcm", "a", 50, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                a3.mo68424a("mDNS %s response received: %s", str, j);
                agbs agbs = this.f65171B;
                if (agbs != null) {
                    agbs.mo35133a(agat);
                }
            }
        } else if (a != 1) {
            bnsl bnsl2 = (bnsl) f65168a.f65218b.mo68388c();
            bnsl2.mo68432a("agbt", "a", 483, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68425a("Error while decoding %s packet (%d): %d", str, Integer.valueOf(i), Integer.valueOf(a));
            agbs agbs2 = this.f65171B;
            if (agbs2 != null) {
                agbs2.mo35132a(i, a);
                return a;
            }
        }
        return a;
    }

    /* renamed from: d */
    private final void m53884d() {
        if (this.f65190t == null) {
            this.f65190t = new Thread(new agbn(this));
            this.f65190t.setName("mdns-send");
            this.f65190t.start();
            if (cczu.m132316c()) {
                AtomicInteger atomicInteger = this.f65185o;
                if (atomicInteger == null) {
                    this.f65185o = new AtomicInteger();
                } else {
                    atomicInteger.set(0);
                }
                this.f65184n = new Timer("MdnsSocketClientTimer", true);
                long h = cczu.f180328a.mo6606a().mo77127h();
                this.f65184n.scheduleAtFixedRate(new agbq(this), h, h);
                return;
            }
            return;
        }
        bnsl bnsl = (bnsl) f65168a.f65218b.mo68388c();
        bnsl.mo68432a("agbt", "d", 239, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("A socket thread already exists.");
    }

    /* renamed from: e */
    private final void m53885e() {
        if (this.f65191u == null) {
            Thread thread = new Thread(new agbo(this));
            this.f65191u = thread;
            thread.setName("mdns-multicast-receive");
            this.f65191u.start();
            if (this.f65177g) {
                Thread thread2 = new Thread(new agbp(this));
                this.f65192v = thread2;
                thread2.setName("mdns-unicast-receive");
                this.f65192v.start();
                return;
            }
            return;
        }
        bnsl bnsl = (bnsl) f65168a.f65218b.mo68388c();
        bnsl.mo68432a("agbt", "e", 267, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("A multicast receiver thread already exists.");
    }

    /* renamed from: f */
    private final void m53886f() {
        f65168a.mo35221a("Trigger send thread.");
        Thread thread = this.f65190t;
        if (thread != null) {
            thread.interrupt();
            return;
        }
        bnsl bnsl = (bnsl) f65168a.f65218b.mo68388c();
        bnsl.mo68432a("agbt", "f", 289, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Socket thread is null");
    }

    /* renamed from: g */
    private final void m53887g() {
        Timer timer;
        f65168a.mo35221a("wait For Send Thread To Stop");
        if (this.f65190t == null) {
            bnsl bnsl = (bnsl) f65168a.f65218b.mo68388c();
            bnsl.mo68432a("agbt", "g", 308, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("socket thread is already dead.");
            return;
        }
        mo35201a(this.f65190t);
        this.f65190t = null;
        if (cczu.m132316c() && (timer = this.f65184n) != null) {
            timer.cancel();
            this.f65184n = null;
            mo35206b(this.f65185o.getAndSet(0));
        }
    }

    /* renamed from: a */
    public final synchronized void mo35200a(agbs agbs) {
        this.f65171B = agbs;
    }

    /* renamed from: b */
    public final void mo35205b() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (!this.f65181k) {
            try {
                try {
                    arrayList.clear();
                    synchronized (this.f65193w) {
                        arrayList.addAll(this.f65193w);
                        this.f65193w.clear();
                    }
                    if (this.f65177g) {
                        arrayList2.clear();
                        synchronized (this.f65194x) {
                            arrayList2.addAll(this.f65194x);
                            this.f65194x.clear();
                        }
                    }
                    mo35203a(arrayList, this.f65182l);
                    mo35203a(arrayList2, this.f65183m);
                    synchronized (this.f65193w) {
                        synchronized (this.f65194x) {
                            z = false;
                            if (this.f65193w.isEmpty() && this.f65194x.isEmpty()) {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.sleep(f65169b);
                    }
                } catch (InterruptedException e) {
                }
            } finally {
                f65168a.mo35221a("Send thread stopped.");
                try {
                    this.f65182l.mo35191a();
                } catch (Exception e2) {
                    bnsl bnsl = (bnsl) f65168a.f65218b.mo68387b();
                    bnsl.mo68437a(e2);
                    bnsl.mo68432a("agbt", "b", 391, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Failed to leave the group.");
                }
                try {
                    this.f65182l.mo35192b();
                    agbm agbm = this.f65183m;
                    if (agbm != null) {
                        agbm.mo35192b();
                    }
                } catch (Exception e3) {
                    bnsl bnsl2 = (bnsl) f65168a.f65218b.mo68387b();
                    bnsl2.mo68437a(e3);
                    bnsl2.mo68432a("agbt", "b", (int) ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("Failed to close the mdns socket.");
                }
            }
        }
        try {
        } catch (Exception e4) {
            bnsl bnsl3 = (bnsl) f65168a.f65218b.mo68387b();
            bnsl3.mo68437a(e4);
            bnsl3.mo68432a("agbt", "b", (int) ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Failed to close the mdns socket.");
        }
    }

    /* renamed from: c */
    public final bpsz mo35207c() {
        bpsy bpsy = (bpsy) bpsz.f139036I.mo74144da();
        String a = m53883a(this.f65195y);
        if (bpsy.f164950c) {
            bpsy.mo74035c();
            bpsy.f164950c = false;
        }
        bpsz bpsz = (bpsz) bpsy.f164949b;
        a.getClass();
        bpsz.f139047a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        bpsz.f139054h = a;
        return (bpsz) bpsy.mo74062i();
    }

    /* renamed from: a */
    private static synchronized String m53883a(Context context) {
        String string;
        synchronized (agbt.class) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("google_cast", 0);
            string = sharedPreferences.getString("PREF_CAST_SENDER_ID", null);
            if (string == null) {
                string = UUID.randomUUID().toString();
                sharedPreferences.edit().putString("PREF_CAST_SENDER_ID", string).apply();
            }
        }
        return string;
    }

    /* renamed from: b */
    public final void mo35206b(int i) {
        bpsz c = mo35207c();
        bxvd bxvd = (bxvd) c.mo74142c(5);
        bxvd.mo73625a((bxvk) c);
        bpsy bpsy = (bpsy) bxvd;
        if (bpsy.f164950c) {
            bpsy.mo74035c();
            bpsy.f164950c = false;
        }
        bpsz bpsz = bpsz.f139036I;
        ((bpsz) bpsy.f164949b).f139058l = bxvk.m124030de();
        bxvd da = bptg.f139107c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bptg bptg = (bptg) da.f164949b;
        bptg.f139109a |= 1;
        bptg.f139110b = i;
        bpsy.mo68981a((bptg) da.mo74062i());
        qwo a = this.f65176f.mo24335a(((bpsz) bpsy.mo74062i()).mo73642k());
        a.mo24328b((int) BaseMfiEventCallback.TYPE_ISSUE_LIMIT_EXCEEDED);
        a.mo24327b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final agbm mo35198a(int i) {
        return new agbm(new agbv(this.f65195y), i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0195, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo35199a() {
        if (this.f65182l != null) {
            bnsl bnsl = (bnsl) f65168a.f65218b.mo68388c();
            bnsl.mo68432a("agbt", "a", 132, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Discovery is already in progress.");
            return;
        }
        if (cczu.f180328a.mo6606a().mo77135p()) {
            synchronized (this.f65193w) {
                int size = this.f65193w.size();
                bpsz c = mo35207c();
                bxvd bxvd = (bxvd) c.mo74142c(5);
                bxvd.mo73625a((bxvk) c);
                bpsy bpsy = (bpsy) bxvd;
                if (bpsy.f164950c) {
                    bpsy.mo74035c();
                    bpsy.f164950c = false;
                }
                bpsz bpsz = bpsz.f139036I;
                ((bpsz) bpsy.f164949b).f139058l = bxvk.m124030de();
                bxvd da = bptg.f139107c.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bptg bptg = (bptg) da.f164949b;
                bptg.f139109a |= 1;
                bptg.f139110b = size;
                bpsy.mo68981a((bptg) da.mo74062i());
                qwo a = this.f65176f.mo24335a(((bpsz) bpsy.mo74062i()).mo73642k());
                a.mo24328b((int) BaseMfiEventCallback.TYPE_EXIST_UNKNOWN_CARD);
                a.mo24327b();
            }
        }
        this.f65187q = false;
        this.f65188r = false;
        this.f65189s.set(false);
        this.f65181k = false;
        try {
            shr.m35316b(2304);
            agbm a2 = mo35198a(agbm.f65157a);
            this.f65182l = a2;
            List<agbw> a3 = a2.f65161d.mo35209a();
            InetSocketAddress inetSocketAddress = agbm.f65158b;
            if (a2.f65161d.mo35210a(a3)) {
                agbm.f65160f = true;
                inetSocketAddress = agbm.f65159c;
            } else {
                agbm.f65160f = false;
            }
            for (agbw agbw : a3) {
                a2.f65162e.joinGroup(inetSocketAddress, agbw.f65205a);
            }
            if (this.f65177g) {
                this.f65183m = mo35198a(0);
            }
            this.f65175e.acquire();
            shr.m35312a();
            if (this.f65190t != null) {
                bnsl bnsl2 = (bnsl) f65168a.f65218b.mo68388c();
                bnsl2.mo68432a("agbt", "d", 239, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("A socket thread already exists.");
            } else {
                this.f65190t = new Thread(new agbn(this));
                this.f65190t.setName("mdns-send");
                this.f65190t.start();
                if (cczu.m132316c()) {
                    AtomicInteger atomicInteger = this.f65185o;
                    if (atomicInteger == null) {
                        this.f65185o = new AtomicInteger();
                    } else {
                        atomicInteger.set(0);
                    }
                    this.f65184n = new Timer("MdnsSocketClientTimer", true);
                    long h = cczu.f180328a.mo6606a().mo77127h();
                    this.f65184n.scheduleAtFixedRate(new agbq(this), h, h);
                }
            }
            if (this.f65191u == null) {
                Thread thread = new Thread(new agbo(this));
                this.f65191u = thread;
                thread.setName("mdns-multicast-receive");
                this.f65191u.start();
                if (this.f65177g) {
                    Thread thread2 = new Thread(new agbp(this));
                    this.f65192v = thread2;
                    thread2.setName("mdns-unicast-receive");
                    this.f65192v.start();
                }
            } else {
                bnsl bnsl3 = (bnsl) f65168a.f65218b.mo68388c();
                bnsl3.mo68432a("agbt", "e", 267, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("A multicast receiver thread already exists.");
            }
        } catch (IOException e) {
            this.f65175e.release();
            agbm agbm = this.f65182l;
            if (agbm != null) {
                agbm.mo35192b();
                this.f65182l = null;
            }
            agbm agbm2 = this.f65183m;
            if (agbm2 != null) {
                agbm2.mo35192b();
                this.f65183m = null;
            }
            throw e;
        } catch (Throwable th) {
            shr.m35312a();
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo35201a(Thread thread) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = 1000;
        while (thread.isAlive() && j > 0) {
            try {
                thread.interrupt();
                thread.join(j);
                if (thread.isAlive()) {
                    bnsl bnsl = (bnsl) f65168a.f65218b.mo68388c();
                    bnsl.mo68432a("agbt", "a", 332, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("Failed to join thread: %s.", thread);
                    return;
                }
                return;
            } catch (InterruptedException e) {
                j = 1000 - (SystemClock.elapsedRealtime() - elapsedRealtime);
            }
        }
    }

    /* renamed from: a */
    public final void mo35202a(DatagramPacket datagramPacket, Queue queue) {
        if (!this.f65181k || cczu.f180328a.mo6606a().mo77120a()) {
            synchronized (queue) {
                while (((long) queue.size()) >= cczu.f180328a.mo6606a().mo77128i()) {
                    queue.remove();
                }
                queue.add(datagramPacket);
            }
            f65168a.mo35221a("Trigger send thread.");
            Thread thread = this.f65190t;
            if (thread != null) {
                thread.interrupt();
                return;
            }
            bnsl bnsl = (bnsl) f65168a.f65218b.mo68388c();
            bnsl.mo68432a("agbt", "f", 289, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Socket thread is null");
            return;
        }
        bnsl bnsl2 = (bnsl) f65168a.f65218b.mo68388c();
        bnsl2.mo68432a("agbt", "a", 225, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68405a("sendMdnsPacket() is called after discovery already stopped");
    }

    /* renamed from: a */
    public final void mo35203a(List list, agbm agbm) {
        String str;
        if (agbm != this.f65182l) {
            str = "unicast";
        } else {
            str = "multicast";
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DatagramPacket datagramPacket = (DatagramPacket) it.next();
            if (this.f65181k) {
                break;
            }
            try {
                f65168a.mo35222a("Sending a %s mDNS packet...", str);
                for (agbw agbw : agbm.f65161d.mo35209a()) {
                    agbm.f65162e.setNetworkInterface(agbw.f65205a);
                    agbm.f65162e.send(datagramPacket);
                }
                if (cczu.m132316c()) {
                    this.f65185o.incrementAndGet();
                }
                synchronized (this.f65180j) {
                    if (agbm == this.f65182l) {
                        if (this.f65189s.get()) {
                            return;
                        }
                        if (this.f65186p != null) {
                            return;
                        }
                        if (this.f65170A && this.f65177g) {
                            Timer timer = new Timer();
                            this.f65186p = timer;
                            timer.schedule(new agbr(this), this.f65178h);
                        }
                    }
                }
            } catch (IOException e) {
                bnsl bnsl = (bnsl) f65168a.f65218b.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("agbt", "a", 611, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Failed to send a %s mDNS packet.", str);
            }
        }
        list.clear();
    }

    /* renamed from: a */
    public final void mo35204a(byte[] bArr, agbm agbm) {
        DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length);
        while (!this.f65181k) {
            try {
                synchronized (this.f65179i) {
                    if (agbm != null) {
                        if (agbm == this.f65182l || agbm == this.f65183m) {
                            agbm.f65162e.receive(datagramPacket);
                        }
                    }
                }
                if (!this.f65181k) {
                    String str = agbm != this.f65182l ? "unicast" : "multicast";
                    int i = this.f65172C + 1;
                    this.f65172C = i;
                    LinkedList<agat> linkedList = new LinkedList();
                    int a = this.f65196z.mo35173a(datagramPacket, linkedList);
                    if (a == 0) {
                        if (str.equals("multicast")) {
                            this.f65187q = true;
                            if (this.f65189s.getAndSet(false)) {
                                bnsl bnsl = (bnsl) f65168a.f65218b.mo68387b();
                                bnsl.mo68432a("agbt", "a", 466, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl.mo68405a("Recovered from the state where the phone can't receive any multicast response");
                                qwo a2 = this.f65176f.mo24335a(mo35207c().mo73642k());
                                a2.mo24328b((int) BaseMfiEventCallback.TYPE_OPSRV_ACCOUNT_ERROR);
                                a2.mo24327b();
                            }
                        } else {
                            this.f65188r = true;
                        }
                        for (agat agat : linkedList) {
                            String j = agat.mo35171j();
                            agcm agcm = f65168a;
                            bnsl a3 = agcm.f65218b.mo26019b(agcm.f65217a);
                            a3.mo68432a("agcm", "a", 50, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            a3.mo68424a("mDNS %s response received: %s", str, j);
                            agbs agbs = this.f65171B;
                            if (agbs != null) {
                                agbs.mo35133a(agat);
                            }
                        }
                    } else if (a != 1) {
                        bnsl bnsl2 = (bnsl) f65168a.f65218b.mo68388c();
                        bnsl2.mo68432a("agbt", "a", 483, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68425a("Error while decoding %s packet (%d): %d", str, Integer.valueOf(i), Integer.valueOf(a));
                        agbs agbs2 = this.f65171B;
                        if (agbs2 != null) {
                            agbs2.mo35132a(i, a);
                        }
                    }
                }
            } catch (IOException e) {
                if (!this.f65181k) {
                    bnsl bnsl3 = (bnsl) f65168a.f65218b.mo68387b();
                    bnsl3.mo68437a(e);
                    bnsl3.mo68432a("agbt", "a", 426, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68405a("Failed to receive mDNS packets.");
                }
            } catch (UnsupportedOperationException e2) {
                bnsl bnsl4 = (bnsl) f65168a.f65218b.mo68387b();
                bnsl4.mo68432a("agbt", "a", 443, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68409a("MulticastSocket.receive() is throwing UnsupportedOperationException on API %d.", Build.VERSION.SDK_INT);
            }
        }
        f65168a.mo35221a("Receive thread stopped.");
    }
}
