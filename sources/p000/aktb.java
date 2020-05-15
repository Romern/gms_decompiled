package p000;

import android.util.Pair;
import com.google.android.gms.ocr.credit.base.ExpDateResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: aktb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aktb extends akuu {

    /* renamed from: a */
    private final Pattern f72703a = Pattern.compile("[\\dQOo]{2}/[\\dQOo]{2}");

    /* renamed from: b */
    private final akta f72704b;

    /* renamed from: c */
    private final aksc f72705c;

    public aktb(akta akta, aksc aksc) {
        this.f72704b = akta;
        this.f72705c = aksc;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo39833a() {
        this.f72705c.mo39779i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo39834a(long j) {
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Pair mo39835b(Object obj) {
        boolean z;
        akst akst;
        aksy aksy = (aksy) obj;
        List f = aksy.mo39891f();
        ArrayList arrayList = new ArrayList();
        Iterator it = f.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            Matcher matcher = this.f72703a.matcher(((String) it.next()).replaceAll("\\s+", ""));
            while (matcher.find()) {
                String replaceAll = matcher.group().replaceAll("[QOo]", "0");
                int parseInt = Integer.parseInt(replaceAll.substring(0, 2));
                int parseInt2 = Integer.parseInt(replaceAll.substring(3));
                if (this.f72704b.mo39831a(parseInt2, parseInt)) {
                    arrayList.add(new akst(parseInt, parseInt2, 1));
                }
            }
        }
        ExpDateResult expDateResult = null;
        if (!arrayList.isEmpty()) {
            akst = (akst) Collections.max(arrayList);
        } else {
            akst = null;
        }
        if (akst != null) {
            expDateResult = new ExpDateResult(akst.toString(), 1, 1.0d, null, null, akst);
        }
        aksy.mo39828b(expDateResult);
        if (akst == null) {
            z = false;
        }
        return new Pair(Boolean.valueOf(z), aksy);
    }
}
