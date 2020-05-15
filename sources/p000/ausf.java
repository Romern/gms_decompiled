package p000;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.libraries.bluetooth.BluetoothException;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: ausf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ausf {

    /* renamed from: a */
    public static final aunx f92404a = new aunx("TrustAgent", "EidClient");

    /* renamed from: b */
    public static final String f92405b = String.valueOf(ausf.class.getName()).concat("/fail_timeout");

    /* renamed from: c */
    public static final String f92406c = String.valueOf(ausf.class.getName()).concat("/fail_eid_verification_fail");

    /* renamed from: j */
    private static WeakReference f92407j = new WeakReference(null);

    /* renamed from: d */
    public final Context f92408d;

    /* renamed from: e */
    public final Object f92409e = new Object();

    /* renamed from: f */
    public final ConcurrentMap f92410f = new ConcurrentHashMap();

    /* renamed from: g */
    public final Handler f92411g;

    /* renamed from: h */
    public final ausm f92412h;

    /* renamed from: i */
    public ausp f92413i;

    /* renamed from: k */
    private final bedj f92414k;

    static {
        String.valueOf(ausf.class.getName()).concat("/fail_registration_not_enabled");
        String.valueOf(ausf.class.getName()).concat("/fail_notification_duplicated_registration");
    }

    protected ausf(Context context, Handler handler, ausm ausm) {
        this.f92408d = context;
        this.f92411g = handler;
        this.f92412h = ausm;
        this.f92414k = new bedj(this.f92408d, aysk.m84701b());
    }

    /* renamed from: a */
    public static synchronized ausf m77753a() {
        ausf ausf;
        synchronized (ausf.class) {
            ausf = (ausf) f92407j.get();
            if (ausf == null) {
                sns sns = new sns(10);
                sns.start();
                snr snr = new snr(sns);
                ausf = new ausf(rpr.m34216b(), snr, new ausm(new auss(snr)));
                f92407j = new WeakReference(ausf);
            }
        }
        return ausf;
    }

    /* renamed from: b */
    public final ausp mo50869b() {
        ausp ausp;
        synchronized (this.f92409e) {
            ausp ausp2 = this.f92413i;
            if (ausp2 != null) {
                if (!ausp2.mo50882a()) {
                    throw new ausj("Ignore the checking request: a checking is under process");
                }
            }
            ausp = new ausp(this.f92408d, this.f92412h);
        }
        return ausp;
    }

    /* renamed from: a */
    public final bede mo50865a(BluetoothDevice bluetoothDevice) {
        return this.f92414k.mo58573a(aysl.m84704a(bluetoothDevice));
    }

    /* renamed from: b */
    public final void mo50870b(BluetoothDevice bluetoothDevice) {
        try {
            this.f92412h.mo50878a(new ausc(this, new Object[]{bluetoothDevice}, bluetoothDevice));
        } catch (ausj e) {
            f92404a.mo50711a("Disabling notification process is already in process", new Object[0]).mo50706a();
        }
    }

    /* renamed from: a */
    public final void mo50866a(autq autq) {
        BluetoothDevice a = autq.mo50909a();
        aunx aunx = f92404a;
        String valueOf = String.valueOf(a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("Disabling notifications on device ");
        sb.append(valueOf);
        aunx.mo50711a(sb.toString(), new Object[0]);
        if (!this.f92410f.containsKey(a)) {
            f92404a.mo50711a("Notification is not enabled", new Object[0]).mo50709d();
            try {
                this.f92412h.mo50880a(new ausb(a), true);
            } catch (ausj e) {
                f92404a.mo50711a(e.getMessage(), new Object[0]).mo50709d();
            }
        } else {
            mo50870b(autq.mo50909a());
        }
    }

    /* renamed from: a */
    public final void mo50867a(bede bede, ause ause) {
        boolean z;
        List list;
        bedt bedt;
        beea beea;
        aunx aunx = f92404a;
        String valueOf = String.valueOf(bede.mo58565a());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("Provisioning device ");
        sb.append(valueOf);
        aunx.mo50711a(sb.toString(), new Object[0]);
        try {
            if (this.f92410f.containsKey(bede.mo58565a().f98419a)) {
                mo50870b(bede.mo58565a().f98419a);
            }
            beeb beeb = new beeb(new aysi(), new bect());
            long x = cgzt.f188132a.mo6606a().mo84839x();
            if (x > 0) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108589a(z, "invalid time out value");
            bede.f106942h = x;
            long f = cgzt.f188132a.mo6606a().mo84821f();
            String c = cgzt.f188132a.mo6606a().mo84818c();
            if (!TextUtils.isEmpty(c)) {
                String[] split = c.split(",");
                int length = split.length;
                list = new ArrayList(length);
                for (String str : split) {
                    list.add(Integer.valueOf(Integer.parseInt(str)));
                }
            } else {
                list = Collections.emptyList();
            }
            beeb.f107009b = bedy.m91843a(bede);
            byte[] b = bede.mo58569b(beeb.f107009b, bedz.f107004d);
            byte[] bArr = beec.f107010a;
            int length2 = b.length;
            if (length2 == 1) {
                int a = bqcw.m112606a(b[0]);
                if (a == 0) {
                    String str2 = beeb.f107008a;
                    String valueOf2 = String.valueOf(bede.mo58565a());
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 30);
                    sb2.append("Setup not enabled for device: ");
                    sb2.append(valueOf2);
                    Log.i(str2, sb2.toString());
                    bedt = null;
                } else {
                    new Object[1][0] = 1;
                    if (bede.f106939e.mo54360a(1)) {
                        bedd c2 = bede.mo58570c(beeb.f107009b, bedz.f107003c);
                        if (!list.contains(Integer.valueOf(a))) {
                            if (a == 1) {
                                bedm bedm = new bedm(becu.m91796a());
                                bede.mo58567a(beeb.f107009b, bedz.f107003c, bedm.f106977a);
                                beea = new beea(bedm, beec.m91844a(c2.mo58562a(f)));
                            } else if (a == 2) {
                                bede.mo58567a(beeb.f107009b, bedz.f107003c, beec.f107010a);
                                bedv bedv = new bedv();
                                byte[] a2 = c2.mo58562a(f);
                                if (Arrays.equals(a2, beec.f107011b)) {
                                    byte[] b2 = bede.mo58569b(beeb.f107009b, bedz.f107005e);
                                    String valueOf3 = String.valueOf(boan.f132472f.mo68794a(b2));
                                    if (valueOf3.length() == 0) {
                                        new String("Received remt public key: ");
                                    } else {
                                        "Received remt public key: ".concat(valueOf3);
                                    }
                                    bmxy.m108581a(b2);
                                    bedv.f106991c = bedv.m91836a(b2);
                                    PublicKey publicKey = bedv.f106990b.getPublic();
                                    if (publicKey instanceof ECPublicKey) {
                                        ECPoint w = ((ECPublicKey) publicKey).getW();
                                        ByteBuffer allocate = ByteBuffer.allocate(65);
                                        allocate.put((byte) 4);
                                        BigInteger affineX = w.getAffineX();
                                        BigInteger affineY = w.getAffineY();
                                        if (affineX == null || affineY == null) {
                                            throw new RuntimeException("ECPoint has null coordinate, panic!");
                                        }
                                        allocate.put(bedv.m91837a(affineX));
                                        allocate.put(bedv.m91837a(affineY));
                                        byte[] array = allocate.array();
                                        String valueOf4 = String.valueOf(boan.f132472f.mo68794a(array));
                                        if (valueOf4.length() == 0) {
                                            new String("Writing local public key: ");
                                        } else {
                                            "Writing local public key: ".concat(valueOf4);
                                        }
                                        bede.mo58567a(beeb.f107009b, bedz.f107003c, array);
                                        byte[] a3 = bedv.mo58593a();
                                        byte[] a4 = c2.mo58562a(f);
                                        int length3 = a4.length;
                                        if (length3 == 16) {
                                            byte[] a5 = becu.m91797a(a3, a4);
                                            String valueOf5 = String.valueOf(boan.f132472f.mo68794a(a5));
                                            if (valueOf5.length() == 0) {
                                                new String("Received confirmation: ");
                                            } else {
                                                "Received confirmation: ".concat(valueOf5);
                                            }
                                            if (a5.length == 16) {
                                                int i = 0;
                                                while (i < 15) {
                                                    if (a5[i] == 0) {
                                                        i++;
                                                    } else {
                                                        throw new bedq("Registration confirmation does not validate.");
                                                    }
                                                }
                                                beea = new beea(new bedm(a3), beec.m91844a(Arrays.copyOfRange(a5, 15, 16)));
                                            } else {
                                                throw new bedq("Registration confirmation has invalid length.");
                                            }
                                        } else {
                                            String valueOf6 = String.valueOf(String.valueOf(length3));
                                            throw new bedp(valueOf6.length() == 0 ? new String("Registration confirmation has invalid length: ") : "Registration confirmation has invalid length: ".concat(valueOf6));
                                        }
                                    } else {
                                        throw new RuntimeException("Public key is not an EC key.");
                                    }
                                } else {
                                    String valueOf7 = String.valueOf(boan.f132472f.mo68794a(a2));
                                    throw new bedp(valueOf7.length() == 0 ? new String("Expected device to indicate public key is ready, but got ") : "Expected device to indicate public key is ready, but got ".concat(valueOf7));
                                }
                            } else {
                                StringBuilder sb3 = new StringBuilder(38);
                                sb3.append("Unsupported setup version: ");
                                sb3.append(a);
                                throw new bedp(sb3.toString());
                            }
                            bede.mo58572d(beeb.f107009b, bedz.f107003c);
                            byte[] b3 = bede.mo58569b(beeb.f107009b, bedz.f107002b);
                            long currentTimeMillis = System.currentTimeMillis();
                            beds a6 = bedr.m91834a(new bedk(bede.mo58565a(), beea.f107006a, beea.f107007b), b3);
                            if (a6.f106985d.mo58583a(beea.f107007b)) {
                                bedt = new bedt(currentTimeMillis, a6);
                            } else {
                                throw new bedp(String.format("Initial state %s is incompatible with device capabilities %s", a6.f106985d, beea.f107007b));
                            }
                        } else {
                            StringBuilder sb4 = new StringBuilder(29);
                            sb4.append("Disabled version: ");
                            sb4.append(a);
                            throw new bedp(sb4.toString());
                        }
                    } else {
                        throw new BluetoothException(String.format("Failed to request priority on device %s.", bede.f106939e.mo54358a()));
                    }
                }
                if (bedt != null) {
                    beds beds = bedt.f106988b;
                    ause.mo50659a(bede.mo58565a().f98419a, beds.f106984c.f106973b.toString(), new aury(beds.f106984c.f106974c), bedt);
                    return;
                }
                f92404a.mo50711a("EID provisioning is not enabled by remote devices", new Object[0]).mo50706a();
                return;
            }
            StringBuilder sb5 = new StringBuilder(37);
            sb5.append("Incorrect message length: ");
            sb5.append(length2);
            throw new bedq(sb5.toString());
        } catch (IllegalArgumentException e) {
            throw new BluetoothException(String.format("Invalid priority requested %d on device %s.", 1, bede.f106939e.mo54358a()), e);
        } catch (bedu e2) {
            throw new bedp("Received public key was invalid.", e2);
        } catch (bedp | BluetoothException e3) {
            f92404a.mo50710a("Provision device fails", e3, new Object[0]).mo50706a();
            ause.mo50658a(bede.mo58565a().f98419a, e3.getMessage());
        }
    }

    /* renamed from: a */
    public final boolean mo50868a(bede bede) {
        boolean a;
        try {
            synchronized (this.f92409e) {
                if (this.f92413i == null) {
                    this.f92413i = mo50869b();
                }
                a = this.f92413i.mo50884a(bede);
            }
            return a;
        } catch (ausj e) {
            aunx aunx = f92404a;
            String valueOf = String.valueOf(e.getMessage());
            aunx.mo50711a(valueOf.length() == 0 ? new String("Cannot create eid checker: ") : "Cannot create eid checker: ".concat(valueOf), new Object[0]).mo50706a();
            return false;
        } catch (BluetoothException e2) {
            f92404a.mo50710a("Cannot verify EID.", e2, new Object[0]).mo50706a();
            return false;
        }
    }
}
