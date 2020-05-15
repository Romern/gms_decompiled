package p000;

import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: beqp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class beqp {

    /* renamed from: d */
    private static final Map f112058d;

    /* renamed from: a */
    public final long f112059a;

    /* renamed from: b */
    protected final beur f112060b;

    /* renamed from: c */
    protected boolean f112061c = true;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
     arg types: [beur, int]
     candidates:
      MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object */
    static {
        EnumMap enumMap = new EnumMap(beur.class);
        f112058d = enumMap;
        enumMap.put((Object) beur.IN_VEHICLE, (Object) 0);
        f112058d.put(beur.IN_ROAD_VEHICLE, 16);
        f112058d.put(beur.IN_RAIL_VEHICLE, 17);
        f112058d.put(beur.IN_CAR, 0);
        f112058d.put(beur.ON_BICYCLE, 1);
        f112058d.put(beur.ON_FOOT, 2);
        f112058d.put(beur.WALKING, 7);
        f112058d.put(beur.RUNNING, 8);
        f112058d.put(beur.STILL, 3);
        f112058d.put(beur.UNKNOWN, 4);
        f112058d.put(beur.TILTING, 5);
        f112058d.put(beur.INCONSISTENT, 4);
        f112058d.put(beur.OFF_BODY, 9);
        f112058d.put(beur.SLEEP, 15);
        f112058d.put(beur.IN_TWO_WHEELER_VEHICLE, 18);
        f112058d.put(beur.IN_FOUR_WHEELER_VEHICLE, 19);
        f112058d.put(beur.IN_CAR, 20);
        f112058d.put(beur.IN_BUS, 21);
    }

    public beqp(long j) {
        this.f112059a = j;
        String l = cese.m138163l();
        beur beur = null;
        if (l != null && l.length() > 0) {
            try {
                beur = beur.m95920a(l);
            } catch (IllegalArgumentException e) {
            }
        }
        this.f112060b = beur;
    }

    /* renamed from: a */
    public static int m95443a(bfku bfku, int i, long j) {
        long a = bfku.mo61857a(i) - j;
        while (i >= 0) {
            if (bfku.mo61857a(i) <= a) {
                return i;
            }
            i--;
        }
        double d = (double) j;
        Double.isNaN(d);
        return ((double) (bfku.mo61857a(0) - a)) > d * 0.1d ? -1 : 0;
    }

    /* renamed from: a */
    public abstract bfnq mo60938a(long j, long j2, bfku bfku);

    /* renamed from: a */
    public void mo60939a() {
        this.f112061c = true;
    }

    /* renamed from: a */
    public static List m95444a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            beus beus = (beus) it.next();
            arrayList.add(new DetectedActivity(((Integer) f112058d.get(beus.f112544a)).intValue(), beus.f112545b));
        }
        return arrayList;
    }
}
