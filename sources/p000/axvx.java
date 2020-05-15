package p000;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: axvx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axvx {

    /* renamed from: A */
    private axrp f96512A;

    /* renamed from: a */
    final axvz f96513a;

    /* renamed from: b */
    final boolean f96514b;

    /* renamed from: c */
    public final ayfj f96515c;

    /* renamed from: d */
    public final ayab f96516d;

    /* renamed from: e */
    public int f96517e = 0;

    /* renamed from: f */
    public int f96518f = 5;

    /* renamed from: g */
    public int f96519g = 9;

    /* renamed from: h */
    public String f96520h;

    /* renamed from: i */
    public long f96521i;

    /* renamed from: j */
    public long f96522j;

    /* renamed from: k */
    public ParcelFileDescriptor f96523k;

    /* renamed from: l */
    public ParcelFileDescriptor f96524l;

    /* renamed from: m */
    public ByteBuffer f96525m;

    /* renamed from: n */
    public boolean f96526n;

    /* renamed from: o */
    public ByteBuffer f96527o;

    /* renamed from: p */
    public int f96528p;

    /* renamed from: q */
    public final axyj f96529q;

    /* renamed from: r */
    public final aygb f96530r;

    /* renamed from: s */
    public axyi f96531s;

    /* renamed from: t */
    public axyi f96532t;

    /* renamed from: u */
    public ayig f96533u;

    /* renamed from: v */
    private final int f96534v;

    /* renamed from: w */
    private final ayem f96535w;

    /* renamed from: x */
    private long f96536x;

    /* renamed from: y */
    private long f96537y;

    /* renamed from: z */
    private axrp f96538z;

    public axvx(axvz axvz, ayem ayem, ayfj ayfj, axyj axyj, ayab ayab, aygb aygb, boolean z, ayge ayge) {
        int i = 0;
        sdo.m34959a(axvz);
        this.f96513a = axvz;
        this.f96535w = ayem;
        this.f96534v = ayem != ayem.ORIGIN_CHANNEL_API ? Math.max(0, 1) : i;
        sdo.m34959a(ayfj);
        this.f96515c = ayfj;
        sdo.m34959a(axyj);
        this.f96529q = axyj;
        sdo.m34959a(ayab);
        this.f96516d = ayab;
        sdo.m34959a(aygb);
        this.f96530r = aygb;
        this.f96514b = z;
        sdo.m34959a(ayge);
    }

    /* renamed from: a */
    private final axyi m83331a(byte[] bArr, boolean z, long j) {
        int i;
        bxvd da = ayel.f97321e.mo74144da();
        ByteString a = ByteString.m123261a(bArr);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ayel ayel = (ayel) da.f164949b;
        a.getClass();
        int i2 = ayel.f97323a | 2;
        ayel.f97323a = i2;
        ayel.f97325c = a;
        ayel.f97323a = i2 | 4;
        ayel.f97326d = z;
        bxvd da2 = ayek.f97315e.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ayek ayek = (ayek) da2.f164949b;
        int i3 = ayek.f97317a | 4;
        ayek.f97317a = i3;
        ayek.f97320d = j;
        axvz axvz = this.f96513a;
        long j2 = axvz.f96541c;
        int i4 = i3 | 1;
        ayek.f97317a = i4;
        ayek.f97318b = j2;
        boolean z2 = axvz.f96542d;
        ayek.f97317a = i4 | 2;
        ayek.f97319c = z2;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ayel ayel2 = (ayel) da.f164949b;
        ayek ayek2 = (ayek) da2.mo74062i();
        ayek2.getClass();
        ayel2.f97324b = ayek2;
        ayel2.f97323a |= 1;
        ayel ayel3 = (ayel) da.mo74062i();
        ayen i5 = mo53652i();
        bxvd bxvd = (bxvd) i5.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) i5);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        ayen ayen = (ayen) bxvd.f164949b;
        ayen ayen2 = ayen.f97331g;
        ayel3.getClass();
        ayen.f97337e = ayel3;
        ayen.f97333a |= 8;
        axyj axyj = this.f96529q;
        aybg aybg = new aybg(this.f96513a, (ayen) bxvd.mo74062i());
        if (ayge.m83955a()) {
            i = (int) chnj.f188812a.mo6606a().mo85434k();
        } else {
            i = (int) chnj.f188812a.mo6606a().mo85433j();
        }
        return axyj.mo53765a(aybg, (long) i, 2, this.f96516d);
    }

    /* renamed from: b */
    private final int m83332b(ParcelFileDescriptor parcelFileDescriptor, ByteBuffer byteBuffer) {
        if (Log.isLoggable("ChannelStateMachine", 2)) {
            Log.v("ChannelStateMachine", String.format("Channel(%s): nonBlockingRead", this.f96513a));
        }
        try {
            ayfj ayfj = this.f96515c;
            int a = ((axvp) ayfj).f96491b.f96493b.mo53615a(parcelFileDescriptor, byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining());
            if (a > 0) {
                byteBuffer.position(byteBuffer.position() + a);
            }
            return a;
        } catch (EOFException e) {
            return -1;
        }
    }

    /* renamed from: d */
    public static String m83333d(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "CONNECTION_STATE_CLOSED" : "CONNECTION_STATE_CLOSING" : "CONNECTION_STATE_ESTABLISHED" : "CONNECTION_STATE_OPEN_SENT" : "CONNECTION_STATE_NOT_STARTED";
    }

    /* renamed from: g */
    private static String m83335g(int i) {
        if (i == 5) {
            return "SENDING_STATE_NOT_STARTED";
        }
        if (i == 6) {
            return "SENDING_STATE_WAITING_TO_READ";
        }
        if (i == 7) {
            return "SENDING_STATE_WAITING_FOR_ACK";
        }
        if (i == 8) {
            return "SENDING_STATE_CLOSED";
        }
        StringBuilder sb = new StringBuilder(35);
        sb.append("SENDING_STATE_UNKNOWN (");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: h */
    private static String m83336h(int i) {
        switch (i) {
            case 9:
                return "RECEIVING_STATE_WAITING_FOR_DATA";
            case 10:
                return "RECEIVING_STATE_WAITING_TO_WRITE";
            case 11:
                return "RECEIVING_STATE_CLOSED";
            default:
                StringBuilder sb = new StringBuilder(37);
                sb.append("RECEIVING_STATE_UNKNOWN (");
                sb.append(i);
                sb.append(")");
                return sb.toString();
        }
    }

    /* renamed from: c */
    public final axvv mo53642c(int i, int i2) {
        mo53635a(4);
        aygb aygb = this.f96530r;
        axvz axvz = this.f96513a;
        aygb.mo53998a(axvz.f96540b, axvz, this.f96520h, axvz.f96539a, i, i2);
        throw new axvv(this.f96513a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo53644c() {
        return this.f96523k != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo53645d() {
        return this.f96519g == 11;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo53646e(int i) {
        ayig ayig = this.f96533u;
        if (ayig != null) {
            ayig.mo54015a(16, null, this.f96520h);
            this.f96533u = null;
        }
        m83334d(3, i);
        mo53641b(3, i);
        int i2 = this.f96518f;
        if (i2 == 8 || i2 == 5) {
            mo53648f(i);
            throw mo53642c(3, i);
        }
        mo53635a(3);
        this.f96528p = i;
        if (this.f96518f == 6) {
            mo53639b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo53647e() {
        return this.f96524l != null;
    }

    /* renamed from: f */
    public final void mo53648f(int i) {
        bxvd da = ayei.f97299j.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ayei ayei = (ayei) da.f164949b;
        ayei.f97302b = 3;
        int i2 = ayei.f97301a | 1;
        ayei.f97301a = i2;
        axvz axvz = this.f96513a;
        long j = axvz.f96541c;
        int i3 = i2 | 2;
        ayei.f97301a = i3;
        ayei.f97303c = j;
        axue axue = axvz.f96540b;
        String str = axue.f96377a;
        str.getClass();
        int i4 = i3 | 8;
        ayei.f97301a = i4;
        ayei.f97305e = str;
        String str2 = axue.f96379c;
        str2.getClass();
        int i5 = i4 | 16;
        ayei.f97301a = i5;
        ayei.f97306f = str2;
        boolean z = axvz.f96542d;
        int i6 = i5 | 4;
        ayei.f97301a = i6;
        ayei.f97304d = z;
        ayei.f97301a = i6 | 64;
        ayei.f97308h = i;
        ayen i7 = mo53652i();
        bxvd bxvd = (bxvd) i7.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) i7);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        ayen ayen = (ayen) bxvd.f164949b;
        ayei ayei2 = (ayei) da.mo74062i();
        ayen ayen2 = ayen.f97331g;
        ayei2.getClass();
        ayen.f97336d = ayei2;
        ayen.f97333a |= 4;
        this.f96529q.mo53766a(new aybg(this.f96513a, (ayen) bxvd.mo74062i()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo53649f() {
        return this.f96518f == 8;
    }

    /* renamed from: i */
    public final ayen mo53652i() {
        bxvd da = ayen.f97331g.mo74144da();
        int i = this.f96534v;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ayen ayen = (ayen) da.f164949b;
        int i2 = ayen.f97333a | 1;
        ayen.f97333a = i2;
        ayen.f97334b = i;
        int i3 = this.f96535w.f97330c;
        ayen.f97333a = i2 | 2;
        ayen.f97335c = i3;
        return (ayen) da.mo74062i();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f96513a);
        String str = this.f96520h;
        String d = m83333d(this.f96517e);
        String g = m83335g(this.f96518f);
        String h = m83336h(this.f96519g);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = d.length();
        StringBuilder sb = new StringBuilder(length + 90 + length2 + length3 + String.valueOf(g).length() + String.valueOf(h).length());
        sb.append("ChannelStateMachine{token=");
        sb.append(valueOf);
        sb.append(", mPath='");
        sb.append(str);
        sb.append("', mConnectionState=");
        sb.append(d);
        sb.append(", mSendingState=");
        sb.append(g);
        sb.append(", mReceivingState=");
        sb.append(h);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: d */
    private final void m83334d(int i, int i2) {
        axrp axrp;
        if (!(i == 0 || (axrp = this.f96512A) == null)) {
            try {
                axrp.mo53436a(i, i2);
            } catch (RemoteException e) {
                Log.w("ChannelStateMachine", "Failed to notify OutputStream of unexpected close", e);
            }
        }
        this.f96512A = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo53650g() {
        mo53635a(4);
        axyi axyi = this.f96531s;
        if (axyi != null) {
            axyi.mo53764a();
            this.f96531s = null;
        }
        axyi axyi2 = this.f96532t;
        if (axyi2 != null) {
            axyi2.mo53764a();
            this.f96532t = null;
        }
        ayig ayig = this.f96533u;
        if (ayig != null) {
            ayig.mo54015a(16, null, this.f96520h);
            this.f96533u = null;
        }
        mo53641b(1, 0);
        mo53636a(1, 0);
        this.f96525m = null;
        this.f96527o = null;
    }

    /* renamed from: h */
    public final void mo53651h() {
        bxvd da = ayei.f97299j.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ayei ayei = (ayei) da.f164949b;
        ayei.f97302b = 2;
        int i = ayei.f97301a | 1;
        ayei.f97301a = i;
        axvz axvz = this.f96513a;
        long j = axvz.f96541c;
        int i2 = 2 | i;
        ayei.f97301a = i2;
        ayei.f97303c = j;
        boolean z = axvz.f96542d;
        int i3 = i2 | 4;
        ayei.f97301a = i3;
        ayei.f97304d = z;
        boolean z2 = this.f96514b;
        ayei.f97301a = i3 | 128;
        ayei.f97309i = z2;
        ayei ayei2 = (ayei) da.mo74062i();
        ayen i4 = mo53652i();
        bxvd bxvd = (bxvd) i4.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) i4);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        ayen ayen = (ayen) bxvd.f164949b;
        ayen ayen2 = ayen.f97331g;
        ayei2.getClass();
        ayen.f97336d = ayei2;
        ayen.f97333a |= 4;
        this.f96529q.mo53766a(new aybg(this.f96513a, (ayen) bxvd.mo74062i()));
    }

    /* renamed from: c */
    public final void mo53643c(int i) {
        if (Log.isLoggable("ChannelStateMachine", 2)) {
            Log.v("ChannelStateMachine", String.format("Channel(%s): Sender %s -> %s", this.f96513a, m83335g(this.f96518f), m83335g(i)));
        }
        this.f96518f = i;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: b */
    public final void mo53639b() {
        boolean z;
        boolean z2;
        int b;
        boolean z3;
        int i;
        if (this.f96518f == 6) {
            if (this.f96524l != null) {
                z = true;
            } else {
                z = false;
            }
            sdo.m34971a(z, (Object) "SENDING_STATE_WAITING_TO_READ but no FD");
            if (this.f96527o == null) {
                if (ayge.m83955a()) {
                    i = (int) chnj.f188812a.mo6606a().mo85432i();
                } else {
                    i = (int) chnj.f188812a.mo6606a().mo85431h();
                }
                if (i > 65536) {
                    StringBuilder sb = new StringBuilder(92);
                    sb.append("Send buffer size setting ");
                    sb.append(i);
                    sb.append(" is too large. It can't be bigger than receiver's buffer");
                    Log.e("ChannelStateMachine", sb.toString());
                    i = AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                } else if (i < 128) {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Send buffer size setting ");
                    sb2.append(i);
                    sb2.append(" is very low. This is probably a mistake");
                    Log.e("ChannelStateMachine", sb2.toString());
                    i = 128;
                }
                if (Log.isLoggable("ChannelStateMachine", 3)) {
                    StringBuilder sb3 = new StringBuilder(40);
                    sb3.append("Creating send buffer of size ");
                    sb3.append(i);
                    Log.d("ChannelStateMachine", sb3.toString());
                }
                this.f96527o = ByteBuffer.allocate(i);
            }
            try {
                ByteBuffer byteBuffer = this.f96527o;
                while (true) {
                    if (this.f96536x <= 0) {
                        break;
                    }
                    byteBuffer.clear();
                    byteBuffer.limit((int) Math.min((long) byteBuffer.capacity(), this.f96536x));
                    int b2 = m83332b(this.f96524l, byteBuffer);
                    if (b2 > 0) {
                        this.f96536x -= (long) b2;
                    }
                }
                try {
                    this.f96527o.clear();
                    long j = this.f96537y;
                    if (j < 0 || j >= ((long) this.f96527o.capacity())) {
                        z2 = false;
                    } else {
                        this.f96527o.limit((int) this.f96537y);
                        z2 = false;
                    }
                    while (true) {
                        b = m83332b(this.f96524l, this.f96527o);
                        if (b <= 0) {
                            break;
                        }
                        z2 = true;
                    }
                    this.f96527o.flip();
                    if (z2) {
                        long j2 = this.f96537y;
                        if (j2 >= 0) {
                            long remaining = j2 - ((long) this.f96527o.remaining());
                            this.f96537y = remaining;
                            if (remaining >= 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            sdo.m34972a(z3, "Invalid mSendingMaxLength = %s", Long.valueOf(remaining));
                        }
                        if (b == 0) {
                            byte[] bArr = new byte[this.f96527o.remaining()];
                            this.f96527o.get(bArr);
                            this.f96532t = m83331a(bArr, false, this.f96522j);
                            this.f96515c.mo53617a(this.f96524l, ayfi.NONE);
                            mo53643c(7);
                            return;
                        }
                    }
                    if (b == -1 || this.f96537y == 0) {
                        byte[] bArr2 = new byte[this.f96527o.remaining()];
                        this.f96527o.get(bArr2);
                        this.f96532t = m83331a(bArr2, true, this.f96522j);
                        mo53636a(0, 0);
                        mo53643c(7);
                    } else if (this.f96517e == 3) {
                        mo53636a(3, this.f96528p);
                        mo53643c(8);
                        mo53648f(this.f96528p);
                        throw mo53642c(3, this.f96528p);
                    }
                } catch (ayff e) {
                    throw new IllegalStateException("Failed to do non-blocking read", e);
                }
            } catch (ayff e2) {
                throw new IllegalStateException("Failed to do non-blocking read at start of file", e2);
            }
        }
    }

    /* renamed from: a */
    public final int mo53633a(ParcelFileDescriptor parcelFileDescriptor, ByteBuffer byteBuffer) {
        if (Log.isLoggable("ChannelStateMachine", 2)) {
            Log.v("ChannelStateMachine", String.format("Channel(%s): nonBlockingWrite", this.f96513a));
        }
        try {
            ayfj ayfj = this.f96515c;
            int b = ((axvp) ayfj).f96491b.f96493b.mo53619b(parcelFileDescriptor, byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining());
            if (b > 0) {
                byteBuffer.position(byteBuffer.position() + b);
            }
            return b;
        } catch (EOFException e) {
            return -1;
        }
    }

    /* renamed from: b */
    public final void mo53640b(int i) {
        if (Log.isLoggable("ChannelStateMachine", 2)) {
            Log.v("ChannelStateMachine", String.format("Channel(%s): Receiver %s -> %s", this.f96513a, m83336h(this.f96519g), m83336h(i)));
        }
        this.f96519g = i;
    }

    /* renamed from: a */
    public final void mo53634a() {
        if (this.f96533u != null) {
            Log.w("ChannelStateMachine", "openChannel cancelled, because remote node is not reachable");
            this.f96533u.mo54015a(13, null, this.f96520h);
            this.f96533u = null;
        }
        mo53636a(1, 0);
        mo53641b(1, 0);
        throw mo53642c(1, 0);
    }

    /* renamed from: a */
    public final void mo53635a(int i) {
        if (Log.isLoggable("ChannelStateMachine", 2)) {
            Log.v("ChannelStateMachine", String.format("Channel(%s): %s -> %s", this.f96513a, m83333d(this.f96517e), m83333d(i)));
        }
        this.f96517e = i;
    }

    /* renamed from: b */
    public final void mo53641b(int i, int i2) {
        axrp axrp;
        if (this.f96523k != null) {
            if (!(i == 0 || (axrp = this.f96538z) == null)) {
                try {
                    axrp.mo53436a(i, i2);
                } catch (RemoteException e) {
                    Log.w("ChannelStateMachine", "Failed to notify InputStream of unexpected close", e);
                }
            }
            this.f96515c.mo53621b(this.f96523k);
            try {
                this.f96523k.close();
            } catch (IOException e2) {
                Log.w("ChannelStateMachine", "Failed to close receiving FD", e2);
            }
            this.f96523k = null;
            this.f96538z = null;
            mo53640b(11);
            aygb aygb = this.f96530r;
            axvz axvz = this.f96513a;
            axue axue = axvz.f96540b;
            String str = this.f96520h;
            String str2 = axvz.f96539a;
            if (Log.isLoggable("WearableService", 2)) {
                Log.v("WearableService", String.format("onChannelInputClosed(%s, %s, %s, %s, %s, %s)", axue, axvz, str, str2, Integer.valueOf(i), Integer.valueOf(i2)));
            }
            aygb.mo53999a(axue, axvz, str, str2, i, i2, 3, "onChannelInputClosed");
        }
    }

    /* renamed from: a */
    public final void mo53636a(int i, int i2) {
        if (this.f96524l != null) {
            m83334d(i, i2);
            this.f96515c.mo53621b(this.f96524l);
            try {
                this.f96524l.close();
            } catch (IOException e) {
                Log.w("ChannelStateMachine", "Failed to close sending FD", e);
            }
            this.f96524l = null;
            mo53643c(8);
            aygb aygb = this.f96530r;
            axvz axvz = this.f96513a;
            axue axue = axvz.f96540b;
            String str = this.f96520h;
            String str2 = axvz.f96539a;
            if (Log.isLoggable("WearableService", 2)) {
                Log.v("WearableService", String.format("onChannelOutputClosed(%s, %s, %s, %s, %s, %s)", axue, axvz, str, str2, Integer.valueOf(i), Integer.valueOf(i2)));
            }
            aygb.mo53999a(axue, axvz, str, str2, i, i2, 4, "onChannelOutputClosed");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo53637a(ParcelFileDescriptor parcelFileDescriptor, axrp axrp) {
        boolean z;
        boolean z2 = true;
        if (this.f96519g != 11) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(z, (Object) "set incoming fd after closing");
        if (this.f96523k != null) {
            z2 = false;
        }
        sdo.m34971a(z2, (Object) "set incoming fd twice");
        sdo.m34959a(parcelFileDescriptor);
        this.f96523k = parcelFileDescriptor;
        this.f96538z = axrp;
        this.f96515c.mo53616a(parcelFileDescriptor);
        if (this.f96519g == 10) {
            this.f96515c.mo53617a(this.f96523k, ayfi.WRITE);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo53638a(ParcelFileDescriptor parcelFileDescriptor, axrp axrp, long j, long j2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34976b(z, "invalid startOffset %s", Long.valueOf(j));
        if (j2 == -1 || j2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        sdo.m34976b(z2, "invalid length %s", Long.valueOf(j2));
        if (this.f96518f == 5) {
            z3 = true;
        } else {
            z3 = false;
        }
        sdo.m34971a(z3, (Object) "set outgoing fd twice");
        if (this.f96524l == null) {
            z4 = true;
        }
        sdo.m34971a(z4, (Object) "set outgoing fd twice");
        sdo.m34959a(parcelFileDescriptor);
        this.f96524l = parcelFileDescriptor;
        this.f96512A = axrp;
        this.f96536x = j;
        this.f96537y = j2;
        this.f96515c.mo53616a(parcelFileDescriptor);
        this.f96515c.mo53617a(parcelFileDescriptor, ayfi.READ);
        mo53643c(6);
    }
}
