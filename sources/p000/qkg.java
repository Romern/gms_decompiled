package p000;

import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import com.google.android.chimera.Service;
import java.util.concurrent.locks.ReentrantLock;

@Deprecated
/* renamed from: qkg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class qkg extends Service implements Handler.Callback {

    /* renamed from: a */
    private int f41594a = 0;

    /* renamed from: c */
    public int f41595c = 0;

    /* renamed from: d */
    public final ReentrantLock f41596d = new ReentrantLock();

    /* renamed from: e */
    protected final String f41597e;

    /* renamed from: f */
    protected final qke f41598f;

    /* renamed from: g */
    protected final long f41599g;

    /* renamed from: h */
    protected final Handler f41600h;

    protected qkg(String str, qke qke, long j) {
        this.f41597e = str;
        sdo.m34959a(qke);
        this.f41598f = qke;
        this.f41599g = j;
        this.f41600h = new adzt(Looper.getMainLooper(), this);
    }

    /* renamed from: a */
    public final void mo24058a() {
        if (this.f41595c == 0) {
            this.f41600h.sendMessageDelayed(this.f41600h.obtainMessage(1), this.f41599g);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo24056a(qkf qkf);

    /* JADX INFO: finally extract failed */
    public final boolean handleMessage(Message message) {
        this.f41596d.lock();
        try {
            if (this.f41595c == 0) {
                stopSelfResult(this.f41594a);
            }
            this.f41596d.unlock();
            return true;
        } catch (Throwable th) {
            this.f41596d.unlock();
            throw th;
        }
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX INFO: finally extract failed */
    public int onStartCommand(Intent intent, int i, int i2) {
        this.f41596d.lock();
        try {
            this.f41594a = i2;
            while (true) {
                qkb qkb = (qkb) this.f41598f.poll();
                if (qkb == null) {
                    break;
                }
                this.f41595c++;
                mo24056a(new qkf(this, qkb));
            }
            if (this.f41595c > 0) {
                this.f41600h.removeMessages(1);
            }
            mo24058a();
            this.f41596d.unlock();
            return 2;
        } catch (Throwable th) {
            this.f41596d.unlock();
            throw th;
        }
    }
}
