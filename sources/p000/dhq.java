package p000;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.Service;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: dhq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class dhq extends Service implements dhh {

    /* renamed from: a */
    static final long f13157a = TimeUnit.SECONDS.toMillis(7);

    /* renamed from: b */
    public long f13158b;

    /* renamed from: c */
    public boolean f13159c;

    /* renamed from: d */
    public final Object f13160d = new Object();

    /* renamed from: e */
    public final List f13161e = new ArrayList();

    /* renamed from: f */
    public int f13162f = 0;

    /* renamed from: g */
    public boolean f13163g = false;

    /* renamed from: h */
    public final SparseArray f13164h = new SparseArray();

    /* renamed from: i */
    private boolean f13165i;

    /* renamed from: j */
    private Handler f13166j;

    /* renamed from: k */
    private final dii f13167k;

    /* renamed from: l */
    private final ReentrantLock f13168l = new ReentrantLock();

    /* renamed from: m */
    private final Deque f13169m = new ArrayDeque();

    /* renamed from: n */
    private final SparseArray f13170n = new SparseArray();

    /* renamed from: o */
    private long f13171o = 0;

    /* renamed from: p */
    private long f13172p = 0;

    /* renamed from: q */
    private dhm f13173q;

    /* renamed from: r */
    private int f13174r = 0;

    /* renamed from: s */
    private int f13175s = 0;

    /* renamed from: t */
    private int f13176t = 0;

    /* renamed from: u */
    private int f13177u = 0;

    /* renamed from: v */
    private Thread f13178v;

    /* renamed from: w */
    private PendingIntent f13179w = null;

    /* renamed from: x */
    private final SparseArray f13180x = new SparseArray();

    /* renamed from: y */
    private boolean f13181y = false;

    public dhq(dii dii) {
        this.f13167k = dii;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private final int m8505a(String str, Intent intent, dhi dhi) {
        Intent intent2;
        Intent intent3;
        String str2 = null;
        if ("com.google.android.chimera.container.IntentOperationService.WAKEFUL_INTENT".equals(str)) {
            Intent intent4 = dhi.f13118e;
            if (intent4 == null || (intent3 = (Intent) intent4.getParcelableExtra("intent")) == null) {
                str = null;
            } else {
                dhi.f13119f = dhi.f13118e;
                dhi.f13118e = intent3;
                str = dhi.f13118e.getAction();
            }
            if (str == null) {
                Log.w("IntentOperationSvc", "Dropping malformed WAKEFUL_INTENT_ACTION");
            }
        }
        if ("com.google.android.chimera.container.IntentOperationService.EXTERNAL_INTENT".equals(str)) {
            Intent intent5 = dhi.f13118e;
            if (!(intent5 == null || (intent2 = (Intent) intent5.getParcelableExtra("intent")) == null)) {
                dhi.f13124k = true;
                dhi.f13118e = intent2;
                str2 = dhi.f13118e.getAction();
            }
            if (str2 == null) {
                Log.w("IntentOperationSvc", "Dropping malformed EXTERNAL_INTENT_ACTION");
            }
            str = str2;
        }
        if ("com.google.android.chimera.container.IntentOperationService.MODULE_SPECIFIC".equals(str) && ((str = dhi.mo9013a()) == null || dhi.f13123j == null)) {
            Log.w("IntentOperationSvc", "Dropping malformed MODULE_SPECIFIC_ACTION");
        }
        if (str == null) {
            dhi.mo9014b();
            return 2;
        } else if ("com.google.android.chimera.container.IntentOperationService.RELEASE_WAKELOCK_ACTION".equals(str)) {
            m8507b(intent);
            dhi.mo9014b();
            mo9022a(true);
            return 2;
        } else if ("com.google.android.chimera.container.IntentOperationService.KEEPALIVE".equals(str)) {
            int intExtra = intent.getIntExtra("keepAliveDuration", 0);
            if (intExtra > 0) {
                long uptimeMillis = SystemClock.uptimeMillis() + ((long) intExtra);
                long j = this.f13172p;
                if (j > uptimeMillis) {
                    uptimeMillis = j;
                }
                this.f13172p = uptimeMillis;
                dii dii = this.f13167k;
                synchronized (dii.f13224c) {
                    int i = dii.f13226e - 1;
                    dii.f13226e = i;
                    if (i < 0) {
                        Log.e("WakelockManager", "Keep alive invocation counter should never be below zero.");
                    }
                }
            }
            dhi.mo9014b();
            mo9022a(true);
            return 2;
        } else {
            dhm dhm = this.f13173q;
            dhm.f13143f.lock();
            try {
                dhm.f13140c.execute(new dhk(dhm, dhi));
                dhm.f13145h++;
                dhm.f13143f.unlock();
                this.f13166j.removeMessages(0);
                return 3;
            } catch (Throwable th) {
                dhm.f13143f.unlock();
                throw th;
            }
        }
    }

    /* renamed from: b */
    private final void m8507b(Intent intent) {
        boolean z;
        dii dii = this.f13167k;
        synchronized (dii.f13224c) {
            boolean z2 = true;
            if (dii.f13224c.size() == 0) {
                z = true;
            } else {
                z = false;
            }
            int intExtra = intent.getIntExtra("wakelockId", -1);
            if (intExtra != -1) {
                if (intent.getLongExtra("uniqueId", 0) == dii.f13223b) {
                    Object obj = dii.f13224c.get(intExtra);
                    if (obj == null) {
                        long j = dii.f13223b;
                        StringBuilder sb = new StringBuilder(71);
                        sb.append("No active wake lock id #");
                        sb.append(intExtra);
                        sb.append(" and unique id #");
                        sb.append(j);
                        Log.w("WakelockManager", sb.toString());
                    } else {
                        dii.mo9097a(obj);
                        dii.f13224c.remove(intExtra);
                        if (dii.f13224c.size() != 0) {
                            z2 = false;
                        }
                        z = z2;
                    }
                }
            }
        }
        if (z) {
            this.f13172p = 0;
        }
    }

    /* renamed from: a */
    public void mo9009a(IntentOperation intentOperation, Context context) {
        throw null;
    }

    /* renamed from: c */
    public final void mo9025c() {
        int size;
        int[] iArr;
        Parcelable[] parcelableArr;
        synchronized (this.f13164h) {
            size = this.f13164h.size();
            iArr = new int[size];
            parcelableArr = new Parcelable[size];
            for (int i = 0; i < size; i++) {
                iArr[i] = this.f13164h.keyAt(i);
                parcelableArr[i] = (Parcelable) this.f13164h.valueAt(i);
            }
        }
        if (size == 0 || iArr[0] > this.f13176t) {
            this.f13174r = 0;
        }
        Intent putExtra = mo9020a("com.google.android.chimera.container.IntentOperationService.SAVED_INTENT").putExtra("requestCodes", iArr).putExtra("pendingIntents", parcelableArr).putExtra("crashCount", this.f13174r);
        PendingIntent pendingIntent = this.f13179w;
        PendingIntent service = PendingIntent.getService(this, 0, putExtra, 134217728);
        this.f13179w = service;
        if (pendingIntent != null) {
            return;
        }
        if (service != null) {
            try {
                ((AlarmManager) getSystemService("alarm")).set(3, SystemClock.elapsedRealtime() + 315360000000L, service);
            } catch (SecurityException e) {
                Log.w("IntentOperationSvc", "Failed to save index PendingIntent in AlarmManager.");
            }
        } else {
            throw new SecurityException("indexPendingIntent is null.");
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print("IntentOperationService [");
        printWriter.print(getClass().getName());
        printWriter.println("] active actions:");
        dhm dhm = this.f13173q;
        dhm.f13143f.lock();
        try {
            ArrayList arrayList = new ArrayList(dhm.f13144g.keySet());
            dhm.f13143f.unlock();
            Collections.sort(arrayList);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                printWriter.print("  ");
                printWriter.println((String) arrayList.get(i));
            }
        } catch (Throwable th) {
            dhm.f13143f.unlock();
            throw th;
        }
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        this.f13158b = SystemClock.uptimeMillis();
        do {
        } while (SystemClock.uptimeMillis() == this.f13158b);
        this.f13165i = this.f13167k.f13225d.getClassName().equals(getContainerService().getClass().getName());
        dhm dhm = new dhm(this.f13168l, this.f13167k, getContainerService(), this);
        this.f13173q = dhm;
        String name = dhm.getClass().getName();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 19);
        sb.append("[");
        sb.append(name);
        sb.append("] operation loader");
        dhm.f13140c = Executors.newSingleThreadExecutor(new dlc(sb.toString()));
        String name2 = dhm.getClass().getName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(name2).length() + 7);
        sb2.append("[");
        sb2.append(name2);
        sb2.append("] idle");
        dhm.f13139b = sb2.toString();
        dhm.f13141d = new ThreadPoolExecutor(1, 25, 5, TimeUnit.SECONDS, new SynchronousQueue(), new dlc(dhm.f13139b));
        dhm.f13141d.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy());
        this.f13166j = new dhp(this);
        boolean b = dfq.m8314a().mo8863b();
        this.f13181y = b;
        if (b) {
            dfq.m8314a();
            if (cdjh.f180979a.mo6606a().mo77729I()) {
                Thread thread = new Thread(new dho(this), getClass().getSimpleName());
                this.f13178v = thread;
                thread.start();
            }
        }
        if (this.f13181y) {
            synchronized (this.f13160d) {
                PendingIntent service = PendingIntent.getService(this, 0, mo9020a("com.google.android.chimera.container.IntentOperationService.SAVED_INTENT"), 536870912);
                if (service != null) {
                    try {
                        service.send(this, 0, new Intent().putExtra("uniqueid", this.f13158b));
                        this.f13159c = true;
                    } catch (PendingIntent.CanceledException e) {
                        Log.w("IntentOperationSvc", "Failed to send index PendingIntent. Continue as a fresh start.");
                        this.f13159c = false;
                    }
                } else {
                    this.f13159c = false;
                }
            }
        }
    }

    public final void onDestroy() {
        if (this.f13181y) {
            Thread thread = this.f13178v;
            if (thread != null) {
                thread.interrupt();
                try {
                    thread.join();
                } catch (InterruptedException e) {
                }
            }
            PendingIntent pendingIntent = this.f13179w;
            if (pendingIntent != null) {
                ((AlarmManager) getSystemService("alarm")).cancel(pendingIntent);
                pendingIntent.cancel();
            }
        }
        dhm dhm = this.f13173q;
        dhm.f13140c.shutdown();
        dhm.f13141d.shutdown();
        super.onDestroy();
    }

    /* JADX INFO: finally extract failed */
    public final int onStartCommand(Intent intent, int i, int i2) {
        boolean a;
        boolean z = false;
        String str = null;
        if (this.f13181y) {
            if (intent != null && "com.google.android.chimera.container.IntentOperationService.NEW_START_INTENT".equals(intent.getAction())) {
                dhi a2 = this.f13173q.mo9017a(intent, i, i2, null);
                this.f13168l.lock();
                try {
                    a2.mo9013a();
                    intent = a2.f13118e;
                } finally {
                    this.f13168l.unlock();
                }
            }
            if (this.f13178v != null) {
                if (intent != null) {
                    String action = intent.getAction();
                    synchronized (this.f13160d) {
                        this.f13177u = i2;
                        if (!"com.google.android.chimera.container.IntentOperationService.NO_OP".equals(action)) {
                            this.f13161e.add(intent);
                            this.f13162f = i2;
                            this.f13160d.notifyAll();
                            return 3;
                        }
                    }
                }
                mo9022a(true);
                return 1;
            }
            if (intent != null) {
                str = intent.getAction();
            }
            if (intent != null) {
                if (this.f13159c) {
                    synchronized (this.f13160d) {
                        if ("com.google.android.chimera.container.IntentOperationService.SAVED_INTENT".equals(str)) {
                            if (intent.getLongExtra("uniqueid", -1) == this.f13158b) {
                                synchronized (this.f13164h) {
                                    mo9021a(intent, this.f13161e);
                                }
                                this.f13161e.clear();
                                mo9025c();
                                stopSelf(this.f13177u);
                                this.f13159c = false;
                            }
                        }
                        this.f13161e.add(intent);
                        this.f13177u = i2;
                        return 3;
                    }
                }
                synchronized (this.f13164h) {
                    a = mo9023a(intent);
                }
                z = a;
                mo9024b();
            }
            synchronized (this.f13160d) {
                this.f13177u = i2;
                if (z) {
                    mo9025c();
                }
                if (this.f13180x.size() > 0) {
                    return 1;
                }
                mo9022a(true);
                return 2;
            }
        } else if (intent == null) {
            return 2;
        } else {
            dhi a3 = this.f13173q.mo9017a(intent, i, i2, null);
            this.f13168l.lock();
            try {
                String action2 = intent.getAction();
                if (!"com.google.android.chimera.container.IntentOperationService.NEW_START_INTENT".equals(action2)) {
                    str = action2;
                } else if (!intent.hasExtra("startid") || !intent.hasExtra("intent")) {
                    Log.w("IntentOperationSvc", "Dropping malformed NEW_START_ACTION");
                } else if (intent.getLongExtra("uniqueid", -1) == this.f13158b) {
                    int indexOfKey = this.f13170n.indexOfKey(intent.getIntExtra("startid", -1));
                    if (indexOfKey >= 0) {
                        a3 = (dhi) this.f13170n.valueAt(indexOfKey);
                        this.f13170n.removeAt(indexOfKey);
                        str = action2;
                    } else {
                        Log.w("IntentOperationSvc", "Dropping NEW_START_ACTION with invalid startId");
                    }
                } else {
                    str = a3.mo9013a();
                    if (str == null) {
                        Log.w("IntentOperationSvc", "Dropping intent-less NEW_START_ACTION");
                    }
                }
                this.f13169m.addLast(a3);
                if ("com.google.android.chimera.container.IntentOperationService.NEW_START_INTENT".equals(str)) {
                    bmzs.m108698a(a3.f13122i);
                    a3.f13122i = false;
                    a3.f13120g = i2;
                    a3.mo9014b();
                    this.f13168l.unlock();
                    return 3;
                }
                int a4 = m8505a(str, intent, a3);
                this.f13168l.unlock();
                return a4;
            } catch (Throwable th) {
                this.f13168l.unlock();
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final void mo9024b() {
        Intent intent;
        int i;
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f13180x.size() && (intent = (Intent) this.f13180x.valueAt(i2)) != null) {
            int keyAt = this.f13180x.keyAt(i2);
            if (keyAt <= this.f13176t) {
                i = 1;
            } else {
                i = 0;
            }
            Intent intent2 = (Intent) intent.getParcelableExtra("intent");
            bmzs.m108696a(intent2);
            this.f13168l.lock();
            try {
                if (m8505a(intent2.getAction(), intent2, this.f13173q.mo9017a(intent2, i, keyAt, intent.getStringArrayListExtra("blacklistedOperations"))) == 2) {
                    m8506a(keyAt);
                }
                this.f13168l.unlock();
                i3++;
                i2++;
            } catch (Throwable th) {
                this.f13168l.unlock();
                throw th;
            }
        }
        for (int i4 = 0; i4 < i3; i4++) {
            this.f13180x.removeAt(i4);
        }
    }

    /* renamed from: b */
    public final void mo9012b(dhi dhi) {
        Intent intent = dhi.f13119f;
        if (intent != null) {
            if (!this.f13165i) {
                intent.removeExtra("intent");
                dhi.f13119f.setAction("com.google.android.chimera.container.IntentOperationService.RELEASE_WAKELOCK_ACTION");
                dhi.f13119f.setComponent(this.f13167k.f13225d);
                startService(dhi.f13119f);
            } else {
                m8507b(intent);
                mo9022a(true);
            }
            dhi.f13119f = null;
        }
    }

    /* renamed from: a */
    private final void m8506a(int i) {
        synchronized (this.f13164h) {
            int indexOfKey = this.f13164h.indexOfKey(i);
            if (indexOfKey >= 0) {
                ((PendingIntent) this.f13164h.valueAt(indexOfKey)).cancel();
                this.f13164h.removeAt(indexOfKey);
            }
        }
    }

    /* renamed from: a */
    public final Intent mo9020a(String str) {
        return new Intent(this, getContainerService().getClass()).setPackage(getPackageName()).setAction(str);
    }

    /* renamed from: a */
    public IntentOperation mo9006a(Constructor constructor, Context context) {
        return (IntentOperation) constructor.newInstance(new Object[0]);
    }

    /* renamed from: a */
    public final void mo9007a() {
        this.f13171o = SystemClock.uptimeMillis() + f13157a;
        mo9022a(true);
    }

    /* renamed from: a */
    public final void mo9021a(Intent intent, List list) {
        this.f13174r = intent.getIntExtra("crashCount", 0) + 1;
        int[] intArrayExtra = intent.getIntArrayExtra("requestCodes");
        Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("pendingIntents");
        if (this.f13174r >= 4) {
            Log.e("IntentOperationSvc", "Dropping the index due to too many crashes. Continue as a fresh start.");
            this.f13174r = 0;
            intArrayExtra = new int[0];
        } else if (intArrayExtra == null || parcelableArrayExtra == null || intArrayExtra.length != parcelableArrayExtra.length) {
            Log.e("IntentOperationSvc", "Dropping the index due to malformed data. Continue as a fresh start.");
            this.f13174r = 0;
            intArrayExtra = new int[0];
        }
        for (int i = 0; i < intArrayExtra.length; i++) {
            Parcelable parcelable = parcelableArrayExtra[i];
            if (parcelable != null && (parcelable instanceof PendingIntent)) {
                int i2 = intArrayExtra[i];
                this.f13175s = i2;
                this.f13164h.append(i2, (PendingIntent) parcelable);
                this.f13180x.append(this.f13175s, null);
            }
        }
        this.f13176t = this.f13175s;
        int size = this.f13180x.size();
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            mo9023a((Intent) list.get(i3));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            if (this.f13180x.valueAt(i5) == null) {
                try {
                    ((PendingIntent) this.f13164h.valueAt(i5)).send();
                } catch (PendingIntent.CanceledException e) {
                    intArrayExtra[i4] = i5;
                    i4++;
                }
            }
        }
        for (int i6 = 0; i6 < i4; i6++) {
            this.f13164h.removeAt(intArrayExtra[i6]);
            this.f13180x.removeAt(intArrayExtra[i6]);
        }
    }

    /* renamed from: a */
    public final void mo9008a(IntentOperation intentOperation) {
        intentOperation.onDestroy();
    }

    /* renamed from: a */
    public final void mo9010a(dhi dhi) {
        boolean z;
        if (dhi.f13118e == null) {
            z = true;
        } else {
            z = false;
        }
        bmzs.m108698a(z);
        if (this.f13181y) {
            m8506a(dhi.f13120g);
        } else if (!dhi.f13115b) {
            while (true) {
                bmzs.m108698a(!this.f13169m.isEmpty());
                dhi dhi2 = (dhi) this.f13169m.remove();
                bmzs.m108698a(!dhi2.f13122i);
                if (dhi2 == dhi) {
                    break;
                }
                Intent intent = dhi2.f13118e;
                if (intent != null) {
                    String str = dhi2.f13123j;
                    if (str != null) {
                        intent = IntentOperation.getModuleSpecificIntent(str, intent);
                    }
                    if (dhi2.f13124k) {
                        intent = IntentOperation.getExternalIntent(intent);
                    }
                    Intent intent2 = dhi2.f13119f;
                    if (intent2 != null) {
                        intent = intent2;
                    }
                    startService(new Intent(this, getContainerService().getClass()).setAction("com.google.android.chimera.container.IntentOperationService.NEW_START_INTENT").putExtra("uniqueid", this.f13158b).putExtra("startid", dhi2.f13120g).putExtra("intent", intent));
                    this.f13170n.append(dhi2.f13120g, dhi2);
                    bmzs.m108698a(!dhi2.f13122i);
                    dhi2.f13122i = true;
                    dhi2.f13121h++;
                } else {
                    bmzs.m108698a(dhi2.f13115b);
                }
            }
            if (this.f13169m.isEmpty() && this.f13170n.size() == 0) {
                startService(new Intent(this, getContainerService().getClass()).setAction("com.google.android.chimera.container.IntentOperationService.KEEPALIVE"));
            }
            stopSelf(dhi.f13120g);
        }
    }

    /* renamed from: a */
    public final void mo9011a(dhi dhi, String str) {
        bmzs.m108698a(this.f13181y);
        int i = dhi.f13120g;
        ArrayList arrayList = new ArrayList();
        List list = dhi.f13117d;
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(str);
        PendingIntent.getService(this, i, mo9020a("com.google.android.chimera.container.IntentOperationService.SAVED_INTENT").putExtra("intent", dhi.f13116c).putExtra("requestCode", i).putStringArrayListExtra("blacklistedOperations", arrayList), 134217728);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003f, code lost:
        if (r6.f13163g != false) goto L_0x0041;
     */
    /* renamed from: a */
    public final void mo9022a(boolean z) {
        ReentrantLock reentrantLock;
        int i;
        dhi dhi;
        this.f13168l.lock();
        dhm dhm = this.f13173q;
        dhm.f13143f.lock();
        try {
            int i2 = dhm.f13145h;
            dhm.f13143f.unlock();
            if (i2 > 0) {
                reentrantLock = this.f13168l;
            } else if (this.f13181y || this.f13170n.size() <= 0) {
                if (this.f13181y) {
                    synchronized (this.f13160d) {
                        if (this.f13161e.isEmpty()) {
                            if (!z) {
                            }
                            i = this.f13177u;
                        }
                        reentrantLock = this.f13168l;
                    }
                } else {
                    i = 0;
                }
                long max = Math.max(this.f13171o, this.f13172p) - SystemClock.uptimeMillis();
                if (max > 0) {
                    this.f13166j.sendEmptyMessageDelayed(0, max);
                } else {
                    dii dii = this.f13167k;
                    synchronized (dii.f13224c) {
                        if (dii.f13226e <= 0) {
                            if (dii.f13224c.size() != 0) {
                                for (int i3 = 0; i3 < dii.f13224c.size(); i3++) {
                                    dii.mo9097a(dii.f13224c.valueAt(i3));
                                }
                                dii.f13224c.clear();
                                dii.mo9096a();
                                dii.f13222a = 0;
                            }
                        }
                    }
                    if (this.f13181y) {
                        stopSelf(i);
                        reentrantLock = this.f13168l;
                    } else if (!this.f13169m.isEmpty()) {
                        do {
                            dhi = (dhi) this.f13169m.remove();
                            bmzs.m108698a(dhi.f13115b);
                        } while (!this.f13169m.isEmpty());
                        stopSelf(dhi.f13120g);
                    } else {
                        reentrantLock = this.f13168l;
                    }
                }
                reentrantLock = this.f13168l;
            } else {
                reentrantLock = this.f13168l;
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            this.f13168l.unlock();
            throw th;
        }
    }

    /* renamed from: a */
    public final boolean mo9023a(Intent intent) {
        if (intent == null) {
            return false;
        }
        if ("com.google.android.chimera.container.IntentOperationService.SAVED_INTENT".equals(intent.getAction())) {
            int indexOfKey = this.f13180x.indexOfKey(intent.getIntExtra("requestCode", 0));
            if (indexOfKey >= 0) {
                this.f13180x.setValueAt(indexOfKey, intent);
            }
            return false;
        }
        this.f13175s++;
        Intent putExtra = mo9020a("com.google.android.chimera.container.IntentOperationService.SAVED_INTENT").putExtra("intent", intent).putExtra("requestCode", this.f13175s);
        this.f13164h.append(this.f13175s, PendingIntent.getService(this, this.f13175s, putExtra, 134217728));
        this.f13180x.append(this.f13175s, putExtra);
        return true;
    }
}
