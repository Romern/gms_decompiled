package p000;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.util.Base64;
import android.util.Pair;
import com.google.android.projection.common.BufferPool;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

/* renamed from: ohc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ohc extends ojh implements ohb {

    /* renamed from: a */
    public static final bnsn f37607a = odk.m28481a("CAR.GAL.GAL");

    /* renamed from: b */
    public String f37608b;

    /* renamed from: c */
    public byte[] f37609c;

    /* renamed from: d */
    public byte[] f37610d;

    /* renamed from: e */
    public byte[] f37611e;

    /* renamed from: f */
    public final Object f37612f;

    /* renamed from: g */
    public final ArrayList f37613g;

    /* renamed from: h */
    public final List f37614h;

    /* renamed from: i */
    public ogx f37615i;

    /* renamed from: j */
    public final Queue f37616j;

    /* renamed from: k */
    public ogy f37617k;

    /* renamed from: l */
    public ogs f37618l;

    /* renamed from: r */
    private final oha f37619r;

    /* renamed from: s */
    private final oka f37620s;

    /* renamed from: t */
    private final ogz f37621t;

    /* renamed from: u */
    private final Context f37622u;

    /* renamed from: v */
    private final ohq f37623v;

    /* renamed from: w */
    private int f37624w;

    /* renamed from: x */
    private int f37625x;

    /* renamed from: y */
    private boolean f37626y;

    public ohc() {
        super(1, null, null);
        Object obj = new Object();
        this.f37612f = obj;
        this.f37626y = false;
        this.f37622u = null;
        this.f37623v = null;
        this.f37619r = null;
        this.f37620s = null;
        this.f37621t = null;
        this.f37615i = null;
        this.f37617k = null;
        synchronized (obj) {
            this.f37616j = null;
            this.f37613g = null;
            this.f37614h = null;
        }
    }

    /* renamed from: a */
    private final void m28720a(biou biou, boolean z) {
        bnsi d = f37607a.mo68390d();
        d.mo68432a("ohc", "a", 733, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68420a("Got audio focus state from car:%s", nxs.m28140a(biou));
        ogy ogy = this.f37617k;
        if (ogy != null) {
            ogy.mo20887a(biou, z);
            return;
        }
        synchronized (this.f37612f) {
            this.f37616j.add(Pair.create(biou, Boolean.valueOf(z)));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int, int):void
     arg types: [java.lang.String, short, short]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, int, int):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ojh.a(java.nio.ByteBuffer, boolean):void
     arg types: [java.nio.ByteBuffer, int]
     candidates:
      ohc.a(biou, boolean):void
      ohc.a(int, java.nio.ByteBuffer):void
      ojh.a(int, bxxc):void
      ojh.a(int, java.nio.ByteBuffer):void
      ojh.a(java.nio.ByteBuffer, boolean):void */
    /* renamed from: c */
    private final void m28722c(ByteBuffer byteBuffer) {
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        bnsi d = f37607a.mo68390d();
        d.mo68432a("ohc", "c", 313, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68411a("Car requests protocol version %d.%d", (int) s, (int) s2);
        ofd.m28611a(this.f37622u, "com.google.android.gms.car.VERSION_NEGOTIATION", ofa.STARTED);
        bisf bisf = s == 1 ? bisf.STATUS_SUCCESS : bisf.STATUS_NO_COMPATIBLE_VERSION;
        ByteBuffer buffer = BufferPool.getBuffer(8);
        buffer.putShort(2);
        buffer.putShort(1);
        buffer.putShort(5);
        buffer.putShort((short) bisf.f121548F);
        mo22209a(buffer, false);
        if (bisf == bisf.STATUS_SUCCESS) {
            ofd.m28611a(this.f37622u, "com.google.android.gms.car.VERSION_NEGOTIATION", ofa.COMPLETED);
            this.f37624w = s;
            this.f37625x = s2;
            return;
        }
        ofd.m28611a(this.f37622u, "com.google.android.gms.car.VERSION_NEGOTIATION", ofa.FAILED);
        m28721a(true, bpdn.PROTOCOL_INCOMPATIBLE_VERSION, bpdo.BAD_VERSION, "Bad version");
    }

    /* renamed from: a */
    public final oka mo22141a() {
        return this.f37620s;
    }

    /* renamed from: b */
    public final void mo22143b() {
        bxvd da = bivc.f121939g.mo74144da();
        byte[] bArr = this.f37609c;
        if (bArr != null) {
            bxtx a = bxtx.m123261a(bArr);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bivc bivc = (bivc) da.f164949b;
            a.getClass();
            bivc.f121941a |= 1;
            bivc.f121942b = a;
        }
        byte[] bArr2 = this.f37610d;
        if (bArr2 != null) {
            bxtx a2 = bxtx.m123261a(bArr2);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bivc bivc2 = (bivc) da.f164949b;
            a2.getClass();
            bivc2.f121941a |= 2;
            bivc2.f121943c = a2;
        }
        byte[] bArr3 = this.f37611e;
        if (bArr3 != null) {
            bxtx a3 = bxtx.m123261a(bArr3);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bivc bivc3 = (bivc) da.f164949b;
            a3.getClass();
            bivc3.f121941a |= 4;
            bivc3.f121944d = a3;
        }
        String str = this.f37608b;
        if (str != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bivc bivc4 = (bivc) da.f164949b;
            str.getClass();
            bivc4.f121941a |= 8;
            bivc4.f121945e = str;
        }
        this.f37609c = null;
        this.f37610d = null;
        this.f37611e = null;
        this.f37608b = null;
        if (ccql.m131269d()) {
            ofd.m28611a(this.f37622u, "com.google.android.gms.car.SDP_NEGOTIATION", ofa.STARTED);
        }
        String str2 = Build.MANUFACTURER;
        String str3 = Build.MODEL;
        if (!str3.startsWith(str2)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str3).length());
            sb.append(str2);
            sb.append(" ");
            sb.append(str3);
            str3 = sb.toString();
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bivc bivc5 = (bivc) da.f164949b;
        str3.getClass();
        bivc5.f121941a |= 16;
        bivc5.f121946f = str3;
        mo22206a(5, da.mo74062i());
    }

    /* renamed from: b */
    public final void mo22087b(int i) {
    }

    /* renamed from: c */
    public final boolean mo22144c() {
        int i = this.f37624w;
        return i > 1 || (i == 1 && this.f37625x >= 4);
    }

    /* renamed from: d */
    public final void mo22149d() {
        this.f37619r.mo22138a();
        this.f37621t.mo22093b();
        ogy ogy = this.f37617k;
        if (ogy != null) {
            ogy.mo20884a();
        }
        ogx ogx = this.f37615i;
        if (ogx != null) {
            ody ody = (ody) ogx;
            ody.f37319a = null;
            synchronized (ody.f37320b) {
                Iterator it = ((ody) ogx).f37322d.iterator();
                while (it.hasNext()) {
                    ((odx) it.next()).mo22035a();
                }
                ((ody) ogx).f37322d.clear();
                int i = 0;
                while (true) {
                    odx[] odxArr = ((ody) ogx).f37321c;
                    int length = odxArr.length;
                    if (i >= 3) {
                        break;
                    }
                    odxArr[i] = null;
                    i++;
                }
            }
        }
        super.mo22149d();
    }

    /* renamed from: a */
    private final void m28721a(boolean z, bpdn bpdn, bpdo bpdo, String str) {
        this.f37756q.mo21328b(bpdn, bpdo, str);
        this.f37618l.mo22130a(z);
    }

    public ohc(Context context, Bundle bundle, oha oha, ogz ogz, ohq ohq) {
        super(1, null, ohq);
        this.f37612f = new Object();
        this.f37622u = context;
        this.f37623v = ohq;
        this.f37619r = oha;
        this.f37621t = ogz;
        this.f37626y = true;
        this.f37620s = new oka(bundle);
        IBinder binder = bundle.getBinder("audio_focus_msgs");
        synchronized (this.f37612f) {
            if (binder == null) {
                this.f37616j = new ArrayDeque();
            } else {
                this.f37616j = (Queue) ojq.m28925a(Queue.class, binder);
            }
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("nav_focus_msgs_key");
            if (integerArrayList != null) {
                this.f37613g = new ArrayList(integerArrayList.size());
                Iterator<Integer> it = integerArrayList.iterator();
                while (it.hasNext()) {
                    bisn a = bisn.m102792a(it.next().intValue());
                    if (a != null) {
                        this.f37613g.add(a);
                    }
                }
            } else {
                this.f37613g = null;
            }
            boolean[] booleanArray = bundle.getBooleanArray("call_status_msgs_key");
            this.f37614h = new ArrayList();
            for (boolean z : booleanArray) {
                this.f37614h.add(Boolean.valueOf(z));
            }
        }
        this.f37624w = bundle.getInt("hu_major_version");
        this.f37625x = bundle.getInt("hu_minor_version");
        this.f37619r.mo22140a(this);
        this.f37621t.mo22092a(this);
    }

    /* renamed from: a */
    public final void mo22145a(int i, int i2, boolean z) {
        if (!mo22144c()) {
            bnsi d = f37607a.mo68390d();
            d.mo68432a("ohc", "a", 749, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Unable to send battery status (protocol version too old)");
            return;
        }
        bxvd da = bioy.f121118e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bioy bioy = (bioy) da.f164949b;
        int i3 = bioy.f121120a | 1;
        bioy.f121120a = i3;
        bioy.f121121b = i;
        int i4 = i3 | 2;
        bioy.f121120a = i4;
        bioy.f121122c = i2;
        bioy.f121120a = i4 | 4;
        bioy.f121123d = z;
        mo22206a(23, (bioy) da.mo74062i());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int, int):void
     arg types: [java.lang.String, short, short]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, int, int):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ojh.a(java.nio.ByteBuffer, boolean):void
     arg types: [java.nio.ByteBuffer, int]
     candidates:
      ohc.a(biou, boolean):void
      ohc.a(int, java.nio.ByteBuffer):void
      ojh.a(int, bxxc):void
      ojh.a(int, java.nio.ByteBuffer):void
      ojh.a(java.nio.ByteBuffer, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo22085a(int i, ByteBuffer byteBuffer) {
        bpdo bpdo;
        bpdn bpdn;
        boolean z = false;
        if (i == 1) {
            short s = byteBuffer.getShort();
            short s2 = byteBuffer.getShort();
            bnsi d = f37607a.mo68390d();
            d.mo68432a("ohc", "c", 313, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68411a("Car requests protocol version %d.%d", (int) s, (int) s2);
            ofd.m28611a(this.f37622u, "com.google.android.gms.car.VERSION_NEGOTIATION", ofa.STARTED);
            bisf bisf = s == 1 ? bisf.STATUS_SUCCESS : bisf.STATUS_NO_COMPATIBLE_VERSION;
            ByteBuffer buffer = BufferPool.getBuffer(8);
            buffer.putShort(2);
            buffer.putShort(1);
            buffer.putShort(5);
            buffer.putShort((short) bisf.f121548F);
            mo22209a(buffer, false);
            if (bisf == bisf.STATUS_SUCCESS) {
                ofd.m28611a(this.f37622u, "com.google.android.gms.car.VERSION_NEGOTIATION", ofa.COMPLETED);
                this.f37624w = s;
                this.f37625x = s2;
                return;
            }
            ofd.m28611a(this.f37622u, "com.google.android.gms.car.VERSION_NEGOTIATION", ofa.FAILED);
            m28721a(true, bpdn.PROTOCOL_INCOMPATIBLE_VERSION, bpdo.BAD_VERSION, "Bad version");
        } else if (i == 6) {
            bivd bivd = (bivd) bxvk.m124012a(bivd.f121947o, byteBuffer);
            if (ccql.m131269d()) {
                ofd.m28611a(this.f37622u, "com.google.android.gms.car.SDP_NEGOTIATION", ofa.COMPLETED);
            }
            ogs ogs = this.f37618l;
            int i2 = this.f37624w;
            int i3 = this.f37625x;
            bxwc bxwc = bivd.f121949a;
            int size = bxwc.size();
            for (int i4 = 0; i4 < size; i4++) {
                ogs.m28685a((bivb) bxwc.get(i4));
            }
            new adzt(Looper.getMainLooper()).post(new ogd(ogs, bivd, i2, i3));
        } else if (i == 19) {
            biop biop = (biop) bxvk.m124012a(biop.f121083c, byteBuffer);
            biou a = biou.m102677a(biop.f121085a);
            if (a == null) {
                a = biou.AUDIO_FOCUS_STATE_INVALID;
            }
            boolean z2 = biop.f121086b;
            bnsi d2 = f37607a.mo68390d();
            d2.mo68432a("ohc", "a", 733, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68420a("Got audio focus state from car:%s", nxs.m28140a(a));
            ogy ogy = this.f37617k;
            if (ogy != null) {
                ogy.mo20887a(a, z2);
                return;
            }
            synchronized (this.f37612f) {
                this.f37616j.add(Pair.create(a, Boolean.valueOf(z2)));
            }
        } else if (i == 24) {
            boolean z3 = ((bipl) bxvk.m124012a(bipl.f121177b, byteBuffer)).f121179a;
            Boolean valueOf = Boolean.valueOf(z3);
            ogx ogx = this.f37615i;
            if (ogx != null) {
                ogx.mo22039b(z3);
                return;
            }
            synchronized (this.f37612f) {
                this.f37614h.add(valueOf);
            }
        } else if (i == 26) {
            bive bive = (bive) bxvk.m124012a(bive.f121965c, byteBuffer);
            ogs ogs2 = this.f37618l;
            bivb bivb = bive.f121968b;
            if (bivb == null) {
                bivb = bivb.f121921l;
            }
            ogs.m28685a(bivb);
            new adzt(Looper.getMainLooper()).post(new oge(ogs2, bive));
        } else if (i == 255) {
            bnsi b = f37607a.mo68387b();
            b.mo68432a("ohc", "a", 541, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Terminating connection due to unexpected message error.");
            m28721a(false, bpdn.PROTOCOL_WRONG_MESSAGE, bpdo.UNEXPECTED_MESSAGE, "Unexpected message");
        } else if (i == 65535) {
            bnsi b2 = f37607a.mo68387b();
            b2.mo68432a("ohc", "a", 531, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b2.mo68405a("Terminating connection due to framing error.");
            m28721a(false, bpdn.PROTOCOL_WRONG_MESSAGE, bpdo.FRAMING_ERROR, "Framing error");
        } else if (i == 3) {
            ByteBuffer a2 = this.f37620s.mo22238a(byteBuffer);
            if (a2 != null) {
                mo22208a(3, a2.array(), false, a2.arrayOffset(), a2.limit());
                BufferPool.m117794a(a2);
            }
            int i5 = this.f37620s.f37833e;
            if (i5 != 3 && i5 == 4) {
                bnsi b3 = f37607a.mo68387b();
                b3.mo68432a("ohc", "b", 381, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b3.mo68405a("Authentication failed. Terminating connection.");
                ofd.m28611a(this.f37622u, "com.google.android.gms.car.SSL_NEGOTIATION", ofa.FAILED);
                m28721a(false, bpdn.PROTOCOL_AUTH_FAILED, bpdo.AUTH_FAILED, "Auth failed");
            }
        } else if (i == 4) {
            bisf a3 = bisf.m102781a(((biox) bxvk.m124012a(biox.f121113b, byteBuffer)).f121115a);
            if (a3 != bisf.STATUS_SUCCESS) {
                bnsi b4 = f37607a.mo68387b();
                b4.mo68432a("ohc", "a", 461, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b4.mo68405a("Remote end reported an auth failure.");
                if (a3 == bisf.STATUS_AUTHENTICATION_FAILURE_CERT_EXPIRED) {
                    bpdn = bpdn.PROTOCOL_AUTH_FAILED_BY_CAR_CERT_EXPIRED;
                    bpdo = bpdo.AUTH_FAILED_BY_CAR_CERT_EXPIRED;
                } else if (a3 == bisf.STATUS_AUTHENTICATION_FAILURE_CERT_NOT_YET_VALID) {
                    bpdn = bpdn.PROTOCOL_AUTH_FAILED_BY_CAR_CERT_NOT_YET_VALID;
                    bpdo = bpdo.AUTH_FAILED_BY_CAR_CERT_NOT_YET_VALID;
                } else {
                    bpdn = bpdn.PROTOCOL_AUTH_FAILED_BY_CAR;
                    bpdo = bpdo.AUTH_FAILED_BY_CAR;
                }
                ofd.m28611a(this.f37622u, "com.google.android.gms.car.SSL_NEGOTIATION", ofa.FAILED);
                m28721a(false, bpdn, bpdo, "Remote auth failure");
                return;
            }
            ofd.m28611a(this.f37622u, "com.google.android.gms.car.SSL_NEGOTIATION", ofa.COMPLETED);
            this.f37618l.f37578b.mo22160a(this.f37620s);
            this.f37626y = true;
            ohq ohq = this.f37623v;
            if (ohq != null) {
                oka oka = this.f37620s;
                ohq.mo21285a(this, oka.f37830b, oka.f37831c, oka.f37832d);
            }
        } else if (i == 11) {
            this.f37619r.mo22139a((bitp) bxvk.m124012a(bitp.f121689e, byteBuffer));
        } else if (i != 12) {
            switch (i) {
                case 14:
                    int i6 = ((bisk) bxvk.m124012a(bisk.f121575b, byteBuffer)).f121577a;
                    bisn bisn = bisn.NAV_FOCUS_NATIVE;
                    bisn a4 = bisn.m102792a(i6);
                    if (a4 == null) {
                        a4 = bisn.NAV_FOCUS_NATIVE;
                    }
                    ogx ogx2 = this.f37615i;
                    if (ogx2 == null) {
                        synchronized (this.f37612f) {
                            this.f37613g.add(a4);
                        }
                        return;
                    }
                    if (a4 == bisn.NAV_FOCUS_PROJECTED) {
                        z = true;
                    }
                    ogx2.mo22038a(z);
                    return;
                case 15:
                    ogz ogz = this.f37621t;
                    bipi a5 = bipi.m102695a(((bipj) bxvk.m124012a(bipj.f121170c, byteBuffer)).f121173b);
                    if (a5 == null) {
                        a5 = bipi.USER_SELECTION;
                    }
                    ogz.mo22094b(a5);
                    return;
                case 16:
                    bipk bipk = (bipk) bxvk.m124012a(bipk.f121175a, byteBuffer);
                    this.f37621t.mo22095c();
                    return;
                default:
                    bnsi b5 = f37607a.mo68387b();
                    b5.mo68432a("ohc", "a", 557, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b5.mo68409a("Received unexpected message of type %d", i);
                    return;
            }
        } else {
            this.f37619r.mo21235a((bitq) bxvk.m124012a(bitq.f121696d, byteBuffer));
        }
    }

    public ohc(Context context, oha oha, ogz ogz, ohq ohq, String str, ohv ohv) {
        super(1, null, ohq);
        Object obj = new Object();
        this.f37612f = obj;
        this.f37626y = false;
        this.f37622u = context;
        this.f37623v = ohq;
        this.f37619r = oha;
        this.f37621t = ogz;
        synchronized (obj) {
            this.f37613g = new ArrayList();
            this.f37616j = new ArrayDeque();
            this.f37614h = new ArrayList();
        }
        oka oka = new oka();
        this.f37620s = oka;
        if (str == null) {
            try {
                oka.f37838j = SSLContext.getInstance("TLSv1.2");
            } catch (Exception e) {
                bnsi b = oka.f37827a.mo68387b();
                b.mo68437a(e);
                b.mo68432a("oka", "a", 196, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68405a("Exception initializing SSL engine");
                bnsi b2 = f37607a.mo68387b();
                b2.mo68432a("ohc", "<init>", 146, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b2.mo68405a("Failed to initialize ssl library!");
                return;
            }
        } else {
            oka.f37838j = SSLContext.getInstance("TLSv1.2", str);
        }
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.getProvider();
        byte[] bArr = new byte[48];
        oka.m28981a(oka.f37834f.getBytes(StandardCharsets.UTF_8), bArr, oka.f37835g);
        oka.m28981a("-----BEGIN CERTIFICATE-----\nMIIDiTCCAnGgAwIBAgIJAMFO56WkVE1CMA0GCSqGSIb3DQEBBQUAMFsxCzAJBgNV\nBAYTAlVTMRMwEQYDVQQIDApDYWxpZm9ybmlhMRYwFAYDVQQHDA1Nb3VudGFpbiBW\naWV3MR8wHQYDVQQKDBZHb29nbGUgQXV0b21vdGl2ZSBMaW5rMB4XDTE0MDYwNjE4\nMjgxOVoXDTQ0MDYwNTE4MjgxOVowWzELMAkGA1UEBhMCVVMxEzARBgNVBAgMCkNh\nbGlmb3JuaWExFjAUBgNVBAcMDU1vdW50YWluIFZpZXcxHzAdBgNVBAoMFkdvb2ds\nZSBBdXRvbW90aXZlIExpbmswggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIB\nAQDUH+iIbwwVb74NdI5eBv/ACFmh4ml/NOW7gUVWdYX50n8uQQsHHLCNIhk5VV2H\nhanvAZ/XXHPuVAPadE2HpnNqePKF/RDo4eJo/+rOief8gBYq/Z+OQTZeLdNm+GoI\nHBrEjU4Ms8IdLuFW0jF8LlIRgekjLHpc7duUl3QpwBlmAWQK40T/SZjprlmhyqfJ\ng1rxFdnGbrSibmCsTmb3m6WZyZUyrcwmd7t6q3pHbMABO+o02asPG/YPj/SJo4+i\nfb5/Nk56f3hH9pBiPKQXJnVUdVLKMXSRgydDBsGSBol4C0JL77MNDrMR5jdafJ4j\nmWmsa2+mnzoAv9AxEL9T0LiNAgMBAAGjUDBOMB0GA1UdDgQWBBS5dqvv8DPQiwrM\nfgn8xKR91k7wgjAfBgNVHSMEGDAWgBS5dqvv8DPQiwrMfgn8xKR91k7wgjAMBgNV\nHRMEBTADAQH/MA0GCSqGSIb3DQEBBQUAA4IBAQDKcnBsrbB0Jbz2VGJKP2lwYB6P\ndCTCCpQu7dVp61UQOX+zWfd2hnNMnLs/r1xPO+eyN0vmw7sD05phaIhbXVauKWZi\n9WqWHTaR+9s6CTyBOc1Mye0DMj+4vHt+WLmf0lYjkYUVYvR1EImX8ktXzkVmOqn+\ne30siqlZ8pQpsOgegIKfJ+pNQM8c3eXVv3KFMUgjZW33SziZL8IMsLvSO+1LtH37\nKqbTEMP6XUwVuZopgGvaHU74eT/WSRGlL7vX4OL5/UXXP4qsGH2Zp7uQlErv4H9j\nkMs37UL1vGb4M8RM7Eyu9/RulepSmqZUF+3i+3eby8iGq/3OWk9wgJf7AXnx\n-----END CERTIFICATE-----\n".getBytes(StandardCharsets.UTF_8), bArr, oka.f37835g);
        for (int i = 0; i < 7; i++) {
            oka.m28981a(bArr, bArr, oka.f37835g);
        }
        byte[] bArr2 = new byte[32];
        System.arraycopy(bArr, 0, bArr2, 0, 32);
        instance.init(2, new SecretKeySpec(bArr2, "AES"), new IvParameterSpec(bArr, 32, 16));
        byte[] doFinal = instance.doFinal(oka.f37836h);
        int length = doFinal.length - 54;
        byte[] bArr3 = new byte[length];
        System.arraycopy(doFinal, 28, bArr3, 0, length);
        ojz ojz = new ojz(KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(bArr3, 2))), oka.f37834f);
        oka.f37838j.init(new KeyManager[]{ojz}, new TrustManager[]{ojz.f37823a}, null);
        bnsi d = oka.f37827a.mo68390d();
        d.mo68432a("oka", "a", 183, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68424a("Successfully initialized SSL context for protocol: %s using provider: %s", oka.f37838j.getProtocol(), oka.f37838j.getProvider().getName());
        oka.f37839k = oka.f37838j.createSSLEngine();
        oka.f37839k.setUseClientMode(false);
        oka.f37839k.setNeedClientAuth(true);
        oka.f37840l = oka.f37839k.getSession().getPacketBufferSize();
        oka.f37841m = oka.f37839k.getSession().getApplicationBufferSize();
        oka.f37833e = 1;
        this.f37619r.mo22140a(this);
        this.f37621t.mo22092a(this);
        if (ohv != null && ccpv.m131195d()) {
            this.f37624w = ohv.mo22078a();
            this.f37625x = ohv.mo22079b();
            this.f37626y = ohv.mo22080c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo22148b(ByteBuffer byteBuffer) {
        ByteBuffer a = this.f37620s.mo22238a(byteBuffer);
        if (a != null) {
            mo22208a(3, a.array(), false, a.arrayOffset(), a.limit());
            BufferPool.m117794a(a);
        }
        int i = this.f37620s.f37833e;
        if (i != 3 && i == 4) {
            bnsi b = f37607a.mo68387b();
            b.mo68432a("ohc", "b", 381, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Authentication failed. Terminating connection.");
            ofd.m28611a(this.f37622u, "com.google.android.gms.car.SSL_NEGOTIATION", ofa.FAILED);
            m28721a(false, bpdn.PROTOCOL_AUTH_FAILED, bpdo.AUTH_FAILED, "Auth failed");
        }
    }

    /* renamed from: a */
    public final void mo22146a(Bundle bundle) {
        if (!this.f37626y || this.f37608b != null) {
            throw new IllegalStateException("Can't suspend ControlEndPoint");
        }
        oka oka = this.f37620s;
        int i = oka.f37833e;
        if (i == 3) {
            bundle.putString("peer_cert_name", oka.f37830b);
            bundle.putString("peer_cert_not_before", oka.f37831c);
            bundle.putString("peer_cert_not_after", oka.f37832d);
            bundle.putInt("net_buffer_size", oka.f37840l);
            bundle.putInt("app_buffer_size", oka.f37841m);
            bundle.putBinder("ssl_context", (IBinder) ojq.m28926a(oka.f37838j));
            bundle.putBinder("ssl_engine", (IBinder) ojq.m28926a(oka.f37839k));
            synchronized (this.f37612f) {
                if (!this.f37616j.isEmpty()) {
                    bundle.putBinder("audio_focus_msgs", ojq.m28926a(this.f37616j).asBinder());
                }
                ArrayList arrayList = new ArrayList(this.f37613g.size());
                Iterator it = this.f37613g.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((bisn) it.next()).f121588c));
                }
                bundle.putIntegerArrayList("nav_focus_msgs_key", arrayList);
                boolean[] zArr = new boolean[this.f37614h.size()];
                for (int i2 = 0; i2 < this.f37614h.size(); i2++) {
                    zArr[i2] = ((Boolean) this.f37614h.get(i2)).booleanValue();
                }
                bundle.putBooleanArray("call_status_msgs_key", zArr);
            }
            bundle.putInt("hu_major_version", this.f37624w);
            bundle.putInt("hu_minor_version", this.f37625x);
            return;
        }
        StringBuilder sb = new StringBuilder(42);
        sb.append("Can't suspend SslWrapper:");
        sb.append(i);
        sb.append(" false");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public final void mo22147a(bios bios) {
        bnsi d = f37607a.mo68390d();
        d.mo68432a("ohc", "a", 725, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68420a("sent audio focus request: %s", nxs.m28139a(bios));
        bxvd da = bioq.f121089c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bioq bioq = (bioq) da.f164949b;
        bioq.f121092b = bios.f121100e;
        bioq.f121091a |= 1;
        mo22206a(18, (bioq) da.mo74062i());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ojh.a(int, bxxc, boolean):void
     arg types: [int, bipj, int]
     candidates:
      ohc.a(int, int, boolean):void
      ojh.a(int, boolean, java.nio.ByteBuffer):void
      ojh.a(int, bxxc, boolean):void */
    /* renamed from: a */
    public final void mo22142a(bipi bipi) {
        bxvd da = bipj.f121170c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bipj bipj = (bipj) da.f164949b;
        bipj.f121173b = bipi.f121169f;
        bipj.f121172a |= 1;
        bipj bipj2 = (bipj) da.mo74062i();
        if (this.f37626y) {
            mo22206a(15, bipj2);
        } else {
            super.mo22207a(15, (bxxc) bipj2, false);
        }
    }
}
