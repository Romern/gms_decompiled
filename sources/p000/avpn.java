package p000;

import android.os.UpdateEngine;
import android.os.UpdateEngineCallback;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;

/* renamed from: avpn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avpn extends UpdateEngineCallback {

    /* renamed from: a */
    public static final Logger f93712a = avpq.m79018e("UpdateEngineDelegate");

    /* renamed from: b */
    public static final avsz f93713b = new avpm();

    /* renamed from: c */
    public final avtn f93714c = ((avtn) avtn.f93892a.mo51589b());

    /* renamed from: d */
    public final UpdateEngine f93715d;

    /* renamed from: e */
    public final Object f93716e;

    /* renamed from: f */
    public int f93717f;

    /* renamed from: g */
    public float f93718g;

    /* renamed from: h */
    public boolean f93719h;

    /* renamed from: i */
    public final Deque f93720i;

    public avpn(UpdateEngine updateEngine) {
        this.f93715d = updateEngine;
        this.f93716e = new Object();
        this.f93719h = false;
        this.f93720i = new ArrayDeque();
        this.f93717f = -1;
        this.f93718g = 0.0f;
    }

    /* renamed from: a */
    public final int mo51473a() {
        int i;
        synchronized (this.f93716e) {
            i = this.f93717f;
        }
        return i;
    }

    public final void onPayloadApplicationComplete(int i) {
        bngx a;
        synchronized (this.f93716e) {
            a = bngx.m109368a((Collection) this.f93720i);
        }
        int size = a.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((UpdateEngineCallback) a.get(i2)).onPayloadApplicationComplete(i);
        }
    }

    public final void onStatusUpdate(int i, float f) {
        bngx a;
        synchronized (this.f93716e) {
            this.f93717f = i;
            this.f93718g = f;
            a = bngx.m109368a((Collection) this.f93720i);
        }
        int size = a.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((UpdateEngineCallback) a.get(i2)).onStatusUpdate(i, f);
        }
    }
}
