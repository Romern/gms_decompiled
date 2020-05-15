package p000;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;

/* renamed from: bdqg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdqg extends ThreadLocal {

    /* renamed from: a */
    final /* synthetic */ bdqh f106260a;

    public bdqg(bdqh bdqh) {
        this.f106260a = bdqh;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object initialValue() {
        String str;
        long id = Thread.currentThread().getId();
        if (Looper.myLooper() != Looper.getMainLooper()) {
            String valueOf = String.valueOf(Thread.currentThread().getName());
            str = valueOf.length() == 0 ? new String("Thread: ") : "Thread: ".concat(valueOf);
        } else {
            str = "UI Thread";
        }
        bdqd a = bdqd.m91278a(str, id, 1);
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(a);
        this.f106260a.f106261a.incrementAndGet();
        this.f106260a.f106263c.put(a, arrayDeque);
        return new WeakReference(arrayDeque);
    }
}
