package p000;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TimeZone;
import java.util.zip.CRC32;

/* renamed from: aka */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aka {

    /* renamed from: A */
    private static final ajy[] f703A = {new ajy("NewSubfileType", 254, 4), new ajy("SubfileType", 255, 4), new ajy("ThumbnailImageWidth", PSKKeyManager.MAX_KEY_LENGTH_BYTES), new ajy("ThumbnailImageLength", 257), new ajy("BitsPerSample", 258, 3), new ajy("Compression", 259, 3), new ajy("PhotometricInterpretation", 262, 3), new ajy("ImageDescription", 270, 2), new ajy("Make", 271, 2), new ajy("Model", 272, 2), new ajy("StripOffsets", 273), new ajy("ThumbnailOrientation", 274, 3), new ajy("SamplesPerPixel", 277, 3), new ajy("RowsPerStrip", 278), new ajy("StripByteCounts", 279), new ajy("XResolution", 282, 5), new ajy("YResolution", 283, 5), new ajy("PlanarConfiguration", 284, 3), new ajy("ResolutionUnit", 296, 3), new ajy("TransferFunction", ErrorInfo.TYPE_FSC_HTTP_ERROR, 3), new ajy("Software", 305, 2), new ajy("DateTime", 306, 2), new ajy("Artist", 315, 2), new ajy("WhitePoint", 318, 5), new ajy("PrimaryChromaticities", 319, 5), new ajy("SubIFDPointer", 330, 4), new ajy("JPEGInterchangeFormat", 513, 4), new ajy("JPEGInterchangeFormatLength", 514, 4), new ajy("YCbCrCoefficients", 529, 5), new ajy("YCbCrSubSampling", 530, 3), new ajy("YCbCrPositioning", 531, 3), new ajy("ReferenceBlackWhite", 532, 5), new ajy("Copyright", 33432, 2), new ajy("ExifIFDPointer", 34665, 4), new ajy("GPSInfoIFDPointer", 34853, 4), new ajy("DNGVersion", 50706, 1), new ajy("DefaultCropSize", 50720)};

    /* renamed from: B */
    private static final ajy f704B = new ajy("StripOffsets", 273, 3);

    /* renamed from: C */
    private static final ajy[] f705C = {new ajy("ThumbnailImage", PSKKeyManager.MAX_KEY_LENGTH_BYTES, 7), new ajy("CameraSettingsIFDPointer", 8224, 4), new ajy("ImageProcessingIFDPointer", 8256, 4)};

    /* renamed from: D */
    private static final ajy[] f706D = {new ajy("PreviewImageStart", 257, 4), new ajy("PreviewImageLength", 258, 4)};

    /* renamed from: E */
    private static final ajy[] f707E = {new ajy("AspectFrame", 4371, 3)};

    /* renamed from: F */
    private static final ajy[] f708F;

    /* renamed from: G */
    private static final ajy[] f709G = {new ajy("SubIFDPointer", 330, 4), new ajy("ExifIFDPointer", 34665, 4), new ajy("GPSInfoIFDPointer", 34853, 4), new ajy("InteroperabilityIFDPointer", 40965, 4), new ajy("CameraSettingsIFDPointer", 8224, 1), new ajy("ImageProcessingIFDPointer", 8256, 1)};

    /* renamed from: H */
    private static final HashMap[] f710H = new HashMap[10];

    /* renamed from: I */
    private static final HashMap[] f711I = new HashMap[10];

    /* renamed from: J */
    private static final HashSet f712J = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));

    /* renamed from: K */
    private static final HashMap f713K = new HashMap();

    /* renamed from: L */
    private static final byte[] f714L = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(f722h);

    /* renamed from: a */
    public static final int[] f715a = {8, 8, 8};

    /* renamed from: b */
    public static final int[] f716b = {8};

    /* renamed from: c */
    static final byte[] f717c = {-1, -40, -1};

    /* renamed from: d */
    static final String[] f718d = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: e */
    static final int[] f719e = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: f */
    static final byte[] f720f = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: g */
    static final ajy[][] f721g;

    /* renamed from: h */
    static final Charset f722h;

    /* renamed from: i */
    static final byte[] f723i;

    /* renamed from: j */
    private static final byte[] f724j = {102, 116, 121, 112};

    /* renamed from: k */
    private static final byte[] f725k = {109, 105, 102, 49};

    /* renamed from: l */
    private static final byte[] f726l = {104, 101, 105, 99};

    /* renamed from: m */
    private static final byte[] f727m = {79, 76, 89, 77, 80, 0};

    /* renamed from: n */
    private static final byte[] f728n = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: o */
    private static final byte[] f729o = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: p */
    private static final byte[] f730p = {101, 88, 73, 102};

    /* renamed from: q */
    private static final byte[] f731q = {73, 72, 68, 82};

    /* renamed from: r */
    private static final byte[] f732r = {73, 69, 78, 68};

    /* renamed from: s */
    private static final byte[] f733s = {82, 73, 70, 70};

    /* renamed from: t */
    private static final byte[] f734t = {87, 69, 66, 80};

    /* renamed from: u */
    private static final byte[] f735u = {69, 88, 73, 70};

    /* renamed from: v */
    private static SimpleDateFormat f736v;

    /* renamed from: w */
    private static final ajy[] f737w = {new ajy("NewSubfileType", 254, 4), new ajy("SubfileType", 255, 4), new ajy("ImageWidth", PSKKeyManager.MAX_KEY_LENGTH_BYTES), new ajy("ImageLength", 257), new ajy("BitsPerSample", 258, 3), new ajy("Compression", 259, 3), new ajy("PhotometricInterpretation", 262, 3), new ajy("ImageDescription", 270, 2), new ajy("Make", 271, 2), new ajy("Model", 272, 2), new ajy("StripOffsets", 273), new ajy("Orientation", 274, 3), new ajy("SamplesPerPixel", 277, 3), new ajy("RowsPerStrip", 278), new ajy("StripByteCounts", 279), new ajy("XResolution", 282, 5), new ajy("YResolution", 283, 5), new ajy("PlanarConfiguration", 284, 3), new ajy("ResolutionUnit", 296, 3), new ajy("TransferFunction", ErrorInfo.TYPE_FSC_HTTP_ERROR, 3), new ajy("Software", 305, 2), new ajy("DateTime", 306, 2), new ajy("Artist", 315, 2), new ajy("WhitePoint", 318, 5), new ajy("PrimaryChromaticities", 319, 5), new ajy("SubIFDPointer", 330, 4), new ajy("JPEGInterchangeFormat", 513, 4), new ajy("JPEGInterchangeFormatLength", 514, 4), new ajy("YCbCrCoefficients", 529, 5), new ajy("YCbCrSubSampling", 530, 3), new ajy("YCbCrPositioning", 531, 3), new ajy("ReferenceBlackWhite", 532, 5), new ajy("Copyright", 33432, 2), new ajy("ExifIFDPointer", 34665, 4), new ajy("GPSInfoIFDPointer", 34853, 4), new ajy("SensorTopBorder", 4, 4), new ajy("SensorLeftBorder", 5, 4), new ajy("SensorBottomBorder", 6, 4), new ajy("SensorRightBorder", 7, 4), new ajy("ISO", 23, 3), new ajy("JpgFromRaw", 46, 7), new ajy("Xmp", 700, 1)};

    /* renamed from: x */
    private static final ajy[] f738x = {new ajy("ExposureTime", 33434, 5), new ajy("FNumber", 33437, 5), new ajy("ExposureProgram", 34850, 3), new ajy("SpectralSensitivity", 34852, 2), new ajy("PhotographicSensitivity", 34855, 3), new ajy("OECF", 34856, 7), new ajy("SensitivityType", 34864, 3), new ajy("StandardOutputSensitivity", 34865, 4), new ajy("RecommendedExposureIndex", 34866, 4), new ajy("ISOSpeed", 34867, 4), new ajy("ISOSpeedLatitudeyyy", 34868, 4), new ajy("ISOSpeedLatitudezzz", 34869, 4), new ajy("ExifVersion", 36864, 2), new ajy("DateTimeOriginal", 36867, 2), new ajy("DateTimeDigitized", 36868, 2), new ajy("OffsetTime", 36880, 2), new ajy("OffsetTimeOriginal", 36881, 2), new ajy("OffsetTimeDigitized", 36882, 2), new ajy("ComponentsConfiguration", 37121, 7), new ajy("CompressedBitsPerPixel", 37122, 5), new ajy("ShutterSpeedValue", 37377, 10), new ajy("ApertureValue", 37378, 5), new ajy("BrightnessValue", 37379, 10), new ajy("ExposureBiasValue", 37380, 10), new ajy("MaxApertureValue", 37381, 5), new ajy("SubjectDistance", 37382, 5), new ajy("MeteringMode", 37383, 3), new ajy("LightSource", 37384, 3), new ajy("Flash", 37385, 3), new ajy("FocalLength", 37386, 5), new ajy("SubjectArea", 37396, 3), new ajy("MakerNote", 37500, 7), new ajy("UserComment", 37510, 7), new ajy("SubSecTime", 37520, 2), new ajy("SubSecTimeOriginal", 37521, 2), new ajy("SubSecTimeDigitized", 37522, 2), new ajy("FlashpixVersion", 40960, 7), new ajy("ColorSpace", 40961, 3), new ajy("PixelXDimension", 40962), new ajy("PixelYDimension", 40963), new ajy("RelatedSoundFile", 40964, 2), new ajy("InteroperabilityIFDPointer", 40965, 4), new ajy("FlashEnergy", 41483, 5), new ajy("SpatialFrequencyResponse", 41484, 7), new ajy("FocalPlaneXResolution", 41486, 5), new ajy("FocalPlaneYResolution", 41487, 5), new ajy("FocalPlaneResolutionUnit", 41488, 3), new ajy("SubjectLocation", 41492, 3), new ajy("ExposureIndex", 41493, 5), new ajy("SensingMethod", 41495, 3), new ajy("FileSource", 41728, 7), new ajy("SceneType", 41729, 7), new ajy("CFAPattern", 41730, 7), new ajy("CustomRendered", 41985, 3), new ajy("ExposureMode", 41986, 3), new ajy("WhiteBalance", 41987, 3), new ajy("DigitalZoomRatio", 41988, 5), new ajy("FocalLengthIn35mmFilm", 41989, 3), new ajy("SceneCaptureType", 41990, 3), new ajy("GainControl", 41991, 3), new ajy("Contrast", 41992, 3), new ajy("Saturation", 41993, 3), new ajy("Sharpness", 41994, 3), new ajy("DeviceSettingDescription", 41995, 7), new ajy("SubjectDistanceRange", 41996, 3), new ajy("ImageUniqueID", 42016, 2), new ajy("CameraOwnerName", 42032, 2), new ajy("BodySerialNumber", 42033, 2), new ajy("LensSpecification", 42034, 5), new ajy("LensMake", 42035, 2), new ajy("LensModel", 42036, 2), new ajy("Gamma", 42240, 5), new ajy("DNGVersion", 50706, 1), new ajy("DefaultCropSize", 50720)};

    /* renamed from: y */
    private static final ajy[] f739y = {new ajy("GPSVersionID", 0, 1), new ajy("GPSLatitudeRef", 1, 2), new ajy("GPSLatitude", 2, 5), new ajy("GPSLongitudeRef", 3, 2), new ajy("GPSLongitude", 4, 5), new ajy("GPSAltitudeRef", 5, 1), new ajy("GPSAltitude", 6, 5), new ajy("GPSTimeStamp", 7, 5), new ajy("GPSSatellites", 8, 2), new ajy("GPSStatus", 9, 2), new ajy("GPSMeasureMode", 10, 2), new ajy("GPSDOP", 11, 5), new ajy("GPSSpeedRef", 12, 2), new ajy("GPSSpeed", 13, 5), new ajy("GPSTrackRef", 14, 2), new ajy("GPSTrack", 15, 5), new ajy("GPSImgDirectionRef", 16, 2), new ajy("GPSImgDirection", 17, 5), new ajy("GPSMapDatum", 18, 2), new ajy("GPSDestLatitudeRef", 19, 2), new ajy("GPSDestLatitude", 20, 5), new ajy("GPSDestLongitudeRef", 21, 2), new ajy("GPSDestLongitude", 22, 5), new ajy("GPSDestBearingRef", 23, 2), new ajy("GPSDestBearing", 24, 5), new ajy("GPSDestDistanceRef", 25, 2), new ajy("GPSDestDistance", 26, 5), new ajy("GPSProcessingMethod", 27, 7), new ajy("GPSAreaInformation", 28, 7), new ajy("GPSDateStamp", 29, 2), new ajy("GPSDifferential", 30, 3), new ajy("GPSHPositioningError", 31, 5)};

    /* renamed from: z */
    private static final ajy[] f740z = {new ajy("InteroperabilityIndex", 1, 2)};

    /* renamed from: M */
    private String f741M;

    /* renamed from: N */
    private FileDescriptor f742N;

    /* renamed from: O */
    private AssetManager.AssetInputStream f743O;

    /* renamed from: P */
    private int f744P;

    /* renamed from: Q */
    private final HashMap[] f745Q = new HashMap[10];

    /* renamed from: R */
    private final Set f746R;

    /* renamed from: S */
    private ByteOrder f747S;

    /* renamed from: T */
    private boolean f748T;

    /* renamed from: U */
    private int f749U;

    /* renamed from: V */
    private int f750V;

    /* renamed from: W */
    private int f751W;

    /* renamed from: X */
    private int f752X;

    /* renamed from: Y */
    private int f753Y;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        ajy[] ajyArr = {new ajy("ColorSpace", 55, 3)};
        f708F = ajyArr;
        ajy[] ajyArr2 = f737w;
        f721g = new ajy[][]{ajyArr2, f738x, f739y, f740z, f703A, ajyArr2, f705C, f706D, f707E, ajyArr};
        new ajy("JPEGInterchangeFormat", 513, 4);
        new ajy("JPEGInterchangeFormatLength", 514, 4);
        ajy[][] ajyArr3 = f721g;
        int length = ajyArr3.length;
        int length2 = ajyArr3.length;
        Charset forName = Charset.forName("US-ASCII");
        f722h = forName;
        f723i = "Exif\u0000\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        f736v = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            int length3 = f721g.length;
            if (i < 10) {
                f710H[i] = new HashMap();
                f711I[i] = new HashMap();
                ajy[] ajyArr4 = f721g[i];
                for (ajy ajy : ajyArr4) {
                    f710H[i].put(Integer.valueOf(ajy.f697a), ajy);
                    f711I[i].put(ajy.f698b, ajy);
                }
                i++;
            } else {
                f713K.put(Integer.valueOf(f709G[0].f697a), 5);
                f713K.put(Integer.valueOf(f709G[1].f697a), 1);
                f713K.put(Integer.valueOf(f709G[2].f697a), 2);
                f713K.put(Integer.valueOf(f709G[3].f697a), 3);
                f713K.put(Integer.valueOf(f709G[4].f697a), 7);
                f713K.put(Integer.valueOf(f709G[5].f697a), 8);
                return;
            }
        }
    }

    /* renamed from: a */
    private static String m896a(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i = 0; i < bArr.length; i++) {
            sb.append(String.format("%02x", Byte.valueOf(bArr[i])));
        }
        return sb.toString();
    }

    /* renamed from: b */
    private final ajx m910b(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        int i = 0;
        while (true) {
            int length = f721g.length;
            if (i >= 10) {
                return null;
            }
            ajx ajx = (ajx) this.f745Q[i].get(str);
            if (ajx != null) {
                return ajx;
            }
            i++;
        }
    }

    /* renamed from: c */
    private final void m914c(ajw ajw) {
        ajw.f690a = ByteOrder.LITTLE_ENDIAN;
        ajw.skipBytes(f733s.length);
        int readInt = ajw.readInt() + 8;
        int skipBytes = ajw.skipBytes(f734t.length) + 8;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                if (ajw.read(bArr) == 4) {
                    int readInt2 = ajw.readInt();
                    int i = skipBytes + 8;
                    if (Arrays.equals(f735u, bArr)) {
                        byte[] bArr2 = new byte[readInt2];
                        if (ajw.read(bArr2) == readInt2) {
                            this.f749U = i;
                            m905a(bArr2, 0);
                            this.f749U = i;
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + m896a(bArr));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    int i2 = i + readInt2;
                    if (i2 == readInt) {
                        return;
                    }
                    if (i2 <= readInt) {
                        int skipBytes2 = ajw.skipBytes(readInt2);
                        if (skipBytes2 == readInt2) {
                            skipBytes = i + skipBytes2;
                        } else {
                            throw new IOException("Encountered WebP file with invalid chunk size");
                        }
                    } else {
                        throw new IOException("Encountered WebP file with invalid chunk size");
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* renamed from: d */
    private static final ByteOrder m916d(ajw ajw) {
        short readShort = ajw.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    public aka(InputStream inputStream) {
        int length = f721g.length;
        int length2 = f721g.length;
        this.f746R = new HashSet(10);
        this.f747S = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            FileDescriptor fileDescriptor = null;
            this.f741M = null;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f743O = (AssetManager.AssetInputStream) inputStream;
                this.f742N = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    if (m906a(fileInputStream.getFD())) {
                        this.f743O = null;
                        fileDescriptor = fileInputStream.getFD();
                        this.f742N = fileDescriptor;
                    }
                }
                this.f743O = null;
                this.f742N = fileDescriptor;
            }
            m904a(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }

    /* renamed from: b */
    private final void m911b() {
        m898a(0, 5);
        m898a(0, 4);
        m898a(5, 4);
        ajx ajx = (ajx) this.f745Q[1].get("PixelXDimension");
        ajx ajx2 = (ajx) this.f745Q[1].get("PixelYDimension");
        if (!(ajx == null || ajx2 == null)) {
            this.f745Q[0].put("ImageWidth", ajx);
            this.f745Q[0].put("ImageLength", ajx2);
        }
        if (this.f745Q[4].isEmpty() && m907a(this.f745Q[5])) {
            HashMap[] hashMapArr = this.f745Q;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        m907a(this.f745Q[4]);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ajx.a(long, java.nio.ByteOrder):ajx
     arg types: [int, java.nio.ByteOrder]
     candidates:
      ajx.a(int, java.nio.ByteOrder):ajx
      ajx.a(ajz, java.nio.ByteOrder):ajx
      ajx.a(long, java.nio.ByteOrder):ajx */
    /* renamed from: a */
    private final void m897a() {
        String a = mo867a("DateTimeOriginal");
        if (a != null && mo867a("DateTime") == null) {
            this.f745Q[0].put("DateTime", ajx.m892a(a));
        }
        if (mo867a("ImageWidth") == null) {
            this.f745Q[0].put("ImageWidth", ajx.m890a(0L, this.f747S));
        }
        if (mo867a("ImageLength") == null) {
            this.f745Q[0].put("ImageLength", ajx.m890a(0L, this.f747S));
        }
        if (mo867a("Orientation") == null) {
            this.f745Q[0].put("Orientation", ajx.m890a(0L, this.f747S));
        }
        if (mo867a("LightSource") == null) {
            this.f745Q[1].put("LightSource", ajx.m890a(0L, this.f747S));
        }
    }

    /* renamed from: b */
    private final void m912b(ajw ajw) {
        ajw.f690a = ByteOrder.BIG_ENDIAN;
        ajw.skipBytes(f729o.length);
        int length = f729o.length;
        while (true) {
            try {
                int readInt = ajw.readInt();
                byte[] bArr = new byte[4];
                if (ajw.read(bArr) == 4) {
                    int i = length + 8;
                    if (i == 16) {
                        if (!Arrays.equals(bArr, f731q)) {
                            throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                        }
                    }
                    if (Arrays.equals(bArr, f732r)) {
                        return;
                    }
                    if (Arrays.equals(bArr, f730p)) {
                        byte[] bArr2 = new byte[readInt];
                        if (ajw.read(bArr2) == readInt) {
                            int readInt2 = ajw.readInt();
                            CRC32 crc32 = new CRC32();
                            crc32.update(bArr);
                            crc32.update(bArr2);
                            if (((int) crc32.getValue()) == readInt2) {
                                this.f749U = i;
                                m905a(bArr2, 0);
                                m911b();
                                return;
                            }
                            throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + m896a(bArr));
                    }
                    int i2 = readInt + 4;
                    ajw.skipBytes(i2);
                    length = i + i2;
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* renamed from: a */
    private final void m898a(int i, int i2) {
        if (!this.f745Q[i].isEmpty() && !this.f745Q[i2].isEmpty()) {
            ajx ajx = (ajx) this.f745Q[i].get("ImageLength");
            ajx ajx2 = (ajx) this.f745Q[i].get("ImageWidth");
            ajx ajx3 = (ajx) this.f745Q[i2].get("ImageLength");
            ajx ajx4 = (ajx) this.f745Q[i2].get("ImageWidth");
            if (ajx != null && ajx2 != null && ajx3 != null && ajx4 != null) {
                int b = ajx.mo862b(this.f747S);
                int b2 = ajx2.mo862b(this.f747S);
                int b3 = ajx3.mo862b(this.f747S);
                int b4 = ajx4.mo862b(this.f747S);
                if (b < b3 && b2 < b4) {
                    HashMap[] hashMapArr = this.f745Q;
                    HashMap hashMap = hashMapArr[i];
                    hashMapArr[i] = hashMapArr[i2];
                    hashMapArr[i2] = hashMap;
                }
            }
        }
    }

    public aka(String str) {
        int length = f721g.length;
        int length2 = f721g.length;
        this.f746R = new HashSet(10);
        this.f747S = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            FileInputStream fileInputStream = null;
            this.f743O = null;
            this.f741M = str;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    if (m906a(fileInputStream2.getFD())) {
                        this.f742N = fileInputStream2.getFD();
                    } else {
                        this.f742N = null;
                    }
                    m904a((InputStream) fileInputStream2);
                    m903a((Closeable) fileInputStream2);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    m903a((Closeable) fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                m903a((Closeable) fileInputStream);
                throw th;
            }
        } else {
            throw new NullPointerException("filename cannot be null");
        }
    }

    /* renamed from: a */
    private final void m899a(ajw ajw) {
        ajx ajx;
        m900a(ajw, ajw.available());
        m913b(ajw, 0);
        m915c(ajw, 0);
        m915c(ajw, 5);
        m915c(ajw, 4);
        m911b();
        if (this.f744P == 8 && (ajx = (ajx) this.f745Q[1].get("MakerNote")) != null) {
            ajw ajw2 = new ajw(ajx.f696c);
            ajw2.f690a = this.f747S;
            ajw2.mo842a(6);
            m913b(ajw2, 9);
            ajx ajx2 = (ajx) this.f745Q[9].get("ColorSpace");
            if (ajx2 != null) {
                this.f745Q[1].put("ColorSpace", ajx2);
            }
        }
    }

    /* renamed from: c */
    private final void m915c(ajw ajw, int i) {
        ajx ajx;
        ajx ajx2;
        ajx ajx3;
        ajx ajx4 = (ajx) this.f745Q[i].get("DefaultCropSize");
        ajx ajx5 = (ajx) this.f745Q[i].get("SensorTopBorder");
        ajx ajx6 = (ajx) this.f745Q[i].get("SensorLeftBorder");
        ajx ajx7 = (ajx) this.f745Q[i].get("SensorBottomBorder");
        ajx ajx8 = (ajx) this.f745Q[i].get("SensorRightBorder");
        if (ajx4 != null) {
            if (ajx4.f694a == 5) {
                ajz[] ajzArr = (ajz[]) ajx4.mo861a(this.f747S);
                if (ajzArr != null && ajzArr.length == 2) {
                    ajx3 = ajx.m891a(ajzArr[0], this.f747S);
                    ajx2 = ajx.m891a(ajzArr[1], this.f747S);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(ajzArr));
                    return;
                }
            } else {
                int[] iArr = (int[]) ajx4.mo861a(this.f747S);
                if (iArr != null && iArr.length == 2) {
                    ajx3 = ajx.m889a(iArr[0], this.f747S);
                    ajx2 = ajx.m889a(iArr[1], this.f747S);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
            }
            this.f745Q[i].put("ImageWidth", ajx3);
            this.f745Q[i].put("ImageLength", ajx2);
        } else if (ajx5 == null || ajx6 == null || ajx7 == null || ajx8 == null) {
            ajx ajx9 = (ajx) this.f745Q[i].get("ImageLength");
            ajx ajx10 = (ajx) this.f745Q[i].get("ImageWidth");
            if ((ajx9 == null || ajx10 == null) && (ajx = (ajx) this.f745Q[i].get("JPEGInterchangeFormat")) != null) {
                m901a(ajw, ajx.mo862b(this.f747S), i);
            }
        } else {
            int b = ajx5.mo862b(this.f747S);
            int b2 = ajx7.mo862b(this.f747S);
            int b3 = ajx8.mo862b(this.f747S);
            int b4 = ajx6.mo862b(this.f747S);
            if (b2 > b && b3 > b4) {
                ajx a = ajx.m889a(b2 - b, this.f747S);
                ajx a2 = ajx.m889a(b3 - b4, this.f747S);
                this.f745Q[i].put("ImageLength", a);
                this.f745Q[i].put("ImageWidth", a2);
            }
        }
    }

    /* renamed from: a */
    private final void m900a(ajw ajw, int i) {
        ByteOrder d = m916d(ajw);
        this.f747S = d;
        ajw.f690a = d;
        int readUnsignedShort = ajw.readUnsignedShort();
        int i2 = this.f744P;
        if (i2 == 7 || i2 == 10 || readUnsignedShort == 42) {
            int readInt = ajw.readInt();
            if (readInt < 8 || readInt >= i) {
                throw new IOException("Invalid first Ifd offset: " + readInt);
            }
            int i3 = readInt - 8;
            if (i3 > 0 && ajw.skipBytes(i3) != i3) {
                throw new IOException("Couldn't jump to first Ifd: " + i3);
            }
            return;
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
    }

    /* renamed from: b */
    private final void m913b(ajw ajw, int i) {
        boolean z;
        long j;
        short s;
        short s2;
        int i2;
        int i3;
        Integer num;
        String str;
        long j2;
        int i4;
        int i5;
        ajw ajw2 = ajw;
        int i6 = i;
        this.f746R.add(Integer.valueOf(ajw2.f692c));
        if (ajw2.f692c + 2 <= ajw2.f691b) {
            short readShort = ajw.readShort();
            if (ajw2.f692c + (readShort * 12) <= ajw2.f691b && readShort > 0) {
                short s3 = 0;
                while (s3 < readShort) {
                    int readUnsignedShort = ajw.readUnsignedShort();
                    int readUnsignedShort2 = ajw.readUnsignedShort();
                    int readInt = ajw.readInt();
                    long j3 = ((long) ajw2.f692c) + 4;
                    HashMap hashMap = f710H[i6];
                    Integer valueOf = Integer.valueOf(readUnsignedShort);
                    ajy ajy = (ajy) hashMap.get(valueOf);
                    if (ajy == null) {
                        j = 0;
                        z = false;
                    } else if (readUnsignedShort2 <= 0) {
                        j = 0;
                        z = false;
                    } else if (readUnsignedShort2 < f719e.length && ((i4 = ajy.f699c) == 7 || readUnsignedShort2 == 7 || i4 == readUnsignedShort2 || (i5 = ajy.f700d) == readUnsignedShort2 || (((i4 == 4 || i5 == 4) && readUnsignedShort2 == 3) || (i4 == 9 && readUnsignedShort2 == 8)))) {
                        if (readUnsignedShort2 == 7) {
                            readUnsignedShort2 = i4;
                        }
                        j = ((long) f719e[readUnsignedShort2]) * ((long) readInt);
                        z = j >= 0 && j <= 2147483647L;
                    } else {
                        j = 0;
                        z = false;
                    }
                    if (z) {
                        if (j > 4) {
                            int readInt2 = ajw.readInt();
                            int i7 = this.f744P;
                            s2 = readShort;
                            if (i7 != 7) {
                                s = s3;
                                i2 = readUnsignedShort2;
                                i3 = readInt;
                                num = valueOf;
                                if (i7 == 10 && "JpgFromRaw".equals(ajy.f698b)) {
                                    this.f753Y = readInt2;
                                }
                            } else if ("MakerNote".equals(ajy.f698b)) {
                                s = s3;
                                i2 = readUnsignedShort2;
                                i3 = readInt;
                                num = valueOf;
                                this.f750V = readInt2;
                            } else if (i6 != 6) {
                                s = s3;
                                i2 = readUnsignedShort2;
                                i3 = readInt;
                                num = valueOf;
                            } else if ("ThumbnailImage".equals(ajy.f698b)) {
                                this.f751W = readInt2;
                                this.f752X = readInt;
                                ajx a = ajx.m889a(6, this.f747S);
                                s = s3;
                                i2 = readUnsignedShort2;
                                i3 = readInt;
                                ajx a2 = ajx.m890a((long) this.f751W, this.f747S);
                                num = valueOf;
                                ajx a3 = ajx.m890a((long) this.f752X, this.f747S);
                                this.f745Q[4].put("Compression", a);
                                this.f745Q[4].put("JPEGInterchangeFormat", a2);
                                this.f745Q[4].put("JPEGInterchangeFormatLength", a3);
                            } else {
                                s = s3;
                                i2 = readUnsignedShort2;
                                i3 = readInt;
                                num = valueOf;
                            }
                            long j4 = (long) readInt2;
                            str = "Compression";
                            if (j4 + j <= ((long) ajw2.f691b)) {
                                ajw2.mo842a(j4);
                            } else {
                                ajw2.mo842a(j3);
                            }
                        } else {
                            s2 = readShort;
                            s = s3;
                            i2 = readUnsignedShort2;
                            i3 = readInt;
                            str = "Compression";
                            num = valueOf;
                        }
                        Integer num2 = (Integer) f713K.get(num);
                        if (num2 == null) {
                            byte[] bArr = new byte[((int) j)];
                            ajw2.readFully(bArr);
                            ajx ajx = new ajx(i2, i3, bArr, null);
                            this.f745Q[i6].put(ajy.f698b, ajx);
                            if ("DNGVersion".equals(ajy.f698b)) {
                                this.f744P = 3;
                            }
                            if ((("Make".equals(ajy.f698b) || "Model".equals(ajy.f698b)) && ajx.mo863c(this.f747S).contains("PENTAX")) || (str.equals(ajy.f698b) && ajx.mo862b(this.f747S) == 65535)) {
                                this.f744P = 8;
                            }
                            if (((long) ajw2.f692c) != j3) {
                                ajw2.mo842a(j3);
                            }
                        } else {
                            int i8 = i2;
                            if (i8 == 3) {
                                j2 = (long) ajw.readUnsignedShort();
                            } else if (i8 == 4) {
                                j2 = ajw.mo841a();
                            } else if (i8 == 8) {
                                j2 = (long) ajw.readShort();
                            } else if (i8 == 9 || i8 == 13) {
                                j2 = (long) ajw.readInt();
                            } else {
                                j2 = -1;
                            }
                            if (j2 > 0 && j2 < ((long) ajw2.f691b) && !this.f746R.contains(Integer.valueOf((int) j2))) {
                                ajw2.mo842a(j2);
                                m913b(ajw2, num2.intValue());
                            }
                            ajw2.mo842a(j3);
                        }
                    } else {
                        s2 = readShort;
                        s = s3;
                        ajw2.mo842a(j3);
                    }
                    s3 = (short) (s + 1);
                    readShort = s2;
                }
                if (ajw2.f692c + 4 <= ajw2.f691b) {
                    int readInt3 = ajw.readInt();
                    long j5 = (long) readInt3;
                    if (j5 > 0 && readInt3 < ajw2.f691b && !this.f746R.contains(Integer.valueOf(readInt3))) {
                        ajw2.mo842a(j5);
                        if (this.f745Q[4].isEmpty()) {
                            m913b(ajw2, 4);
                        } else if (this.f745Q[5].isEmpty()) {
                            m913b(ajw2, 5);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0053 A[FALL_THROUGH] */
    /* renamed from: a */
    private final void m901a(ajw ajw, int i, int i2) {
        ajw.f690a = ByteOrder.BIG_ENDIAN;
        ajw.mo842a((long) i);
        byte readByte = ajw.readByte();
        if (readByte != -1) {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
        } else if (ajw.readByte() == -40) {
            int i3 = i + 2;
            while (true) {
                byte readByte2 = ajw.readByte();
                if (readByte2 == -1) {
                    byte readByte3 = ajw.readByte();
                    if (!(readByte3 == -39 || readByte3 == -38)) {
                        int readUnsignedShort = ajw.readUnsignedShort() - 2;
                        int i4 = i3 + 4;
                        if (readUnsignedShort >= 0) {
                            if (readByte3 == -31) {
                                byte[] bArr = new byte[readUnsignedShort];
                                ajw.readFully(bArr);
                                int i5 = i4 + readUnsignedShort;
                                if (m908a(bArr, f723i)) {
                                    byte[] bArr2 = f723i;
                                    int length = bArr2.length;
                                    byte[] copyOfRange = Arrays.copyOfRange(bArr, bArr2.length, readUnsignedShort);
                                    this.f749U = i4 + length;
                                    m905a(copyOfRange, i2);
                                    i4 = i5;
                                    readUnsignedShort = 0;
                                } else {
                                    if (m908a(bArr, f714L)) {
                                        byte[] bArr3 = f714L;
                                        int length2 = bArr3.length;
                                        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr3.length, readUnsignedShort);
                                        if (mo867a("Xmp") == null) {
                                            this.f745Q[0].put("Xmp", new ajx(1, copyOfRange2.length, copyOfRange2, null));
                                        }
                                    }
                                    i4 = i5;
                                    readUnsignedShort = 0;
                                }
                            } else if (readByte3 != -2) {
                                switch (readByte3) {
                                    default:
                                        switch (readByte3) {
                                            default:
                                                switch (readByte3) {
                                                    default:
                                                        switch (readByte3) {
                                                        }
                                                    case -55:
                                                    case -54:
                                                    case -53:
                                                        if (ajw.skipBytes(1) == 1) {
                                                            this.f745Q[i2].put("ImageLength", ajx.m890a((long) ajw.readUnsignedShort(), this.f747S));
                                                            this.f745Q[i2].put("ImageWidth", ajx.m890a((long) ajw.readUnsignedShort(), this.f747S));
                                                            readUnsignedShort -= 5;
                                                            break;
                                                        } else {
                                                            throw new IOException("Invalid SOFx");
                                                        }
                                                }
                                            case -59:
                                            case -58:
                                            case -57:
                                                break;
                                        }
                                    case -64:
                                    case -63:
                                    case -62:
                                    case -61:
                                        break;
                                }
                            } else {
                                byte[] bArr4 = new byte[readUnsignedShort];
                                if (ajw.read(bArr4) == readUnsignedShort) {
                                    if (mo867a("UserComment") == null) {
                                        this.f745Q[1].put("UserComment", ajx.m892a(new String(bArr4, f722h)));
                                    }
                                    readUnsignedShort = 0;
                                } else {
                                    throw new IOException("Invalid exif");
                                }
                            }
                            if (readUnsignedShort < 0) {
                                throw new IOException("Invalid length");
                            } else if (ajw.skipBytes(readUnsignedShort) == readUnsignedShort) {
                                i3 = i4 + readUnsignedShort;
                            } else {
                                throw new IOException("Invalid JPEG segment");
                            }
                        } else {
                            throw new IOException("Invalid length");
                        }
                    }
                } else {
                    throw new IOException("Invalid marker:" + Integer.toHexString(readByte2 & 255));
                }
            }
            ajw.f690a = this.f747S;
        } else {
            throw new IOException("Invalid marker: " + Integer.toHexString(255));
        }
    }

    /* renamed from: a */
    private final void m902a(ajw ajw, HashMap hashMap) {
        ajx ajx = (ajx) hashMap.get("JPEGInterchangeFormat");
        ajx ajx2 = (ajx) hashMap.get("JPEGInterchangeFormatLength");
        if (ajx != null && ajx2 != null) {
            int b = ajx.mo862b(this.f747S);
            int b2 = ajx2.mo862b(this.f747S);
            if (this.f744P == 7) {
                b += this.f750V;
            }
            int min = Math.min(b2, ajw.f691b - b);
            if (b > 0 && min > 0) {
                int i = b + this.f749U;
                if (this.f741M == null && this.f743O == null && this.f742N == null) {
                    ajw.mo842a((long) i);
                    ajw.readFully(new byte[min]);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m903a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ajx.a(int, java.nio.ByteOrder):ajx
     arg types: [short, java.nio.ByteOrder]
     candidates:
      ajx.a(long, java.nio.ByteOrder):ajx
      ajx.a(ajz, java.nio.ByteOrder):ajx
      ajx.a(int, java.nio.ByteOrder):ajx */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0142, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0143, code lost:
        r2 = r0;
        r15 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0148, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0149, code lost:
        r2 = r0;
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x014b, code lost:
        if (r15 != null) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x014d, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0150, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0040, code lost:
        r8 = "FUJIFILMCCD-RAW".getBytes(java.nio.charset.Charset.defaultCharset());
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0152, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0153, code lost:
        if (r8 == null) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0155, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0158, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x015a, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x015e, code lost:
        if (r8 < p000.aka.f729o.length) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0166, code lost:
        if (r7[r8] == p000.aka.f729o[r8]) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0168, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x016b, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x016f, code lost:
        if (r8 < p000.aka.f733s.length) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0177, code lost:
        if (r7[r8] == p000.aka.f733s[r8]) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0179, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x017c, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x017e, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0182, code lost:
        if (r8 < p000.aka.f734t.length) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004c, code lost:
        if (r9 >= r8.length) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x018f, code lost:
        if (r7[(p000.aka.f733s.length + r8) + 4] == p000.aka.f734t[r8]) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0191, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0194, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0196, code lost:
        r7 = 14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0199, code lost:
        r7 = 13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x019c, code lost:
        r7 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        if (r7[r9] != r8[r9]) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0054, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r8 = new p000.ajw(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r12 = (long) r8.readInt();
        r9 = new byte[4];
        r8.read(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006c, code lost:
        if (java.util.Arrays.equals(r9, p000.aka.f724j) == false) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        r18 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0074, code lost:
        if (r12 != 1) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0076, code lost:
        r12 = r8.readLong();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007c, code lost:
        if (r12 < 16) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007f, code lost:
        r18 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0085, code lost:
        if (r12 <= 5000) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0087, code lost:
        r12 = 5000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008b, code lost:
        r12 = r12 - r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008f, code lost:
        if (r12 < 8) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0091, code lost:
        r9 = new byte[4];
        r14 = false;
        r17 = false;
        r18 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009e, code lost:
        if (r18 >= (r12 / 4)) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a4, code lost:
        if (r8.read(r9) != 4) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a8, code lost:
        if (r18 == 1) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b0, code lost:
        if (java.util.Arrays.equals(r9, p000.aka.f725k) != false) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b8, code lost:
        if (java.util.Arrays.equals(r9, p000.aka.f726l) == false) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ba, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00bd, code lost:
        r17 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00bf, code lost:
        if (r17 != false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c2, code lost:
        if (r14 != false) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r8.close();
        r7 = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00cd, code lost:
        r18 = r18 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d2, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d7, code lost:
        r2 = r0;
        r15 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00dc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00dd, code lost:
        r2 = r0;
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00df, code lost:
        if (r15 != null) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e1, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e4, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e6, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e7, code lost:
        if (r8 != null) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r8 = new p000.ajw(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        r9 = m916d(r8);
        r1.f747S = r9;
        r8.f690a = r9;
        r9 = r8.readShort();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00fd, code lost:
        if (r9 == 20306) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0101, code lost:
        if (r9 == 21330) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0103, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0105, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0109, code lost:
        if (r9 != false) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x010c, code lost:
        r7 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x010f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0110, code lost:
        r2 = r0;
        r15 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0115, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0116, code lost:
        r2 = r0;
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0118, code lost:
        if (r15 != null) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x011a, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x011d, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x011f, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0120, code lost:
        if (r8 != null) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0122, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        r8 = new p000.ajw(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        r9 = m916d(r8);
        r1.f747S = r9;
        r8.f690a = r9;
        r9 = r8.readShort();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x013b, code lost:
        if (r9 == 85) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x013e, code lost:
        r7 = 10;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x014d A[Catch:{ all -> 0x02c9, IOException -> 0x0580, all -> 0x057a }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0155 A[Catch:{ all -> 0x02c9, IOException -> 0x0580, all -> 0x057a }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x015a A[Catch:{ all -> 0x02c9, IOException -> 0x0580, all -> 0x057a }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0160 A[Catch:{ all -> 0x02c9, IOException -> 0x0580, all -> 0x057a }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01ba A[SYNTHETIC, Splitter:B:142:0x01ba] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01bf A[Catch:{ all -> 0x02c9, IOException -> 0x0580, all -> 0x057a }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x01c4 A[Catch:{ all -> 0x02c9, IOException -> 0x0580, all -> 0x057a }] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x02cf A[Catch:{ all -> 0x02c9, IOException -> 0x0580, all -> 0x057a }] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x030b A[Catch:{ all -> 0x02c9, IOException -> 0x0580, all -> 0x057a }] */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0378 A[Catch:{ all -> 0x02c9, IOException -> 0x0580, all -> 0x057a }] */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x046a A[Catch:{ all -> 0x02c9, IOException -> 0x0580, all -> 0x057a }] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x046f A[Catch:{ all -> 0x02c9, IOException -> 0x0580, all -> 0x057a }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0481 A[Catch:{ all -> 0x02c9, IOException -> 0x0580, all -> 0x057a }] */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0573 A[Catch:{ all -> 0x02c9, IOException -> 0x0580, all -> 0x057a }] */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x0199 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e1 A[Catch:{ all -> 0x02c9, IOException -> 0x0580, all -> 0x057a }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x011a A[Catch:{ all -> 0x02c9, IOException -> 0x0580, all -> 0x057a }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0122 A[Catch:{ all -> 0x02c9, IOException -> 0x0580, all -> 0x057a }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x013d A[Catch:{ all -> 0x02c9, IOException -> 0x0580, all -> 0x057a }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x013e A[Catch:{ all -> 0x02c9, IOException -> 0x0580, all -> 0x057a }] */
    /* renamed from: a */
    private final void m904a(InputStream inputStream) {
        int i;
        ajx ajx;
        ajx ajx2;
        int i2;
        int i3;
        MediaMetadataRetriever mediaMetadataRetriever;
        String str;
        String str2;
        String str3;
        int i4 = 0;
        while (true) {
            try {
                int length = f721g.length;
                if (i4 >= 10) {
                    break;
                }
                this.f745Q[i4] = new HashMap();
                i4++;
            } catch (IOException e) {
            } catch (Throwable th) {
                Throwable th2 = th;
                m897a();
                throw th2;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        int i5 = 0;
        while (true) {
            if (i5 >= f717c.length) {
                i = 4;
                break;
            } else if (bArr[i5] != f717c[i5]) {
                break;
            } else {
                i5++;
            }
        }
        this.f744P = i;
        ajw ajw = new ajw(bufferedInputStream);
        switch (this.f744P) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
                m899a(ajw);
                HashMap hashMap = this.f745Q[4];
                ajx = (ajx) hashMap.get("Compression");
                if (ajx == null) {
                    int b = ajx.mo862b(this.f747S);
                    if (b != 1) {
                        if (b == 6) {
                            m902a(ajw, hashMap);
                        } else if (b != 7) {
                        }
                    }
                    ajx ajx3 = (ajx) hashMap.get("BitsPerSample");
                    if (ajx3 != null) {
                        int[] iArr = (int[]) ajx3.mo861a(this.f747S);
                        if (!Arrays.equals(f715a, iArr)) {
                            if (this.f744P == 3 && (ajx2 = (ajx) hashMap.get("PhotometricInterpretation")) != null) {
                                int b2 = ajx2.mo862b(this.f747S);
                                if (b2 == 1) {
                                    if (!Arrays.equals(iArr, f716b)) {
                                    }
                                } else if (b2 == 6) {
                                    if (!Arrays.equals(iArr, f715a)) {
                                    }
                                }
                            }
                        }
                        ajx ajx4 = (ajx) hashMap.get("StripOffsets");
                        ajx ajx5 = (ajx) hashMap.get("StripByteCounts");
                        if (ajx4 != null) {
                            if (ajx5 != null) {
                                long[] a = m909a(ajx4.mo861a(this.f747S));
                                long[] a2 = m909a(ajx5.mo861a(this.f747S));
                                if (a != null) {
                                    int length2 = a.length;
                                    if (length2 != 0) {
                                        if (a2 != null) {
                                            int length3 = a2.length;
                                            if (length3 != 0) {
                                                if (length2 != length3) {
                                                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                                                } else {
                                                    long j = 0;
                                                    for (long j2 : a2) {
                                                        j += j2;
                                                    }
                                                    byte[] bArr2 = new byte[((int) j)];
                                                    this.f748T = true;
                                                    int i6 = 0;
                                                    int i7 = 0;
                                                    int i8 = 0;
                                                    while (true) {
                                                        int length4 = a.length;
                                                        if (i6 < length4) {
                                                            int i9 = (int) a[i6];
                                                            int i10 = (int) a2[i6];
                                                            if (i6 < length4 - 1) {
                                                                if (((long) (i9 + i10)) != a[i6 + 1]) {
                                                                    this.f748T = false;
                                                                }
                                                            }
                                                            int i11 = i9 - i7;
                                                            ajw.mo842a((long) i11);
                                                            byte[] bArr3 = new byte[i10];
                                                            ajw.read(bArr3);
                                                            i7 = i7 + i11 + i10;
                                                            System.arraycopy(bArr3, 0, bArr2, i8, i10);
                                                            i8 += i10;
                                                            i6++;
                                                        } else if (this.f748T) {
                                                            long j3 = a[0];
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                                    }
                                }
                                Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                            }
                        }
                    }
                } else {
                    m902a(ajw, hashMap);
                }
                m897a();
                return;
            case 4:
                m901a(ajw, 0, 0);
                HashMap hashMap2 = this.f745Q[4];
                ajx = (ajx) hashMap2.get("Compression");
                if (ajx == null) {
                }
                m897a();
                return;
            case 7:
                m899a(ajw);
                ajx ajx6 = (ajx) this.f745Q[1].get("MakerNote");
                if (ajx6 != null) {
                    ajw ajw2 = new ajw(ajx6.f696c);
                    ajw2.f690a = this.f747S;
                    byte[] bArr4 = new byte[f727m.length];
                    ajw2.readFully(bArr4);
                    ajw2.mo842a(0);
                    byte[] bArr5 = new byte[f728n.length];
                    ajw2.readFully(bArr5);
                    if (Arrays.equals(bArr4, f727m)) {
                        ajw2.mo842a(8);
                    } else if (Arrays.equals(bArr5, f728n)) {
                        ajw2.mo842a(12);
                    }
                    m913b(ajw2, 6);
                    ajx ajx7 = (ajx) this.f745Q[7].get("PreviewImageStart");
                    ajx ajx8 = (ajx) this.f745Q[7].get("PreviewImageLength");
                    if (ajx7 != null) {
                        if (ajx8 != null) {
                            this.f745Q[5].put("JPEGInterchangeFormat", ajx7);
                            this.f745Q[5].put("JPEGInterchangeFormatLength", ajx8);
                        }
                    }
                    ajx ajx9 = (ajx) this.f745Q[8].get("AspectFrame");
                    if (ajx9 != null) {
                        int[] iArr2 = (int[]) ajx9.mo861a(this.f747S);
                        if (iArr2 != null) {
                            if (iArr2.length == 4) {
                                int i12 = iArr2[2];
                                int i13 = iArr2[0];
                                if (i12 > i13 && (i2 = iArr2[3]) > (i3 = iArr2[1])) {
                                    int i14 = (i12 - i13) + 1;
                                    int i15 = (i2 - i3) + 1;
                                    if (i14 < i15) {
                                        int i16 = i14 + i15;
                                        i15 = i16 - i15;
                                        i14 = i16 - i15;
                                    }
                                    ajx a3 = ajx.m889a(i14, this.f747S);
                                    ajx a4 = ajx.m889a(i15, this.f747S);
                                    this.f745Q[0].put("ImageWidth", a3);
                                    this.f745Q[0].put("ImageLength", a4);
                                }
                            }
                        }
                        Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr2));
                    }
                }
                HashMap hashMap22 = this.f745Q[4];
                ajx = (ajx) hashMap22.get("Compression");
                if (ajx == null) {
                }
                m897a();
                return;
            case 9:
                ajw.skipBytes(84);
                byte[] bArr6 = new byte[4];
                byte[] bArr7 = new byte[4];
                ajw.read(bArr6);
                ajw.skipBytes(4);
                ajw.read(bArr7);
                int i17 = ByteBuffer.wrap(bArr6).getInt();
                int i18 = ByteBuffer.wrap(bArr7).getInt();
                m901a(ajw, i17, 5);
                ajw.mo842a((long) i18);
                ajw.f690a = ByteOrder.BIG_ENDIAN;
                int readInt = ajw.readInt();
                int i19 = 0;
                while (true) {
                    if (i19 < readInt) {
                        int readUnsignedShort = ajw.readUnsignedShort();
                        int readUnsignedShort2 = ajw.readUnsignedShort();
                        if (readUnsignedShort == f704B.f697a) {
                            short readShort = ajw.readShort();
                            short readShort2 = ajw.readShort();
                            ajx a5 = ajx.m889a((int) readShort, this.f747S);
                            ajx a6 = ajx.m889a((int) readShort2, this.f747S);
                            this.f745Q[0].put("ImageLength", a5);
                            this.f745Q[0].put("ImageWidth", a6);
                        } else {
                            ajw.skipBytes(readUnsignedShort2);
                            i19++;
                        }
                    }
                }
                HashMap hashMap222 = this.f745Q[4];
                ajx = (ajx) hashMap222.get("Compression");
                if (ajx == null) {
                }
                m897a();
                return;
            case 10:
                m899a(ajw);
                if (((ajx) this.f745Q[0].get("JpgFromRaw")) != null) {
                    m901a(ajw, this.f753Y, 5);
                }
                ajx ajx10 = (ajx) this.f745Q[0].get("ISO");
                ajx ajx11 = (ajx) this.f745Q[1].get("PhotographicSensitivity");
                if (ajx10 != null && ajx11 == null) {
                    this.f745Q[1].put("PhotographicSensitivity", ajx10);
                }
                HashMap hashMap2222 = this.f745Q[4];
                ajx = (ajx) hashMap2222.get("Compression");
                if (ajx == null) {
                }
                m897a();
                return;
            case 12:
                mediaMetadataRetriever = new MediaMetadataRetriever();
                int i20 = Build.VERSION.SDK_INT;
                mediaMetadataRetriever.setDataSource(new ajv(ajw));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(extractMetadata3)) {
                    str3 = mediaMetadataRetriever.extractMetadata(29);
                    str2 = mediaMetadataRetriever.extractMetadata(30);
                    str = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str3 = mediaMetadataRetriever.extractMetadata(18);
                    str2 = mediaMetadataRetriever.extractMetadata(19);
                    str = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str3 = null;
                    str2 = null;
                    str = null;
                }
                if (str3 != null) {
                    this.f745Q[0].put("ImageWidth", ajx.m889a(Integer.parseInt(str3), this.f747S));
                }
                if (str2 != null) {
                    this.f745Q[0].put("ImageLength", ajx.m889a(Integer.parseInt(str2), this.f747S));
                }
                if (str != null) {
                    int parseInt = Integer.parseInt(str);
                    this.f745Q[0].put("Orientation", ajx.m889a(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f747S));
                }
                if (extractMetadata != null) {
                    if (extractMetadata2 != null) {
                        int parseInt2 = Integer.parseInt(extractMetadata);
                        int parseInt3 = Integer.parseInt(extractMetadata2);
                        if (parseInt3 > 6) {
                            ajw.mo842a((long) parseInt2);
                            byte[] bArr8 = new byte[6];
                            if (ajw.read(bArr8) == 6) {
                                int i21 = parseInt2 + 6;
                                int i22 = parseInt3 - 6;
                                if (Arrays.equals(bArr8, f723i)) {
                                    byte[] bArr9 = new byte[i22];
                                    if (ajw.read(bArr9) == i22) {
                                        this.f749U = i21;
                                        m905a(bArr9, 0);
                                    } else {
                                        throw new IOException("Can't read exif");
                                    }
                                } else {
                                    throw new IOException("Invalid identifier");
                                }
                            } else {
                                throw new IOException("Can't read identifier");
                            }
                        } else {
                            throw new IOException("Invalid exif length");
                        }
                    }
                }
                mediaMetadataRetriever.release();
                HashMap hashMap22222 = this.f745Q[4];
                ajx = (ajx) hashMap22222.get("Compression");
                if (ajx == null) {
                }
                m897a();
                return;
            case 13:
                m912b(ajw);
                HashMap hashMap222222 = this.f745Q[4];
                ajx = (ajx) hashMap222222.get("Compression");
                if (ajx == null) {
                }
                m897a();
                return;
            default:
                m914c(ajw);
                HashMap hashMap2222222 = this.f745Q[4];
                ajx = (ajx) hashMap2222222.get("Compression");
                if (ajx == null) {
                }
                m897a();
                return;
        }
    }

    /* renamed from: a */
    private final void m905a(byte[] bArr, int i) {
        ajw ajw = new ajw(bArr);
        m900a(ajw, bArr.length);
        m913b(ajw, i);
    }

    /* renamed from: a */
    private static boolean m906a(FileDescriptor fileDescriptor) {
        int i = Build.VERSION.SDK_INT;
        try {
            Os.lseek(fileDescriptor, 0, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /* renamed from: a */
    private final boolean m907a(HashMap hashMap) {
        ajx ajx = (ajx) hashMap.get("ImageLength");
        ajx ajx2 = (ajx) hashMap.get("ImageWidth");
        if (ajx == null || ajx2 == null) {
            return false;
        }
        int b = ajx.mo862b(this.f747S);
        int b2 = ajx2.mo862b(this.f747S);
        if (b > 512 || b2 > 512) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m908a(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static long[] m909a(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = (long) iArr[i];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    /* renamed from: a */
    public final int mo866a(String str, int i) {
        ajx b = m910b(str);
        if (b != null) {
            try {
                return b.mo862b(this.f747S);
            } catch (NumberFormatException e) {
            }
        }
        return i;
    }

    /* renamed from: a */
    public final String mo867a(String str) {
        double d;
        ajx b = m910b(str);
        if (b == null) {
            return null;
        }
        if (!f712J.contains(str)) {
            return b.mo863c(this.f747S);
        }
        if (str.equals("GPSTimeStamp")) {
            int i = b.f694a;
            if (i == 5 || i == 10) {
                ajz[] ajzArr = (ajz[]) b.mo861a(this.f747S);
                if (ajzArr != null && ajzArr.length == 3) {
                    ajz ajz = ajzArr[0];
                    ajz ajz2 = ajzArr[1];
                    ajz ajz3 = ajzArr[2];
                    return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) ajz.f701a) / ((float) ajz.f702b))), Integer.valueOf((int) (((float) ajz2.f701a) / ((float) ajz2.f702b))), Integer.valueOf((int) (((float) ajz3.f701a) / ((float) ajz3.f702b))));
                }
                Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(ajzArr));
                return null;
            }
            Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + b.f694a);
            return null;
        }
        try {
            Object a = b.mo861a(this.f747S);
            if (a != null) {
                if (a instanceof String) {
                    d = Double.parseDouble((String) a);
                } else if (a instanceof long[]) {
                    long[] jArr = (long[]) a;
                    if (jArr.length == 1) {
                        d = (double) jArr[0];
                    } else {
                        throw new NumberFormatException("There are more than one component");
                    }
                } else if (a instanceof int[]) {
                    int[] iArr = (int[]) a;
                    if (iArr.length == 1) {
                        d = (double) iArr[0];
                    } else {
                        throw new NumberFormatException("There are more than one component");
                    }
                } else if (a instanceof double[]) {
                    double[] dArr = (double[]) a;
                    if (dArr.length == 1) {
                        d = dArr[0];
                    } else {
                        throw new NumberFormatException("There are more than one component");
                    }
                } else if (a instanceof ajz[]) {
                    ajz[] ajzArr2 = (ajz[]) a;
                    if (ajzArr2.length == 1) {
                        ajz ajz4 = ajzArr2[0];
                        double d2 = (double) ajz4.f701a;
                        double d3 = (double) ajz4.f702b;
                        Double.isNaN(d2);
                        Double.isNaN(d3);
                        d = d2 / d3;
                    } else {
                        throw new NumberFormatException("There are more than one component");
                    }
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
                return Double.toString(d);
            }
            throw new NumberFormatException("NULL can't be converted to a double value");
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
