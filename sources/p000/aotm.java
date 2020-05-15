package p000;

import com.google.android.gms.reminders.model.DateTime;
import com.google.android.gms.reminders.model.DateTimeEntity;
import com.google.android.gms.reminders.model.Time;
import com.google.android.gms.reminders.model.TimeEntity;

/* renamed from: aotm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aotm {

    /* renamed from: a */
    public Integer f83587a;

    /* renamed from: b */
    public Integer f83588b;

    /* renamed from: c */
    public Integer f83589c;

    /* renamed from: d */
    public Long f83590d;

    /* renamed from: e */
    public Boolean f83591e;

    /* renamed from: f */
    private Time f83592f;

    /* renamed from: g */
    private Integer f83593g;

    /* renamed from: h */
    private Integer f83594h;

    /* renamed from: i */
    private Boolean f83595i;

    public aotm() {
    }

    /* renamed from: a */
    public final DateTime mo46874a() {
        return new DateTimeEntity(this.f83587a, this.f83588b, this.f83589c, this.f83592f, this.f83593g, this.f83594h, this.f83590d, this.f83595i, this.f83591e, true);
    }

    public aotm(DateTime dateTime) {
        this.f83587a = dateTime.mo58630c();
        this.f83588b = dateTime.mo58631d();
        this.f83589c = dateTime.mo58633f();
        this.f83592f = dateTime.mo58634g() != null ? new TimeEntity(dateTime.mo58634g()) : null;
        this.f83593g = dateTime.mo58635h();
        this.f83594h = dateTime.mo58636i();
        this.f83590d = dateTime.mo58637j();
        this.f83595i = dateTime.mo58638k();
        this.f83591e = dateTime.mo58639l();
    }

    /* renamed from: a */
    public final void mo46875a(Time time) {
        this.f83592f = time != null ? (Time) time.mo7556bF() : null;
    }

    /* renamed from: a */
    public final void mo46876a(Integer num) {
        boolean z = true;
        if (!(num == null || num.intValue() == 1 || num.intValue() == 2 || num.intValue() == 3 || num.intValue() == 4)) {
            z = false;
        }
        sdo.m34975b(z, "Invalid constant for Period. Use value in ModelConstants");
        this.f83593g = num;
    }
}
