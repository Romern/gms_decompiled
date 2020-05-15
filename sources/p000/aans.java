package p000;

import java.net.Socket;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: aans */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aans {

    /* renamed from: a */
    public aanf f28634a;

    /* renamed from: b */
    Socket f28635b;

    /* renamed from: c */
    public int f28636c = -1;

    /* renamed from: d */
    volatile Thread f28637d;

    /* renamed from: e */
    volatile Thread f28638e;

    /* renamed from: f */
    public volatile boolean f28639f;

    /* renamed from: g */
    public boolean f28640g;

    /* renamed from: h */
    long f28641h;

    /* renamed from: i */
    public boolean f28642i;

    /* renamed from: j */
    int f28643j;

    /* renamed from: k */
    boolean f28644k = false;

    /* renamed from: l */
    boolean f28645l = false;

    /* renamed from: m */
    final ArrayList f28646m = new ArrayList();

    /* renamed from: n */
    final Map f28647n = new TreeMap();

    /* renamed from: o */
    final BlockingQueue f28648o = new LinkedBlockingQueue();

    /* renamed from: p */
    int f28649p;

    /* renamed from: q */
    int f28650q = 1;

    /* renamed from: r */
    int f28651r;

    public aans(aanf aanf) {
        this.f28634a = aanf;
    }

    /* renamed from: a */
    public final int mo17149a() {
        return this.f28634a.f28532b;
    }

    /* renamed from: a */
    public final void mo17150a(int i) {
        this.f28634a.f28532b = i;
    }

    /* renamed from: a */
    public final void mo17151a(String str) {
        this.f28634a.f28531a = str;
    }
}
