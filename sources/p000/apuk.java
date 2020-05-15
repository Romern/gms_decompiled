package p000;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: apuk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class apuk {

    /* renamed from: a */
    protected Context f84920a;

    /* renamed from: b */
    private final Queue f84921b = new ArrayDeque();

    /* renamed from: c */
    private int f84922c = -1;

    /* renamed from: d */
    private boolean f84923d = false;

    /* renamed from: e */
    private PendingIntent f84924e;

    static {
        apuk.class.getSimpleName();
    }

    /* renamed from: a */
    public final synchronized void mo47624a(PendingIntent pendingIntent) {
        this.f84924e = pendingIntent;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo47614a(Status status, apga apga, int i);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo47615b();

    /* renamed from: c */
    public final synchronized void mo47627c() {
        if (this.f84922c < 0) {
            this.f84922c = Math.abs(new SecureRandom().nextInt());
        }
    }

    /* renamed from: d */
    public final synchronized int mo47628d() {
        return this.f84922c;
    }

    /* renamed from: e */
    public final synchronized void mo47629e() {
        this.f84923d = true;
    }

    /* renamed from: f */
    public final synchronized boolean mo47630f() {
        return this.f84923d;
    }

    /* renamed from: a */
    public final synchronized void mo47625a(apga apga) {
        if (apga != null) {
            this.f84921b.add(apga);
        }
    }

    /* renamed from: a */
    public final synchronized void mo47626a(Status status, int i) {
        while (!this.f84921b.isEmpty()) {
            mo47614a(status, (apga) this.f84921b.remove(), i);
        }
        this.f84921b.clear();
        this.f84922c = -1;
        PendingIntent pendingIntent = this.f84924e;
        if (pendingIntent != null) {
            pendingIntent.cancel();
            this.f84924e = null;
        }
        this.f84923d = false;
        mo47615b();
    }
}
