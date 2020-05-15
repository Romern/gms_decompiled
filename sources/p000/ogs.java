package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.ArrayMap;
import android.util.SparseArray;
import com.google.android.gms.car.CarGalMessage;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.projection.common.BufferPool;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ogs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ogs {

    /* renamed from: a */
    public static final bnsn f37577a = odk.m28481a("CAR.GAL.GAL");

    /* renamed from: b */
    public final ohi f37578b;

    /* renamed from: c */
    public oga[] f37579c;

    /* renamed from: d */
    public final Object f37580d = new Object();

    /* renamed from: e */
    public boolean f37581e;

    /* renamed from: f */
    public volatile boolean f37582f;

    /* renamed from: g */
    public final ohc f37583g;

    /* renamed from: h */
    public final ojh f37584h;

    /* renamed from: i */
    final HandlerThread f37585i;

    /* renamed from: j */
    public HandlerThread f37586j;

    /* renamed from: k */
    public HandlerThread f37587k;

    /* renamed from: l */
    public HandlerThread f37588l;

    /* renamed from: m */
    public HandlerThread f37589m;

    /* renamed from: n */
    final ogq f37590n;

    /* renamed from: o */
    public final ogr f37591o;

    /* renamed from: p */
    public final ohq f37592p;

    /* renamed from: q */
    public ofo f37593q;

    /* renamed from: r */
    public final oaw f37594r;

    /* renamed from: s */
    public final SparseArray f37595s;

    /* renamed from: t */
    public final ohu f37596t;

    /* renamed from: u */
    public final Map f37597u;

    /* renamed from: v */
    public final oko f37598v;

    /* renamed from: w */
    private ogq f37599w;

    /* renamed from: x */
    private ogq f37600x;

    /* renamed from: y */
    private ogq f37601y;

    /* renamed from: z */
    private ogq f37602z;

    public ogs(ogn ogn) {
        oko oko;
        this.f37582f = false;
        this.f37595s = new SparseArray();
        this.f37597u = new HashMap();
        bmxy.m108581a(ogn.f37566d);
        ohq ohq = ogn.f37567e;
        bmxy.m108581a(ohq);
        this.f37592p = ohq;
        oaw oaw = ogn.f37568f;
        bmxy.m108581a(oaw);
        this.f37594r = oaw;
        ohu ohu = ogn.f37573k;
        bmxy.m108581a(ohu);
        this.f37596t = ohu;
        ogr ogr = ogn.f37569g;
        bmxy.m108581a(ogr);
        this.f37591o = ogr;
        this.f37579c = new oga[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        this.f37593q = ogn.f37570h;
        this.f37581e = false;
        int i = ogn.f37574l;
        ohq ohq2 = this.f37592p;
        bmzi bmzi = ogn.f37571i;
        if (i != 1) {
            bmxy.m108581a(bmzi);
            oko = new okx(i, ohq2, bmzi, new HashMap());
        } else {
            oko = new oky();
        }
        this.f37598v = oko;
        this.f37583g = (ohc) ogn.f37566d.mo6606a();
        int i2 = ogn.f37574l;
        ojh ojh = this.f37583g;
        Map map = this.f37597u;
        ofu a = mo22125a(0);
        oko oko2 = this.f37598v;
        int i3 = i2 - 1;
        if (i2 != 0) {
            if (i3 != 0) {
                if (i3 == 1) {
                    ojh = new olj(ojh, a, new ola(map, oko2));
                } else {
                    String a2 = ofp.m28659a(i2);
                    StringBuilder sb = new StringBuilder(a2.length() + 13);
                    sb.append("Invalid type ");
                    sb.append(a2);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            this.f37584h = ojh;
            mo22129a(0, ohr.m28776a(oer.CONTROL));
            this.f37578b = (ohi) ogn.f37563a.apply(this);
            HandlerThread handlerThread = new HandlerThread("RxDef");
            this.f37585i = handlerThread;
            handlerThread.start();
            this.f37590n = new ogq(this, this.f37585i.getLooper());
            this.f37583g.f37618l = this;
            ogn.f37564b.apply(this);
            oga[] ogaArr = this.f37579c;
            int length = ogaArr.length;
            for (int i4 = 0; i4 < 256; i4++) {
                oga oga = ogaArr[i4];
                if (oga != null) {
                    ohi ohi = this.f37578b;
                    bmxy.m108581a(ohi);
                    ohi.mo22159a(oga);
                }
            }
            ogn.f37565c.apply(this);
            oaw oaw2 = this.f37594r;
            if (oaw2.f37106f) {
                if (oaw2.f37105e.isShutdown()) {
                    bnsi c = oaw.f37101a.mo68388c();
                    c.mo68432a("oaw", "a", 106, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("Previous worker thread was shutdown, start a new one");
                    oaw2.f37105e = oaw.m28316c();
                }
                oaw2.f37105e.execute(new oav(oaw2));
                return;
            }
            return;
        }
        throw null;
    }

    /* renamed from: a */
    static String m28685a(bivb bivb) {
        biuy biuy;
        StringBuilder sb = new StringBuilder();
        sb.append("Service id=");
        sb.append(bivb.f121924b);
        sb.append(" type=");
        int i = bivb.f121923a;
        int i2 = 0;
        if ((i & 2) != 0) {
            sb.append("SensorSourceService {");
            biuy biuy2 = bivb.f121925c;
            if (biuy2 == null) {
                biuy = biuy.f121888g;
            } else {
                biuy = biuy2;
            }
            sb.append("sensors=[");
            bxwc bxwc = biuy.f121890a;
            int size = bxwc.size();
            while (i2 < size) {
                sb.append("type=");
                biva a = biva.m102863a(((biux) bxwc.get(i2)).f121883a);
                if (a == null) {
                    a = biva.SENSOR_LOCATION;
                }
                sb.append(a.f121920w);
                sb.append(",");
                i2++;
            }
            sb.append("] locationCharacterization=");
            sb.append(biuy.f121891b);
            sb.append(" fuelType=");
            sb.append(new bxvv(biuy.f121892c, biuy.f121886d));
            sb.append(" evConnectorType=");
            sb.append(new bxvv(biuy.f121893e, biuy.f121887f));
            sb.append("} ");
        } else {
            int i3 = 1;
            if ((i & 4) != 0) {
                bisc bisc = bivb.f121926d;
                if (bisc == null) {
                    bisc = bisc.f121501f;
                }
                sb.append("MediaSinkService { codec type=");
                birv a2 = birv.m102768a(bisc.f121504b);
                if (a2 == null) {
                    a2 = birv.MEDIA_CODEC_AUDIO_PCM;
                }
                sb.append(a2.f121478h);
                if ((bisc.f121503a & 2) != 0 && bisc.f121506d.size() != 0) {
                    sb.append(" audioStreamType=");
                    int a3 = biow.m102681a(bisc.f121505c);
                    if (a3 != 0) {
                        i3 = a3;
                    }
                    sb.append(i3);
                    bxwc bxwc2 = bisc.f121506d;
                    int size2 = bxwc2.size();
                    while (i2 < size2) {
                        bioo bioo = (bioo) bxwc2.get(i2);
                        sb.append(" { samplingRate=");
                        sb.append(bioo.f121079b);
                        sb.append(" numBits=");
                        sb.append(bioo.f121080c);
                        sb.append(" channels=");
                        sb.append(bioo.f121081d);
                        sb.append("}");
                        i2++;
                    }
                } else if (bisc.f121507e.size() != 0) {
                    bxwc bxwc3 = bisc.f121507e;
                    int size3 = bxwc3.size();
                    while (i2 < size3) {
                        biwg biwg = (biwg) bxwc3.get(i2);
                        sb.append(" { codecResolution=");
                        biwf a4 = biwf.m102896a(biwg.f122094b);
                        if (a4 == null) {
                            a4 = biwf.VIDEO_800x480;
                        }
                        sb.append(a4.f122090j);
                        sb.append(" widthMargin=");
                        sb.append(biwg.f122096d);
                        sb.append(" heightMargin=");
                        sb.append(biwg.f122097e);
                        sb.append(" density=");
                        sb.append(biwg.f122098f);
                        sb.append("}");
                        i2++;
                    }
                }
                sb.append("}");
            } else if ((i & 8) != 0) {
                birg birg = bivb.f121927e;
                if (birg == null) {
                    birg = birg.f121409g;
                }
                sb.append("InputSourceService { keycodes=[");
                bxvt bxvt = birg.f121411a;
                int size4 = bxvt.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    sb.append((Integer) bxvt.get(i4));
                    sb.append(",");
                }
                sb.append("]");
                bxwc bxwc4 = birg.f121412b;
                int size5 = bxwc4.size();
                int i5 = 0;
                while (true) {
                    Integer num = null;
                    if (i5 >= size5) {
                        break;
                    }
                    birf birf = (birf) bxwc4.get(i5);
                    sb.append(" { touchscreen width=");
                    sb.append((birf.f121403a & 1) != 0 ? Integer.valueOf(birf.f121404b) : null);
                    sb.append(" height=");
                    if ((birf.f121403a & 2) != 0) {
                        num = Integer.valueOf(birf.f121405c);
                    }
                    sb.append(num);
                    sb.append(" }");
                    i5++;
                }
                bxwc bxwc5 = birg.f121413c;
                int size6 = bxwc5.size();
                while (i2 < size6) {
                    bire bire = (bire) bxwc5.get(i2);
                    sb.append(" { touchpad width=");
                    sb.append((bire.f121391a & 1) != 0 ? Integer.valueOf(bire.f121392b) : null);
                    sb.append(" height=");
                    sb.append((bire.f121391a & 2) != 0 ? Integer.valueOf(bire.f121393c) : null);
                    sb.append(" sensitivity=");
                    sb.append((bire.f121391a & 128) != 0 ? Integer.valueOf(bire.f121399i) : null);
                    sb.append(" }");
                    i2++;
                }
                sb.append("}");
            } else if ((i & 16) != 0) {
                bisd bisd = bivb.f121928f;
                if (bisd == null) {
                    bisd = bisd.f121509d;
                }
                sb.append("MediaSourceService { codec type=");
                birv a5 = birv.m102768a(bisd.f121512b);
                if (a5 == null) {
                    a5 = birv.MEDIA_CODEC_AUDIO_PCM;
                }
                sb.append(a5.f121478h);
                if ((bisd.f121511a & 2) != 0) {
                    bioo bioo2 = bisd.f121513c;
                    if (bioo2 == null) {
                        bioo2 = bioo.f121076e;
                    }
                    sb.append(" samplingRate=");
                    sb.append(bioo2.f121079b);
                    sb.append(" numBits=");
                    sb.append(bioo2.f121080c);
                    sb.append(" channels=");
                    sb.append(bioo2.f121081d);
                }
                sb.append("}");
            } else if ((i & 32) != 0) {
                bipg bipg = bivb.f121929g;
                if (bipg == null) {
                    bipg = bipg.f121156d;
                }
                sb.append("BluetoothService { carAddress=");
                sb.append(bipg.f121158a);
                sb.append(" supportedPairingMethods=[");
                for (bipc bipc : new bxvv(bipg.f121159b, bipg.f121155c)) {
                    sb.append(bipc.f121142f);
                    sb.append(",");
                }
                sb.append("]}");
            } else if ((i & 128) != 0) {
                bitc bitc = bivb.f121931i;
                if (bitc == null) {
                    bitc = bitc.f121624e;
                }
                sb.append("NavigationStatusService { minimumIntervalMs=");
                sb.append(bitc.f121627b);
                sb.append(" type=");
                int a6 = bitb.m102808a(bitc.f121628c);
                if (a6 != 0) {
                    i3 = a6;
                }
                sb.append(i3);
                if ((bitc.f121626a & 4) != 0) {
                    sb.append(" height=");
                    bisz bisz = bitc.f121629d;
                    if (bisz == null) {
                        bisz = bisz.f121616e;
                    }
                    sb.append(bisz.f121619b);
                    sb.append(" width=");
                    bisz bisz2 = bitc.f121629d;
                    if (bisz2 == null) {
                        bisz2 = bisz.f121616e;
                    }
                    sb.append(bisz2.f121620c);
                    sb.append(" colourDepthBits=");
                    bisz bisz3 = bitc.f121629d;
                    if (bisz3 == null) {
                        bisz3 = bisz.f121616e;
                    }
                    sb.append(bisz3.f121621d);
                }
                sb.append(" }");
            } else if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                sb.append("MediaPlaybackService");
            } else if ((i & 1024) != 0) {
                sb.append("MediaBrowserService");
            } else if ((i & 512) != 0) {
                sb.append("PhoneStatusService");
            } else if ((i & 2048) != 0) {
                biwd biwd = bivb.f121932j;
                if (biwd == null) {
                    biwd = biwd.f122072e;
                }
                sb.append("VendorExtensionService { name=");
                sb.append(biwd.f122075b);
                sb.append("}");
            } else if ((i & 4096) != 0) {
                sb.append("NotificationService");
            } else if ((i & 64) != 0) {
                sb.append("RadioService { radioProperties=[");
                bitu bitu = bivb.f121930h;
                if (bitu == null) {
                    bitu = bitu.f121721b;
                }
                bxwc bxwc6 = bitu.f121723a;
                int size7 = bxwc6.size();
                for (int i6 = 0; i6 < size7; i6++) {
                    bitt bitt = (bitt) bxwc6.get(i6);
                    sb.append(" { radioId=");
                    sb.append(bitt.f121705a);
                    sb.append(" type=");
                    int a7 = biuc.m102837a(bitt.f121706b);
                    if (a7 == 0) {
                        a7 = 1;
                    }
                    sb.append(a7 - 1);
                    sb.append(" range=[");
                    bxwc bxwc7 = bitt.f121707c;
                    int size8 = bxwc7.size();
                    for (int i7 = 0; i7 < size8; i7++) {
                        biud biud = (biud) bxwc7.get(i7);
                        sb.append(" (");
                        sb.append(biud.f121768a);
                        sb.append(",");
                        sb.append(biud.f121769b);
                        sb.append("),");
                    }
                    sb.append(" ] channelSpacings=[");
                    bxvt bxvt2 = bitt.f121708d;
                    int size9 = bxvt2.size();
                    for (int i8 = 0; i8 < size9; i8++) {
                        sb.append(((Integer) bxvt2.get(i8)).intValue());
                        sb.append(",");
                    }
                    sb.append(" ] backgroundTuner=");
                    sb.append(bitt.f121710f);
                    sb.append(" region=");
                    int a8 = birl.m102758a(bitt.f121711g);
                    if (a8 == 0) {
                        a8 = 1;
                    }
                    sb.append(a8 - 1);
                    sb.append(" rds=");
                    int a9 = biug.m102841a(bitt.f121712h);
                    if (a9 == 0) {
                        a9 = 1;
                    }
                    sb.append(a9 - 1);
                    sb.append(" af=");
                    sb.append(bitt.f121713i);
                    sb.append(" ta=");
                    sb.append(bitt.f121714j);
                    sb.append(" trafficService=");
                    int a10 = bivw.m102887a(bitt.f121715k);
                    if (a10 == 0) {
                        a10 = 1;
                    }
                    sb.append(a10 - 1);
                    sb.append(" audioLoopback=");
                    sb.append(bitt.f121716l);
                    sb.append(" muteCapability=");
                    sb.append(bitt.f121717m);
                    sb.append(" stationPresetsAccess=");
                    sb.append(bitt.f121718n);
                    sb.append(" }");
                }
                sb.append(" ] }");
            } else if ((i & 8192) != 0) {
                biwu biwu = bivb.f121933k;
                if (biwu == null) {
                    biwu = biwu.f122129b;
                }
                sb.append("WifiProjectionService {carWifiBssid =");
                sb.append(biwu.f122131a);
                sb.append("}");
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public final Handler mo22131b(int i) {
        ogq ogq = this.f37590n;
        if (i == 2) {
            if (this.f37599w == null) {
                HandlerThread handlerThread = new HandlerThread("RxAud", -19);
                this.f37586j = handlerThread;
                handlerThread.start();
                this.f37599w = new ogq(this, this.f37586j.getLooper());
            }
            return this.f37599w;
        } else if (i == 1) {
            if (this.f37601y == null) {
                HandlerThread handlerThread2 = new HandlerThread("RxVid", -8);
                this.f37588l = handlerThread2;
                handlerThread2.start();
                this.f37601y = new ogq(this, this.f37588l.getLooper());
            }
            return this.f37601y;
        } else if (i == 3) {
            if (this.f37602z == null) {
                HandlerThread handlerThread3 = new HandlerThread("RxSen");
                this.f37589m = handlerThread3;
                handlerThread3.start();
                this.f37602z = new ogq(this, this.f37589m.getLooper());
            }
            return this.f37602z;
        } else if (i != 4) {
            return ogq;
        } else {
            if (this.f37600x == null) {
                HandlerThread handlerThread4 = new HandlerThread("RxMic", -16);
                this.f37587k = handlerThread4;
                handlerThread4.start();
                this.f37600x = new ogq(this, this.f37587k.getLooper());
            }
            return this.f37600x;
        }
    }

    /* renamed from: c */
    public final ohh mo22134c(int i) {
        ohh ohh;
        if (i == 2) {
            ohh = new olc();
        } else {
            ohh = ohp.m28759e();
        }
        ohh.f37640h = new ogo(this);
        ohh.f37639g = new ogp(this);
        return ohh;
    }

    /* renamed from: b */
    public final void mo22132b() {
        this.f37582f = true;
        this.f37584h.mo22149d();
        this.f37585i.quit();
        HandlerThread handlerThread = this.f37586j;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        HandlerThread handlerThread2 = this.f37587k;
        if (handlerThread2 != null) {
            handlerThread2.quit();
        }
        HandlerThread handlerThread3 = this.f37588l;
        if (handlerThread3 != null) {
            handlerThread3.quit();
        }
        HandlerThread handlerThread4 = this.f37589m;
        if (handlerThread4 != null) {
            handlerThread4.quit();
        }
        this.f37597u.clear();
    }

    /* renamed from: b */
    public final void mo22133b(int i, ByteBuffer byteBuffer, boolean z, boolean z2, ogv ogv) {
        int i2 = i;
        boolean z3 = z2;
        ogv ogv2 = ogv;
        ofo ofo = this.f37593q;
        if (ofo != null) {
            byte[] array = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset();
            int position = byteBuffer.position();
            synchronized (((ofn) ofo).f37519a) {
                int i3 = ((ofn) ofo).f37524f.get(i2, -1);
                if (((ofn) ofo).f37520b.get(i3) != null) {
                    ((ofn) ofo).f37523e.mo17324a(System.currentTimeMillis(), i, i3, array, arrayOffset, position, z2);
                    for (ofm ofm : ((ArrayMap) ((ofn) ofo).f37520b.get(i3)).keySet()) {
                        CarGalMessage carGalMessage = ((ofn) ofo).f37523e;
                        try {
                            nrm nrm = ofm.f37516b;
                            Parcel bj = nrm.mo8529bj();
                            dcl.m8165a(bj, carGalMessage);
                            nrm.mo8530c(1, bj);
                        } catch (RemoteException e) {
                        }
                    }
                }
            }
        }
        ohi ohi = this.f37578b;
        if (ohi != null) {
            ohi.mo22156a(i2, byteBuffer, z3, ogv2);
            return;
        }
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.rewind();
        short s = duplicate.getShort();
        boolean z4 = ogv2.f37604a;
        boolean z5 = ogv2.f37605b;
        StringBuilder sb = new StringBuilder(146);
        sb.append("Framer is null. Channel: ");
        sb.append(i2);
        sb.append(", message type: ");
        sb.append((int) s);
        sb.append(", canFragment: ");
        sb.append(z);
        sb.append(", isControlMessage: ");
        sb.append(z3);
        sb.append(", isEncrypted: ");
        sb.append(z4);
        sb.append(", isMediaPayload: ");
        sb.append(z5);
        throw new RuntimeException(sb.toString());
    }

    /* renamed from: a */
    static ByteBuffer m28686a() {
        ByteBuffer buffer = BufferPool.getBuffer(2);
        buffer.putShort(-1);
        return buffer;
    }

    /* renamed from: a */
    public static ogn m28687a(Bundle bundle, SparseArray sparseArray) {
        return new ogn(bundle, sparseArray);
    }

    /* renamed from: a */
    public static ogn m28688a(InputStream inputStream, OutputStream outputStream) {
        return new ogn(inputStream, outputStream);
    }

    /* renamed from: a */
    public static void m28689a(HandlerThread handlerThread) {
        if (handlerThread != null) {
            handlerThread.quitSafely();
            bqhi.m112840a(handlerThread);
        }
    }

    /* renamed from: a */
    public final ofu mo22125a(int i) {
        return new ogg(this, i);
    }

    /* renamed from: a */
    public final void mo22126a(int i, int i2) {
        oga oga;
        synchronized (this.f37580d) {
            oga = this.f37579c[i];
        }
        if (oga != null) {
            Handler handler = oga.f37541l;
            handler.sendMessage(handler.obtainMessage(2, i, i2, null));
        }
    }

    /* renamed from: a */
    public final void mo22127a(int i, ByteBuffer byteBuffer, boolean z) {
        oga oga;
        Message message;
        Object obj;
        char c;
        int i2 = i;
        ByteBuffer byteBuffer2 = byteBuffer;
        if (!this.f37582f) {
            oaw oaw = this.f37594r;
            if (oaw.f37106f) {
                bnic bnic = (bnic) oaw.f37108h.get(i2, bnon.f131923a);
                ByteBuffer duplicate = byteBuffer.duplicate();
                if (duplicate.remaining() >= 2) {
                    c = (char) duplicate.getShort();
                } else {
                    c = 65535;
                }
                if (!bnic.contains(Integer.valueOf(c))) {
                    int i3 = oay.f37110b;
                    ByteBuffer a = oay.m28320a(byteBuffer.duplicate());
                    oaw.mo21928a(new oat(i, a, a.remaining(), z, false, System.currentTimeMillis()));
                }
            }
            synchronized (this.f37580d) {
                oga = this.f37579c[i2];
            }
            if (oga != null) {
                Handler handler = oga.f37541l;
                if (z) {
                    message = handler.obtainMessage(1, i2, 0, byteBuffer2);
                } else {
                    message = handler.obtainMessage(0, i2, 0, byteBuffer2);
                }
                ofo ofo = this.f37593q;
                if (ofo != null) {
                    byte[] array = byteBuffer.array();
                    int arrayOffset = byteBuffer.arrayOffset();
                    int limit = byteBuffer.limit();
                    Object obj2 = ((ofn) ofo).f37519a;
                    synchronized (obj2) {
                        try {
                            int i4 = ((ofn) ofo).f37524f.get(i2, -1);
                            if (((ofn) ofo).f37520b.get(i4) != null) {
                                obj = obj2;
                                ((ofn) ofo).f37523e.mo17324a(System.currentTimeMillis(), i, i4, array, arrayOffset, limit, z);
                                for (ofm ofm : ((ArrayMap) ((ofn) ofo).f37520b.get(i4)).keySet()) {
                                    CarGalMessage carGalMessage = ((ofn) ofo).f37523e;
                                    try {
                                        nrm nrm = ofm.f37516b;
                                        Parcel bj = nrm.mo8529bj();
                                        dcl.m8165a(bj, carGalMessage);
                                        nrm.mo8530c(2, bj);
                                    } catch (RemoteException e) {
                                    }
                                }
                            } else {
                                obj = obj2;
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                }
                handler.sendMessage(message);
            }
        }
    }

    /* renamed from: a */
    public final void mo22128a(int i, ByteBuffer byteBuffer, boolean z, boolean z2, ogv ogv) {
        if (!this.f37582f) {
            if (!ogv.f37605b) {
                oaw oaw = this.f37594r;
                if (oaw.f37106f) {
                    int i2 = oay.f37110b;
                    ByteBuffer duplicate = byteBuffer.duplicate();
                    duplicate.flip();
                    ByteBuffer a = oay.m28320a(duplicate);
                    oaw.mo21928a(new oat(i, a, a.remaining(), z2, true, System.currentTimeMillis()));
                }
            }
            if (byteBuffer == null) {
                int i3 = ogv.f37606c;
                if (i3 != 0) {
                    mo22126a(i, i3);
                    return;
                }
                return;
            }
            mo22133b(i, byteBuffer, z, z2, ogv);
        }
    }

    /* renamed from: a */
    public final synchronized void mo22129a(int i, obe obe) {
        if (this.f37594r.f37106f) {
            this.f37595s.put(i, obe);
        }
    }

    /* renamed from: a */
    public final void mo22130a(boolean z) {
        mo22132b();
        this.f37598v.mo22253a();
        this.f37581e = false;
        ArrayList arrayList = new ArrayList();
        synchronized (this.f37580d) {
            for (int i = 1; i <= 255; i++) {
                oga oga = this.f37579c[i];
                if (oga != null) {
                    arrayList.add(oga);
                    this.f37579c[i] = null;
                }
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((oga) arrayList.get(i2)).mo22115c();
        }
        this.f37594r.mo21929b();
        if (z) {
            try {
                this.f37578b.mo22163d();
            } catch (IOException e) {
            }
        }
        try {
            this.f37578b.mo22162c();
        } catch (IOException e2) {
        }
    }
}
