package p000;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: brsd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brsd {

    /* renamed from: a */
    public int f143290a;

    /* renamed from: b */
    private final Set f143291b = new HashSet();

    /* renamed from: c */
    private final Set f143292c = new HashSet();

    /* renamed from: d */
    private int f143293d;

    /* renamed from: e */
    private brsf f143294e;

    /* renamed from: f */
    private Set f143295f;

    @SafeVarargs
    public brsd(Class cls, Class... clsArr) {
        this.f143293d = 0;
        this.f143290a = 0;
        this.f143295f = new HashSet();
        brsh.m114532a(cls, "Null interface");
        this.f143291b.add(cls);
        for (Class cls2 : clsArr) {
            brsh.m114532a(cls2, "Null interface");
        }
        Collections.addAll(this.f143291b, clsArr);
    }

    /* renamed from: a */
    public final brse mo69826a() {
        boolean z;
        if (this.f143294e != null) {
            z = true;
        } else {
            z = false;
        }
        brsh.m114533a(z, "Missing required property: factory.");
        return new brse(new HashSet(this.f143291b), new HashSet(this.f143292c), this.f143293d, this.f143290a, this.f143295f);
    }

    /* renamed from: b */
    public final void mo69830b() {
        mo69827a(1);
    }

    /* renamed from: a */
    public final void mo69827a(int i) {
        brsh.m114533a(this.f143293d == 0, "Instantiation type has already been set.");
        this.f143293d = i;
    }

    /* renamed from: a */
    public final void mo69828a(brsf brsf) {
        brsh.m114532a(brsf, "Null factory");
        this.f143294e = brsf;
    }

    /* renamed from: a */
    public final void mo69829a(brsg brsg) {
        brsh.m114532a(brsg, "Null dependency");
        if (!this.f143291b.contains(brsg.f143300a)) {
            this.f143292c.add(brsg);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }
}
