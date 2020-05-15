package p000;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.nio.ByteBuffer;

/* renamed from: odp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class odp extends odw {

    /* renamed from: a */
    public static final bnsn f37288a = odk.m28481a("CAR.VIDEO");

    /* renamed from: b */
    public final odv f37289b = m28499f();

    /* renamed from: c */
    public volatile Surface f37290c;

    /* renamed from: d */
    private volatile int f37291d = -1;

    /* renamed from: e */
    private volatile int f37292e = -1;

    /* renamed from: m */
    private volatile int f37293m = -1;

    /* renamed from: n */
    private volatile int f37294n;

    /* renamed from: o */
    private volatile int f37295o;

    /* renamed from: p */
    private volatile int f37296p;

    /* renamed from: q */
    private volatile int f37297q = 0;

    /* renamed from: r */
    private volatile int f37298r = 0;

    public odp(ods ods) {
        super(ods);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: f */
    public static odv m28499f() {
        String[] supportedTypes;
        odv odv;
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            if (mediaCodecInfo.isEncoder()) {
                int i = Build.VERSION.SDK_INT;
                if (!ccti.f179891a.mo6606a().mo76754a() || !mediaCodecInfo.isVendor()) {
                    for (String str : mediaCodecInfo.getSupportedTypes()) {
                        if (str.equalsIgnoreCase("video/avc")) {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType("video/avc");
                            if (capabilitiesForType != null) {
                                odv = new odv();
                                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = capabilitiesForType.profileLevels;
                                int i2 = 0;
                                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                                    if (codecProfileLevel.profile == 1 && codecProfileLevel.level > i2) {
                                        i2 = codecProfileLevel.level;
                                    }
                                }
                                if (!(i2 == 1 || i2 == 2)) {
                                    int i3 = 2073600;
                                    int i4 = 60;
                                    switch (i2) {
                                        case 4:
                                        case 8:
                                        case 16:
                                        case 32:
                                        case 64:
                                        case 128:
                                        case PSKKeyManager.MAX_KEY_LENGTH_BYTES /*256*/:
                                            break;
                                        case 512:
                                            i3 = 921600;
                                            i4 = 30;
                                            odv.f37309a = i3;
                                            odv.f37310b = i4;
                                            odv.f37311c = mediaCodecInfo.getName();
                                            break;
                                        case 1024:
                                            i3 = 921600;
                                            odv.f37309a = i3;
                                            odv.f37310b = i4;
                                            odv.f37311c = mediaCodecInfo.getName();
                                            break;
                                        case 2048:
                                        case 4096:
                                            i4 = 30;
                                            odv.f37309a = i3;
                                            odv.f37310b = i4;
                                            odv.f37311c = mediaCodecInfo.getName();
                                            break;
                                        default:
                                            odv.f37309a = i3;
                                            odv.f37310b = i4;
                                            odv.f37311c = mediaCodecInfo.getName();
                                            break;
                                    }
                                }
                                odv = null;
                            } else {
                                odv = null;
                            }
                            if (odv != null) {
                                return odv;
                            }
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final nto mo21783a() {
        MediaCodec createByCodecName = MediaCodec.createByCodecName(this.f37289b.f37311c);
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", this.f37291d, this.f37292e);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", this.f37293m);
        createVideoFormat.setInteger("frame-rate", this.f37294n);
        createVideoFormat.setInteger("i-frame-interval", this.f37296p);
        createVideoFormat.setInteger("profile", 1);
        createVideoFormat.setInteger("level", this.f37295o);
        if (this.f37297q > 0 && this.f37298r > 0) {
            createVideoFormat.setInteger("vendor.qti-ext-enc-qp-range.qp-i-min", this.f37297q);
            createVideoFormat.setInteger("vendor.qti-ext-enc-qp-range.qp-i-max", this.f37298r);
            createVideoFormat.setInteger("vendor.qti-ext-enc-qp-range.qp-p-min", this.f37297q);
            createVideoFormat.setInteger("vendor.qti-ext-enc-qp-range.qp-p-max", this.f37298r);
            createVideoFormat.setInteger("vendor.qti-ext-enc-qp-range.qp-b-min", this.f37297q);
            createVideoFormat.setInteger("vendor.qti-ext-enc-qp-range.qp-b-max", this.f37298r);
            createVideoFormat.setInteger("vendor-sec-ext-enc-qp-range.I-minQP", this.f37297q);
            createVideoFormat.setInteger("vendor-sec-ext-enc-qp-range.I-maxQP", this.f37298r);
            createVideoFormat.setInteger("vendor-sec-ext-enc-qp-range.P-minQP", this.f37297q);
            createVideoFormat.setInteger("vendor-sec-ext-enc-qp-range.P-maxQP", this.f37298r);
            createVideoFormat.setInteger("vendor-sec-ext-enc-qp-range.B-minQP", this.f37297q);
            createVideoFormat.setInteger("vendor-sec-ext-enc-qp-range.B-maxQP", this.f37298r);
        }
        createByCodecName.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        this.f37290c = createByCodecName.createInputSurface();
        createByCodecName.start();
        return new nto(createByCodecName);
    }

    /* renamed from: g */
    public final Surface mo22031g() {
        return this.f37290c;
    }

    /* renamed from: a */
    public final void mo22028a(int i, int i2, int i3, int i4) {
        if (i != 2) {
            mo22029a(i2, i3, i4, (int) ccwd.f180086a.mo6606a().mo76931h(), (int) ccwd.f180086a.mo6606a().mo76924a(), (int) ccwd.f180086a.mo6606a().mo76928e(), (int) ccwd.f180086a.mo6606a().mo76926c(), (int) ccwd.f180086a.mo6606a().mo76935l(), (int) ccwd.f180086a.mo6606a().mo76933j());
        } else {
            mo22029a(i2, i3, i4, (int) ccwd.f180086a.mo6606a().mo76932i(), (int) ccwd.f180086a.mo6606a().mo76925b(), (int) ccwd.f180086a.mo6606a().mo76929f(), (int) ccwd.f180086a.mo6606a().mo76927d(), (int) ccwd.f180086a.mo6606a().mo76936m(), (int) ccwd.f180086a.mo6606a().mo76934k());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public final void mo22029a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10;
        odv odv = this.f37289b;
        if (odv != null && i * i2 > odv.f37309a) {
            StringBuilder sb = new StringBuilder(44);
            sb.append("width ");
            sb.append(i);
            sb.append(" height ");
            sb.append(i2);
            sb.append(" too big");
            throw new IllegalArgumentException(sb.toString());
        } else if (odv != null && i * i2 * i3 > odv.f37309a * odv.f37310b) {
            StringBuilder sb2 = new StringBuilder(23);
            sb2.append("fps ");
            sb2.append(i3);
            sb2.append(" too big");
            throw new IllegalArgumentException(sb2.toString());
        } else if (!this.f37305i) {
            this.f37291d = i;
            this.f37292e = i2;
            this.f37294n = i3;
            this.f37296p = i4;
            this.f37297q = i8;
            this.f37298r = i9;
            int max = Math.max(this.f37292e, this.f37291d);
            if (max == 1920) {
                this.f37293m = i5;
                i10 = 8192;
            } else if (max != 1280) {
                this.f37293m = i7;
                i10 = 512;
            } else {
                this.f37293m = i6;
                this.f37295o = 1024;
                if (this.f37294n != 60) {
                    int i11 = this.f37293m;
                    this.f37293m = i11 + i11;
                    return;
                }
                return;
            }
            this.f37295o = i10;
            if (this.f37294n != 60) {
            }
        } else {
            throw new IllegalStateException("configure called while encoding is on-going");
        }
    }

    /* renamed from: a */
    public final byte[] mo22030a(ByteBuffer byteBuffer) {
        odo odo;
        byte[] array = byteBuffer.array();
        byte[] bArr = null;
        if (array != null) {
            odo = null;
            int i = 0;
            while (odo == null && i <= array.length - 5) {
                if (array[i] == 0 && array[i + 1] == 0 && array[i + 2] == 0 && array[i + 3] == 1) {
                    byte b = array[i + 4];
                    if (!((b & 128) == 128 || (b & 96) == 0 || (b & 31) != 7)) {
                        try {
                            odo = new odo(array, i + 5);
                        } catch (Exception e) {
                        }
                    }
                }
                i++;
            }
        } else {
            odo = null;
        }
        if (odo != null && (odo.mo22025a(5) == 0 || odo.mo22025a(6) == 0)) {
            bnsi c = f37288a.mo68388c();
            c.mo68432a("odp", "a", 174, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Codec configuration missing VUI/bitstream restriction flag");
            byte[] bArr2 = {0, -38, 8, -124, 106};
            if (odo.f37285a.get(5) == 1) {
                bnsi d = f37288a.mo68390d();
                d.mo68432a("odo", "a", 487, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d.mo68405a("VUI already present");
                if (odo.f37285a.get(6) == 1) {
                    bArr = odo.f37286b;
                }
            } else {
                int i2 = odo.f37287c;
                int i3 = (i2 + 8) / 8;
                int i4 = (i2 + 47) / 8;
                byte[] bArr3 = odo.f37286b;
                byte[] bArr4 = new byte[((bArr3.length - i3) + i4)];
                odo.m28496a(bArr4, 0, bArr3, 0, i2 - 1);
                int i5 = odo.f37287c;
                int i6 = i5 / 8;
                bArr4[i6] = (byte) ((128 >>> (i5 % 8)) | bArr4[i6]);
                odo.m28496a(bArr4, i5 + 1, bArr2, 0, 39);
                byte[] bArr5 = odo.f37286b;
                odo.m28496a(bArr4, i4 * 8, bArr5, i3 * 8, (bArr5.length - i3) * 8);
                bArr = bArr4;
            }
            if (bArr == null) {
                bnsi b2 = f37288a.mo68387b();
                b2.mo68432a("odp", "a", 177, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b2.mo68405a("Could not add low latency VUI to SPS");
            }
        }
        return bArr == null ? byteBuffer.array() : bArr;
    }
}
