package p000;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.media.AudioTrack;
import android.os.Build;
import com.google.android.gms.audiomodem.DsssEncoding;
import com.google.android.gms.audiomodem.DtmfEncoding;
import com.google.android.gms.audiomodem.EncodeResultsProtoHelper;
import com.google.android.gms.audiomodem.Encoding;
import com.google.android.gms.audiomodem.NativeEncoder;
import java.util.Arrays;

/* renamed from: geq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class geq implements geb, gdc {

    /* renamed from: a */
    public final gdd f18065a;

    /* renamed from: b */
    public final gdl f18066b;

    /* renamed from: c */
    public Runnable f18067c;

    /* renamed from: d */
    private final boolean[] f18068d = new boolean[2];

    /* renamed from: e */
    private final gec f18069e;

    /* renamed from: f */
    private final gep f18070f;

    /* renamed from: g */
    private final geu f18071g;

    /* renamed from: h */
    private gen f18072h;

    /* renamed from: i */
    private int f18073i = 0;

    public geq(Context context, gep gep) {
        this.f18065a = new gdd(context, 2, this);
        this.f18066b = new gdl();
        this.f18069e = new gec(context);
        this.f18070f = gep;
        this.f18071g = (geu) ahgz.m55754a(context, geu.class);
    }

    /* renamed from: a */
    public final void mo11668a() {
        gec gec = this.f18069e;
        gec.mo11720a();
        try {
            gec.f18007a.unregisterReceiver(gec.f18018l);
        } catch (IllegalArgumentException e) {
        }
        gec.f18015i.listen(gec.f18017k, 0);
        gdk gdk = gec.f18011e;
        int i = Build.VERSION.SDK_INT;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            defaultAdapter.closeProfileProxy(1, gdk.f17957b);
        }
        Runnable runnable = this.f18067c;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: b */
    public final void mo11742b() {
        gen gen = this.f18072h;
        if (gen != null) {
            if (gen.f18054a) {
                NativeEncoder.nativeRelease();
            }
            this.f18072h = null;
        }
    }

    /* renamed from: b */
    public final void mo11743b(int i) {
        geo geo;
        geo geo2;
        char c;
        geo a = this.f18066b.mo11686a(i);
        if (a != null) {
            int i2 = this.f18073i;
            bzwr bzwr = null;
            if (i2 == 0) {
                gec gec = this.f18069e;
                bnsl bnsl = (bnsl) gdv.f17985a.mo68388c();
                bnsl.mo68432a("gec", "a", 131, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("requestStartPlayback() called during outstanding request");
                gec.f18009c = this;
                if (!gec.f18012f) {
                    gec.f18007a.registerReceiver(gec.f18014h, gec.f18013g, null, gec.f18008b);
                    gec.f18012f = true;
                }
                boolean b = gec.mo11722b();
                gec.f18010d = b;
                i2 = !b ? 2 : 1;
                this.f18073i = i2;
            }
            if (i2 == 1) {
                Encoding encoding = a.f18060b;
                gen gen = this.f18072h;
                if (gen == null || !encoding.equals(gen.f18055b)) {
                    mo11742b();
                    this.f18072h = new gen(encoding);
                }
                gen gen2 = this.f18072h;
                byte[] bArr = a.f18062d;
                if (Arrays.equals(bArr, gen2.f18056c)) {
                    bzwr = gen2.f18057d;
                    geo = a;
                } else {
                    if (gdy.m13001a()) {
                        if (!gen2.f18054a) {
                            Encoding encoding2 = gen2.f18055b;
                            int i3 = encoding2.f9882a;
                            if (i3 == 0) {
                                geo = a;
                                DsssEncoding dsssEncoding = encoding2.f9883b;
                                srn srn = gdv.f17985a;
                                cfnp.m140681d();
                                gen gen3 = gen2;
                                DsssEncoding dsssEncoding2 = dsssEncoding;
                                if (!NativeEncoder.nativeInitializeDsss(dsssEncoding.mo7321a(), dsssEncoding.f9860b, dsssEncoding.f9861c, dsssEncoding.f9862d, dsssEncoding.f9863e, dsssEncoding.f9864f, dsssEncoding.f9865g, dsssEncoding.f9866h, dsssEncoding.f9867i, dsssEncoding.f9868j, dsssEncoding.f9869k, cfnp.m140681d(), AudioTrack.getNativeOutputSampleRate(3), ((float) cfnp.f184595a.mo6606a().mo81707u()) / 1000.0f)) {
                                    bnsl bnsl2 = (bnsl) gdv.f17985a.mo68387b();
                                    bnsl2.mo68432a("gen", "a", 73, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl2.mo68405a("Native initialization of DSSS encoder failed");
                                } else {
                                    gen2 = gen3;
                                    gen2.f18058e = dsssEncoding2.f9870l;
                                }
                            } else if (i3 != 1) {
                                bnsl bnsl3 = (bnsl) gdv.f17985a.mo68388c();
                                bnsl3.mo68432a("gen", "a", 101, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl3.mo68405a("Received an Encoder with unknown type");
                                geo = a;
                            } else {
                                DtmfEncoding dtmfEncoding = encoding2.f9884c;
                                geo = a;
                                if (!NativeEncoder.nativeInitializeDtmf(dtmfEncoding.mo7327c(), dtmfEncoding.f9874d, dtmfEncoding.f9875e, dtmfEncoding.f9876f, ((float) dtmfEncoding.f9877g) / 1000.0f, dtmfEncoding.f9878h, ((float) dtmfEncoding.mo7325a().f9843a) / 1000.0f, ((float) dtmfEncoding.mo7325a().f9844b) / 1000.0f, ((float) dtmfEncoding.mo7325a().f9845c) / 1000.0f, ((float) dtmfEncoding.mo7325a().f9846d) / 1000.0f, dtmfEncoding.mo7325a().f9847e, dtmfEncoding.mo7326b())) {
                                    bnsl bnsl4 = (bnsl) gdv.f17985a.mo68387b();
                                    bnsl4.mo68432a("gen", "a", 95, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl4.mo68405a("Native initialization of DTMF encoder failed");
                                    bzwr = null;
                                } else {
                                    gen2.f18058e = dtmfEncoding.f9879i;
                                }
                            }
                            gen2.f18054a = true;
                        } else {
                            geo = a;
                        }
                        EncodeResultsProtoHelper encodeResultsProtoHelper = new EncodeResultsProtoHelper();
                        NativeEncoder.nativeEncode(bArr, encodeResultsProtoHelper, gen2.f18058e);
                        gen2.f18056c = bArr;
                        gen2.f18057d = encodeResultsProtoHelper.build();
                        bzwr = gen2.f18057d;
                    } else {
                        geo = a;
                    }
                    bzwr = null;
                }
                if (bzwr != null) {
                    geo geo3 = geo;
                    int i4 = geo3.f18063e;
                    gdd gdd = this.f18065a;
                    byte[] k = bzwr.f171668b.getKey();
                    byte[] k2 = bzwr.f171669c.getKey();
                    int i5 = (int) bzwr.f171670d;
                    int i6 = geo3.f18061c;
                    int i7 = -1;
                    if (i6 == -3) {
                        i6 = (int) cfnp.f184595a.mo6606a().mo81688b();
                    } else if (i6 == -2) {
                        i6 = (int) cfnp.f184595a.mo6606a().mo81687a();
                    } else if (i6 == -1 || i6 < 0 || i6 > this.f18065a.f17922b.getStreamMaxVolume(3)) {
                        i6 = -1;
                    }
                    if (i4 != -1) {
                        i7 = i4;
                    }
                    int i8 = i;
                    if (gdd.mo11676c(i8)) {
                        gdd.f17926f.mo11750a(10, gdd.m12965e(i));
                        srn srn2 = gdv.f17985a;
                        geo2 = geo3;
                        c = 1;
                    } else {
                        if (i8 < 0) {
                            geo2 = geo3;
                        } else {
                            AudioTrack[] audioTrackArr = gdd.f17921a;
                            if (i8 < audioTrackArr.length) {
                                AudioTrack audioTrack = audioTrackArr[i8];
                                if (audioTrack == null) {
                                    audioTrackArr[i8] = gdd.mo11671a(i5);
                                } else if (audioTrack.getSampleRate() != i5) {
                                    gdd.f17921a[i8].release();
                                    gdd.f17921a[i8] = gdd.mo11671a(i5);
                                }
                                AudioTrack audioTrack2 = gdd.f17921a[i8];
                                if (audioTrack2 == null) {
                                    gdd.f17926f.mo11750a(9, gdd.m12965e(i));
                                    bnsl bnsl5 = (bnsl) gdv.f17985a.mo68387b();
                                    bnsl5.mo68432a("gdd", "a", 194, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl5.mo68405a("Could not create AudioTrack");
                                    geo2 = geo3;
                                    c = 2;
                                } else {
                                    gdd.f17927g[i8] = true;
                                    gdd.f17929i[i8] = i6;
                                    gdd.f17928h[i8] = false;
                                    gdd.mo11673b();
                                    geo2 = geo3;
                                    gdd.f17924d[i8].post(new gdb(gdd, audioTrack2, i, k, k2, new gcz(gdd, i8), gdd.f17923c, i7));
                                    c = 0;
                                }
                            } else {
                                geo2 = geo3;
                            }
                        }
                        bnsl bnsl6 = (bnsl) gdv.f17985a.mo68387b();
                        bnsl6.mo68432a("gdd", "a", 178, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl6.mo68405a("Invalid track");
                        c = 2;
                    }
                    if (c == 0) {
                        this.f18068d[i8] = false;
                        geo2.f18059a.mo11654a(0);
                    } else if (c == 1) {
                        bnsl bnsl7 = (bnsl) gdv.f17985a.mo68390d();
                        bnsl7.mo68432a("geq", "b", 169, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl7.mo68405a("Playing failed; will retry.");
                        this.f18068d[i8] = true;
                    }
                } else {
                    geo geo4 = geo;
                    geu geu = this.f18071g;
                    if (geu != null) {
                        geu.mo11753a("", 8, geo4);
                    }
                    bnsl bnsl8 = (bnsl) gdv.f17985a.mo68388c();
                    bnsl8.mo68432a("geq", "b", 143, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl8.mo68405a("Unable to encode token");
                    geo4.f18059a.mo11654a(3);
                }
            } else {
                srn srn3 = gdv.f17985a;
                a.f18059a.mo11654a(3);
            }
        } else {
            srn srn4 = gdv.f17985a;
        }
    }

    /* renamed from: a */
    public final void mo11669a(int i) {
        geo a = this.f18066b.mo11686a(i);
        int i2 = a.f18064f;
        int i3 = a.f18063e;
        if (i2 != 1) {
            if (i3 != -1) {
                gep gep = this.f18070f;
                if (gep != null) {
                    gep.mo11658a(a);
                }
            } else {
                return;
            }
        }
        int a2 = this.f18066b.mo11685a(i, a);
        if (a2 == 0) {
            a.f18059a.mo11654a(1);
            gdl gdl = this.f18066b;
            int i4 = 0;
            while (true) {
                geo[] geoArr = gdl.f17959a;
                if (i4 >= geoArr.length) {
                    this.f18069e.mo11720a();
                    this.f18073i = 0;
                    return;
                } else if (geoArr[i4] == null && gdl.f17960b[i4].isEmpty()) {
                    i4++;
                } else {
                    return;
                }
            }
        } else if (a2 == 1) {
            a.f18059a.mo11654a(1);
            mo11743b(i);
        }
    }

    /* renamed from: a */
    public final void mo11719a(boolean z) {
        int i = 0;
        if (!z) {
            if (this.f18073i == 1) {
                this.f18073i = 2;
                while (i < 2) {
                    geo a = this.f18066b.mo11686a(i);
                    if (a != null) {
                        a.f18059a.mo11654a(3);
                        this.f18065a.mo11674b(i);
                        i++;
                    } else {
                        return;
                    }
                }
            }
        } else if (this.f18073i == 2) {
            this.f18073i = 1;
            while (i < 2) {
                mo11743b(i);
                i++;
            }
        }
    }
}
