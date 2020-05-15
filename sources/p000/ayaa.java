package p000;

import android.util.Log;
import java.util.Locale;
import java.util.PriorityQueue;

/* renamed from: ayaa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayaa {

    /* renamed from: a */
    private final String f96877a;

    /* renamed from: b */
    private final String f96878b;

    /* renamed from: c */
    private int f96879c;

    /* renamed from: d */
    private final axzy f96880d;

    /* renamed from: e */
    private long f96881e;

    /* renamed from: f */
    private int f96882f;

    /* renamed from: g */
    private final PriorityQueue f96883g = new PriorityQueue();

    public ayaa(String str, String str2, axzy axzy) {
        this.f96877a = str;
        this.f96878b = str2;
        this.f96882f = -1;
        this.f96880d = axzy;
        this.f96879c = -1;
        this.f96881e = -1;
    }

    /* renamed from: a */
    private final String m83666a(String str, int i, int i2, long j, String str2) {
        return String.format(Locale.US, "ReorderingQueue.%s(%11s:%d:%d at %d): %s", str, this.f96878b, Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j), str2);
    }

    /* renamed from: a */
    private final void m83667a(Object obj, long j) {
        this.f96879c++;
        this.f96881e = j;
        ayah ayah = (ayah) obj;
        ((ayai) this.f96880d).mo53833a(ayah.f96902c, ayah.f96903d, ayah.f96900a, ayah.f96901b, ayah.f96904e, ayah.f96905f, ayah.f96906g);
    }

    /* renamed from: b */
    private final void m83668b(String str, int i, int i2, long j, String str2) {
        if (Log.isLoggable(this.f96877a, 2)) {
            Log.v(this.f96877a, m83666a(str, i, i2, j, str2));
        }
    }

    /* renamed from: a */
    public final synchronized void mo53815a() {
        this.f96879c = -1;
        this.f96881e = -1;
        this.f96883g.clear();
    }

    /* renamed from: a */
    public final synchronized void mo53816a(Object obj, int i, int i2, long j) {
        boolean z;
        int i3;
        Object obj2 = obj;
        int i4 = i;
        int i5 = i2;
        long j2 = j;
        synchronized (this) {
            sdo.m34974b(true);
            boolean z2 = false;
            if (i5 >= 0) {
                z = true;
            } else {
                z = false;
            }
            sdo.m34974b(z);
            if (j2 >= 0) {
                z2 = true;
            }
            sdo.m34974b(z2);
            sdo.m34959a(obj);
            if (this.f96882f != i4) {
                if (Log.isLoggable(this.f96877a, 2)) {
                    int i6 = this.f96882f;
                    StringBuilder sb = new StringBuilder(51);
                    sb.append("generation changed, expected ");
                    sb.append(i6);
                    sb.append(", resetting");
                    i3 = 2;
                    m83668b("add", i, i2, j, sb.toString());
                } else {
                    i3 = 2;
                }
                mo53815a();
                this.f96882f = i4;
            } else {
                i3 = 2;
            }
            int i7 = this.f96879c;
            if (i7 < 0) {
                if (Log.isLoggable(this.f96877a, i3)) {
                    StringBuilder sb2 = new StringBuilder(32);
                    sb2.append("set initial index to ");
                    sb2.append(i5);
                    m83668b("add", i, i2, j, sb2.toString());
                }
                this.f96879c = i5;
                i7 = i5;
            }
            if (this.f96881e < 0) {
                this.f96881e = j2;
            }
            if (i5 < i7) {
                if (Log.isLoggable(this.f96877a, i3)) {
                    int i8 = this.f96879c;
                    StringBuilder sb3 = new StringBuilder(41);
                    sb3.append("index is older than ");
                    sb3.append(i8);
                    sb3.append(", dropping");
                    m83668b("add", i, i2, j, sb3.toString());
                }
            } else if (i5 == i7) {
                if (Log.isLoggable(this.f96877a, i3)) {
                    m83668b("add", i, i2, j, "got the expected index, passing through");
                }
                m83667a(obj2, j2);
            } else {
                if (Log.isLoggable(this.f96877a, i3)) {
                    int i9 = this.f96879c;
                    int size = this.f96883g.size();
                    StringBuilder sb4 = new StringBuilder(63);
                    sb4.append("got an item newer than ");
                    sb4.append(i9);
                    sb4.append(", enqueuing, size=");
                    sb4.append(size + 1);
                    m83668b("add", i, i2, j, sb4.toString());
                }
                this.f96883g.add(new axzz(obj2, i5, j2));
            }
            while (!this.f96883g.isEmpty()) {
                axzz axzz = (axzz) this.f96883g.peek();
                int i10 = axzz.f96875b;
                int i11 = this.f96879c;
                if (i10 < i11) {
                    Log.e(this.f96877a, m83666a("flush: ", this.f96882f, i10, axzz.f96876c, "error, old item at head of queue"));
                    this.f96883g.poll();
                    int i12 = axzz.f96875b;
                } else if (i10 == i11) {
                    if (Log.isLoggable(this.f96877a, i3)) {
                        m83668b("flush", this.f96882f, axzz.f96875b, axzz.f96876c, "ready, passing through");
                    }
                    m83667a(((axzz) this.f96883g.poll()).f96874a, j2);
                } else if (this.f96883g.size() <= 100) {
                    if (this.f96881e + 20000 > j2) {
                        break;
                    }
                    if (Log.isLoggable(this.f96877a, i3)) {
                        m83668b("flush", this.f96882f, this.f96879c, 0, "waited too long, dropping ");
                    }
                    this.f96879c++;
                } else {
                    if (Log.isLoggable(this.f96877a, i3)) {
                        m83668b("flush", this.f96882f, this.f96879c, 0, "too many items, dropping ");
                    }
                    this.f96879c++;
                }
            }
        }
    }
}
