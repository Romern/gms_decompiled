package p000;

import android.os.Build;
import com.google.android.libraries.bluetooth.BluetoothException;
import java.util.Locale;

/* renamed from: ayrj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayrj extends aysz {

    /* renamed from: a */
    final /* synthetic */ aysl f98345a;

    /* renamed from: b */
    final /* synthetic */ ayrl f98346b;

    /* renamed from: c */
    final /* synthetic */ ayrp f98347c;

    /* renamed from: d */
    private final Object f98348d = new Object();

    /* renamed from: e */
    private boolean f98349e = false;

    /* renamed from: f */
    private aysm f98350f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayrj(ayrp ayrp, Object[] objArr, aysl aysl, ayrl ayrl) {
        super(objArr);
        this.f98347c = ayrp;
        this.f98345a = aysl;
        this.f98346b = ayrl;
    }

    /* renamed from: a */
    public final void mo54307a() {
        synchronized (this.f98348d) {
            if (!this.f98349e) {
                int i = Build.VERSION.SDK_INT;
                aysm a = this.f98345a.mo54350a(this.f98347c.f98374d, this.f98346b.mo54300a(), this.f98347c.f98372b);
                if (a != null) {
                    try {
                        bmxv c = this.f98346b.mo54302c();
                        if (c.mo66813a()) {
                            int intValue = ((Integer) c.mo66814b()).intValue();
                            long currentTimeMillis = System.currentTimeMillis();
                            while (!a.mo54360a(intValue)) {
                                if (System.currentTimeMillis() - currentTimeMillis <= this.f98346b.mo54301b()) {
                                    Thread.sleep(5);
                                } else {
                                    throw new BluetoothException(String.format(Locale.US, "Failed to set connectionPriority after %dms.", Long.valueOf(this.f98346b.mo54301b())));
                                }
                            }
                        }
                        this.f98347c.f98373c.put(a, new ayri(a, this.f98347c.f98375e, this.f98346b));
                        this.f98350f = a;
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw new BluetoothException("connect() operation interrupted.");
                    } catch (Exception e2) {
                        a.mo54368e();
                        a.mo54370f();
                        throw e2;
                    }
                } else {
                    throw new BluetoothException("connectGatt() returned null.");
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo54319c() {
        synchronized (this.f98348d) {
            if (!this.f98349e) {
                this.f98349e = true;
                aysm aysm = this.f98350f;
                if (aysm != null) {
                    this.f98347c.f98373c.remove(aysm);
                    aysm.mo54368e();
                    aysm.mo54370f();
                }
            }
        }
    }
}
