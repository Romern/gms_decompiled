package p000;

import java.util.ArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: dpt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dpt implements Future {

    /* renamed from: a */
    private final ArrayList f13793a = new ArrayList();

    /* renamed from: a */
    public final synchronized Boolean get() {
        boolean z;
        ArrayList arrayList = this.f13793a;
        int size = arrayList.size();
        int i = 0;
        z = true;
        while (true) {
            if (i >= size) {
                break;
            }
            z = ((Boolean) ((Future) arrayList.get(i)).get()).booleanValue();
            i++;
            if (!z) {
                break;
            }
        }
        this.f13793a.clear();
        return Boolean.valueOf(z);
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final synchronized boolean isDone() {
        boolean z;
        ArrayList arrayList = this.f13793a;
        int size = arrayList.size();
        z = true;
        for (int i = 0; i < size; i++) {
            z &= ((Future) arrayList.get(i)).isDone();
        }
        return z;
    }

    /* renamed from: a */
    public final synchronized Boolean get(long j, TimeUnit timeUnit) {
        boolean z;
        long nanoTime = System.nanoTime() + timeUnit.toNanos(j);
        ArrayList arrayList = this.f13793a;
        int size = arrayList.size();
        int i = 0;
        z = true;
        while (true) {
            if (i >= size) {
                break;
            }
            z = ((Boolean) ((Future) arrayList.get(i)).get(nanoTime - System.nanoTime(), TimeUnit.NANOSECONDS)).booleanValue();
            i++;
            if (!z) {
                break;
            }
        }
        this.f13793a.clear();
        return Boolean.valueOf(z);
    }

    /* renamed from: a */
    public final synchronized void mo9413a(Future future) {
        boolean z;
        if (this != dps.f13792a) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        this.f13793a.add(future);
    }
}
