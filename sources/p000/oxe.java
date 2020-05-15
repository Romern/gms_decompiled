package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: oxe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oxe extends omk {

    /* renamed from: a */
    public final Object f38555a = new Object();

    /* renamed from: b */
    public boolean f38556b;

    /* renamed from: c */
    public omi f38557c;

    /* renamed from: d */
    private final CopyOnWriteArraySet f38558d = new CopyOnWriteArraySet();

    /* renamed from: e */
    private final Handler f38559e = new adzt(Looper.getMainLooper());

    /* renamed from: f */
    private int f38560f = 31;

    /* renamed from: a */
    public final void mo21166a() {
    }

    /* renamed from: b */
    public final void mo21168b() {
    }

    /* renamed from: c */
    public final int mo22739c() {
        synchronized (this.f38555a) {
            if (!this.f38556b) {
                return 0;
            }
            int i = this.f38560f;
            return i;
        }
    }

    /* renamed from: a */
    public final void mo21167a(int i, byte[] bArr) {
        biqc biqc;
        if (i == 13 && (biqc = (biqc) ojx.m28966a(biva.m102863a(13), bArr)) != null) {
            synchronized (this.f38555a) {
                int i2 = biqc.f121251a;
                this.f38560f = i2;
                Iterator it = this.f38558d.iterator();
                while (it.hasNext()) {
                    this.f38559e.post(new oxd((owi) it.next(), i2));
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo22738b(owi owi) {
        this.f38558d.remove(owi);
    }

    /* renamed from: a */
    public final void mo22736a(omi omi) {
        synchronized (this.f38555a) {
            if (omi != null) {
                try {
                    this.f38557c = omi;
                    omi.mo22287a(this);
                    this.f38556b = true;
                } catch (RemoteException e) {
                    this.f38556b = false;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo22737a(owi owi) {
        this.f38558d.add(owi);
    }
}
