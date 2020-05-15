package p000;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: rub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rub implements rtp {

    /* renamed from: a */
    public final rtp f43684a;

    /* renamed from: b */
    private final Integer[] f43685b;

    public rub(rtp rtp, Comparator comparator) {
        this.f43684a = rtp;
        this.f43685b = new Integer[rtp.mo24660a()];
        int i = 0;
        while (true) {
            Integer[] numArr = this.f43685b;
            if (i < numArr.length) {
                numArr[i] = Integer.valueOf(i);
                i++;
            } else {
                Arrays.sort(numArr, new rua(this, comparator));
                return;
            }
        }
    }

    /* renamed from: a */
    public final int mo24660a() {
        return this.f43685b.length;
    }

    /* renamed from: b */
    public final Bundle mo24662b() {
        return this.f43684a.mo24662b();
    }

    /* renamed from: c */
    public final void mo12460c() {
        this.f43684a.mo12460c();
    }

    public final void close() {
        this.f43684a.mo12460c();
    }

    public final Iterator iterator() {
        return new rtq(this);
    }

    /* renamed from: a */
    public final Object mo24661a(int i) {
        return ((amev) this.f43684a).mo24661a(this.f43685b[i].intValue());
    }
}
