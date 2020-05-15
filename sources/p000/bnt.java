package p000;

import android.os.SystemClock;
import com.android.volley.VolleyLog;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bnt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnt {

    /* renamed from: a */
    public static final boolean f5207a = VolleyLog.DEBUG;

    /* renamed from: b */
    private final List f5208b = new ArrayList();

    /* renamed from: c */
    private boolean f5209c = false;

    /* renamed from: a */
    public final synchronized void mo3307a(String str) {
        long j;
        this.f5209c = true;
        if (this.f5208b.size() != 0) {
            long j2 = ((bns) this.f5208b.get(0)).f5206c;
            List list = this.f5208b;
            j = ((bns) list.get(list.size() - 1)).f5206c - j2;
        } else {
            j = 0;
        }
        if (j > 0) {
            long j3 = ((bns) this.f5208b.get(0)).f5206c;
            VolleyLog.m4764d("(%-4d ms) %s", Long.valueOf(j), str);
            List list2 = this.f5208b;
            int size = list2.size();
            int i = 0;
            while (i < size) {
                bns bns = (bns) list2.get(i);
                long j4 = bns.f5206c;
                VolleyLog.m4764d("(+%-4d) [%2d] %s", Long.valueOf(j4 - j3), Long.valueOf(bns.f5205b), bns.f5204a);
                i++;
                j3 = j4;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        if (!this.f5209c) {
            mo3307a("Request on the loose");
            VolleyLog.m4765e("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }

    /* renamed from: a */
    public final synchronized void mo3308a(String str, long j) {
        if (!this.f5209c) {
            this.f5208b.add(new bns(str, j, SystemClock.elapsedRealtime()));
        } else {
            throw new IllegalStateException("Marker added to finished log");
        }
    }
}
