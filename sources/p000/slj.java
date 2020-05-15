package p000;

import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Arrays;
import java.util.List;

/* renamed from: slj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class slj implements srl {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo21850a(Object obj) {
        int i;
        String str = (String) obj;
        String[] split = str.trim().split("\t");
        if (split.length < 11) {
            String valueOf = String.valueOf(str);
            Log.w("StatsUploader", valueOf.length() == 0 ? new String("Invalid data: ") : "Invalid data: ".concat(valueOf));
            return null;
        }
        bxvd da = bpty.f139200m.mo74144da();
        try {
            long parseLong = Long.parseLong(split[0]);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpty bpty = (bpty) da.f164949b;
            bpty.f139202a |= 1;
            bpty.f139203b = parseLong;
            int parseInt = Integer.parseInt(split[1]);
            PackageManager packageManager = slo.f44685a;
            if (parseInt == 0) {
                i = 5;
            } else if (parseInt == 1) {
                i = 4;
            } else if (parseInt == 2) {
                i = 3;
            } else if (parseInt == 3) {
                i = 2;
            } else {
                StringBuilder sb = new StringBuilder(35);
                sb.append("Wrong alarm event type: ");
                sb.append(parseInt);
                Log.e("StatsUploader", sb.toString());
                throw new IllegalArgumentException("Wrong alarm event type");
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpty bpty2 = (bpty) da.f164949b;
            bpty2.f139204c = i - 1;
            int i2 = bpty2.f139202a | 2;
            bpty2.f139202a = i2;
            String str2 = split[2];
            str2.getClass();
            bpty2.f139202a = i2 | 4;
            bpty2.f139205d = str2;
            long parseLong2 = Long.parseLong(split[3]);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpty bpty3 = (bpty) da.f164949b;
            bpty3.f139202a |= 8;
            bpty3.f139206e = parseLong2;
            long parseLong3 = Long.parseLong(split[4]);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpty bpty4 = (bpty) da.f164949b;
            bpty4.f139202a |= 16;
            bpty4.f139207f = parseLong3;
            long parseLong4 = Long.parseLong(split[5]);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpty bpty5 = (bpty) da.f164949b;
            bpty5.f139202a |= 32;
            bpty5.f139208g = parseLong4;
            int parseInt2 = Integer.parseInt(split[6]);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpty bpty6 = (bpty) da.f164949b;
            bpty6.f139202a |= 64;
            bpty6.f139210i = parseInt2;
            if (!TextUtils.isEmpty(split[7])) {
                List asList = Arrays.asList(TextUtils.split(split[7], ","));
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpty bpty7 = (bpty) da.f164949b;
                if (!bpty7.f139209h.mo73666a()) {
                    bpty7.f139209h = GeneratedMessageLite.m124021a(bpty7.f139209h);
                }
                bxsy.m123078a(asList, bpty7.f139209h);
            }
            long parseLong5 = Long.parseLong(split[8]);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpty bpty8 = (bpty) da.f164949b;
            bpty8.f139202a |= 128;
            bpty8.f139211j = parseLong5;
            if (!TextUtils.isEmpty(split[9])) {
                String str3 = split[9];
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpty bpty9 = (bpty) da.f164949b;
                str3.getClass();
                bpty9.f139202a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                bpty9.f139212k = str3;
            }
            float parseFloat = Float.parseFloat(split[10]);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpty bpty10 = (bpty) da.f164949b;
            bpty10.f139202a |= 512;
            bpty10.f139213l = parseFloat;
            return (bpty) da.mo74062i();
        } catch (IllegalArgumentException | NumberFormatException e) {
            return null;
        }
    }
}
