package p000;

import android.location.Location;
import android.os.Build;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.awareness.snapshot.internal.HeadphoneStateImpl;
import com.google.android.gms.awareness.snapshot.internal.TimeIntervalsImpl;
import com.google.android.gms.awareness.snapshot.internal.WeatherImpl;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;

/* renamed from: edc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class edc {
    /* renamed from: a */
    private static ActivityRecognitionResult m10159a(ContextData contextData) {
        bxkl bxkl = (bxkl) contextData.mo18009a(bxkl.f163760c);
        if (bxkl == null) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("edc", "a", 186, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[ContextDataParser] Unable to get DetectedActivity proto.");
            return null;
        } else if (bxkl.f163762a.size() <= 0) {
            return null;
        } else {
            sqv i = dwq.m9665i();
            bxkj[] bxkjArr = (bxkj[]) bxkl.f163762a.toArray(new bxkj[0]);
            ArrayList arrayList = new ArrayList();
            for (bxkj bxkj : bxkjArr) {
                bxki a = bxki.m122801a(bxkj.f163757b);
                if (a == null) {
                    a = bxki.IN_VEHICLE;
                }
                arrayList.add(new DetectedActivity(a.f163753x, bxkj.f163758c));
            }
            return new ActivityRecognitionResult(arrayList, i.mo20505a(), i.mo20506b());
        }
    }

    /* renamed from: b */
    private static HeadphoneStateImpl m10160b(ContextData contextData) {
        int a;
        bxft bxft = (bxft) contextData.mo18009a(bxft.f163185i);
        if (!(bxft == null || (a = bxfm.m122661a(bxft.f163188b)) == 0)) {
            int i = 1;
            if (a != 1) {
                int a2 = bxfm.m122661a(bxft.f163188b);
                if (a2 != 0) {
                    i = a2;
                }
                return new HeadphoneStateImpl(i - 1);
            }
        }
        bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
        bnsl.mo68432a("edc", "b", (int) BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("[ContextDataParser] Audio Proto: %s", bxft);
        return null;
    }

    /* renamed from: c */
    private static Location m10161c(ContextData contextData) {
        bxnm bxnm = (bxnm) contextData.mo18009a(bxnm.f164051j);
        if (bxnm == null) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("edc", "c", (int) BaseMfiEventCallback.TYPE_OPSRV_ACCOUNT_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[ContextDataParser] Unable to get UserLocation proto.");
            return null;
        }
        tka j = contextData.mo18022j();
        Location location = new Location("Snapshot");
        location.setAccuracy(bxnm.f164059g);
        location.setAltitude(bxnm.f164058f);
        location.setLatitude(ayuo.m84847b(bxnm.f164054b));
        location.setLongitude(ayuo.m84847b(bxnm.f164055c));
        location.setSpeed(bxnm.f164056d);
        if (j != null) {
            location.setTime(j.mo18096c());
            int i = Build.VERSION.SDK_INT;
            sqv i2 = dwq.m9665i();
            location.setElapsedRealtimeNanos((i2.mo20506b() + (j.mo18096c() - i2.mo20505a())) * 1000000);
        }
        return location;
    }

    /* renamed from: d */
    private static WeatherImpl m10162d(ContextData contextData) {
        int[] iArr;
        bxnp bxnp = (bxnp) contextData.mo18009a(bxnp.f164074d);
        if (bxnp == null || (bxnp.f164076a & 1) == 0) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("edc", "d", 226, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[ContextDataParser] Weather proto or current conditions is null");
            return null;
        }
        bxno bxno = bxnp.f164077b;
        if (bxno == null) {
            bxno = bxno.f164069c;
        }
        bxnt bxnt = bxno.f164072b;
        if (bxnt == null) {
            bxnt = bxnt.f164083f;
        }
        bxno bxno2 = bxnp.f164077b;
        if (bxno2 == null) {
            bxno2 = bxno.f164069c;
        }
        if ((bxno2.f164071a & 1) != 0) {
            if (bxnt.f164089e.size() != 0) {
                int size = bxnt.f164089e.size();
                int[] iArr2 = new int[size];
                for (int i = 0; i < size; i++) {
                    int a = bxnr.m122904a(((bxns) bxnt.f164089e.get(i)).f164081a);
                    if (a == 0) {
                        a = 1;
                    }
                    iArr2[i] = a - 1;
                }
                iArr = iArr2;
            } else {
                iArr = new int[]{0};
            }
            return new WeatherImpl(bxnt.f164085a, bxnt.f164086b, bxnt.f164087c, bxnt.f164088d, iArr);
        }
        bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
        bnsl2.mo68432a("edc", "d", 231, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68405a("[ContextDataParser] current state is null");
        return null;
    }

    /* renamed from: e */
    private static TimeIntervalsImpl m10163e(ContextData contextData) {
        int[] iArr;
        bxkg bxkg = (bxkg) contextData.mo18009a(bxkg.f163725d);
        if (bxkg == null) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("edc", "e", 255, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[ContextDataParser] TimeIntervals proto is null");
            return null;
        }
        if (bxkg.f163727a.size() != 0) {
            int size = bxkg.f163727a.size();
            iArr = new int[size];
            for (int i = 0; i < size; i++) {
                iArr[i] = ((bxkf) bxkg.f163723b.mo14948a(Integer.valueOf(bxkg.f163727a.mo74151b(i)))).f163722i;
            }
        } else {
            iArr = new int[0];
        }
        return new TimeIntervalsImpl(iArr);
    }
}
