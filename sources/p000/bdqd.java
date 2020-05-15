package p000;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bdqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdqd {

    /* renamed from: a */
    String f106249a;

    /* renamed from: b */
    final long f106250b;

    /* renamed from: c */
    final long f106251c;

    /* renamed from: d */
    final long f106252d;

    /* renamed from: e */
    public volatile List f106253e;

    /* renamed from: f */
    final int f106254f = 1;

    /* renamed from: g */
    final int f106255g;

    static {
        int i = aytg.f98445a;
        new bdqd("", SystemClock.elapsedRealtime(), -1, Thread.currentThread().getId(), 3);
    }

    private bdqd(String str, long j, long j2, long j3, int i) {
        this.f106249a = str;
        this.f106250b = j;
        this.f106251c = j2;
        this.f106252d = j3;
        this.f106255g = i;
        if (i == 1) {
            this.f106253e = Collections.synchronizedList(new ArrayList());
        } else {
            this.f106253e = Collections.emptyList();
        }
    }

    /* renamed from: a */
    public static bdqd m91277a(bdid bdid, String str, long j, long j2, long j3) {
        bmxy.m108581a(bdid);
        return new bdqd(str, j, j2, j3, 4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo58294a() {
        return this.f106255g == 1;
    }

    /* renamed from: a */
    static bdqd m91278a(String str, long j, int i) {
        return new bdqd(str, SystemClock.elapsedRealtime(), -1, j, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo58293a(List list) {
        if (this.f106253e == Collections.EMPTY_LIST) {
            this.f106253e = new ArrayList();
        }
        this.f106253e.addAll(list);
    }
}
