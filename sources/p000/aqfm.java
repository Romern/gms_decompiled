package p000;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.felicanetworks.mfc.mfi.MfiClientException;
import java.io.File;

/* renamed from: aqfm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqfm {

    /* renamed from: a */
    static final byte[] f85973a;

    /* renamed from: b */
    private final Context f85974b;

    /* renamed from: c */
    private final aqfa f85975c;

    /* renamed from: d */
    private final aqfw f85976d = new aqfw(this.f85974b);

    static {
        byte[] bArr = new byte[MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE];
        // fill-array-data instruction
        bArr[0] = -1;
        bArr[1] = -40;
        bArr[2] = -1;
        bArr[3] = -32;
        bArr[4] = 0;
        bArr[5] = 16;
        bArr[6] = 74;
        bArr[7] = 70;
        bArr[8] = 73;
        bArr[9] = 70;
        bArr[10] = 0;
        bArr[11] = 1;
        bArr[12] = 1;
        bArr[13] = 1;
        bArr[14] = 0;
        bArr[15] = 0;
        bArr[16] = 0;
        bArr[17] = 0;
        bArr[18] = 0;
        bArr[19] = 0;
        bArr[20] = -1;
        bArr[21] = -37;
        bArr[22] = 0;
        bArr[23] = 67;
        bArr[24] = 0;
        bArr[25] = -1;
        bArr[26] = -1;
        bArr[27] = -1;
        bArr[28] = -1;
        bArr[29] = -1;
        bArr[30] = -1;
        bArr[31] = -1;
        bArr[32] = -1;
        bArr[33] = -1;
        bArr[34] = -1;
        bArr[35] = -1;
        bArr[36] = -1;
        bArr[37] = -1;
        bArr[38] = -1;
        bArr[39] = -1;
        bArr[40] = -1;
        bArr[41] = -1;
        bArr[42] = -1;
        bArr[43] = -1;
        bArr[44] = -1;
        bArr[45] = -1;
        bArr[46] = -1;
        bArr[47] = -1;
        bArr[48] = -1;
        bArr[49] = -1;
        bArr[50] = -1;
        bArr[51] = -1;
        bArr[52] = -1;
        bArr[53] = -1;
        bArr[54] = -1;
        bArr[55] = -1;
        bArr[56] = -1;
        bArr[57] = -1;
        bArr[58] = -1;
        bArr[59] = -1;
        bArr[60] = -1;
        bArr[61] = -1;
        bArr[62] = -1;
        bArr[63] = -1;
        bArr[64] = -1;
        bArr[65] = -1;
        bArr[66] = -1;
        bArr[67] = -1;
        bArr[68] = -1;
        bArr[69] = -1;
        bArr[70] = -1;
        bArr[71] = -1;
        bArr[72] = -1;
        bArr[73] = -1;
        bArr[74] = -1;
        bArr[75] = -1;
        bArr[76] = -1;
        bArr[77] = -1;
        bArr[78] = -1;
        bArr[79] = -1;
        bArr[80] = -1;
        bArr[81] = -1;
        bArr[82] = -1;
        bArr[83] = -1;
        bArr[84] = -1;
        bArr[85] = -1;
        bArr[86] = -1;
        bArr[87] = -1;
        bArr[88] = -1;
        bArr[89] = -1;
        bArr[90] = -64;
        bArr[91] = 0;
        bArr[92] = 11;
        bArr[93] = 8;
        bArr[94] = 0;
        bArr[95] = 1;
        bArr[96] = 0;
        bArr[97] = 1;
        bArr[98] = 1;
        bArr[99] = 1;
        bArr[100] = 17;
        bArr[101] = 0;
        bArr[102] = -1;
        bArr[103] = -60;
        bArr[104] = 0;
        bArr[105] = 20;
        bArr[106] = 0;
        bArr[107] = 1;
        bArr[108] = 0;
        bArr[109] = 0;
        bArr[110] = 0;
        bArr[111] = 0;
        bArr[112] = 0;
        bArr[113] = 0;
        bArr[114] = 0;
        bArr[115] = 0;
        bArr[116] = 0;
        bArr[117] = 0;
        bArr[118] = 0;
        bArr[119] = 0;
        bArr[120] = 0;
        bArr[121] = 0;
        bArr[122] = 0;
        bArr[123] = 3;
        bArr[124] = -1;
        bArr[125] = -60;
        bArr[126] = 0;
        bArr[127] = 20;
        bArr[128] = 16;
        bArr[129] = 1;
        bArr[130] = 0;
        bArr[131] = 0;
        bArr[132] = 0;
        bArr[133] = 0;
        bArr[134] = 0;
        bArr[135] = 0;
        bArr[136] = 0;
        bArr[137] = 0;
        bArr[138] = 0;
        bArr[139] = 0;
        bArr[140] = 0;
        bArr[141] = 0;
        bArr[142] = 0;
        bArr[143] = 0;
        bArr[144] = 0;
        bArr[145] = 0;
        bArr[146] = -1;
        bArr[147] = -38;
        bArr[148] = 0;
        bArr[149] = 8;
        bArr[150] = 1;
        bArr[151] = 1;
        bArr[152] = 0;
        bArr[153] = 0;
        bArr[154] = 63;
        bArr[155] = 0;
        bArr[156] = 71;
        bArr[157] = -1;
        bArr[158] = -39;
        f85973a = bArr;
    }

    public aqfm(Context context, aqfa aqfa) {
        this.f85974b = context;
        this.f85975c = aqfa;
    }

    /* renamed from: a */
    private static int m71500a(byte[] bArr) {
        if (bArr == null) {
            return f85973a.length;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = bArr.length;
            if (i >= Math.min(length, f85973a.length)) {
                return i2 + Math.abs(length - f85973a.length);
            }
            if (bArr[i] != f85973a[i]) {
                i2++;
            }
            i++;
        }
    }

    /* renamed from: a */
    static boolean m71501a(byte[] bArr, File file) {
        if (!aqfy.m71558a(bArr, file)) {
            return false;
        }
        if (m71500a(aqfy.m71564b(file)) == 0) {
            return true;
        }
        file.delete();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c1, code lost:
        if (r1 != false) goto L_0x00c3;
     */
    /* renamed from: a */
    public final aqfl mo47830a() {
        aqfk aqfk = new aqfk();
        boolean z = false;
        aqfk.mo47826a(false);
        aqfk.mo47829c(false);
        aqfk.mo47827b(0);
        aqfk.mo47824a(0);
        aqfk.mo47828b(false);
        aqfk.mo47825a(0L);
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            return aqfk.mo47823a();
        }
        File externalFilesDir = this.f85974b.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return aqfk.mo47823a();
        }
        if (!externalFilesDir.exists()) {
            externalFilesDir.mkdirs();
        }
        boolean z2 = this.f85976d.f86016a.getBoolean("snet_jpeg_written_to_sdcard", false);
        boolean z3 = this.f85976d.f86016a.getBoolean("snet_jpeg_previously_tampered", false);
        String a = this.f85975c.f85935b.mo47806a("sd_card_jpeg_name");
        if (TextUtils.isEmpty(a)) {
            a = "gmsnet2.jpg";
        }
        aqfk.f85966a = a;
        if (!a.equals(this.f85976d.f86016a.getString("snet_jpeg_filename", ""))) {
            this.f85976d.mo47853a(false);
            this.f85976d.mo47856b(false);
            z2 = false;
            z3 = false;
        }
        File file = new File(externalFilesDir, a);
        if (!file.exists()) {
            if (z2) {
                aqfk.mo47826a(true);
                if (!m71501a(f85973a, file)) {
                    this.f85976d.mo47853a(false);
                } else {
                    this.f85976d.mo47853a(true);
                    this.f85976d.mo47850a(a);
                }
            } else if (m71501a(f85973a, file)) {
                this.f85976d.mo47850a(a);
                this.f85976d.mo47853a(true);
            }
            this.f85976d.mo47856b(false);
        } else if (z2) {
            if (file.length() != ((long) f85973a.length)) {
                aqfk.mo47829c(true);
                aqfk.mo47827b(file.length());
            } else {
                int a2 = m71500a(aqfy.m71564b(file));
                aqfk.mo47824a(a2);
                if (a2 != 0) {
                    z = true;
                }
                aqfk.mo47829c(z);
            }
            aqfk.mo47825a((file.lastModified() / 86400) * 86400);
            if (!z3) {
                aqfk.mo47828b(true);
                this.f85976d.mo47856b(true);
            }
        }
        return aqfk.mo47823a();
    }
}
