package p000;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.google.android.gms.carsetup.BinderParcel;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ntc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ntc extends dck implements ntd {

    /* renamed from: a */
    final /* synthetic */ noj f36430a;

    /* renamed from: b */
    private final AtomicInteger f36431b;

    public ntc() {
        super("com.google.android.gms.car.IConnectionController");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: onz.a(android.content.Context, java.lang.String, boolean):void
     arg types: [android.content.Context, java.lang.String, int]
     candidates:
      onz.a(android.content.Context, java.lang.String, int):void
      onz.a(android.content.Context, java.lang.String, boolean):void */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r4 = r3.f36430a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bf, code lost:
        if (r4.f36228o == r0) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c3, code lost:
        if (r4.f36229p < r0) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cd, code lost:
        throw new java.lang.IllegalStateException("Already connected");
     */
    /* renamed from: a */
    private final void m27648a(Intent intent, nte nte, int i, boolean z, boolean z2) {
        int andIncrement = this.f36431b.getAndIncrement();
        intent.putExtra("connection_type", i).putExtra("start_activities", z).putExtra("connection_tag", andIncrement).putExtra("suppress_restart", z2).setFlags(268435456);
        if (ccpv.m131199h()) {
            noj noj = this.f36430a;
            bnsn bnsn = noj.f36155b;
            noj.f36221h.mo22806a(intent);
        } else {
            ouz.m29833a(intent);
        }
        if (nte != null) {
            intent.putExtra("analytics_fd", new BinderParcel(nte.f12819a));
        }
        noj noj2 = this.f36430a;
        bnsn bnsn2 = noj.f36155b;
        synchronized (noj2.f36227n) {
            noj noj3 = this.f36430a;
            if (noj3.f36228o == -1) {
                if (z2) {
                    intent.setComponent((ComponentName) nzg.f37000b.mo6606a());
                    String className = ((ComponentName) nzg.f37000b.mo6606a()).getClassName();
                    if (onz.m29292a(noj3.f36160E, className) != 1) {
                        onz.m29294a(noj3.f36160E, className, true);
                    }
                    noj3.f36219f.startService(intent);
                } else {
                    if (ccrv.m131380d()) {
                        intent.setComponent((ComponentName) nzg.f37001c.mo6606a());
                    } else {
                        intent.setComponent(npp.f36341c);
                    }
                    noj3.f36219f.startActivity(intent);
                }
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    while (true) {
                        noj noj4 = this.f36430a;
                        if (noj4.f36228o == -1 && noj4.f36229p < andIncrement) {
                            try {
                                noj4.f36227n.wait();
                            } catch (InterruptedException e) {
                            }
                        }
                        break;
                    }
                }
            } else {
                throw new IllegalStateException("Already connected");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ntc(noj noj) {
        super("com.google.android.gms.car.IConnectionController");
        this.f36430a = noj;
        this.f36431b = new AtomicInteger(1);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        nte nte;
        nte nte2;
        nte nte3;
        nte nte4;
        nte nte5;
        Parcel parcel3 = parcel;
        int i2 = 4;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.car.IFdBinder");
                    nte = queryLocalInterface instanceof nte ? (nte) queryLocalInterface : new nte(readStrongBinder);
                } else {
                    nte = null;
                }
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.car.IFdBinder");
                    nte2 = queryLocalInterface2 instanceof nte ? (nte) queryLocalInterface2 : new nte(readStrongBinder2);
                } else {
                    nte2 = null;
                }
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.car.IFdBinder");
                    nte3 = queryLocalInterface3 instanceof nte ? (nte) queryLocalInterface3 : new nte(readStrongBinder3);
                } else {
                    nte3 = null;
                }
                m27648a(new Intent().setAction("com.google.android.gms.carsetup.START").putExtra("in_fd", new BinderParcel(nte.f12819a)).putExtra("out_fd", new BinderParcel(nte2.f12819a)), nte3, parcel.readInt(), dcl.m8167a(parcel), dcl.m8167a(parcel));
                parcel2.writeNoException();
                break;
            case 2:
                nuu.m27798c(new nnz(this));
                parcel2.writeNoException();
                break;
            case 3:
                int readInt = parcel.readInt();
                if (bipi.m102695a(readInt) != null) {
                    noj noj = this.f36430a;
                    bipi a = bipi.m102695a(readInt);
                    bnsn bnsn = noj.f36155b;
                    noj.mo21327b(a);
                }
                parcel2.writeNoException();
                break;
            case 4:
                int i3 = this.f36430a.f36163H.f136282v;
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                break;
            case 5:
                this.f36430a.f36166K = (ComponentName) dcl.m8163a(parcel3, ComponentName.CREATOR);
                parcel2.writeNoException();
                break;
            case 6:
                String[] createStringArray = parcel.createStringArray();
                long clearCallingIdentity = Binder.clearCallingIdentity();
                noj noj2 = this.f36430a;
                if (!(createStringArray == null || createStringArray.length == 0)) {
                    try {
                        PrintWriter printWriter = new PrintWriter(new FileOutputStream("/dev/null"));
                        noj2.f36218e.dump(null, printWriter, createStringArray);
                        printWriter.close();
                    } catch (IOException e) {
                        bnsi b = noj.f36155b.mo68387b();
                        b.mo68437a(e);
                        b.mo68432a("noj", "a", 3264, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        b.mo68405a("handleAdbCommand failed");
                    }
                }
                Binder.restoreCallingIdentity(clearCallingIdentity);
                parcel2.writeNoException();
                break;
            case 7:
                ComponentName componentName = (ComponentName) dcl.m8163a(parcel3, ComponentName.CREATOR);
                int readInt2 = parcel.readInt();
                if (readInt2 == 0) {
                    i2 = 1;
                } else if (readInt2 == 1) {
                    if (!cctl.m131524b()) {
                        i2 = 6;
                    }
                } else if (readInt2 == 2) {
                    i2 = 7;
                } else if (readInt2 == 3) {
                    i2 = 2;
                } else {
                    StringBuilder sb = new StringBuilder(24);
                    sb.append("Bad constant ");
                    sb.append(readInt2);
                    throw new IllegalArgumentException(sb.toString());
                }
                noj noj3 = this.f36430a;
                Intent component = new Intent().setComponent(componentName);
                bnsn bnsn2 = noj.f36155b;
                noj3.mo21294a(component, i2);
                parcel2.writeNoException();
                break;
            case 8:
                ComponentName componentName2 = (ComponentName) dcl.m8163a(parcel3, ComponentName.CREATOR);
                noj noj4 = this.f36430a;
                String packageName = componentName2.getPackageName();
                String className = componentName2.getClassName();
                noj4.mo21255R();
                nip g = noj4.mo21194g();
                if (g != null) {
                    g.mo20824c(new ComponentName(packageName, className));
                }
                parcel2.writeNoException();
                break;
            case 9:
                this.f36430a.f36167L = (ComponentName) dcl.m8163a(parcel3, ComponentName.CREATOR);
                parcel2.writeNoException();
                break;
            case 10:
                long readLong = parcel.readLong();
                boolean a2 = dcl.m8167a(parcel);
                byte[] createByteArray = parcel.createByteArray();
                noj noj5 = this.f36430a;
                bnsn bnsn3 = noj.f36155b;
                if (noj5.f36157B == null) {
                    bnsi c = noj.f36155b.mo68388c();
                    c.mo68432a("noj", "a", 3969, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("Tried to send Ping request to null controller");
                } else if (!noj5.mo21257T()) {
                    bnsi c2 = noj.f36155b.mo68388c();
                    c2.mo68432a("noj", "a", 3973, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c2.mo68405a("Not connected to car");
                } else if (createByteArray != null) {
                    ohc ohc = noj5.f36157B.f37794d.f37583g;
                    bxvd da = bitp.f121689e.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bitp bitp = (bitp) da.f164949b;
                    int i4 = bitp.f121691a | 1;
                    bitp.f121691a = i4;
                    bitp.f121692b = readLong;
                    bitp.f121691a = 2 | i4;
                    bitp.f121693c = a2;
                    ByteString a3 = ByteString.m123261a(createByteArray);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bitp bitp2 = (bitp) da.f164949b;
                    a3.getClass();
                    bitp2.f121691a = 4 | bitp2.f121691a;
                    bitp2.f121694d = a3;
                    ohc.mo22206a(11, (bitp) da.mo74062i());
                } else {
                    noj5.f36157B.mo22214a(readLong, a2);
                }
                parcel2.writeNoException();
                break;
            case 11:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.car.IFdBinder");
                    nte4 = queryLocalInterface4 instanceof nte ? (nte) queryLocalInterface4 : new nte(readStrongBinder4);
                } else {
                    nte4 = null;
                }
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.car.IFdBinder");
                    nte5 = queryLocalInterface5 instanceof nte ? (nte) queryLocalInterface5 : new nte(readStrongBinder5);
                } else {
                    nte5 = null;
                }
                m27648a(new Intent().setAction("com.google.android.gms.carsetup.START_DUPLEX").putExtra("connection_fd", new BinderParcel(nte4.f12819a)), nte5, parcel.readInt(), dcl.m8167a(parcel), dcl.m8167a(parcel));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
