package p000;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.libraries.bluetooth.BluetoothException;
import java.util.concurrent.TimeUnit;

/* renamed from: aypp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aypp {

    /* renamed from: a */
    public ayri f98197a;

    /* renamed from: b */
    private final Context f98198b;

    /* renamed from: c */
    private final ayqk f98199c;

    /* renamed from: d */
    private final ayox f98200d;

    /* renamed from: e */
    private final aysk f98201e;

    /* renamed from: f */
    private final ayqu f98202f;

    /* renamed from: g */
    private final String f98203g;

    /* renamed from: h */
    private final ayqt f98204h;

    /* renamed from: i */
    private final ayrl f98205i;

    public aypp(Context context, ayqk ayqk, ayox ayox, aysk aysk, ayqu ayqu, String str, ayqt ayqt, ayrl ayrl) {
        this.f98198b = context;
        this.f98199c = ayqk;
        this.f98200d = ayox;
        this.f98201e = aysk;
        this.f98202f = ayqu;
        this.f98203g = str;
        this.f98204h = ayqt;
        this.f98205i = ayrl;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c8, code lost:
        if (r7 != false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d1, code lost:
        if (r8 >= r14.f98199c.mo54143q()) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d7, code lost:
        if ((r6 instanceof com.google.android.libraries.bluetooth.util.BluetoothOperationExecutor$BluetoothOperationTimeoutException) != false) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00db, code lost:
        if ((r6 instanceof com.google.android.libraries.bluetooth.BluetoothTimeoutException) != false) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00df, code lost:
        if ((r6 instanceof com.google.android.libraries.bluetooth.BluetoothGattException) == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e8, code lost:
        if (((com.google.android.libraries.bluetooth.BluetoothGattException) r6).f111041a != 133) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ea, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ec, code lost:
        r7 = true;
     */
    /* renamed from: b */
    private final ayri m84462b(String str) {
        String str2;
        boolean z;
        ayqr ayqr;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f98200d.mo54180a(bvjc.GATT_CONNECT);
        BluetoothException e = null;
        boolean z2 = true;
        int i = 1;
        while (z2) {
            try {
                ayqt ayqt = this.f98204h;
                StringBuilder sb = new StringBuilder(25);
                sb.append("Connect GATT #");
                sb.append(i);
                ayqr = new ayqr(ayqt, sb.toString());
                bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
                bnsl.mo68432a("aypp", "b", 92, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Connecting to GATT server at %s", str);
                ayri a = new ayrp(this.f98198b, this.f98201e).mo54335a(this.f98201e.mo54347a(str), this.f98205i);
                a.mo54312a(TimeUnit.SECONDS.toMillis((long) this.f98199c.mo54119a()));
                if (this.f98199c.mo54107O()) {
                    aypo aypo = new aypo(this, str);
                    a.f98342j.add(aypo);
                    if (!a.f98340h) {
                        aypo.mo54202a();
                    }
                }
                this.f98200d.mo54183b();
                ayqr.close();
                return a;
            } catch (BluetoothException e2) {
                e = e2;
                if (this.f98199c.mo54125af() > 0) {
                    if (SystemClock.elapsedRealtime() - elapsedRealtime < ((long) this.f98199c.mo54125af())) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bnsl bnsl2 = (bnsl) aypn.f98194a.mo68390d();
                    bnsl2.mo68432a("aypp", "b", 115, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68420a("Retry connecting GATT by timeout:%b", Boolean.valueOf(z));
                }
                z2 = false;
                bnsl bnsl3 = (bnsl) aypn.f98194a.mo68388c();
                bnsl3.mo68437a(e);
                bnsl3.mo68432a("aypp", "b", 131, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                Integer valueOf = Integer.valueOf(i);
                Integer valueOf2 = Integer.valueOf(this.f98199c.mo54143q());
                if (!z2) {
                    str2 = "permanently";
                } else {
                    str2 = "recovering";
                }
                bnsl3.mo68425a("GATT connect attempt %s of %s failed, %s", valueOf, valueOf2, str2);
                if (z2) {
                    this.f98202f.mo54185a();
                    i++;
                }
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        }
        bmxy.m108581a(e);
        throw e;
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d1, code lost:
        if (r8 != false) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00da, code lost:
        if (r9 >= r15.f98199c.mo54143q()) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e0, code lost:
        if ((r6 instanceof com.google.android.libraries.bluetooth.util.BluetoothOperationExecutor$BluetoothOperationTimeoutException) != false) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e4, code lost:
        if ((r6 instanceof com.google.android.libraries.bluetooth.BluetoothTimeoutException) != false) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e8, code lost:
        if ((r6 instanceof com.google.android.libraries.bluetooth.BluetoothGattException) == false) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f1, code lost:
        if (((com.google.android.libraries.bluetooth.BluetoothGattException) r6).f111041a != 133) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f3, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f5, code lost:
        r8 = true;
     */
    /* renamed from: a */
    public final ayri mo54203a() {
        String str;
        boolean z;
        ayqr ayqr;
        if (this.f98197a == null) {
            String str2 = this.f98203g;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f98200d.mo54180a(bvjc.GATT_CONNECT);
            BluetoothException e = null;
            boolean z2 = true;
            int i = 1;
            while (z2) {
                try {
                    ayqt ayqt = this.f98204h;
                    StringBuilder sb = new StringBuilder(25);
                    sb.append("Connect GATT #");
                    sb.append(i);
                    ayqr = new ayqr(ayqt, sb.toString());
                    bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
                    bnsl.mo68432a("aypp", "b", 92, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("Connecting to GATT server at %s", str2);
                    ayri a = new ayrp(this.f98198b, this.f98201e).mo54335a(this.f98201e.mo54347a(str2), this.f98205i);
                    a.mo54312a(TimeUnit.SECONDS.toMillis((long) this.f98199c.mo54119a()));
                    if (this.f98199c.mo54107O()) {
                        aypo aypo = new aypo(this, str2);
                        a.f98342j.add(aypo);
                        if (!a.f98340h) {
                            aypo.mo54202a();
                        }
                    }
                    this.f98200d.mo54183b();
                    ayqr.close();
                    this.f98197a = a;
                } catch (BluetoothException e2) {
                    e = e2;
                    if (this.f98199c.mo54125af() > 0) {
                        if (SystemClock.elapsedRealtime() - elapsedRealtime < ((long) this.f98199c.mo54125af())) {
                            z = true;
                        } else {
                            z = false;
                        }
                        bnsl bnsl2 = (bnsl) aypn.f98194a.mo68390d();
                        bnsl2.mo68432a("aypp", "b", 115, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68420a("Retry connecting GATT by timeout:%b", Boolean.valueOf(z));
                    }
                    z2 = false;
                    bnsl bnsl3 = (bnsl) aypn.f98194a.mo68388c();
                    bnsl3.mo68437a(e);
                    bnsl3.mo68432a("aypp", "b", 131, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    Integer valueOf = Integer.valueOf(i);
                    Integer valueOf2 = Integer.valueOf(this.f98199c.mo54143q());
                    if (!z2) {
                        str = "permanently";
                    } else {
                        str = "recovering";
                    }
                    bnsl3.mo68425a("GATT connect attempt %s of %s failed, %s", valueOf, valueOf2, str);
                    if (z2) {
                        this.f98202f.mo54185a();
                        i++;
                    }
                } catch (Throwable th) {
                    bqye.m113761a(th, th);
                }
            }
            bmxy.m108581a(e);
            throw e;
        }
        return this.f98197a;
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo54205b() {
        if (this.f98197a != null) {
            ayqr ayqr = new ayqr(this.f98204h, "Close GATT");
            try {
                this.f98197a.close();
                this.f98197a = null;
                ayqr.close();
                return;
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo54204a(String str) {
        bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
        bnsl.mo68432a("aypp", "a", 101, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Gatt connection with %s closed.", str);
        this.f98197a = null;
    }
}
