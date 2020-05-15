package p000;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

@Deprecated
/* renamed from: rkb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class rkb {

    /* renamed from: a */
    public static final Set f43188a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: a */
    public static Set m33818a() {
        Set set;
        synchronized (f43188a) {
            set = f43188a;
        }
        return set;
    }

    /* renamed from: a */
    public abstract ConnectionResult mo24785a(long j, TimeUnit timeUnit);

    /* renamed from: a */
    public abstract void mo24789a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: a */
    public abstract void mo24790a(rjz rjz);

    /* renamed from: a */
    public abstract void mo24791a(rka rka);

    /* renamed from: b */
    public Context mo24794b() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public abstract void mo24796b(rjz rjz);

    /* renamed from: b */
    public abstract void mo24797b(rka rka);

    /* renamed from: b */
    public abstract boolean mo24798b(rjo rjo);

    /* renamed from: c */
    public Looper mo24799c() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public void mo24800d() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public abstract void mo24801e();

    /* renamed from: f */
    public abstract ConnectionResult mo24802f();

    /* renamed from: g */
    public abstract void mo24803g();

    /* renamed from: h */
    public abstract void mo24804h();

    /* renamed from: i */
    public abstract boolean mo24805i();

    /* renamed from: j */
    public abstract boolean mo24806j();

    /* renamed from: a */
    public rjm mo24786a(rje rje) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public rle mo24795b(rle rle) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public rle mo24787a(rle rle) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public rod mo24788a(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public boolean mo24792a(ico ico) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public boolean mo24793a(rjo rjo) {
        throw new UnsupportedOperationException();
    }
}
