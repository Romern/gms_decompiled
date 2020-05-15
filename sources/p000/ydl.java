package p000;

import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: ydl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ydl {
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static Scope m43848a(Scope scope) {
        char c;
        String str = scope.f30106b;
        switch (str.hashCode()) {
            case -2072888167:
                if (str.equals("https://www.googleapis.com/auth/fitness.body.read")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1522546930:
                if (str.equals("https://www.googleapis.com/auth/fitness.reproductive_health.read")) {
                    c = 9;
                    break;
                }
                c = 65535;
                break;
            case -1513009263:
                if (str.equals("https://www.googleapis.com/auth/fitness.blood_pressure.read")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -687102788:
                if (str.equals("https://www.googleapis.com/auth/fitness.oxygen_saturation.read")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -611416542:
                if (str.equals("https://www.googleapis.com/auth/fitness.heart_rate.read")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 787265254:
                if (str.equals("https://www.googleapis.com/auth/fitness.location.read")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 951364342:
                if (str.equals("https://www.googleapis.com/auth/fitness.sleep.read")) {
                    c = 10;
                    break;
                }
                c = 65535;
                break;
            case 1101936996:
                if (str.equals("https://www.googleapis.com/auth/fitness.blood_glucose.read")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1547725772:
                if (str.equals("https://www.googleapis.com/auth/fitness.activity.read")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1891830404:
                if (str.equals("https://www.googleapis.com/auth/fitness.body_temperature.read")) {
                    c = 8;
                    break;
                }
                c = 65535;
                break;
            case 2119807573:
                if (str.equals("https://www.googleapis.com/auth/fitness.nutrition.read")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return new Scope("https://www.googleapis.com/auth/fitness.activity.write");
            case 1:
                return new Scope("https://www.googleapis.com/auth/fitness.location.write");
            case 2:
                return new Scope("https://www.googleapis.com/auth/fitness.body.write");
            case 3:
                return new Scope("https://www.googleapis.com/auth/fitness.nutrition.write");
            case 4:
                return new Scope("https://www.googleapis.com/auth/fitness.heart_rate.write");
            case 5:
                return new Scope("https://www.googleapis.com/auth/fitness.blood_pressure.write");
            case 6:
                return new Scope("https://www.googleapis.com/auth/fitness.blood_glucose.write");
            case 7:
                return new Scope("https://www.googleapis.com/auth/fitness.oxygen_saturation.write");
            case 8:
                return new Scope("https://www.googleapis.com/auth/fitness.body_temperature.write");
            case 9:
                return new Scope("https://www.googleapis.com/auth/fitness.reproductive_health.write");
            case 10:
                return new Scope("https://www.googleapis.com/auth/fitness.sleep.write");
            default:
                return scope;
        }
    }

    /* renamed from: a */
    public static Set m43849a(Collection collection) {
        HashSet hashSet = new HashSet(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Scope scope = (Scope) it.next();
            Scope a = m43848a(scope);
            if (a.equals(scope) || !collection.contains(a)) {
                hashSet.add(scope);
            }
        }
        return hashSet;
    }
}
