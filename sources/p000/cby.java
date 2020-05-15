package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: cby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cby {

    /* renamed from: a */
    public final cju f6436a = new cju(this.f6444i);

    /* renamed from: b */
    public final cpm f6437b = new cpm();

    /* renamed from: c */
    public final cpr f6438c = new cpr();

    /* renamed from: d */
    public final cpt f6439d = new cpt();

    /* renamed from: e */
    public final cdy f6440e = new cdy();

    /* renamed from: f */
    public final cok f6441f = new cok();

    /* renamed from: g */
    public final cpp f6442g = new cpp();

    /* renamed from: h */
    public final cpo f6443h = new cpo();

    /* renamed from: i */
    public final C1241og f6444i = crl.m7410a(new C1243oi(20), new crf(), new crg());

    /* renamed from: j */
    private final cpn f6445j = new cpn();

    public cby() {
        List asList = Arrays.asList("Gif", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.addAll(asList);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        this.f6438c.mo8091a(arrayList);
    }

    /* renamed from: a */
    public final List mo3661a() {
        List a = this.f6445j.mo8086a();
        if (!a.isEmpty()) {
            return a;
        }
        throw new cbu();
    }

    /* renamed from: a */
    public final List mo3662a(Object obj) {
        List b = this.f6436a.mo3951b(obj.getClass());
        if (!b.isEmpty()) {
            int size = b.size();
            List emptyList = Collections.emptyList();
            boolean z = true;
            for (int i = 0; i < size; i++) {
                cjq cjq = (cjq) b.get(i);
                if (cjq.mo3931a(obj)) {
                    if (z) {
                        emptyList = new ArrayList(size - i);
                    }
                    emptyList.add(cjq);
                    z = false;
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new cbv(obj, b);
        }
        throw new cbv(obj);
    }

    /* renamed from: a */
    public final void mo3663a(ccx ccx) {
        this.f6445j.mo8087a(ccx);
    }

    /* renamed from: a */
    public final void mo3664a(cdu cdu) {
        this.f6440e.mo3768a(cdu);
    }

    /* renamed from: a */
    public final void mo3665a(Class cls, ccv ccv) {
        this.f6437b.mo8085a(cls, ccv);
    }

    /* renamed from: a */
    public final void mo3666a(Class cls, cdn cdn) {
        this.f6439d.mo8094a(cls, cdn);
    }

    /* renamed from: a */
    public final void mo3667a(Class cls, Class cls2, cdm cdm) {
        mo3670a("legacy_append", cls, cls2, cdm);
    }

    /* renamed from: a */
    public final void mo3668a(Class cls, Class cls2, cjr cjr) {
        this.f6436a.mo3950a(cls, cls2, cjr);
    }

    /* renamed from: a */
    public final void mo3669a(Class cls, Class cls2, coi coi) {
        this.f6441f.mo4035a(cls, cls2, coi);
    }

    /* renamed from: a */
    public final void mo3670a(String str, Class cls, Class cls2, cdm cdm) {
        this.f6438c.mo8090a(str, cdm, cls, cls2);
    }
}
