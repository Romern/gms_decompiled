package p000;

import android.app.PendingIntent;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.wearable.ConnectionConfiguration;
import java.io.Closeable;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: ayco */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayco extends Thread implements Closeable {

    /* renamed from: a */
    public final aydp f97154a;

    /* renamed from: b */
    private final aycw f97155b;

    /* renamed from: c */
    private final Context f97156c;

    /* renamed from: d */
    private final ConnectionConfiguration f97157d;

    /* renamed from: e */
    private final BluetoothDevice f97158e;

    /* renamed from: f */
    private final Lock f97159f;

    /* renamed from: g */
    private final Condition f97160g;

    /* renamed from: h */
    private final asfb f97161h;

    /* renamed from: i */
    private volatile boolean f97162i = false;

    /* renamed from: j */
    private volatile boolean f97163j = false;

    /* renamed from: k */
    private volatile boolean f97164k = false;

    /* renamed from: l */
    private final AtomicBoolean f97165l;

    public ayco(Context context, BluetoothDevice bluetoothDevice, ConnectionConfiguration connectionConfiguration, aycw aycw) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f97159f = reentrantLock;
        this.f97160g = reentrantLock.newCondition();
        this.f97156c = context;
        sdo.m34959a(bluetoothDevice);
        this.f97158e = bluetoothDevice;
        sdo.m34959a(connectionConfiguration);
        this.f97157d = connectionConfiguration;
        this.f97155b = aycw;
        this.f97154a = new aydp((int) chnj.f188812a.mo6606a().mo85427d(), chnj.f188812a.mo6606a().mo85429f(), chnj.f188812a.mo6606a().mo85428e());
        asfb asfb = new asfb(context, 1, "WearableBluetooth", null, "com.google.android.gms");
        this.f97161h = asfb;
        asfb.mo49115a(false);
        this.f97165l = new AtomicBoolean(true);
        String valueOf = String.valueOf(this.f97157d.f110872i);
        setName(valueOf.length() == 0 ? new String("WearableBtClientThread-") : "WearableBtClientThread-".concat(valueOf));
    }

    /* renamed from: a */
    private static final void m83828a(int i, String str) {
        m83829a(i, str, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0060, code lost:
        return;
     */
    /* renamed from: b */
    private final void m83830b() {
        synchronized (this.f97165l) {
            if (this.f97165l.get()) {
                long c = chnj.f188812a.mo6606a().mo85426c();
                if (c <= 0) {
                    if (Log.isLoggable("WearableBluetooth", 3)) {
                        Log.d("WearableBluetooth", "acquiring wakelock with no timeout");
                    }
                    this.f97161h.mo49117b();
                } else {
                    if (Log.isLoggable("WearableBluetooth", 3)) {
                        StringBuilder sb = new StringBuilder(63);
                        sb.append("acquiring wakelock with timeout of ");
                        sb.append(c);
                        sb.append(" seconds");
                        Log.d("WearableBluetooth", sb.toString());
                    }
                    this.f97161h.mo49111a(c * 1000);
                }
            }
        }
    }

    public final void close() {
        this.f97164k = true;
        interrupt();
        bqhi.m112840a(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0239, code lost:
        android.util.Log.d("WearableBluetooth", "Acquiring the WakeLock so that an alarm can be set.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0240, code lost:
        m83830b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0243, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ae, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b1, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d5, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0109, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0122, code lost:
        android.util.Log.d("WearableBluetooth", "Acquiring the WakeLock so that an alarm can be set.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r12.f97155b.mo53935a("Connection attempted from incorrect client");
        m83828a(4, "Error: Connection attempted from incorrect client");
        r12.f97154a.mo53968c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r12.f97162i = false;
        p000.ayjn.m84115a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0147, code lost:
        if (android.util.Log.isLoggable("WearableBluetooth", 3) != false) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0149, code lost:
        android.util.Log.d("WearableBluetooth", "Acquiring the WakeLock so that an alarm can be set.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r12.f97155b.mo53935a("Wire protocol version mismatch!");
        m83828a(4, "Error: wire protocol version mismatch");
        r12.f97154a.mo53968c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r12.f97162i = false;
        p000.ayjn.m84115a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x016e, code lost:
        if (android.util.Log.isLoggable("WearableBluetooth", 3) != false) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0170, code lost:
        android.util.Log.d("WearableBluetooth", "Acquiring the WakeLock so that an alarm can be set.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x022b, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x022c, code lost:
        r12.f97162i = false;
        p000.ayjn.m84115a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0237, code lost:
        if (android.util.Log.isLoggable("WearableBluetooth", 3) != false) goto L_0x0239;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0239 A[Catch:{ all -> 0x0217, all -> 0x025c }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0000 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ae A[ExcHandler: all (th java.lang.Throwable), Splitter:B:10:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b1 A[ExcHandler: RuntimeException (e java.lang.RuntimeException), Splitter:B:10:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b3 A[ExcHandler: axwa (e axwa), Splitter:B:10:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b6 A[ExcHandler: aybe (e aybe), Splitter:B:10:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d5 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:6:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00fe A[Catch:{ all -> 0x0217, all -> 0x025c }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0109 A[ExcHandler: IOException (e java.io.IOException), Splitter:B:6:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0122 A[Catch:{ all -> 0x0217, all -> 0x025c }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x012a A[ExcHandler: axwa (e axwa), Splitter:B:6:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0149 A[Catch:{ all -> 0x0217, all -> 0x025c }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0151 A[ExcHandler: aybe (e aybe), Splitter:B:6:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0170 A[Catch:{ all -> 0x0217, all -> 0x025c }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x017c A[Catch:{ all -> 0x0217, all -> 0x025c }] */
    public final void run() {
        Lock lock;
        while (!this.f97164k) {
            try {
                String name = this.f97158e.getName();
                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 16);
                sb.append("Connecting to \"");
                sb.append(name);
                sb.append("\"");
                m83828a(2, sb.toString());
                BluetoothSocket bluetoothSocket = null;
                try {
                    this.f97155b.f97186a.incrementAndGet();
                    bluetoothSocket = this.f97158e.createRfcommSocketToServiceRecord(aycp.f97166a);
                    try {
                        bluetoothSocket.connect();
                        this.f97162i = true;
                        this.f97154a.mo53966a();
                        this.f97155b.f97187b.incrementAndGet();
                        m83828a(3, "Connected, running sync loop");
                        if (Log.isLoggable("WearableBluetooth", 3)) {
                            Log.d("WearableBluetooth", "Releasing WakeLock before calling handleConnection.");
                        }
                        this.f97161h.mo49120c();
                        ayha.m83994a().mo53853a(new ayct(this.f97155b, bluetoothSocket.getInputStream()), new aycu(this.f97155b, bluetoothSocket.getOutputStream()), this.f97157d);
                        this.f97155b.mo53935a("Socket closed");
                        m83828a(1, "Socket closed");
                        this.f97162i = false;
                        ayjn.m84115a(bluetoothSocket);
                        if (Log.isLoggable("WearableBluetooth", 3)) {
                            Log.d("WearableBluetooth", "Acquiring the WakeLock so that an alarm can be set.");
                        }
                    } catch (IOException e) {
                        axty.m83201a(5);
                        axty.m83204a(5, ayha.m84001g(), this.f97157d.mo60245a());
                        throw e;
                    } catch (aybe e2) {
                    } catch (axwa e3) {
                    } catch (RuntimeException e4) {
                    } catch (IOException e5) {
                        e = e5;
                        m83829a(1, "Failed to connect", this.f97155b.mo53934a(e));
                        this.f97162i = false;
                        ayjn.m84115a(bluetoothSocket);
                        if (Log.isLoggable("WearableBluetooth", 3)) {
                        }
                        m83830b();
                        if (!this.f97164k) {
                        }
                    } catch (Throwable th) {
                    }
                } catch (RuntimeException e6) {
                    throw new IOException("Caught RuntimeException when creating the RFComm socket.", e6);
                } catch (aybe e7) {
                } catch (axwa e8) {
                } catch (IOException e9) {
                } catch (RuntimeException e10) {
                    e = e10;
                    Log.d("WearableBluetooth", "Unexpected runtime exception", e);
                    this.f97155b.mo53934a(new IOException("Unexpected runtime exception", e));
                    m83829a(1, "Unexpected runtime exception", e);
                    this.f97162i = false;
                    ayjn.m84115a(bluetoothSocket);
                    if (Log.isLoggable("WearableBluetooth", 3)) {
                        Log.d("WearableBluetooth", "Acquiring the WakeLock so that an alarm can be set.");
                    }
                    m83830b();
                    if (!this.f97164k) {
                    }
                } catch (Throwable th2) {
                }
                m83830b();
                if (!this.f97164k) {
                    long b = this.f97154a.mo53967b();
                    m83828a(1, String.format(Locale.US, "Waiting %.1f seconds to retry connection", Float.valueOf(((float) b) / 1000.0f)));
                    skc skc = new skc(this.f97156c);
                    long elapsedRealtime = SystemClock.elapsedRealtime() + b;
                    this.f97159f.lock();
                    try {
                        int i = Build.VERSION.SDK_INT;
                        if (b > chnj.f188812a.mo6606a().mo85430g()) {
                            skc.mo25679b("WearableBluetooth", 2, elapsedRealtime, PendingIntent.getBroadcast(this.f97156c, 1, new Intent("com.google.android.gms.wearable.node.bluetooth.RETRY_CONNECTION", new Uri.Builder().scheme("content").authority(this.f97157d.f110865b).build()), 134217728));
                            if (Log.isLoggable("WearableBluetooth", 3)) {
                                Log.d("WearableBluetooth", "Releasing the WakeLock after setting retry alarm.");
                            }
                            this.f97161h.mo49120c();
                            while (!this.f97163j) {
                                this.f97160g.await();
                            }
                            this.f97163j = false;
                            lock = this.f97159f;
                            lock.unlock();
                        } else {
                            Thread.sleep(b);
                            m83830b();
                            lock = this.f97159f;
                            lock.unlock();
                        }
                    } catch (InterruptedException e11) {
                        m83829a(1, "Retry interrupted.", e11);
                        Thread.interrupted();
                        lock = this.f97159f;
                    }
                }
            } catch (Throwable th3) {
                m83828a(1, "Wear OS BluetoothThread finished");
                synchronized (this.f97165l) {
                    this.f97165l.set(false);
                    this.f97161h.mo49120c();
                    throw th3;
                }
            }
        }
        m83828a(1, "Wear OS BluetoothThread finished");
        synchronized (this.f97165l) {
            this.f97165l.set(false);
            this.f97161h.mo49120c();
        }
    }

    /* renamed from: a */
    private static final void m83829a(int i, String str, Throwable th) {
        ayha.m83996b().mo53963a(i, str, th);
    }

    /* renamed from: a */
    public final void mo53904a() {
        if (!this.f97162i) {
            this.f97159f.lock();
            try {
                this.f97163j = true;
                if (Log.isLoggable("WearableBluetooth", 3)) {
                    Log.d("WearableBluetooth", "Acquiring the WakeLock to signal a connection retry.");
                }
                m83830b();
                this.f97160g.signal();
            } finally {
                this.f97159f.unlock();
            }
        } else if (Log.isLoggable("WearableBluetooth", 3)) {
            String valueOf = String.valueOf(this.f97157d.f110864a);
            Log.d("WearableBluetooth", valueOf.length() == 0 ? new String("Ignoring connection retry; already connected for this device: ") : "Ignoring connection retry; already connected for this device: ".concat(valueOf));
        }
    }
}
