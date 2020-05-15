package p000;

import java.util.Calendar;
import java.util.Date;

/* renamed from: bnun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnun extends bnuo {

    /* renamed from: c */
    private final bnum f132200c;

    public bnun(bnss bnss, int i, bnum bnum) {
        super(bnss, i);
        this.f132200c = bnum;
        StringBuilder sb = new StringBuilder("%");
        bnss.mo68463a(sb);
        sb.append(!bnss.mo68466b() ? 't' : 'T');
        sb.append(bnum.f132199G);
        sb.toString();
    }

    /* renamed from: a */
    public final void mo68499a(bnup bnup, Object obj) {
        bnum bnum = this.f132200c;
        bnss bnss = this.f132202b;
        if ((obj instanceof Date) || (obj instanceof Calendar) || (obj instanceof Long)) {
            StringBuilder sb = new StringBuilder("%");
            bnss.mo68463a(sb);
            sb.append(!bnss.mo68466b() ? 't' : 'T');
            sb.append(bnum.f132199G);
            ((bnti) bnup).f132126d.append(String.format(bnti.f132123a, sb.toString(), obj));
            return;
        }
        StringBuilder sb2 = ((bnti) bnup).f132126d;
        char c = bnum.f132199G;
        StringBuilder sb3 = new StringBuilder(3);
        sb3.append("%t");
        sb3.append(c);
        bnti.m110389a(sb2, obj, sb3.toString());
    }
}
