package p000;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.google.android.chimera.Service;
import com.google.android.gms.fitness.service.base.BrokerService$PackageDisconnectedReceiver;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: zmb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class zmb extends Service implements Handler.Callback {

    /* renamed from: a */
    public final ConcurrentHashMap f55433a = new ConcurrentHashMap();

    /* renamed from: b */
    public yst f55434b;

    /* renamed from: c */
    protected sns f55435c;

    /* renamed from: d */
    protected snr f55436d;

    /* renamed from: e */
    protected ExecutorService f55437e;

    /* renamed from: f */
    protected yzs f55438f;

    /* renamed from: g */
    private BrokerService$PackageDisconnectedReceiver f55439g;

    static {
        zvt.m46581a();
    }

    /* renamed from: c */
    private static IntentFilter mo31251c() {
        IntentFilter intentFilter = new IntentFilter("com.google.android.gms.fitness.app_disconnected");
        try {
            intentFilter.addDataType("vnd.google.android.fitness/app_disconnect");
            return intentFilter;
        } catch (IntentFilter.MalformedMimeTypeException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo19167a();

    /* renamed from: a */
    public abstract zlz mo19168a(String str);

    /* renamed from: a */
    public void mo19171a(yzs yzs, sns sns, snr snr, ExecutorService executorService) {
        super.onCreate();
        this.f55438f = yzs;
        this.f55434b = yzs.mo30874b();
        this.f55435c = sns;
        this.f55436d = snr;
        this.f55437e = executorService;
        BrokerService$PackageDisconnectedReceiver brokerService$PackageDisconnectedReceiver = new BrokerService$PackageDisconnectedReceiver(this);
        this.f55439g = brokerService$PackageDisconnectedReceiver;
        registerReceiver(brokerService$PackageDisconnectedReceiver, mo31251c(), "com.google.android.gms.permission.INTERNAL_BROADCAST", snr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo19169a(Intent intent);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo31239b() {
        return getClass().getSimpleName();
    }

    /* access modifiers changed from: protected */
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (zlz zlz : this.f55433a.values()) {
            printWriter.append((CharSequence) "Begin dump for account ").append((CharSequence) zlz.f55429b).append((CharSequence) "\n");
            zlz.mo31235a(printWriter);
        }
    }

    public boolean handleMessage(Message message) {
        return false;
    }

    public final IBinder onBind(Intent intent) {
        if (intent != null && mo19169a(intent)) {
            return new zmi(this, this.f55438f, snp.m35704b(10));
        }
        return new zma(this);
    }

    public final void onCreate() {
        sns sns = new sns(9);
        mo19171a(yzq.m45107a(this), sns, new snr(sns, this), sne.m35694a((int) cdzd.f182003a.mo6606a().mo78568ah(), 9));
    }

    public void onDestroy() {
        unregisterReceiver(this.f55439g);
        this.f55435c.quitSafely();
        this.f55437e.shutdownNow();
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final zlz mo31240b(String str) {
        zlz zlz = (zlz) this.f55433a.get(str);
        if (zlz == null) {
            mo31239b();
            zlz = mo19168a(str);
            if (zlz != null) {
                this.f55433a.putIfAbsent(str, zlz);
                return zlz;
            }
        }
        return zlz;
    }

    /* renamed from: c */
    public void mo31241c(String str) {
        sdo.m34977c(str);
        for (zlz zlz : this.f55433a.values()) {
            zlz.mo31236a(str);
        }
    }
}
