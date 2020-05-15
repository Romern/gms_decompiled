package p000;

import com.google.android.gms.cast.CastDevice;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: pnt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class pnt {

    /* renamed from: a */
    public final CastDevice f39878a;

    /* renamed from: b */
    public final String f39879b;

    /* renamed from: c */
    public final Set f39880c = new HashSet();

    /* renamed from: d */
    public final Set f39881d = new HashSet();

    /* renamed from: e */
    public final List f39882e = new ArrayList();

    /* renamed from: f */
    public final Set f39883f;

    /* renamed from: g */
    public int f39884g;

    /* renamed from: h */
    public double f39885h;

    /* renamed from: i */
    public int f39886i;

    public pnt(CastDevice castDevice, Set set, Set set2, List list, String str, int i, int i2, double d, Set set3) {
        this.f39878a = castDevice;
        if (set != null) {
            this.f39880c.addAll(set);
        }
        if (set2 != null) {
            this.f39881d.addAll(set2);
        }
        this.f39882e.addAll(list);
        this.f39884g = i2;
        this.f39885h = d;
        this.f39886i = i;
        this.f39879b = str;
        this.f39883f = set3;
    }

    /* renamed from: a */
    public final boolean mo23510a() {
        return this.f39884g != 0;
    }
}
