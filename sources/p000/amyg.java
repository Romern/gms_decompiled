package p000;

import android.util.Log;
import java.util.Locale;
import org.json.JSONException;

/* renamed from: amyg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amyg {
    /* renamed from: a */
    public static ammz m63718a(boolean z, amjf amjf, ammz ammz, Exception exc, anaz anaz, int i) {
        ammz ammz2;
        String str;
        amjf amjf2 = amjf;
        ammz ammz3 = ammz;
        Exception exc2 = exc;
        anaz anaz2 = anaz;
        Log.e("FSA2_GrpcExceptionHandler", String.format(Locale.US, "Exception when doing operation %s to dataType %s", Integer.valueOf(ammz3.f75412e), Integer.valueOf(amjf2.f74994h)), exc2);
        ammz ammz4 = ammz.UNSPECIFIED;
        if (exc2 instanceof JSONException) {
            ((anbh) anaz2).f76541a.stats.numParseExceptions++;
            str = "JSON_EXCEPTION";
            ammz2 = ammz4;
        } else if (exc2 instanceof ArrayStoreException) {
            ((anbh) anaz2).f76541a.stats.numParseExceptions++;
            str = "ARRAY_STORE_EXCEPTION";
            ammz2 = ammz4;
        } else if (exc2 instanceof amxy) {
            ((anbh) anaz2).f76541a.stats.numIoExceptions++;
            str = "PEOPLE_SYNC_GRPC_EXCEPTION";
            ammz2 = ammz4;
        } else if (exc2 instanceof gid) {
            ((anbh) anaz2).f76541a.stats.numAuthExceptions++;
            str = "GOOGLE_AUTH_EXCEPTION";
            ammz2 = ammz4;
        } else if (exc2 instanceof chuw) {
            chuw chuw = (chuw) exc2;
            String name = chuw.f189236a.f189233s.name();
            chus chus = chus.OK;
            int ordinal = chuw.f189236a.f189233s.ordinal();
            if (ordinal == 3) {
                amig.m62939a();
                if (((Boolean) amfr.f74868a.mo41191a()).booleanValue()) {
                    ((anbh) anaz2).f76541a.stats.numParseExceptions++;
                } else {
                    ((anbh) anaz2).f76541a.stats.numIoExceptions++;
                }
            } else if (ordinal == 9 || ordinal == 12 || ordinal == 15) {
                ((anbh) anaz2).f76541a.stats.numParseExceptions++;
            } else if (ordinal == 5) {
                ammz4 = ammz.UNSPECIFIED;
                int ordinal2 = ammz.ordinal();
                if (ordinal2 != 2) {
                    if (ordinal2 != 3) {
                        ((anbh) anaz2).f76541a.stats.numParseExceptions++;
                    } else {
                        anaz.mo41636a(ammz, amjf, z, 3, i);
                        ammz4 = ammz.REMOVE;
                    }
                } else if (!z) {
                    if (amjf2 == amjf.PHOTO) {
                        ((anbh) anaz2).f76541a.stats.numParseExceptions++;
                    } else {
                        ammz4 = ammz.REMOVE;
                    }
                } else if (amjf2 == amjf.PHOTO && ammz3 == ammz.UPDATE) {
                    if (chuw.getMessage().contains("Contact not found")) {
                        ((anbh) anaz2).f76541a.stats.numParseExceptions++;
                    } else {
                        ((anbh) anaz2).f76541a.stats.numIoExceptions++;
                    }
                }
            } else if (ordinal != 6) {
                ((anbh) anaz2).f76541a.stats.numIoExceptions++;
            } else {
                ((anbh) anaz2).f76541a.stats.numParseExceptions++;
            }
            str = name;
            ammz2 = ammz4;
        } else if (exc2 instanceof amxw) {
            str = String.valueOf(((amxw) exc2).f76364a);
            ((anbh) anaz2).f76541a.stats.numIoExceptions++;
            ammz2 = ammz4;
        } else {
            ((anbh) anaz2).f76541a.stats.numIoExceptions++;
            str = "UNKNOWN_EXCEPTION";
            ammz2 = ammz4;
        }
        if (ammz2 == ammz.UNSPECIFIED) {
            anaz2.mo41632a(amjf, ammz, str, exc2);
            anaz.mo41636a(ammz, amjf, z, 2, i);
        }
        return ammz2;
    }
}
