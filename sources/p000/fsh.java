package p000;

import android.os.Build;
import android.os.Process;
import android.os.UserHandle;
import android.util.SparseArray;
import com.google.android.gms.appdatasearch.DocumentResults;
import com.google.android.gms.appdatasearch.PhraseAffinityResponse;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.android.gms.appdatasearch.SectionPayload;

/* renamed from: fsh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fsh {
    /* renamed from: a */
    public static String m12244a(int i) {
        switch (i - 2) {
            case 2:
                return "PARSE_ERROR";
            case 3:
                return "TOO_LONG";
            case 4:
                return "PARENS_NESTED_TOO_DEEP";
            case 5:
                return "DATE_PARSE_ERROR";
            case 6:
                return "DATE_RANGE_TOO_LARGE";
            case 7:
                return "OVERLAP_L_PARSE_ERROR";
            case 8:
                return "Q_PARSE_ERROR";
            case 9:
                return "BINARY_LOGIC_PARSE_ERROR";
            case 10:
                return "TAG_PARSE_ERROR";
            case 11:
                return "IN_L_PARSE_ERROR";
            case 12:
                return "ST_SORT_PARSE_ERROR";
            case 13:
                return "INIT_FAILED_ERROR";
            case 14:
                return "UNIMPLEMENTED_ERROR";
            case 15:
                return "AUTHORIZATION_ERROR";
            case 16:
                return "NO_MATCHING_CORPORA_ERROR";
            case 17:
                return "IS_PARSE_SECTION_RESTRICT_WITHOUT_STRING";
            case 18:
                return "IS_PARSE_SECTION_RESTRICT_NEGATION_NOT_SUPPORTED";
            default:
                return "UNDEFINED";
        }
    }

    /* renamed from: b */
    public static SearchResults m12246b(String str) {
        return new SearchResults(str);
    }

    /* renamed from: c */
    public static PhraseAffinityResponse m12247c(String str) {
        return new PhraseAffinityResponse(str, null, null);
    }

    /* renamed from: a */
    public static UserHandle m12242a() {
        int i = Build.VERSION.SDK_INT;
        return Process.myUserHandle();
    }

    /* renamed from: a */
    public static DocumentResults m12243a(String str) {
        return new DocumentResults(str, null, null, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        if (r2.size() > 0) goto L_0x0038;
     */
    /* renamed from: a */
    public static byte[] m12245a(abue abue) {
        SparseArray sparseArray;
        bxvt bxvt = abue.f58376c;
        ByteString bxtx = abue.f58377d;
        if (bxvt != null) {
            sparseArray = new SparseArray();
            int i = 0;
            for (int i2 = 0; i2 < bxvt.size(); i2++) {
                int intValue = ((Integer) bxvt.get(i2)).intValue();
                if (intValue > 0) {
                    int i3 = intValue + i;
                    sparseArray.append(i2, bxtx.mo73754a(i, i3).getKey());
                    i = i3;
                }
            }
        }
        sparseArray = null;
        SectionPayload sectionPayload = new SectionPayload(sparseArray);
        SparseArray sparseArray2 = sectionPayload.f9686a;
        if (sparseArray2 == null || sparseArray2.size() == 0) {
            return null;
        }
        return sef.m35074a(sectionPayload);
    }
}
