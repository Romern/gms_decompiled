package p000;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.libraries.bluetooth.BluetoothException;
import com.google.android.libraries.bluetooth.BluetoothGattException;
import com.google.android.libraries.bluetooth.BluetoothTimeoutException;
import com.google.android.libraries.bluetooth.fastpair.ConnectException;
import com.google.android.libraries.bluetooth.fastpair.CreateBondException;
import com.google.android.libraries.bluetooth.util.BluetoothOperationExecutor$BluetoothOperationTimeoutException;
import java.util.ArrayDeque;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: ahti */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahti {

    /* renamed from: a */
    public final ahfx f67988a = new ahfx(3, ahte.f67981a);

    /* renamed from: b */
    public BluetoothDevice f67989b;

    /* renamed from: c */
    private final int f67990c = (new Random().nextInt(2147483646) + 1);

    /* renamed from: d */
    private final int f67991d;

    /* renamed from: e */
    private final String f67992e;

    /* renamed from: f */
    private final ahfy f67993f;

    /* renamed from: g */
    private final ArrayDeque f67994g = new ArrayDeque(bngx.m109356a(ahth.m56604f().mo37111a()));

    /* renamed from: h */
    private bxvd f67995h = bvey.f155813m.mo74144da();

    public ahti(String str, String str2, Context context) {
        int i;
        ahfy ahfy = new ahfy(context);
        try {
            i = Integer.parseInt(str, 16);
        } catch (IllegalArgumentException e) {
            bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Expected 3-byte hex model ID %s", str);
            i = 0;
        }
        this.f67991d = i;
        this.f67992e = str2;
        this.f67993f = ahfy;
        this.f67988a.f67131c = new ahtf(new burh(context));
    }

    /* renamed from: a */
    public final void mo37121a(ahth ahth) {
        mo37125b(ahth);
        Throwable th = ((ahtj) ahth).f67996a;
        if (th != null) {
            mo37123a(th);
        } else {
            mo37126b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final bxvd mo37125b(ahth ahth) {
        this.f67994g.push(ahth);
        bxvd da = bvey.f155813m.mo74144da();
        this.f67995h = da;
        return da;
    }

    /* renamed from: b */
    public final void mo37126b() {
        int i;
        if (cfoj.m141554d()) {
            ahth ahth = (ahth) this.f67994g.pop();
            if (ahth.mo37116a() == bvjc.UNKNOWN_EVENT_TYPE) {
                ((bnsl) ahsd.f67925a.mo68388c()).mo68405a("Analytics: Unexpected log without an event code. Logging anyway.");
            }
            BluetoothDevice bluetoothDevice = this.f67989b;
            if (bluetoothDevice != null) {
                bxvd bxvd = this.f67995h;
                switch (bluetoothDevice.getBondState()) {
                    case 10:
                        i = 11;
                        break;
                    case 11:
                        i = 12;
                        break;
                    case 12:
                        i = 13;
                        break;
                    default:
                        i = 1;
                        break;
                }
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bvey bvey = (bvey) bxvd.f164949b;
                bvey bvey2 = bvey.f155813m;
                bvey.f155817c = i - 1;
                bvey.f155815a |= 2;
            }
            String str = this.f67992e;
            if (str != null) {
                bxvd bxvd2 = this.f67995h;
                long a = this.f67993f.mo36414a(str);
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                bvey bvey3 = (bvey) bxvd2.f164949b;
                bvey bvey4 = bvey.f155813m;
                bvey3.f155815a |= 128;
                bvey3.f155823i = a;
            }
            bxvd bxvd3 = this.f67995h;
            bxvd da = bvex.f155809c.mo74144da();
            int d = ahth.mo37119d();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvex bvex = (bvex) da.f164949b;
            bvex.f155811a |= 1;
            bvex.f155812b = d;
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            bvey bvey5 = (bvey) bxvd3.f164949b;
            bvex bvex2 = (bvex) da.mo74062i();
            bvey bvey6 = bvey.f155813m;
            bvex2.getClass();
            bvey5.f155825k = bvex2;
            bvey5.f155815a |= 512;
            long elapsedRealtime = SystemClock.elapsedRealtime() - ahth.mo37117b();
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            bvey bvey7 = (bvey) bxvd3.f164949b;
            bvey7.f155815a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            bvey7.f155824j = elapsedRealtime;
            if (cfoj.m141531L()) {
                bxvd bxvd4 = this.f67995h;
                bxvd da2 = bvev.f155801c.mo74144da();
                int e = ahth.mo37120e();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bvev bvev = (bvev) da2.f164949b;
                bvev.f155803a |= 1;
                bvev.f155804b = e;
                bvev bvev2 = (bvev) da2.mo74062i();
                if (bxvd4.f164950c) {
                    bxvd4.mo74035c();
                    bxvd4.f164950c = false;
                }
                bvey bvey8 = (bvey) bxvd4.f164949b;
                bvev2.getClass();
                bvey8.f155826l = bvev2;
                bvey8.f155815a |= 1024;
            }
            bxvd bxvd5 = this.f67995h;
            int i2 = this.f67991d;
            if (bxvd5.f164950c) {
                bxvd5.mo74035c();
                bxvd5.f164950c = false;
            }
            bvey bvey9 = (bvey) bxvd5.f164949b;
            bvey9.f155815a = 1 | bvey9.f155815a;
            bvey9.f155816b = i2;
            bvey bvey10 = (bvey) bxvd5.mo74062i();
            if (!cfos.m141988b() || !((bnsl) ahsd.f67925a.mo68390d()).mo68447l()) {
                srn srn = ahsd.f67925a;
                ahth.mo37116a();
            } else {
                ((bnsl) ahsd.f67925a.mo68390d()).mo68424a("Analytics: Logging event %s %s", ahth.mo37116a(), ahsd.m56456a(bvey10));
            }
            this.f67988a.mo36412a(bvey10, ahth.mo37116a().f156339L, this.f67990c);
            if (this.f67994g.isEmpty()) {
                mo37127b(bvjc.UNKNOWN_EVENT_TYPE);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo37122a(bvjc bvjc) {
        ahtg f = ahth.m56604f();
        f.mo37114a(bvjc);
        mo37121a(f.mo37111a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo37123a(Throwable th) {
        if (cfoj.m141554d()) {
            if ((th instanceof ExecutionException) && th.getCause() != null) {
                th = th.getCause();
            }
            if ((th instanceof BluetoothException) && (th.getCause() instanceof BluetoothGattException)) {
                th = th.getCause();
            }
            int i = 2;
            if (th instanceof BluetoothGattException) {
                BluetoothGattException bluetoothGattException = (BluetoothGattException) th;
                bxvd bxvd = this.f67995h;
                bvew bvew = ((bvey) bxvd.f164949b).f155819e;
                if (bvew == null) {
                    bvew = bvew.f155805c;
                }
                bxvd bxvd2 = (bxvd) bvew.mo74142c(5);
                bxvd2.mo73625a((GeneratedMessageLite) bvew);
                int i2 = bluetoothGattException.f111041a;
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                bvew bvew2 = (bvew) bxvd2.f164949b;
                bvew2.f155807a |= 1;
                bvew2.f155808b = i2;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bvey bvey = (bvey) bxvd.f164949b;
                bvew bvew3 = (bvew) bxvd2.mo74062i();
                bvey bvey2 = bvey.f155813m;
                bvew3.getClass();
                bvey.f155819e = bvew3;
                bvey.f155815a |= 8;
            } else if (th instanceof CreateBondException) {
                CreateBondException createBondException = (CreateBondException) th;
                bxvd bxvd3 = this.f67995h;
                bveu bveu = ((bvey) bxvd3.f164949b).f155821g;
                if (bveu == null) {
                    bveu = bveu.f155796d;
                }
                bxvd bxvd4 = (bxvd) bveu.mo74142c(5);
                bxvd4.mo73625a((GeneratedMessageLite) bveu);
                int i3 = createBondException.f111062b;
                if (bxvd4.f164950c) {
                    bxvd4.mo74035c();
                    bxvd4.f164950c = false;
                }
                bveu bveu2 = (bveu) bxvd4.f164949b;
                int i4 = i3 - 1;
                if (i3 != 0) {
                    bveu2.f155799b = i4;
                    int i5 = bveu2.f155798a | 1;
                    bveu2.f155798a = i5;
                    int i6 = createBondException.f111061a;
                    bveu2.f155798a = i5 | 2;
                    bveu2.f155800c = i6;
                    if (bxvd3.f164950c) {
                        bxvd3.mo74035c();
                        bxvd3.f164950c = false;
                    }
                    bvey bvey3 = (bvey) bxvd3.f164949b;
                    bveu bveu3 = (bveu) bxvd4.mo74062i();
                    bvey bvey4 = bvey.f155813m;
                    bveu3.getClass();
                    bvey3.f155821g = bveu3;
                    bvey3.f155815a |= 32;
                } else {
                    throw null;
                }
            } else if (th instanceof ConnectException) {
                ConnectException connectException = (ConnectException) th;
                bxvd bxvd5 = this.f67995h;
                bvet bvet = ((bvey) bxvd5.f164949b).f155822h;
                if (bvet == null) {
                    bvet = bvet.f155791d;
                }
                bxvd bxvd6 = (bxvd) bvet.mo74142c(5);
                bxvd6.mo73625a((GeneratedMessageLite) bvet);
                int i7 = connectException.f111060a;
                if (bxvd6.f164950c) {
                    bxvd6.mo74035c();
                    bxvd6.f164950c = false;
                }
                bvet bvet2 = (bvet) bxvd6.f164949b;
                int i8 = i7 - 1;
                if (i7 != 0) {
                    bvet2.f155794b = i8;
                    bvet2.f155793a |= 1;
                    if (bxvd5.f164950c) {
                        bxvd5.mo74035c();
                        bxvd5.f164950c = false;
                    }
                    bvey bvey5 = (bvey) bxvd5.f164949b;
                    bvet bvet3 = (bvet) bxvd6.mo74062i();
                    bvey bvey6 = bvey.f155813m;
                    bvet3.getClass();
                    bvey5.f155822h = bvet3;
                    bvey5.f155815a |= 64;
                } else {
                    throw null;
                }
            } else if (th instanceof ayqq) {
                ayqq ayqq = (ayqq) th;
                bxvd bxvd7 = this.f67995h;
                bves bves = ((bvey) bxvd7.f164949b).f155820f;
                if (bves == null) {
                    bves = bves.f155787c;
                }
                bxvd bxvd8 = (bxvd) bves.mo74142c(5);
                bxvd8.mo73625a((GeneratedMessageLite) bves);
                int i9 = ayqq.f98295a;
                if (bxvd8.f164950c) {
                    bxvd8.mo74035c();
                    bxvd8.f164950c = false;
                }
                bves bves2 = (bves) bxvd8.f164949b;
                int i10 = i9 - 1;
                if (i9 != 0) {
                    bves2.f155790b = i10;
                    bves2.f155789a |= 1;
                    if (bxvd7.f164950c) {
                        bxvd7.mo74035c();
                        bxvd7.f164950c = false;
                    }
                    bvey bvey7 = (bvey) bxvd7.f164949b;
                    bves bves3 = (bves) bxvd8.mo74062i();
                    bvey bvey8 = bvey.f155813m;
                    bves3.getClass();
                    bvey7.f155820f = bves3;
                    bvey7.f155815a |= 16;
                } else {
                    throw null;
                }
            }
            bxvd bxvd9 = this.f67995h;
            if (th == null) {
                i = 1;
            } else if ((th instanceof TimeoutException) || (th instanceof BluetoothTimeoutException) || (th instanceof BluetoothOperationExecutor$BluetoothOperationTimeoutException)) {
                i = 3;
            } else if (th instanceof InterruptedException) {
                i = 4;
            } else if (th instanceof ayqn) {
                i = 5;
            } else if (th instanceof ExecutionException) {
                i = 6;
            } else if (th instanceof ayqf) {
                i = 7;
            }
            if (bxvd9.f164950c) {
                bxvd9.mo74035c();
                bxvd9.f164950c = false;
            }
            bvey bvey9 = (bvey) bxvd9.f164949b;
            bvey bvey10 = bvey.f155813m;
            bvey9.f155818d = i - 1;
            bvey9.f155815a |= 4;
            mo37126b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo37127b(bvjc bvjc) {
        ahtg f = ahth.m56604f();
        f.mo37114a(bvjc);
        mo37125b(f.mo37111a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo37124a() {
        ahth ahth = (ahth) this.f67994g.peek();
        return (ahth == null || ahth.mo37116a() == bvjc.UNKNOWN_EVENT_TYPE) ? false : true;
    }
}
