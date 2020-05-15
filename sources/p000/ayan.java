package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.wearable.node.TransportWriter$1;
import com.google.android.gms.wearable.util.AlarmHelper$AlarmBroadcastReceiver;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: ayan */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayan implements Runnable, axyv, ayjm {

    /* renamed from: g */
    public static final /* synthetic */ int f96937g = 0;

    /* renamed from: h */
    private static final Boolean f96938h = false;

    /* renamed from: i */
    private static final ayew f96939i;

    /* renamed from: j */
    private static final axya f96940j;

    /* renamed from: a */
    public volatile OutputStream f96941a;

    /* renamed from: b */
    public final axzf f96942b;

    /* renamed from: c */
    public final boolean f96943c;

    /* renamed from: d */
    final int f96944d;

    /* renamed from: e */
    public final SparseArray f96945e = new SparseArray();

    /* renamed from: f */
    public volatile boolean f96946f;

    /* renamed from: k */
    private final Context f96947k;

    /* renamed from: l */
    private final int f96948l;

    /* renamed from: m */
    private final axyb f96949m;

    /* renamed from: n */
    private final ayeo f96950n;

    /* renamed from: o */
    private final axua f96951o;

    /* renamed from: p */
    private final ayas f96952p;

    /* renamed from: q */
    private final Object f96953q = new Object();

    /* renamed from: r */
    private boolean f96954r = false;

    /* renamed from: s */
    private long f96955s = Long.MAX_VALUE;

    /* renamed from: t */
    private PendingIntent f96956t = null;

    /* renamed from: u */
    private final ayax f96957u = aybb.m83726a();

    /* renamed from: v */
    private volatile boolean f96958v;

    /* renamed from: w */
    private final AlarmHelper$AlarmBroadcastReceiver f96959w = new TransportWriter$1(this);

    static {
        bxvd da = ayev.f97376n.mo74144da();
        ayeu ayeu = ayeu.f97374a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ayev ayev = (ayev) da.f164949b;
        ayeu.getClass();
        ayev.f97388k = ayeu;
        ayev.f97378a |= 512;
        ayev ayev2 = (ayev) da.mo74062i();
        f96939i = aybb.m83734b(ayev2);
        f96940j = aybb.m83725a(ayev2);
    }

    public ayan(Context context, axyb axyb, OutputStream outputStream, ayeo ayeo, ayas ayas, boolean z, axua axua, int i) {
        this.f96947k = context;
        this.f96949m = axyb;
        this.f96941a = outputStream;
        this.f96950n = ayeo;
        this.f96942b = new axzf(ayeo.f97342b, ayeo.f97343c);
        this.f96943c = z;
        this.f96952p = ayas;
        this.f96946f = false;
        this.f96958v = !z;
        this.f96948l = 12288;
        this.f96951o = axua;
        this.f96944d = i;
    }

    /* renamed from: a */
    private final int m83701a(Queue queue) {
        axzu axzu;
        int i = -1;
        if (!(queue == null || (axzu = (axzu) queue.peek()) == null)) {
            this.f96946f = false;
            i = aybb.m83723a(this.f96949m, this.f96957u, this.f96941a, axzu.mo53812c(), this.f96952p, aybb.m83725a(axzu.mo53810a()), this.f96951o, this.f96944d);
            if (axzu.mo53811b()) {
                queue.poll();
            }
        }
        return i;
    }

    /* renamed from: a */
    public final axzf mo53699a() {
        return this.f96942b;
    }

    /* renamed from: b */
    public final int mo53701b() {
        return this.f96950n.f97345e;
    }

    /* renamed from: c */
    public final void mo53837c() {
        synchronized (this.f96953q) {
            mo53836a("flush triggered");
            if (this.f96956t != null) {
                mo53836a("cancelling alarm");
                Context context = this.f96947k;
                new skc(context).mo25668a(this.f96956t);
                this.f96956t = null;
            }
            this.f96955s = Long.MAX_VALUE;
            this.f96954r = true;
            this.f96953q.notifyAll();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0098, code lost:
        mo53836a("no message found");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009f, code lost:
        if (r9.f96946f == false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a3, code lost:
        if (r9.f96958v == false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a5, code lost:
        r9.f96946f = false;
        mo53836a("sending heartbeat");
        p000.aybb.m83723a(r9.f96949m, r9.f96957u, r9.f96941a, p000.ayan.f96939i, r9.f96952p, p000.ayan.f96940j, r9.f96951o, r9.f96944d);
     */
    public final void run() {
        Queue queue;
        ArrayList arrayList;
        try {
            Thread currentThread = Thread.currentThread();
            String valueOf = String.valueOf(this.f96950n.f97342b);
            currentThread.setName(valueOf.length() == 0 ? new String("Wear:Writer-") : "Wear:Writer-".concat(valueOf));
            while (!Thread.interrupted()) {
                try {
                    mo53836a("waiting for change");
                    synchronized (this.f96953q) {
                        while (!this.f96954r) {
                            this.f96953q.wait();
                        }
                        this.f96954r = false;
                    }
                    mo53836a("change signalled");
                    while (true) {
                        synchronized (this.f96945e) {
                            queue = (Queue) this.f96945e.get(8);
                        }
                        if (m83701a(queue) <= 0) {
                            synchronized (this.f96945e) {
                                arrayList = new ArrayList(this.f96945e.size());
                                int size = this.f96945e.size();
                                for (int i = 0; i < size; i++) {
                                    arrayList.add((Queue) this.f96945e.valueAt(i));
                                }
                            }
                            int size2 = arrayList.size();
                            int i2 = 0;
                            for (int i3 = 0; i3 < size2; i3++) {
                                if (m83701a((Queue) arrayList.get(i3)) >= 0) {
                                    i2++;
                                }
                            }
                            if (i2 == 0) {
                                break;
                            }
                        }
                    }
                    while (true) {
                    }
                } catch (InterruptedException e) {
                    this.f96952p.mo53842a("writer thread interrupted");
                    return;
                }
            }
            this.f96952p.mo53842a("writer was stopped");
        } catch (IOException e2) {
            ayas ayas = this.f96952p;
            String valueOf2 = String.valueOf(e2.getMessage());
            ayas.mo53842a(valueOf2.length() == 0 ? new String("writer threw IOException: ") : "writer threw IOException: ".concat(valueOf2));
            if (Log.isLoggable("Wear_TransportWriter", 3)) {
                String valueOf3 = String.valueOf(e2.getMessage());
                Log.d("Wear_TransportWriter", valueOf3.length() == 0 ? new String("TransportWriter threw IOException: ") : "TransportWriter threw IOException: ".concat(valueOf3));
            }
        } catch (Exception e3) {
            ayas ayas2 = this.f96952p;
            String valueOf4 = String.valueOf(e3.getMessage());
            ayas2.mo53842a(valueOf4.length() == 0 ? new String("writer unexpected exception: ") : "writer unexpected exception: ".concat(valueOf4));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005b  */
    /* renamed from: a */
    public final void mo53700a(int i, long j, ayev ayev, axyt axyt) {
        axzu axzu;
        Queue queue;
        int i2;
        int i3 = i;
        long j2 = j;
        ayev ayev2 = ayev;
        axyt axyt2 = axyt;
        sdo.m34966a(ayev2, "message was null");
        if (this.f96941a != null) {
            int i4 = this.f96950n.f97345e;
            int i5 = this.f96948l;
            if (i4 != 0) {
                axzu = new axzw(i3, ayev2, axyt2, i5);
            } else {
                axzu = new axzv(i3, ayev2, axyt2, i5);
            }
            if (!axzu.mo53811b()) {
                synchronized (this.f96945e) {
                    queue = (Queue) this.f96945e.get(i3);
                    if (queue == null) {
                        if (i3 != 4) {
                            if (i3 != 8) {
                                i2 = (int) chnj.m149035k();
                                if (i2 > 0) {
                                    queue = new ConcurrentLinkedQueue();
                                } else {
                                    queue = new LinkedBlockingQueue(i2);
                                }
                                this.f96945e.put(i3, queue);
                            }
                        }
                        i2 = (int) chnj.f188812a.mo6606a().mo85383I();
                        if (i2 > 0) {
                        }
                        this.f96945e.put(i3, queue);
                    }
                }
                if (queue instanceof BlockingQueue) {
                    BlockingQueue blockingQueue = (BlockingQueue) queue;
                    while (!blockingQueue.offer(axzu, 10, TimeUnit.SECONDS)) {
                        StringBuilder sb = new StringBuilder((int) ErrorInfo.TYPE_SDU_COMMUNICATIONERROR);
                        sb.append(" queue writer failed to queue message in queue ");
                        sb.append(i3);
                        sb.append(" because it was full. Triggering queue flush.");
                        Log.w("Wear_TransportWriter", sb.toString());
                        mo53837c();
                    }
                } else {
                    queue.add(axzu);
                }
                long k = chnj.m149035k();
                if (j2 > SystemClock.elapsedRealtime() + 2000 && (k <= 0 || ((long) queue.size()) <= k - 2)) {
                    synchronized (this.f96953q) {
                        if (this.f96954r || j2 >= this.f96955s) {
                            mo53836a("not scheduling wakeup as a more urgent transfer already exists.");
                        } else {
                            mo53836a("scheduling delayed message alarm");
                            double elapsedRealtime = (double) (j2 - SystemClock.elapsedRealtime());
                            Double.isNaN(elapsedRealtime);
                            long round = Math.round(elapsedRealtime * 0.1d);
                            Context context = this.f96947k;
                            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent("TrasnportWriter::QueueFlush").setClass(context, this.f96959w.getClass()), 134217728);
                            skc skc = new skc(context);
                            int i6 = Build.VERSION.SDK_INT;
                            skc.mo25669a("AlarmHelper", 2, j2 - round, round, 0, broadcast, stx.m36335a(skc.f44604f, (String) null));
                            this.f96956t = broadcast;
                            this.f96955s = j2;
                        }
                    }
                    return;
                }
                mo53836a("writing immediate message");
                mo53837c();
                return;
            }
            String valueOf = String.valueOf(ayev);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 68);
            sb2.append("dropping message from queue because the target node cannot read it: ");
            sb2.append(valueOf);
            Log.w("Wear_TransportWriter", sb2.toString());
            return;
        }
        throw new IOException("TransportWriter is shutdown.");
    }

    /* renamed from: a */
    public final void mo53836a(String str) {
        if (Log.isLoggable("Wear_TransportWriter", 2)) {
            Log.v("Wear_TransportWriter", str);
        }
    }

    /* renamed from: a */
    public final void mo53558a(ssb ssb, boolean z, boolean z2) {
        String str;
        synchronized (this.f96945e) {
            int size = this.f96945e.size();
            StringBuilder sb = new StringBuilder(27);
            sb.append("message queues: ");
            sb.append(size);
            ssb.println(sb.toString());
            SparseArray sparseArray = this.f96945e;
            ssb.mo26034a();
            int size2 = sparseArray.size();
            for (int i = 0; i < size2; i++) {
                int keyAt = sparseArray.keyAt(i);
                Queue queue = (Queue) sparseArray.valueAt(i);
                if (queue.size() > 0) {
                    int size3 = queue.size();
                    StringBuilder sb2 = new StringBuilder(29);
                    sb2.append(keyAt);
                    sb2.append(": size=");
                    sb2.append(size3);
                    ssb.println(sb2.toString());
                    if (z2) {
                        ssb.mo26034a();
                        axzu[] axzuArr = (axzu[]) queue.toArray(new axzu[0]);
                        for (axzu axzu : axzuArr) {
                            ssb.println(ayey.m83900a(axzu.mo53810a()).f97414m);
                            if (f96938h.booleanValue()) {
                                ayev a = axzu.mo53810a();
                                int i2 = a.f97378a;
                                if ((i2 & 1) != 0) {
                                    ayfb ayfb = a.f97379b;
                                    if (ayfb == null) {
                                        ayfb = ayfb.f97441e;
                                    }
                                    str = ayfb.toString();
                                } else if ((i2 & 2) != 0) {
                                    ayea ayea = a.f97380c;
                                    if (ayea == null) {
                                        ayea = ayea.f97270c;
                                    }
                                    str = ayea.toString();
                                } else if ((i2 & 4) != 0) {
                                    ayes ayes = a.f97381d;
                                    if (ayes == null) {
                                        ayes = ayes.f97358f;
                                    }
                                    str = ayes.toString();
                                } else if ((i2 & 8) != 0) {
                                    ayeo ayeo = a.f97382e;
                                    if (ayeo == null) {
                                        ayeo = ayeo.f97339i;
                                    }
                                    str = ayeo.toString();
                                } else if ((i2 & 32) != 0) {
                                    ayfe ayfe = a.f97384g;
                                    if (ayfe == null) {
                                        ayfe = ayfe.f97466e;
                                    }
                                    str = ayfe.toString();
                                } else if ((i2 & 64) != 0) {
                                    ayfc ayfc = a.f97385h;
                                    if (ayfc == null) {
                                        ayfc = ayfc.f97448k;
                                    }
                                    str = ayfc.toString();
                                } else if ((i2 & 128) != 0) {
                                    ayfa ayfa = a.f97386i;
                                    if (ayfa == null) {
                                        ayfa = ayfa.f97427k;
                                    }
                                    str = ayfa.toString();
                                } else if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                    ayfa ayfa2 = a.f97387j;
                                    if (ayfa2 == null) {
                                        ayfa2 = ayfa.f97427k;
                                    }
                                    str = ayfa2.toString();
                                } else if ((i2 & 1024) != 0) {
                                    ayet ayet = a.f97389l;
                                    if (ayet == null) {
                                        ayet = ayet.f97366f;
                                    }
                                    str = ayet.toString();
                                } else if ((i2 & 512) != 0) {
                                    ayeu ayeu = a.f97388k;
                                    if (ayeu == null) {
                                        ayeu = ayeu.f97374a;
                                    }
                                    str = ayeu.toString();
                                } else {
                                    str = "UnknownType";
                                }
                                ssb.println(str);
                            }
                        }
                        ssb.mo26035b();
                    }
                }
            }
            ssb.mo26035b();
        }
    }
}
