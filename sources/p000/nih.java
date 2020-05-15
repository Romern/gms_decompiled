package p000;

import android.content.ComponentName;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.text.SimpleDateFormat;
import java.util.BitSet;
import java.util.Date;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: nih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class nih extends nvt {

    /* renamed from: j */
    private static BitSet f35695j = null;

    /* renamed from: a */
    public final nig f35696a = new nig(this);

    /* renamed from: b */
    final Queue f35697b = new ConcurrentLinkedQueue();

    /* renamed from: c */
    protected final Object f35698c = new Object();

    /* renamed from: d */
    protected final String f35699d;

    /* renamed from: e */
    protected final ComponentName f35700e;

    /* renamed from: f */
    private final C1227nt f35701f = new C1227nt(10);

    /* renamed from: h */
    private final boolean f35702h;

    /* renamed from: i */
    private long f35703i;

    public nih(nij nij, Looper looper, ComponentName componentName) {
        super(nij, looper);
        this.f35700e = componentName;
        this.f35699d = nij.m26407a(componentName);
        ComponentName componentName2 = this.f35700e;
        String[] split = ccuf.f179931a.mo6606a().mo76812w().split(",");
        int length = split.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < length) {
                if (split[i].trim().equalsIgnoreCase(componentName2.getPackageName())) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        this.f35702h = z;
    }

    /* renamed from: e */
    private static boolean m26389e(int i) {
        if (f35695j == null) {
            f35695j = new BitSet();
            for (String str : ccuf.f179931a.mo6606a().mo76811v().split(",")) {
                try {
                    f35695j.set(Integer.parseInt(str));
                } catch (IndexOutOfBoundsException | NumberFormatException e) {
                    bnsi b = nij.f35704a.mo68387b();
                    b.mo68437a(e);
                    b.mo68432a("nih", "e", 902, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b.mo68405a("Failed to parse enableInteractionLogCommandList");
                }
            }
        }
        return f35695j.get(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo20747a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20748a() {
        synchronized (this.f35698c) {
            this.f35697b.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo20754a(nij nij, Message message);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo20755b(int i);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo20756b(Message message);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo20757b() {
        mo20748a();
        mo20761d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo20758c() {
        nwp.m28031a(this, this.f35696a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo20761d() {
        throw null;
    }

    public final void handleMessage(Message message) {
        String str;
        nij nij = (nij) mo21726f();
        if (nij != null) {
            String b = mo20756b(message);
            if (b != null) {
                String a = mo20747a(message.what);
                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 1 + b.length());
                sb.append(a);
                sb.append(" ");
                sb.append(b);
                str = sb.toString();
            } else {
                str = mo20747a(message.what);
            }
            synchronized (this.f35701f) {
                if (this.f35701f.mo15529a() == 10) {
                    this.f35701f.mo15532b();
                }
                this.f35701f.mo15531a(new Pair(Long.valueOf(System.currentTimeMillis()), str));
            }
            mo20754a(nij, message);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("CMH{[");
        boolean z = true;
        for (Message message : this.f35697b) {
            if (z) {
                str = "(";
            } else {
                str = " (";
            }
            sb.append(str);
            sb.append(message.what);
            if (message.arg1 != 0) {
                sb.append(" ");
                sb.append(message.arg1);
            }
            if (message.arg2 != 0) {
                sb.append(" ");
                sb.append(message.arg2);
            }
            if (message.obj != null) {
                sb.append(" ");
                sb.append(message.obj);
            }
            sb.append(")");
            z = false;
        }
        sb.append("]}");
        mo20753a(sb);
        return sb.toString();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nih.a(int, android.os.Message, boolean):void
     arg types: [int, android.os.Message, int]
     candidates:
      nih.a(int, int, java.lang.Throwable):void
      nih.a(int, android.os.Message, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20749a(int i, int i2) {
        mo20751a(i, Message.obtain(this, i2), true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo20759c(int i) {
        nig nig = this.f35696a;
        nig.f35693a = i;
        nwp.m28032a(this, nig, (long) mo20755b(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo20762d(int i) {
        mo20760c(Message.obtain(this, i));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nij.a(java.lang.RuntimeException, boolean):void
     arg types: [java.lang.RuntimeException, int]
     candidates:
      nij.a(android.content.res.Configuration, int):void
      nij.a(java.lang.RuntimeException, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nih.a(int, boolean):void
     arg types: [int, int]
     candidates:
      nih.a(int, int):void
      nih.a(nij, android.os.Message):void
      adzt.a(android.os.Message, long):void
      nih.a(int, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20750a(int i, int i2, Throwable th) {
        if (i2 == 1) {
            return;
        }
        if (th != null) {
            bnsi b = nij.f35704a.mo68387b();
            b.mo68432a("nih", "a", 729, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68422a("component: %s; Exception calling %d", (Object) this.f35699d, i);
            String a = mo20747a(i);
            String flattenToShortString = this.f35700e.flattenToShortString();
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 19 + String.valueOf(flattenToShortString).length());
            sb.append("Command ");
            sb.append(a);
            sb.append(" failed in ");
            sb.append(flattenToShortString);
            ((nij) mo21726f()).mo20769a(new RuntimeException(sb.toString()), false);
        } else if (i2 == 3) {
            bnsn bnsn = nij.f35704a;
            mo20747a(i);
            mo20752a(i, false);
        } else if (i2 == 2) {
            mo20752a(i, true);
        } else if (i2 != 4) {
            bnsi b2 = nij.f35704a.mo68387b();
            b2.mo68432a("nih", "a", 749, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b2.mo68420a("Unknown result for command %s", mo20747a(i));
            mo20752a(i, false);
        } else {
            mo20758c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo20760c(Message message) {
        synchronized (this.f35698c) {
            boolean isEmpty = this.f35697b.isEmpty();
            this.f35697b.add(message);
            if (isEmpty) {
                this.f35703i = SystemClock.elapsedRealtime();
                sendMessage(Message.obtain(message));
                mo20759c(message.what);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20751a(int i, Message message, boolean z) {
        String str;
        synchronized (this.f35698c) {
            Message message2 = (Message) this.f35697b.peek();
            if (message2 != null && message2.what == i) {
                sendMessage(message);
            } else if (z) {
                bnsi c = nij.f35704a.mo68388c();
                c.mo68432a("nih", "a", 838, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                String str2 = this.f35699d;
                if (message2 != null) {
                    str = mo20747a(message2.what);
                } else {
                    str = "null";
                }
                c.mo68426a("Ignoring unexpected message continuation in %s: head %s; got %s %s", str2, str, mo20747a(message.what), mo20756b(message));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20752a(int i, boolean z) {
        int i2;
        synchronized (this.f35698c) {
            mo20758c();
            Message message = (Message) this.f35697b.peek();
            if (message == null || message.what != i) {
                bnsi c = nij.f35704a.mo68388c();
                c.mo68432a("nih", "a", 863, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68425a("Ignoring unexpected message completion in %s: head %s; got %d", this.f35700e.toShortString(), message, Integer.valueOf(i));
            } else {
                this.f35697b.remove();
                if (!z) {
                    i2 = 3;
                } else {
                    i2 = 2;
                }
                if (this.f35702h) {
                    if (m26389e(message.what)) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        bxvd da = bpcp.f135812j.mo74144da();
                        int i3 = message.what;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bpcp bpcp = (bpcp) da.f164949b;
                        int i4 = bpcp.f135814a | 4;
                        bpcp.f135814a = i4;
                        bpcp.f135817d = i3;
                        bpcp.f135814a = i4 | 16;
                        bpcp.f135819f = i2 - 1;
                        int i5 = message.arg1;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bpcp bpcp2 = (bpcp) da.f164949b;
                        bpcp2.f135814a |= 64;
                        bpcp2.f135821h = i5;
                        int i6 = message.arg2;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bpcp bpcp3 = (bpcp) da.f164949b;
                        int i7 = bpcp3.f135814a | 128;
                        bpcp3.f135814a = i7;
                        bpcp3.f135822i = i6;
                        long j = this.f35703i;
                        if (elapsedRealtime >= j) {
                            bpcp3.f135814a = i7 | 8;
                            bpcp3.f135818e = (int) (elapsedRealtime - j);
                        } else {
                            bnsn bnsn = nij.f35704a;
                        }
                        if (mo21726f() != null) {
                            nij nij = (nij) mo21726f();
                            String flattenToShortString = nij.f35707d.flattenToShortString();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bpcp bpcp4 = (bpcp) da.f164949b;
                            flattenToShortString.getClass();
                            bpcp4.f135814a |= 1;
                            bpcp4.f135815b = flattenToShortString;
                            int o = nij.mo20789o();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bpcp bpcp5 = (bpcp) da.f164949b;
                            bpcp5.f135814a = 2 | bpcp5.f135814a;
                            bpcp5.f135816c = o;
                            String p = nij.mo20790p();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bpcp bpcp6 = (bpcp) da.f164949b;
                            p.getClass();
                            bpcp6.f135814a |= 32;
                            bpcp6.f135820g = p;
                            nij.f35705b.mo20827d().mo20856a((bpcp) da.mo74062i());
                        }
                    }
                }
                message.recycle();
                if (!this.f35697b.isEmpty()) {
                    Message obtain = Message.obtain((Message) this.f35697b.peek());
                    this.f35703i = SystemClock.elapsedRealtime();
                    sendMessage(obtain);
                    mo20759c(obtain.what);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo20753a(StringBuilder sb) {
        sb.append(" Command History: \n");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss.SSS");
        synchronized (this.f35701f) {
            for (int i = 0; i < this.f35701f.mo15529a(); i++) {
                Pair pair = (Pair) this.f35701f.mo15530a(i);
                sb.append("  ");
                sb.append(simpleDateFormat.format(new Date(((Long) pair.first).longValue())));
                sb.append(" : ");
                sb.append((String) pair.second);
                if (i < this.f35701f.mo15529a()) {
                    sb.append("\n");
                }
            }
        }
    }
}
