package p000;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: ajgv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajgv {

    /* renamed from: a */
    public long f70598a;

    /* renamed from: b */
    public final ahfv f70599b;

    /* renamed from: c */
    public final LinkedList f70600c = new LinkedList();

    /* renamed from: d */
    public final LinkedList f70601d = new LinkedList();

    /* renamed from: e */
    public final LinkedList f70602e = new LinkedList();

    /* renamed from: f */
    public int f70603f;

    /* renamed from: g */
    private final long f70604g;

    /* renamed from: h */
    private final byyg f70605h;

    public ajgv(ahfv ahfv, byyg byyg) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        byym byym = byyg.f168926i;
        this.f70604g = elapsedRealtime + (byym == null ? byym.f168972f : byym).f168978e;
        this.f70599b = ahfv;
        this.f70603f = 1;
        this.f70605h = byyg;
        mo38622a();
    }

    /* renamed from: a */
    private static void m58692a(List list, String str, LinkedList linkedList) {
        if (!linkedList.isEmpty()) {
            list.add(String.format("%s %sms ago", str, Long.valueOf(System.currentTimeMillis() - ((byzz) linkedList.getLast()).f169201d)));
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        m58692a(arrayList, "audio", this.f70600c);
        m58692a(arrayList, "BLE", this.f70601d);
        m58692a(arrayList, "bluetooth", this.f70602e);
        String a = this.f70599b.mo36407a();
        String a2 = bmxr.m108544a(",").mo66874a((Iterable) arrayList);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 9 + String.valueOf(a2).length());
        sb.append(a);
        sb.append(" seen on ");
        sb.append(a2);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo38622a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        byym byym = this.f70605h.f168926i;
        if (byym == null) {
            byym = byym.f168972f;
        }
        long j = elapsedRealtime + byym.f168977d;
        this.f70598a = j;
        long j2 = this.f70604g;
        if (j > j2) {
            this.f70598a = j2;
        }
    }

    /* renamed from: a */
    public final void mo38623a(List list) {
        while (true) {
            long size = (long) list.size();
            byym byym = this.f70605h.f168926i;
            if (byym == null) {
                byym = byym.f168972f;
            }
            if (size > byym.f168976c) {
                list.remove(0);
            } else {
                return;
            }
        }
    }
}
